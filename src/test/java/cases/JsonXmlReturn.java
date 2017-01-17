/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     x.x.x
 * @since       Jan 9, 2017
 * @filename	JsonXmlReturn.java
 */
package cases;

import com.fasterxml.jackson.core.JsonProcessingException;

import riconeapi.common.Authenticator;
import riconeapi.common.XPress;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.XLeaType;

public class JsonXmlReturn
{
	final static String authUrl = "https://auth.test.ricone.org/login";
	final static String clientId = "dpaDemo";
	final static String clientSecret = "deecd889bff5ed0101a86680752f5f9";
//	final static String clientSecret = "deecd889bff5ed0101a86680752f5f";
	final static String providerId = "localhost";
	
	public static void main(String[] args) throws AuthenticationException, JsonProcessingException
	{
		Authenticator auth = Authenticator.getInstance();
		auth.authenticate(authUrl, clientId, clientSecret);
		
		for(Endpoint e : auth.getEndpoints(providerId))
		{
			XPress xPress = new XPress(e.getHref());
			
			if(xPress.getXLeas().getData() != null)
			{
				System.err.println("not null");
//				System.err.println(xPress.getXLeas().getJson());
//				System.err.println(xPress.getXLeas().getXml());
				
//				for(XLeaType l : xPress.getXLeas().getData())
//				{
//					System.err.println("in loop");
//					System.err.println(l.getRefId());
//					System.out.println(l.getLeaName());
//				}
			}
		}
	}

}
