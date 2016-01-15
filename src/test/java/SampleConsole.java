/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.0
 * @since       Jul 9, 2015
 * Filename		SampleConsole.java
 */
import riconeapi.common.Authenticator;
import riconeapi.common.RicOneApiClient;
import riconeapi.common.SifXpress;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.sifxpress.XLeaType;
import riconeapi.models.sifxpress.XPersonReferenceType;
import riconeapi.models.sifxpress.XRosterType;

public class SampleConsole
{
	static final String username = "YOUR USERNAME";
	static final String password = "YOUR PASSWORD";
	// Optional
	static final String providerId = "NERIC01";
	// static final int navigationPage = 1;
	static final int navigationPageSize = 500;

	public static void main(String[] args)
	{
		Authenticator auth = new Authenticator(username, password); //Pass username and password to authenticate to OAuth server

        for(Endpoint e : auth.GetEndpoints(providerId)) //For the provided endpoint
        {
            RicOneApiClient ricOne = new RicOneApiClient(e); //Pass endpoint info to data API (token, href)

            for(XLeaType l : ricOne.sifXpress.GetXLeas()) //Iterate through each xLea
            {
            	for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXRostersByXLea, l.getRefId()); i++) //Get max page size for rosters by lea
        		{
	                for(XRosterType r : ricOne.sifXpress.GetXRostersByXLea(l.getRefId(), i, navigationPageSize)) //Get each roster for each lea refId w/ paging
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
