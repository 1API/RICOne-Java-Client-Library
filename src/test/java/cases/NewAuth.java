/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     x.x.x
 * @since       Jul 13, 2016
 * @filename	NewAuth.java
 */
package cases;

import riconeapi.authentication.Authenticator;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.authentication.Endpoint;

public class NewAuth
{
	final static String authUrl = "https://auth.test.ricone.org/login";
	final static String clientId = "dpaDemo";
	final static String clientSecret = "deecd889bff5ed0101a86680752f5f9";
//	final static String providerId = "workshop";

	public static void main(String[] args) throws InterruptedException, AuthenticationException
	{
		Authenticator auth = Authenticator.getInstance();
		auth.authenticate(authUrl, clientId, clientSecret);
		
//		while(true)
//		{
			for(Endpoint e : auth.getEndpoints("", true))
			{
				System.out.println(e.getProviderId() + " | " + e.getName() + " | " + e.getHref() + " | " + e.getToken());
			}
//			Thread.sleep(300000);
//			Thread.sleep(5000);
//		}
		
		
		
//		DateTime now = DateTime.now();
//		System.out.println(now);
//		DateTime dt = new DateTime(auth.getDecodedToken(Authenticator2.getInstance().getToken()).getExp());
////		System.out.println(auth.getDecodedToken(Authenticator2.getInstance().getToken()).getExp());
//		System.out.println(dt);
	}

}
