package cases;
import riconeapi.common.Authenticator;
import riconeapi.common.XPress;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.XContactType;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.3
 * @since       Jun 23, 2016
 * @filename	AppAccountProvisioning.java
 */

public class AppAccountProvisioning
{
	final static String authUrl = "http://auth.test.ricone.org/login";
	final static String clientId = "dpademo";
	final static String clientSecret = "65ee6dc913d9023f1ee94ab33c3cae38c57";
	static final String providerId = "sandbox";
	
	public static void main(String[] args)
	{
		Authenticator auth = new Authenticator(authUrl, clientId, clientSecret);
		
		for(Endpoint e : auth.getEndpoints(providerId))
		{
            XPress xPress = new XPress(auth.getToken(), e.getHref());
            
            //Staff
//            xPress.createXStaffUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
//            xPress.deleteXStaffUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
//            xPress.getXStaffUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
            
            //Student
//            xPress.createXStudentUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
//            xPress.deleteXStudentUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
//            xPress.getXStudentUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
            
            //Contact
//            xPress.createXContactUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
//            xPress.deleteXContactUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
//            xPress.getXContactUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");    
		}

	}

}
