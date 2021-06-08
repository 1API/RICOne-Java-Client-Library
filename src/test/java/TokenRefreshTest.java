import riconeapi.authentication.Authenticator;
import riconeapi.authentication.Endpoint;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.library.client.request.ServicePath;
import riconeapi.library.client.request.XPress;
import riconeapi.library.client.request.XRequest;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version x.x.x
 * @since 3/31/2021
 */
public class TokenRefreshTest {
    private static int count = 0;
    private static final Logger logger = Logger.getLogger(TokenRefreshTest.class.getName());

    public static void main(String[] args) throws AuthenticationException, InterruptedException {

        Authenticator auth = Authenticator.getInstance();
        auth.authenticate(System.getenv("auth_url"), System.getenv("client_id"), System.getenv("client_secret"));

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        Runnable task1 = () -> {
            count++;
            LocalDateTime ldt = LocalDateTime.now();
            String currentTime = ldt.toString();

            try {
                makeXpressCalls(count, currentTime, auth);
            }
            catch(AuthenticationException e) {
                e.printStackTrace();
            }
        };

        // repeat the task every 7 minutes
        ScheduledFuture<?> scheduledFuture = ses.scheduleAtFixedRate(task1, 0, 7, TimeUnit.MINUTES);

        while(true) {
            Thread.sleep(1000);
            if(count == 30) {
                System.out.println("Count met, end test!");
                scheduledFuture.cancel(true);
                ses.shutdown();
                break;
            }
        }
    }

    private static void makeXpressCalls(int count, String currentTime, Authenticator auth) throws AuthenticationException {
        String providerId = "localhost";
        Optional<Endpoint> e = auth.getEndpoints(providerId);
        if(e.isPresent()) {
            XPress xPress = new XPress(e.get());
            int statusCode = xPress.getXRosters(XRequest.builder().servicePath(ServicePath.GET_XROSTERS).build()).getResponseStatusCode().value();
            String token = e.get().getToken();
            String dToken = e.get().getDecodedToken().getToken();
            String message = "Run=" + count +
                ", CurrentTime=" + currentTime +
                ", IssuedTime=" + getIssued(e.get()) +
                ", ExpiryTime=" + getExpiry(e.get()) +
                ", StatusCode=" + statusCode +
                ", Expired=" + willTokenExpire(e.get()) +
                ", Endpoint=" + token.substring(token.lastIndexOf(".") + 1) +
                ", DecodedToken=" + dToken.substring(dToken.lastIndexOf(".") + 1);
            logger.info(message);
        }

    }

    private static String getIssued(Endpoint dt) {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(dt.getDecodedToken().getIat()), ZoneId.systemDefault()).toString();
    }
    private static String getExpiry(Endpoint dt) {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(dt.getDecodedToken().getExp()), ZoneId.systemDefault()).toString();
    }

    private static Boolean willTokenExpire(Endpoint endpoint) {
        try {
            LocalDateTime expiry = LocalDateTime.ofInstant(Instant.ofEpochSecond(endpoint.getDecodedToken().getExp()), ZoneId.systemDefault()).minusMinutes(10L);
            return LocalDateTime.now().isAfter(expiry);
        } catch (Exception var1) {
            var1.printStackTrace();
            return true;
        }
    }
}
