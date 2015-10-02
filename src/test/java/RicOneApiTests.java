/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.1.2
 * @since       Sep 29, 2015
 * Filename		RicOneApiTests.java
 */

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import java.security.cert.X509Certificate;

import riconeapi.models.authentication.Endpoint;
import riconeapi.models.sifxpress.XCalendarType;
import riconeapi.models.sifxpress.XContactStudentRelationshipType;
import riconeapi.models.sifxpress.XContactType;
import riconeapi.models.sifxpress.XCourseType;
import riconeapi.models.sifxpress.XEmailType;
import riconeapi.models.sifxpress.XEnrollmentType;
import riconeapi.models.sifxpress.XLanguageType;
import riconeapi.models.sifxpress.XLeaType;
import riconeapi.models.sifxpress.XMeetingTimeType;
import riconeapi.models.sifxpress.XOtherCourseIdType;
import riconeapi.models.sifxpress.XOtherOrganizationIdType;
import riconeapi.models.sifxpress.XOtherPersonIdType;
import riconeapi.models.sifxpress.XPersonNameType;
import riconeapi.models.sifxpress.XPersonReferenceType;
import riconeapi.models.sifxpress.XRaceType;
import riconeapi.models.sifxpress.XRosterType;
import riconeapi.models.sifxpress.XSchoolType;
import riconeapi.models.sifxpress.XSessionType;
import riconeapi.models.sifxpress.XStaffPersonAssignmentType;
import riconeapi.models.sifxpress.XStaffReferenceType;
import riconeapi.models.sifxpress.XStaffType;
import riconeapi.models.sifxpress.XStudentType;
import riconeapi.models.sifxpress.XTelephoneType;

public class RicOneApiTests
{
	// Test Constants
	final static String username = "Demo1";
	final static String password = "Demo1";

	final static String providerId = "NERIC01";
//	final static String providerId = "SCRICAPIT01";
//	 static String navigationPage = "1";
//	static int navigationPageSize = 1;
//	 static int navigationPageSize = 250;
    
	// Null:
	 static String refId = null;
	// Lea:
//	 static String refId = "9BA8379D-9A9D-4D59-9202-E976CADF5526";
	// School:
//	 static String refId = "66667705-6C51-4C30-A22A-77CEA0FBCF53";
	// Calendar:
//	 static String refId = "B0FD06FD-5F35-4D96-B2EA-AA96CD2D0F38";
	// Course:
//	 static String refId = "C9DEA47A-DB79-4912-B5F4-03EB50C2A99F";
	// Roster:
//	 static String refId = "4BDC482E-B0CA-4D36-B5EC-607E06D08727";
	// Staff:
//	 static String refId = "61126B90-2AF9-4176-9377-005686D1B855";
	// Student:
//	 static String refId = "0AC93DFD-DC1C-48A4-9D37-000210E4C952";
//	 static String refId = "D47B7B88-CE17-44FB-B94F-0000E5BA0532";
	// Contact 1:
//	 static String refId = "9a7345c7-72bd-4672-aee2-001876903ad8";
//	 static String refId = "128592BC-691D-4ED0-9493-0007D6966142";
    

	public static void main(String[] args)
	{
		//FIX NOT FOR PRODUCTION!!!!! ONLY TESTING ON INVALID SERVER CERT
//		try{
//	    TrustManager[] trustAllCerts = new TrustManager[] {
//	       new X509TrustManager() {
//	          public java.security.cert.X509Certificate[] getAcceptedIssuers() {
//	            return null;
//	          }
//
//	          public void checkClientTrusted(X509Certificate[] certs, String authType) {  }
//
//	          public void checkServerTrusted(X509Certificate[] certs, String authType) {  }
//
//	       }
//	    };
//
//	    SSLContext sc = SSLContext.getInstance("SSL");
//	    sc.init(null, trustAllCerts, new java.security.SecureRandom());
//	    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

	    // Create all-trusting host name verifier
//	    HostnameVerifier allHostsValid = new HostnameVerifier() {
//	        public boolean verify(String hostname, SSLSession session) {
//	          return true;
//	        }
//	    };
//	    // Install the all-trusting host verifier
//	    HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
//		}
//		catch(Exception e){}
	    
		Authenticator auth = new Authenticator(username, password);
		
		for (Endpoint e : auth.GetEndpoints(providerId))
		{
			RicOneApiClient ricOne = new RicOneApiClient(e);

			// xLeas
//			 XLeas_GetXLeas(ricOne);
			// XLeas_GetXLea(ricOne);
			// XLeas_GetXLeasByXSchool(ricOne);
//			XLeas_GetXLeasByXRoster(ricOne);
//			XLeas_GetXLeasByXStaff(ricOne);
			// XLeas_GetXLeasByXStudent(ricOne);
			// XLeas_GetXLeasByXContact(ricOne);

			// xSchools
			// XSchools_GetXSchools(ricOne);
			// XSchools_GetXSchool(ricOne);
			// XSchools_GetXSchoolsByXLea(ricOne);
			// XSchools_GetXSchoolsByXCalendar(ricOne);
			// XSchools_GetXSchoolsByXCourse(ricOne);
			// XSchools_GetXSchoolsByXRoster(ricOne);
			// XSchools_GetXSchoolsByXStaff(ricOne);
			// XSchools_GetXSchoolsByXStudent(ricOne);
			// XSchools_GetXSchoolsByXContact(ricOne);

			// xCalendars
			// XCalendars_GetXCalendars(ricOne);
			// XCalendars_GetXCalendar(ricOne);
//			XCalendars_GetXCalendarsByXLea(ricOne);
			// XCalendars_GetXCalendarsByXSchool(ricOne);

			// xCourses
			// XCourses_GetXCourses(ricOne);
			// XCourses_GetXCourse(ricOne);
			// XCourses_GetXCoursesByXLea(ricOne);
//			XCourses_GetXCoursesByXSchool(ricOne);
//			XCourses_GetXCoursesByXRoster(ricOne);

			// xRosters
			// XRosters_GetXRosters(ricOne);
			// XRosters_GetXRoster(ricOne);
			// XRosters_GetXRostersByXLea(ricOne);
			// XRosters_GetXRostersByXSchool(ricOne);
			// XRosters_GetXRostersByXCourse(ricOne);
			// XRosters_GetXRostersByXStaff(ricOne);
			// XRosters_GetXRostersByXStudent(ricOne);

			// xStaffs
//			 XStaffs_GetXStaffs(ricOne);
			// XStaffs_GetXStaff(ricOne);
			// XStaffs_GetXStaffsByXLea(ricOne);
			// XStaffs_GetXStaffsByXSchool(ricOne);
			// XStaffs_GetXStaffsByXCourse(ricOne);
			// XStaffs_GetXStaffsByXRoster(ricOne);
//			XStaffs_GetXStaffsByXStudent(ricOne);

			// xStudents
			// XStudents_GetXStudents(ricOne);
			// XStudents_GetXStudent(ricOne);
			// XStudents_GetXStudentsByXLea(ricOne);
			// XStudents_GetXStudentsByXSchool(ricOne);
			// XStudents_GetXStudentsByXRoster(ricOne);
			// XStudents_GetXStudentsByXStaff(ricOne);
			// XStudents_GetXStudentsByXContact(ricOne);

			// xContacts
			// XContacts_GetXSContacts(ricOne);
			// XContacts_GetXSContact(ricOne);
			// XContacts_GetXContactsByXLea(ricOne);
			// XContacts_GetXContactsByXSchool(ricOne);
			// XContacts_GetXContactsByXStudent(ricOne);

			// #################### navigatonLastPage ####################
			// xLeas
//			 XLeas_GetXLeasLastPage(ricOne);
//			 XLeas_GetXLeasByXSchoolLastPage(ricOne);
//			XLeas_GetXLeasByXRosterLastPage(ricOne);
//			XLeas_GetXLeasByXStaffLastPage(ricOne);
//			 XLeas_GetXLeasByXStudentLastPage(ricOne);
//			 XLeas_GetXLeasByXContactLastPage(ricOne);

			// xSchools
//			 XSchools_GetXSchoolsLastPage(ricOne);
//			 XSchools_GetXSchoolsByXLeaLastPage(ricOne);
//			 XSchools_GetXSchoolsByXCalendarLastPage(ricOne);
//			 XSchools_GetXSchoolsByXCourseLastPage(ricOne);
//			 XSchools_GetXSchoolsByXRosterLastPage(ricOne);
//			 XSchools_GetXSchoolsByXStaffLastPage(ricOne);
//			 XSchools_GetXSchoolsByXStudentLastPage(ricOne);
//			 XSchools_GetXSchoolsByXContactLastPage(ricOne);

			// xCalendars
//			 XCalendars_GetXCalendarsLastPage(ricOne);
//			XCalendars_GetXCalendarsByXLeaLastPage(ricOne);
//			 XCalendars_GetXCalendarsByXSchoolLastPage(ricOne);

			// xCourses
//			 XCourses_GetXCoursesLastPage(ricOne);
//			 XCourses_GetXCoursesByXLeaLastPage(ricOne);
//			XCourses_GetXCoursesByXSchoolLastPage(ricOne);
//			XCourses_GetXCoursesByXRosterLastPage(ricOne);

			// xRosters
//			 XRosters_GetXRostersLastPage(ricOne);
//			 XRosters_GetXRostersByXLeaLastPage(ricOne);
//			 XRosters_GetXRostersByXSchoolLastPage(ricOne);
//			 XRosters_GetXRostersByXCourseLastPage(ricOne);
//			 XRosters_GetXRostersByXStaffLastPage(ricOne);
//			 XRosters_GetXRostersByXStudentLastPage(ricOne);

			// xStaffs
//			 XStaffs_GetXStaffsLastPage(ricOne);
//			 XStaffs_GetXStaffsByXLeaLastPage(ricOne);
//			 XStaffs_GetXStaffsByXSchoolLastPage(ricOne);
//			 XStaffs_GetXStaffsByXCourseLastPage(ricOne);
//			 XStaffs_GetXStaffsByXRosterLastPage(ricOne);
//			XStaffs_GetXStaffsByXStudentLastPage(ricOne);

			// xStudents
//			 XStudents_GetXStudentsLastPage(ricOne);
//			 XStudents_GetXStudentsByXLeaLastPage(ricOne);
//			 XStudents_GetXStudentsByXSchoolLastPage(ricOne);
//			 XStudents_GetXStudentsByXRosterLastPage(ricOne);
//			 XStudents_GetXStudentsByXStaffLastPage(ricOne);
//			 XStudents_GetXStudentsByXContactLastPage(ricOne);

			// xContacts
//			 XContacts_GetXSContactsLastPage(ricOne);
//			 XContacts_GetXContactsByXLeaLastPage(ricOne);
//			 XContacts_GetXContactsByXSchoolLastPage(ricOne);
//			 XContacts_GetXContactsByXStudentLastPage(ricOne);
		}

	}
	
	// #################### xLeas ####################
	//RETURN ALL LEAS
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
	//RETURN SINGLE LEA
	public static void XLeas_GetXLea(RicOneApiClient ricOne)
    {
		XLeaType lea = ricOne.sifXpress.GetXLea(refId);
		
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

	 //RETURN LEAS BY SCHOOL
    public static void XLeas_GetXLeasByXSchool(RicOneApiClient ricOne)
    {
    	for (XLeaType lea : ricOne.sifXpress.GetXLeasByXSchool(refId))
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
    
    //RETURN LEAS BY ROSTER
    public static void XLeas_GetXLeasByXRoster(RicOneApiClient ricOne)
    {
    	for (XLeaType lea : ricOne.sifXpress.GetXLeasByXRoster(refId))
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
    
    //RETURN LEAS BY STAFF
    public static void XLeas_GetXLeasByXStaff(RicOneApiClient ricOne)
    {
    	for (XLeaType lea : ricOne.sifXpress.GetXLeasByXStaff(refId))
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
    
    //RETURN LEAS BY STUDENT
    public static void XLeas_GetXLeasByXStudent(RicOneApiClient ricOne)
    {
    	for (XLeaType lea : ricOne.sifXpress.GetXLeasByXStudent(refId))
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
    
    //RETURN LEAS BY CONTACT
    public static void XLeas_GetXLeasByXContact(RicOneApiClient ricOne)
    {
    	for (XLeaType lea : ricOne.sifXpress.GetXLeasByXContact(refId))
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
    
    // #################### xSchools ####################
    //RETURN ALL SCHOOLS
 
    public static void XSchools_GetXSchools(RicOneApiClient ricOne)
    {
        for(XSchoolType school : ricOne.sifXpress.GetXSchools())
        {
            System.out.println("refId: " + school.getRefId());
            System.out.println("leaRefId: " + school.getRefId());
            System.out.println("localId: " + school.getLocalId());
            System.out.println("stateProvinceId: " + school.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
            {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("schoolName: " + school.getSchoolName());
            System.out.println("##### BEGIN YEARGROUPS #####");
            for(String yg : school.getYearGroups().getYearGroup())
            {
                System.out.println("yearGroup: " + yg);
            }
            System.out.println("##### END YEARGROUPS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + school.getAddress().getAddressType());
            System.out.println("city: " + school.getAddress().getCity());
            System.out.println("line1: " + school.getAddress().getLine1());
            System.out.println("line2: " + school.getAddress().getLine2());
            System.out.println("countryCode: " + school.getAddress().getCountryCode());
            System.out.println("postalCode: " + school.getAddress().getPostalCode());
            System.out.println("stateProvince: " + school.getAddress().getStateProvince());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("number: " + school.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }
    }
    //RETURN SINGLE SCHOOL
    public static void XSchools_GetXSchool(RicOneApiClient ricOne)
    {
        XSchoolType school = ricOne.sifXpress.GetXSchool(refId);

        System.out.println("refId: " + school.getRefId());
        System.out.println("leaRefId: " + school.getRefId());
        System.out.println("localId: " + school.getLocalId());
        System.out.println("stateProvinceId: " + school.getStateProvinceId());
        System.out.println("##### BEGIN OTHERIDS #####");
        for(XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
        {
            System.out.println("otherId id" + id.getId());
            System.out.println("type: " + id.getType());
        }
        System.out.println("##### END OTHERIDS #####");
        System.out.println("schoolName: " + school.getSchoolName());
        System.out.println("##### BEGIN YEARGROUPS #####");
        for(String yg : school.getYearGroups().getYearGroup())
        {
            System.out.println("yearGroup: " + yg);
        }
        System.out.println("##### END YEARGROUPS #####");
        System.out.println("##### BEGIN ADDRESS #####");
        System.out.println("addressType: " + school.getAddress().getAddressType());
        System.out.println("city: " + school.getAddress().getCity());
        System.out.println("line1: " + school.getAddress().getLine1());
        System.out.println("line2: " + school.getAddress().getLine2());
        System.out.println("countryCode: " + school.getAddress().getCountryCode());
        System.out.println("postalCode: " + school.getAddress().getPostalCode());
        System.out.println("stateProvince: " + school.getAddress().getStateProvince());
        System.out.println("##### END ADDRESS #####");
        System.out.println("##### BEGIN PHONENUMBER #####");
        System.out.println("number: " + school.getPhoneNumber().getNumber());
        System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
        System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
        System.out.println("##### END PHONENUMBER #####");
        System.out.println("##### BEGIN OTHERPHONENUMBER #####");
        for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
        {
            System.out.println("otherPhoneNumbers number: " + p.getNumber());
            System.out.println("phoneNumberType: " + p.getPhoneNumberType());
            System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
        }
        System.out.println("##### END OTHERPHONENUMBER #####");
        System.out.println("========================================");
    }
    //RETURN SCHOOLS BY LEA
    public static void XSchools_GetXSchoolsByXLea(RicOneApiClient ricOne)
    {
        for(XSchoolType school : ricOne.sifXpress.GetXSchoolsByXLea(refId))
        {
        	System.out.println("refId: " + school.getRefId());
            System.out.println("leaRefId: " + school.getRefId());
            System.out.println("localId: " + school.getLocalId());
            System.out.println("stateProvinceId: " + school.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
            {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("schoolName: " + school.getSchoolName());
            System.out.println("##### BEGIN YEARGROUPS #####");
            for(String yg : school.getYearGroups().getYearGroup())
            {
                System.out.println("yearGroup: " + yg);
            }
            System.out.println("##### END YEARGROUPS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + school.getAddress().getAddressType());
            System.out.println("city: " + school.getAddress().getCity());
            System.out.println("line1: " + school.getAddress().getLine1());
            System.out.println("line2: " + school.getAddress().getLine2());
            System.out.println("countryCode: " + school.getAddress().getCountryCode());
            System.out.println("postalCode: " + school.getAddress().getPostalCode());
            System.out.println("stateProvince: " + school.getAddress().getStateProvince());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("number: " + school.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }
    }
    //RETURN SCHOOLS BY CALENDAR
    public static void XSchools_GetXSchoolsByXCalendar(RicOneApiClient ricOne)
    {
        for(XSchoolType school : ricOne.sifXpress.GetXSchoolsByXCalendar(refId))
        {
        	System.out.println("refId: " + school.getRefId());
            System.out.println("leaRefId: " + school.getRefId());
            System.out.println("localId: " + school.getLocalId());
            System.out.println("stateProvinceId: " + school.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
            {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("schoolName: " + school.getSchoolName());
            System.out.println("##### BEGIN YEARGROUPS #####");
            for(String yg : school.getYearGroups().getYearGroup())
            {
                System.out.println("yearGroup: " + yg);
            }
            System.out.println("##### END YEARGROUPS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + school.getAddress().getAddressType());
            System.out.println("city: " + school.getAddress().getCity());
            System.out.println("line1: " + school.getAddress().getLine1());
            System.out.println("line2: " + school.getAddress().getLine2());
            System.out.println("countryCode: " + school.getAddress().getCountryCode());
            System.out.println("postalCode: " + school.getAddress().getPostalCode());
            System.out.println("stateProvince: " + school.getAddress().getStateProvince());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("number: " + school.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }
    }
    //RETURN SCHOOLS BY COURSE
    public static void XSchools_GetXSchoolsByXCourse(RicOneApiClient ricOne)
    {
        for(XSchoolType school : ricOne.sifXpress.GetXSchoolsByXCourse(refId))
        {
        	System.out.println("refId: " + school.getRefId());
            System.out.println("leaRefId: " + school.getRefId());
            System.out.println("localId: " + school.getLocalId());
            System.out.println("stateProvinceId: " + school.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
            {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("schoolName: " + school.getSchoolName());
            System.out.println("##### BEGIN YEARGROUPS #####");
            for(String yg : school.getYearGroups().getYearGroup())
            {
                System.out.println("yearGroup: " + yg);
            }
            System.out.println("##### END YEARGROUPS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + school.getAddress().getAddressType());
            System.out.println("city: " + school.getAddress().getCity());
            System.out.println("line1: " + school.getAddress().getLine1());
            System.out.println("line2: " + school.getAddress().getLine2());
            System.out.println("countryCode: " + school.getAddress().getCountryCode());
            System.out.println("postalCode: " + school.getAddress().getPostalCode());
            System.out.println("stateProvince: " + school.getAddress().getStateProvince());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("number: " + school.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }
     }
    
    //RETURN SCHOOLS BY ROSTER
    public static void XSchools_GetXSchoolsByXRoster(RicOneApiClient ricOne)
     {
         for(XSchoolType school : ricOne.sifXpress.GetXSchoolsByXRoster(refId))
         {
        	 System.out.println("refId: " + school.getRefId());
             System.out.println("leaRefId: " + school.getRefId());
             System.out.println("localId: " + school.getLocalId());
             System.out.println("stateProvinceId: " + school.getStateProvinceId());
             System.out.println("##### BEGIN OTHERIDS #####");
             for(XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
             {
                 System.out.println("otherId id" + id.getId());
                 System.out.println("type: " + id.getType());
             }
             System.out.println("##### END OTHERIDS #####");
             System.out.println("schoolName: " + school.getSchoolName());
             System.out.println("##### BEGIN YEARGROUPS #####");
             for(String yg : school.getYearGroups().getYearGroup())
             {
                 System.out.println("yearGroup: " + yg);
             }
             System.out.println("##### END YEARGROUPS #####");
             System.out.println("##### BEGIN ADDRESS #####");
             System.out.println("addressType: " + school.getAddress().getAddressType());
             System.out.println("city: " + school.getAddress().getCity());
             System.out.println("line1: " + school.getAddress().getLine1());
             System.out.println("line2: " + school.getAddress().getLine2());
             System.out.println("countryCode: " + school.getAddress().getCountryCode());
             System.out.println("postalCode: " + school.getAddress().getPostalCode());
             System.out.println("stateProvince: " + school.getAddress().getStateProvince());
             System.out.println("##### END ADDRESS #####");
             System.out.println("##### BEGIN PHONENUMBER #####");
             System.out.println("number: " + school.getPhoneNumber().getNumber());
             System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
             System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
             System.out.println("##### END PHONENUMBER #####");
             System.out.println("##### BEGIN OTHERPHONENUMBER #####");
             for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
             {
                 System.out.println("otherPhoneNumbers number: " + p.getNumber());
                 System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                 System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
             }
             System.out.println("##### END OTHERPHONENUMBER #####");
             System.out.println("========================================");
         }
     }
    //RETURN SCHOOLS BY STAFF
    public static void XSchools_GetXSchoolsByXStaff(RicOneApiClient ricOne)
    {
        for(XSchoolType school : ricOne.sifXpress.GetXSchoolsByXStaff(refId))
        {
        	System.out.println("refId: " + school.getRefId());
            System.out.println("leaRefId: " + school.getRefId());
            System.out.println("localId: " + school.getLocalId());
            System.out.println("stateProvinceId: " + school.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
            {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("schoolName: " + school.getSchoolName());
            System.out.println("##### BEGIN YEARGROUPS #####");
            for(String yg : school.getYearGroups().getYearGroup())
            {
                System.out.println("yearGroup: " + yg);
            }
            System.out.println("##### END YEARGROUPS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + school.getAddress().getAddressType());
            System.out.println("city: " + school.getAddress().getCity());
            System.out.println("line1: " + school.getAddress().getLine1());
            System.out.println("line2: " + school.getAddress().getLine2());
            System.out.println("countryCode: " + school.getAddress().getCountryCode());
            System.out.println("postalCode: " + school.getAddress().getPostalCode());
            System.out.println("stateProvince: " + school.getAddress().getStateProvince());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("number: " + school.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }
    }
    //RETURN SCHOOLS BY STUDENT
    public static void XSchools_GetXSchoolsByXStudent(RicOneApiClient ricOne)
    {
        for(XSchoolType school : ricOne.sifXpress.GetXSchoolsByXStudent(refId))
        {
        	System.out.println("refId: " + school.getRefId());
            System.out.println("leaRefId: " + school.getRefId());
            System.out.println("localId: " + school.getLocalId());
            System.out.println("stateProvinceId: " + school.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
            {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("schoolName: " + school.getSchoolName());
            System.out.println("##### BEGIN YEARGROUPS #####");
            for(String yg : school.getYearGroups().getYearGroup())
            {
                System.out.println("yearGroup: " + yg);
            }
            System.out.println("##### END YEARGROUPS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + school.getAddress().getAddressType());
            System.out.println("city: " + school.getAddress().getCity());
            System.out.println("line1: " + school.getAddress().getLine1());
            System.out.println("line2: " + school.getAddress().getLine2());
            System.out.println("countryCode: " + school.getAddress().getCountryCode());
            System.out.println("postalCode: " + school.getAddress().getPostalCode());
            System.out.println("stateProvince: " + school.getAddress().getStateProvince());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("number: " + school.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }
    }
    //RETURN SCHOOLS BY CONTACT
    public static void XSchools_GetXSchoolsByXContact(RicOneApiClient ricOne)
    {
        for(XSchoolType school : ricOne.sifXpress.GetXSchoolsByXContact(refId))
        {
        	System.out.println("refId: " + school.getRefId());
            System.out.println("leaRefId: " + school.getRefId());
            System.out.println("localId: " + school.getLocalId());
            System.out.println("stateProvinceId: " + school.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
            {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("schoolName: " + school.getSchoolName());
            System.out.println("##### BEGIN YEARGROUPS #####");
            for(String yg : school.getYearGroups().getYearGroup())
            {
                System.out.println("yearGroup: " + yg);
            }
            System.out.println("##### END YEARGROUPS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + school.getAddress().getAddressType());
            System.out.println("city: " + school.getAddress().getCity());
            System.out.println("line1: " + school.getAddress().getLine1());
            System.out.println("line2: " + school.getAddress().getLine2());
            System.out.println("countryCode: " + school.getAddress().getCountryCode());
            System.out.println("postalCode: " + school.getAddress().getPostalCode());
            System.out.println("stateProvince: " + school.getAddress().getStateProvince());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("number: " + school.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }
    }
    
    // #################### xCalendars ####################
    //RETURN ALL CALENDARS
    public static void XCalendars_GetXCalendars(RicOneApiClient ricOne)
    {
        for(XCalendarType calendar : ricOne.sifXpress.GetXCalendars())
        {
            System.out.println("refId: " + calendar.getRefId());
            System.out.println("schoolRefId: " + calendar.getSchoolRefId());
            System.out.println("schoolYear: " + calendar.getSchoolYear());
			System.out.println("##### BEGIN SESSIONLIST #####");
            for(XSessionType sl : calendar.getSessions().getSessionList())
            {
                System.out.println("sessionType: " + sl.getSessionType());
                System.out.println("sessionCode: " + sl.getSessionCode());
                System.out.println("description: " + sl.getDescription());
                System.out.println("markingTerm: " + sl.isMarkingTerm());
                System.out.println("schedulingTerm: " + sl.isSchedulingTerm());
                System.out.println("linkedSessionCode: " + sl.getSessionCode());
                System.out.println("startDate: " + sl.getStartDate());
                System.out.println("endDate: " + sl.getEndDate());
            }
			System.out.println("##### END SESSIONLIST #####");
            System.out.println("========================================");
        }
    }
    //RETURN SINGLE CALENDAR
    public static void XCalendars_GetXCalendar(RicOneApiClient ricOne)
    {
        XCalendarType calendar = ricOne.sifXpress.GetXCalendar(refId);

        System.out.println("refId: " + calendar.getRefId());
        System.out.println("schoolRefId: " + calendar.getSchoolRefId());
        System.out.println("schoolYear: " + calendar.getSchoolYear());
		System.out.println("##### BEGIN SESSIONLIST #####");
        for(XSessionType sl : calendar.getSessions().getSessionList())
        {
            System.out.println("sessionType: " + sl.getSessionType());
            System.out.println("sessionCode: " + sl.getSessionCode());
            System.out.println("description: " + sl.getDescription());
            System.out.println("markingTerm: " + sl.isMarkingTerm());
            System.out.println("schedulingTerm: " + sl.isSchedulingTerm());
            System.out.println("linkedSessionCode: " + sl.getSessionCode());
            System.out.println("startDate: " + sl.getStartDate());
            System.out.println("endDate: " + sl.getEndDate());
        }
		System.out.println("##### END SESSIONLIST #####");
        System.out.println("========================================");
    }
  //RETURN CALENDARS BY LEA
    public static void XCalendars_GetXCalendarsByXLea(RicOneApiClient ricOne)
    {
        for(XCalendarType calendar : ricOne.sifXpress.GetXCalendarsByXLea(refId))
        {
        	System.out.println("refId: " + calendar.getRefId());
            System.out.println("schoolRefId: " + calendar.getSchoolRefId());
            System.out.println("schoolYear: " + calendar.getSchoolYear());
			System.out.println("##### BEGIN SESSIONLIST #####");
            for(XSessionType sl : calendar.getSessions().getSessionList())
            {
                System.out.println("sessionType: " + sl.getSessionType());
                System.out.println("sessionCode: " + sl.getSessionCode());
                System.out.println("description: " + sl.getDescription());
                System.out.println("markingTerm: " + sl.isMarkingTerm());
                System.out.println("schedulingTerm: " + sl.isSchedulingTerm());
                System.out.println("linkedSessionCode: " + sl.getSessionCode());
                System.out.println("startDate: " + sl.getStartDate());
                System.out.println("endDate: " + sl.getEndDate());
            }
			System.out.println("##### END SESSIONLIST #####");
            System.out.println("========================================");
        }
    }
    //RETURN CALENDARS BY SCHOOL
    public static void XCalendars_GetXCalendarsByXSchool(RicOneApiClient ricOne)
    {
        for(XCalendarType calendar : ricOne.sifXpress.GetXCalendarsByXSchool(refId))
        {
        	System.out.println("refId: " + calendar.getRefId());
            System.out.println("schoolRefId: " + calendar.getSchoolRefId());
            System.out.println("schoolYear: " + calendar.getSchoolYear());
			System.out.println("##### BEGIN SESSIONLIST #####");
            for(XSessionType sl : calendar.getSessions().getSessionList())
            {
                System.out.println("sessionType: " + sl.getSessionType());
                System.out.println("sessionCode: " + sl.getSessionCode());
                System.out.println("description: " + sl.getDescription());
                System.out.println("markingTerm: " + sl.isMarkingTerm());
                System.out.println("schedulingTerm: " + sl.isSchedulingTerm());
                System.out.println("linkedSessionCode: " + sl.getSessionCode());
                System.out.println("startDate: " + sl.getStartDate());
                System.out.println("endDate: " + sl.getEndDate());
            }
			System.out.println("##### END SESSIONLIST #####");
            System.out.println("========================================");
        }
    }
    
    // #################### xCourses ####################
    //RETURN ALL COURSES
    public static void XCourses_GetXCourses(RicOneApiClient ricOne)
    {
        for(XCourseType course : ricOne.sifXpress.GetXCourses())
        {
            System.out.println("refId: " + course.getRefId());
            System.out.println("schoolRefId: " + course.getSchoolRefId());
            System.out.println("schoolCourseId: " + course.getSchoolCourseId());
            System.out.println("leaCourseId: " + course.getLeaCourseId());
			System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherCourseIdType id : course.getOtherIds().getOtherId())
            {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
			System.out.println("##### END OTHERIDS #####");
            System.out.println("courseTitle: " + course.getCourseTitle());
            System.out.println("description: " + course.getDescription());
            System.out.println("subject: " + course.getSubject());
			System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
            for(String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
            {
                System.out.println("applicableEducationLevel: " + ael);
            }
			System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
            System.out.println("scedCourseCode: " + course.getScedCourseCode());
            System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
            System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());

            System.out.println("========================================");
        }
    }
    //RETURN SINGLE COURSE
    public static void XCourses_GetXCourse(RicOneApiClient ricOne)
    {
    	XCourseType course = ricOne.sifXpress.GetXCourse(refId);
    	
    	System.out.println("refId: " + course.getRefId());
        System.out.println("schoolRefId: " + course.getSchoolRefId());
        System.out.println("schoolCourseId: " + course.getSchoolCourseId());
        System.out.println("leaCourseId: " + course.getLeaCourseId());
		System.out.println("##### BEGIN OTHERIDS #####");
        for(XOtherCourseIdType id : course.getOtherIds().getOtherId())
        {
            System.out.println("otherId id" + id.getId());
            System.out.println("type: " + id.getType());
        }
		System.out.println("##### END OTHERIDS #####");
        System.out.println("courseTitle: " + course.getCourseTitle());
        System.out.println("description: " + course.getDescription());
        System.out.println("subject: " + course.getSubject());
		System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
        for(String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
        {
            System.out.println("applicableEducationLevel: " + ael);
        }
		System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
        System.out.println("scedCourseCode: " + course.getScedCourseCode());
        System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
        System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());

        System.out.println("========================================");
    }
    //RETURN COURSES BY LEA
    public static void XCourses_GetXCoursesByXLea(RicOneApiClient ricOne)
    {
        for (XCourseType course : ricOne.sifXpress.GetXCoursesByXLea(refId))
        {
        	System.out.println("refId: " + course.getRefId());
            System.out.println("schoolRefId: " + course.getSchoolRefId());
            System.out.println("schoolCourseId: " + course.getSchoolCourseId());
            System.out.println("leaCourseId: " + course.getLeaCourseId());
			System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherCourseIdType id : course.getOtherIds().getOtherId())
            {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
			System.out.println("##### END OTHERIDS #####");
            System.out.println("courseTitle: " + course.getCourseTitle());
            System.out.println("description: " + course.getDescription());
            System.out.println("subject: " + course.getSubject());
			System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
            for(String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
            {
                System.out.println("applicableEducationLevel: " + ael);
            }
			System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
            System.out.println("scedCourseCode: " + course.getScedCourseCode());
            System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
            System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());

            System.out.println("========================================");
        }
    }
    //RETURN COURSES BY School
    public static void XCourses_GetXCoursesByXSchool(RicOneApiClient ricOne)
    {
        for (XCourseType course : ricOne.sifXpress.GetXCoursesByXSchool(refId))
        {
        	System.out.println("refId: " + course.getRefId());
            System.out.println("schoolRefId: " + course.getSchoolRefId());
            System.out.println("schoolCourseId: " + course.getSchoolCourseId());
            System.out.println("leaCourseId: " + course.getLeaCourseId());
			System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherCourseIdType id : course.getOtherIds().getOtherId())
            {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
			System.out.println("##### END OTHERIDS #####");
            System.out.println("courseTitle: " + course.getCourseTitle());
            System.out.println("description: " + course.getDescription());
            System.out.println("subject: " + course.getSubject());
			System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
            for(String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
            {
                System.out.println("applicableEducationLevel: " + ael);
            }
			System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
            System.out.println("scedCourseCode: " + course.getScedCourseCode());
            System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
            System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());

            System.out.println("========================================");
        }
    }
    //RETURN COURSES BY ROSTER
    public static void XCourses_GetXCoursesByXRoster(RicOneApiClient ricOne)
    {
        for (XCourseType course : ricOne.sifXpress.GetXCoursesByXRoster(refId))
        {
        	System.out.println("refId: " + course.getRefId());
            System.out.println("schoolRefId: " + course.getSchoolRefId());
            System.out.println("schoolCourseId: " + course.getSchoolCourseId());
            System.out.println("leaCourseId: " + course.getLeaCourseId());
			System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherCourseIdType id : course.getOtherIds().getOtherId())
            {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
			System.out.println("##### END OTHERIDS #####");
            System.out.println("courseTitle: " + course.getCourseTitle());
            System.out.println("description: " + course.getDescription());
            System.out.println("subject: " + course.getSubject());
			System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
            for(String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
            {
                System.out.println("applicableEducationLevel: " + ael);
            }
			System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
            System.out.println("scedCourseCode: " + course.getScedCourseCode());
            System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
            System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());

            System.out.println("========================================");
        }
    }
 	
    // #################### xRosters ####################
    //RETURN ALL ROSTERS
    public static void XRosters_GetXRosters(RicOneApiClient ricOne)
    {
        for(XRosterType r : ricOne.sifXpress.GetXRosters())
        {
            System.out.println("refId: " + r.getRefId());
            System.out.println("courseRefId: " + r.getCourseRefId());
            System.out.println("courseTitle: " + r.getCourseTitle());
            System.out.println("sectionRefId: " + r.getSectionRefId());
            System.out.println("subject: " + r.getSubject());
            System.out.println("schoolRefId: " + r.getSchoolRefId());
            System.out.println("schoolSectionId: " + r.getSchoolSectionId());
            System.out.println("schoolYear: " + r.getSchoolYear());
            System.out.println("sessionCode: " + r.getSessionCode());
            System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
            
            System.out.println("##### BEGIN MEETING TIMES #####");
            for(XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
            {
                System.out.println("timeTableDay: " + mt.getTimeTableDay());

                System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                System.out.println("roomNumber: " + mt.getRoomNumber());
                System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                System.out.println("classEndingTime: " + mt.getClassEndingTime());
            }
            System.out.println("##### END MEETING TIMES #####");
            
            System.out.println("##### BEGIN STUDENTS #####");
            for(XPersonReferenceType student : r.getStudents().getStudentReference())
            {
                System.out.println("refId: " + student.getRefId());
                System.out.println("localId: " + student.getLocalId());
                System.out.println("givenName: " + student.getGivenName());
                System.out.println("familyName: " + student.getFamilyName());
            }
            System.out.println("##### END STUDENTS #####");
            
            System.out.println("##### BEGIN PRIMARY STAFF #####");
            System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
            System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
            System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
            System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
            System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
            System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
            System.out.println("##### END PRIMARY STAFF #####");

            System.out.println("##### BEGIN OTHER STAFF #####");
            for(XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
            {
                System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
                System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
                System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
                System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
                System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
                System.out.println("percentResponsible: " + staff.getPercentResponsible());
            }
            System.out.println("##### END OTHER STAFF #####");
            System.out.println("========================================");
        }

    }
    //RETURN SINGLE ROSTER
    public static void XRosters_GetXRoster(RicOneApiClient ricOne)
    {
        XRosterType r = ricOne.sifXpress.GetXRoster(refId);

        System.out.println("refId: " + r.getRefId());
        System.out.println("courseRefId: " + r.getCourseRefId());
        System.out.println("courseTitle: " + r.getCourseTitle());
        System.out.println("sectionRefId: " + r.getSectionRefId());
        System.out.println("subject: " + r.getSubject());
        System.out.println("schoolRefId: " + r.getSchoolRefId());
        System.out.println("schoolSectionId: " + r.getSchoolSectionId());
        System.out.println("schoolYear: " + r.getSchoolYear());
        System.out.println("sessionCode: " + r.getSessionCode());
        System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
        
        System.out.println("##### BEGIN MEETING TIMES #####");
        for(XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
        {
            System.out.println("timeTableDay: " + mt.getTimeTableDay());

            System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
            System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
            System.out.println("roomNumber: " + mt.getRoomNumber());
            System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
            System.out.println("classEndingTime: " + mt.getClassEndingTime());
        }
        System.out.println("##### END MEETING TIMES #####");
        
        System.out.println("##### BEGIN STUDENTS #####");
        for(XPersonReferenceType student : r.getStudents().getStudentReference())
        {
            System.out.println("refId: " + student.getRefId());
            System.out.println("localId: " + student.getLocalId());
            System.out.println("givenName: " + student.getGivenName());
            System.out.println("familyName: " + student.getFamilyName());
        }
        System.out.println("##### END STUDENTS #####");
        
        System.out.println("##### BEGIN PRIMARY STAFF #####");
        System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
        System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
        System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
        System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
        System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
        System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
        System.out.println("##### END PRIMARY STAFF #####");

        System.out.println("##### BEGIN OTHER STAFF #####");
        for(XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
        {
            System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
            System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
            System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
            System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
            System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
            System.out.println("percentResponsible: " + staff.getPercentResponsible());
        }
        System.out.println("##### END OTHER STAFF #####");
        System.out.println("========================================");
    }
    //RETURN ROSTERS BY LEA
    public static void XRosters_GetXRostersByXLea(RicOneApiClient ricOne)
    {
        for (XRosterType r : ricOne.sifXpress.GetXRostersByXLea(refId))
        {
        	System.out.println("refId: " + r.getRefId());
            System.out.println("courseRefId: " + r.getCourseRefId());
            System.out.println("courseTitle: " + r.getCourseTitle());
            System.out.println("sectionRefId: " + r.getSectionRefId());
            System.out.println("subject: " + r.getSubject());
            System.out.println("schoolRefId: " + r.getSchoolRefId());
            System.out.println("schoolSectionId: " + r.getSchoolSectionId());
            System.out.println("schoolYear: " + r.getSchoolYear());
            System.out.println("sessionCode: " + r.getSessionCode());
            System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
            
            System.out.println("##### BEGIN MEETING TIMES #####");
            for(XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
            {
                System.out.println("timeTableDay: " + mt.getTimeTableDay());

                System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                System.out.println("roomNumber: " + mt.getRoomNumber());
                System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                System.out.println("classEndingTime: " + mt.getClassEndingTime());
            }
            System.out.println("##### END MEETING TIMES #####");
            
            System.out.println("##### BEGIN STUDENTS #####");
            for(XPersonReferenceType student : r.getStudents().getStudentReference())
            {
                System.out.println("refId: " + student.getRefId());
                System.out.println("localId: " + student.getLocalId());
                System.out.println("givenName: " + student.getGivenName());
                System.out.println("familyName: " + student.getFamilyName());
            }
            System.out.println("##### END STUDENTS #####");
            
            System.out.println("##### BEGIN PRIMARY STAFF #####");
            System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
            System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
            System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
            System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
            System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
            System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
            System.out.println("##### END PRIMARY STAFF #####");

            System.out.println("##### BEGIN OTHER STAFF #####");
            for(XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
            {
                System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
                System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
                System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
                System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
                System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
                System.out.println("percentResponsible: " + staff.getPercentResponsible());
            }
            System.out.println("##### END OTHER STAFF #####");
            System.out.println("========================================");
        }
    }
    //RETURN ROSTERS BY SCHOOL
    public static void XRosters_GetXRostersByXSchool(RicOneApiClient ricOne)
    {
        for (XRosterType r : ricOne.sifXpress.GetXRostersByXSchool(refId))
        {
        	System.out.println("refId: " + r.getRefId());
            System.out.println("courseRefId: " + r.getCourseRefId());
            System.out.println("courseTitle: " + r.getCourseTitle());
            System.out.println("sectionRefId: " + r.getSectionRefId());
            System.out.println("subject: " + r.getSubject());
            System.out.println("schoolRefId: " + r.getSchoolRefId());
            System.out.println("schoolSectionId: " + r.getSchoolSectionId());
            System.out.println("schoolYear: " + r.getSchoolYear());
            System.out.println("sessionCode: " + r.getSessionCode());
            System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
            
            System.out.println("##### BEGIN MEETING TIMES #####");
            for(XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
            {
                System.out.println("timeTableDay: " + mt.getTimeTableDay());

                System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                System.out.println("roomNumber: " + mt.getRoomNumber());
                System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                System.out.println("classEndingTime: " + mt.getClassEndingTime());
            }
            System.out.println("##### END MEETING TIMES #####");
            
            System.out.println("##### BEGIN STUDENTS #####");
            for(XPersonReferenceType student : r.getStudents().getStudentReference())
            {
                System.out.println("refId: " + student.getRefId());
                System.out.println("localId: " + student.getLocalId());
                System.out.println("givenName: " + student.getGivenName());
                System.out.println("familyName: " + student.getFamilyName());
            }
            System.out.println("##### END STUDENTS #####");
            
            System.out.println("##### BEGIN PRIMARY STAFF #####");
            System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
            System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
            System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
            System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
            System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
            System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
            System.out.println("##### END PRIMARY STAFF #####");

            System.out.println("##### BEGIN OTHER STAFF #####");
            for(XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
            {
                System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
                System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
                System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
                System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
                System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
                System.out.println("percentResponsible: " + staff.getPercentResponsible());
            }
            System.out.println("##### END OTHER STAFF #####");
            System.out.println("========================================");
        }
    }
    //RETURN ROSTERS BY CROUSE
    public static void XRosters_GetXRostersByXCourse(RicOneApiClient ricOne)
    {
        for (XRosterType r : ricOne.sifXpress.GetXRostersByXCourse(refId))
        {
        	System.out.println("refId: " + r.getRefId());
            System.out.println("courseRefId: " + r.getCourseRefId());
            System.out.println("courseTitle: " + r.getCourseTitle());
            System.out.println("sectionRefId: " + r.getSectionRefId());
            System.out.println("subject: " + r.getSubject());
            System.out.println("schoolRefId: " + r.getSchoolRefId());
            System.out.println("schoolSectionId: " + r.getSchoolSectionId());
            System.out.println("schoolYear: " + r.getSchoolYear());
            System.out.println("sessionCode: " + r.getSessionCode());
            System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
            
            System.out.println("##### BEGIN MEETING TIMES #####");
            for(XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
            {
                System.out.println("timeTableDay: " + mt.getTimeTableDay());

                System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                System.out.println("roomNumber: " + mt.getRoomNumber());
                System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                System.out.println("classEndingTime: " + mt.getClassEndingTime());
            }
            System.out.println("##### END MEETING TIMES #####");
            
            System.out.println("##### BEGIN STUDENTS #####");
            for(XPersonReferenceType student : r.getStudents().getStudentReference())
            {
                System.out.println("refId: " + student.getRefId());
                System.out.println("localId: " + student.getLocalId());
                System.out.println("givenName: " + student.getGivenName());
                System.out.println("familyName: " + student.getFamilyName());
            }
            System.out.println("##### END STUDENTS #####");
            
            System.out.println("##### BEGIN PRIMARY STAFF #####");
            System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
            System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
            System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
            System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
            System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
            System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
            System.out.println("##### END PRIMARY STAFF #####");

            System.out.println("##### BEGIN OTHER STAFF #####");
            for(XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
            {
                System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
                System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
                System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
                System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
                System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
                System.out.println("percentResponsible: " + staff.getPercentResponsible());
            }
            System.out.println("##### END OTHER STAFF #####");
            System.out.println("========================================");
        }
    }
    //RETURN ROSTERS BY STAFF
    public static void XRosters_GetXRostersByXStaff(RicOneApiClient ricOne)
    {
        for (XRosterType r : ricOne.sifXpress.GetXRostersByXStaff(refId))
        {
        	System.out.println("refId: " + r.getRefId());
            System.out.println("courseRefId: " + r.getCourseRefId());
            System.out.println("courseTitle: " + r.getCourseTitle());
            System.out.println("sectionRefId: " + r.getSectionRefId());
            System.out.println("subject: " + r.getSubject());
            System.out.println("schoolRefId: " + r.getSchoolRefId());
            System.out.println("schoolSectionId: " + r.getSchoolSectionId());
            System.out.println("schoolYear: " + r.getSchoolYear());
            System.out.println("sessionCode: " + r.getSessionCode());
            System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
            
            System.out.println("##### BEGIN MEETING TIMES #####");
            for(XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
            {
                System.out.println("timeTableDay: " + mt.getTimeTableDay());

                System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                System.out.println("roomNumber: " + mt.getRoomNumber());
                System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                System.out.println("classEndingTime: " + mt.getClassEndingTime());
            }
            System.out.println("##### END MEETING TIMES #####");
            
            System.out.println("##### BEGIN STUDENTS #####");
            for(XPersonReferenceType student : r.getStudents().getStudentReference())
            {
                System.out.println("refId: " + student.getRefId());
                System.out.println("localId: " + student.getLocalId());
                System.out.println("givenName: " + student.getGivenName());
                System.out.println("familyName: " + student.getFamilyName());
            }
            System.out.println("##### END STUDENTS #####");
            
            System.out.println("##### BEGIN PRIMARY STAFF #####");
            System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
            System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
            System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
            System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
            System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
            System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
            System.out.println("##### END PRIMARY STAFF #####");

            System.out.println("##### BEGIN OTHER STAFF #####");
            for(XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
            {
                System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
                System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
                System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
                System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
                System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
                System.out.println("percentResponsible: " + staff.getPercentResponsible());
            }
            System.out.println("##### END OTHER STAFF #####");
            System.out.println("========================================");
        }
    }
    //RETURN ROSTERS BY STUDENT
    public static void XRosters_GetXRostersByXStudent(RicOneApiClient ricOne)
    {
        for (XRosterType r : ricOne.sifXpress.GetXRostersByXStudent(refId))
        {
        	System.out.println("refId: " + r.getRefId());
            System.out.println("courseRefId: " + r.getCourseRefId());
            System.out.println("courseTitle: " + r.getCourseTitle());
            System.out.println("sectionRefId: " + r.getSectionRefId());
            System.out.println("subject: " + r.getSubject());
            System.out.println("schoolRefId: " + r.getSchoolRefId());
            System.out.println("schoolSectionId: " + r.getSchoolSectionId());
            System.out.println("schoolYear: " + r.getSchoolYear());
            System.out.println("sessionCode: " + r.getSessionCode());
            System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
            
            System.out.println("##### BEGIN MEETING TIMES #####");
            for(XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
            {
                System.out.println("timeTableDay: " + mt.getTimeTableDay());

                System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                System.out.println("roomNumber: " + mt.getRoomNumber());
                System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                System.out.println("classEndingTime: " + mt.getClassEndingTime());
            }
            System.out.println("##### END MEETING TIMES #####");
            
            System.out.println("##### BEGIN STUDENTS #####");
            for(XPersonReferenceType student : r.getStudents().getStudentReference())
            {
                System.out.println("refId: " + student.getRefId());
                System.out.println("localId: " + student.getLocalId());
                System.out.println("givenName: " + student.getGivenName());
                System.out.println("familyName: " + student.getFamilyName());
            }
            System.out.println("##### END STUDENTS #####");
            
            System.out.println("##### BEGIN PRIMARY STAFF #####");
            System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
            System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
            System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
            System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
            System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
            System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
            System.out.println("##### END PRIMARY STAFF #####");

            System.out.println("##### BEGIN OTHER STAFF #####");
            for(XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
            {
                System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
                System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
                System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
                System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
                System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
                System.out.println("percentResponsible: " + staff.getPercentResponsible());
            }
            System.out.println("##### END OTHER STAFF #####");
            System.out.println("========================================");
        }
    }
 	
    // #################### xStaffs ####################
    //RETURN ALL STAFFS
    public static void XStaffs_GetXStaffs(RicOneApiClient ricOne)
    {
        for(XStaffType s : ricOne.sifXpress.GetXStaffs())
        {
            System.out.println("refId: " + s.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + s.getName().getType());
            System.out.println("prefix: " + s.getName().getPrefix());
            System.out.println("familyName: " + s.getName().getFamilyName());
            System.out.println("givenName: " + s.getName().getGivenName());
            System.out.println("middleName: " + s.getName().getMiddleName());
            System.out.println("suffix: " + s.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("localId: " + s.getLocalId());
            System.out.println("loginId: " + s.getLoginId());
            System.out.println("stateProvinceId: " + s.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("sex: " + s.getSex());
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + s.getEmail().getEmailType());
            System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
            System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
            System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
            System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
            System.out.println("##### END PRIMARYASSIGNMENT #####");
            System.out.println("##### BEGIN OTHERASSIGNMENT #####");
            for(XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
            {
                System.out.println("leaRefId: " + pa.getLeaRefId());
                System.out.println("schoolRefId: " + pa.getSchoolRefId());
                System.out.println("jobFunction: " + pa.getJobFunction());
            }
            System.out.println("##### END OTHERASSIGNMENT #####");
            System.out.println("========================================");
        }
    }
    //RETURN SINGLE STAFF
    public static void XStaffs_GetXStaff(RicOneApiClient ricOne)
    {
        XStaffType s = ricOne.sifXpress.GetXStaff(refId);

        System.out.println("refId: " + s.getRefId());
        System.out.println("##### BEGIN NAME #####");
        System.out.println("type: " + s.getName().getType());
        System.out.println("prefix: " + s.getName().getPrefix());
        System.out.println("familyName: " + s.getName().getFamilyName());
        System.out.println("givenName: " + s.getName().getGivenName());
        System.out.println("middleName: " + s.getName().getMiddleName());
        System.out.println("suffix: " + s.getName().getSuffix());
        System.out.println("##### END NAME #####");
        System.out.println("localId: " + s.getLocalId());
        System.out.println("loginId: " + s.getLoginId());
        System.out.println("stateProvinceId: " + s.getStateProvinceId());
        System.out.println("##### BEGIN OTHERIDS #####");
        for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
        {
            System.out.println("id: " + id.getId());
            System.out.println("type: " + id.getType());
        }
        System.out.println("##### END OTHERIDS #####");
        System.out.println("sex: " + s.getSex());
        System.out.println("##### BEGIN EMAIL #####");
        System.out.println("emailType: " + s.getEmail().getEmailType());
        System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
        System.out.println("##### END EMAIL #####");
        System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
        System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
        System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
        System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
        System.out.println("##### END PRIMARYASSIGNMENT #####");
        System.out.println("##### BEGIN OTHERASSIGNMENT #####");
        for(XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
        {
            System.out.println("leaRefId: " + pa.getLeaRefId());
            System.out.println("schoolRefId: " + pa.getSchoolRefId());
            System.out.println("jobFunction: " + pa.getJobFunction());
        }
        System.out.println("##### END OTHERASSIGNMENT #####");
        System.out.println("========================================");
    }
    //RETURN STAFFS BY LEA
    public static void XStaffs_GetXStaffsByXLea(RicOneApiClient ricOne)
    {
        for(XStaffType s : ricOne.sifXpress.GetXStaffsByXLea(refId))
        {
        	System.out.println("refId: " + s.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + s.getName().getType());
            System.out.println("prefix: " + s.getName().getPrefix());
            System.out.println("familyName: " + s.getName().getFamilyName());
            System.out.println("givenName: " + s.getName().getGivenName());
            System.out.println("middleName: " + s.getName().getMiddleName());
            System.out.println("suffix: " + s.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("localId: " + s.getLocalId());
            System.out.println("loginId: " + s.getLoginId());
            System.out.println("stateProvinceId: " + s.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("sex: " + s.getSex());
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + s.getEmail().getEmailType());
            System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
            System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
            System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
            System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
            System.out.println("##### END PRIMARYASSIGNMENT #####");
            System.out.println("##### BEGIN OTHERASSIGNMENT #####");
            for(XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
            {
                System.out.println("leaRefId: " + pa.getLeaRefId());
                System.out.println("schoolRefId: " + pa.getSchoolRefId());
                System.out.println("jobFunction: " + pa.getJobFunction());
            }
            System.out.println("##### END OTHERASSIGNMENT #####");
            System.out.println("========================================");
        }
    }
    //RETURN STAFFS BY SCHOOL
    public static void XStaffs_GetXStaffsByXSchool(RicOneApiClient ricOne)
    {
        for(XStaffType s : ricOne.sifXpress.GetXStaffsByXSchool(refId))
        {
        	System.out.println("refId: " + s.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + s.getName().getType());
            System.out.println("prefix: " + s.getName().getPrefix());
            System.out.println("familyName: " + s.getName().getFamilyName());
            System.out.println("givenName: " + s.getName().getGivenName());
            System.out.println("middleName: " + s.getName().getMiddleName());
            System.out.println("suffix: " + s.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("localId: " + s.getLocalId());
            System.out.println("loginId: " + s.getLoginId());
            System.out.println("stateProvinceId: " + s.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("sex: " + s.getSex());
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + s.getEmail().getEmailType());
            System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
            System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
            System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
            System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
            System.out.println("##### END PRIMARYASSIGNMENT #####");
            System.out.println("##### BEGIN OTHERASSIGNMENT #####");
            for(XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
            {
                System.out.println("leaRefId: " + pa.getLeaRefId());
                System.out.println("schoolRefId: " + pa.getSchoolRefId());
                System.out.println("jobFunction: " + pa.getJobFunction());
            }
            System.out.println("##### END OTHERASSIGNMENT #####");
            System.out.println("========================================");
        }
    }
    //RETURN STAFFS BY COURSE
    public static void XStaffs_GetXStaffsByXCourse(RicOneApiClient ricOne)
    {
        for(XStaffType s : ricOne.sifXpress.GetXStaffsByXCourse(refId))
        {
        	System.out.println("refId: " + s.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + s.getName().getType());
            System.out.println("prefix: " + s.getName().getPrefix());
            System.out.println("familyName: " + s.getName().getFamilyName());
            System.out.println("givenName: " + s.getName().getGivenName());
            System.out.println("middleName: " + s.getName().getMiddleName());
            System.out.println("suffix: " + s.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("localId: " + s.getLocalId());
            System.out.println("loginId: " + s.getLoginId());
            System.out.println("stateProvinceId: " + s.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("sex: " + s.getSex());
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + s.getEmail().getEmailType());
            System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
            System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
            System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
            System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
            System.out.println("##### END PRIMARYASSIGNMENT #####");
            System.out.println("##### BEGIN OTHERASSIGNMENT #####");
            for(XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
            {
                System.out.println("leaRefId: " + pa.getLeaRefId());
                System.out.println("schoolRefId: " + pa.getSchoolRefId());
                System.out.println("jobFunction: " + pa.getJobFunction());
            }
            System.out.println("##### END OTHERASSIGNMENT #####");
            System.out.println("========================================");
        }
    }
    //RETURN STAFFS BY ROSTER
    public static void XStaffs_GetXStaffsByXRoster(RicOneApiClient ricOne)
    {
    	 for(XStaffType s : ricOne.sifXpress.GetXStaffsByXRoster(refId))
         {
         	System.out.println("refId: " + s.getRefId());
             System.out.println("##### BEGIN NAME #####");
             System.out.println("type: " + s.getName().getType());
             System.out.println("prefix: " + s.getName().getPrefix());
             System.out.println("familyName: " + s.getName().getFamilyName());
             System.out.println("givenName: " + s.getName().getGivenName());
             System.out.println("middleName: " + s.getName().getMiddleName());
             System.out.println("suffix: " + s.getName().getSuffix());
             System.out.println("##### END NAME #####");
             System.out.println("localId: " + s.getLocalId());
             System.out.println("loginId: " + s.getLoginId());
             System.out.println("stateProvinceId: " + s.getStateProvinceId());
             System.out.println("##### BEGIN OTHERIDS #####");
             for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
             {
                 System.out.println("id: " + id.getId());
                 System.out.println("type: " + id.getType());
             }
             System.out.println("##### END OTHERIDS #####");
             System.out.println("sex: " + s.getSex());
             System.out.println("##### BEGIN EMAIL #####");
             System.out.println("emailType: " + s.getEmail().getEmailType());
             System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
             System.out.println("##### END EMAIL #####");
             System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
             System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
             System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
             System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
             System.out.println("##### END PRIMARYASSIGNMENT #####");
             System.out.println("##### BEGIN OTHERASSIGNMENT #####");
             for(XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
             {
                 System.out.println("leaRefId: " + pa.getLeaRefId());
                 System.out.println("schoolRefId: " + pa.getSchoolRefId());
                 System.out.println("jobFunction: " + pa.getJobFunction());
             }
             System.out.println("##### END OTHERASSIGNMENT #####");
             System.out.println("========================================");
         }
    }
  //RETURN STAFFS BY ROSTER
    public static void XStaffs_GetXStaffsByXStudent(RicOneApiClient ricOne)
    {
    	 for(XStaffType s : ricOne.sifXpress.GetXStaffsByXStudent(refId))
         {
         	System.out.println("refId: " + s.getRefId());
             System.out.println("##### BEGIN NAME #####");
             System.out.println("type: " + s.getName().getType());
             System.out.println("prefix: " + s.getName().getPrefix());
             System.out.println("familyName: " + s.getName().getFamilyName());
             System.out.println("givenName: " + s.getName().getGivenName());
             System.out.println("middleName: " + s.getName().getMiddleName());
             System.out.println("suffix: " + s.getName().getSuffix());
             System.out.println("##### END NAME #####");
             System.out.println("localId: " + s.getLocalId());
             System.out.println("loginId: " + s.getLoginId());
             System.out.println("stateProvinceId: " + s.getStateProvinceId());
             System.out.println("##### BEGIN OTHERIDS #####");
             for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
             {
                 System.out.println("id: " + id.getId());
                 System.out.println("type: " + id.getType());
             }
             System.out.println("##### END OTHERIDS #####");
             System.out.println("sex: " + s.getSex());
             System.out.println("##### BEGIN EMAIL #####");
             System.out.println("emailType: " + s.getEmail().getEmailType());
             System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
             System.out.println("##### END EMAIL #####");
             System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
             System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
             System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
             System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
             System.out.println("##### END PRIMARYASSIGNMENT #####");
             System.out.println("##### BEGIN OTHERASSIGNMENT #####");
             for(XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
             {
                 System.out.println("leaRefId: " + pa.getLeaRefId());
                 System.out.println("schoolRefId: " + pa.getSchoolRefId());
                 System.out.println("jobFunction: " + pa.getJobFunction());
             }
             System.out.println("##### END OTHERASSIGNMENT #####");
             System.out.println("========================================");
         }
    }
 	// #################### xStudents ####################
    //RETURN ALL STUDENTS
    public static void XStudents_GetXStudents(RicOneApiClient ricOne)
    { 
        for(XStudentType s : ricOne.sifXpress.GetXStudents())
        {
            System.out.println("refId: " + s.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + s.getName().getType());
            System.out.println("prefix: " + s.getName().getPrefix());
            System.out.println("familyName: " + s.getName().getFamilyName());
            System.out.println("givenName: " + s.getName().getGivenName());
            System.out.println("middleName: " + s.getName().getMiddleName());
            System.out.println("suffix: " + s.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("##### BEGIN OTHERNAME #####");
            for(XPersonNameType n : s.getOtherNames().getName())
            {
                System.out.println("type: " + n.getType());
                System.out.println("prefix: " + n.getPrefix());
                System.out.println("familyName: " + n.getFamilyName());
                System.out.println("givenName: " + n.getGivenName());
                System.out.println("middleName: " + n.getMiddleName());
                System.out.println("suffix: " + n.getSuffix());
            }
            System.out.println("##### END OTHERNAME #####");

            System.out.println("localId: " + s.getLocalId());
            System.out.println("loginId: " + s.getLoginId());
            System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + s.getAddress().getAddressType());
            System.out.println("city: " + s.getAddress().getCity());
            System.out.println("line1: " + s.getAddress().getLine1());
            System.out.println("line2: " + s.getAddress().getLine2());
            System.out.println("countryCode: " + s.getAddress().getCountryCode());
            System.out.println("postalCode: " + s.getAddress().getPostalCode());
            System.out.println("stateProvince: " + s.getAddress().getStateProvince());
            System.out.println("number: " + s.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBERS #####");
            System.out.println("number: " + s.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBERS #####");
            System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
            for(XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBERS #####");
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + s.getEmail().getEmailType());
            System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN OTHEREMAILS #####");
            for(XEmailType e : s.getOtherEmails().getEmail())
            {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println("##### BEGIN DEMOGRAPHICS #####");
            System.out.println("##### BEGIN RACES #####");
            for(XRaceType r : s.getDemographics().getRaces().getRace())
            {
                System.out.println("race: " + r.getRace());
            }
            System.out.println("##### END RACES #####");
            System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
            System.out.println("sex: " + s.getDemographics().getSex());
            System.out.println("birthDate: " + s.getDemographics().getBirthDate());
            System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
            System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
            System.out.println("##### END DEMOGRAPHICS #####");
            System.out.println("##### BEGIN ENROLLMENT #####");
            System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
            System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
            System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
            System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
            System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
            System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
            System.out.println("exitDate: " + s.getEnrollment().getExitDate());
            System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
            System.out.println("##### BEGIN HOMEROOMTEACHER #####");
            System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
            System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
            System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
            System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
            System.out.println("##### END HOMEROOMTEACHER #####");
            System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
            System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
            System.out.println("##### BEGIN COUNSELOR #####");
            System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
            System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
            System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
            System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
            System.out.println("##### END COUNSELOR #####");
            System.out.println("##### END ENROLLMENT #####");
            System.out.println("##### BEGIN OTHERENROLLMENT #####");
            for(XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
            {  
                System.out.println("leaRefId: " + e.getLeaRefId());
                System.out.println("schoolRefId: " + e.getSchoolRefId());
                System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                System.out.println("membershipType: " + e.getMembershipType());
                System.out.println("entryDate: " + e.getEntryDate());
                System.out.println("exitDate: " + e.getExitDate());
                System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
                System.out.println("##### BEGIN HOMEROOMTEACHER #####");
                System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
                System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
                System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
                System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
                System.out.println("##### END HOMEROOMTEACHER #####");
                System.out.println("gradeLevel: " + e.getGradeLevel());
                System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
                System.out.println("##### BEGIN COUNSELOR #####");
                System.out.println("refId: " + e.getCounselor().getRefId());
                System.out.println("localId: " + e.getCounselor().getLocalId());
                System.out.println("givenName: " + e.getCounselor().getGivenName());
                System.out.println("familyName: " + e.getCounselor().getFamilyName());
                System.out.println("##### END COUNSELOR #####"); 
            }
            System.out.println("##### END OTHERENROLLMENT #####");
            System.out.println("##### BEGIN ACADEMICSUMMARY #####");
            System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
            System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
            System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
            System.out.println("##### END ACADEMICSUMMARY #####");
            System.out.println("##### BEGIN STUDENTCONTACTS #####");
            for(String contactRefid : s.getStudentContacts().getContactPersonRefId())
            {
                System.out.println("contactPersonRefId: " + contactRefid);
            }
            for(XContactType c : s.getStudentContacts().getXContact())
            {
                System.out.println("##### BEGIN NAME #####");
                System.out.println("type: " + c.getName().getType());
                System.out.println("prefix: " + c.getName().getPrefix());
                System.out.println("familyName: " + c.getName().getFamilyName());
                System.out.println("givenName: " + c.getName().getGivenName());
                System.out.println("middleName: " + c.getName().getMiddleName());
                System.out.println("suffix: " + c.getName().getSuffix());
                System.out.println("##### END NAME #####");
                System.out.println("##### BEGIN OTHERNAME #####");
                for(XPersonNameType n : c.getOtherNames().getName())
                {
                    System.out.println("type: " + n.getType());
                    System.out.println("prefix: " + n.getPrefix());
                    System.out.println("familyName: " + n.getFamilyName());
                    System.out.println("givenName: " + n.getGivenName());
                    System.out.println("middleName: " + n.getMiddleName());
                    System.out.println("suffix: " + n.getSuffix());
                }
                System.out.println("##### END OTHERNAME #####");
                System.out.println(": " + c.getLocalId());
                System.out.println(": " + c.getLoginId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for(XOtherPersonIdType id : c.getOtherIds().getOtherId())
                {
                    System.out.println("id: " + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("##### BEGIN ADDRESS #####");
                System.out.println("addressType: " + c.getAddress().getAddressType());
                System.out.println("city: " + c.getAddress().getCity());
                System.out.println("line1: " + c.getAddress().getLine1());
                System.out.println("line2: " + c.getAddress().getLine2());
                System.out.println("countryCode: " + c.getAddress().getCountryCode());
                System.out.println("postalCode: " + c.getAddress().getPostalCode());
                System.out.println("stateProvince: " + c.getAddress().getStateProvince());
                System.out.println("number: " + c.getPhoneNumber().getNumber());
                System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
                System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
                System.out.println("##### END ADDRESS #####");
                System.out.println("##### BEGIN PHONENUMBERS #####");
                System.out.println("number: " + c.getPhoneNumber().getNumber());
                System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
                System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
                System.out.println("##### END PHONENUMBERS #####");
                System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
                for(XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
                {
                    System.out.println("otherPhoneNumbers number: " + p.getNumber());
                    System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                    System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
                }
                System.out.println("##### END OTHERPHONENUMBERS #####");
                System.out.println("##### BEGIN EMAIL #####");
                System.out.println("emailType: " + c.getEmail().getEmailType());
                System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
                System.out.println("##### END EMAIL #####");
                System.out.println("##### BEGIN OTHEREMAILS #####");
                for(XEmailType e : c.getOtherEmails().getEmail())
                {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println(": " + c.getSex());
                System.out.println(": " + c.getEmployerType());
                System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                for(XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
                {
                    System.out.println("studentRefId: " + csr.getStudentRefId());
                    System.out.println("relationshipCode: " + csr.getRelationshipCode());
                    System.out.println("restrictions: " + csr.getRestrictions());
                    System.out.println("livesWith: " + csr.isLivesWith());
                    System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
                    System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
                    System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
                    System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
                    System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
                    System.out.println("contactSequence: " + csr.getContactSequence());
                }
                System.out.println("##### END CONTACTRELATIONSHIPS #####");
            }
            System.out.println("##### END STUDENTCONTACTS #####");
            System.out.println("##### BEGIN LANGUAGES #####");
            for(XLanguageType l : s.getLanguages().getLanguage())
            {
                System.out.println("type: " + l.getType());
                System.out.println("code: " + l.getCode());
            }
            System.out.println("##### END LANGUAGES #####");
            System.out.println("========================================");
        }
    }
    //RETURN SINGLE STUDENT
    public static void XStudents_GetXStudent(RicOneApiClient ricOne)
    {
        XStudentType s = ricOne.sifXpress.GetXStudent(refId);

        System.out.println("refId: " + s.getRefId());
        System.out.println("##### BEGIN NAME #####");
        System.out.println("type: " + s.getName().getType());
        System.out.println("prefix: " + s.getName().getPrefix());
        System.out.println("familyName: " + s.getName().getFamilyName());
        System.out.println("givenName: " + s.getName().getGivenName());
        System.out.println("middleName: " + s.getName().getMiddleName());
        System.out.println("suffix: " + s.getName().getSuffix());
        System.out.println("##### END NAME #####");
        System.out.println("##### BEGIN OTHERNAME #####");
        for(XPersonNameType n : s.getOtherNames().getName())
        {
            System.out.println("type: " + n.getType());
            System.out.println("prefix: " + n.getPrefix());
            System.out.println("familyName: " + n.getFamilyName());
            System.out.println("givenName: " + n.getGivenName());
            System.out.println("middleName: " + n.getMiddleName());
            System.out.println("suffix: " + n.getSuffix());
        }
        System.out.println("##### END OTHERNAME #####");

        System.out.println("localId: " + s.getLocalId());
        System.out.println("loginId: " + s.getLoginId());
        System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
        System.out.println("##### BEGIN OTHERIDS #####");
        for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
        {
            System.out.println("id: " + id.getId());
            System.out.println("type: " + id.getType());
        }
        System.out.println("##### END OTHERIDS #####");
        System.out.println("##### BEGIN ADDRESS #####");
        System.out.println("addressType: " + s.getAddress().getAddressType());
        System.out.println("city: " + s.getAddress().getCity());
        System.out.println("line1: " + s.getAddress().getLine1());
        System.out.println("line2: " + s.getAddress().getLine2());
        System.out.println("countryCode: " + s.getAddress().getCountryCode());
        System.out.println("postalCode: " + s.getAddress().getPostalCode());
        System.out.println("stateProvince: " + s.getAddress().getStateProvince());
        System.out.println("number: " + s.getPhoneNumber().getNumber());
        System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
        System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
        System.out.println("##### END ADDRESS #####");
        System.out.println("##### BEGIN PHONENUMBERS #####");
        System.out.println("number: " + s.getPhoneNumber().getNumber());
        System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
        System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
        System.out.println("##### END PHONENUMBERS #####");
        System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
        for(XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
        {
            System.out.println("otherPhoneNumbers number: " + p.getNumber());
            System.out.println("phoneNumberType: " + p.getPhoneNumberType());
            System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
        }
        System.out.println("##### END OTHERPHONENUMBERS #####");
        System.out.println("##### BEGIN EMAIL #####");
        System.out.println("emailType: " + s.getEmail().getEmailType());
        System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
        System.out.println("##### END EMAIL #####");
        System.out.println("##### BEGIN OTHEREMAILS #####");
        for(XEmailType e : s.getOtherEmails().getEmail())
        {
            System.out.println("emailType: " + e.getEmailType());
            System.out.println("emailAddress: " + e.getEmailAddress());
        }
        System.out.println("##### END OTHEREMAILS #####");
        System.out.println("##### BEGIN DEMOGRAPHICS #####");
        System.out.println("##### BEGIN RACES #####");
        for(XRaceType r : s.getDemographics().getRaces().getRace())
        {
            System.out.println("race: " + r.getRace());
        }
        System.out.println("##### END RACES #####");
        System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
        System.out.println("sex: " + s.getDemographics().getSex());
        System.out.println("birthDate: " + s.getDemographics().getBirthDate());
        System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
        System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
        System.out.println("##### END DEMOGRAPHICS #####");
        System.out.println("##### BEGIN ENROLLMENT #####");
        System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
        System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
        System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
        System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
        System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
        System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
        System.out.println("exitDate: " + s.getEnrollment().getExitDate());
        System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
        System.out.println("##### BEGIN HOMEROOMTEACHER #####");
        System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
        System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
        System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
        System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
        System.out.println("##### END HOMEROOMTEACHER #####");
        System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
        System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
        System.out.println("##### BEGIN COUNSELOR #####");
        System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
        System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
        System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
        System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
        System.out.println("##### END COUNSELOR #####");
        System.out.println("##### END ENROLLMENT #####");
        System.out.println("##### BEGIN OTHERENROLLMENT #####");
        for(XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
        {  
            System.out.println("leaRefId: " + e.getLeaRefId());
            System.out.println("schoolRefId: " + e.getSchoolRefId());
            System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
            System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
            System.out.println("membershipType: " + e.getMembershipType());
            System.out.println("entryDate: " + e.getEntryDate());
            System.out.println("exitDate: " + e.getExitDate());
            System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
            System.out.println("##### BEGIN HOMEROOMTEACHER #####");
            System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
            System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
            System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
            System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
            System.out.println("##### END HOMEROOMTEACHER #####");
            System.out.println("gradeLevel: " + e.getGradeLevel());
            System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
            System.out.println("##### BEGIN COUNSELOR #####");
            System.out.println("refId: " + e.getCounselor().getRefId());
            System.out.println("localId: " + e.getCounselor().getLocalId());
            System.out.println("givenName: " + e.getCounselor().getGivenName());
            System.out.println("familyName: " + e.getCounselor().getFamilyName());
            System.out.println("##### END COUNSELOR #####"); 
        }
        System.out.println("##### END OTHERENROLLMENT #####");
        System.out.println("##### BEGIN ACADEMICSUMMARY #####");
        System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
        System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
        System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
        System.out.println("##### END ACADEMICSUMMARY #####");
        System.out.println("##### BEGIN STUDENTCONTACTS #####");
        for(String contactRefid : s.getStudentContacts().getContactPersonRefId())
        {
            System.out.println("contactPersonRefId: " + contactRefid);
        }
        for(XContactType c : s.getStudentContacts().getXContact())
        {
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + c.getName().getType());
            System.out.println("prefix: " + c.getName().getPrefix());
            System.out.println("familyName: " + c.getName().getFamilyName());
            System.out.println("givenName: " + c.getName().getGivenName());
            System.out.println("middleName: " + c.getName().getMiddleName());
            System.out.println("suffix: " + c.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("##### BEGIN OTHERNAME #####");
            for(XPersonNameType n : c.getOtherNames().getName())
            {
                System.out.println("type: " + n.getType());
                System.out.println("prefix: " + n.getPrefix());
                System.out.println("familyName: " + n.getFamilyName());
                System.out.println("givenName: " + n.getGivenName());
                System.out.println("middleName: " + n.getMiddleName());
                System.out.println("suffix: " + n.getSuffix());
            }
            System.out.println("##### END OTHERNAME #####");
            System.out.println(": " + c.getLocalId());
            System.out.println(": " + c.getLoginId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : c.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + c.getAddress().getAddressType());
            System.out.println("city: " + c.getAddress().getCity());
            System.out.println("line1: " + c.getAddress().getLine1());
            System.out.println("line2: " + c.getAddress().getLine2());
            System.out.println("countryCode: " + c.getAddress().getCountryCode());
            System.out.println("postalCode: " + c.getAddress().getPostalCode());
            System.out.println("stateProvince: " + c.getAddress().getStateProvince());
            System.out.println("number: " + c.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBERS #####");
            System.out.println("number: " + c.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBERS #####");
            System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
            for(XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBERS #####");
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + c.getEmail().getEmailType());
            System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN OTHEREMAILS #####");
            for(XEmailType e : c.getOtherEmails().getEmail())
            {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println(": " + c.getSex());
            System.out.println(": " + c.getEmployerType());
            System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
            for(XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
            {
                System.out.println("studentRefId: " + csr.getStudentRefId());
                System.out.println("relationshipCode: " + csr.getRelationshipCode());
                System.out.println("restrictions: " + csr.getRestrictions());
                System.out.println("livesWith: " + csr.isLivesWith());
                System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
                System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
                System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
                System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
                System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
                System.out.println("contactSequence: " + csr.getContactSequence());
            }
            System.out.println("##### END CONTACTRELATIONSHIPS #####");
        }
        System.out.println("##### END STUDENTCONTACTS #####");
        System.out.println("##### BEGIN LANGUAGES #####");
        for(XLanguageType l : s.getLanguages().getLanguage())
        {
            System.out.println("type: " + l.getType());
            System.out.println("code: " + l.getCode());
        }
        System.out.println("##### END LANGUAGES #####");
        System.out.println("========================================");
    }
    //RETURN STUDENTS BY LEA
    public static void XStudents_GetXStudentsByXLea(RicOneApiClient ricOne)
    {
        for(XStudentType s : ricOne.sifXpress.GetXStudentsByXLea(refId))
        {
        	System.out.println("refId: " + s.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + s.getName().getType());
            System.out.println("prefix: " + s.getName().getPrefix());
            System.out.println("familyName: " + s.getName().getFamilyName());
            System.out.println("givenName: " + s.getName().getGivenName());
            System.out.println("middleName: " + s.getName().getMiddleName());
            System.out.println("suffix: " + s.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("##### BEGIN OTHERNAME #####");
            for(XPersonNameType n : s.getOtherNames().getName())
            {
                System.out.println("type: " + n.getType());
                System.out.println("prefix: " + n.getPrefix());
                System.out.println("familyName: " + n.getFamilyName());
                System.out.println("givenName: " + n.getGivenName());
                System.out.println("middleName: " + n.getMiddleName());
                System.out.println("suffix: " + n.getSuffix());
            }
            System.out.println("##### END OTHERNAME #####");

            System.out.println("localId: " + s.getLocalId());
            System.out.println("loginId: " + s.getLoginId());
            System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + s.getAddress().getAddressType());
            System.out.println("city: " + s.getAddress().getCity());
            System.out.println("line1: " + s.getAddress().getLine1());
            System.out.println("line2: " + s.getAddress().getLine2());
            System.out.println("countryCode: " + s.getAddress().getCountryCode());
            System.out.println("postalCode: " + s.getAddress().getPostalCode());
            System.out.println("stateProvince: " + s.getAddress().getStateProvince());
            System.out.println("number: " + s.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBERS #####");
            System.out.println("number: " + s.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBERS #####");
            System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
            for(XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBERS #####");
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + s.getEmail().getEmailType());
            System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN OTHEREMAILS #####");
            for(XEmailType e : s.getOtherEmails().getEmail())
            {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println("##### BEGIN DEMOGRAPHICS #####");
            System.out.println("##### BEGIN RACES #####");
            for(XRaceType r : s.getDemographics().getRaces().getRace())
            {
                System.out.println("race: " + r.getRace());
            }
            System.out.println("##### END RACES #####");
            System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
            System.out.println("sex: " + s.getDemographics().getSex());
            System.out.println("birthDate: " + s.getDemographics().getBirthDate());
            System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
            System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
            System.out.println("##### END DEMOGRAPHICS #####");
            System.out.println("##### BEGIN ENROLLMENT #####");
            System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
            System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
            System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
            System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
            System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
            System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
            System.out.println("exitDate: " + s.getEnrollment().getExitDate());
            System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
            System.out.println("##### BEGIN HOMEROOMTEACHER #####");
            System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
            System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
            System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
            System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
            System.out.println("##### END HOMEROOMTEACHER #####");
            System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
            System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
            System.out.println("##### BEGIN COUNSELOR #####");
            System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
            System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
            System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
            System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
            System.out.println("##### END COUNSELOR #####");
            System.out.println("##### END ENROLLMENT #####");
            System.out.println("##### BEGIN OTHERENROLLMENT #####");
            for(XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
            {  
                System.out.println("leaRefId: " + e.getLeaRefId());
                System.out.println("schoolRefId: " + e.getSchoolRefId());
                System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                System.out.println("membershipType: " + e.getMembershipType());
                System.out.println("entryDate: " + e.getEntryDate());
                System.out.println("exitDate: " + e.getExitDate());
                System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
                System.out.println("##### BEGIN HOMEROOMTEACHER #####");
                System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
                System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
                System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
                System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
                System.out.println("##### END HOMEROOMTEACHER #####");
                System.out.println("gradeLevel: " + e.getGradeLevel());
                System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
                System.out.println("##### BEGIN COUNSELOR #####");
                System.out.println("refId: " + e.getCounselor().getRefId());
                System.out.println("localId: " + e.getCounselor().getLocalId());
                System.out.println("givenName: " + e.getCounselor().getGivenName());
                System.out.println("familyName: " + e.getCounselor().getFamilyName());
                System.out.println("##### END COUNSELOR #####"); 
            }
            System.out.println("##### END OTHERENROLLMENT #####");
            System.out.println("##### BEGIN ACADEMICSUMMARY #####");
            System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
            System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
            System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
            System.out.println("##### END ACADEMICSUMMARY #####");
            System.out.println("##### BEGIN STUDENTCONTACTS #####");
            for(String contactRefid : s.getStudentContacts().getContactPersonRefId())
            {
                System.out.println("contactPersonRefId: " + contactRefid);
            }
            for(XContactType c : s.getStudentContacts().getXContact())
            {
                System.out.println("##### BEGIN NAME #####");
                System.out.println("type: " + c.getName().getType());
                System.out.println("prefix: " + c.getName().getPrefix());
                System.out.println("familyName: " + c.getName().getFamilyName());
                System.out.println("givenName: " + c.getName().getGivenName());
                System.out.println("middleName: " + c.getName().getMiddleName());
                System.out.println("suffix: " + c.getName().getSuffix());
                System.out.println("##### END NAME #####");
                System.out.println("##### BEGIN OTHERNAME #####");
                for(XPersonNameType n : c.getOtherNames().getName())
                {
                    System.out.println("type: " + n.getType());
                    System.out.println("prefix: " + n.getPrefix());
                    System.out.println("familyName: " + n.getFamilyName());
                    System.out.println("givenName: " + n.getGivenName());
                    System.out.println("middleName: " + n.getMiddleName());
                    System.out.println("suffix: " + n.getSuffix());
                }
                System.out.println("##### END OTHERNAME #####");
                System.out.println(": " + c.getLocalId());
                System.out.println(": " + c.getLoginId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for(XOtherPersonIdType id : c.getOtherIds().getOtherId())
                {
                    System.out.println("id: " + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("##### BEGIN ADDRESS #####");
                System.out.println("addressType: " + c.getAddress().getAddressType());
                System.out.println("city: " + c.getAddress().getCity());
                System.out.println("line1: " + c.getAddress().getLine1());
                System.out.println("line2: " + c.getAddress().getLine2());
                System.out.println("countryCode: " + c.getAddress().getCountryCode());
                System.out.println("postalCode: " + c.getAddress().getPostalCode());
                System.out.println("stateProvince: " + c.getAddress().getStateProvince());
                System.out.println("number: " + c.getPhoneNumber().getNumber());
                System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
                System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
                System.out.println("##### END ADDRESS #####");
                System.out.println("##### BEGIN PHONENUMBERS #####");
                System.out.println("number: " + c.getPhoneNumber().getNumber());
                System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
                System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
                System.out.println("##### END PHONENUMBERS #####");
                System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
                for(XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
                {
                    System.out.println("otherPhoneNumbers number: " + p.getNumber());
                    System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                    System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
                }
                System.out.println("##### END OTHERPHONENUMBERS #####");
                System.out.println("##### BEGIN EMAIL #####");
                System.out.println("emailType: " + c.getEmail().getEmailType());
                System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
                System.out.println("##### END EMAIL #####");
                System.out.println("##### BEGIN OTHEREMAILS #####");
                for(XEmailType e : c.getOtherEmails().getEmail())
                {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println(": " + c.getSex());
                System.out.println(": " + c.getEmployerType());
                System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                for(XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
                {
                    System.out.println("studentRefId: " + csr.getStudentRefId());
                    System.out.println("relationshipCode: " + csr.getRelationshipCode());
                    System.out.println("restrictions: " + csr.getRestrictions());
                    System.out.println("livesWith: " + csr.isLivesWith());
                    System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
                    System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
                    System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
                    System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
                    System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
                    System.out.println("contactSequence: " + csr.getContactSequence());
                }
                System.out.println("##### END CONTACTRELATIONSHIPS #####");
            }
            System.out.println("##### END STUDENTCONTACTS #####");
            System.out.println("##### BEGIN LANGUAGES #####");
            for(XLanguageType l : s.getLanguages().getLanguage())
            {
                System.out.println("type: " + l.getType());
                System.out.println("code: " + l.getCode());
            }
            System.out.println("##### END LANGUAGES #####");
            System.out.println("========================================");
        }
    }
    //RETURN STUDENTS BY SCHOOL
    public static void XStudents_GetXStudentsByXSchool(RicOneApiClient ricOne) 
    {
        for(XStudentType s : ricOne.sifXpress.GetXStudentsByXSchool(refId))
        {
        	System.out.println("refId: " + s.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + s.getName().getType());
            System.out.println("prefix: " + s.getName().getPrefix());
            System.out.println("familyName: " + s.getName().getFamilyName());
            System.out.println("givenName: " + s.getName().getGivenName());
            System.out.println("middleName: " + s.getName().getMiddleName());
            System.out.println("suffix: " + s.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("##### BEGIN OTHERNAME #####");
            for(XPersonNameType n : s.getOtherNames().getName())
            {
                System.out.println("type: " + n.getType());
                System.out.println("prefix: " + n.getPrefix());
                System.out.println("familyName: " + n.getFamilyName());
                System.out.println("givenName: " + n.getGivenName());
                System.out.println("middleName: " + n.getMiddleName());
                System.out.println("suffix: " + n.getSuffix());
            }
            System.out.println("##### END OTHERNAME #####");

            System.out.println("localId: " + s.getLocalId());
            System.out.println("loginId: " + s.getLoginId());
            System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + s.getAddress().getAddressType());
            System.out.println("city: " + s.getAddress().getCity());
            System.out.println("line1: " + s.getAddress().getLine1());
            System.out.println("line2: " + s.getAddress().getLine2());
            System.out.println("countryCode: " + s.getAddress().getCountryCode());
            System.out.println("postalCode: " + s.getAddress().getPostalCode());
            System.out.println("stateProvince: " + s.getAddress().getStateProvince());
            System.out.println("number: " + s.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBERS #####");
            System.out.println("number: " + s.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBERS #####");
            System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
            for(XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBERS #####");
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + s.getEmail().getEmailType());
            System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN OTHEREMAILS #####");
            for(XEmailType e : s.getOtherEmails().getEmail())
            {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println("##### BEGIN DEMOGRAPHICS #####");
            System.out.println("##### BEGIN RACES #####");
            for(XRaceType r : s.getDemographics().getRaces().getRace())
            {
                System.out.println("race: " + r.getRace());
            }
            System.out.println("##### END RACES #####");
            System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
            System.out.println("sex: " + s.getDemographics().getSex());
            System.out.println("birthDate: " + s.getDemographics().getBirthDate());
            System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
            System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
            System.out.println("##### END DEMOGRAPHICS #####");
            System.out.println("##### BEGIN ENROLLMENT #####");
            System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
            System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
            System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
            System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
            System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
            System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
            System.out.println("exitDate: " + s.getEnrollment().getExitDate());
            System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
            System.out.println("##### BEGIN HOMEROOMTEACHER #####");
            System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
            System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
            System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
            System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
            System.out.println("##### END HOMEROOMTEACHER #####");
            System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
            System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
            System.out.println("##### BEGIN COUNSELOR #####");
            System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
            System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
            System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
            System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
            System.out.println("##### END COUNSELOR #####");
            System.out.println("##### END ENROLLMENT #####");
            System.out.println("##### BEGIN OTHERENROLLMENT #####");
            for(XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
            {  
                System.out.println("leaRefId: " + e.getLeaRefId());
                System.out.println("schoolRefId: " + e.getSchoolRefId());
                System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                System.out.println("membershipType: " + e.getMembershipType());
                System.out.println("entryDate: " + e.getEntryDate());
                System.out.println("exitDate: " + e.getExitDate());
                System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
                System.out.println("##### BEGIN HOMEROOMTEACHER #####");
                System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
                System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
                System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
                System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
                System.out.println("##### END HOMEROOMTEACHER #####");
                System.out.println("gradeLevel: " + e.getGradeLevel());
                System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
                System.out.println("##### BEGIN COUNSELOR #####");
                System.out.println("refId: " + e.getCounselor().getRefId());
                System.out.println("localId: " + e.getCounselor().getLocalId());
                System.out.println("givenName: " + e.getCounselor().getGivenName());
                System.out.println("familyName: " + e.getCounselor().getFamilyName());
                System.out.println("##### END COUNSELOR #####"); 
            }
            System.out.println("##### END OTHERENROLLMENT #####");
            System.out.println("##### BEGIN ACADEMICSUMMARY #####");
            System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
            System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
            System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
            System.out.println("##### END ACADEMICSUMMARY #####");
            System.out.println("##### BEGIN STUDENTCONTACTS #####");
            for(String contactRefid : s.getStudentContacts().getContactPersonRefId())
            {
                System.out.println("contactPersonRefId: " + contactRefid);
            }
            for(XContactType c : s.getStudentContacts().getXContact())
            {
                System.out.println("##### BEGIN NAME #####");
                System.out.println("type: " + c.getName().getType());
                System.out.println("prefix: " + c.getName().getPrefix());
                System.out.println("familyName: " + c.getName().getFamilyName());
                System.out.println("givenName: " + c.getName().getGivenName());
                System.out.println("middleName: " + c.getName().getMiddleName());
                System.out.println("suffix: " + c.getName().getSuffix());
                System.out.println("##### END NAME #####");
                System.out.println("##### BEGIN OTHERNAME #####");
                for(XPersonNameType n : c.getOtherNames().getName())
                {
                    System.out.println("type: " + n.getType());
                    System.out.println("prefix: " + n.getPrefix());
                    System.out.println("familyName: " + n.getFamilyName());
                    System.out.println("givenName: " + n.getGivenName());
                    System.out.println("middleName: " + n.getMiddleName());
                    System.out.println("suffix: " + n.getSuffix());
                }
                System.out.println("##### END OTHERNAME #####");
                System.out.println(": " + c.getLocalId());
                System.out.println(": " + c.getLoginId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for(XOtherPersonIdType id : c.getOtherIds().getOtherId())
                {
                    System.out.println("id: " + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("##### BEGIN ADDRESS #####");
                System.out.println("addressType: " + c.getAddress().getAddressType());
                System.out.println("city: " + c.getAddress().getCity());
                System.out.println("line1: " + c.getAddress().getLine1());
                System.out.println("line2: " + c.getAddress().getLine2());
                System.out.println("countryCode: " + c.getAddress().getCountryCode());
                System.out.println("postalCode: " + c.getAddress().getPostalCode());
                System.out.println("stateProvince: " + c.getAddress().getStateProvince());
                System.out.println("number: " + c.getPhoneNumber().getNumber());
                System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
                System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
                System.out.println("##### END ADDRESS #####");
                System.out.println("##### BEGIN PHONENUMBERS #####");
                System.out.println("number: " + c.getPhoneNumber().getNumber());
                System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
                System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
                System.out.println("##### END PHONENUMBERS #####");
                System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
                for(XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
                {
                    System.out.println("otherPhoneNumbers number: " + p.getNumber());
                    System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                    System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
                }
                System.out.println("##### END OTHERPHONENUMBERS #####");
                System.out.println("##### BEGIN EMAIL #####");
                System.out.println("emailType: " + c.getEmail().getEmailType());
                System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
                System.out.println("##### END EMAIL #####");
                System.out.println("##### BEGIN OTHEREMAILS #####");
                for(XEmailType e : c.getOtherEmails().getEmail())
                {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println(": " + c.getSex());
                System.out.println(": " + c.getEmployerType());
                System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                for(XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
                {
                    System.out.println("studentRefId: " + csr.getStudentRefId());
                    System.out.println("relationshipCode: " + csr.getRelationshipCode());
                    System.out.println("restrictions: " + csr.getRestrictions());
                    System.out.println("livesWith: " + csr.isLivesWith());
                    System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
                    System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
                    System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
                    System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
                    System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
                    System.out.println("contactSequence: " + csr.getContactSequence());
                }
                System.out.println("##### END CONTACTRELATIONSHIPS #####");
            }
            System.out.println("##### END STUDENTCONTACTS #####");
            System.out.println("##### BEGIN LANGUAGES #####");
            for(XLanguageType l : s.getLanguages().getLanguage())
            {
                System.out.println("type: " + l.getType());
                System.out.println("code: " + l.getCode());
            }
            System.out.println("##### END LANGUAGES #####");
            System.out.println("========================================");
        }
    }
    //RETURN STUDENTS BY ROSTER
    public static void XStudents_GetXStudentsByXRoster(RicOneApiClient ricOne)
    {
        for(XStudentType s : ricOne.sifXpress.GetXStudentsByXRoster(refId))
        {
        	System.out.println("refId: " + s.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + s.getName().getType());
            System.out.println("prefix: " + s.getName().getPrefix());
            System.out.println("familyName: " + s.getName().getFamilyName());
            System.out.println("givenName: " + s.getName().getGivenName());
            System.out.println("middleName: " + s.getName().getMiddleName());
            System.out.println("suffix: " + s.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("##### BEGIN OTHERNAME #####");
            for(XPersonNameType n : s.getOtherNames().getName())
            {
                System.out.println("type: " + n.getType());
                System.out.println("prefix: " + n.getPrefix());
                System.out.println("familyName: " + n.getFamilyName());
                System.out.println("givenName: " + n.getGivenName());
                System.out.println("middleName: " + n.getMiddleName());
                System.out.println("suffix: " + n.getSuffix());
            }
            System.out.println("##### END OTHERNAME #####");

            System.out.println("localId: " + s.getLocalId());
            System.out.println("loginId: " + s.getLoginId());
            System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + s.getAddress().getAddressType());
            System.out.println("city: " + s.getAddress().getCity());
            System.out.println("line1: " + s.getAddress().getLine1());
            System.out.println("line2: " + s.getAddress().getLine2());
            System.out.println("countryCode: " + s.getAddress().getCountryCode());
            System.out.println("postalCode: " + s.getAddress().getPostalCode());
            System.out.println("stateProvince: " + s.getAddress().getStateProvince());
            System.out.println("number: " + s.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBERS #####");
            System.out.println("number: " + s.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBERS #####");
            System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
            for(XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBERS #####");
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + s.getEmail().getEmailType());
            System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN OTHEREMAILS #####");
            for(XEmailType e : s.getOtherEmails().getEmail())
            {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println("##### BEGIN DEMOGRAPHICS #####");
            System.out.println("##### BEGIN RACES #####");
            for(XRaceType r : s.getDemographics().getRaces().getRace())
            {
                System.out.println("race: " + r.getRace());
            }
            System.out.println("##### END RACES #####");
            System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
            System.out.println("sex: " + s.getDemographics().getSex());
            System.out.println("birthDate: " + s.getDemographics().getBirthDate());
            System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
            System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
            System.out.println("##### END DEMOGRAPHICS #####");
            System.out.println("##### BEGIN ENROLLMENT #####");
            System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
            System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
            System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
            System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
            System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
            System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
            System.out.println("exitDate: " + s.getEnrollment().getExitDate());
            System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
            System.out.println("##### BEGIN HOMEROOMTEACHER #####");
            System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
            System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
            System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
            System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
            System.out.println("##### END HOMEROOMTEACHER #####");
            System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
            System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
            System.out.println("##### BEGIN COUNSELOR #####");
            System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
            System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
            System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
            System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
            System.out.println("##### END COUNSELOR #####");
            System.out.println("##### END ENROLLMENT #####");
            System.out.println("##### BEGIN OTHERENROLLMENT #####");
            for(XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
            {  
                System.out.println("leaRefId: " + e.getLeaRefId());
                System.out.println("schoolRefId: " + e.getSchoolRefId());
                System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                System.out.println("membershipType: " + e.getMembershipType());
                System.out.println("entryDate: " + e.getEntryDate());
                System.out.println("exitDate: " + e.getExitDate());
                System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
                System.out.println("##### BEGIN HOMEROOMTEACHER #####");
                System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
                System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
                System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
                System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
                System.out.println("##### END HOMEROOMTEACHER #####");
                System.out.println("gradeLevel: " + e.getGradeLevel());
                System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
                System.out.println("##### BEGIN COUNSELOR #####");
                System.out.println("refId: " + e.getCounselor().getRefId());
                System.out.println("localId: " + e.getCounselor().getLocalId());
                System.out.println("givenName: " + e.getCounselor().getGivenName());
                System.out.println("familyName: " + e.getCounselor().getFamilyName());
                System.out.println("##### END COUNSELOR #####"); 
            }
            System.out.println("##### END OTHERENROLLMENT #####");
            System.out.println("##### BEGIN ACADEMICSUMMARY #####");
            System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
            System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
            System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
            System.out.println("##### END ACADEMICSUMMARY #####");
            System.out.println("##### BEGIN STUDENTCONTACTS #####");
            for(String contactRefid : s.getStudentContacts().getContactPersonRefId())
            {
                System.out.println("contactPersonRefId: " + contactRefid);
            }
            for(XContactType c : s.getStudentContacts().getXContact())
            {
                System.out.println("##### BEGIN NAME #####");
                System.out.println("type: " + c.getName().getType());
                System.out.println("prefix: " + c.getName().getPrefix());
                System.out.println("familyName: " + c.getName().getFamilyName());
                System.out.println("givenName: " + c.getName().getGivenName());
                System.out.println("middleName: " + c.getName().getMiddleName());
                System.out.println("suffix: " + c.getName().getSuffix());
                System.out.println("##### END NAME #####");
                System.out.println("##### BEGIN OTHERNAME #####");
                for(XPersonNameType n : c.getOtherNames().getName())
                {
                    System.out.println("type: " + n.getType());
                    System.out.println("prefix: " + n.getPrefix());
                    System.out.println("familyName: " + n.getFamilyName());
                    System.out.println("givenName: " + n.getGivenName());
                    System.out.println("middleName: " + n.getMiddleName());
                    System.out.println("suffix: " + n.getSuffix());
                }
                System.out.println("##### END OTHERNAME #####");
                System.out.println(": " + c.getLocalId());
                System.out.println(": " + c.getLoginId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for(XOtherPersonIdType id : c.getOtherIds().getOtherId())
                {
                    System.out.println("id: " + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("##### BEGIN ADDRESS #####");
                System.out.println("addressType: " + c.getAddress().getAddressType());
                System.out.println("city: " + c.getAddress().getCity());
                System.out.println("line1: " + c.getAddress().getLine1());
                System.out.println("line2: " + c.getAddress().getLine2());
                System.out.println("countryCode: " + c.getAddress().getCountryCode());
                System.out.println("postalCode: " + c.getAddress().getPostalCode());
                System.out.println("stateProvince: " + c.getAddress().getStateProvince());
                System.out.println("number: " + c.getPhoneNumber().getNumber());
                System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
                System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
                System.out.println("##### END ADDRESS #####");
                System.out.println("##### BEGIN PHONENUMBERS #####");
                System.out.println("number: " + c.getPhoneNumber().getNumber());
                System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
                System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
                System.out.println("##### END PHONENUMBERS #####");
                System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
                for(XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
                {
                    System.out.println("otherPhoneNumbers number: " + p.getNumber());
                    System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                    System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
                }
                System.out.println("##### END OTHERPHONENUMBERS #####");
                System.out.println("##### BEGIN EMAIL #####");
                System.out.println("emailType: " + c.getEmail().getEmailType());
                System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
                System.out.println("##### END EMAIL #####");
                System.out.println("##### BEGIN OTHEREMAILS #####");
                for(XEmailType e : c.getOtherEmails().getEmail())
                {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println(": " + c.getSex());
                System.out.println(": " + c.getEmployerType());
                System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                for(XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
                {
                    System.out.println("studentRefId: " + csr.getStudentRefId());
                    System.out.println("relationshipCode: " + csr.getRelationshipCode());
                    System.out.println("restrictions: " + csr.getRestrictions());
                    System.out.println("livesWith: " + csr.isLivesWith());
                    System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
                    System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
                    System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
                    System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
                    System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
                    System.out.println("contactSequence: " + csr.getContactSequence());
                }
                System.out.println("##### END CONTACTRELATIONSHIPS #####");
            }
            System.out.println("##### END STUDENTCONTACTS #####");
            System.out.println("##### BEGIN LANGUAGES #####");
            for(XLanguageType l : s.getLanguages().getLanguage())
            {
                System.out.println("type: " + l.getType());
                System.out.println("code: " + l.getCode());
            }
            System.out.println("##### END LANGUAGES #####");
            System.out.println("========================================");
        }
    }
    //RETURN STUDENTS BY STAFF
    public static void XStudents_GetXStudentsByXStaff(RicOneApiClient ricOne)
    {
        for(XStudentType s : ricOne.sifXpress.GetXStudentsByXStaff(refId))
        {
        	System.out.println("refId: " + s.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + s.getName().getType());
            System.out.println("prefix: " + s.getName().getPrefix());
            System.out.println("familyName: " + s.getName().getFamilyName());
            System.out.println("givenName: " + s.getName().getGivenName());
            System.out.println("middleName: " + s.getName().getMiddleName());
            System.out.println("suffix: " + s.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("##### BEGIN OTHERNAME #####");
            for(XPersonNameType n : s.getOtherNames().getName())
            {
                System.out.println("type: " + n.getType());
                System.out.println("prefix: " + n.getPrefix());
                System.out.println("familyName: " + n.getFamilyName());
                System.out.println("givenName: " + n.getGivenName());
                System.out.println("middleName: " + n.getMiddleName());
                System.out.println("suffix: " + n.getSuffix());
            }
            System.out.println("##### END OTHERNAME #####");

            System.out.println("localId: " + s.getLocalId());
            System.out.println("loginId: " + s.getLoginId());
            System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + s.getAddress().getAddressType());
            System.out.println("city: " + s.getAddress().getCity());
            System.out.println("line1: " + s.getAddress().getLine1());
            System.out.println("line2: " + s.getAddress().getLine2());
            System.out.println("countryCode: " + s.getAddress().getCountryCode());
            System.out.println("postalCode: " + s.getAddress().getPostalCode());
            System.out.println("stateProvince: " + s.getAddress().getStateProvince());
            System.out.println("number: " + s.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBERS #####");
            System.out.println("number: " + s.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBERS #####");
            System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
            for(XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBERS #####");
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + s.getEmail().getEmailType());
            System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN OTHEREMAILS #####");
            for(XEmailType e : s.getOtherEmails().getEmail())
            {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println("##### BEGIN DEMOGRAPHICS #####");
            System.out.println("##### BEGIN RACES #####");
            for(XRaceType r : s.getDemographics().getRaces().getRace())
            {
                System.out.println("race: " + r.getRace());
            }
            System.out.println("##### END RACES #####");
            System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
            System.out.println("sex: " + s.getDemographics().getSex());
            System.out.println("birthDate: " + s.getDemographics().getBirthDate());
            System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
            System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
            System.out.println("##### END DEMOGRAPHICS #####");
            System.out.println("##### BEGIN ENROLLMENT #####");
            System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
            System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
            System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
            System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
            System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
            System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
            System.out.println("exitDate: " + s.getEnrollment().getExitDate());
            System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
            System.out.println("##### BEGIN HOMEROOMTEACHER #####");
            System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
            System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
            System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
            System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
            System.out.println("##### END HOMEROOMTEACHER #####");
            System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
            System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
            System.out.println("##### BEGIN COUNSELOR #####");
            System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
            System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
            System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
            System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
            System.out.println("##### END COUNSELOR #####");
            System.out.println("##### END ENROLLMENT #####");
            System.out.println("##### BEGIN OTHERENROLLMENT #####");
            for(XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
            {  
                System.out.println("leaRefId: " + e.getLeaRefId());
                System.out.println("schoolRefId: " + e.getSchoolRefId());
                System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                System.out.println("membershipType: " + e.getMembershipType());
                System.out.println("entryDate: " + e.getEntryDate());
                System.out.println("exitDate: " + e.getExitDate());
                System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
                System.out.println("##### BEGIN HOMEROOMTEACHER #####");
                System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
                System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
                System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
                System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
                System.out.println("##### END HOMEROOMTEACHER #####");
                System.out.println("gradeLevel: " + e.getGradeLevel());
                System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
                System.out.println("##### BEGIN COUNSELOR #####");
                System.out.println("refId: " + e.getCounselor().getRefId());
                System.out.println("localId: " + e.getCounselor().getLocalId());
                System.out.println("givenName: " + e.getCounselor().getGivenName());
                System.out.println("familyName: " + e.getCounselor().getFamilyName());
                System.out.println("##### END COUNSELOR #####"); 
            }
            System.out.println("##### END OTHERENROLLMENT #####");
            System.out.println("##### BEGIN ACADEMICSUMMARY #####");
            System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
            System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
            System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
            System.out.println("##### END ACADEMICSUMMARY #####");
            System.out.println("##### BEGIN STUDENTCONTACTS #####");
            for(String contactRefid : s.getStudentContacts().getContactPersonRefId())
            {
                System.out.println("contactPersonRefId: " + contactRefid);
            }
            for(XContactType c : s.getStudentContacts().getXContact())
            {
                System.out.println("##### BEGIN NAME #####");
                System.out.println("type: " + c.getName().getType());
                System.out.println("prefix: " + c.getName().getPrefix());
                System.out.println("familyName: " + c.getName().getFamilyName());
                System.out.println("givenName: " + c.getName().getGivenName());
                System.out.println("middleName: " + c.getName().getMiddleName());
                System.out.println("suffix: " + c.getName().getSuffix());
                System.out.println("##### END NAME #####");
                System.out.println("##### BEGIN OTHERNAME #####");
                for(XPersonNameType n : c.getOtherNames().getName())
                {
                    System.out.println("type: " + n.getType());
                    System.out.println("prefix: " + n.getPrefix());
                    System.out.println("familyName: " + n.getFamilyName());
                    System.out.println("givenName: " + n.getGivenName());
                    System.out.println("middleName: " + n.getMiddleName());
                    System.out.println("suffix: " + n.getSuffix());
                }
                System.out.println("##### END OTHERNAME #####");
                System.out.println(": " + c.getLocalId());
                System.out.println(": " + c.getLoginId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for(XOtherPersonIdType id : c.getOtherIds().getOtherId())
                {
                    System.out.println("id: " + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("##### BEGIN ADDRESS #####");
                System.out.println("addressType: " + c.getAddress().getAddressType());
                System.out.println("city: " + c.getAddress().getCity());
                System.out.println("line1: " + c.getAddress().getLine1());
                System.out.println("line2: " + c.getAddress().getLine2());
                System.out.println("countryCode: " + c.getAddress().getCountryCode());
                System.out.println("postalCode: " + c.getAddress().getPostalCode());
                System.out.println("stateProvince: " + c.getAddress().getStateProvince());
                System.out.println("number: " + c.getPhoneNumber().getNumber());
                System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
                System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
                System.out.println("##### END ADDRESS #####");
                System.out.println("##### BEGIN PHONENUMBERS #####");
                System.out.println("number: " + c.getPhoneNumber().getNumber());
                System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
                System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
                System.out.println("##### END PHONENUMBERS #####");
                System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
                for(XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
                {
                    System.out.println("otherPhoneNumbers number: " + p.getNumber());
                    System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                    System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
                }
                System.out.println("##### END OTHERPHONENUMBERS #####");
                System.out.println("##### BEGIN EMAIL #####");
                System.out.println("emailType: " + c.getEmail().getEmailType());
                System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
                System.out.println("##### END EMAIL #####");
                System.out.println("##### BEGIN OTHEREMAILS #####");
                for(XEmailType e : c.getOtherEmails().getEmail())
                {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println(": " + c.getSex());
                System.out.println(": " + c.getEmployerType());
                System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                for(XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
                {
                    System.out.println("studentRefId: " + csr.getStudentRefId());
                    System.out.println("relationshipCode: " + csr.getRelationshipCode());
                    System.out.println("restrictions: " + csr.getRestrictions());
                    System.out.println("livesWith: " + csr.isLivesWith());
                    System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
                    System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
                    System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
                    System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
                    System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
                    System.out.println("contactSequence: " + csr.getContactSequence());
                }
                System.out.println("##### END CONTACTRELATIONSHIPS #####");
            }
            System.out.println("##### END STUDENTCONTACTS #####");
            System.out.println("##### BEGIN LANGUAGES #####");
            for(XLanguageType l : s.getLanguages().getLanguage())
            {
                System.out.println("type: " + l.getType());
                System.out.println("code: " + l.getCode());
            }
            System.out.println("##### END LANGUAGES #####");
            System.out.println("========================================");
        }
    }
    //RETURN STUDENTS BY CONTACT
    public static void XStudents_GetXStudentsByXContact(RicOneApiClient ricOne)
    {
        for(XStudentType s : ricOne.sifXpress.GetXStudentsByXContact(refId))
        {
        	System.out.println("refId: " + s.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + s.getName().getType());
            System.out.println("prefix: " + s.getName().getPrefix());
            System.out.println("familyName: " + s.getName().getFamilyName());
            System.out.println("givenName: " + s.getName().getGivenName());
            System.out.println("middleName: " + s.getName().getMiddleName());
            System.out.println("suffix: " + s.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("##### BEGIN OTHERNAME #####");
            for(XPersonNameType n : s.getOtherNames().getName())
            {
                System.out.println("type: " + n.getType());
                System.out.println("prefix: " + n.getPrefix());
                System.out.println("familyName: " + n.getFamilyName());
                System.out.println("givenName: " + n.getGivenName());
                System.out.println("middleName: " + n.getMiddleName());
                System.out.println("suffix: " + n.getSuffix());
            }
            System.out.println("##### END OTHERNAME #####");

            System.out.println("localId: " + s.getLocalId());
            System.out.println("loginId: " + s.getLoginId());
            System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : s.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + s.getAddress().getAddressType());
            System.out.println("city: " + s.getAddress().getCity());
            System.out.println("line1: " + s.getAddress().getLine1());
            System.out.println("line2: " + s.getAddress().getLine2());
            System.out.println("countryCode: " + s.getAddress().getCountryCode());
            System.out.println("postalCode: " + s.getAddress().getPostalCode());
            System.out.println("stateProvince: " + s.getAddress().getStateProvince());
            System.out.println("number: " + s.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBERS #####");
            System.out.println("number: " + s.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBERS #####");
            System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
            for(XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBERS #####");
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + s.getEmail().getEmailType());
            System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN OTHEREMAILS #####");
            for(XEmailType e : s.getOtherEmails().getEmail())
            {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println("##### BEGIN DEMOGRAPHICS #####");
            System.out.println("##### BEGIN RACES #####");
            for(XRaceType r : s.getDemographics().getRaces().getRace())
            {
                System.out.println("race: " + r.getRace());
            }
            System.out.println("##### END RACES #####");
            System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
            System.out.println("sex: " + s.getDemographics().getSex());
            System.out.println("birthDate: " + s.getDemographics().getBirthDate());
            System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
            System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
            System.out.println("##### END DEMOGRAPHICS #####");
            System.out.println("##### BEGIN ENROLLMENT #####");
            System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
            System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
            System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
            System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
            System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
            System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
            System.out.println("exitDate: " + s.getEnrollment().getExitDate());
            System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
            System.out.println("##### BEGIN HOMEROOMTEACHER #####");
            System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
            System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
            System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
            System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
            System.out.println("##### END HOMEROOMTEACHER #####");
            System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
            System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
            System.out.println("##### BEGIN COUNSELOR #####");
            System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
            System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
            System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
            System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
            System.out.println("##### END COUNSELOR #####");
            System.out.println("##### END ENROLLMENT #####");
            System.out.println("##### BEGIN OTHERENROLLMENT #####");
            for(XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
            {  
                System.out.println("leaRefId: " + e.getLeaRefId());
                System.out.println("schoolRefId: " + e.getSchoolRefId());
                System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                System.out.println("membershipType: " + e.getMembershipType());
                System.out.println("entryDate: " + e.getEntryDate());
                System.out.println("exitDate: " + e.getExitDate());
                System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
                System.out.println("##### BEGIN HOMEROOMTEACHER #####");
                System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
                System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
                System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
                System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
                System.out.println("##### END HOMEROOMTEACHER #####");
                System.out.println("gradeLevel: " + e.getGradeLevel());
                System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
                System.out.println("##### BEGIN COUNSELOR #####");
                System.out.println("refId: " + e.getCounselor().getRefId());
                System.out.println("localId: " + e.getCounselor().getLocalId());
                System.out.println("givenName: " + e.getCounselor().getGivenName());
                System.out.println("familyName: " + e.getCounselor().getFamilyName());
                System.out.println("##### END COUNSELOR #####"); 
            }
            System.out.println("##### END OTHERENROLLMENT #####");
            System.out.println("##### BEGIN ACADEMICSUMMARY #####");
            System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
            System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
            System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
            System.out.println("##### END ACADEMICSUMMARY #####");
            System.out.println("##### BEGIN STUDENTCONTACTS #####");
            for(String contactRefid : s.getStudentContacts().getContactPersonRefId())
            {
                System.out.println("contactPersonRefId: " + contactRefid);
            }
            for(XContactType c : s.getStudentContacts().getXContact())
            {
                System.out.println("##### BEGIN NAME #####");
                System.out.println("type: " + c.getName().getType());
                System.out.println("prefix: " + c.getName().getPrefix());
                System.out.println("familyName: " + c.getName().getFamilyName());
                System.out.println("givenName: " + c.getName().getGivenName());
                System.out.println("middleName: " + c.getName().getMiddleName());
                System.out.println("suffix: " + c.getName().getSuffix());
                System.out.println("##### END NAME #####");
                System.out.println("##### BEGIN OTHERNAME #####");
                for(XPersonNameType n : c.getOtherNames().getName())
                {
                    System.out.println("type: " + n.getType());
                    System.out.println("prefix: " + n.getPrefix());
                    System.out.println("familyName: " + n.getFamilyName());
                    System.out.println("givenName: " + n.getGivenName());
                    System.out.println("middleName: " + n.getMiddleName());
                    System.out.println("suffix: " + n.getSuffix());
                }
                System.out.println("##### END OTHERNAME #####");
                System.out.println(": " + c.getLocalId());
                System.out.println(": " + c.getLoginId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for(XOtherPersonIdType id : c.getOtherIds().getOtherId())
                {
                    System.out.println("id: " + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("##### BEGIN ADDRESS #####");
                System.out.println("addressType: " + c.getAddress().getAddressType());
                System.out.println("city: " + c.getAddress().getCity());
                System.out.println("line1: " + c.getAddress().getLine1());
                System.out.println("line2: " + c.getAddress().getLine2());
                System.out.println("countryCode: " + c.getAddress().getCountryCode());
                System.out.println("postalCode: " + c.getAddress().getPostalCode());
                System.out.println("stateProvince: " + c.getAddress().getStateProvince());
                System.out.println("number: " + c.getPhoneNumber().getNumber());
                System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
                System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
                System.out.println("##### END ADDRESS #####");
                System.out.println("##### BEGIN PHONENUMBERS #####");
                System.out.println("number: " + c.getPhoneNumber().getNumber());
                System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
                System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
                System.out.println("##### END PHONENUMBERS #####");
                System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
                for(XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
                {
                    System.out.println("otherPhoneNumbers number: " + p.getNumber());
                    System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                    System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
                }
                System.out.println("##### END OTHERPHONENUMBERS #####");
                System.out.println("##### BEGIN EMAIL #####");
                System.out.println("emailType: " + c.getEmail().getEmailType());
                System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
                System.out.println("##### END EMAIL #####");
                System.out.println("##### BEGIN OTHEREMAILS #####");
                for(XEmailType e : c.getOtherEmails().getEmail())
                {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println(": " + c.getSex());
                System.out.println(": " + c.getEmployerType());
                System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                for(XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
                {
                    System.out.println("studentRefId: " + csr.getStudentRefId());
                    System.out.println("relationshipCode: " + csr.getRelationshipCode());
                    System.out.println("restrictions: " + csr.getRestrictions());
                    System.out.println("livesWith: " + csr.isLivesWith());
                    System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
                    System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
                    System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
                    System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
                    System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
                    System.out.println("contactSequence: " + csr.getContactSequence());
                }
                System.out.println("##### END CONTACTRELATIONSHIPS #####");
            }
            System.out.println("##### END STUDENTCONTACTS #####");
            System.out.println("##### BEGIN LANGUAGES #####");
            for(XLanguageType l : s.getLanguages().getLanguage())
            {
                System.out.println("type: " + l.getType());
                System.out.println("code: " + l.getCode());
            }
            System.out.println("##### END LANGUAGES #####");
            System.out.println("========================================");        
        }
    }

 	// #################### xContacts ####################
    //RETURN ALL CONTACTS
    public static void XContacts_GetXSContacts(RicOneApiClient ricOne)
    {
        for(XContactType c : ricOne.sifXpress.GetXContacts())
        {
            System.out.println("refId: " + c.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + c.getName().getType());
            System.out.println("prefix: " + c.getName().getPrefix());
            System.out.println("familyName: " + c.getName().getFamilyName());
            System.out.println("givenName: " + c.getName().getGivenName());
            System.out.println("middleName: " + c.getName().getMiddleName());
            System.out.println("suffix: " + c.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("##### BEGIN OTHERNAME #####");
            for(XPersonNameType n : c.getOtherNames().getName())
            {
                System.out.println("type: " + n.getType());
                System.out.println("prefix: " + n.getPrefix());
                System.out.println("familyName: " + n.getFamilyName());
                System.out.println("givenName: " + n.getGivenName());
                System.out.println("middleName: " + n.getMiddleName());
                System.out.println("suffix: " + n.getSuffix());
            }
            System.out.println("##### END OTHERNAME #####");

            System.out.println("localId: " + c.getLocalId());
            System.out.println("loginId: " + c.getLoginId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : c.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + c.getAddress().getAddressType());
            System.out.println("city: " + c.getAddress().getCity());
            System.out.println("line1: " + c.getAddress().getLine1());
            System.out.println("line2: " + c.getAddress().getLine2());
            System.out.println("countryCode: " + c.getAddress().getCountryCode());
            System.out.println("postalCode: " + c.getAddress().getPostalCode());
            System.out.println("stateProvince: " + c.getAddress().getStateProvince());
            System.out.println("number: " + c.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBERS #####");
            System.out.println("number: " + c.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBERS #####");
            System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
            for(XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBERS #####");
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + c.getEmail().getEmailType());
            System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN OTHEREMAILS #####");
            for(XEmailType e : c.getOtherEmails().getEmail())
            {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println("sex: " + c.getSex());
            System.out.println("employerType: " + c.getEmployerType());
            System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
            for(XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
            {
                System.out.println("studentRefId: " + csr.getStudentRefId());
                System.out.println("relationshipCode: " + csr.getRelationshipCode());
                System.out.println("restrictions: " + csr.getRestrictions());
                System.out.println("livesWith: " + csr.isLivesWith());
                System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
                System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
                System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
                System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
                System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
                System.out.println("contactSequence: " + csr.getContactSequence());
            }
            System.out.println("##### END CONTACTRELATIONSHIPS #####");
            System.out.println("========================================");
        }
    }
    //RETURN SINGLE CONTACT
    public static void XContacts_GetXSContact(RicOneApiClient ricOne)
    {
        XContactType c = ricOne.sifXpress.GetXContact(refId);

        System.out.println("refId: " + c.getRefId());
        System.out.println("##### BEGIN NAME #####");
        System.out.println("type: " + c.getName().getType());
        System.out.println("prefix: " + c.getName().getPrefix());
        System.out.println("familyName: " + c.getName().getFamilyName());
        System.out.println("givenName: " + c.getName().getGivenName());
        System.out.println("middleName: " + c.getName().getMiddleName());
        System.out.println("suffix: " + c.getName().getSuffix());
        System.out.println("##### END NAME #####");
        System.out.println("##### BEGIN OTHERNAME #####");
        for(XPersonNameType n : c.getOtherNames().getName())
        {
            System.out.println("type: " + n.getType());
            System.out.println("prefix: " + n.getPrefix());
            System.out.println("familyName: " + n.getFamilyName());
            System.out.println("givenName: " + n.getGivenName());
            System.out.println("middleName: " + n.getMiddleName());
            System.out.println("suffix: " + n.getSuffix());
        }
        System.out.println("##### END OTHERNAME #####");

        System.out.println("localId: " + c.getLocalId());
        System.out.println("loginId: " + c.getLoginId());
        System.out.println("##### BEGIN OTHERIDS #####");
        for(XOtherPersonIdType id : c.getOtherIds().getOtherId())
        {
            System.out.println("id: " + id.getId());
            System.out.println("type: " + id.getType());
        }
        System.out.println("##### END OTHERIDS #####");
        System.out.println("##### BEGIN ADDRESS #####");
        System.out.println("addressType: " + c.getAddress().getAddressType());
        System.out.println("city: " + c.getAddress().getCity());
        System.out.println("line1: " + c.getAddress().getLine1());
        System.out.println("line2: " + c.getAddress().getLine2());
        System.out.println("countryCode: " + c.getAddress().getCountryCode());
        System.out.println("postalCode: " + c.getAddress().getPostalCode());
        System.out.println("stateProvince: " + c.getAddress().getStateProvince());
        System.out.println("number: " + c.getPhoneNumber().getNumber());
        System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
        System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
        System.out.println("##### END ADDRESS #####");
        System.out.println("##### BEGIN PHONENUMBERS #####");
        System.out.println("number: " + c.getPhoneNumber().getNumber());
        System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
        System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
        System.out.println("##### END PHONENUMBERS #####");
        System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
        for(XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
        {
            System.out.println("otherPhoneNumbers number: " + p.getNumber());
            System.out.println("phoneNumberType: " + p.getPhoneNumberType());
            System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
        }
        System.out.println("##### END OTHERPHONENUMBERS #####");
        System.out.println("##### BEGIN EMAIL #####");
        System.out.println("emailType: " + c.getEmail().getEmailType());
        System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
        System.out.println("##### END EMAIL #####");
        System.out.println("##### BEGIN OTHEREMAILS #####");
        for(XEmailType e : c.getOtherEmails().getEmail())
        {
            System.out.println("emailType: " + e.getEmailType());
            System.out.println("emailAddress: " + e.getEmailAddress());
        }
        System.out.println("##### END OTHEREMAILS #####");
        System.out.println("sex: " + c.getSex());
        System.out.println("employerType: " + c.getEmployerType());
        System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
        for(XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
        {
            System.out.println("studentRefId: " + csr.getStudentRefId());
            System.out.println("relationshipCode: " + csr.getRelationshipCode());
            System.out.println("restrictions: " + csr.getRestrictions());
            System.out.println("livesWith: " + csr.isLivesWith());
            System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
            System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
            System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
            System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
            System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
            System.out.println("contactSequence: " + csr.getContactSequence());
        }
        System.out.println("##### END CONTACTRELATIONSHIPS #####");
        System.out.println("========================================");
    }
    //RETURN CONTACTS BY LEA
    public static void XContacts_GetXContactsByXLea(RicOneApiClient ricOne)
    {
        for(XContactType c : ricOne.sifXpress.GetXContactsByXLea(refId))
        {
        	System.out.println("refId: " + c.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + c.getName().getType());
            System.out.println("prefix: " + c.getName().getPrefix());
            System.out.println("familyName: " + c.getName().getFamilyName());
            System.out.println("givenName: " + c.getName().getGivenName());
            System.out.println("middleName: " + c.getName().getMiddleName());
            System.out.println("suffix: " + c.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("##### BEGIN OTHERNAME #####");
            for(XPersonNameType n : c.getOtherNames().getName())
            {
                System.out.println("type: " + n.getType());
                System.out.println("prefix: " + n.getPrefix());
                System.out.println("familyName: " + n.getFamilyName());
                System.out.println("givenName: " + n.getGivenName());
                System.out.println("middleName: " + n.getMiddleName());
                System.out.println("suffix: " + n.getSuffix());
            }
            System.out.println("##### END OTHERNAME #####");

            System.out.println("localId: " + c.getLocalId());
            System.out.println("loginId: " + c.getLoginId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : c.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + c.getAddress().getAddressType());
            System.out.println("city: " + c.getAddress().getCity());
            System.out.println("line1: " + c.getAddress().getLine1());
            System.out.println("line2: " + c.getAddress().getLine2());
            System.out.println("countryCode: " + c.getAddress().getCountryCode());
            System.out.println("postalCode: " + c.getAddress().getPostalCode());
            System.out.println("stateProvince: " + c.getAddress().getStateProvince());
            System.out.println("number: " + c.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBERS #####");
            System.out.println("number: " + c.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBERS #####");
            System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
            for(XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBERS #####");
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + c.getEmail().getEmailType());
            System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN OTHEREMAILS #####");
            for(XEmailType e : c.getOtherEmails().getEmail())
            {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println("sex: " + c.getSex());
            System.out.println("employerType: " + c.getEmployerType());
            System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
            for(XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
            {
                System.out.println("studentRefId: " + csr.getStudentRefId());
                System.out.println("relationshipCode: " + csr.getRelationshipCode());
                System.out.println("restrictions: " + csr.getRestrictions());
                System.out.println("livesWith: " + csr.isLivesWith());
                System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
                System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
                System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
                System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
                System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
                System.out.println("contactSequence: " + csr.getContactSequence());
            }
            System.out.println("##### END CONTACTRELATIONSHIPS #####");
            System.out.println("========================================");
        }
    }
    //RETURN CONTACTS BY SCHOOL
    public static void XContacts_GetXContactsByXSchool(RicOneApiClient ricOne)
    {
        for(XContactType c : ricOne.sifXpress.GetXContactsByXSchool(refId))
        {
        	System.out.println("refId: " + c.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + c.getName().getType());
            System.out.println("prefix: " + c.getName().getPrefix());
            System.out.println("familyName: " + c.getName().getFamilyName());
            System.out.println("givenName: " + c.getName().getGivenName());
            System.out.println("middleName: " + c.getName().getMiddleName());
            System.out.println("suffix: " + c.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("##### BEGIN OTHERNAME #####");
            for(XPersonNameType n : c.getOtherNames().getName())
            {
                System.out.println("type: " + n.getType());
                System.out.println("prefix: " + n.getPrefix());
                System.out.println("familyName: " + n.getFamilyName());
                System.out.println("givenName: " + n.getGivenName());
                System.out.println("middleName: " + n.getMiddleName());
                System.out.println("suffix: " + n.getSuffix());
            }
            System.out.println("##### END OTHERNAME #####");

            System.out.println("localId: " + c.getLocalId());
            System.out.println("loginId: " + c.getLoginId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : c.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + c.getAddress().getAddressType());
            System.out.println("city: " + c.getAddress().getCity());
            System.out.println("line1: " + c.getAddress().getLine1());
            System.out.println("line2: " + c.getAddress().getLine2());
            System.out.println("countryCode: " + c.getAddress().getCountryCode());
            System.out.println("postalCode: " + c.getAddress().getPostalCode());
            System.out.println("stateProvince: " + c.getAddress().getStateProvince());
            System.out.println("number: " + c.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBERS #####");
            System.out.println("number: " + c.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBERS #####");
            System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
            for(XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBERS #####");
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + c.getEmail().getEmailType());
            System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN OTHEREMAILS #####");
            for(XEmailType e : c.getOtherEmails().getEmail())
            {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println("sex: " + c.getSex());
            System.out.println("employerType: " + c.getEmployerType());
            System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
            for(XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
            {
                System.out.println("studentRefId: " + csr.getStudentRefId());
                System.out.println("relationshipCode: " + csr.getRelationshipCode());
                System.out.println("restrictions: " + csr.getRestrictions());
                System.out.println("livesWith: " + csr.isLivesWith());
                System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
                System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
                System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
                System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
                System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
                System.out.println("contactSequence: " + csr.getContactSequence());
            }
            System.out.println("##### END CONTACTRELATIONSHIPS #####");
            System.out.println("========================================");
        }
    }
    //RETURN CONTACTS BY STUDENT
    public static void XContacts_GetXContactsByXStudent(RicOneApiClient ricOne)
    {
        for(XContactType c : ricOne.sifXpress.GetXContactsByXStudent(refId))
        {
        	System.out.println("refId: " + c.getRefId());
            System.out.println("##### BEGIN NAME #####");
            System.out.println("type: " + c.getName().getType());
            System.out.println("prefix: " + c.getName().getPrefix());
            System.out.println("familyName: " + c.getName().getFamilyName());
            System.out.println("givenName: " + c.getName().getGivenName());
            System.out.println("middleName: " + c.getName().getMiddleName());
            System.out.println("suffix: " + c.getName().getSuffix());
            System.out.println("##### END NAME #####");
            System.out.println("##### BEGIN OTHERNAME #####");
            for(XPersonNameType n : c.getOtherNames().getName())
            {
                System.out.println("type: " + n.getType());
                System.out.println("prefix: " + n.getPrefix());
                System.out.println("familyName: " + n.getFamilyName());
                System.out.println("givenName: " + n.getGivenName());
                System.out.println("middleName: " + n.getMiddleName());
                System.out.println("suffix: " + n.getSuffix());
            }
            System.out.println("##### END OTHERNAME #####");

            System.out.println("localId: " + c.getLocalId());
            System.out.println("loginId: " + c.getLoginId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for(XOtherPersonIdType id : c.getOtherIds().getOtherId())
            {
                System.out.println("id: " + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("##### BEGIN ADDRESS #####");
            System.out.println("addressType: " + c.getAddress().getAddressType());
            System.out.println("city: " + c.getAddress().getCity());
            System.out.println("line1: " + c.getAddress().getLine1());
            System.out.println("line2: " + c.getAddress().getLine2());
            System.out.println("countryCode: " + c.getAddress().getCountryCode());
            System.out.println("postalCode: " + c.getAddress().getPostalCode());
            System.out.println("stateProvince: " + c.getAddress().getStateProvince());
            System.out.println("number: " + c.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END ADDRESS #####");
            System.out.println("##### BEGIN PHONENUMBERS #####");
            System.out.println("number: " + c.getPhoneNumber().getNumber());
            System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
            System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
            System.out.println("##### END PHONENUMBERS #####");
            System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
            for(XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBERS #####");
            System.out.println("##### BEGIN EMAIL #####");
            System.out.println("emailType: " + c.getEmail().getEmailType());
            System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
            System.out.println("##### END EMAIL #####");
            System.out.println("##### BEGIN OTHEREMAILS #####");
            for(XEmailType e : c.getOtherEmails().getEmail())
            {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println("sex: " + c.getSex());
            System.out.println("employerType: " + c.getEmployerType());
            System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
            for(XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
            {
                System.out.println("studentRefId: " + csr.getStudentRefId());
                System.out.println("relationshipCode: " + csr.getRelationshipCode());
                System.out.println("restrictions: " + csr.getRestrictions());
                System.out.println("livesWith: " + csr.isLivesWith());
                System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
                System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
                System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
                System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
                System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
                System.out.println("contactSequence: " + csr.getContactSequence());
            }
            System.out.println("##### END CONTACTRELATIONSHIPS #####");
            System.out.println("========================================");
        }
    }
    
 // #################### navigatonLastPage ####################
	// #################### xLeas ####################
	//RETURN ALL LEAS
//	public static void XLeas_GetXLeasLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXLeas); i++)
//		{
//			for (XLeaType lea : ricOne.sifXpress.GetXLeas())
//			{
//
//				System.out.println("refId: " + lea.getRefId());
//				System.out.println("leaName: " + lea.getLeaName());
//				System.out.println("leaRefId: " + lea.getLeaRefId());
//				System.out.println("localId: " + lea.getLocalId());
//				System.out.println("ncesId: " + lea.getNcesId());
//				System.out.println("stateProvinceId: " + lea.getStateProvinceId());
//
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + lea.getAddress().getAddressType());
//				System.out.println("city: " + lea.getAddress().getCity());
//				System.out.println("line1: " + lea.getAddress().getLine1());
//				System.out.println("line2: " + lea.getAddress().getLine2());
//				System.out.println("countryCode: " + lea.getAddress().getCountryCode());
//				System.out.println("postalCode: " + lea.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + lea.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//
//				for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN LEAS BY SCHOOL
//	public static void XLeas_GetXLeasByXSchoolLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXLeasByXSchool, refId); i++)
//		{
//			for (XLeaType lea : ricOne.sifXpress.GetXLeasByXSchool(refId))
//			{
//				System.out.println("refId: " + lea.getRefId());
//				System.out.println("leaName: " + lea.getLeaName());
//				System.out.println("leaRefId: " + lea.getLeaRefId());
//				System.out.println("localId: " + lea.getLocalId());
//				System.out.println("ncesId: " + lea.getNcesId());
//				System.out.println("stateProvinceId: " + lea.getStateProvinceId());
//
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + lea.getAddress().getAddressType());
//				System.out.println("city: " + lea.getAddress().getCity());
//				System.out.println("line1: " + lea.getAddress().getLine1());
//				System.out.println("line2: " + lea.getAddress().getLine2());
//				System.out.println("countryCode: " + lea.getAddress().getCountryCode());
//				System.out.println("postalCode: " + lea.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + lea.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//
//				for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//	// RETURN LEAS BY SCHOOL
//	public static void XLeas_GetXLeasByXRosterLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXLeasByXRoster, refId); i++)
//		{
//			for (XLeaType lea : ricOne.sifXpress.GetXLeasByXRoster(refId))
//			{
//				System.out.println("refId: " + lea.getRefId());
//				System.out.println("leaName: " + lea.getLeaName());
//				System.out.println("leaRefId: " + lea.getLeaRefId());
//				System.out.println("localId: " + lea.getLocalId());
//				System.out.println("ncesId: " + lea.getNcesId());
//				System.out.println("stateProvinceId: " + lea.getStateProvinceId());
//
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + lea.getAddress().getAddressType());
//				System.out.println("city: " + lea.getAddress().getCity());
//				System.out.println("line1: " + lea.getAddress().getLine1());
//				System.out.println("line2: " + lea.getAddress().getLine2());
//				System.out.println("countryCode: " + lea.getAddress().getCountryCode());
//				System.out.println("postalCode: " + lea.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + lea.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//
//				for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//	// RETURN LEAS BY STAFF
//	public static void XLeas_GetXLeasByXStaffLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXLeasByXStaff, refId); i++)
//		{
//			for (XLeaType lea : ricOne.sifXpress.GetXLeasByXStaff(refId))
//			{
//				System.out.println("refId: " + lea.getRefId());
//				System.out.println("leaName: " + lea.getLeaName());
//				System.out.println("leaRefId: " + lea.getLeaRefId());
//				System.out.println("localId: " + lea.getLocalId());
//				System.out.println("ncesId: " + lea.getNcesId());
//				System.out.println("stateProvinceId: " + lea.getStateProvinceId());
//
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + lea.getAddress().getAddressType());
//				System.out.println("city: " + lea.getAddress().getCity());
//				System.out.println("line1: " + lea.getAddress().getLine1());
//				System.out.println("line2: " + lea.getAddress().getLine2());
//				System.out.println("countryCode: " + lea.getAddress().getCountryCode());
//				System.out.println("postalCode: " + lea.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + lea.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//
//				for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN LEAS BY STUDENT
//	public static void XLeas_GetXLeasByXStudentLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXLeasByXStudent, refId); i++)
//		{
//			for (XLeaType lea : ricOne.sifXpress.GetXLeasByXStudent(refId))
//			{
//				System.out.println("refId: " + lea.getRefId());
//				System.out.println("leaName: " + lea.getLeaName());
//				System.out.println("leaRefId: " + lea.getLeaRefId());
//				System.out.println("localId: " + lea.getLocalId());
//				System.out.println("ncesId: " + lea.getNcesId());
//				System.out.println("stateProvinceId: " + lea.getStateProvinceId());
//
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + lea.getAddress().getAddressType());
//				System.out.println("city: " + lea.getAddress().getCity());
//				System.out.println("line1: " + lea.getAddress().getLine1());
//				System.out.println("line2: " + lea.getAddress().getLine2());
//				System.out.println("countryCode: " + lea.getAddress().getCountryCode());
//				System.out.println("postalCode: " + lea.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + lea.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//
//				for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN LEAS BY CONTACT
//	public static void XLeas_GetXLeasByXContactLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXLeasByXContact, refId); i++)
//		{
//			for (XLeaType lea : ricOne.sifXpress.GetXLeasByXContact(refId))
//			{
//				System.out.println("refId: " + lea.getRefId());
//				System.out.println("leaName: " + lea.getLeaName());
//				System.out.println("leaRefId: " + lea.getLeaRefId());
//				System.out.println("localId: " + lea.getLocalId());
//				System.out.println("ncesId: " + lea.getNcesId());
//				System.out.println("stateProvinceId: " + lea.getStateProvinceId());
//
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + lea.getAddress().getAddressType());
//				System.out.println("city: " + lea.getAddress().getCity());
//				System.out.println("line1: " + lea.getAddress().getLine1());
//				System.out.println("line2: " + lea.getAddress().getLine2());
//				System.out.println("countryCode: " + lea.getAddress().getCountryCode());
//				System.out.println("postalCode: " + lea.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + lea.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + lea.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + lea.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + lea.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//
//				for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//    
//    // #################### xSchools ####################
//	// RETURN ALL SCHOOLS
//	public static void XSchools_GetXSchoolsLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXSchools); i++)
//		{
//			for (XSchoolType school : ricOne.sifXpress.GetXSchools())
//			{
//				System.out.println("refId: " + school.getRefId());
//				System.out.println("leaRefId: " + school.getRefId());
//				System.out.println("localId: " + school.getLocalId());
//				System.out.println("stateProvinceId: " + school.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
//				{
//					System.out.println("otherId id" + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("schoolName: " + school.getSchoolName());
//				System.out.println("##### BEGIN YEARGROUPS #####");
//				for (String yg : school.getYearGroups().getYearGroup())
//				{
//					System.out.println("yearGroup: " + yg);
//				}
//				System.out.println("##### END YEARGROUPS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + school.getAddress().getAddressType());
//				System.out.println("city: " + school.getAddress().getCity());
//				System.out.println("line1: " + school.getAddress().getLine1());
//				System.out.println("line2: " + school.getAddress().getLine2());
//				System.out.println("countryCode: " + school.getAddress().getCountryCode());
//				System.out.println("postalCode: " + school.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + school.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN SCHOOLS BY LEA
//	public static void XSchools_GetXSchoolsByXLeaLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXSchoolsByXLea, refId); i++)
//		{
//			for (XSchoolType school : ricOne.sifXpress.GetXSchoolsByXLea(refId))
//			{
//				System.out.println("refId: " + school.getRefId());
//				System.out.println("leaRefId: " + school.getRefId());
//				System.out.println("localId: " + school.getLocalId());
//				System.out.println("stateProvinceId: " + school.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
//				{
//					System.out.println("otherId id" + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("schoolName: " + school.getSchoolName());
//				System.out.println("##### BEGIN YEARGROUPS #####");
//				for (String yg : school.getYearGroups().getYearGroup())
//				{
//					System.out.println("yearGroup: " + yg);
//				}
//				System.out.println("##### END YEARGROUPS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + school.getAddress().getAddressType());
//				System.out.println("city: " + school.getAddress().getCity());
//				System.out.println("line1: " + school.getAddress().getLine1());
//				System.out.println("line2: " + school.getAddress().getLine2());
//				System.out.println("countryCode: " + school.getAddress().getCountryCode());
//				System.out.println("postalCode: " + school.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + school.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN SCHOOLS BY CALENDAR
//	public static void XSchools_GetXSchoolsByXCalendarLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXSchoolsByXCalendar, refId); i++)
//		{
//			for (XSchoolType school : ricOne.sifXpress.GetXSchoolsByXCalendar(refId))
//			{
//				System.out.println("refId: " + school.getRefId());
//				System.out.println("leaRefId: " + school.getRefId());
//				System.out.println("localId: " + school.getLocalId());
//				System.out.println("stateProvinceId: " + school.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
//				{
//					System.out.println("otherId id" + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("schoolName: " + school.getSchoolName());
//				System.out.println("##### BEGIN YEARGROUPS #####");
//				for (String yg : school.getYearGroups().getYearGroup())
//				{
//					System.out.println("yearGroup: " + yg);
//				}
//				System.out.println("##### END YEARGROUPS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + school.getAddress().getAddressType());
//				System.out.println("city: " + school.getAddress().getCity());
//				System.out.println("line1: " + school.getAddress().getLine1());
//				System.out.println("line2: " + school.getAddress().getLine2());
//				System.out.println("countryCode: " + school.getAddress().getCountryCode());
//				System.out.println("postalCode: " + school.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + school.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN SCHOOLS BY COURSE
//	public static void XSchools_GetXSchoolsByXCourseLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXSchoolsByXCourse, refId); i++)
//		{
//			for (XSchoolType school : ricOne.sifXpress.GetXSchoolsByXCourse(refId))
//			{
//				System.out.println("refId: " + school.getRefId());
//				System.out.println("leaRefId: " + school.getRefId());
//				System.out.println("localId: " + school.getLocalId());
//				System.out.println("stateProvinceId: " + school.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
//				{
//					System.out.println("otherId id" + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("schoolName: " + school.getSchoolName());
//				System.out.println("##### BEGIN YEARGROUPS #####");
//				for (String yg : school.getYearGroups().getYearGroup())
//				{
//					System.out.println("yearGroup: " + yg);
//				}
//				System.out.println("##### END YEARGROUPS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + school.getAddress().getAddressType());
//				System.out.println("city: " + school.getAddress().getCity());
//				System.out.println("line1: " + school.getAddress().getLine1());
//				System.out.println("line2: " + school.getAddress().getLine2());
//				System.out.println("countryCode: " + school.getAddress().getCountryCode());
//				System.out.println("postalCode: " + school.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + school.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN SCHOOLS BY ROSTER
//	public static void XSchools_GetXSchoolsByXRosterLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXSchoolsByXRoster, refId); i++)
//		{
//			for (XSchoolType school : ricOne.sifXpress.GetXSchoolsByXRoster(refId))
//			{
//				System.out.println("refId: " + school.getRefId());
//				System.out.println("leaRefId: " + school.getRefId());
//				System.out.println("localId: " + school.getLocalId());
//				System.out.println("stateProvinceId: " + school.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
//				{
//					System.out.println("otherId id" + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("schoolName: " + school.getSchoolName());
//				System.out.println("##### BEGIN YEARGROUPS #####");
//				for (String yg : school.getYearGroups().getYearGroup())
//				{
//					System.out.println("yearGroup: " + yg);
//				}
//				System.out.println("##### END YEARGROUPS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + school.getAddress().getAddressType());
//				System.out.println("city: " + school.getAddress().getCity());
//				System.out.println("line1: " + school.getAddress().getLine1());
//				System.out.println("line2: " + school.getAddress().getLine2());
//				System.out.println("countryCode: " + school.getAddress().getCountryCode());
//				System.out.println("postalCode: " + school.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + school.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN SCHOOLS BY STAFF
//	public static void XSchools_GetXSchoolsByXStaffLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXSchoolsByXStaff, refId); i++)
//		{
//			for (XSchoolType school : ricOne.sifXpress.GetXSchoolsByXStaff(refId))
//			{
//				System.out.println("refId: " + school.getRefId());
//				System.out.println("leaRefId: " + school.getRefId());
//				System.out.println("localId: " + school.getLocalId());
//				System.out.println("stateProvinceId: " + school.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
//				{
//					System.out.println("otherId id" + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("schoolName: " + school.getSchoolName());
//				System.out.println("##### BEGIN YEARGROUPS #####");
//				for (String yg : school.getYearGroups().getYearGroup())
//				{
//					System.out.println("yearGroup: " + yg);
//				}
//				System.out.println("##### END YEARGROUPS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + school.getAddress().getAddressType());
//				System.out.println("city: " + school.getAddress().getCity());
//				System.out.println("line1: " + school.getAddress().getLine1());
//				System.out.println("line2: " + school.getAddress().getLine2());
//				System.out.println("countryCode: " + school.getAddress().getCountryCode());
//				System.out.println("postalCode: " + school.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + school.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN SCHOOLS BY STUDENT
//	public static void XSchools_GetXSchoolsByXStudentLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXSchoolsByXStudent, refId); i++)
//		{
//			for (XSchoolType school : ricOne.sifXpress.GetXSchoolsByXStudent(refId))
//			{
//				System.out.println("refId: " + school.getRefId());
//				System.out.println("leaRefId: " + school.getRefId());
//				System.out.println("localId: " + school.getLocalId());
//				System.out.println("stateProvinceId: " + school.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
//				{
//					System.out.println("otherId id" + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("schoolName: " + school.getSchoolName());
//				System.out.println("##### BEGIN YEARGROUPS #####");
//				for (String yg : school.getYearGroups().getYearGroup())
//				{
//					System.out.println("yearGroup: " + yg);
//				}
//				System.out.println("##### END YEARGROUPS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + school.getAddress().getAddressType());
//				System.out.println("city: " + school.getAddress().getCity());
//				System.out.println("line1: " + school.getAddress().getLine1());
//				System.out.println("line2: " + school.getAddress().getLine2());
//				System.out.println("countryCode: " + school.getAddress().getCountryCode());
//				System.out.println("postalCode: " + school.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + school.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN SCHOOLS BY CONTACT
//	public static void XSchools_GetXSchoolsByXContactLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXSchoolsByXContact, refId); i++)
//		{
//			for (XSchoolType school : ricOne.sifXpress.GetXSchoolsByXContact(refId))
//			{
//				System.out.println("refId: " + school.getRefId());
//				System.out.println("leaRefId: " + school.getRefId());
//				System.out.println("localId: " + school.getLocalId());
//				System.out.println("stateProvinceId: " + school.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
//				{
//					System.out.println("otherId id" + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("schoolName: " + school.getSchoolName());
//				System.out.println("##### BEGIN YEARGROUPS #####");
//				for (String yg : school.getYearGroups().getYearGroup())
//				{
//					System.out.println("yearGroup: " + yg);
//				}
//				System.out.println("##### END YEARGROUPS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + school.getAddress().getAddressType());
//				System.out.println("city: " + school.getAddress().getCity());
//				System.out.println("line1: " + school.getAddress().getLine1());
//				System.out.println("line2: " + school.getAddress().getLine2());
//				System.out.println("countryCode: " + school.getAddress().getCountryCode());
//				System.out.println("postalCode: " + school.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + school.getAddress().getStateProvince());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBER #####");
//				System.out.println("number: " + school.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + school.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + school.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBER #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBER #####");
//				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBER #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//    
//    // #################### xCalendars ####################
//	// RETURN ALL CALENDARS
//	public static void XCalendars_GetXCalendarsLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXCalendars); i++)
//		{
//			for (XCalendarType calendar : ricOne.sifXpress.GetXCalendars())
//			{
//				System.out.println("refId: " + calendar.getRefId());
//				System.out.println("schoolRefId: " + calendar.getSchoolRefId());
//				System.out.println("schoolYear: " + calendar.getSchoolYear());
//				System.out.println("##### BEGIN SESSIONLIST #####");
//				for (XSessionType sl : calendar.getSessions().getSessionList())
//				{
//					System.out.println("sessionType: " + sl.getSessionType());
//					System.out.println("sessionCode: " + sl.getSessionCode());
//					System.out.println("description: " + sl.getDescription());
//					System.out.println("markingTerm: " + sl.isMarkingTerm());
//					System.out.println("schedulingTerm: " + sl.isSchedulingTerm());
//					System.out.println("linkedSessionCode: " + sl.getSessionCode());
//					System.out.println("startDate: " + sl.getStartDate());
//					System.out.println("endDate: " + sl.getEndDate());
//				}
//				System.out.println("##### END SESSIONLIST #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//	// RETURN CALENDARS BY LEA
//	public static void XCalendars_GetXCalendarsByXLeaLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXCalendarsByXLea, refId); i++)
//		{
//			for (XCalendarType calendar : ricOne.sifXpress.GetXCalendarsByXLea(refId))
//			{
//				System.out.println("refId: " + calendar.getRefId());
//				System.out.println("schoolRefId: " + calendar.getSchoolRefId());
//				System.out.println("schoolYear: " + calendar.getSchoolYear());
//				System.out.println("##### BEGIN SESSIONLIST #####");
//				for (XSessionType sl : calendar.getSessions().getSessionList())
//				{
//					System.out.println("sessionType: " + sl.getSessionType());
//					System.out.println("sessionCode: " + sl.getSessionCode());
//					System.out.println("description: " + sl.getDescription());
//					System.out.println("markingTerm: " + sl.isMarkingTerm());
//					System.out.println("schedulingTerm: " + sl.isSchedulingTerm());
//					System.out.println("linkedSessionCode: " + sl.getSessionCode());
//					System.out.println("startDate: " + sl.getStartDate());
//					System.out.println("endDate: " + sl.getEndDate());
//				}
//				System.out.println("##### END SESSIONLIST #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN CALENDARS BY SCHOOL
//	public static void XCalendars_GetXCalendarsByXSchoolLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXCalendarsByXSchool, refId); i++)
//		{
//			for (XCalendarType calendar : ricOne.sifXpress.GetXCalendarsByXSchool(refId))
//			{
//				System.out.println("refId: " + calendar.getRefId());
//				System.out.println("schoolRefId: " + calendar.getSchoolRefId());
//				System.out.println("schoolYear: " + calendar.getSchoolYear());
//				System.out.println("##### BEGIN SESSIONLIST #####");
//				for (XSessionType sl : calendar.getSessions().getSessionList())
//				{
//					System.out.println("sessionType: " + sl.getSessionType());
//					System.out.println("sessionCode: " + sl.getSessionCode());
//					System.out.println("description: " + sl.getDescription());
//					System.out.println("markingTerm: " + sl.isMarkingTerm());
//					System.out.println("schedulingTerm: " + sl.isSchedulingTerm());
//					System.out.println("linkedSessionCode: " + sl.getSessionCode());
//					System.out.println("startDate: " + sl.getStartDate());
//					System.out.println("endDate: " + sl.getEndDate());
//				}
//				System.out.println("##### END SESSIONLIST #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//    
//    // #################### xCourses ####################
//	// RETURN ALL COURSES
//	public static void XCourses_GetXCoursesLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXCourses); i++)
//		{
//			for (XCourseType course : ricOne.sifXpress.GetXCourses())
//			{
//				System.out.println("refId: " + course.getRefId());
//				System.out.println("schoolRefId: " + course.getSchoolRefId());
//				System.out.println("schoolCourseId: " + course.getSchoolCourseId());
//				System.out.println("leaCourseId: " + course.getLeaCourseId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherCourseIdType id : course.getOtherIds().getOtherId())
//				{
//					System.out.println("otherId id" + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("courseTitle: " + course.getCourseTitle());
//				System.out.println("description: " + course.getDescription());
//				System.out.println("subject: " + course.getSubject());
//				System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
//				for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
//				{
//					System.out.println("applicableEducationLevel: " + ael);
//				}
//				System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
//				System.out.println("scedCourseCode: " + course.getScedCourseCode());
//				System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
//				System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());
//
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN COURSES BY LEA
//	public static void XCourses_GetXCoursesByXLeaLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXCoursesByXLea, refId); i++)
//		{
//			for (XCourseType course : ricOne.sifXpress.GetXCoursesByXLea(refId))
//			{
//				System.out.println("refId: " + course.getRefId());
//				System.out.println("schoolRefId: " + course.getSchoolRefId());
//				System.out.println("schoolCourseId: " + course.getSchoolCourseId());
//				System.out.println("leaCourseId: " + course.getLeaCourseId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherCourseIdType id : course.getOtherIds().getOtherId())
//				{
//					System.out.println("otherId id" + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("courseTitle: " + course.getCourseTitle());
//				System.out.println("description: " + course.getDescription());
//				System.out.println("subject: " + course.getSubject());
//				System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
//				for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
//				{
//					System.out.println("applicableEducationLevel: " + ael);
//				}
//				System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
//				System.out.println("scedCourseCode: " + course.getScedCourseCode());
//				System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
//				System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());
//
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//	// RETURN COURSES BY SCHOOL
//	public static void XCourses_GetXCoursesByXSchoolLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXCoursesByXSchool, refId); i++)
//		{
//			for (XCourseType course : ricOne.sifXpress.GetXCoursesByXSchool(refId))
//			{
//				System.out.println("refId: " + course.getRefId());
//				System.out.println("schoolRefId: " + course.getSchoolRefId());
//				System.out.println("schoolCourseId: " + course.getSchoolCourseId());
//				System.out.println("leaCourseId: " + course.getLeaCourseId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherCourseIdType id : course.getOtherIds().getOtherId())
//				{
//					System.out.println("otherId id" + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("courseTitle: " + course.getCourseTitle());
//				System.out.println("description: " + course.getDescription());
//				System.out.println("subject: " + course.getSubject());
//				System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
//				for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
//				{
//					System.out.println("applicableEducationLevel: " + ael);
//				}
//				System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
//				System.out.println("scedCourseCode: " + course.getScedCourseCode());
//				System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
//				System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());
//
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//	// RETURN COURSES BY ROSTER
//	public static void XCourses_GetXCoursesByXRosterLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXCoursesByXRoster, refId); i++)
//		{
//			for (XCourseType course : ricOne.sifXpress.GetXCoursesByXRoster(refId))
//			{
//				System.out.println("refId: " + course.getRefId());
//				System.out.println("schoolRefId: " + course.getSchoolRefId());
//				System.out.println("schoolCourseId: " + course.getSchoolCourseId());
//				System.out.println("leaCourseId: " + course.getLeaCourseId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherCourseIdType id : course.getOtherIds().getOtherId())
//				{
//					System.out.println("otherId id" + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("courseTitle: " + course.getCourseTitle());
//				System.out.println("description: " + course.getDescription());
//				System.out.println("subject: " + course.getSubject());
//				System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
//				for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
//				{
//					System.out.println("applicableEducationLevel: " + ael);
//				}
//				System.out.println("##### END APPLICABLEEDUCATIONLEVELS #####");
//				System.out.println("scedCourseCode: " + course.getScedCourseCode());
//				System.out.println("scedCourseLevelCode: " + course.getScedCourseLevelCode());
//				System.out.println("scedCourseSubjectAreaCode: " + course.getScedCourseSubjectAreaCode());
//
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
// 	
//    // #################### xRosters ####################
//	// RETURN ALL ROSTERS
//	public static void XRosters_GetXRostersLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXRosters); i++)
//		{
//			for (XRosterType r : ricOne.sifXpress.GetXRosters())
//			{
//				System.out.println("refId: " + r.getRefId());
//				System.out.println("courseRefId: " + r.getCourseRefId());
//				System.out.println("courseTitle: " + r.getCourseTitle());
//				System.out.println("sectionRefId: " + r.getSectionRefId());
//				System.out.println("subject: " + r.getSubject());
//				System.out.println("schoolRefId: " + r.getSchoolRefId());
//				System.out.println("schoolSectionId: " + r.getSchoolSectionId());
//				System.out.println("schoolYear: " + r.getSchoolYear());
//				System.out.println("sessionCode: " + r.getSessionCode());
//				System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
//
//				System.out.println("##### BEGIN MEETING TIMES #####");
//				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
//				{
//					System.out.println("timeTableDay: " + mt.getTimeTableDay());
//
//					System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
//					System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
//					System.out.println("roomNumber: " + mt.getRoomNumber());
//					System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
//					System.out.println("classEndingTime: " + mt.getClassEndingTime());
//				}
//				System.out.println("##### END MEETING TIMES #####");
//
//				System.out.println("##### BEGIN STUDENTS #####");
//				for (XPersonReferenceType student : r.getStudents().getStudentReference())
//				{
//					System.out.println("refId: " + student.getRefId());
//					System.out.println("localId: " + student.getLocalId());
//					System.out.println("givenName: " + student.getGivenName());
//					System.out.println("familyName: " + student.getFamilyName());
//				}
//				System.out.println("##### END STUDENTS #####");
//
//				System.out.println("##### BEGIN PRIMARY STAFF #####");
//				System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
//				System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
//				System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
//				System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
//				System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
//				System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
//				System.out.println("##### END PRIMARY STAFF #####");
//
//				System.out.println("##### BEGIN OTHER STAFF #####");
//				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
//				{
//					System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
//					System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
//					System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
//					System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
//					System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
//					System.out.println("percentResponsible: " + staff.getPercentResponsible());
//				}
//				System.out.println("##### END OTHER STAFF #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//
//	}
//
//	// RETURN ROSTERS BY LEA
//	public static void XRosters_GetXRostersByXLeaLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXRostersByXLea, refId); i++)
//		{
//			for (XRosterType r : ricOne.sifXpress.GetXRostersByXLea(refId))
//			{
//				System.out.println("refId: " + r.getRefId());
//				System.out.println("courseRefId: " + r.getCourseRefId());
//				System.out.println("courseTitle: " + r.getCourseTitle());
//				System.out.println("sectionRefId: " + r.getSectionRefId());
//				System.out.println("subject: " + r.getSubject());
//				System.out.println("schoolRefId: " + r.getSchoolRefId());
//				System.out.println("schoolSectionId: " + r.getSchoolSectionId());
//				System.out.println("schoolYear: " + r.getSchoolYear());
//				System.out.println("sessionCode: " + r.getSessionCode());
//				System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
//
//				System.out.println("##### BEGIN MEETING TIMES #####");
//				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
//				{
//					System.out.println("timeTableDay: " + mt.getTimeTableDay());
//
//					System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
//					System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
//					System.out.println("roomNumber: " + mt.getRoomNumber());
//					System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
//					System.out.println("classEndingTime: " + mt.getClassEndingTime());
//				}
//				System.out.println("##### END MEETING TIMES #####");
//
//				System.out.println("##### BEGIN STUDENTS #####");
//				for (XPersonReferenceType student : r.getStudents().getStudentReference())
//				{
//					System.out.println("refId: " + student.getRefId());
//					System.out.println("localId: " + student.getLocalId());
//					System.out.println("givenName: " + student.getGivenName());
//					System.out.println("familyName: " + student.getFamilyName());
//				}
//				System.out.println("##### END STUDENTS #####");
//
//				System.out.println("##### BEGIN PRIMARY STAFF #####");
//				System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
//				System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
//				System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
//				System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
//				System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
//				System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
//				System.out.println("##### END PRIMARY STAFF #####");
//
//				System.out.println("##### BEGIN OTHER STAFF #####");
//				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
//				{
//					System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
//					System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
//					System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
//					System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
//					System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
//					System.out.println("percentResponsible: " + staff.getPercentResponsible());
//				}
//				System.out.println("##### END OTHER STAFF #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN ROSTERS BY SCHOOL
//	public static void XRosters_GetXRostersByXSchoolLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXRostersByXSchool, refId); i++)
//		{
//			for (XRosterType r : ricOne.sifXpress.GetXRostersByXSchool(refId))
//			{
//				System.out.println("refId: " + r.getRefId());
//				System.out.println("courseRefId: " + r.getCourseRefId());
//				System.out.println("courseTitle: " + r.getCourseTitle());
//				System.out.println("sectionRefId: " + r.getSectionRefId());
//				System.out.println("subject: " + r.getSubject());
//				System.out.println("schoolRefId: " + r.getSchoolRefId());
//				System.out.println("schoolSectionId: " + r.getSchoolSectionId());
//				System.out.println("schoolYear: " + r.getSchoolYear());
//				System.out.println("sessionCode: " + r.getSessionCode());
//				System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
//
//				System.out.println("##### BEGIN MEETING TIMES #####");
//				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
//				{
//					System.out.println("timeTableDay: " + mt.getTimeTableDay());
//
//					System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
//					System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
//					System.out.println("roomNumber: " + mt.getRoomNumber());
//					System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
//					System.out.println("classEndingTime: " + mt.getClassEndingTime());
//				}
//				System.out.println("##### END MEETING TIMES #####");
//
//				System.out.println("##### BEGIN STUDENTS #####");
//				for (XPersonReferenceType student : r.getStudents().getStudentReference())
//				{
//					System.out.println("refId: " + student.getRefId());
//					System.out.println("localId: " + student.getLocalId());
//					System.out.println("givenName: " + student.getGivenName());
//					System.out.println("familyName: " + student.getFamilyName());
//				}
//				System.out.println("##### END STUDENTS #####");
//
//				System.out.println("##### BEGIN PRIMARY STAFF #####");
//				System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
//				System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
//				System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
//				System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
//				System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
//				System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
//				System.out.println("##### END PRIMARY STAFF #####");
//
//				System.out.println("##### BEGIN OTHER STAFF #####");
//				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
//				{
//					System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
//					System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
//					System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
//					System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
//					System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
//					System.out.println("percentResponsible: " + staff.getPercentResponsible());
//				}
//				System.out.println("##### END OTHER STAFF #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN ROSTERS BY CROUSE
//	public static void XRosters_GetXRostersByXCourseLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXRostersByXCourse, refId); i++)
//		{
//			for (XRosterType r : ricOne.sifXpress.GetXRostersByXCourse(refId))
//			{
//				System.out.println("refId: " + r.getRefId());
//				System.out.println("courseRefId: " + r.getCourseRefId());
//				System.out.println("courseTitle: " + r.getCourseTitle());
//				System.out.println("sectionRefId: " + r.getSectionRefId());
//				System.out.println("subject: " + r.getSubject());
//				System.out.println("schoolRefId: " + r.getSchoolRefId());
//				System.out.println("schoolSectionId: " + r.getSchoolSectionId());
//				System.out.println("schoolYear: " + r.getSchoolYear());
//				System.out.println("sessionCode: " + r.getSessionCode());
//				System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
//
//				System.out.println("##### BEGIN MEETING TIMES #####");
//				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
//				{
//					System.out.println("timeTableDay: " + mt.getTimeTableDay());
//
//					System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
//					System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
//					System.out.println("roomNumber: " + mt.getRoomNumber());
//					System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
//					System.out.println("classEndingTime: " + mt.getClassEndingTime());
//				}
//				System.out.println("##### END MEETING TIMES #####");
//
//				System.out.println("##### BEGIN STUDENTS #####");
//				for (XPersonReferenceType student : r.getStudents().getStudentReference())
//				{
//					System.out.println("refId: " + student.getRefId());
//					System.out.println("localId: " + student.getLocalId());
//					System.out.println("givenName: " + student.getGivenName());
//					System.out.println("familyName: " + student.getFamilyName());
//				}
//				System.out.println("##### END STUDENTS #####");
//
//				System.out.println("##### BEGIN PRIMARY STAFF #####");
//				System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
//				System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
//				System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
//				System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
//				System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
//				System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
//				System.out.println("##### END PRIMARY STAFF #####");
//
//				System.out.println("##### BEGIN OTHER STAFF #####");
//				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
//				{
//					System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
//					System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
//					System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
//					System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
//					System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
//					System.out.println("percentResponsible: " + staff.getPercentResponsible());
//				}
//				System.out.println("##### END OTHER STAFF #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN ROSTERS BY STAFF
//	public static void XRosters_GetXRostersByXStaffLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXRostersByXStaff, refId); i++)
//		{
//			for (XRosterType r : ricOne.sifXpress.GetXRostersByXStaff(refId))
//			{
//				System.out.println("refId: " + r.getRefId());
//				System.out.println("courseRefId: " + r.getCourseRefId());
//				System.out.println("courseTitle: " + r.getCourseTitle());
//				System.out.println("sectionRefId: " + r.getSectionRefId());
//				System.out.println("subject: " + r.getSubject());
//				System.out.println("schoolRefId: " + r.getSchoolRefId());
//				System.out.println("schoolSectionId: " + r.getSchoolSectionId());
//				System.out.println("schoolYear: " + r.getSchoolYear());
//				System.out.println("sessionCode: " + r.getSessionCode());
//				System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
//
//				System.out.println("##### BEGIN MEETING TIMES #####");
//				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
//				{
//					System.out.println("timeTableDay: " + mt.getTimeTableDay());
//
//					System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
//					System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
//					System.out.println("roomNumber: " + mt.getRoomNumber());
//					System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
//					System.out.println("classEndingTime: " + mt.getClassEndingTime());
//				}
//				System.out.println("##### END MEETING TIMES #####");
//
//				System.out.println("##### BEGIN STUDENTS #####");
//				for (XPersonReferenceType student : r.getStudents().getStudentReference())
//				{
//					System.out.println("refId: " + student.getRefId());
//					System.out.println("localId: " + student.getLocalId());
//					System.out.println("givenName: " + student.getGivenName());
//					System.out.println("familyName: " + student.getFamilyName());
//				}
//				System.out.println("##### END STUDENTS #####");
//
//				System.out.println("##### BEGIN PRIMARY STAFF #####");
//				System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
//				System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
//				System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
//				System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
//				System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
//				System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
//				System.out.println("##### END PRIMARY STAFF #####");
//
//				System.out.println("##### BEGIN OTHER STAFF #####");
//				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
//				{
//					System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
//					System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
//					System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
//					System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
//					System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
//					System.out.println("percentResponsible: " + staff.getPercentResponsible());
//				}
//				System.out.println("##### END OTHER STAFF #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN ROSTERS BY STUDENT
//	public static void XRosters_GetXRostersByXStudentLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXRostersByXStudent, refId); i++)
//		{
//			for (XRosterType r : ricOne.sifXpress.GetXRostersByXStudent(refId))
//			{
//				System.out.println("refId: " + r.getRefId());
//				System.out.println("courseRefId: " + r.getCourseRefId());
//				System.out.println("courseTitle: " + r.getCourseTitle());
//				System.out.println("sectionRefId: " + r.getSectionRefId());
//				System.out.println("subject: " + r.getSubject());
//				System.out.println("schoolRefId: " + r.getSchoolRefId());
//				System.out.println("schoolSectionId: " + r.getSchoolSectionId());
//				System.out.println("schoolYear: " + r.getSchoolYear());
//				System.out.println("sessionCode: " + r.getSessionCode());
//				System.out.println("schoolCalendarRefId: " + r.getSchoolCalendarRefId());
//
//				System.out.println("##### BEGIN MEETING TIMES #####");
//				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
//				{
//					System.out.println("timeTableDay: " + mt.getTimeTableDay());
//
//					System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
//					System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
//					System.out.println("roomNumber: " + mt.getRoomNumber());
//					System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
//					System.out.println("classEndingTime: " + mt.getClassEndingTime());
//				}
//				System.out.println("##### END MEETING TIMES #####");
//
//				System.out.println("##### BEGIN STUDENTS #####");
//				for (XPersonReferenceType student : r.getStudents().getStudentReference())
//				{
//					System.out.println("refId: " + student.getRefId());
//					System.out.println("localId: " + student.getLocalId());
//					System.out.println("givenName: " + student.getGivenName());
//					System.out.println("familyName: " + student.getFamilyName());
//				}
//				System.out.println("##### END STUDENTS #####");
//
//				System.out.println("##### BEGIN PRIMARY STAFF #####");
//				System.out.println("refId: " + r.getPrimaryStaff().getStaffPersonReference().getRefId());
//				System.out.println("localId: " + r.getPrimaryStaff().getStaffPersonReference().getLocalId());
//				System.out.println("givenName: " + r.getPrimaryStaff().getStaffPersonReference().getGivenName());
//				System.out.println("familyName: " + r.getPrimaryStaff().getStaffPersonReference().getFamilyName());
//				System.out.println("teacherOfRecord: " + r.getPrimaryStaff().isTeacherOfRecord());
//				System.out.println("percentResponsible: " + r.getPrimaryStaff().getPercentResponsible());
//				System.out.println("##### END PRIMARY STAFF #####");
//
//				System.out.println("##### BEGIN OTHER STAFF #####");
//				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
//				{
//					System.out.println("refId: " + staff.getStaffPersonReference().getRefId());
//					System.out.println("localId: " + staff.getStaffPersonReference().getLocalId());
//					System.out.println("givenName: " + staff.getStaffPersonReference().getGivenName());
//					System.out.println("familyName: " + staff.getStaffPersonReference().getFamilyName());
//					System.out.println("teacherOfRecord: " + staff.isTeacherOfRecord());
//					System.out.println("percentResponsible: " + staff.getPercentResponsible());
//				}
//				System.out.println("##### END OTHER STAFF #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
// 	
//    // #################### xStaffs ####################
//	// RETURN ALL STAFFS
//	public static void XStaffs_GetXStaffsLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXStaffs); i++)
//		{
//			for (XStaffType s : ricOne.sifXpress.GetXStaffs())
//			{
//				System.out.println("refId: " + s.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + s.getName().getType());
//				System.out.println("prefix: " + s.getName().getPrefix());
//				System.out.println("familyName: " + s.getName().getFamilyName());
//				System.out.println("givenName: " + s.getName().getGivenName());
//				System.out.println("middleName: " + s.getName().getMiddleName());
//				System.out.println("suffix: " + s.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("localId: " + s.getLocalId());
//				System.out.println("loginId: " + s.getLoginId());
//				System.out.println("stateProvinceId: " + s.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("sex: " + s.getSex());
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + s.getEmail().getEmailType());
//				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
//				System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
//				System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
//				System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
//				System.out.println("##### END PRIMARYASSIGNMENT #####");
//				System.out.println("##### BEGIN OTHERASSIGNMENT #####");
//				for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
//				{
//					System.out.println("leaRefId: " + pa.getLeaRefId());
//					System.out.println("schoolRefId: " + pa.getSchoolRefId());
//					System.out.println("jobFunction: " + pa.getJobFunction());
//				}
//				System.out.println("##### END OTHERASSIGNMENT #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN STAFFS BY LEA
//	public static void XStaffs_GetXStaffsByXLeaLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXStaffsByXLea, refId); i++)
//		{
//			for (XStaffType s : ricOne.sifXpress.GetXStaffsByXLea(refId))
//			{
//				System.out.println("refId: " + s.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + s.getName().getType());
//				System.out.println("prefix: " + s.getName().getPrefix());
//				System.out.println("familyName: " + s.getName().getFamilyName());
//				System.out.println("givenName: " + s.getName().getGivenName());
//				System.out.println("middleName: " + s.getName().getMiddleName());
//				System.out.println("suffix: " + s.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("localId: " + s.getLocalId());
//				System.out.println("loginId: " + s.getLoginId());
//				System.out.println("stateProvinceId: " + s.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("sex: " + s.getSex());
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + s.getEmail().getEmailType());
//				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
//				System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
//				System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
//				System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
//				System.out.println("##### END PRIMARYASSIGNMENT #####");
//				System.out.println("##### BEGIN OTHERASSIGNMENT #####");
//				for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
//				{
//					System.out.println("leaRefId: " + pa.getLeaRefId());
//					System.out.println("schoolRefId: " + pa.getSchoolRefId());
//					System.out.println("jobFunction: " + pa.getJobFunction());
//				}
//				System.out.println("##### END OTHERASSIGNMENT #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN STAFFS BY SCHOOL
//	public static void XStaffs_GetXStaffsByXSchoolLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXStaffsByXSchool, refId); i++)
//		{
//			for (XStaffType s : ricOne.sifXpress.GetXStaffsByXSchool(refId))
//			{
//				System.out.println("refId: " + s.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + s.getName().getType());
//				System.out.println("prefix: " + s.getName().getPrefix());
//				System.out.println("familyName: " + s.getName().getFamilyName());
//				System.out.println("givenName: " + s.getName().getGivenName());
//				System.out.println("middleName: " + s.getName().getMiddleName());
//				System.out.println("suffix: " + s.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("localId: " + s.getLocalId());
//				System.out.println("loginId: " + s.getLoginId());
//				System.out.println("stateProvinceId: " + s.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("sex: " + s.getSex());
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + s.getEmail().getEmailType());
//				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
//				System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
//				System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
//				System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
//				System.out.println("##### END PRIMARYASSIGNMENT #####");
//				System.out.println("##### BEGIN OTHERASSIGNMENT #####");
//				for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
//				{
//					System.out.println("leaRefId: " + pa.getLeaRefId());
//					System.out.println("schoolRefId: " + pa.getSchoolRefId());
//					System.out.println("jobFunction: " + pa.getJobFunction());
//				}
//				System.out.println("##### END OTHERASSIGNMENT #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN STAFFS BY COURSE
//	public static void XStaffs_GetXStaffsByXCourseLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXStaffsByXCourse, refId); i++)
//		{
//			for (XStaffType s : ricOne.sifXpress.GetXStaffsByXCourse(refId))
//			{
//				System.out.println("refId: " + s.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + s.getName().getType());
//				System.out.println("prefix: " + s.getName().getPrefix());
//				System.out.println("familyName: " + s.getName().getFamilyName());
//				System.out.println("givenName: " + s.getName().getGivenName());
//				System.out.println("middleName: " + s.getName().getMiddleName());
//				System.out.println("suffix: " + s.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("localId: " + s.getLocalId());
//				System.out.println("loginId: " + s.getLoginId());
//				System.out.println("stateProvinceId: " + s.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("sex: " + s.getSex());
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + s.getEmail().getEmailType());
//				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
//				System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
//				System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
//				System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
//				System.out.println("##### END PRIMARYASSIGNMENT #####");
//				System.out.println("##### BEGIN OTHERASSIGNMENT #####");
//				for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
//				{
//					System.out.println("leaRefId: " + pa.getLeaRefId());
//					System.out.println("schoolRefId: " + pa.getSchoolRefId());
//					System.out.println("jobFunction: " + pa.getJobFunction());
//				}
//				System.out.println("##### END OTHERASSIGNMENT #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN STAFFS BY ROSTER
//	public static void XStaffs_GetXStaffsByXRosterLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXStaffsByXRoster, refId); i++)
//		{
//			for (XStaffType s : ricOne.sifXpress.GetXStaffsByXRoster(refId))
//			{
//				System.out.println("refId: " + s.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + s.getName().getType());
//				System.out.println("prefix: " + s.getName().getPrefix());
//				System.out.println("familyName: " + s.getName().getFamilyName());
//				System.out.println("givenName: " + s.getName().getGivenName());
//				System.out.println("middleName: " + s.getName().getMiddleName());
//				System.out.println("suffix: " + s.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("localId: " + s.getLocalId());
//				System.out.println("loginId: " + s.getLoginId());
//				System.out.println("stateProvinceId: " + s.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("sex: " + s.getSex());
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + s.getEmail().getEmailType());
//				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
//				System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
//				System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
//				System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
//				System.out.println("##### END PRIMARYASSIGNMENT #####");
//				System.out.println("##### BEGIN OTHERASSIGNMENT #####");
//				for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
//				{
//					System.out.println("leaRefId: " + pa.getLeaRefId());
//					System.out.println("schoolRefId: " + pa.getSchoolRefId());
//					System.out.println("jobFunction: " + pa.getJobFunction());
//				}
//				System.out.println("##### END OTHERASSIGNMENT #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//	// RETURN STAFFS BY STUDENT
//	public static void XStaffs_GetXStaffsByXStudentLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXStaffsByXStudent, refId); i++)
//		{
//			for (XStaffType s : ricOne.sifXpress.GetXStaffsByXStudent(refId))
//			{
//				System.out.println("refId: " + s.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + s.getName().getType());
//				System.out.println("prefix: " + s.getName().getPrefix());
//				System.out.println("familyName: " + s.getName().getFamilyName());
//				System.out.println("givenName: " + s.getName().getGivenName());
//				System.out.println("middleName: " + s.getName().getMiddleName());
//				System.out.println("suffix: " + s.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("localId: " + s.getLocalId());
//				System.out.println("loginId: " + s.getLoginId());
//				System.out.println("stateProvinceId: " + s.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("sex: " + s.getSex());
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + s.getEmail().getEmailType());
//				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN PRIMARYASSIGNMENT #####");
//				System.out.println("leaRefId: " + s.getPrimaryAssignment().getLeaRefId());
//				System.out.println("schoolRefId: " + s.getPrimaryAssignment().getSchoolRefId());
//				System.out.println("jobFunction: " + s.getPrimaryAssignment().getJobFunction());
//				System.out.println("##### END PRIMARYASSIGNMENT #####");
//				System.out.println("##### BEGIN OTHERASSIGNMENT #####");
//				for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment())
//				{
//					System.out.println("leaRefId: " + pa.getLeaRefId());
//					System.out.println("schoolRefId: " + pa.getSchoolRefId());
//					System.out.println("jobFunction: " + pa.getJobFunction());
//				}
//				System.out.println("##### END OTHERASSIGNMENT #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
// 	// #################### xStudents ####################
//	// RETURN ALL STUDENTS
//	public static void XStudents_GetXStudentsLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXStudents); i++)
//		{
//			for (XStudentType s : ricOne.sifXpress.GetXStudents())
//			{
//				System.out.println("refId: " + s.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + s.getName().getType());
//				System.out.println("prefix: " + s.getName().getPrefix());
//				System.out.println("familyName: " + s.getName().getFamilyName());
//				System.out.println("givenName: " + s.getName().getGivenName());
//				System.out.println("middleName: " + s.getName().getMiddleName());
//				System.out.println("suffix: " + s.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("##### BEGIN OTHERNAME #####");
//				for (XPersonNameType n : s.getOtherNames().getName())
//				{
//					System.out.println("type: " + n.getType());
//					System.out.println("prefix: " + n.getPrefix());
//					System.out.println("familyName: " + n.getFamilyName());
//					System.out.println("givenName: " + n.getGivenName());
//					System.out.println("middleName: " + n.getMiddleName());
//					System.out.println("suffix: " + n.getSuffix());
//				}
//				System.out.println("##### END OTHERNAME #####");
//
//				System.out.println("localId: " + s.getLocalId());
//				System.out.println("loginId: " + s.getLoginId());
//				System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + s.getAddress().getAddressType());
//				System.out.println("city: " + s.getAddress().getCity());
//				System.out.println("line1: " + s.getAddress().getLine1());
//				System.out.println("line2: " + s.getAddress().getLine2());
//				System.out.println("countryCode: " + s.getAddress().getCountryCode());
//				System.out.println("postalCode: " + s.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + s.getAddress().getStateProvince());
//				System.out.println("number: " + s.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBERS #####");
//				System.out.println("number: " + s.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBERS #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//				for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBERS #####");
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + s.getEmail().getEmailType());
//				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN OTHEREMAILS #####");
//				for (XEmailType e : s.getOtherEmails().getEmail())
//				{
//					System.out.println("emailType: " + e.getEmailType());
//					System.out.println("emailAddress: " + e.getEmailAddress());
//				}
//				System.out.println("##### END OTHEREMAILS #####");
//				System.out.println("##### BEGIN DEMOGRAPHICS #####");
//				System.out.println("##### BEGIN RACES #####");
//				for (XRaceType r : s.getDemographics().getRaces().getRace())
//				{
//					System.out.println("race: " + r.getRace());
//				}
//				System.out.println("##### END RACES #####");
//				System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
//				System.out.println("sex: " + s.getDemographics().getSex());
//				System.out.println("birthDate: " + s.getDemographics().getBirthDate());
//				System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
//				System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
//				System.out.println("##### END DEMOGRAPHICS #####");
//				System.out.println("##### BEGIN ENROLLMENT #####");
//				System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
//				System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
//				System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
//				System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
//				System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
//				System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
//				System.out.println("exitDate: " + s.getEnrollment().getExitDate());
//				System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
//				System.out.println("##### BEGIN HOMEROOMTEACHER #####");
//				System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
//				System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
//				System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
//				System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
//				System.out.println("##### END HOMEROOMTEACHER #####");
//				System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
//				System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
//				System.out.println("##### BEGIN COUNSELOR #####");
//				System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
//				System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
//				System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
//				System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
//				System.out.println("##### END COUNSELOR #####");
//				System.out.println("##### END ENROLLMENT #####");
//				System.out.println("##### BEGIN OTHERENROLLMENT #####");
//				for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
//				{
//					System.out.println("leaRefId: " + e.getLeaRefId());
//					System.out.println("schoolRefId: " + e.getSchoolRefId());
//					System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
//					System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
//					System.out.println("membershipType: " + e.getMembershipType());
//					System.out.println("entryDate: " + e.getEntryDate());
//					System.out.println("exitDate: " + e.getExitDate());
//					System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
//					System.out.println("##### BEGIN HOMEROOMTEACHER #####");
//					System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
//					System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
//					System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
//					System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
//					System.out.println("##### END HOMEROOMTEACHER #####");
//					System.out.println("gradeLevel: " + e.getGradeLevel());
//					System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
//					System.out.println("##### BEGIN COUNSELOR #####");
//					System.out.println("refId: " + e.getCounselor().getRefId());
//					System.out.println("localId: " + e.getCounselor().getLocalId());
//					System.out.println("givenName: " + e.getCounselor().getGivenName());
//					System.out.println("familyName: " + e.getCounselor().getFamilyName());
//					System.out.println("##### END COUNSELOR #####");
//				}
//				System.out.println("##### END OTHERENROLLMENT #####");
//				System.out.println("##### BEGIN ACADEMICSUMMARY #####");
//				System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
//				System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
//				System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
//				System.out.println("##### END ACADEMICSUMMARY #####");
//				System.out.println("##### BEGIN STUDENTCONTACTS #####");
//				for (String contactRefid : s.getStudentContacts().getContactPersonRefId())
//				{
//					System.out.println("contactPersonRefId: " + contactRefid);
//				}
//				for (XContactType c : s.getStudentContacts().getXContact())
//				{
//					System.out.println("##### BEGIN NAME #####");
//					System.out.println("type: " + c.getName().getType());
//					System.out.println("prefix: " + c.getName().getPrefix());
//					System.out.println("familyName: " + c.getName().getFamilyName());
//					System.out.println("givenName: " + c.getName().getGivenName());
//					System.out.println("middleName: " + c.getName().getMiddleName());
//					System.out.println("suffix: " + c.getName().getSuffix());
//					System.out.println("##### END NAME #####");
//					System.out.println("##### BEGIN OTHERNAME #####");
//					for (XPersonNameType n : c.getOtherNames().getName())
//					{
//						System.out.println("type: " + n.getType());
//						System.out.println("prefix: " + n.getPrefix());
//						System.out.println("familyName: " + n.getFamilyName());
//						System.out.println("givenName: " + n.getGivenName());
//						System.out.println("middleName: " + n.getMiddleName());
//						System.out.println("suffix: " + n.getSuffix());
//					}
//					System.out.println("##### END OTHERNAME #####");
//					System.out.println(": " + c.getLocalId());
//					System.out.println(": " + c.getLoginId());
//					System.out.println("##### BEGIN OTHERIDS #####");
//					for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
//					{
//						System.out.println("id: " + id.getId());
//						System.out.println("type: " + id.getType());
//					}
//					System.out.println("##### END OTHERIDS #####");
//					System.out.println("##### BEGIN ADDRESS #####");
//					System.out.println("addressType: " + c.getAddress().getAddressType());
//					System.out.println("city: " + c.getAddress().getCity());
//					System.out.println("line1: " + c.getAddress().getLine1());
//					System.out.println("line2: " + c.getAddress().getLine2());
//					System.out.println("countryCode: " + c.getAddress().getCountryCode());
//					System.out.println("postalCode: " + c.getAddress().getPostalCode());
//					System.out.println("stateProvince: " + c.getAddress().getStateProvince());
//					System.out.println("number: " + c.getPhoneNumber().getNumber());
//					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//					System.out.println("##### END ADDRESS #####");
//					System.out.println("##### BEGIN PHONENUMBERS #####");
//					System.out.println("number: " + c.getPhoneNumber().getNumber());
//					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//					System.out.println("##### END PHONENUMBERS #####");
//					System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//					for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
//					{
//						System.out.println("otherPhoneNumbers number: " + p.getNumber());
//						System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//						System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//					}
//					System.out.println("##### END OTHERPHONENUMBERS #####");
//					System.out.println("##### BEGIN EMAIL #####");
//					System.out.println("emailType: " + c.getEmail().getEmailType());
//					System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
//					System.out.println("##### END EMAIL #####");
//					System.out.println("##### BEGIN OTHEREMAILS #####");
//					for (XEmailType e : c.getOtherEmails().getEmail())
//					{
//						System.out.println("emailType: " + e.getEmailType());
//						System.out.println("emailAddress: " + e.getEmailAddress());
//					}
//					System.out.println("##### END OTHEREMAILS #####");
//					System.out.println(": " + c.getSex());
//					System.out.println(": " + c.getEmployerType());
//					System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
//					for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
//					{
//						System.out.println("studentRefId: " + csr.getStudentRefId());
//						System.out.println("relationshipCode: " + csr.getRelationshipCode());
//						System.out.println("restrictions: " + csr.getRestrictions());
//						System.out.println("livesWith: " + csr.isLivesWith());
//						System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
//						System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
//						System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
//						System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
//						System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
//						System.out.println("contactSequence: " + csr.getContactSequence());
//					}
//					System.out.println("##### END CONTACTRELATIONSHIPS #####");
//				}
//				System.out.println("##### END STUDENTCONTACTS #####");
//				System.out.println("##### BEGIN LANGUAGES #####");
//				for (XLanguageType l : s.getLanguages().getLanguage())
//				{
//					System.out.println("type: " + l.getType());
//					System.out.println("code: " + l.getCode());
//				}
//				System.out.println("##### END LANGUAGES #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN STUDENTS BY LEA
//	public static void XStudents_GetXStudentsByXLeaLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXStudentsByXLea, refId); i++)
//		{
//			for (XStudentType s : ricOne.sifXpress.GetXStudentsByXLea(refId))
//			{
//				System.out.println("refId: " + s.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + s.getName().getType());
//				System.out.println("prefix: " + s.getName().getPrefix());
//				System.out.println("familyName: " + s.getName().getFamilyName());
//				System.out.println("givenName: " + s.getName().getGivenName());
//				System.out.println("middleName: " + s.getName().getMiddleName());
//				System.out.println("suffix: " + s.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("##### BEGIN OTHERNAME #####");
//				for (XPersonNameType n : s.getOtherNames().getName())
//				{
//					System.out.println("type: " + n.getType());
//					System.out.println("prefix: " + n.getPrefix());
//					System.out.println("familyName: " + n.getFamilyName());
//					System.out.println("givenName: " + n.getGivenName());
//					System.out.println("middleName: " + n.getMiddleName());
//					System.out.println("suffix: " + n.getSuffix());
//				}
//				System.out.println("##### END OTHERNAME #####");
//
//				System.out.println("localId: " + s.getLocalId());
//				System.out.println("loginId: " + s.getLoginId());
//				System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + s.getAddress().getAddressType());
//				System.out.println("city: " + s.getAddress().getCity());
//				System.out.println("line1: " + s.getAddress().getLine1());
//				System.out.println("line2: " + s.getAddress().getLine2());
//				System.out.println("countryCode: " + s.getAddress().getCountryCode());
//				System.out.println("postalCode: " + s.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + s.getAddress().getStateProvince());
//				System.out.println("number: " + s.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBERS #####");
//				System.out.println("number: " + s.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBERS #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//				for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBERS #####");
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + s.getEmail().getEmailType());
//				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN OTHEREMAILS #####");
//				for (XEmailType e : s.getOtherEmails().getEmail())
//				{
//					System.out.println("emailType: " + e.getEmailType());
//					System.out.println("emailAddress: " + e.getEmailAddress());
//				}
//				System.out.println("##### END OTHEREMAILS #####");
//				System.out.println("##### BEGIN DEMOGRAPHICS #####");
//				System.out.println("##### BEGIN RACES #####");
//				for (XRaceType r : s.getDemographics().getRaces().getRace())
//				{
//					System.out.println("race: " + r.getRace());
//				}
//				System.out.println("##### END RACES #####");
//				System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
//				System.out.println("sex: " + s.getDemographics().getSex());
//				System.out.println("birthDate: " + s.getDemographics().getBirthDate());
//				System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
//				System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
//				System.out.println("##### END DEMOGRAPHICS #####");
//				System.out.println("##### BEGIN ENROLLMENT #####");
//				System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
//				System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
//				System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
//				System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
//				System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
//				System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
//				System.out.println("exitDate: " + s.getEnrollment().getExitDate());
//				System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
//				System.out.println("##### BEGIN HOMEROOMTEACHER #####");
//				System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
//				System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
//				System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
//				System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
//				System.out.println("##### END HOMEROOMTEACHER #####");
//				System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
//				System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
//				System.out.println("##### BEGIN COUNSELOR #####");
//				System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
//				System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
//				System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
//				System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
//				System.out.println("##### END COUNSELOR #####");
//				System.out.println("##### END ENROLLMENT #####");
//				System.out.println("##### BEGIN OTHERENROLLMENT #####");
//				for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
//				{
//					System.out.println("leaRefId: " + e.getLeaRefId());
//					System.out.println("schoolRefId: " + e.getSchoolRefId());
//					System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
//					System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
//					System.out.println("membershipType: " + e.getMembershipType());
//					System.out.println("entryDate: " + e.getEntryDate());
//					System.out.println("exitDate: " + e.getExitDate());
//					System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
//					System.out.println("##### BEGIN HOMEROOMTEACHER #####");
//					System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
//					System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
//					System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
//					System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
//					System.out.println("##### END HOMEROOMTEACHER #####");
//					System.out.println("gradeLevel: " + e.getGradeLevel());
//					System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
//					System.out.println("##### BEGIN COUNSELOR #####");
//					System.out.println("refId: " + e.getCounselor().getRefId());
//					System.out.println("localId: " + e.getCounselor().getLocalId());
//					System.out.println("givenName: " + e.getCounselor().getGivenName());
//					System.out.println("familyName: " + e.getCounselor().getFamilyName());
//					System.out.println("##### END COUNSELOR #####");
//				}
//				System.out.println("##### END OTHERENROLLMENT #####");
//				System.out.println("##### BEGIN ACADEMICSUMMARY #####");
//				System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
//				System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
//				System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
//				System.out.println("##### END ACADEMICSUMMARY #####");
//				System.out.println("##### BEGIN STUDENTCONTACTS #####");
//				for (String contactRefid : s.getStudentContacts().getContactPersonRefId())
//				{
//					System.out.println("contactPersonRefId: " + contactRefid);
//				}
//				for (XContactType c : s.getStudentContacts().getXContact())
//				{
//					System.out.println("##### BEGIN NAME #####");
//					System.out.println("type: " + c.getName().getType());
//					System.out.println("prefix: " + c.getName().getPrefix());
//					System.out.println("familyName: " + c.getName().getFamilyName());
//					System.out.println("givenName: " + c.getName().getGivenName());
//					System.out.println("middleName: " + c.getName().getMiddleName());
//					System.out.println("suffix: " + c.getName().getSuffix());
//					System.out.println("##### END NAME #####");
//					System.out.println("##### BEGIN OTHERNAME #####");
//					for (XPersonNameType n : c.getOtherNames().getName())
//					{
//						System.out.println("type: " + n.getType());
//						System.out.println("prefix: " + n.getPrefix());
//						System.out.println("familyName: " + n.getFamilyName());
//						System.out.println("givenName: " + n.getGivenName());
//						System.out.println("middleName: " + n.getMiddleName());
//						System.out.println("suffix: " + n.getSuffix());
//					}
//					System.out.println("##### END OTHERNAME #####");
//					System.out.println(": " + c.getLocalId());
//					System.out.println(": " + c.getLoginId());
//					System.out.println("##### BEGIN OTHERIDS #####");
//					for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
//					{
//						System.out.println("id: " + id.getId());
//						System.out.println("type: " + id.getType());
//					}
//					System.out.println("##### END OTHERIDS #####");
//					System.out.println("##### BEGIN ADDRESS #####");
//					System.out.println("addressType: " + c.getAddress().getAddressType());
//					System.out.println("city: " + c.getAddress().getCity());
//					System.out.println("line1: " + c.getAddress().getLine1());
//					System.out.println("line2: " + c.getAddress().getLine2());
//					System.out.println("countryCode: " + c.getAddress().getCountryCode());
//					System.out.println("postalCode: " + c.getAddress().getPostalCode());
//					System.out.println("stateProvince: " + c.getAddress().getStateProvince());
//					System.out.println("number: " + c.getPhoneNumber().getNumber());
//					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//					System.out.println("##### END ADDRESS #####");
//					System.out.println("##### BEGIN PHONENUMBERS #####");
//					System.out.println("number: " + c.getPhoneNumber().getNumber());
//					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//					System.out.println("##### END PHONENUMBERS #####");
//					System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//					for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
//					{
//						System.out.println("otherPhoneNumbers number: " + p.getNumber());
//						System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//						System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//					}
//					System.out.println("##### END OTHERPHONENUMBERS #####");
//					System.out.println("##### BEGIN EMAIL #####");
//					System.out.println("emailType: " + c.getEmail().getEmailType());
//					System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
//					System.out.println("##### END EMAIL #####");
//					System.out.println("##### BEGIN OTHEREMAILS #####");
//					for (XEmailType e : c.getOtherEmails().getEmail())
//					{
//						System.out.println("emailType: " + e.getEmailType());
//						System.out.println("emailAddress: " + e.getEmailAddress());
//					}
//					System.out.println("##### END OTHEREMAILS #####");
//					System.out.println(": " + c.getSex());
//					System.out.println(": " + c.getEmployerType());
//					System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
//					for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
//					{
//						System.out.println("studentRefId: " + csr.getStudentRefId());
//						System.out.println("relationshipCode: " + csr.getRelationshipCode());
//						System.out.println("restrictions: " + csr.getRestrictions());
//						System.out.println("livesWith: " + csr.isLivesWith());
//						System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
//						System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
//						System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
//						System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
//						System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
//						System.out.println("contactSequence: " + csr.getContactSequence());
//					}
//					System.out.println("##### END CONTACTRELATIONSHIPS #####");
//				}
//				System.out.println("##### END STUDENTCONTACTS #####");
//				System.out.println("##### BEGIN LANGUAGES #####");
//				for (XLanguageType l : s.getLanguages().getLanguage())
//				{
//					System.out.println("type: " + l.getType());
//					System.out.println("code: " + l.getCode());
//				}
//				System.out.println("##### END LANGUAGES #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN STUDENTS BY SCHOOL
//	public static void XStudents_GetXStudentsByXSchoolLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXStudentsByXSchool, refId); i++)
//		{
//			for (XStudentType s : ricOne.sifXpress.GetXStudentsByXSchool(refId))
//			{
//				System.out.println("refId: " + s.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + s.getName().getType());
//				System.out.println("prefix: " + s.getName().getPrefix());
//				System.out.println("familyName: " + s.getName().getFamilyName());
//				System.out.println("givenName: " + s.getName().getGivenName());
//				System.out.println("middleName: " + s.getName().getMiddleName());
//				System.out.println("suffix: " + s.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("##### BEGIN OTHERNAME #####");
//				for (XPersonNameType n : s.getOtherNames().getName())
//				{
//					System.out.println("type: " + n.getType());
//					System.out.println("prefix: " + n.getPrefix());
//					System.out.println("familyName: " + n.getFamilyName());
//					System.out.println("givenName: " + n.getGivenName());
//					System.out.println("middleName: " + n.getMiddleName());
//					System.out.println("suffix: " + n.getSuffix());
//				}
//				System.out.println("##### END OTHERNAME #####");
//
//				System.out.println("localId: " + s.getLocalId());
//				System.out.println("loginId: " + s.getLoginId());
//				System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + s.getAddress().getAddressType());
//				System.out.println("city: " + s.getAddress().getCity());
//				System.out.println("line1: " + s.getAddress().getLine1());
//				System.out.println("line2: " + s.getAddress().getLine2());
//				System.out.println("countryCode: " + s.getAddress().getCountryCode());
//				System.out.println("postalCode: " + s.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + s.getAddress().getStateProvince());
//				System.out.println("number: " + s.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBERS #####");
//				System.out.println("number: " + s.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBERS #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//				for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBERS #####");
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + s.getEmail().getEmailType());
//				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN OTHEREMAILS #####");
//				for (XEmailType e : s.getOtherEmails().getEmail())
//				{
//					System.out.println("emailType: " + e.getEmailType());
//					System.out.println("emailAddress: " + e.getEmailAddress());
//				}
//				System.out.println("##### END OTHEREMAILS #####");
//				System.out.println("##### BEGIN DEMOGRAPHICS #####");
//				System.out.println("##### BEGIN RACES #####");
//				for (XRaceType r : s.getDemographics().getRaces().getRace())
//				{
//					System.out.println("race: " + r.getRace());
//				}
//				System.out.println("##### END RACES #####");
//				System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
//				System.out.println("sex: " + s.getDemographics().getSex());
//				System.out.println("birthDate: " + s.getDemographics().getBirthDate());
//				System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
//				System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
//				System.out.println("##### END DEMOGRAPHICS #####");
//				System.out.println("##### BEGIN ENROLLMENT #####");
//				System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
//				System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
//				System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
//				System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
//				System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
//				System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
//				System.out.println("exitDate: " + s.getEnrollment().getExitDate());
//				System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
//				System.out.println("##### BEGIN HOMEROOMTEACHER #####");
//				System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
//				System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
//				System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
//				System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
//				System.out.println("##### END HOMEROOMTEACHER #####");
//				System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
//				System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
//				System.out.println("##### BEGIN COUNSELOR #####");
//				System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
//				System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
//				System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
//				System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
//				System.out.println("##### END COUNSELOR #####");
//				System.out.println("##### END ENROLLMENT #####");
//				System.out.println("##### BEGIN OTHERENROLLMENT #####");
//				for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
//				{
//					System.out.println("leaRefId: " + e.getLeaRefId());
//					System.out.println("schoolRefId: " + e.getSchoolRefId());
//					System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
//					System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
//					System.out.println("membershipType: " + e.getMembershipType());
//					System.out.println("entryDate: " + e.getEntryDate());
//					System.out.println("exitDate: " + e.getExitDate());
//					System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
//					System.out.println("##### BEGIN HOMEROOMTEACHER #####");
//					System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
//					System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
//					System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
//					System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
//					System.out.println("##### END HOMEROOMTEACHER #####");
//					System.out.println("gradeLevel: " + e.getGradeLevel());
//					System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
//					System.out.println("##### BEGIN COUNSELOR #####");
//					System.out.println("refId: " + e.getCounselor().getRefId());
//					System.out.println("localId: " + e.getCounselor().getLocalId());
//					System.out.println("givenName: " + e.getCounselor().getGivenName());
//					System.out.println("familyName: " + e.getCounselor().getFamilyName());
//					System.out.println("##### END COUNSELOR #####");
//				}
//				System.out.println("##### END OTHERENROLLMENT #####");
//				System.out.println("##### BEGIN ACADEMICSUMMARY #####");
//				System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
//				System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
//				System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
//				System.out.println("##### END ACADEMICSUMMARY #####");
//				System.out.println("##### BEGIN STUDENTCONTACTS #####");
//				for (String contactRefid : s.getStudentContacts().getContactPersonRefId())
//				{
//					System.out.println("contactPersonRefId: " + contactRefid);
//				}
//				for (XContactType c : s.getStudentContacts().getXContact())
//				{
//					System.out.println("##### BEGIN NAME #####");
//					System.out.println("type: " + c.getName().getType());
//					System.out.println("prefix: " + c.getName().getPrefix());
//					System.out.println("familyName: " + c.getName().getFamilyName());
//					System.out.println("givenName: " + c.getName().getGivenName());
//					System.out.println("middleName: " + c.getName().getMiddleName());
//					System.out.println("suffix: " + c.getName().getSuffix());
//					System.out.println("##### END NAME #####");
//					System.out.println("##### BEGIN OTHERNAME #####");
//					for (XPersonNameType n : c.getOtherNames().getName())
//					{
//						System.out.println("type: " + n.getType());
//						System.out.println("prefix: " + n.getPrefix());
//						System.out.println("familyName: " + n.getFamilyName());
//						System.out.println("givenName: " + n.getGivenName());
//						System.out.println("middleName: " + n.getMiddleName());
//						System.out.println("suffix: " + n.getSuffix());
//					}
//					System.out.println("##### END OTHERNAME #####");
//					System.out.println(": " + c.getLocalId());
//					System.out.println(": " + c.getLoginId());
//					System.out.println("##### BEGIN OTHERIDS #####");
//					for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
//					{
//						System.out.println("id: " + id.getId());
//						System.out.println("type: " + id.getType());
//					}
//					System.out.println("##### END OTHERIDS #####");
//					System.out.println("##### BEGIN ADDRESS #####");
//					System.out.println("addressType: " + c.getAddress().getAddressType());
//					System.out.println("city: " + c.getAddress().getCity());
//					System.out.println("line1: " + c.getAddress().getLine1());
//					System.out.println("line2: " + c.getAddress().getLine2());
//					System.out.println("countryCode: " + c.getAddress().getCountryCode());
//					System.out.println("postalCode: " + c.getAddress().getPostalCode());
//					System.out.println("stateProvince: " + c.getAddress().getStateProvince());
//					System.out.println("number: " + c.getPhoneNumber().getNumber());
//					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//					System.out.println("##### END ADDRESS #####");
//					System.out.println("##### BEGIN PHONENUMBERS #####");
//					System.out.println("number: " + c.getPhoneNumber().getNumber());
//					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//					System.out.println("##### END PHONENUMBERS #####");
//					System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//					for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
//					{
//						System.out.println("otherPhoneNumbers number: " + p.getNumber());
//						System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//						System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//					}
//					System.out.println("##### END OTHERPHONENUMBERS #####");
//					System.out.println("##### BEGIN EMAIL #####");
//					System.out.println("emailType: " + c.getEmail().getEmailType());
//					System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
//					System.out.println("##### END EMAIL #####");
//					System.out.println("##### BEGIN OTHEREMAILS #####");
//					for (XEmailType e : c.getOtherEmails().getEmail())
//					{
//						System.out.println("emailType: " + e.getEmailType());
//						System.out.println("emailAddress: " + e.getEmailAddress());
//					}
//					System.out.println("##### END OTHEREMAILS #####");
//					System.out.println(": " + c.getSex());
//					System.out.println(": " + c.getEmployerType());
//					System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
//					for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
//					{
//						System.out.println("studentRefId: " + csr.getStudentRefId());
//						System.out.println("relationshipCode: " + csr.getRelationshipCode());
//						System.out.println("restrictions: " + csr.getRestrictions());
//						System.out.println("livesWith: " + csr.isLivesWith());
//						System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
//						System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
//						System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
//						System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
//						System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
//						System.out.println("contactSequence: " + csr.getContactSequence());
//					}
//					System.out.println("##### END CONTACTRELATIONSHIPS #####");
//				}
//				System.out.println("##### END STUDENTCONTACTS #####");
//				System.out.println("##### BEGIN LANGUAGES #####");
//				for (XLanguageType l : s.getLanguages().getLanguage())
//				{
//					System.out.println("type: " + l.getType());
//					System.out.println("code: " + l.getCode());
//				}
//				System.out.println("##### END LANGUAGES #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN STUDENTS BY ROSTER
//	public static void XStudents_GetXStudentsByXRosterLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXStudentsByXRoster, refId); i++)
//		{
//			for (XStudentType s : ricOne.sifXpress.GetXStudentsByXRoster(refId))
//			{
//				System.out.println("refId: " + s.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + s.getName().getType());
//				System.out.println("prefix: " + s.getName().getPrefix());
//				System.out.println("familyName: " + s.getName().getFamilyName());
//				System.out.println("givenName: " + s.getName().getGivenName());
//				System.out.println("middleName: " + s.getName().getMiddleName());
//				System.out.println("suffix: " + s.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("##### BEGIN OTHERNAME #####");
//				for (XPersonNameType n : s.getOtherNames().getName())
//				{
//					System.out.println("type: " + n.getType());
//					System.out.println("prefix: " + n.getPrefix());
//					System.out.println("familyName: " + n.getFamilyName());
//					System.out.println("givenName: " + n.getGivenName());
//					System.out.println("middleName: " + n.getMiddleName());
//					System.out.println("suffix: " + n.getSuffix());
//				}
//				System.out.println("##### END OTHERNAME #####");
//
//				System.out.println("localId: " + s.getLocalId());
//				System.out.println("loginId: " + s.getLoginId());
//				System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + s.getAddress().getAddressType());
//				System.out.println("city: " + s.getAddress().getCity());
//				System.out.println("line1: " + s.getAddress().getLine1());
//				System.out.println("line2: " + s.getAddress().getLine2());
//				System.out.println("countryCode: " + s.getAddress().getCountryCode());
//				System.out.println("postalCode: " + s.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + s.getAddress().getStateProvince());
//				System.out.println("number: " + s.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBERS #####");
//				System.out.println("number: " + s.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBERS #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//				for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBERS #####");
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + s.getEmail().getEmailType());
//				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN OTHEREMAILS #####");
//				for (XEmailType e : s.getOtherEmails().getEmail())
//				{
//					System.out.println("emailType: " + e.getEmailType());
//					System.out.println("emailAddress: " + e.getEmailAddress());
//				}
//				System.out.println("##### END OTHEREMAILS #####");
//				System.out.println("##### BEGIN DEMOGRAPHICS #####");
//				System.out.println("##### BEGIN RACES #####");
//				for (XRaceType r : s.getDemographics().getRaces().getRace())
//				{
//					System.out.println("race: " + r.getRace());
//				}
//				System.out.println("##### END RACES #####");
//				System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
//				System.out.println("sex: " + s.getDemographics().getSex());
//				System.out.println("birthDate: " + s.getDemographics().getBirthDate());
//				System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
//				System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
//				System.out.println("##### END DEMOGRAPHICS #####");
//				System.out.println("##### BEGIN ENROLLMENT #####");
//				System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
//				System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
//				System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
//				System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
//				System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
//				System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
//				System.out.println("exitDate: " + s.getEnrollment().getExitDate());
//				System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
//				System.out.println("##### BEGIN HOMEROOMTEACHER #####");
//				System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
//				System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
//				System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
//				System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
//				System.out.println("##### END HOMEROOMTEACHER #####");
//				System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
//				System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
//				System.out.println("##### BEGIN COUNSELOR #####");
//				System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
//				System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
//				System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
//				System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
//				System.out.println("##### END COUNSELOR #####");
//				System.out.println("##### END ENROLLMENT #####");
//				System.out.println("##### BEGIN OTHERENROLLMENT #####");
//				for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
//				{
//					System.out.println("leaRefId: " + e.getLeaRefId());
//					System.out.println("schoolRefId: " + e.getSchoolRefId());
//					System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
//					System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
//					System.out.println("membershipType: " + e.getMembershipType());
//					System.out.println("entryDate: " + e.getEntryDate());
//					System.out.println("exitDate: " + e.getExitDate());
//					System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
//					System.out.println("##### BEGIN HOMEROOMTEACHER #####");
//					System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
//					System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
//					System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
//					System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
//					System.out.println("##### END HOMEROOMTEACHER #####");
//					System.out.println("gradeLevel: " + e.getGradeLevel());
//					System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
//					System.out.println("##### BEGIN COUNSELOR #####");
//					System.out.println("refId: " + e.getCounselor().getRefId());
//					System.out.println("localId: " + e.getCounselor().getLocalId());
//					System.out.println("givenName: " + e.getCounselor().getGivenName());
//					System.out.println("familyName: " + e.getCounselor().getFamilyName());
//					System.out.println("##### END COUNSELOR #####");
//				}
//				System.out.println("##### END OTHERENROLLMENT #####");
//				System.out.println("##### BEGIN ACADEMICSUMMARY #####");
//				System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
//				System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
//				System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
//				System.out.println("##### END ACADEMICSUMMARY #####");
//				System.out.println("##### BEGIN STUDENTCONTACTS #####");
//				for (String contactRefid : s.getStudentContacts().getContactPersonRefId())
//				{
//					System.out.println("contactPersonRefId: " + contactRefid);
//				}
//				for (XContactType c : s.getStudentContacts().getXContact())
//				{
//					System.out.println("##### BEGIN NAME #####");
//					System.out.println("type: " + c.getName().getType());
//					System.out.println("prefix: " + c.getName().getPrefix());
//					System.out.println("familyName: " + c.getName().getFamilyName());
//					System.out.println("givenName: " + c.getName().getGivenName());
//					System.out.println("middleName: " + c.getName().getMiddleName());
//					System.out.println("suffix: " + c.getName().getSuffix());
//					System.out.println("##### END NAME #####");
//					System.out.println("##### BEGIN OTHERNAME #####");
//					for (XPersonNameType n : c.getOtherNames().getName())
//					{
//						System.out.println("type: " + n.getType());
//						System.out.println("prefix: " + n.getPrefix());
//						System.out.println("familyName: " + n.getFamilyName());
//						System.out.println("givenName: " + n.getGivenName());
//						System.out.println("middleName: " + n.getMiddleName());
//						System.out.println("suffix: " + n.getSuffix());
//					}
//					System.out.println("##### END OTHERNAME #####");
//					System.out.println(": " + c.getLocalId());
//					System.out.println(": " + c.getLoginId());
//					System.out.println("##### BEGIN OTHERIDS #####");
//					for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
//					{
//						System.out.println("id: " + id.getId());
//						System.out.println("type: " + id.getType());
//					}
//					System.out.println("##### END OTHERIDS #####");
//					System.out.println("##### BEGIN ADDRESS #####");
//					System.out.println("addressType: " + c.getAddress().getAddressType());
//					System.out.println("city: " + c.getAddress().getCity());
//					System.out.println("line1: " + c.getAddress().getLine1());
//					System.out.println("line2: " + c.getAddress().getLine2());
//					System.out.println("countryCode: " + c.getAddress().getCountryCode());
//					System.out.println("postalCode: " + c.getAddress().getPostalCode());
//					System.out.println("stateProvince: " + c.getAddress().getStateProvince());
//					System.out.println("number: " + c.getPhoneNumber().getNumber());
//					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//					System.out.println("##### END ADDRESS #####");
//					System.out.println("##### BEGIN PHONENUMBERS #####");
//					System.out.println("number: " + c.getPhoneNumber().getNumber());
//					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//					System.out.println("##### END PHONENUMBERS #####");
//					System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//					for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
//					{
//						System.out.println("otherPhoneNumbers number: " + p.getNumber());
//						System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//						System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//					}
//					System.out.println("##### END OTHERPHONENUMBERS #####");
//					System.out.println("##### BEGIN EMAIL #####");
//					System.out.println("emailType: " + c.getEmail().getEmailType());
//					System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
//					System.out.println("##### END EMAIL #####");
//					System.out.println("##### BEGIN OTHEREMAILS #####");
//					for (XEmailType e : c.getOtherEmails().getEmail())
//					{
//						System.out.println("emailType: " + e.getEmailType());
//						System.out.println("emailAddress: " + e.getEmailAddress());
//					}
//					System.out.println("##### END OTHEREMAILS #####");
//					System.out.println(": " + c.getSex());
//					System.out.println(": " + c.getEmployerType());
//					System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
//					for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
//					{
//						System.out.println("studentRefId: " + csr.getStudentRefId());
//						System.out.println("relationshipCode: " + csr.getRelationshipCode());
//						System.out.println("restrictions: " + csr.getRestrictions());
//						System.out.println("livesWith: " + csr.isLivesWith());
//						System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
//						System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
//						System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
//						System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
//						System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
//						System.out.println("contactSequence: " + csr.getContactSequence());
//					}
//					System.out.println("##### END CONTACTRELATIONSHIPS #####");
//				}
//				System.out.println("##### END STUDENTCONTACTS #####");
//				System.out.println("##### BEGIN LANGUAGES #####");
//				for (XLanguageType l : s.getLanguages().getLanguage())
//				{
//					System.out.println("type: " + l.getType());
//					System.out.println("code: " + l.getCode());
//				}
//				System.out.println("##### END LANGUAGES #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN STUDENTS BY STAFF
//	public static void XStudents_GetXStudentsByXStaffLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXStudentsByXStaff, refId); i++)
//		{
//			for (XStudentType s : ricOne.sifXpress.GetXStudentsByXStaff(refId))
//			{
//				System.out.println("refId: " + s.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + s.getName().getType());
//				System.out.println("prefix: " + s.getName().getPrefix());
//				System.out.println("familyName: " + s.getName().getFamilyName());
//				System.out.println("givenName: " + s.getName().getGivenName());
//				System.out.println("middleName: " + s.getName().getMiddleName());
//				System.out.println("suffix: " + s.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("##### BEGIN OTHERNAME #####");
//				for (XPersonNameType n : s.getOtherNames().getName())
//				{
//					System.out.println("type: " + n.getType());
//					System.out.println("prefix: " + n.getPrefix());
//					System.out.println("familyName: " + n.getFamilyName());
//					System.out.println("givenName: " + n.getGivenName());
//					System.out.println("middleName: " + n.getMiddleName());
//					System.out.println("suffix: " + n.getSuffix());
//				}
//				System.out.println("##### END OTHERNAME #####");
//
//				System.out.println("localId: " + s.getLocalId());
//				System.out.println("loginId: " + s.getLoginId());
//				System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + s.getAddress().getAddressType());
//				System.out.println("city: " + s.getAddress().getCity());
//				System.out.println("line1: " + s.getAddress().getLine1());
//				System.out.println("line2: " + s.getAddress().getLine2());
//				System.out.println("countryCode: " + s.getAddress().getCountryCode());
//				System.out.println("postalCode: " + s.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + s.getAddress().getStateProvince());
//				System.out.println("number: " + s.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBERS #####");
//				System.out.println("number: " + s.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBERS #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//				for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBERS #####");
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + s.getEmail().getEmailType());
//				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN OTHEREMAILS #####");
//				for (XEmailType e : s.getOtherEmails().getEmail())
//				{
//					System.out.println("emailType: " + e.getEmailType());
//					System.out.println("emailAddress: " + e.getEmailAddress());
//				}
//				System.out.println("##### END OTHEREMAILS #####");
//				System.out.println("##### BEGIN DEMOGRAPHICS #####");
//				System.out.println("##### BEGIN RACES #####");
//				for (XRaceType r : s.getDemographics().getRaces().getRace())
//				{
//					System.out.println("race: " + r.getRace());
//				}
//				System.out.println("##### END RACES #####");
//				System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
//				System.out.println("sex: " + s.getDemographics().getSex());
//				System.out.println("birthDate: " + s.getDemographics().getBirthDate());
//				System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
//				System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
//				System.out.println("##### END DEMOGRAPHICS #####");
//				System.out.println("##### BEGIN ENROLLMENT #####");
//				System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
//				System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
//				System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
//				System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
//				System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
//				System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
//				System.out.println("exitDate: " + s.getEnrollment().getExitDate());
//				System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
//				System.out.println("##### BEGIN HOMEROOMTEACHER #####");
//				System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
//				System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
//				System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
//				System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
//				System.out.println("##### END HOMEROOMTEACHER #####");
//				System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
//				System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
//				System.out.println("##### BEGIN COUNSELOR #####");
//				System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
//				System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
//				System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
//				System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
//				System.out.println("##### END COUNSELOR #####");
//				System.out.println("##### END ENROLLMENT #####");
//				System.out.println("##### BEGIN OTHERENROLLMENT #####");
//				for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
//				{
//					System.out.println("leaRefId: " + e.getLeaRefId());
//					System.out.println("schoolRefId: " + e.getSchoolRefId());
//					System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
//					System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
//					System.out.println("membershipType: " + e.getMembershipType());
//					System.out.println("entryDate: " + e.getEntryDate());
//					System.out.println("exitDate: " + e.getExitDate());
//					System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
//					System.out.println("##### BEGIN HOMEROOMTEACHER #####");
//					System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
//					System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
//					System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
//					System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
//					System.out.println("##### END HOMEROOMTEACHER #####");
//					System.out.println("gradeLevel: " + e.getGradeLevel());
//					System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
//					System.out.println("##### BEGIN COUNSELOR #####");
//					System.out.println("refId: " + e.getCounselor().getRefId());
//					System.out.println("localId: " + e.getCounselor().getLocalId());
//					System.out.println("givenName: " + e.getCounselor().getGivenName());
//					System.out.println("familyName: " + e.getCounselor().getFamilyName());
//					System.out.println("##### END COUNSELOR #####");
//				}
//				System.out.println("##### END OTHERENROLLMENT #####");
//				System.out.println("##### BEGIN ACADEMICSUMMARY #####");
//				System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
//				System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
//				System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
//				System.out.println("##### END ACADEMICSUMMARY #####");
//				System.out.println("##### BEGIN STUDENTCONTACTS #####");
//				for (String contactRefid : s.getStudentContacts().getContactPersonRefId())
//				{
//					System.out.println("contactPersonRefId: " + contactRefid);
//				}
//				for (XContactType c : s.getStudentContacts().getXContact())
//				{
//					System.out.println("##### BEGIN NAME #####");
//					System.out.println("type: " + c.getName().getType());
//					System.out.println("prefix: " + c.getName().getPrefix());
//					System.out.println("familyName: " + c.getName().getFamilyName());
//					System.out.println("givenName: " + c.getName().getGivenName());
//					System.out.println("middleName: " + c.getName().getMiddleName());
//					System.out.println("suffix: " + c.getName().getSuffix());
//					System.out.println("##### END NAME #####");
//					System.out.println("##### BEGIN OTHERNAME #####");
//					for (XPersonNameType n : c.getOtherNames().getName())
//					{
//						System.out.println("type: " + n.getType());
//						System.out.println("prefix: " + n.getPrefix());
//						System.out.println("familyName: " + n.getFamilyName());
//						System.out.println("givenName: " + n.getGivenName());
//						System.out.println("middleName: " + n.getMiddleName());
//						System.out.println("suffix: " + n.getSuffix());
//					}
//					System.out.println("##### END OTHERNAME #####");
//					System.out.println(": " + c.getLocalId());
//					System.out.println(": " + c.getLoginId());
//					System.out.println("##### BEGIN OTHERIDS #####");
//					for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
//					{
//						System.out.println("id: " + id.getId());
//						System.out.println("type: " + id.getType());
//					}
//					System.out.println("##### END OTHERIDS #####");
//					System.out.println("##### BEGIN ADDRESS #####");
//					System.out.println("addressType: " + c.getAddress().getAddressType());
//					System.out.println("city: " + c.getAddress().getCity());
//					System.out.println("line1: " + c.getAddress().getLine1());
//					System.out.println("line2: " + c.getAddress().getLine2());
//					System.out.println("countryCode: " + c.getAddress().getCountryCode());
//					System.out.println("postalCode: " + c.getAddress().getPostalCode());
//					System.out.println("stateProvince: " + c.getAddress().getStateProvince());
//					System.out.println("number: " + c.getPhoneNumber().getNumber());
//					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//					System.out.println("##### END ADDRESS #####");
//					System.out.println("##### BEGIN PHONENUMBERS #####");
//					System.out.println("number: " + c.getPhoneNumber().getNumber());
//					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//					System.out.println("##### END PHONENUMBERS #####");
//					System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//					for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
//					{
//						System.out.println("otherPhoneNumbers number: " + p.getNumber());
//						System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//						System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//					}
//					System.out.println("##### END OTHERPHONENUMBERS #####");
//					System.out.println("##### BEGIN EMAIL #####");
//					System.out.println("emailType: " + c.getEmail().getEmailType());
//					System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
//					System.out.println("##### END EMAIL #####");
//					System.out.println("##### BEGIN OTHEREMAILS #####");
//					for (XEmailType e : c.getOtherEmails().getEmail())
//					{
//						System.out.println("emailType: " + e.getEmailType());
//						System.out.println("emailAddress: " + e.getEmailAddress());
//					}
//					System.out.println("##### END OTHEREMAILS #####");
//					System.out.println(": " + c.getSex());
//					System.out.println(": " + c.getEmployerType());
//					System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
//					for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
//					{
//						System.out.println("studentRefId: " + csr.getStudentRefId());
//						System.out.println("relationshipCode: " + csr.getRelationshipCode());
//						System.out.println("restrictions: " + csr.getRestrictions());
//						System.out.println("livesWith: " + csr.isLivesWith());
//						System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
//						System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
//						System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
//						System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
//						System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
//						System.out.println("contactSequence: " + csr.getContactSequence());
//					}
//					System.out.println("##### END CONTACTRELATIONSHIPS #####");
//				}
//				System.out.println("##### END STUDENTCONTACTS #####");
//				System.out.println("##### BEGIN LANGUAGES #####");
//				for (XLanguageType l : s.getLanguages().getLanguage())
//				{
//					System.out.println("type: " + l.getType());
//					System.out.println("code: " + l.getCode());
//				}
//				System.out.println("##### END LANGUAGES #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN STUDENTS BY CONTACT
//	public static void XStudents_GetXStudentsByXContactLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXStudentsByXContact, refId); i++)
//		{
//			for (XStudentType s : ricOne.sifXpress.GetXStudentsByXContact(refId))
//			{
//				System.out.println("refId: " + s.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + s.getName().getType());
//				System.out.println("prefix: " + s.getName().getPrefix());
//				System.out.println("familyName: " + s.getName().getFamilyName());
//				System.out.println("givenName: " + s.getName().getGivenName());
//				System.out.println("middleName: " + s.getName().getMiddleName());
//				System.out.println("suffix: " + s.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("##### BEGIN OTHERNAME #####");
//				for (XPersonNameType n : s.getOtherNames().getName())
//				{
//					System.out.println("type: " + n.getType());
//					System.out.println("prefix: " + n.getPrefix());
//					System.out.println("familyName: " + n.getFamilyName());
//					System.out.println("givenName: " + n.getGivenName());
//					System.out.println("middleName: " + n.getMiddleName());
//					System.out.println("suffix: " + n.getSuffix());
//				}
//				System.out.println("##### END OTHERNAME #####");
//
//				System.out.println("localId: " + s.getLocalId());
//				System.out.println("loginId: " + s.getLoginId());
//				System.out.println("stateProvinceIdloginId: " + s.getStateProvinceId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : s.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + s.getAddress().getAddressType());
//				System.out.println("city: " + s.getAddress().getCity());
//				System.out.println("line1: " + s.getAddress().getLine1());
//				System.out.println("line2: " + s.getAddress().getLine2());
//				System.out.println("countryCode: " + s.getAddress().getCountryCode());
//				System.out.println("postalCode: " + s.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + s.getAddress().getStateProvince());
//				System.out.println("number: " + s.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBERS #####");
//				System.out.println("number: " + s.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + s.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + s.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBERS #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//				for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBERS #####");
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + s.getEmail().getEmailType());
//				System.out.println("emailAddress: " + s.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN OTHEREMAILS #####");
//				for (XEmailType e : s.getOtherEmails().getEmail())
//				{
//					System.out.println("emailType: " + e.getEmailType());
//					System.out.println("emailAddress: " + e.getEmailAddress());
//				}
//				System.out.println("##### END OTHEREMAILS #####");
//				System.out.println("##### BEGIN DEMOGRAPHICS #####");
//				System.out.println("##### BEGIN RACES #####");
//				for (XRaceType r : s.getDemographics().getRaces().getRace())
//				{
//					System.out.println("race: " + r.getRace());
//				}
//				System.out.println("##### END RACES #####");
//				System.out.println("hispanicLatinoEthnicity: " + s.getDemographics().isHispanicLatinoEthnicity());
//				System.out.println("sex: " + s.getDemographics().getSex());
//				System.out.println("birthDate: " + s.getDemographics().getBirthDate());
//				System.out.println("countryOfBirth: " + s.getDemographics().getCountryOfBirth());
//				System.out.println("usCitizenshipStatus: " + s.getDemographics().getUsCitizenshipStatus());
//				System.out.println("##### END DEMOGRAPHICS #####");
//				System.out.println("##### BEGIN ENROLLMENT #####");
//				System.out.println("leaRefId: " + s.getEnrollment().getLeaRefId());
//				System.out.println("schoolRefId: " + s.getEnrollment().getSchoolRefId());
//				System.out.println("studentSchoolAssociationRefId: " + s.getEnrollment().getStudentSchoolAssociationRefId());
//				System.out.println("responsibleSchoolType: " + s.getEnrollment().getResponsibleSchoolType());
//				System.out.println("membershipType: " + s.getEnrollment().getMembershipType());
//				System.out.println("entryDate: " + s.getEnrollment().getEntryDate());
//				System.out.println("exitDate: " + s.getEnrollment().getExitDate());
//				System.out.println("homeRoomNumber: " + s.getEnrollment().getHomeRoomNumber());
//				System.out.println("##### BEGIN HOMEROOMTEACHER #####");
//				System.out.println("refId: " + s.getEnrollment().getHomeRoomTeacher().getRefId());
//				System.out.println("localId: " + s.getEnrollment().getHomeRoomTeacher().getLocalId());
//				System.out.println("givenName: " + s.getEnrollment().getHomeRoomTeacher().getGivenName());
//				System.out.println("familyName: " + s.getEnrollment().getHomeRoomTeacher().getFamilyName());
//				System.out.println("##### END HOMEROOMTEACHER #####");
//				System.out.println("gradeLevel: " + s.getEnrollment().getGradeLevel());
//				System.out.println("projectedGraduationYear: " + s.getEnrollment().getProjectedGraduationYear());
//				System.out.println("##### BEGIN COUNSELOR #####");
//				System.out.println("refId: " + s.getEnrollment().getCounselor().getRefId());
//				System.out.println("localId: " + s.getEnrollment().getCounselor().getLocalId());
//				System.out.println("givenName: " + s.getEnrollment().getCounselor().getGivenName());
//				System.out.println("familyName: " + s.getEnrollment().getCounselor().getFamilyName());
//				System.out.println("##### END COUNSELOR #####");
//				System.out.println("##### END ENROLLMENT #####");
//				System.out.println("##### BEGIN OTHERENROLLMENT #####");
//				for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment())
//				{
//					System.out.println("leaRefId: " + e.getLeaRefId());
//					System.out.println("schoolRefId: " + e.getSchoolRefId());
//					System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
//					System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
//					System.out.println("membershipType: " + e.getMembershipType());
//					System.out.println("entryDate: " + e.getEntryDate());
//					System.out.println("exitDate: " + e.getExitDate());
//					System.out.println("homeRoomNumber: " + e.getHomeRoomNumber());
//					System.out.println("##### BEGIN HOMEROOMTEACHER #####");
//					System.out.println("refId: " + e.getHomeRoomTeacher().getRefId());
//					System.out.println("localId: " + e.getHomeRoomTeacher().getLocalId());
//					System.out.println("givenName: " + e.getHomeRoomTeacher().getGivenName());
//					System.out.println("familyName: " + e.getHomeRoomTeacher().getFamilyName());
//					System.out.println("##### END HOMEROOMTEACHER #####");
//					System.out.println("gradeLevel: " + e.getGradeLevel());
//					System.out.println("projectedGraduationYear: " + e.getProjectedGraduationYear());
//					System.out.println("##### BEGIN COUNSELOR #####");
//					System.out.println("refId: " + e.getCounselor().getRefId());
//					System.out.println("localId: " + e.getCounselor().getLocalId());
//					System.out.println("givenName: " + e.getCounselor().getGivenName());
//					System.out.println("familyName: " + e.getCounselor().getFamilyName());
//					System.out.println("##### END COUNSELOR #####");
//				}
//				System.out.println("##### END OTHERENROLLMENT #####");
//				System.out.println("##### BEGIN ACADEMICSUMMARY #####");
//				System.out.println("cumulativeWeightedGpa: " + s.getAcademicSummary().getCumulativeWeightedGpa());
//				System.out.println("termWeightedGpa: " + s.getAcademicSummary().getTermWeightedGpa());
//				System.out.println("classRank: " + s.getAcademicSummary().getClassRank());
//				System.out.println("##### END ACADEMICSUMMARY #####");
//				System.out.println("##### BEGIN STUDENTCONTACTS #####");
//				for (String contactRefid : s.getStudentContacts().getContactPersonRefId())
//				{
//					System.out.println("contactPersonRefId: " + contactRefid);
//				}
//				for (XContactType c : s.getStudentContacts().getXContact())
//				{
//					System.out.println("##### BEGIN NAME #####");
//					System.out.println("type: " + c.getName().getType());
//					System.out.println("prefix: " + c.getName().getPrefix());
//					System.out.println("familyName: " + c.getName().getFamilyName());
//					System.out.println("givenName: " + c.getName().getGivenName());
//					System.out.println("middleName: " + c.getName().getMiddleName());
//					System.out.println("suffix: " + c.getName().getSuffix());
//					System.out.println("##### END NAME #####");
//					System.out.println("##### BEGIN OTHERNAME #####");
//					for (XPersonNameType n : c.getOtherNames().getName())
//					{
//						System.out.println("type: " + n.getType());
//						System.out.println("prefix: " + n.getPrefix());
//						System.out.println("familyName: " + n.getFamilyName());
//						System.out.println("givenName: " + n.getGivenName());
//						System.out.println("middleName: " + n.getMiddleName());
//						System.out.println("suffix: " + n.getSuffix());
//					}
//					System.out.println("##### END OTHERNAME #####");
//					System.out.println(": " + c.getLocalId());
//					System.out.println(": " + c.getLoginId());
//					System.out.println("##### BEGIN OTHERIDS #####");
//					for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
//					{
//						System.out.println("id: " + id.getId());
//						System.out.println("type: " + id.getType());
//					}
//					System.out.println("##### END OTHERIDS #####");
//					System.out.println("##### BEGIN ADDRESS #####");
//					System.out.println("addressType: " + c.getAddress().getAddressType());
//					System.out.println("city: " + c.getAddress().getCity());
//					System.out.println("line1: " + c.getAddress().getLine1());
//					System.out.println("line2: " + c.getAddress().getLine2());
//					System.out.println("countryCode: " + c.getAddress().getCountryCode());
//					System.out.println("postalCode: " + c.getAddress().getPostalCode());
//					System.out.println("stateProvince: " + c.getAddress().getStateProvince());
//					System.out.println("number: " + c.getPhoneNumber().getNumber());
//					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//					System.out.println("##### END ADDRESS #####");
//					System.out.println("##### BEGIN PHONENUMBERS #####");
//					System.out.println("number: " + c.getPhoneNumber().getNumber());
//					System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//					System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//					System.out.println("##### END PHONENUMBERS #####");
//					System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//					for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
//					{
//						System.out.println("otherPhoneNumbers number: " + p.getNumber());
//						System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//						System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//					}
//					System.out.println("##### END OTHERPHONENUMBERS #####");
//					System.out.println("##### BEGIN EMAIL #####");
//					System.out.println("emailType: " + c.getEmail().getEmailType());
//					System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
//					System.out.println("##### END EMAIL #####");
//					System.out.println("##### BEGIN OTHEREMAILS #####");
//					for (XEmailType e : c.getOtherEmails().getEmail())
//					{
//						System.out.println("emailType: " + e.getEmailType());
//						System.out.println("emailAddress: " + e.getEmailAddress());
//					}
//					System.out.println("##### END OTHEREMAILS #####");
//					System.out.println(": " + c.getSex());
//					System.out.println(": " + c.getEmployerType());
//					System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
//					for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
//					{
//						System.out.println("studentRefId: " + csr.getStudentRefId());
//						System.out.println("relationshipCode: " + csr.getRelationshipCode());
//						System.out.println("restrictions: " + csr.getRestrictions());
//						System.out.println("livesWith: " + csr.isLivesWith());
//						System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
//						System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
//						System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
//						System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
//						System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
//						System.out.println("contactSequence: " + csr.getContactSequence());
//					}
//					System.out.println("##### END CONTACTRELATIONSHIPS #####");
//				}
//				System.out.println("##### END STUDENTCONTACTS #####");
//				System.out.println("##### BEGIN LANGUAGES #####");
//				for (XLanguageType l : s.getLanguages().getLanguage())
//				{
//					System.out.println("type: " + l.getType());
//					System.out.println("code: " + l.getCode());
//				}
//				System.out.println("##### END LANGUAGES #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
// 	// #################### xContacts ####################
//	// RETURN ALL CONTACTS
//	public static void XContacts_GetXSContactsLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXContacts); i++)
//		{
//			for (XContactType c : ricOne.sifXpress.GetXContacts())
//			{
//				System.out.println("refId: " + c.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + c.getName().getType());
//				System.out.println("prefix: " + c.getName().getPrefix());
//				System.out.println("familyName: " + c.getName().getFamilyName());
//				System.out.println("givenName: " + c.getName().getGivenName());
//				System.out.println("middleName: " + c.getName().getMiddleName());
//				System.out.println("suffix: " + c.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("##### BEGIN OTHERNAME #####");
//				for (XPersonNameType n : c.getOtherNames().getName())
//				{
//					System.out.println("type: " + n.getType());
//					System.out.println("prefix: " + n.getPrefix());
//					System.out.println("familyName: " + n.getFamilyName());
//					System.out.println("givenName: " + n.getGivenName());
//					System.out.println("middleName: " + n.getMiddleName());
//					System.out.println("suffix: " + n.getSuffix());
//				}
//				System.out.println("##### END OTHERNAME #####");
//
//				System.out.println("localId: " + c.getLocalId());
//				System.out.println("loginId: " + c.getLoginId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + c.getAddress().getAddressType());
//				System.out.println("city: " + c.getAddress().getCity());
//				System.out.println("line1: " + c.getAddress().getLine1());
//				System.out.println("line2: " + c.getAddress().getLine2());
//				System.out.println("countryCode: " + c.getAddress().getCountryCode());
//				System.out.println("postalCode: " + c.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + c.getAddress().getStateProvince());
//				System.out.println("number: " + c.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBERS #####");
//				System.out.println("number: " + c.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBERS #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//				for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBERS #####");
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + c.getEmail().getEmailType());
//				System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN OTHEREMAILS #####");
//				for (XEmailType e : c.getOtherEmails().getEmail())
//				{
//					System.out.println("emailType: " + e.getEmailType());
//					System.out.println("emailAddress: " + e.getEmailAddress());
//				}
//				System.out.println("##### END OTHEREMAILS #####");
//				System.out.println("sex: " + c.getSex());
//				System.out.println("employerType: " + c.getEmployerType());
//				System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
//				for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
//				{
//					System.out.println("studentRefId: " + csr.getStudentRefId());
//					System.out.println("relationshipCode: " + csr.getRelationshipCode());
//					System.out.println("restrictions: " + csr.getRestrictions());
//					System.out.println("livesWith: " + csr.isLivesWith());
//					System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
//					System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
//					System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
//					System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
//					System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
//					System.out.println("contactSequence: " + csr.getContactSequence());
//				}
//				System.out.println("##### END CONTACTRELATIONSHIPS #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN CONTACTS BY LEA
//	public static void XContacts_GetXContactsByXLeaLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXContactsByXLea, refId); i++)
//		{
//			for (XContactType c : ricOne.sifXpress.GetXContactsByXLea(refId))
//			{
//				System.out.println("refId: " + c.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + c.getName().getType());
//				System.out.println("prefix: " + c.getName().getPrefix());
//				System.out.println("familyName: " + c.getName().getFamilyName());
//				System.out.println("givenName: " + c.getName().getGivenName());
//				System.out.println("middleName: " + c.getName().getMiddleName());
//				System.out.println("suffix: " + c.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("##### BEGIN OTHERNAME #####");
//				for (XPersonNameType n : c.getOtherNames().getName())
//				{
//					System.out.println("type: " + n.getType());
//					System.out.println("prefix: " + n.getPrefix());
//					System.out.println("familyName: " + n.getFamilyName());
//					System.out.println("givenName: " + n.getGivenName());
//					System.out.println("middleName: " + n.getMiddleName());
//					System.out.println("suffix: " + n.getSuffix());
//				}
//				System.out.println("##### END OTHERNAME #####");
//
//				System.out.println("localId: " + c.getLocalId());
//				System.out.println("loginId: " + c.getLoginId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + c.getAddress().getAddressType());
//				System.out.println("city: " + c.getAddress().getCity());
//				System.out.println("line1: " + c.getAddress().getLine1());
//				System.out.println("line2: " + c.getAddress().getLine2());
//				System.out.println("countryCode: " + c.getAddress().getCountryCode());
//				System.out.println("postalCode: " + c.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + c.getAddress().getStateProvince());
//				System.out.println("number: " + c.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBERS #####");
//				System.out.println("number: " + c.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBERS #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//				for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBERS #####");
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + c.getEmail().getEmailType());
//				System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN OTHEREMAILS #####");
//				for (XEmailType e : c.getOtherEmails().getEmail())
//				{
//					System.out.println("emailType: " + e.getEmailType());
//					System.out.println("emailAddress: " + e.getEmailAddress());
//				}
//				System.out.println("##### END OTHEREMAILS #####");
//				System.out.println("sex: " + c.getSex());
//				System.out.println("employerType: " + c.getEmployerType());
//				System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
//				for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
//				{
//					System.out.println("studentRefId: " + csr.getStudentRefId());
//					System.out.println("relationshipCode: " + csr.getRelationshipCode());
//					System.out.println("restrictions: " + csr.getRestrictions());
//					System.out.println("livesWith: " + csr.isLivesWith());
//					System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
//					System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
//					System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
//					System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
//					System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
//					System.out.println("contactSequence: " + csr.getContactSequence());
//				}
//				System.out.println("##### END CONTACTRELATIONSHIPS #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN CONTACTS BY SCHOOL
//	public static void XContacts_GetXContactsByXSchoolLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXContactsByXSchool, refId); i++)
//		{
//			for (XContactType c : ricOne.sifXpress.GetXContactsByXSchool(refId))
//			{
//				System.out.println("refId: " + c.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + c.getName().getType());
//				System.out.println("prefix: " + c.getName().getPrefix());
//				System.out.println("familyName: " + c.getName().getFamilyName());
//				System.out.println("givenName: " + c.getName().getGivenName());
//				System.out.println("middleName: " + c.getName().getMiddleName());
//				System.out.println("suffix: " + c.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("##### BEGIN OTHERNAME #####");
//				for (XPersonNameType n : c.getOtherNames().getName())
//				{
//					System.out.println("type: " + n.getType());
//					System.out.println("prefix: " + n.getPrefix());
//					System.out.println("familyName: " + n.getFamilyName());
//					System.out.println("givenName: " + n.getGivenName());
//					System.out.println("middleName: " + n.getMiddleName());
//					System.out.println("suffix: " + n.getSuffix());
//				}
//				System.out.println("##### END OTHERNAME #####");
//
//				System.out.println("localId: " + c.getLocalId());
//				System.out.println("loginId: " + c.getLoginId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + c.getAddress().getAddressType());
//				System.out.println("city: " + c.getAddress().getCity());
//				System.out.println("line1: " + c.getAddress().getLine1());
//				System.out.println("line2: " + c.getAddress().getLine2());
//				System.out.println("countryCode: " + c.getAddress().getCountryCode());
//				System.out.println("postalCode: " + c.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + c.getAddress().getStateProvince());
//				System.out.println("number: " + c.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBERS #####");
//				System.out.println("number: " + c.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBERS #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//				for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBERS #####");
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + c.getEmail().getEmailType());
//				System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN OTHEREMAILS #####");
//				for (XEmailType e : c.getOtherEmails().getEmail())
//				{
//					System.out.println("emailType: " + e.getEmailType());
//					System.out.println("emailAddress: " + e.getEmailAddress());
//				}
//				System.out.println("##### END OTHEREMAILS #####");
//				System.out.println("sex: " + c.getSex());
//				System.out.println("employerType: " + c.getEmployerType());
//				System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
//				for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
//				{
//					System.out.println("studentRefId: " + csr.getStudentRefId());
//					System.out.println("relationshipCode: " + csr.getRelationshipCode());
//					System.out.println("restrictions: " + csr.getRestrictions());
//					System.out.println("livesWith: " + csr.isLivesWith());
//					System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
//					System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
//					System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
//					System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
//					System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
//					System.out.println("contactSequence: " + csr.getContactSequence());
//				}
//				System.out.println("##### END CONTACTRELATIONSHIPS #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
//
//	// RETURN CONTACTS BY STUDENT
//	public static void XContacts_GetXContactsByXStudentLastPage(RicOneApiClient ricOne)
//	{
//		for (int i = 1; i <= ricOne.sifXpress.GetLastPage(navigationPageSize, SifXpress.ServicePath.GetXContactsByXStudent, refId); i++)
//		{
//			for (XContactType c : ricOne.sifXpress.GetXContactsByXStudent(refId))
//			{
//				System.out.println("refId: " + c.getRefId());
//				System.out.println("##### BEGIN NAME #####");
//				System.out.println("type: " + c.getName().getType());
//				System.out.println("prefix: " + c.getName().getPrefix());
//				System.out.println("familyName: " + c.getName().getFamilyName());
//				System.out.println("givenName: " + c.getName().getGivenName());
//				System.out.println("middleName: " + c.getName().getMiddleName());
//				System.out.println("suffix: " + c.getName().getSuffix());
//				System.out.println("##### END NAME #####");
//				System.out.println("##### BEGIN OTHERNAME #####");
//				for (XPersonNameType n : c.getOtherNames().getName())
//				{
//					System.out.println("type: " + n.getType());
//					System.out.println("prefix: " + n.getPrefix());
//					System.out.println("familyName: " + n.getFamilyName());
//					System.out.println("givenName: " + n.getGivenName());
//					System.out.println("middleName: " + n.getMiddleName());
//					System.out.println("suffix: " + n.getSuffix());
//				}
//				System.out.println("##### END OTHERNAME #####");
//
//				System.out.println("localId: " + c.getLocalId());
//				System.out.println("loginId: " + c.getLoginId());
//				System.out.println("##### BEGIN OTHERIDS #####");
//				for (XOtherPersonIdType id : c.getOtherIds().getOtherId())
//				{
//					System.out.println("id: " + id.getId());
//					System.out.println("type: " + id.getType());
//				}
//				System.out.println("##### END OTHERIDS #####");
//				System.out.println("##### BEGIN ADDRESS #####");
//				System.out.println("addressType: " + c.getAddress().getAddressType());
//				System.out.println("city: " + c.getAddress().getCity());
//				System.out.println("line1: " + c.getAddress().getLine1());
//				System.out.println("line2: " + c.getAddress().getLine2());
//				System.out.println("countryCode: " + c.getAddress().getCountryCode());
//				System.out.println("postalCode: " + c.getAddress().getPostalCode());
//				System.out.println("stateProvince: " + c.getAddress().getStateProvince());
//				System.out.println("number: " + c.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END ADDRESS #####");
//				System.out.println("##### BEGIN PHONENUMBERS #####");
//				System.out.println("number: " + c.getPhoneNumber().getNumber());
//				System.out.println("phoneNumberType: " + c.getPhoneNumber().getPhoneNumberType());
//				System.out.println("primaryIndicator: " + c.getPhoneNumber().isPrimaryIndicator());
//				System.out.println("##### END PHONENUMBERS #####");
//				System.out.println("##### BEGIN OTHERPHONENUMBERS #####");
//				for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber())
//				{
//					System.out.println("otherPhoneNumbers number: " + p.getNumber());
//					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
//					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
//				}
//				System.out.println("##### END OTHERPHONENUMBERS #####");
//				System.out.println("##### BEGIN EMAIL #####");
//				System.out.println("emailType: " + c.getEmail().getEmailType());
//				System.out.println("emailAddress: " + c.getEmail().getEmailAddress());
//				System.out.println("##### END EMAIL #####");
//				System.out.println("##### BEGIN OTHEREMAILS #####");
//				for (XEmailType e : c.getOtherEmails().getEmail())
//				{
//					System.out.println("emailType: " + e.getEmailType());
//					System.out.println("emailAddress: " + e.getEmailAddress());
//				}
//				System.out.println("##### END OTHEREMAILS #####");
//				System.out.println("sex: " + c.getSex());
//				System.out.println("employerType: " + c.getEmployerType());
//				System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
//				for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship())
//				{
//					System.out.println("studentRefId: " + csr.getStudentRefId());
//					System.out.println("relationshipCode: " + csr.getRelationshipCode());
//					System.out.println("restrictions: " + csr.getRestrictions());
//					System.out.println("livesWith: " + csr.isLivesWith());
//					System.out.println("primaryContactIndicator: " + csr.isPrimaryContactIndicator());
//					System.out.println("emergencyContactIndicator: " + csr.isEmergencyContactIndicator());
//					System.out.println("financialResponsibilityIndicator: " + csr.isFinancialResponsibilityIndicator());
//					System.out.println("custodialIndicator: " + csr.isCustodialIndicator());
//					System.out.println("communicationsIndicator: " + csr.isCommunicationsIndicator());
//					System.out.println("contactSequence: " + csr.getContactSequence());
//				}
//				System.out.println("##### END CONTACTRELATIONSHIPS #####");
//				System.out.println("========================================");
//			}
//			System.out.println("######## PAGE " + i + " ########");
//		}
//	}
}
