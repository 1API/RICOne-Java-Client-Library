package cases;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.4
 * @since       Aug 30, 2016
 * @filename	TokenInfo.java
 */

import riconeapi.authentication.Authenticator;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.authentication.DecodedToken;

public class TokenInfo
{
	final static String authUrl = "https://auth.RestResponse.ricone.org/login";
	final static String clientId = "dpaDemo";
	final static String clientSecret = "deecd889bff5ed0101a86680752f5f9";
	
	public static void main(String[] args) throws AuthenticationException
	{
		Authenticator auth = Authenticator.getInstance();
		auth.authenticate(authUrl, clientId, clientSecret);
		
//		String myToken = auth.getToken();
//		System.out.println(auth.getToken());
		DecodedToken dt = new DecodedToken(auth.getToken());
		
		if(dt.getDecodedToken() != null)
		{
			System.out.println(true);
			
		}
		else
		{
			System.out.println(false);
		}
		
		System.out.println(dt.getDecodedToken().getApplication_id());
		System.out.println(dt.getDecodedToken().getIat());
		System.out.println(dt.getDecodedToken().getExp());
		System.out.println(dt.getDecodedToken().getIss());
	}
}
