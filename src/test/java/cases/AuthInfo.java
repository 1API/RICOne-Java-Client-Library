package cases;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.3
 * @since       Jun 20, 2016
 */

public class AuthInfo
{
	public static void main(String[] args)
	{
		System.out.println(AuthServiceProperties.getInstance().getAllPropertyNames());
		
		System.out.println(AuthServiceProperties.getInstance().getProperty("auth.url"));
		System.out.println(AuthServiceProperties.getInstance().getProperty("auth.clientId"));
		System.out.println(AuthServiceProperties.getInstance().getProperty("auth.clientSecret"));
		System.out.println(AuthServiceProperties.getInstance().getProperty("auth.providerId"));
		System.out.println(AuthServiceProperties.getInstance().getProperty("auth.token"));
		
		
	}
}
