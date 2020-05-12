package cases;

import com.fasterxml.jackson.core.JsonProcessingException;
import riconeapi.authentication.Authenticator;
import riconeapi.common.XPress;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.authentication.Endpoint;
import riconeapi.models.xpress.XLeaType;

import java.util.Optional;

public class SchoolYear {
    final static String authUrl = AuthServiceProperties.getInstance().getProperty("auth.url");
    final static String clientId = AuthServiceProperties.getInstance().getProperty("auth.clientId");
    final static String clientSecret = AuthServiceProperties.getInstance().getProperty("auth.clientSecret");
    final static String providerId = AuthServiceProperties.getInstance().getProperty("auth.providerId");

    final static int schoolYear = 2018;

    public static void main(String[] args) throws AuthenticationException, JsonProcessingException {
        Authenticator auth = Authenticator.getInstance();
        auth.authenticate(authUrl, clientId, clientSecret);

        Optional<Endpoint> e = auth.getEndpoints(providerId);
        XPress xPress = new XPress(e.get());

        if(xPress.getXLeas().getData() != null) {
            for(XLeaType l : xPress.getXLeas().getData()) {
                System.out.println(l.getRefId() + " - " + l.getLeaName());
            }
        }

    }
}
