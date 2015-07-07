import riconeapi.models.authentication.Endpoint;
import sif.dd.xPress.model.XCalendarType;
import sif.dd.xPress.model.XCourseType;
import sif.dd.xPress.model.XLeaType;
import sif.dd.xPress.model.XMeetingTimeType;
import sif.dd.xPress.model.XOtherCourseIdType;
import sif.dd.xPress.model.XOtherOrganizationIdType;
import sif.dd.xPress.model.XOtherPersonIdType;
import sif.dd.xPress.model.XPersonReferenceType;
import sif.dd.xPress.model.XStaffPersonAssignmentType;
import sif.dd.xPress.model.XRosterType;
import sif.dd.xPress.model.XSchoolType;
import sif.dd.xPress.model.XSessionType;
import sif.dd.xPress.model.XStaffReferenceType;
import sif.dd.xPress.model.XStaffType;
import sif.dd.xPress.model.XTelephoneType;

public class RicOneApiTests
{
	//region Test Constants
	final static String username = "Full_3";
	final static String password = "Full_3";
    //final String provider = "North East Regional Information Center - productio";
	final static String providerId = "SCRIC - Test Data Provider 1";
    static String navigationPage = "1";
    static String navigationPageSize = "1";
    
    //Null:
    static String refId = null;
    //Lea:         
//    static String refId = "9BA8379D-9A9D-4D59-9202-E976CADF5526";
    //School:      
//    static String refId = "66667705-6C51-4C30-A22A-77CEA0FBCF53";
    //Calendar:
//    static String refId = "B0FD06FD-5F35-4D96-B2EA-AA96CD2D0F38";
    //Course:
//    static String refId = "C9DEA47A-DB79-4912-B5F4-03EB50C2A99F";
    //Roster:
//    static String refId = "4BDC482E-B0CA-4D36-B5EC-607E06D08727";
    //Staff:
//    static String refId = "61126B90-2AF9-4176-9377-005686D1B855";
    //Student:
//    static String refId = "0AC93DFD-DC1C-48A4-9D37-000210E4C952";
    //Contact 1:
//    static String refId = "9a7345c7-72bd-4672-aee2-001876903ad8";
    //Contact 2:
//    static String refId = "128592BC-691D-4ED0-9493-0007D6966142";
    
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
			
			//xLeas
//			XLeas_GetXLeas(ricOne);
//			XLeas_GetXLea(ricOne);
//			XLeas_GetXLeasByXSchool(ricOne);
//			XLeas_GetXLeasByXStudent(ricOne);
//			XLeas_GetXLeasByXContact(ricOne);
			
		    // xSchools
//            XSchools_GetXSchools(ricOne);
//            XSchools_GetXSchool(ricOne);
//            XSchools_GetXSchoolsByXLea(ricOne);
//            XSchools_GetXSchoolsByXCalendar(ricOne);
//            XSchools_GetXSchoolsByXCourse(ricOne);
//            XSchools_GetXSchoolsByXRoster(ricOne);
//            XSchools_GetXSchoolsByXStaff(ricOne);
//            XSchools_GetXSchoolsByXStudent(ricOne);
//            XSchools_GetXSchoolsByXContact(ricOne);
            
            // xCalendars
//            XCalendars_GetXCalendars(ricOne);
//            XCalendars_GetXCalendar(ricOne);
//            XCalendars_GetXCalendarsByXSchool(ricOne);

            // xCourses
//            XCourses_GetXCourses(ricOne);
//            XCourses_GetXCourse(ricOne);
//            XCourses_GetXCoursesByXLea(ricOne);

            // xRosters
//            XRosters_GetXRosters(ricOne);
//            XRosters_GetXRoster(ricOne);
//            XRosters_GetXRostersByXLea(ricOne);
//            XRosters_GetXRostersByXSchool(ricOne);
//            XRosters_GetXRostersByXCourse(ricOne);
//            XRosters_GetXRostersByXStaff(ricOne);
//            XRosters_GetXRostersByXStudent(ricOne);

            // xStaffs
//            XStaffs_GetXStaffs(ricOne);
//            XStaffs_GetXStaff(ricOne);
//            XStaffs_GetXStaffsByXLea(ricOne);
//            XStaffs_GetXStaffsByXSchool(ricOne);
//            XStaffs_GetXStaffsByXCourse(ricOne);
//            XStaffs_GetXStaffsByXRoster(ricOne);         

            // xStudents
            //XStudents_GetXStudents(ricOne);
            //XStudents_GetXStudent(ricOne);
            //XStudents_GetXStudentsByXLea(ricOne);
            //XStudents_GetXStudentsByXSchool(ricOne);
            //XStudents_GetXStudentsByXRoster(ricOne);
            //XStudents_GetXStudentsByXStaff(ricOne);
            //XStudents_GetXStudentsByXContact(ricOne);

            // xContacts
            //XContacts_GetXSContacts(ricOne);
            //XContacts_GetXSContact(ricOne);
            //XContacts_GetXContactsByXLea(ricOne);
            //XContacts_GetXContactsByXSchool(ricOne);
            //XContacts_GetXContactsByXStudent(ricOne);


		}

	}
	
	// #################### xLeas ####################
	//RETURN ALL LEAS
	public static void XLeas_GetXLeas(RicOneApiClient ricOne)
	{
		for (XLeaType lea : ricOne.sifXpress.GetXLeas(navigationPage, navigationPageSize))
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
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
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
        System.out.println("##### BEGIN PHONENUMBER #####");
        System.out.println("##### BEGIN OTHERPHONENUMBER #####");
        for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
        {
            System.out.println("otherPhoneNumbers number: " + p.getNumber());
            System.out.println("phoneNumberType: " + p.getPhoneNumberType());
            System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
        }
        System.out.println("##### BEGIN OTHERPHONENUMBER #####");
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
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
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
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
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
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
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
             System.out.println("##### BEGIN PHONENUMBER #####");
             System.out.println("##### BEGIN OTHERPHONENUMBER #####");
             for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
             {
                 System.out.println("otherPhoneNumbers number: " + p.getNumber());
                 System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                 System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
             }
             System.out.println("##### BEGIN OTHERPHONENUMBER #####");
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
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
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
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
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
            System.out.println("##### BEGIN PHONENUMBER #####");
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
            for(XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
            {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### BEGIN OTHERPHONENUMBER #####");
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
 	// #################### xStudents ####################
 	// #################### xContacts ####################
    
    
}
