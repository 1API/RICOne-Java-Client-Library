import org.eclipse.jdt.annotation.Nullable;

import riconeapi.models.authentication.Endpoint;
import sif.dd.xPress.model.XLeaType;
import sif.dd.xPress.model.XTelephoneType;

public class RicOneApiTests
{
	//region Test Constants
	final static String username = "Full_3";
	final static String password = "Full_3";
    //final String provider = "North East Regional Information Center - productio";
	final static String providerId = "South Central RIC - Test Data Provider 1";
    static String navigationPage = "1";
    static String navigationPageSize = "1";
	//endregion

	public static void main(String[] args)
	{
		Authenticator auth = new Authenticator(username, password);
		
//		System.out.println(auth.GetUserInfo().getId());
//		System.out.println(auth.GetUserInfo().getUser_name());
//		
//		for(Endpoint e : auth.GetEndpoints(providerId))
//		{
//			System.out.println(e.getName());
//			System.out.println(e.getHref());
//			System.out.println(e.getToken());
//		}
		
		for(Endpoint e : auth.GetEndpoints(providerId))
		{
			RicOneApiClient ricOne = new RicOneApiClient(e);
			
			XLeas_GetXLeas(ricOne);
            //XLeas_GetXLea(ricOne);
            //XLeas_GetXLeasByXSchool(ricOne);
            //XLeas_GetXLeasByXStudent(ricOne);
            //XLeas_GetXLeasByXContact(ricOne);
		}

	}

	@Nullable
	public static void XLeas_GetXLeas(RicOneApiClient ricOne)
	{
		for (XLeaType lea : ricOne.sifXpress.GetXLeas())
		{	
			System.out.println("refId: " + lea.getRefId());
			System.out.println("leaName: " + lea.getLeaName());
			System.out.println("leaRefId: " + lea.getLeaRefId());
			System.out.println("localId: " + lea.getLocalId());
			System.out.println("ncesId: " + lea.getNcesId());
			System.out.println("stateProvinceId: " + lea.getStateProvinceId());
			System.out.println("##### BEGIN ADDRESS #####");
			System.out.println("addressType: " + lea.getAddress().getAddressType());
			System.out.println("city: " + lea.getAddress().getCity());
			System.out.println("line1: " + lea.getAddress().getLine1());
			System.out.println("line2: " + lea.getAddress().getLine2());
			System.out.println("countryCode: " + lea.getAddress().getCountryCode());
			System.out.println("postalCode: " + lea.getAddress().getPostalCode());
			System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
			System.out.println("##### END ADDRESS #####");
			System.out.println("##### BEGIN PHONENUMBER #####");
			System.out.println("number: " + lea.getPhoneNumber().getNumber());
			System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
			System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
			System.out.println("##### END PHONENUMBER #####");
			System.out.println("##### BEGIN OTHERPHONENUMBER #####");
			
			for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
			{
				System.out.println("number: " + p.getNumber());
				System.out.println("phoneNumberType: " + p.getPhoneNumberType());
				System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
			}
			System.out.println("##### END OTHERPHONENUMBER #####");
			System.out.println("========================================");
		}
	}

}
