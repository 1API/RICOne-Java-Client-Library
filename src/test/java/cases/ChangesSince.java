/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.5
 * @since       Jan 13, 2017
 * @filename	ChangesSince.java
 */
package cases;

import riconeapi.authentication.Authenticator;
import riconeapi.common.XPress;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.XCalendarType;
import riconeapi.models.xpress.XContactType;
import riconeapi.models.xpress.XCourseType;
import riconeapi.models.xpress.XLeaType;
import riconeapi.models.xpress.XRosterType;
import riconeapi.models.xpress.XSchoolType;
import riconeapi.models.xpress.XSessionType;
import riconeapi.models.xpress.XStaffType;
import riconeapi.models.xpress.XStudentType;

public class ChangesSince
{
	final static String authUrl = "https://auth.test.ricone.org/login";
	final static String clientId = "dpaDemo";
	final static String clientSecret = "deecd889bff5ed0101a86680752f5f9";
//	final static String clientSecret = "deecd889bff5ed0101a86680752f5f";
	final static String providerId = "localhost";
	
	public static void main(String[] args) throws AuthenticationException
	{
		
		Authenticator auth = Authenticator.getInstance();
		
//		try
//		{
			auth.authenticate(authUrl, clientId, clientSecret);
			for(Endpoint e : auth.getEndpoints(providerId))
			{
				XPress xPress = new XPress(e.getHref());
				System.out.println(e.getHref());
				
//				for (XLeaType l : xPress.getXLeas("2016-02-07T10:28:24.626-05:00").getData())
//				{
//					System.out.println(l.getRefId());
//				}
//				for (XSchoolType s : xPress.getXSchools("2016-02-07T10:28:24.626-05:00").getData())
//				{
//					System.out.println(s.getRefId());
//				}
//				for (XCalendarType c : xPress.getXCalendars("2016-02-07T10:28:24.626-05:00").getData())
//				{
//					System.out.println(c.getRefId());
//					System.out.println("School " + c.getSchoolRefId());
//				}
//				for (XCourseType c : xPress.getXCourses("2016-02-08T15:31:00").getData())
//				{
//					System.out.println(c.getRefId());
//				}
//				for (XRosterType r : xPress.getXRosters("2016-12-07T15:31:00").getData())
//				{
//					System.out.println(r.getRefId());
//				}
//				for (XStaffType s : xPress.getXStaffs("2016-02-08T15:30:00").getData())
//				{
//					System.out.println(s.getRefId());
//				}
//				for (XStudentType s : xPress.getXStudents("2016-03-08T15:30:00").getData())
//				{
//					System.out.println(s.getRefId());
//					System.out.println(s.getName().getMiddleName());
//				}
//				for (XContactType c : xPress.getXContacts("2016-12-10T15:37:05").getData())
//				{
//					System.out.println(c.getRefId());
//				}
			}
//		}
//		catch (AuthenticationException e)
//		{
//			System.err.println(e.getMessage());
//			e.printStackTrace();
////			e.printStackTrace();
//			
//		}
	}

}
