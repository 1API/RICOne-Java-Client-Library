package cases;
/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.3.1
 * @since       Jul 20, 2016
 * Filename		SampleConsole.java
 */
import riconeapi.common.Authenticator;
import riconeapi.common.XPress;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.XLeaType;
import riconeapi.models.xpress.XPersonReferenceType;
import riconeapi.models.xpress.XRosterType;

public class SampleConsole
{
	final static String authUrl = "AUTH URL";
	static final String clientId = "YOUR USERNAME";
	static final String clientSecret = "YOUR PASSWORD";

	// Optional
	static final String providerId = "PROVIDER ID";
//	static final int navigationPage = 1;
	static final int navigationPageSize = 500;

	public static void main(String[] args)
	{
		Authenticator auth = new Authenticator(authUrl, clientId, clientSecret); //Pass auth url, username, and password to authenticate to auth server

        for(Endpoint e : auth.getEndpoints(providerId)) //For the provided endpoint
        {
            XPress xPress = new XPress(e.getHref()); //Pass endpoint info to data API (token, href)
            
            for(XLeaType l : xPress.getXLeas().getData()) //Iterate through each xLea
            {
            	for (int i = 1; i <= xPress.getLastPage(navigationPageSize, XPress.ServicePath.GETXROSTERSBYXLEA, l.getRefId()); i++) //Get max page size for rosters by lea
        		{
	                for(XRosterType r : xPress.getXRostersByXLea(l.getRefId(), i, navigationPageSize).getData()) //Get each roster for each lea refId w/ paging
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
	                System.out.println("######## PAGE " + i + " ########");
        		}
            }
        }

	}

}
