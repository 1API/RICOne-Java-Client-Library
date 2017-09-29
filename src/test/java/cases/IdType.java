/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     x.x.x
 * @since       Jan 17, 2017
 * @filename	IdType.java
 */
package cases;

import riconeapi.authentication.Authenticator;
import riconeapi.common.XPress;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.XLeaType;

public class IdType
{
	final static String authUrl = "https://auth.test.ricone.org/login";
	final static String clientId = "dpaDemo";
	final static String clientSecret = "deecd889bff5ed0101a86680752f5f9";
	final static String providerId = "localhost";
	
	public static void main(String[] args) throws AuthenticationException
	{
		Authenticator auth = Authenticator.getInstance();
		auth.authenticate(authUrl, clientId, clientSecret);
		
		for(Endpoint e : auth.getEndpoints(providerId))
		{
			XPress xPress = new XPress(e.getHref());
			
			//IdType=beds or local
			//beds:738121
			//local:BT101
			XLeaType l = xPress.getXLea("beds", "738121").getData();
			System.err.println(l.getRefId());
			System.out.println(l.getLocalId());
			System.out.println(l.getStateProvinceId());
			System.out.println(l.getLeaName());
		}

	}

}
