import riconeapi.models.authentication.Endpoint;

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
		
		System.out.println(auth.GetUserInfo().getId());
		System.out.println(auth.GetUserInfo().getUser_name());
		
		for(Endpoint e : auth.GetEndpoints(providerId))
		{
			System.out.println(e.getName());
			System.out.println(e.getHref());
			System.out.println(e.getToken());
		}

	}

}
