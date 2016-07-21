package cases;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.2.1
 * @since       May 17, 2016
 * @filename	TokenInfo.java
 */

import riconeapi.common.Authenticator;
import riconeapi.common.Authenticator;

public class TokenInfo
{
	final static String authUrl = "https://auth.test.ricone.org/login";
	final static String clientId = "dpaDemo";
	final static String clientSecret = "65ee6dc913d9023f1ee94ab33c3cae38c57";
	
	public static void main(String[] args)
	{
		Authenticator auth = new Authenticator(authUrl, clientId, clientSecret);
		
		String myToken = auth.getToken();
		
		System.out.println(auth.getDecodedToken(myToken).getApplication_id());
		System.out.println(auth.getDecodedToken(myToken).getIat());
		System.out.println(auth.getDecodedToken(myToken).getExp());
		System.out.println(auth.getDecodedToken(myToken).getIss());
	}
}
