package cases;
import riconeapi.authentication.Authenticator;
import riconeapi.common.XPress;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.XStaffType;
import riconeapi.models.xpress.XStudentType;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.3.1
 * @since       Jul 20, 2016
 * @filename	AppAccountProvisioning.java
 */

public class AppAccountProvisioning
{
	final static String authUrl = AuthServiceProperties.getInstance().getProperty("auth.url");
	final static String clientId = AuthServiceProperties.getInstance().getProperty("auth.clientId");
	final static String clientSecret = AuthServiceProperties.getInstance().getProperty("auth.clientSecret");
	final static String providerId = AuthServiceProperties.getInstance().getProperty("auth.providerId");
	
//	static String refId = "0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C";
	static String refId = "106E9449-3FF4-499E-B94F-BCE557C013CE";
	
	public static void main(String[] args)
	{
		try
		{
			Authenticator auth = Authenticator.getInstance();
			auth.authenticate(authUrl, clientId, clientSecret);
			
			for(Endpoint e : auth.getEndpoints(providerId))
			{
	            XPress xPress = new XPress(e.getHref());
	            
	            //Staff
	//            xPress.createXStaffUsers(refId);
	//            xPress.deleteXStaffUsers(refId);
	//            XStaffs_GetXStaffsAccounts(xPress);
	            
	            //Student
	//            xPress.createXStudentUsers(refId);
	//            xPress.deleteXStudentUsers(refId);
	//            XStudents_GetXStudentsAccounts(xPress);
	            
	            //Contact
	//            xPress.createXContactUsers(refId);
	//            xPress.deleteXContactUsers(refId);
	//            xPress.getXContactUsers("0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C");    
			}
		}
		catch(Exception e)
		{}

	}
	
	public static void XStaffs_GetXStaffsAccounts(XPress xPress)
	{
		try
		{
			if(xPress.getXStaffUsers(refId).getData() !=null)
			{
				for(XStaffType s : xPress.getXStaffUsers(refId).getData())
				{
					System.out.println("loginId: " + s.getAppProvisioningInfo().getLoginId());
					System.out.println("tempPassword: " + s.getAppProvisioningInfo().getTempPassword());
					System.out.println("tempExpiryDate: " + s.getAppProvisioningInfo().getTempPasswordExpiryDate());
				}
			}
		}
		catch(Exception e)
		{}
	}
	
	public static void XStudents_GetXStudentsAccounts(XPress xPress)
	{
		try
		{
			if(xPress.getXStudentUsers(refId).getData() !=null)
			{
				for(XStudentType s : xPress.getXStudentUsers(refId).getData())
				{
					System.out.println("loginId: " + s.getAppProvisioningInfo().getLoginId());
					System.out.println("tempPassword: " + s.getAppProvisioningInfo().getTempPassword());
					System.out.println("tempExpiryDate: " + s.getAppProvisioningInfo().getTempPasswordExpiryDate());
				}
			}
		}
		catch(Exception e)
		{}
	}

}
