package cases;

import riconeapi.common.Authenticator;
import riconeapi.common.XPress;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.*;

/**
 * Created by andrew.pieniezny on 6/30/2017.
 */
public class EntryExit
{
	final static String authUrl = "https://auth.test.ricone.org/login";
	final static String clientId = "dpaDemo";
	final static String clientSecret = "deecd889bff5ed0101a86680752f5f9";
	final static String providerId = "localhost";

	public static void main(String[] args) throws AuthenticationException
	{
		Authenticator auth = Authenticator.getInstance();
		auth.authenticate(authUrl, clientId, clientSecret);

		for(Endpoint e : auth.getEndpoints(providerId))
		{
			XPress xPress = new XPress(e.getHref());

			if(xPress.getXStudentsByXLea("15077B52-7D2A-4855-B41F-37FBA242522E").getData() != null)
			{
				for(XStudentType s : xPress.getXStudentsByXLea("15077B52-7D2A-4855-B41F-37FBA242522E").getData())
				{
					System.out.println("refId: " + s.getRefId());
					System.out.println("##### BEGIN ENROLLMENT #####");
					System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
					System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
					System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
					System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
					System.out.println("##### BEGIN ENTRY TYPE #####");
					System.out.println("ENTRY TYPE CODE: " + s.getEnrollment().getEntryType().getCode());
					for(XOtherCodeType oct : s.getEnrollment().getEntryType().getOtherCode())
					{
						System.out.println("OTHER ENTRY TYPE CODENAME: " + oct.getCodesetName());
						System.out.println("OTHER ENTRY TYPE CODE: " + oct.getOtherCodeValue());
					}
					System.out.println("##### END ENTRY TYPE #####");
					System.out.println("exitDate: " + s.getEnrollment().getExitDate());
					System.out.println("##### BEGIN EXIT TYPE #####");
					System.out.println("EXIT TYPE CODE: " + s.getEnrollment().getExitType().getCode());
					for(XOtherCodeType oct : s.getEnrollment().getExitType().getOtherCode())
					{
						System.out.println("OTHER EXIT TYPE CODENAME: " + oct.getCodesetName());
						System.out.println("OTHER EXIT TYPE CODE: " + oct.getOtherCodeValue());
					}
					System.out.println("##### END EXIT TYPE #####");
					System.out.println("========================================");
				}
			}
		}
	}
}
