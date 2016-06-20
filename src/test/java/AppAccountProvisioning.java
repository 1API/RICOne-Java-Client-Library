import riconeapi.common.Authenticator;
import riconeapi.common.RicOneApiClient;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.XContactType;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.2.2
 * @since       May 25, 2016
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
            RicOneApiClient ricOne = new RicOneApiClient(e);
            
            //Staff
//            ricOne.xPress.createXStaffUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
//            ricOne.xPress.deleteXStaffUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
//            ricOne.xPress.getXStaffUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
            
            //Student
//            ricOne.xPress.createXStudentUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
//            ricOne.xPress.deleteXStudentUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
//            ricOne.xPress.getXStudentUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
            
            //Contact
//            ricOne.xPress.createXContactUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
//            ricOne.xPress.deleteXContactUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");
//            ricOne.xPress.getXContactUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");    
		}

	}

}
