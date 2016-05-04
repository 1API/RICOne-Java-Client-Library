/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.2
 * @since       May 4, 2016
 * Filename		RicOneApiTests.java
 */

import riconeapi.common.Authenticator;
import riconeapi.common.RicOneApiClient;
import riconeapi.common.Util;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.XAppProvisioningInfoType;
import riconeapi.models.xpress.XCalendarType;
import riconeapi.models.xpress.XContactStudentRelationshipType;
import riconeapi.models.xpress.XContactType;
import riconeapi.models.xpress.XCourseType;
import riconeapi.models.xpress.XEmailType;
import riconeapi.models.xpress.XEnrollmentType;
import riconeapi.models.xpress.XLanguageType;
import riconeapi.models.xpress.XLeaType;
import riconeapi.models.xpress.XMeetingTimeType;
import riconeapi.models.xpress.XOtherCourseIdType;
import riconeapi.models.xpress.XOtherOrganizationIdType;
import riconeapi.models.xpress.XOtherPersonIdType;
import riconeapi.models.xpress.XPersonNameType;
import riconeapi.models.xpress.XPersonReferenceType;
import riconeapi.models.xpress.XRaceType;
import riconeapi.models.xpress.XRosterType;
import riconeapi.models.xpress.XSchoolType;
import riconeapi.models.xpress.XSessionType;
import riconeapi.models.xpress.XStaffPersonAssignmentType;
import riconeapi.models.xpress.XStaffReferenceType;
import riconeapi.models.xpress.XStaffType;
import riconeapi.models.xpress.XStudentType;
import riconeapi.models.xpress.XTelephoneType;

public class RicOneApiTests
{
	// Test Constants
	final static String authUrl = "http://auth.test.ricone.org/login";
	final static String clientId = "dpademo";
	final static String clientSecret = "65ee6dc913d9023f1ee94ab33c3cae38c57";
//	final static String clientSecret = "afklj";
	
//	final static String authUrl = "https://auth.ricone.org/login";
//	final static String clientId = "STAR_Assessments";
//	final static String clientSecret = "STAR_Assessments";

	final static String providerId = "workshop";
//	static int navigationPage = 1;
//	static int navigationPageSize = 1;
//	static int navigationPageSize = 20000;
    
	// Null:
	static String refId = null;
	// Lea:
//	static String refId = "1098EFC6-5374-4D7D-AEAE-58E021CCB146";
	// School:
//	static String refId = "0F4DE8DE-5AA3-48A7-A330-62E0B8910F1C";
//	static String refId = "BAC59C6E-D8DD-4E21-938A-13A80E555B7E";
	// Calendar:
//	static String refId = "0451AF50-40BA-4231-8656-AE4C28AF7426";
	// Course:
//	static String refId = "A985F5AF-2139-4C5C-B253-00AEE896259E";
	// Roster:
//	static String refId = "9AEF7446-1B9F-4C2A-A7FF-0058C51C0E5F";
//	 Staff:
//	static String refId = "DDB25022-B78E-4C89-9A59-AE877E03CFE3";
//	 Student:
//	static String refId = "4C4A57D5-ED2F-4AFC-8C20-2A309989ED71";
//	static String refId = "62DF00BD-6A5A-4FE9-AD17-9A03189DAEA5";
	// Contact 1:
//	static String refId = "F0BED6E9-8636-4BB3-8295-778D8930B2A1";

	
	
	public static void main(String[] args)
	{   	
		Util.disableSslVerification();
		Authenticator auth = new Authenticator(authUrl, clientId, clientSecret);
		
		for (Endpoint e : auth.getEndpoints(providerId))
		{
			RicOneApiClient ricOne = new RicOneApiClient(e);

			// xLeas
//			XLeas_GetXLeas(ricOne);
//			XLeas_GetXLea(ricOne);
//			XLeas_GetXLeasByXSchool(ricOne);
//			XLeas_GetXLeasByXRoster(ricOne);
//			XLeas_GetXLeasByXStaff(ricOne);
//			XLeas_GetXLeasByXStudent(ricOne);
//			XLeas_GetXLeasByXContact(ricOne);

			// xSchools
//			XSchools_GetXSchools(ricOne);
//			XSchools_GetXSchool(ricOne);
//			XSchools_GetXSchoolsByXLea(ricOne);
//			XSchools_GetXSchoolsByXCalendar(ricOne);
//			XSchools_GetXSchoolsByXCourse(ricOne);
//			XSchools_GetXSchoolsByXRoster(ricOne);
//			XSchools_GetXSchoolsByXStaff(ricOne);
//			XSchools_GetXSchoolsByXStudent(ricOne);
//			XSchools_GetXSchoolsByXContact(ricOne);

			// xCalendars
//			XCalendars_GetXCalendars(ricOne);
//			XCalendars_GetXCalendar(ricOne);
//			XCalendars_GetXCalendarsByXLea(ricOne);
//			XCalendars_GetXCalendarsByXSchool(ricOne);

			// xCourses
//			XCourses_GetXCourses(ricOne);
//			XCourses_GetXCourse(ricOne);
//			XCourses_GetXCoursesByXLea(ricOne);
//			XCourses_GetXCoursesByXSchool(ricOne);
//			XCourses_GetXCoursesByXRoster(ricOne);

			// xRosters
//			XRosters_GetXRosters(ricOne);
//			XRosters_GetXRoster(ricOne);
//			XRosters_GetXRostersByXLea(ricOne);
//			XRosters_GetXRostersByXSchool(ricOne);
//			XRosters_GetXRostersByXCourse(ricOne);
//			XRosters_GetXRostersByXStaff(ricOne);
//			XRosters_GetXRostersByXStudent(ricOne);

			// xStaffs
//			XStaffs_GetXStaffs(ricOne);
//			XStaffs_GetXStaff(ricOne);
//			XStaffs_GetXStaffsByXLea(ricOne);
//			XStaffs_GetXStaffsByXSchool(ricOne);
//			XStaffs_GetXStaffsByXCourse(ricOne);
//			XStaffs_GetXStaffsByXRoster(ricOne);
//			XStaffs_GetXStaffsByXStudent(ricOne);

			// xStudents
//			XStudents_GetXStudents(ricOne);
//			XStudents_GetXStudent(ricOne);
//			XStudents_GetXStudentsByXLea(ricOne);
//			XStudents_GetXStudentsByXSchool(ricOne);
//			XStudents_GetXStudentsByXRoster(ricOne);
//			XStudents_GetXStudentsByXStaff(ricOne);
//			XStudents_GetXStudentsByXContact(ricOne);

			// xContacts
//			XContacts_GetXSContacts(ricOne);
//			XContacts_GetXSContact(ricOne);
//			XContacts_GetXContactsByXLea(ricOne);
//			XContacts_GetXContactsByXSchool(ricOne);
//			XContacts_GetXContactsByXStudent(ricOne);

		}

	}
	
	// #################### xLeas ####################
	//RETURN ALL LEAS
	public static void XLeas_GetXLeas(RicOneApiClient ricOne)
	{
		if(ricOne.xPress.getXLeas().getData() != null)
		{
			for (XLeaType lea : ricOne.xPress.getXLeas().getData())
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
	//RETURN SINGLE LEA
	public static void XLeas_GetXLea(RicOneApiClient ricOne)
    {
		if(ricOne.xPress.getXLea(refId).getData() != null)
		{
			XLeaType lea = ricOne.xPress.getXLea(refId).getData();
			
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

	 //RETURN LEAS BY SCHOOL
    public static void XLeas_GetXLeasByXSchool(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXLeasByXSchool(refId).getData() != null)
    	{
    		for (XLeaType lea : ricOne.xPress.getXLeasByXSchool(refId).getData())
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
    
    //RETURN LEAS BY ROSTER
    public static void XLeas_GetXLeasByXRoster(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXLeasByXRoster(refId).getData() != null)
    	{
    		for (XLeaType lea : ricOne.xPress.getXLeasByXRoster(refId).getData())
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
    
    //RETURN LEAS BY STAFF
    public static void XLeas_GetXLeasByXStaff(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXLeasByXStaff(refId).getData() != null)
    	{
    		for (XLeaType lea : ricOne.xPress.getXLeasByXStaff(refId).getData())
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
    
    //RETURN LEAS BY STUDENT
    public static void XLeas_GetXLeasByXStudent(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXLeasByXStudent(refId).getData() != null)
    	{
    		for (XLeaType lea : ricOne.xPress.getXLeasByXStudent(refId).getData())
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
    
    //RETURN LEAS BY CONTACT
    public static void XLeas_GetXLeasByXContact(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXLeasByXContact(refId).getData() != null)
    	{
    		for (XLeaType lea : ricOne.xPress.getXLeasByXContact(refId).getData())
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
    
    // #################### xSchools ####################
    //RETURN ALL SCHOOLS
 
    public static void XSchools_GetXSchools(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXSchools().getData() != null)
    	{
    		for(XSchoolType school : ricOne.xPress.getXSchools().getData())
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
                System.out.println("##### BEGIN GRADELEVELS #####");
                for(String gl : school.getGradeLevels().getGradeLevel())
                {
                    System.out.println("gradeLevel: " + gl);
                }
                System.out.println("##### END GRADELEVELS #####");
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
    }
    //RETURN SINGLE SCHOOL
    public static void XSchools_GetXSchool(RicOneApiClient ricOne)
    {
        if(ricOne.xPress.getXSchool(refId).getData() != null)
        {
        	XSchoolType school = ricOne.xPress.getXSchool(refId).getData();

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
            System.out.println("##### BEGIN GRADELEVELS #####");
            for(String gl : school.getGradeLevels().getGradeLevel())
            {
                System.out.println("gradeLevel: " + gl);
            }
            System.out.println("##### END GRADELEVELS #####");
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
    //RETURN SCHOOLS BY LEA
    public static void XSchools_GetXSchoolsByXLea(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXSchoolsByXLea(refId).getData() != null)
    	{
    		for(XSchoolType school : ricOne.xPress.getXSchoolsByXLea(refId).getData())
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
	            System.out.println("##### BEGIN GRADELEVELS #####");
	            for(String gl : school.getGradeLevels().getGradeLevel())
	            {
	                System.out.println("gradeLevel: " + gl);
	            }
	            System.out.println("##### END GRADELEVELS #####");
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
    }
    //RETURN SCHOOLS BY CALENDAR
    public static void XSchools_GetXSchoolsByXCalendar(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXSchoolsByXCalendar(refId).getData() !=null)
    	{
			for (XSchoolType school : ricOne.xPress.getXSchoolsByXCalendar(refId).getData())
			{
				System.out.println("refId: " + school.getRefId());
				System.out.println("leaRefId: " + school.getRefId());
				System.out.println("localId: " + school.getLocalId());
				System.out.println("stateProvinceId: " + school.getStateProvinceId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("schoolName: " + school.getSchoolName());
				System.out.println("##### BEGIN GRADELEVELS #####");
				for (String gl : school.getGradeLevels().getGradeLevel())
				{
					System.out.println("gradeLevel: " + gl);
				}
				System.out.println("##### END GRADELEVELS #####");
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
				for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber())
				{
					System.out.println("otherPhoneNumbers number: " + p.getNumber());
					System.out.println("phoneNumberType: " + p.getPhoneNumberType());
					System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
				}
				System.out.println("##### END OTHERPHONENUMBER #####");
				System.out.println("========================================");
			}
    	}
    }
    //RETURN SCHOOLS BY COURSE
    public static void XSchools_GetXSchoolsByXCourse(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXSchoolsByXCourse(refId).getData() != null)
    	{
    		for(XSchoolType school : ricOne.xPress.getXSchoolsByXCourse(refId).getData())
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
                System.out.println("##### BEGIN GRADELEVELS #####");
                for(String gl : school.getGradeLevels().getGradeLevel())
                {
                    System.out.println("gradeLevel: " + gl);
                }
                System.out.println("##### END GRADELEVELS #####");
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
     }
    
    //RETURN SCHOOLS BY ROSTER
    public static void XSchools_GetXSchoolsByXRoster(RicOneApiClient ricOne)
     {
    	if(ricOne.xPress.getXSchoolsByXRoster(refId).getData() != null)
    	{
    		for(XSchoolType school : ricOne.xPress.getXSchoolsByXRoster(refId).getData())
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
                System.out.println("##### BEGIN GRADELEVELS #####");
                for(String gl : school.getGradeLevels().getGradeLevel())
                {
                    System.out.println("gradeLevel: " + gl);
                }
                System.out.println("##### END GRADELEVELS #####");
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
     }
    //RETURN SCHOOLS BY STAFF
    public static void XSchools_GetXSchoolsByXStaff(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXSchoolsByXStaff(refId).getData() != null)
    	{
    		for(XSchoolType school : ricOne.xPress.getXSchoolsByXStaff(refId).getData())
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
                System.out.println("##### BEGIN GRADELEVELS #####");
                for(String gl : school.getGradeLevels().getGradeLevel())
                {
                    System.out.println("gradeLevel: " + gl);
                }
                System.out.println("##### END GRADELEVELS #####");
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
    }
    //RETURN SCHOOLS BY STUDENT
    public static void XSchools_GetXSchoolsByXStudent(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXSchoolsByXStudent(refId).getData() != null)
    	{
    		for(XSchoolType school : ricOne.xPress.getXSchoolsByXStudent(refId).getData())
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
                System.out.println("##### BEGIN GRADELEVELS #####");
                for(String gl : school.getGradeLevels().getGradeLevel())
                {
                    System.out.println("gradeLevel: " + gl);
                }
                System.out.println("##### END GRADELEVELS #####");
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
    }
    //RETURN SCHOOLS BY CONTACT
    public static void XSchools_GetXSchoolsByXContact(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXSchoolsByXContact(refId).getData() != null)
    	{
    		for(XSchoolType school : ricOne.xPress.getXSchoolsByXContact(refId).getData())
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
                System.out.println("##### BEGIN GRADELEVELS #####");
                for(String gl : school.getGradeLevels().getGradeLevel())
                {
                    System.out.println("gradeLevel: " + gl);
                }
                System.out.println("##### END GRADELEVELS #####");
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
    }
    
    // #################### xCalendars ####################
    //RETURN ALL CALENDARS
    public static void XCalendars_GetXCalendars(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXCalendars().getData() != null)
    	{
    		for(XCalendarType calendar : ricOne.xPress.getXCalendars().getData())
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
    }
    //RETURN SINGLE CALENDAR
    public static void XCalendars_GetXCalendar(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXCalendar(refId).getData() != null)
    	{
    		XCalendarType calendar = ricOne.xPress.getXCalendar(refId).getData();

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
    //RETURN CALENDARS BY LEA
    public static void XCalendars_GetXCalendarsByXLea(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXCalendarsByXLea(refId).getData() != null)
    	{
    		for(XCalendarType calendar : ricOne.xPress.getXCalendarsByXLea(refId).getData())
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
    }
    //RETURN CALENDARS BY SCHOOL
    public static void XCalendars_GetXCalendarsByXSchool(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXCalendarsByXSchool(refId).getData() != null)
    	{
    		for(XCalendarType calendar : ricOne.xPress.getXCalendarsByXSchool(refId).getData())
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
    }
    
    // #################### xCourses ####################
    //RETURN ALL COURSES
    public static void XCourses_GetXCourses(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXCourses().getData() != null)
    	{
    		for(XCourseType course : ricOne.xPress.getXCourses().getData())
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
    }
    //RETURN SINGLE COURSE
    public static void XCourses_GetXCourse(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXCourse(refId).getData() != null)
    	{
    		XCourseType course = ricOne.xPress.getXCourse(refId).getData();
        	
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
    //RETURN COURSES BY LEA
    public static void XCourses_GetXCoursesByXLea(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXCoursesByXLea(refId).getData() != null)
    	{
    		for (XCourseType course : ricOne.xPress.getXCoursesByXLea(refId).getData())
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
    }
    //RETURN COURSES BY School
    public static void XCourses_GetXCoursesByXSchool(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXCoursesByXSchool(refId).getData() != null)
    	{
    		for (XCourseType course : ricOne.xPress.getXCoursesByXSchool(refId).getData())
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
    }
    //RETURN COURSES BY ROSTER
    public static void XCourses_GetXCoursesByXRoster(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXCoursesByXRoster(refId).getData() != null)
    	{
			for (XCourseType course : ricOne.xPress.getXCoursesByXRoster(refId).getData())
			{
				System.out.println("refId: " + course.getRefId());
				System.out.println("schoolRefId: " + course.getSchoolRefId());
				System.out.println("schoolCourseId: " + course.getSchoolCourseId());
				System.out.println("leaCourseId: " + course.getLeaCourseId());
				System.out.println("##### BEGIN OTHERIDS #####");
				for (XOtherCourseIdType id : course.getOtherIds().getOtherId())
				{
					System.out.println("otherId id" + id.getId());
					System.out.println("type: " + id.getType());
				}
				System.out.println("##### END OTHERIDS #####");
				System.out.println("courseTitle: " + course.getCourseTitle());
				System.out.println("description: " + course.getDescription());
				System.out.println("subject: " + course.getSubject());
				System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
				for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel())
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
    }
 	
    // #################### xRosters ####################
    //RETURN ALL ROSTERS
    public static void XRosters_GetXRosters(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXRosters().getData() != null)
    	{
    		for(XRosterType r : ricOne.xPress.getXRosters().getData())
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
    }
    //RETURN SINGLE ROSTER
    public static void XRosters_GetXRoster(RicOneApiClient ricOne)
    {
        if(ricOne.xPress.getXRoster(refId).getData() != null)
        {
        	XRosterType r = ricOne.xPress.getXRoster(refId).getData();

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
    //RETURN ROSTERS BY LEA
    public static void XRosters_GetXRostersByXLea(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXRostersByXLea(refId).getData() != null)
    	{
    		for (XRosterType r : ricOne.xPress.getXRostersByXLea(refId).getData())
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
    }
    //RETURN ROSTERS BY SCHOOL
    public static void XRosters_GetXRostersByXSchool(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXRostersByXSchool(refId).getData() != null)
    	{
			for (XRosterType r : ricOne.xPress.getXRostersByXSchool(refId).getData())
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
				for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime())
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
				for (XPersonReferenceType student : r.getStudents().getStudentReference())
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
				for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff())
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
    }
    //RETURN ROSTERS BY CROUSE
    public static void XRosters_GetXRostersByXCourse(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXRostersByXCourse(refId).getData() != null)
    	{
    		for (XRosterType r : ricOne.xPress.getXRostersByXCourse(refId).getData())
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
    }
    //RETURN ROSTERS BY STAFF
    public static void XRosters_GetXRostersByXStaff(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXRostersByXStaff(refId).getData() != null)
    	{
    		for (XRosterType r : ricOne.xPress.getXRostersByXStaff(refId).getData())
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
    }
    //RETURN ROSTERS BY STUDENT
    public static void XRosters_GetXRostersByXStudent(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXRostersByXStudent(refId).getData() != null)
    	{
    		for (XRosterType r : ricOne.xPress.getXRostersByXStudent(refId).getData())
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
    }
 	
    // #################### xStaffs ####################
    //RETURN ALL STAFFS
    public static void XStaffs_GetXStaffs(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXStaffs().getData() != null)
    	{
    		for(XStaffType s : ricOne.xPress.getXStaffs().getData())
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
    }
    //RETURN SINGLE STAFF
    public static void XStaffs_GetXStaff(RicOneApiClient ricOne)
    {
        if(ricOne.xPress.getXStaff(refId).getData() != null)
        {  		
        	XStaffType s = ricOne.xPress.getXStaff(refId).getData();

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
    //RETURN STAFFS BY LEA
    public static void XStaffs_GetXStaffsByXLea(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXStaffsByXLea(refId).getData() != null)
    	{
    		for(XStaffType s : ricOne.xPress.getXStaffsByXLea(refId).getData())
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
    }
    //RETURN STAFFS BY SCHOOL
    public static void XStaffs_GetXStaffsByXSchool(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXStaffsByXSchool(refId).getData() != null)
    	{
    		for(XStaffType s : ricOne.xPress.getXStaffsByXSchool(refId).getData())
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
    }
    //RETURN STAFFS BY COURSE
    public static void XStaffs_GetXStaffsByXCourse(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXStaffsByXCourse(refId).getData() != null)
    	{
    		for(XStaffType s : ricOne.xPress.getXStaffsByXCourse(refId).getData())
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
    }
    //RETURN STAFFS BY ROSTER
    public static void XStaffs_GetXStaffsByXRoster(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXStaffsByXRoster(refId).getData() != null)
    	{
    		for(XStaffType s : ricOne.xPress.getXStaffsByXRoster(refId).getData())
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
    }
  //RETURN STAFFS BY ROSTER
    public static void XStaffs_GetXStaffsByXStudent(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXStaffsByXStudent(refId).getData() != null)
    	{
    		for(XStaffType s : ricOne.xPress.getXStaffsByXStudent(refId).getData())
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
    }
 	// #################### xStudents ####################
    //RETURN ALL STUDENTS
    public static void XStudents_GetXStudents(RicOneApiClient ricOne)
    { 
    	if(ricOne.xPress.getXStudents().getData() != null)
    	{
    		for(XStudentType s : ricOne.xPress.getXStudents().getData())
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
    }
    //RETURN SINGLE STUDENT
    public static void XStudents_GetXStudent(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXStudent(refId).getData() != null)
    	{	
    		 	XStudentType s = ricOne.xPress.getXStudent(refId).getData();

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
    //RETURN STUDENTS BY LEA
    public static void XStudents_GetXStudentsByXLea(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXStudentsByXLea(refId).getData() != null)
    	{
    		for(XStudentType s : ricOne.xPress.getXStudentsByXLea(refId).getData())
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
                    System.out.println("localId: " + c.getLocalId());
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
    }
    //RETURN STUDENTS BY SCHOOL
    public static void XStudents_GetXStudentsByXSchool(RicOneApiClient ricOne) 
    {
    	if(ricOne.xPress.getXStudentsByXSchool(refId).getData() != null)
    	{
    		for(XStudentType s : ricOne.xPress.getXStudentsByXSchool(refId).getData())
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
                    System.out.println("localId: " + c.getLocalId());
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
    }
    //RETURN STUDENTS BY ROSTER
    public static void XStudents_GetXStudentsByXRoster(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXStudentsByXRoster(refId).getData() != null)
    	{
    		for(XStudentType s : ricOne.xPress.getXStudentsByXRoster(refId).getData())
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
                    System.out.println("localId: " + c.getLocalId());
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
    }
    //RETURN STUDENTS BY STAFF
    public static void XStudents_GetXStudentsByXStaff(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXStudentsByXStaff(refId).getData() != null)
    	{
    		for(XStudentType s : ricOne.xPress.getXStudentsByXStaff(refId).getData())
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
                    System.out.println("localId: " + c.getLocalId());
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
    }
    //RETURN STUDENTS BY CONTACT
    public static void XStudents_GetXStudentsByXContact(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXStudentsByXContact(refId).getData() != null)
    	{
    		for(XStudentType s : ricOne.xPress.getXStudentsByXContact(refId).getData())
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
                    System.out.println("localId: " + c.getLocalId());
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
    }

 	// #################### xContacts ####################
    //RETURN ALL CONTACTS
    public static void XContacts_GetXSContacts(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXContacts().getData() != null)
    	{
    		for(XContactType c : ricOne.xPress.getXContacts().getData())
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
    }
    //RETURN SINGLE CONTACT
    public static void XContacts_GetXSContact(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXContact(refId).getData() != null)
    	{
    		XContactType c = ricOne.xPress.getXContact(refId).getData();

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
    //RETURN CONTACTS BY LEA
    public static void XContacts_GetXContactsByXLea(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXContactsByXLea(refId).getData() != null)
    	{
    		for(XContactType c : ricOne.xPress.getXContactsByXLea(refId).getData())
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
    }
    //RETURN CONTACTS BY SCHOOL
    public static void XContacts_GetXContactsByXSchool(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXContactsByXSchool(refId).getData() != null)
    	{
    		for(XContactType c : ricOne.xPress.getXContactsByXSchool(refId).getData())
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
    }
    //RETURN CONTACTS BY STUDENT
    public static void XContacts_GetXContactsByXStudent(RicOneApiClient ricOne)
    {
    	if(ricOne.xPress.getXContactsByXStudent(refId).getData() != null)
    	{
    		for(XContactType c : ricOne.xPress.getXContactsByXStudent(refId).getData())
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
    }
}
