package cases;

import riconeapi.authentication.Authenticator;
import riconeapi.common.XPress;
import riconeapi.common.paths.ServicePath;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.XLeaType;
import riconeapi.models.xpress.XPersonReferenceType;
import riconeapi.models.xpress.XRosterType;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.7
 * @since       Feb 14, 2018
 */
public class SampleConsole
{
	final static String authUrl = "AUTH URL";
	static final String clientId = "YOUR USERNAME";
	static final String clientSecret = "YOUR PASSWORD";

	// Optional
	static final String providerId = "PROVIDER ID";
//	static final int navigationPage = 1;
	static final int navigationPageSize = 500;

	public static void main(String[] args) throws AuthenticationException
	{
		Authenticator auth = Authenticator.getInstance(); // Get instance of Authenticator
		auth.authenticate(authUrl, clientId, clientSecret); //Pass auth url, username, and password to authenticate to auth server

        for(Endpoint e : auth.getEndpoints(providerId)) //For the provided endpoint
        {
            XPress xPress = new XPress(e.getHref()); //Pass endpoint info to data API (token, href)

            for(XLeaType l : xPress.getXLeas().getData()) //Iterate through each xLea
            {
            	System.out.println(navigationPageSize);
            	System.out.println(ServicePath.GETXROSTERSBYXLEA);
            	System.out.println(l.getRefId());
				System.out.println(xPress.getLastPage(navigationPageSize, ServicePath.GETXROSTERSBYXLEA, l.getRefId()));
            	for (int i = 1; i <= xPress.getLastPage(navigationPageSize, ServicePath.GETXROSTERSBYXLEA, l.getRefId()); i++) //Get max page size for rosters by lea
        		{

	                for(XRosterType r : xPress.getXRostersByXLea(l.getRefId(), i, navigationPageSize).getData()) //Get each roster for each lea refId w/ paging
	                {
	                	if(r.getStudents() != null) //Only return courses with students
						{
							System.out.println("courseTitle: " + r.getCourseTitle());
							for(XPersonReferenceType p : r.getStudents().getStudentReference()) //Students for each course
							{
								System.out.println("refId: " + p.getRefId());
								System.out.println("localId: " + p.getLocalId());
								System.out.println("givenName: " + p.getGivenName());
								System.out.println("familyName: " + p.getFamilyName());
							}
						}
	                }
	                System.out.println("######## PAGE " + i + " ########");
        		}
            }
        }

	}

}
