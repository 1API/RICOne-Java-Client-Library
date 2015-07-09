import riconeapi.models.authentication.Endpoint;
import riconeapi.models.sifxpress.XLeaType;
import riconeapi.models.sifxpress.XPersonReferenceType;
import riconeapi.models.sifxpress.XRosterType;

public class SampleConsole
{
	//private static final String username = "YOUR USERNAME";
    //private static final String password = "YOUR PASSWORD";
	private static final String username = "Full_3";
	private static final String password = "Full_3";
	//Optional
	private static final String providerId = "SCRIC - Test Data Provider 1";
	private static final String navigationPage = "1";
	private static final String navigationPageSize = "5";

	public static void main(String[] args)
	{
		Authenticator auth = new Authenticator(username, password); //Pass username and password to authenticate to OAuth server

        for(Endpoint e : auth.GetEndpoints(providerId)) //For the provided endpoint
        {
            RicOneApiClient ricOne = new RicOneApiClient(e); //Pass endpoint info to data API (token, href)

            for(XLeaType l : ricOne.sifXpress.GetXLeas()) //Iterate through each xLea
            {
                for(XRosterType r : ricOne.sifXpress.GetXRostersByXLea(l.getRefId(), navigationPage, navigationPageSize)) //Get each roster for each lea refId w/ paging
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
        }

	}

}
