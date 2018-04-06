/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     x.x.x
 * @since       Jan 9, 2017
 * @filename	JsonXmlReturn.java
 */
package cases;

import com.fasterxml.jackson.core.JsonProcessingException;

import riconeapi.authentication.Authenticator;
import riconeapi.common.XPress;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.authentication.Endpoint;

public class JsonXmlReturn
{
	final static String authUrl = "https://auth.test.ricone.org/login";
	final static String clientId = "dpaDemo";
	final static String clientSecret = "deecd889bff5ed0101a86680752f5f9";
//	final static String clientSecret = "deecd889bff5ed0101a86680752f5f";
	final static String providerId = "localhost";
	final static int  navigationPage = 1;
	final static int navigationPageSize = 1;
	
	public static void main(String[] args) throws AuthenticationException, JsonProcessingException
	{
		Authenticator auth = Authenticator.getInstance();
		auth.authenticate(authUrl, clientId, clientSecret);
		
		for(Endpoint e : auth.getEndpoints(providerId))
		{
			XPress xpress = new XPress(e.getHref());

//			System.out.println(xpress.getXLeas().getJson());
//			System.out.println(xpress.getXLeas().getXml());
//			System.out.println(xpress.getXLeas().getData().toString());
//			System.out.println("------------------------------------------------------------------------");
//			System.out.println(xpress.getXLea("E0BD9FF3-6557-4805-A8B0-2156CD46DC0B").getJson());
//			System.out.println(xpress.getXLea("E0BD9FF3-6557-4805-A8B0-2156CD46DC0B").getXml());
//			System.out.println(xpress.getXLea("03ACF04F-DC12-411A-9A42-E8323516D699").getData().toString());

			System.out.println(xpress.getXSchools().getData());
			System.out.println(xpress.getXSchools().getJson());
			System.out.println(xpress.getXSchools().getXml());
			System.out.println("------------------------------------------------------------------------");
			System.out.println(xpress.getXSchool("08433BE0-6754-4D37-A3DD-3FF8CBBDF416").getData());
			System.out.println(xpress.getXSchool("08433BE0-6754-4D37-A3DD-3FF8CBBDF416").getJson());
			System.out.println(xpress.getXSchool("08433BE0-6754-4D37-A3DD-3FF8CBBDF416").getXml());


//			for(XLeaType l : xpress.getXLeas().getData())
//			{
//				System.out.println(l.getRefId());
//				System.out.println(l.getLeaName());
//			}



//			XPress_OLD xPress = new XPress_OLD(e.getHref());
//
//			if(xPress.getXLeas().getData() != null)
//			{
//				System.err.println("not null");
//				System.err.println(xPress.getXLeas().getJson());
//				System.err.println(xPress.getXLeas().getXml());
//
//				for(XLeaType l : xPress.getXLeas().getData())
//				{
//					System.err.println("in loop");
//					System.err.println(l.getRefId());
//					System.out.println(l.getLeaName());
//				}
//			}
		}
	}

}
