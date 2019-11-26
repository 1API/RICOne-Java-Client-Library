package cases;

import riconeapi.authentication.Authenticator;
import riconeapi.common.XPress;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.*;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since Apr 23, 2018
 */
public class RicOneApiTests {
    // RestResponse Constants
    final static String authUrl = AuthServiceProperties.getInstance().getProperty("auth.url");
    final static String clientId = "dpaDemo";
    final static String clientSecret = "deecd889bff5ed0101a86680752f5f9";
    final static String providerId = AuthServiceProperties.getInstance().getProperty("auth.providerId");

    static String LEA_REFID = "03ACF04F-DC12-411A-9A42-E8323516D699";
	static String LEA_BEDSIDTYPE = "beds";
	static String LEA_BEDSID = "530501060000";
	static String LEA_LOCALIDTYPE = "local";
	static String LEA_LOCALID = "530501";
	static String SCHOOL_REFID = "AE6B3441-5E31-4573-BADB-081669D79C7F";
	static String SCHOOL_BEDSIDTYPE = "BEDS";
	static String SCHOOL_BEDSID = "530501060004";
	static String SCHOOL_LOCALIDTYPE = "local";
	static String SCHOOL_LOCALID = "shm";
	static String CALENDAR_REFID = "C419EBD3-5EFC-449C-8890-28545663350F";
	static String COURSE_REFID = "50F2377E-29BD-45C6-950C-C41B3432FC0A";
	static String ROSTER_REFID = "00BAD4F5-9CF4-4D49-A8CC-666D02180300";
	static String STAFF_REFID = "0C6E7BFA-4E4E-4F82-BCE8-C27729A79F29";
	static String STUDENT_REFID = "3089EF6E-143D-4C58-ABF3-8CED68B7AEEE";
	static String CONTACT_REFID = "0BFFDDCF-B25C-423B-BC65-553DE0B95F4B";

    public static void main(String[] args) throws AuthenticationException {
//		Util.disableSslVerification();
        Authenticator auth = Authenticator.getInstance();
        auth.authenticate(authUrl, clientId, clientSecret);

        for (Endpoint e : auth.getEndpoints(providerId)) {
            XPress xPress = new XPress(e.getHref());

//            XPress_StatusCodes(xPress);

            /* xLeas */
			XLeas_GetXLeas(xPress);
//			XLeas_GetXLea(xPress);
//			XLeas_GetXLeaById(xPress);
//			XLeas_GetXLeasByXSchool(xPress);
//			XLeas_GetXLeasByXRoster(xPress);
//			XLeas_GetXLeasByXStaff(xPress);
//			XLeas_GetXLeasByXStudent(xPress);
//			XLeas_GetXLeasByXContact(xPress);
            /* xSchools */
//			XSchools_GetXSchools(xPress);
//			XSchools_GetXSchool(xPress);
//			XSchools_GetXSchoolById(xPress);
//			XSchools_GetXSchoolsByXLea(xPress);
//			XSchools_GetXSchoolsByXCalendar(xPress);
//			XSchools_GetXSchoolsByXCourse(xPress);
//			XSchools_GetXSchoolsByXRoster(xPress);
//			XSchools_GetXSchoolsByXStaff(xPress);
//			XSchools_GetXSchoolsByXStudent(xPress);
//			XSchools_GetXSchoolsByXContact(xPress);
            /* xCalendars */
//			XCalendars_GetXCalendars(xPress);
//			XCalendars_GetXCalendar(xPress);
//			XCalendars_GetXCalendarsByXLea(xPress);
//			XCalendars_GetXCalendarsByXSchool(xPress);
            /* xCourses */
//			XCourses_GetXCourses(xPress);
//			XCourses_GetXCourse(xPress);
//			XCourses_GetXCoursesByXLea(xPress);
//			XCourses_GetXCoursesByXSchool(xPress);
//			XCourses_GetXCoursesByXRoster(xPress);
            /* xRosters */
//			XRosters_GetXRosters(xPress);
//			XRosters_GetXRoster(xPress);
//			XRosters_GetXRostersByXLea(xPress);
//			XRosters_GetXRostersByXSchool(xPress);
//			XRosters_GetXRostersByXCourse(xPress);
//			XRosters_GetXRostersByXStaff(xPress);
//			XRosters_GetXRostersByXStudent(xPress);
            /* xStaffs */
//			XStaffs_GetXStaffs(xPress);
//			XStaffs_GetXStaff(xPress);
//			XStaffs_GetXStaffsByXLea(xPress);
//			XStaffs_GetXStaffsByXSchool(xPress);
//			XStaffs_GetXStaffsByXCourse(xPress);
//			XStaffs_GetXStaffsByXRoster(xPress);
//			XStaffs_GetXStaffsByXStudent(xPress);
            /* xStudents */
//			XStudents_GetXStudents(xPress);
//			XStudents_GetXStudent(xPress);
//			XStudents_GetXStudentsByXLea(xPress);
//			XStudents_GetXStudentsByXSchool(xPress);
//			XStudents_GetXStudentsByXRoster(xPress);
//			XStudents_GetXStudentsByXStaff(xPress);
//			XStudents_GetXStudentsByXContact(xPress);
            /* xContacts */
//			XContacts_GetXSContacts(xPress);
//			XContacts_GetXSContact(xPress);
//			XContacts_GetXContactsByXLea(xPress);
//			XContacts_GetXContactsByXSchool(xPress);
//			XContacts_GetXContactsByXStudent(xPress);
        }

    }

    public static void XPress_StatusCodes(XPress xPress) throws AuthenticationException {
        String format = "%-50s%s%n";
        /* xLeas */
        System.out.println("-----xLeas-----");
        System.out.format(format, "getXLeas()", xPress.getXLeas().getStatusCode());
        System.out.format(format, "getXLea(LEA_REFID)", xPress.getXLea(LEA_REFID).getStatusCode());
        System.out.format(format, "getXLea(LEA_BEDSIDTYPE, LEA_BEDSID)", xPress.getXLea(LEA_BEDSIDTYPE, LEA_BEDSID).getStatusCode());
        System.out.format(format, "getXLea(LEA_LOCALIDTYPE, LEA_LOCALID)", xPress.getXLea(LEA_LOCALIDTYPE, LEA_LOCALID).getStatusCode());
        System.out.format(format, "getXLeasByXSchool(SCHOOL_REFID)", xPress.getXLeasByXSchool(SCHOOL_REFID).getStatusCode());
        System.out.format(format, "getXLeasByXRoster(ROSTER_REFID", xPress.getXLeasByXRoster(ROSTER_REFID).getStatusCode());
        System.out.format(format, "getXLeasByXStaff(STAFF_REFID)", xPress.getXLeasByXStaff(STAFF_REFID).getStatusCode());
        System.out.format(format, "getXLeasByXStudent(STUDENT_REFID)", xPress.getXLeasByXStudent(STUDENT_REFID).getStatusCode());
        System.out.format(format, "getXLeasByXContact(CONTACT_REFID)", xPress.getXLeasByXContact(CONTACT_REFID).getStatusCode());

        /* xSchools */
        System.out.println("-----xSchools-----");
        System.out.format(format, "getXSchools()", xPress.getXSchools().getStatusCode());
        System.out.format(format, "getXSchool(SCHOOL_REFID)", xPress.getXSchool(SCHOOL_REFID).getStatusCode());
        System.out.format(format, "getXSchool(SCHOOL_BEDSIDTYPE, SCHOOL_BEDSID)", xPress.getXSchool(SCHOOL_BEDSIDTYPE, SCHOOL_BEDSID).getStatusCode());
        System.out.format(format, "getXSchool(SCHOOL_LOCALIDTYPE, SCHOOL_LOCALID)", xPress.getXSchool(SCHOOL_LOCALIDTYPE, SCHOOL_LOCALID).getStatusCode());
        System.out.format(format, "getXSchoolsByXLea(LEA_REFID)", xPress.getXSchoolsByXLea(LEA_REFID).getStatusCode());
        System.out.format(format, "getXSchoolsByXCalendar(CALENDAR_REFID)", xPress.getXSchoolsByXCalendar(CALENDAR_REFID).getStatusCode());
        System.out.format(format, "getXSchoolsByXCourse(COURSE_REFID)", xPress.getXSchoolsByXCourse(COURSE_REFID).getStatusCode());
        System.out.format(format, "getXSchoolsByXRoster(ROSTER_REFID)", xPress.getXSchoolsByXRoster(ROSTER_REFID).getStatusCode());
        System.out.format(format, "getXSchoolsByXStaff(STAFF_REFID)", xPress.getXSchoolsByXStaff(STAFF_REFID).getStatusCode());
        System.out.format(format, "getXSchoolsByXStudent(STUDENT_REFID)", xPress.getXSchoolsByXStudent(STUDENT_REFID).getStatusCode());
        System.out.format(format, "getXSchoolsByXContact(CONTACT_REFID)", xPress.getXSchoolsByXContact(CONTACT_REFID).getStatusCode());

        /* xCalendars */
        System.out.println("-----xCalendars-----");
        System.out.format(format, "getXCalendars()", xPress.getXCalendars().getStatusCode());
        System.out.format(format, "getXCalendar(CALENDAR_REFID)", xPress.getXCalendar(CALENDAR_REFID).getStatusCode());
        System.out.format(format, "getXCalendarsByXLea(LEA_REFID)", xPress.getXCalendarsByXLea(LEA_REFID).getStatusCode());
        System.out.format(format, "getXCalendarsByXSchool(SCHOOL_REFID)", xPress.getXCalendarsByXSchool(SCHOOL_REFID).getStatusCode());

        /* xCourses */
        System.out.println("-----xCourses-----");
        System.out.format(format, "getXCourses()", xPress.getXCourses().getStatusCode());
        System.out.format(format, "getXCourse(COURSE_REFID)", xPress.getXCourse(COURSE_REFID).getStatusCode());
        System.out.format(format, "getXCoursesByXLea(LEA_REFID)", xPress.getXCoursesByXLea(LEA_REFID).getStatusCode());
        System.out.format(format, "getXCoursesByXSchool(SCHOOL_REFID)", xPress.getXCoursesByXSchool(SCHOOL_REFID).getStatusCode());
        System.out.format(format, "getXCoursesByXRoster(ROSTER_REFID)", xPress.getXCoursesByXRoster(ROSTER_REFID).getStatusCode());

        /* xRosters */
        System.out.println("-----xRosters-----");
        System.out.format(format, "getXRosters()", xPress.getXRosters().getStatusCode());
        System.out.format(format, "getXRoster(ROSTER_REFID)", xPress.getXRoster(ROSTER_REFID).getStatusCode());
        System.out.format(format, "getXRostersByXLea(LEA_REFID)", xPress.getXRostersByXLea(LEA_REFID).getStatusCode());
        System.out.format(format, "getXRostersByXSchool(SCHOOL_REFID)", xPress.getXRostersByXSchool(SCHOOL_REFID).getStatusCode());
        System.out.format(format, "getXRostersByXCourse(COURSE_REFID)", xPress.getXRostersByXCourse(COURSE_REFID).getStatusCode());
        System.out.format(format, "getXRostersByXStaff(STAFF_REFID)", xPress.getXRostersByXStaff(STAFF_REFID).getStatusCode());
        System.out.format(format, "getXRostersByXStudent(STUDENT_REFID)", xPress.getXRostersByXStudent(STUDENT_REFID).getStatusCode());

        /* xStaffs */
        System.out.println("-----xStaffs-----");
        System.out.format(format, "getXStaffs()", xPress.getXStaffs().getStatusCode());
        System.out.format(format, "getXStaff(STAFF_REFID)", xPress.getXStaff(STAFF_REFID).getStatusCode());
        System.out.format(format, "getXStaffsByXLea(LEA_REFID)", xPress.getXStaffsByXLea(LEA_REFID).getStatusCode());
        System.out.format(format, "getXStaffsByXSchool(SCHOOL_REFID)", xPress.getXStaffsByXSchool(SCHOOL_REFID).getStatusCode());
        System.out.format(format, "getXStaffsByXCourse(COURSE_REFID)", xPress.getXStaffsByXCourse(COURSE_REFID).getStatusCode());
        System.out.format(format, "getXStaffsByXRoster(ROSTER_REFID)", xPress.getXStaffsByXRoster(ROSTER_REFID).getStatusCode());
        System.out.format(format, "getXStaffsByXStudent(STUDENT_REFID)", xPress.getXStaffsByXStudent(STUDENT_REFID).getStatusCode());

        /* xStudents */
        System.out.println("-----xStudents-----");
        System.out.format(format, "getXStudents()", xPress.getXStudents().getStatusCode());
        System.out.format(format, "getXStudent(STUDENT_REFID)", xPress.getXStudent(STUDENT_REFID).getStatusCode());
        System.out.format(format, "getXStudentsByXLea(LEA_REFID)", xPress.getXStudentsByXLea(LEA_REFID).getStatusCode());
        System.out.format(format, "getXStudentsByXSchool(SCHOOL_REFID)", xPress.getXStudentsByXSchool(SCHOOL_REFID).getStatusCode());
        System.out.format(format, "getXStudentsByXRoster(ROSTER_REFID)", xPress.getXStudentsByXRoster(ROSTER_REFID).getStatusCode());
        System.out.format(format, "getXStudentsByXStaff(STAFF_REFID)", xPress.getXStudentsByXStaff(STAFF_REFID).getStatusCode());

        /* xContacts */
        System.out.println("-----xContacts-----");
        System.out.format(format, "getXContacts().getData()", xPress.getXContacts().getStatusCode());
        System.out.format(format, "getXContact(CONTACT_REFID)", xPress.getXContact(CONTACT_REFID).getStatusCode());
        System.out.format(format, "getXContactsByXLea(LEA_REFID)", xPress.getXContactsByXLea(LEA_REFID).getStatusCode());
        System.out.format(format, "getXContactsByXSchool(SCHOOL_REFID)", xPress.getXContactsByXSchool(SCHOOL_REFID).getStatusCode());
        System.out.format(format, "getXContactsByXStudent(STUDENT_REFID)", xPress.getXContactsByXStudent(STUDENT_REFID).getStatusCode());
    }

    // #################### xLeas ####################
    //RETURN ALL LEAS
    public static void XLeas_GetXLeas(XPress xPress) throws AuthenticationException {
        if (xPress.getXLeas().getData() != null) {
            for (XLeaType lea : xPress.getXLeas().getData()) {
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
                for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XLeas_GetXLea(XPress xPress) throws AuthenticationException {
        if (xPress.getXLea(LEA_REFID).getData() != null) {
            XLeaType lea = xPress.getXLea(LEA_REFID).getData();
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
            for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber()) {
                System.out.println("number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }
    }

    // RETURN LEAS BY LOCAL OR BEDS CODE
    public static void XLeas_GetXLeaById(XPress xPress) throws AuthenticationException {
        if (xPress.getXLea(LEA_BEDSIDTYPE, LEA_BEDSID).getData() != null) {
            XLeaType lea = xPress.getXLea(LEA_BEDSIDTYPE, LEA_BEDSID).getData();
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
            for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber()) {
                System.out.println("number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }

        if (xPress.getXLea(LEA_LOCALIDTYPE, LEA_LOCALID).getData() != null) {
            XLeaType lea = xPress.getXLea(LEA_LOCALIDTYPE, LEA_LOCALID).getData();
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
            for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber()) {
                System.out.println("number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }
    }

    //RETURN LEAS BY SCHOOL
    public static void XLeas_GetXLeasByXSchool(XPress xPress) throws AuthenticationException {
        if (xPress.getXLeasByXSchool(SCHOOL_REFID).getData() != null) {
            for (XLeaType lea : xPress.getXLeasByXSchool(SCHOOL_REFID).getData()) {
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
                for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XLeas_GetXLeasByXRoster(XPress xPress) throws AuthenticationException {
        if (xPress.getXLeasByXRoster(ROSTER_REFID).getData() != null) {
            for (XLeaType lea : xPress.getXLeasByXRoster(ROSTER_REFID).getData()) {
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

                for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XLeas_GetXLeasByXStaff(XPress xPress) throws AuthenticationException {
        if (xPress.getXLeasByXStaff(STAFF_REFID).getData() != null) {
            for (XLeaType lea : xPress.getXLeasByXStaff(STAFF_REFID).getData()) {
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

                for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XLeas_GetXLeasByXStudent(XPress xPress) throws AuthenticationException {
        if (xPress.getXLeasByXStudent(STUDENT_REFID).getData() != null) {
            for (XLeaType lea : xPress.getXLeasByXStudent(STUDENT_REFID).getData()) {
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

                for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XLeas_GetXLeasByXContact(XPress xPress) throws AuthenticationException {
        if (xPress.getXLeasByXContact(CONTACT_REFID).getData() != null) {
            for (XLeaType lea : xPress.getXLeasByXContact(CONTACT_REFID).getData()) {
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

                for (XTelephoneType p : lea.getOtherPhoneNumbers().getPhoneNumber()) {
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

    public static void XSchools_GetXSchools(XPress xPress) throws AuthenticationException {
        if (xPress.getXSchools().getData() != null) {
            for (XSchoolType school : xPress.getXSchools().getData()) {
                System.out.println("refId: " + school.getRefId());
                System.out.println("leaRefId: " + school.getRefId());
                System.out.println("localId: " + school.getLocalId());
                System.out.println("stateProvinceId: " + school.getStateProvinceId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId()) {
                    System.out.println("otherId id" + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("schoolName: " + school.getSchoolName());
                System.out.println("##### BEGIN GRADELEVELS #####");
                for (String gl : school.getGradeLevels().getGradeLevel()) {
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
                for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XSchools_GetXSchool(XPress xPress) throws AuthenticationException {
        if (xPress.getXSchool(SCHOOL_REFID).getData() != null) {
            XSchoolType school = xPress.getXSchool(SCHOOL_REFID).getData();

            System.out.println("refId: " + school.getRefId());
            System.out.println("leaRefId: " + school.getRefId());
            System.out.println("localId: " + school.getLocalId());
            System.out.println("stateProvinceId: " + school.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId()) {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("schoolName: " + school.getSchoolName());
            System.out.println("##### BEGIN GRADELEVELS #####");
            for (String gl : school.getGradeLevels().getGradeLevel()) {
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
            for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber()) {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }
    }

    // RETURN SCHOOL BY ID
    public static void XSchools_GetXSchoolById(XPress xPress) throws AuthenticationException {
        System.out.println(xPress.getXLea(SCHOOL_BEDSIDTYPE, SCHOOL_BEDSID).getStatusCode());
        if (xPress.getXSchool(SCHOOL_BEDSIDTYPE, SCHOOL_BEDSID).getData() != null) {
            XSchoolType school = xPress.getXSchool(SCHOOL_BEDSIDTYPE, SCHOOL_BEDSID).getData();

            System.out.println("refId: " + school.getRefId());
            System.out.println("leaRefId: " + school.getRefId());
            System.out.println("localId: " + school.getLocalId());
            System.out.println("stateProvinceId: " + school.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId()) {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("schoolName: " + school.getSchoolName());
            System.out.println("##### BEGIN GRADELEVELS #####");
            for (String gl : school.getGradeLevels().getGradeLevel()) {
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
            for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber()) {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }

        if (xPress.getXSchool(SCHOOL_LOCALIDTYPE, SCHOOL_LOCALID).getData() != null) {
            XSchoolType school = xPress.getXSchool(SCHOOL_LOCALIDTYPE, SCHOOL_LOCALID).getData();

            System.out.println("refId: " + school.getRefId());
            System.out.println("leaRefId: " + school.getRefId());
            System.out.println("localId: " + school.getLocalId());
            System.out.println("stateProvinceId: " + school.getStateProvinceId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId()) {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("schoolName: " + school.getSchoolName());
            System.out.println("##### BEGIN GRADELEVELS #####");
            for (String gl : school.getGradeLevels().getGradeLevel()) {
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
            for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber()) {
                System.out.println("otherPhoneNumbers number: " + p.getNumber());
                System.out.println("phoneNumberType: " + p.getPhoneNumberType());
                System.out.println("primaryIndicator: " + p.isPrimaryIndicator());
            }
            System.out.println("##### END OTHERPHONENUMBER #####");
            System.out.println("========================================");
        }
    }

    //RETURN SCHOOLS BY LEA
    public static void XSchools_GetXSchoolsByXLea(XPress xPress) throws AuthenticationException {
        if (xPress.getXSchoolsByXLea(LEA_REFID).getData() != null) {
            for (XSchoolType school : xPress.getXSchoolsByXLea(LEA_REFID).getData()) {
                System.out.println("refId: " + school.getRefId());
                System.out.println("leaRefId: " + school.getRefId());
                System.out.println("localId: " + school.getLocalId());
                System.out.println("stateProvinceId: " + school.getStateProvinceId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId()) {
                    System.out.println("otherId id" + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("schoolName: " + school.getSchoolName());
                System.out.println("##### BEGIN GRADELEVELS #####");
                for (String gl : school.getGradeLevels().getGradeLevel()) {
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
                for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XSchools_GetXSchoolsByXCalendar(XPress xPress) throws AuthenticationException {
        if (xPress.getXSchoolsByXCalendar(CALENDAR_REFID).getData() != null) {
            for (XSchoolType school : xPress.getXSchoolsByXCalendar(CALENDAR_REFID).getData()) {
                System.out.println("refId: " + school.getRefId());
                System.out.println("leaRefId: " + school.getRefId());
                System.out.println("localId: " + school.getLocalId());
                System.out.println("stateProvinceId: " + school.getStateProvinceId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId()) {
                    System.out.println("otherId id" + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("schoolName: " + school.getSchoolName());
                System.out.println("##### BEGIN GRADELEVELS #####");
                for (String gl : school.getGradeLevels().getGradeLevel()) {
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
                for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XSchools_GetXSchoolsByXCourse(XPress xPress) throws AuthenticationException {
        System.out.println(xPress.getXSchoolsByXCourse(COURSE_REFID).getStatusCode());
        System.out.println(xPress.getXSchoolsByXCourse(COURSE_REFID).getHeader());
        if (xPress.getXSchoolsByXCourse(COURSE_REFID).getData() != null) {
            for (XSchoolType school : xPress.getXSchoolsByXCourse(COURSE_REFID).getData()) {
                System.out.println("refId: " + school.getRefId());
                System.out.println("leaRefId: " + school.getRefId());
                System.out.println("localId: " + school.getLocalId());
                System.out.println("stateProvinceId: " + school.getStateProvinceId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId()) {
                    System.out.println("otherId id" + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("schoolName: " + school.getSchoolName());
                System.out.println("##### BEGIN GRADELEVELS #####");
                for (String gl : school.getGradeLevels().getGradeLevel()) {
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
                for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XSchools_GetXSchoolsByXRoster(XPress xPress) throws AuthenticationException {
        if (xPress.getXSchoolsByXRoster(ROSTER_REFID).getData() != null) {
            for (XSchoolType school : xPress.getXSchoolsByXRoster(ROSTER_REFID).getData()) {
                System.out.println("refId: " + school.getRefId());
                System.out.println("leaRefId: " + school.getRefId());
                System.out.println("localId: " + school.getLocalId());
                System.out.println("stateProvinceId: " + school.getStateProvinceId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId()) {
                    System.out.println("otherId id" + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("schoolName: " + school.getSchoolName());
                System.out.println("##### BEGIN GRADELEVELS #####");
                for (String gl : school.getGradeLevels().getGradeLevel()) {
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
                for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XSchools_GetXSchoolsByXStaff(XPress xPress) throws AuthenticationException {
        if (xPress.getXSchoolsByXStaff(STAFF_REFID).getData() != null) {
            for (XSchoolType school : xPress.getXSchoolsByXStaff(STAFF_REFID).getData()) {
                System.out.println("refId: " + school.getRefId());
                System.out.println("leaRefId: " + school.getRefId());
                System.out.println("localId: " + school.getLocalId());
                System.out.println("stateProvinceId: " + school.getStateProvinceId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId()) {
                    System.out.println("otherId id" + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("schoolName: " + school.getSchoolName());
                System.out.println("##### BEGIN GRADELEVELS #####");
                for (String gl : school.getGradeLevels().getGradeLevel()) {
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
                for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XSchools_GetXSchoolsByXStudent(XPress xPress) throws AuthenticationException {
        if (xPress.getXSchoolsByXStudent(STUDENT_REFID).getData() != null) {
            for (XSchoolType school : xPress.getXSchoolsByXStudent(STUDENT_REFID).getData()) {
                System.out.println("refId: " + school.getRefId());
                System.out.println("leaRefId: " + school.getRefId());
                System.out.println("localId: " + school.getLocalId());
                System.out.println("stateProvinceId: " + school.getStateProvinceId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId()) {
                    System.out.println("otherId id" + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("schoolName: " + school.getSchoolName());
                System.out.println("##### BEGIN GRADELEVELS #####");
                for (String gl : school.getGradeLevels().getGradeLevel()) {
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
                for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XSchools_GetXSchoolsByXContact(XPress xPress) throws AuthenticationException {
        if (xPress.getXSchoolsByXContact(CONTACT_REFID).getData() != null) {
            for (XSchoolType school : xPress.getXSchoolsByXContact(CONTACT_REFID).getData()) {
                System.out.println("refId: " + school.getRefId());
                System.out.println("leaRefId: " + school.getRefId());
                System.out.println("localId: " + school.getLocalId());
                System.out.println("stateProvinceId: " + school.getStateProvinceId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for (XOtherOrganizationIdType id : school.getOtherIds().getOtherId()) {
                    System.out.println("otherId id" + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("schoolName: " + school.getSchoolName());
                System.out.println("##### BEGIN GRADELEVELS #####");
                for (String gl : school.getGradeLevels().getGradeLevel()) {
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
                for (XTelephoneType p : school.getOtherPhoneNumbers().getPhoneNumber()) {
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
    public static void XCalendars_GetXCalendars(XPress xPress) throws AuthenticationException {
        if (xPress.getXCalendars().getData() != null) {
            for (XCalendarType calendar : xPress.getXCalendars().getData()) {
                System.out.println("refId: " + calendar.getRefId());
                System.out.println("schoolRefId: " + calendar.getSchoolRefId());
                System.out.println("schoolYear: " + calendar.getSchoolYear());
                System.out.println("##### BEGIN SESSIONLIST #####");
                for (XSessionType sl : calendar.getSessions().getSessionList()) {
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
    public static void XCalendars_GetXCalendar(XPress xPress) throws AuthenticationException {
        if (xPress.getXCalendar(CALENDAR_REFID).getData() != null) {
            XCalendarType calendar = xPress.getXCalendar(CALENDAR_REFID).getData();

            System.out.println("refId: " + calendar.getRefId());
            System.out.println("schoolRefId: " + calendar.getSchoolRefId());
            System.out.println("schoolYear: " + calendar.getSchoolYear());
            System.out.println("##### BEGIN SESSIONLIST #####");
            for (XSessionType sl : calendar.getSessions().getSessionList()) {
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
    public static void XCalendars_GetXCalendarsByXLea(XPress xPress) throws AuthenticationException {
        if (xPress.getXCalendarsByXLea(LEA_REFID).getData() != null) {
            for (XCalendarType calendar : xPress.getXCalendarsByXLea(LEA_REFID).getData()) {
                System.out.println("refId: " + calendar.getRefId());
                System.out.println("schoolRefId: " + calendar.getSchoolRefId());
                System.out.println("schoolYear: " + calendar.getSchoolYear());
                System.out.println("##### BEGIN SESSIONLIST #####");
                for (XSessionType sl : calendar.getSessions().getSessionList()) {
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
    public static void XCalendars_GetXCalendarsByXSchool(XPress xPress) throws AuthenticationException {
        if (xPress.getXCalendarsByXSchool(SCHOOL_REFID).getData() != null) {
            for (XCalendarType calendar : xPress.getXCalendarsByXSchool(SCHOOL_REFID).getData()) {
                System.out.println("refId: " + calendar.getRefId());
                System.out.println("schoolRefId: " + calendar.getSchoolRefId());
                System.out.println("schoolYear: " + calendar.getSchoolYear());
                System.out.println("##### BEGIN SESSIONLIST #####");
                for (XSessionType sl : calendar.getSessions().getSessionList()) {
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
    public static void XCourses_GetXCourses(XPress xPress) throws AuthenticationException {
        if (xPress.getXCourses().getData() != null) {
            for (XCourseType course : xPress.getXCourses().getData()) {
                System.out.println("refId: " + course.getRefId());
                System.out.println("schoolRefId: " + course.getSchoolRefId());
                System.out.println("schoolCourseId: " + course.getSchoolCourseId());
                System.out.println("leaCourseId: " + course.getLeaCourseId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for (XOtherCourseIdType id : course.getOtherIds().getOtherId()) {
                    System.out.println("otherId id" + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("courseTitle: " + course.getCourseTitle());
                System.out.println("description: " + course.getDescription());
                System.out.println("subject: " + course.getSubject());
                System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
                for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel()) {
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
    public static void XCourses_GetXCourse(XPress xPress) throws AuthenticationException {
        if (xPress.getXCourse(COURSE_REFID).getData() != null) {
            XCourseType course = xPress.getXCourse(COURSE_REFID).getData();

            System.out.println("refId: " + course.getRefId());
            System.out.println("schoolRefId: " + course.getSchoolRefId());
            System.out.println("schoolCourseId: " + course.getSchoolCourseId());
            System.out.println("leaCourseId: " + course.getLeaCourseId());
            System.out.println("##### BEGIN OTHERIDS #####");
            for (XOtherCourseIdType id : course.getOtherIds().getOtherId()) {
                System.out.println("otherId id" + id.getId());
                System.out.println("type: " + id.getType());
            }
            System.out.println("##### END OTHERIDS #####");
            System.out.println("courseTitle: " + course.getCourseTitle());
            System.out.println("description: " + course.getDescription());
            System.out.println("subject: " + course.getSubject());
            System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
            for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel()) {
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
    public static void XCourses_GetXCoursesByXLea(XPress xPress) throws AuthenticationException {
        if (xPress.getXCoursesByXLea(LEA_REFID).getData() != null) {
            for (XCourseType course : xPress.getXCoursesByXLea(LEA_REFID).getData()) {
                System.out.println("refId: " + course.getRefId());
                System.out.println("schoolRefId: " + course.getSchoolRefId());
                System.out.println("schoolCourseId: " + course.getSchoolCourseId());
                System.out.println("leaCourseId: " + course.getLeaCourseId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for (XOtherCourseIdType id : course.getOtherIds().getOtherId()) {
                    System.out.println("otherId id" + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("courseTitle: " + course.getCourseTitle());
                System.out.println("description: " + course.getDescription());
                System.out.println("subject: " + course.getSubject());
                System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
                for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel()) {
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
    public static void XCourses_GetXCoursesByXSchool(XPress xPress) throws AuthenticationException {
        if (xPress.getXCoursesByXSchool(SCHOOL_REFID).getData() != null) {
            for (XCourseType course : xPress.getXCoursesByXSchool(SCHOOL_REFID).getData()) {
                System.out.println("refId: " + course.getRefId());
                System.out.println("schoolRefId: " + course.getSchoolRefId());
                System.out.println("schoolCourseId: " + course.getSchoolCourseId());
                System.out.println("leaCourseId: " + course.getLeaCourseId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for (XOtherCourseIdType id : course.getOtherIds().getOtherId()) {
                    System.out.println("otherId id" + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("courseTitle: " + course.getCourseTitle());
                System.out.println("description: " + course.getDescription());
                System.out.println("subject: " + course.getSubject());
                System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
                for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel()) {
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
    public static void XCourses_GetXCoursesByXRoster(XPress xPress) throws AuthenticationException {
        if (xPress.getXCoursesByXRoster(ROSTER_REFID).getData() != null) {
            for (XCourseType course : xPress.getXCoursesByXRoster(ROSTER_REFID).getData()) {
                System.out.println("refId: " + course.getRefId());
                System.out.println("schoolRefId: " + course.getSchoolRefId());
                System.out.println("schoolCourseId: " + course.getSchoolCourseId());
                System.out.println("leaCourseId: " + course.getLeaCourseId());
                System.out.println("##### BEGIN OTHERIDS #####");
                for (XOtherCourseIdType id : course.getOtherIds().getOtherId()) {
                    System.out.println("otherId id" + id.getId());
                    System.out.println("type: " + id.getType());
                }
                System.out.println("##### END OTHERIDS #####");
                System.out.println("courseTitle: " + course.getCourseTitle());
                System.out.println("description: " + course.getDescription());
                System.out.println("subject: " + course.getSubject());
                System.out.println("##### BEGIN APPLICABLEEDUCATIONLEVELS #####");
                for (String ael : course.getApplicableEducationLevels().getApplicableEducationLevel()) {
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
    public static void XRosters_GetXRosters(XPress xPress) throws AuthenticationException {
        if (xPress.getXRosters().getData() != null) {
            for (XRosterType r : xPress.getXRosters().getData()) {
                System.out.println("refId: " + r.getRefId());
                System.out.println("courseRefId: " + r.getCourseRefId());
                System.out.println("courseTitle: " + r.getCourseTitle());
                System.out.println("sectionRefId: " + r.getSectionRefId());
                System.out.println("subject: " + r.getSubject());
                System.out.println("schoolRefId: " + r.getSchoolRefId());
                System.out.println("schoolSectionId: " + r.getSchoolSectionId());
                System.out.println("schoolYear: " + r.getSchoolYear());

                System.out.println("##### BEGIN MEETING TIMES #####");
                for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime()) {
                    System.out.println("sessionCode: " + mt.getSessionCode());
                    System.out.println("schoolCalendarRefId: " + mt.getSchoolCalendarRefId());
                    System.out.println("timeTableDay: " + mt.getTimeTableDay());
                    System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                    System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                    System.out.println("roomNumber: " + mt.getRoomNumber());
                    System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                    System.out.println("classEndingTime: " + mt.getClassEndingTime());
                }
                System.out.println("##### END MEETING TIMES #####");

                System.out.println("##### BEGIN STUDENTS #####");
                for (XPersonReferenceType student : r.getStudents().getStudentReference()) {
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
                for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff()) {
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
    public static void XRosters_GetXRoster(XPress xPress) throws AuthenticationException {
        if (xPress.getXRoster(ROSTER_REFID).getData() != null) {
            XRosterType r = xPress.getXRoster(ROSTER_REFID).getData();

            System.out.println("refId: " + r.getRefId());
            System.out.println("courseRefId: " + r.getCourseRefId());
            System.out.println("courseTitle: " + r.getCourseTitle());
            System.out.println("sectionRefId: " + r.getSectionRefId());
            System.out.println("subject: " + r.getSubject());
            System.out.println("schoolRefId: " + r.getSchoolRefId());
            System.out.println("schoolSectionId: " + r.getSchoolSectionId());
            System.out.println("schoolYear: " + r.getSchoolYear());

            System.out.println("##### BEGIN MEETING TIMES #####");
            for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime()) {
                System.out.println("sessionCode: " + mt.getSessionCode());
                System.out.println("schoolCalendarRefId: " + mt.getSchoolCalendarRefId());
                System.out.println("timeTableDay: " + mt.getTimeTableDay());
                System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                System.out.println("roomNumber: " + mt.getRoomNumber());
                System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                System.out.println("classEndingTime: " + mt.getClassEndingTime());
            }
            System.out.println("##### END MEETING TIMES #####");

            System.out.println("##### BEGIN STUDENTS #####");
            for (XPersonReferenceType student : r.getStudents().getStudentReference()) {
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
            for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff()) {
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
    public static void XRosters_GetXRostersByXLea(XPress xPress) throws AuthenticationException {
        if (xPress.getXRostersByXLea(LEA_REFID).getData() != null) {
            for (XRosterType r : xPress.getXRostersByXLea(LEA_REFID).getData()) {
                System.out.println("refId: " + r.getRefId());
                System.out.println("courseRefId: " + r.getCourseRefId());
                System.out.println("courseTitle: " + r.getCourseTitle());
                System.out.println("sectionRefId: " + r.getSectionRefId());
                System.out.println("subject: " + r.getSubject());
                System.out.println("schoolRefId: " + r.getSchoolRefId());
                System.out.println("schoolSectionId: " + r.getSchoolSectionId());
                System.out.println("schoolYear: " + r.getSchoolYear());

                System.out.println("##### BEGIN MEETING TIMES #####");
                for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime()) {
                    System.out.println("sessionCode: " + mt.getSessionCode());
                    System.out.println("schoolCalendarRefId: " + mt.getSchoolCalendarRefId());
                    System.out.println("timeTableDay: " + mt.getTimeTableDay());
                    System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                    System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                    System.out.println("roomNumber: " + mt.getRoomNumber());
                    System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                    System.out.println("classEndingTime: " + mt.getClassEndingTime());
                }
                System.out.println("##### END MEETING TIMES #####");

                System.out.println("##### BEGIN STUDENTS #####");
                for (XPersonReferenceType student : r.getStudents().getStudentReference()) {
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
                for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff()) {
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
    public static void XRosters_GetXRostersByXSchool(XPress xPress) throws AuthenticationException {
        if (xPress.getXRostersByXSchool(SCHOOL_REFID).getData() != null) {
            for (XRosterType r : xPress.getXRostersByXSchool(SCHOOL_REFID).getData()) {
                System.out.println("refId: " + r.getRefId());
                System.out.println("courseRefId: " + r.getCourseRefId());
                System.out.println("courseTitle: " + r.getCourseTitle());
                System.out.println("sectionRefId: " + r.getSectionRefId());
                System.out.println("subject: " + r.getSubject());
                System.out.println("schoolRefId: " + r.getSchoolRefId());
                System.out.println("schoolSectionId: " + r.getSchoolSectionId());
                System.out.println("schoolYear: " + r.getSchoolYear());

                System.out.println("##### BEGIN MEETING TIMES #####");
                for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime()) {
                    System.out.println("sessionCode: " + mt.getSessionCode());
                    System.out.println("schoolCalendarRefId: " + mt.getSchoolCalendarRefId());
                    System.out.println("timeTableDay: " + mt.getTimeTableDay());
                    System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                    System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                    System.out.println("roomNumber: " + mt.getRoomNumber());
                    System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                    System.out.println("classEndingTime: " + mt.getClassEndingTime());
                }
                System.out.println("##### END MEETING TIMES #####");

                System.out.println("##### BEGIN STUDENTS #####");
                for (XPersonReferenceType student : r.getStudents().getStudentReference()) {
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
                for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff()) {
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
    public static void XRosters_GetXRostersByXCourse(XPress xPress) throws AuthenticationException {
        if (xPress.getXRostersByXCourse(COURSE_REFID).getData() != null) {
            for (XRosterType r : xPress.getXRostersByXCourse(COURSE_REFID).getData()) {
                System.out.println("refId: " + r.getRefId());
                System.out.println("courseRefId: " + r.getCourseRefId());
                System.out.println("courseTitle: " + r.getCourseTitle());
                System.out.println("sectionRefId: " + r.getSectionRefId());
                System.out.println("subject: " + r.getSubject());
                System.out.println("schoolRefId: " + r.getSchoolRefId());
                System.out.println("schoolSectionId: " + r.getSchoolSectionId());
                System.out.println("schoolYear: " + r.getSchoolYear());

                System.out.println("##### BEGIN MEETING TIMES #####");
                for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime()) {
                    System.out.println("sessionCode: " + mt.getSessionCode());
                    System.out.println("schoolCalendarRefId: " + mt.getSchoolCalendarRefId());
                    System.out.println("timeTableDay: " + mt.getTimeTableDay());
                    System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                    System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                    System.out.println("roomNumber: " + mt.getRoomNumber());
                    System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                    System.out.println("classEndingTime: " + mt.getClassEndingTime());
                }
                System.out.println("##### END MEETING TIMES #####");

                System.out.println("##### BEGIN STUDENTS #####");
                for (XPersonReferenceType student : r.getStudents().getStudentReference()) {
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
                for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff()) {
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
    public static void XRosters_GetXRostersByXStaff(XPress xPress) throws AuthenticationException {
        if (xPress.getXRostersByXStaff(STAFF_REFID).getData() != null) {
            for (XRosterType r : xPress.getXRostersByXStaff(STAFF_REFID).getData()) {
                System.out.println("refId: " + r.getRefId());
                System.out.println("courseRefId: " + r.getCourseRefId());
                System.out.println("courseTitle: " + r.getCourseTitle());
                System.out.println("sectionRefId: " + r.getSectionRefId());
                System.out.println("subject: " + r.getSubject());
                System.out.println("schoolRefId: " + r.getSchoolRefId());
                System.out.println("schoolSectionId: " + r.getSchoolSectionId());
                System.out.println("schoolYear: " + r.getSchoolYear());

                System.out.println("##### BEGIN MEETING TIMES #####");
                for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime()) {
                    System.out.println("sessionCode: " + mt.getSessionCode());
                    System.out.println("schoolCalendarRefId: " + mt.getSchoolCalendarRefId());
                    System.out.println("timeTableDay: " + mt.getTimeTableDay());
                    System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                    System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                    System.out.println("roomNumber: " + mt.getRoomNumber());
                    System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                    System.out.println("classEndingTime: " + mt.getClassEndingTime());
                }
                System.out.println("##### END MEETING TIMES #####");

                System.out.println("##### BEGIN STUDENTS #####");
                for (XPersonReferenceType student : r.getStudents().getStudentReference()) {
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
                for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff()) {
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
    public static void XRosters_GetXRostersByXStudent(XPress xPress) throws AuthenticationException {
        if (xPress.getXRostersByXStudent(STUDENT_REFID).getData() != null) {
            for (XRosterType r : xPress.getXRostersByXStudent(STUDENT_REFID).getData()) {
                System.out.println("refId: " + r.getRefId());
                System.out.println("courseRefId: " + r.getCourseRefId());
                System.out.println("courseTitle: " + r.getCourseTitle());
                System.out.println("sectionRefId: " + r.getSectionRefId());
                System.out.println("subject: " + r.getSubject());
                System.out.println("schoolRefId: " + r.getSchoolRefId());
                System.out.println("schoolSectionId: " + r.getSchoolSectionId());
                System.out.println("schoolYear: " + r.getSchoolYear());

                System.out.println("##### BEGIN MEETING TIMES #####");
                for (XMeetingTimeType mt : r.getMeetingTimes().getMeetingTime()) {
                    System.out.println("sessionCode: " + mt.getSessionCode());
                    System.out.println("schoolCalendarRefId: " + mt.getSchoolCalendarRefId());
                    System.out.println("timeTableDay: " + mt.getTimeTableDay());
                    System.out.println("bellScheduleDay: " + mt.getClassMeetingDays().getBellScheduleDay());
                    System.out.println("timeTablePeriod: " + mt.getTimeTablePeriod());
                    System.out.println("roomNumber: " + mt.getRoomNumber());
                    System.out.println("classBeginningTime: " + mt.getClassBeginningTime());
                    System.out.println("classEndingTime: " + mt.getClassEndingTime());
                }
                System.out.println("##### END MEETING TIMES #####");

                System.out.println("##### BEGIN STUDENTS #####");
                for (XPersonReferenceType student : r.getStudents().getStudentReference()) {
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
                for (XStaffReferenceType staff : r.getOtherStaffs().getOtherStaff()) {
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
    public static void XStaffs_GetXStaffs(XPress xPress) throws AuthenticationException {
        if (xPress.getXStaffs().getData() != null) {
            for (XStaffType s : xPress.getXStaffs().getData()) {
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
                for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
                for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment()) {
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
    public static void XStaffs_GetXStaff(XPress xPress) throws AuthenticationException {
        if (xPress.getXStaff(STAFF_REFID).getData() != null) {
            XStaffType s = xPress.getXStaff(STAFF_REFID).getData();

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
            for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
            for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment()) {
                System.out.println("leaRefId: " + pa.getLeaRefId());
                System.out.println("schoolRefId: " + pa.getSchoolRefId());
                System.out.println("jobFunction: " + pa.getJobFunction());
            }
            System.out.println("##### END OTHERASSIGNMENT #####");
            System.out.println("========================================");
        }
    }

    //RETURN STAFFS BY LEA
    public static void XStaffs_GetXStaffsByXLea(XPress xPress) throws AuthenticationException {
        if (xPress.getXStaffsByXLea(LEA_REFID).getData() != null) {
            for (XStaffType s : xPress.getXStaffsByXLea(LEA_REFID).getData()) {
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
                for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
                for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment()) {
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
    public static void XStaffs_GetXStaffsByXSchool(XPress xPress) throws AuthenticationException {
        if (xPress.getXStaffsByXSchool(SCHOOL_REFID).getData() != null) {
            for (XStaffType s : xPress.getXStaffsByXSchool(SCHOOL_REFID).getData()) {
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
                for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
                for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment()) {
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
    public static void XStaffs_GetXStaffsByXCourse(XPress xPress) throws AuthenticationException {
        if (xPress.getXStaffsByXCourse(COURSE_REFID).getData() != null) {
            for (XStaffType s : xPress.getXStaffsByXCourse(COURSE_REFID).getData()) {
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
                for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
                for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment()) {
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
    public static void XStaffs_GetXStaffsByXRoster(XPress xPress) throws AuthenticationException {
        if (xPress.getXStaffsByXRoster(ROSTER_REFID).getData() != null) {
            for (XStaffType s : xPress.getXStaffsByXRoster(ROSTER_REFID).getData()) {
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
                for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
                for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment()) {
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
    public static void XStaffs_GetXStaffsByXStudent(XPress xPress) throws AuthenticationException {
        if (xPress.getXStaffsByXStudent(STUDENT_REFID).getData() != null) {
            for (XStaffType s : xPress.getXStaffsByXStudent(STUDENT_REFID).getData()) {
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
                for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
                for (XStaffPersonAssignmentType pa : s.getOtherAssignments().getStaffPersonAssignment()) {
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
    public static void XStudents_GetXStudents(XPress xPress) throws AuthenticationException {
        if (xPress.getXStudents().getData() != null) {
            for (XStudentType s : xPress.getXStudents().getData()) {
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
                for (XPersonNameType n : s.getOtherNames().getName()) {
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
                for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
                for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber()) {
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
                for (XEmailType e : s.getOtherEmails().getEmail()) {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println("##### BEGIN DEMOGRAPHICS #####");
                System.out.println("##### BEGIN RACES #####");
                for (XRaceType r : s.getDemographics().getRaces().getRace()) {
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
                if(s.getEnrollment().getEntryType() != null) {
                    System.out.println("##### BEGIN ENTRYTYPE #####");
                    System.out.println("entryCode: " + s.getEnrollment().getEntryType().getCode());
                    for (XOtherCodeType otherCodeType : s.getEnrollment().getEntryType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                        System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                    }
                    System.out.println("##### END ENTRYTYPE #####");
                }
                System.out.println("exitDate: " + s.getEnrollment().getExitDate());
                if(s.getEnrollment().getExitType() != null) {
                    System.out.println("##### BEGIN EXITTYPE #####");
                    System.out.println("exitCode: " + s.getEnrollment().getExitType().getCode());
                    for(XOtherCodeType otherCodeType : s.getEnrollment().getExitType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                        System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                    }
                    System.out.println("##### END EXITTYPE #####");
                }
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
                for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment()) {
                    System.out.println("leaRefId: " + e.getLeaRefId());
                    System.out.println("schoolRefId: " + e.getSchoolRefId());
                    System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                    System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                    System.out.println("membershipType: " + e.getMembershipType());
                    System.out.println("entryDate: " + e.getEntryDate());
                    if(e.getEntryType() != null) {
                        System.out.println("##### BEGIN ENTRYTYPE #####");
                        System.out.println("entryCode: " + e.getEntryType().getCode());
                        for (XOtherCodeType oct : e.getEntryType().getOtherCode()) {
                            System.out.println("otherCodesetName: " + oct.getCodesetName());
                            System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                        }
                        System.out.println("##### END ENTRYTYPE #####");
                    }
                    System.out.println("exitDate: " + e.getExitDate());
                    if(e.getExitType() != null) {
                        System.out.println("##### BEGIN EXITTYPE #####");
                        System.out.println("exitCode: " + e.getExitType().getCode());
                        for(XOtherCodeType oct : e.getExitType().getOtherCode()) {
                            System.out.println("otherCodesetName: " + oct.getCodesetName());
                            System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                        }
                        System.out.println("##### END EXITTYPE #####");
                    }
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
                for (String contactRefid : s.getStudentContacts().getContactPersonRefId()) {
                    System.out.println("contactPersonRefId: " + contactRefid);
                }
                for (XContactType c : s.getStudentContacts().getXContact()) {
                    System.out.println("##### BEGIN NAME #####");
                    System.out.println("type: " + c.getName().getType());
                    System.out.println("prefix: " + c.getName().getPrefix());
                    System.out.println("familyName: " + c.getName().getFamilyName());
                    System.out.println("givenName: " + c.getName().getGivenName());
                    System.out.println("middleName: " + c.getName().getMiddleName());
                    System.out.println("suffix: " + c.getName().getSuffix());
                    System.out.println("##### END NAME #####");
                    System.out.println("##### BEGIN OTHERNAME #####");
                    for (XPersonNameType n : c.getOtherNames().getName()) {
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
                    for (XOtherPersonIdType id : c.getOtherIds().getOtherId()) {
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
                    for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber()) {
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
                    for (XEmailType e : c.getOtherEmails().getEmail()) {
                        System.out.println("emailType: " + e.getEmailType());
                        System.out.println("emailAddress: " + e.getEmailAddress());
                    }
                    System.out.println("##### END OTHEREMAILS #####");
                    System.out.println(": " + c.getSex());
                    System.out.println(": " + c.getEmployerType());
                    System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                    for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship()) {
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
                for (XLanguageType l : s.getLanguages().getLanguage()) {
                    System.out.println("type: " + l.getType());
                    System.out.println("code: " + l.getCode());
                }
                System.out.println("##### END LANGUAGES #####");
                System.out.println("========================================");
            }
        }
    }

    //RETURN SINGLE STUDENT
    public static void XStudents_GetXStudent(XPress xPress) throws AuthenticationException {
        if (xPress.getXStudent(STUDENT_REFID).getData() != null) {
            XStudentType s = xPress.getXStudent(STUDENT_REFID).getData();

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
            for (XPersonNameType n : s.getOtherNames().getName()) {
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
            for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
            for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber()) {
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
            for (XEmailType e : s.getOtherEmails().getEmail()) {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println("##### BEGIN DEMOGRAPHICS #####");
            System.out.println("##### BEGIN RACES #####");
            for (XRaceType r : s.getDemographics().getRaces().getRace()) {
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
            if(s.getEnrollment().getEntryType() != null) {
                System.out.println("##### BEGIN ENTRYTYPE #####");
                System.out.println("entryCode: " + s.getEnrollment().getEntryType().getCode());
                for (XOtherCodeType otherCodeType : s.getEnrollment().getEntryType().getOtherCode()) {
                    System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                    System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                }
                System.out.println("##### END ENTRYTYPE #####");
            }
            System.out.println("exitDate: " + s.getEnrollment().getExitDate());
            if(s.getEnrollment().getExitType() != null) {
                System.out.println("##### BEGIN EXITTYPE #####");
                System.out.println("exitCode: " + s.getEnrollment().getExitType().getCode());
                for(XOtherCodeType otherCodeType : s.getEnrollment().getExitType().getOtherCode()) {
                    System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                    System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                }
                System.out.println("##### END EXITTYPE #####");
            }
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
            for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment()) {
                System.out.println("leaRefId: " + e.getLeaRefId());
                System.out.println("schoolRefId: " + e.getSchoolRefId());
                System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                System.out.println("membershipType: " + e.getMembershipType());
                System.out.println("entryDate: " + e.getEntryDate());
                if(e.getEntryType() != null) {
                    System.out.println("##### BEGIN ENTRYTYPE #####");
                    System.out.println("entryCode: " + e.getEntryType().getCode());
                    for (XOtherCodeType oct : e.getEntryType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + oct.getCodesetName());
                        System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                    }
                    System.out.println("##### END ENTRYTYPE #####");
                }
                System.out.println("exitDate: " + e.getExitDate());
                if(e.getExitType() != null) {
                    System.out.println("##### BEGIN EXITTYPE #####");
                    System.out.println("exitCode: " + e.getExitType().getCode());
                    for(XOtherCodeType oct : e.getExitType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + oct.getCodesetName());
                        System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                    }
                    System.out.println("##### END EXITTYPE #####");
                }
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
            for (String contactRefid : s.getStudentContacts().getContactPersonRefId()) {
                System.out.println("contactPersonRefId: " + contactRefid);
            }
            for (XContactType c : s.getStudentContacts().getXContact()) {
                System.out.println("##### BEGIN NAME #####");
                System.out.println("type: " + c.getName().getType());
                System.out.println("prefix: " + c.getName().getPrefix());
                System.out.println("familyName: " + c.getName().getFamilyName());
                System.out.println("givenName: " + c.getName().getGivenName());
                System.out.println("middleName: " + c.getName().getMiddleName());
                System.out.println("suffix: " + c.getName().getSuffix());
                System.out.println("##### END NAME #####");
                System.out.println("##### BEGIN OTHERNAME #####");
                for (XPersonNameType n : c.getOtherNames().getName()) {
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
                for (XOtherPersonIdType id : c.getOtherIds().getOtherId()) {
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
                for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber()) {
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
                for (XEmailType e : c.getOtherEmails().getEmail()) {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println(": " + c.getSex());
                System.out.println(": " + c.getEmployerType());
                System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship()) {
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
            for (XLanguageType l : s.getLanguages().getLanguage()) {
                System.out.println("type: " + l.getType());
                System.out.println("code: " + l.getCode());
            }
            System.out.println("##### END LANGUAGES #####");
            System.out.println("========================================");
        }
    }

    //RETURN STUDENTS BY LEA
    public static void XStudents_GetXStudentsByXLea(XPress xPress) throws AuthenticationException {
        if (xPress.getXStudentsByXLea(LEA_REFID).getData() != null) {
            for (XStudentType s : xPress.getXStudentsByXLea(LEA_REFID).getData()) {
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
                for (XPersonNameType n : s.getOtherNames().getName()) {
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
                for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
                for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber()) {
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
                for (XEmailType e : s.getOtherEmails().getEmail()) {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println("##### BEGIN DEMOGRAPHICS #####");
                System.out.println("##### BEGIN RACES #####");
                for (XRaceType r : s.getDemographics().getRaces().getRace()) {
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
                if(s.getEnrollment().getEntryType() != null) {
                    System.out.println("##### BEGIN ENTRYTYPE #####");
                    System.out.println("entryCode: " + s.getEnrollment().getEntryType().getCode());
                    for (XOtherCodeType otherCodeType : s.getEnrollment().getEntryType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                        System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                    }
                    System.out.println("##### END ENTRYTYPE #####");
                }
                System.out.println("exitDate: " + s.getEnrollment().getExitDate());
                if(s.getEnrollment().getExitType() != null) {
                    System.out.println("##### BEGIN EXITTYPE #####");
                    System.out.println("exitCode: " + s.getEnrollment().getExitType().getCode());
                    for(XOtherCodeType otherCodeType : s.getEnrollment().getExitType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                        System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                    }
                    System.out.println("##### END EXITTYPE #####");
                }
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
                for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment()) {
                    System.out.println("leaRefId: " + e.getLeaRefId());
                    System.out.println("schoolRefId: " + e.getSchoolRefId());
                    System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                    System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                    System.out.println("membershipType: " + e.getMembershipType());
                    System.out.println("entryDate: " + e.getEntryDate());
                    if(e.getEntryType() != null) {
                        System.out.println("##### BEGIN ENTRYTYPE #####");
                        System.out.println("entryCode: " + e.getEntryType().getCode());
                        for (XOtherCodeType oct : e.getEntryType().getOtherCode()) {
                            System.out.println("otherCodesetName: " + oct.getCodesetName());
                            System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                        }
                        System.out.println("##### END ENTRYTYPE #####");
                    }
                    System.out.println("exitDate: " + e.getExitDate());
                    if(e.getExitType() != null) {
                        System.out.println("##### BEGIN EXITTYPE #####");
                        System.out.println("exitCode: " + e.getExitType().getCode());
                        for(XOtherCodeType oct : e.getExitType().getOtherCode()) {
                            System.out.println("otherCodesetName: " + oct.getCodesetName());
                            System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                        }
                        System.out.println("##### END EXITTYPE #####");
                    }
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
                for (String contactRefid : s.getStudentContacts().getContactPersonRefId()) {
                    System.out.println("contactPersonRefId: " + contactRefid);
                }
                for (XContactType c : s.getStudentContacts().getXContact()) {
                    System.out.println("##### BEGIN NAME #####");
                    System.out.println("type: " + c.getName().getType());
                    System.out.println("prefix: " + c.getName().getPrefix());
                    System.out.println("familyName: " + c.getName().getFamilyName());
                    System.out.println("givenName: " + c.getName().getGivenName());
                    System.out.println("middleName: " + c.getName().getMiddleName());
                    System.out.println("suffix: " + c.getName().getSuffix());
                    System.out.println("##### END NAME #####");
                    System.out.println("##### BEGIN OTHERNAME #####");
                    for (XPersonNameType n : c.getOtherNames().getName()) {
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
                    for (XOtherPersonIdType id : c.getOtherIds().getOtherId()) {
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
                    for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber()) {
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
                    for (XEmailType e : c.getOtherEmails().getEmail()) {
                        System.out.println("emailType: " + e.getEmailType());
                        System.out.println("emailAddress: " + e.getEmailAddress());
                    }
                    System.out.println("##### END OTHEREMAILS #####");
                    System.out.println(": " + c.getSex());
                    System.out.println(": " + c.getEmployerType());
                    System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                    for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship()) {
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
                for (XLanguageType l : s.getLanguages().getLanguage()) {
                    System.out.println("type: " + l.getType());
                    System.out.println("code: " + l.getCode());
                }
                System.out.println("##### END LANGUAGES #####");
                System.out.println("========================================");
            }
        }
    }

    //RETURN STUDENTS BY SCHOOL
    public static void XStudents_GetXStudentsByXSchool(XPress xPress) throws AuthenticationException {
        if (xPress.getXStudentsByXSchool(SCHOOL_REFID).getData() != null) {
            for (XStudentType s : xPress.getXStudentsByXSchool(SCHOOL_REFID).getData()) {
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
                for (XPersonNameType n : s.getOtherNames().getName()) {
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
                for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
                for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber()) {
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
                for (XEmailType e : s.getOtherEmails().getEmail()) {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println("##### BEGIN DEMOGRAPHICS #####");
                System.out.println("##### BEGIN RACES #####");
                for (XRaceType r : s.getDemographics().getRaces().getRace()) {
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
                if(s.getEnrollment().getEntryType() != null) {
                    System.out.println("##### BEGIN ENTRYTYPE #####");
                    System.out.println("entryCode: " + s.getEnrollment().getEntryType().getCode());
                    for (XOtherCodeType otherCodeType : s.getEnrollment().getEntryType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                        System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                    }
                    System.out.println("##### END ENTRYTYPE #####");
                }
                System.out.println("exitDate: " + s.getEnrollment().getExitDate());
                if(s.getEnrollment().getExitType() != null) {
                    System.out.println("##### BEGIN EXITTYPE #####");
                    System.out.println("exitCode: " + s.getEnrollment().getExitType().getCode());
                    for(XOtherCodeType otherCodeType : s.getEnrollment().getExitType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                        System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                    }
                    System.out.println("##### END EXITTYPE #####");
                }
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
                for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment()) {
                    System.out.println("leaRefId: " + e.getLeaRefId());
                    System.out.println("schoolRefId: " + e.getSchoolRefId());
                    System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                    System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                    System.out.println("membershipType: " + e.getMembershipType());
                    System.out.println("entryDate: " + e.getEntryDate());
                    if(e.getEntryType() != null) {
                        System.out.println("##### BEGIN ENTRYTYPE #####");
                        System.out.println("entryCode: " + e.getEntryType().getCode());
                        for (XOtherCodeType oct : e.getEntryType().getOtherCode()) {
                            System.out.println("otherCodesetName: " + oct.getCodesetName());
                            System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                        }
                        System.out.println("##### END ENTRYTYPE #####");
                    }
                    System.out.println("exitDate: " + e.getExitDate());
                    if(e.getExitType() != null) {
                        System.out.println("##### BEGIN EXITTYPE #####");
                        System.out.println("exitCode: " + e.getExitType().getCode());
                        for(XOtherCodeType oct : e.getExitType().getOtherCode()) {
                            System.out.println("otherCodesetName: " + oct.getCodesetName());
                            System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                        }
                        System.out.println("##### END EXITTYPE #####");
                    }
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
                for (String contactRefid : s.getStudentContacts().getContactPersonRefId()) {
                    System.out.println("contactPersonRefId: " + contactRefid);
                }
                for (XContactType c : s.getStudentContacts().getXContact()) {
                    System.out.println("##### BEGIN NAME #####");
                    System.out.println("type: " + c.getName().getType());
                    System.out.println("prefix: " + c.getName().getPrefix());
                    System.out.println("familyName: " + c.getName().getFamilyName());
                    System.out.println("givenName: " + c.getName().getGivenName());
                    System.out.println("middleName: " + c.getName().getMiddleName());
                    System.out.println("suffix: " + c.getName().getSuffix());
                    System.out.println("##### END NAME #####");
                    System.out.println("##### BEGIN OTHERNAME #####");
                    for (XPersonNameType n : c.getOtherNames().getName()) {
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
                    for (XOtherPersonIdType id : c.getOtherIds().getOtherId()) {
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
                    for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber()) {
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
                    for (XEmailType e : c.getOtherEmails().getEmail()) {
                        System.out.println("emailType: " + e.getEmailType());
                        System.out.println("emailAddress: " + e.getEmailAddress());
                    }
                    System.out.println("##### END OTHEREMAILS #####");
                    System.out.println(": " + c.getSex());
                    System.out.println(": " + c.getEmployerType());
                    System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                    for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship()) {
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
                for (XLanguageType l : s.getLanguages().getLanguage()) {
                    System.out.println("type: " + l.getType());
                    System.out.println("code: " + l.getCode());
                }
                System.out.println("##### END LANGUAGES #####");
                System.out.println("========================================");
            }
        }
    }

    //RETURN STUDENTS BY ROSTER
    public static void XStudents_GetXStudentsByXRoster(XPress xPress) throws AuthenticationException {
        if (xPress.getXStudentsByXRoster(ROSTER_REFID).getData() != null) {
            for (XStudentType s : xPress.getXStudentsByXRoster(ROSTER_REFID).getData()) {
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
                for (XPersonNameType n : s.getOtherNames().getName()) {
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
                for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
                for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber()) {
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
                for (XEmailType e : s.getOtherEmails().getEmail()) {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println("##### BEGIN DEMOGRAPHICS #####");
                System.out.println("##### BEGIN RACES #####");
                for (XRaceType r : s.getDemographics().getRaces().getRace()) {
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
                if(s.getEnrollment().getEntryType() != null) {
                    System.out.println("##### BEGIN ENTRYTYPE #####");
                    System.out.println("entryCode: " + s.getEnrollment().getEntryType().getCode());
                    for (XOtherCodeType otherCodeType : s.getEnrollment().getEntryType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                        System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                    }
                    System.out.println("##### END ENTRYTYPE #####");
                }
                System.out.println("exitDate: " + s.getEnrollment().getExitDate());
                if(s.getEnrollment().getExitType() != null) {
                    System.out.println("##### BEGIN EXITTYPE #####");
                    System.out.println("exitCode: " + s.getEnrollment().getExitType().getCode());
                    for(XOtherCodeType otherCodeType : s.getEnrollment().getExitType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                        System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                    }
                    System.out.println("##### END EXITTYPE #####");
                }
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
                for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment()) {
                    System.out.println("leaRefId: " + e.getLeaRefId());
                    System.out.println("schoolRefId: " + e.getSchoolRefId());
                    System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                    System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                    System.out.println("membershipType: " + e.getMembershipType());
                    System.out.println("entryDate: " + e.getEntryDate());
                    if(e.getEntryType() != null) {
                        System.out.println("##### BEGIN ENTRYTYPE #####");
                        System.out.println("entryCode: " + e.getEntryType().getCode());
                        for (XOtherCodeType oct : e.getEntryType().getOtherCode()) {
                            System.out.println("otherCodesetName: " + oct.getCodesetName());
                            System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                        }
                        System.out.println("##### END ENTRYTYPE #####");
                    }
                    System.out.println("exitDate: " + e.getExitDate());
                    if(e.getExitType() != null) {
                        System.out.println("##### BEGIN EXITTYPE #####");
                        System.out.println("exitCode: " + e.getExitType().getCode());
                        for(XOtherCodeType oct : e.getExitType().getOtherCode()) {
                            System.out.println("otherCodesetName: " + oct.getCodesetName());
                            System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                        }
                        System.out.println("##### END EXITTYPE #####");
                    }
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
                for (String contactRefid : s.getStudentContacts().getContactPersonRefId()) {
                    System.out.println("contactPersonRefId: " + contactRefid);
                }
                for (XContactType c : s.getStudentContacts().getXContact()) {
                    System.out.println("##### BEGIN NAME #####");
                    System.out.println("type: " + c.getName().getType());
                    System.out.println("prefix: " + c.getName().getPrefix());
                    System.out.println("familyName: " + c.getName().getFamilyName());
                    System.out.println("givenName: " + c.getName().getGivenName());
                    System.out.println("middleName: " + c.getName().getMiddleName());
                    System.out.println("suffix: " + c.getName().getSuffix());
                    System.out.println("##### END NAME #####");
                    System.out.println("##### BEGIN OTHERNAME #####");
                    for (XPersonNameType n : c.getOtherNames().getName()) {
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
                    for (XOtherPersonIdType id : c.getOtherIds().getOtherId()) {
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
                    for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber()) {
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
                    for (XEmailType e : c.getOtherEmails().getEmail()) {
                        System.out.println("emailType: " + e.getEmailType());
                        System.out.println("emailAddress: " + e.getEmailAddress());
                    }
                    System.out.println("##### END OTHEREMAILS #####");
                    System.out.println(": " + c.getSex());
                    System.out.println(": " + c.getEmployerType());
                    System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                    for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship()) {
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
                for (XLanguageType l : s.getLanguages().getLanguage()) {
                    System.out.println("type: " + l.getType());
                    System.out.println("code: " + l.getCode());
                }
                System.out.println("##### END LANGUAGES #####");
                System.out.println("========================================");
            }
        }
    }

    //RETURN STUDENTS BY CONTACT
    public static void XStudents_GetXStudentsByXContact(XPress xPress) throws AuthenticationException {
        if (xPress.getXStudentsByXStaff(CONTACT_REFID).getData() != null) {
            for (XStudentType s : xPress.getXStudentsByXStaff(CONTACT_REFID).getData()) {
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
                for (XPersonNameType n : s.getOtherNames().getName()) {
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
                for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
                for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber()) {
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
                for (XEmailType e : s.getOtherEmails().getEmail()) {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println("##### BEGIN DEMOGRAPHICS #####");
                System.out.println("##### BEGIN RACES #####");
                for (XRaceType r : s.getDemographics().getRaces().getRace()) {
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
                if(s.getEnrollment().getEntryType() != null) {
                    System.out.println("##### BEGIN ENTRYTYPE #####");
                    System.out.println("entryCode: " + s.getEnrollment().getEntryType().getCode());
                    for (XOtherCodeType otherCodeType : s.getEnrollment().getEntryType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                        System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                    }
                    System.out.println("##### END ENTRYTYPE #####");
                }
                System.out.println("exitDate: " + s.getEnrollment().getExitDate());
                if(s.getEnrollment().getExitType() != null) {
                    System.out.println("##### BEGIN EXITTYPE #####");
                    System.out.println("exitCode: " + s.getEnrollment().getExitType().getCode());
                    for(XOtherCodeType otherCodeType : s.getEnrollment().getExitType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                        System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                    }
                    System.out.println("##### END EXITTYPE #####");
                }
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
                for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment()) {
                    System.out.println("leaRefId: " + e.getLeaRefId());
                    System.out.println("schoolRefId: " + e.getSchoolRefId());
                    System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                    System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                    System.out.println("membershipType: " + e.getMembershipType());
                    System.out.println("entryDate: " + e.getEntryDate());
                    if(e.getEntryType() != null) {
                        System.out.println("##### BEGIN ENTRYTYPE #####");
                        System.out.println("entryCode: " + e.getEntryType().getCode());
                        for (XOtherCodeType oct : e.getEntryType().getOtherCode()) {
                            System.out.println("otherCodesetName: " + oct.getCodesetName());
                            System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                        }
                        System.out.println("##### END ENTRYTYPE #####");
                    }
                    System.out.println("exitDate: " + e.getExitDate());
                    if(e.getExitType() != null) {
                        System.out.println("##### BEGIN EXITTYPE #####");
                        System.out.println("exitCode: " + e.getExitType().getCode());
                        for(XOtherCodeType oct : e.getExitType().getOtherCode()) {
                            System.out.println("otherCodesetName: " + oct.getCodesetName());
                            System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                        }
                        System.out.println("##### END EXITTYPE #####");
                    }
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
                for (String contactRefid : s.getStudentContacts().getContactPersonRefId()) {
                    System.out.println("contactPersonRefId: " + contactRefid);
                }
                for (XContactType c : s.getStudentContacts().getXContact()) {
                    System.out.println("##### BEGIN NAME #####");
                    System.out.println("type: " + c.getName().getType());
                    System.out.println("prefix: " + c.getName().getPrefix());
                    System.out.println("familyName: " + c.getName().getFamilyName());
                    System.out.println("givenName: " + c.getName().getGivenName());
                    System.out.println("middleName: " + c.getName().getMiddleName());
                    System.out.println("suffix: " + c.getName().getSuffix());
                    System.out.println("##### END NAME #####");
                    System.out.println("##### BEGIN OTHERNAME #####");
                    for (XPersonNameType n : c.getOtherNames().getName()) {
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
                    for (XOtherPersonIdType id : c.getOtherIds().getOtherId()) {
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
                    for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber()) {
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
                    for (XEmailType e : c.getOtherEmails().getEmail()) {
                        System.out.println("emailType: " + e.getEmailType());
                        System.out.println("emailAddress: " + e.getEmailAddress());
                    }
                    System.out.println("##### END OTHEREMAILS #####");
                    System.out.println(": " + c.getSex());
                    System.out.println(": " + c.getEmployerType());
                    System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                    for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship()) {
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
                for (XLanguageType l : s.getLanguages().getLanguage()) {
                    System.out.println("type: " + l.getType());
                    System.out.println("code: " + l.getCode());
                }
                System.out.println("##### END LANGUAGES #####");
                System.out.println("========================================");
            }
        }
    }

    //RETURN STUDENTS BY STAFF
    public static void XStudents_GetXStudentsByXStaff(XPress xPress) throws AuthenticationException {
        if (xPress.getXStudentsByXStaff(STAFF_REFID).getData() != null) {
            for (XStudentType s : xPress.getXStudentsByXStaff(STAFF_REFID).getData()) {
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
                for (XPersonNameType n : s.getOtherNames().getName()) {
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
                for (XOtherPersonIdType id : s.getOtherIds().getOtherId()) {
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
                for (XTelephoneType p : s.getOtherPhoneNumbers().getPhoneNumber()) {
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
                for (XEmailType e : s.getOtherEmails().getEmail()) {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println("##### BEGIN DEMOGRAPHICS #####");
                System.out.println("##### BEGIN RACES #####");
                for (XRaceType r : s.getDemographics().getRaces().getRace()) {
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
                if(s.getEnrollment().getEntryType() != null) {
                    System.out.println("##### BEGIN ENTRYTYPE #####");
                    System.out.println("entryCode: " + s.getEnrollment().getEntryType().getCode());
                    for (XOtherCodeType otherCodeType : s.getEnrollment().getEntryType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                        System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                    }
                    System.out.println("##### END ENTRYTYPE #####");
                }
                System.out.println("exitDate: " + s.getEnrollment().getExitDate());
                if(s.getEnrollment().getExitType() != null) {
                    System.out.println("##### BEGIN EXITTYPE #####");
                    System.out.println("exitCode: " + s.getEnrollment().getExitType().getCode());
                    for(XOtherCodeType otherCodeType : s.getEnrollment().getExitType().getOtherCode()) {
                        System.out.println("otherCodesetName: " + otherCodeType.getCodesetName());
                        System.out.println("otherCodeValue" + otherCodeType.getOtherCodeValue());
                    }
                    System.out.println("##### END EXITTYPE #####");
                }
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
                for (XEnrollmentType e : s.getOtherEnrollments().getEnrollment()) {
                    System.out.println("leaRefId: " + e.getLeaRefId());
                    System.out.println("schoolRefId: " + e.getSchoolRefId());
                    System.out.println("studentSchoolAssociationRefId: " + e.getStudentSchoolAssociationRefId());
                    System.out.println("responsibleSchoolType: " + e.getResponsibleSchoolType());
                    System.out.println("membershipType: " + e.getMembershipType());
                    System.out.println("entryDate: " + e.getEntryDate());
                    if(e.getEntryType() != null) {
                        System.out.println("##### BEGIN ENTRYTYPE #####");
                        System.out.println("entryCode: " + e.getEntryType().getCode());
                        for (XOtherCodeType oct : e.getEntryType().getOtherCode()) {
                            System.out.println("otherCodesetName: " + oct.getCodesetName());
                            System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                        }
                        System.out.println("##### END ENTRYTYPE #####");
                    }
                    System.out.println("exitDate: " + e.getExitDate());
                    if(e.getExitType() != null) {
                        System.out.println("##### BEGIN EXITTYPE #####");
                        System.out.println("exitCode: " + e.getExitType().getCode());
                        for(XOtherCodeType oct : e.getExitType().getOtherCode()) {
                            System.out.println("otherCodesetName: " + oct.getCodesetName());
                            System.out.println("otherCodeValue" + oct.getOtherCodeValue());
                        }
                        System.out.println("##### END EXITTYPE #####");
                    }
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
                for (String contactRefid : s.getStudentContacts().getContactPersonRefId()) {
                    System.out.println("contactPersonRefId: " + contactRefid);
                }
                for (XContactType c : s.getStudentContacts().getXContact()) {
                    System.out.println("##### BEGIN NAME #####");
                    System.out.println("type: " + c.getName().getType());
                    System.out.println("prefix: " + c.getName().getPrefix());
                    System.out.println("familyName: " + c.getName().getFamilyName());
                    System.out.println("givenName: " + c.getName().getGivenName());
                    System.out.println("middleName: " + c.getName().getMiddleName());
                    System.out.println("suffix: " + c.getName().getSuffix());
                    System.out.println("##### END NAME #####");
                    System.out.println("##### BEGIN OTHERNAME #####");
                    for (XPersonNameType n : c.getOtherNames().getName()) {
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
                    for (XOtherPersonIdType id : c.getOtherIds().getOtherId()) {
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
                    for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber()) {
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
                    for (XEmailType e : c.getOtherEmails().getEmail()) {
                        System.out.println("emailType: " + e.getEmailType());
                        System.out.println("emailAddress: " + e.getEmailAddress());
                    }
                    System.out.println("##### END OTHEREMAILS #####");
                    System.out.println(": " + c.getSex());
                    System.out.println(": " + c.getEmployerType());
                    System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                    for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship()) {
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
                for (XLanguageType l : s.getLanguages().getLanguage()) {
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
    public static void XContacts_GetXSContacts(XPress xPress) throws AuthenticationException {
        if (xPress.getXContacts().getData() != null) {
            for (XContactType c : xPress.getXContacts().getData()) {
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
                for (XPersonNameType n : c.getOtherNames().getName()) {
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
                for (XOtherPersonIdType id : c.getOtherIds().getOtherId()) {
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
                for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber()) {
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
                for (XEmailType e : c.getOtherEmails().getEmail()) {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println("sex: " + c.getSex());
                System.out.println("employerType: " + c.getEmployerType());
                System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship()) {
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
    public static void XContacts_GetXSContact(XPress xPress) throws AuthenticationException {
        if (xPress.getXContact(CONTACT_REFID).getData() != null) {
            XContactType c = xPress.getXContact(CONTACT_REFID).getData();

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
            for (XPersonNameType n : c.getOtherNames().getName()) {
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
            for (XOtherPersonIdType id : c.getOtherIds().getOtherId()) {
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
            for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber()) {
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
            for (XEmailType e : c.getOtherEmails().getEmail()) {
                System.out.println("emailType: " + e.getEmailType());
                System.out.println("emailAddress: " + e.getEmailAddress());
            }
            System.out.println("##### END OTHEREMAILS #####");
            System.out.println("sex: " + c.getSex());
            System.out.println("employerType: " + c.getEmployerType());
            System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
            for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship()) {
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
    public static void XContacts_GetXContactsByXLea(XPress xPress) throws AuthenticationException {
        if (xPress.getXContactsByXLea(LEA_REFID).getData() != null) {
            for (XContactType c : xPress.getXContactsByXLea(LEA_REFID).getData()) {
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
                for (XPersonNameType n : c.getOtherNames().getName()) {
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
                for (XOtherPersonIdType id : c.getOtherIds().getOtherId()) {
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
                for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber()) {
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
                for (XEmailType e : c.getOtherEmails().getEmail()) {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println("sex: " + c.getSex());
                System.out.println("employerType: " + c.getEmployerType());
                System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship()) {
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
    public static void XContacts_GetXContactsByXSchool(XPress xPress) throws AuthenticationException {
        if (xPress.getXContactsByXSchool(SCHOOL_REFID).getData() != null) {
            for (XContactType c : xPress.getXContactsByXSchool(SCHOOL_REFID).getData()) {
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
                for (XPersonNameType n : c.getOtherNames().getName()) {
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
                for (XOtherPersonIdType id : c.getOtherIds().getOtherId()) {
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
                for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber()) {
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
                for (XEmailType e : c.getOtherEmails().getEmail()) {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println("sex: " + c.getSex());
                System.out.println("employerType: " + c.getEmployerType());
                System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship()) {
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
    public static void XContacts_GetXContactsByXStudent(XPress xPress) throws AuthenticationException {
        if (xPress.getXContactsByXStudent(STUDENT_REFID).getData() != null) {
            for (XContactType c : xPress.getXContactsByXStudent(STUDENT_REFID).getData()) {
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
                for (XPersonNameType n : c.getOtherNames().getName()) {
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
                for (XOtherPersonIdType id : c.getOtherIds().getOtherId()) {
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
                for (XTelephoneType p : c.getOtherPhoneNumbers().getPhoneNumber()) {
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
                for (XEmailType e : c.getOtherEmails().getEmail()) {
                    System.out.println("emailType: " + e.getEmailType());
                    System.out.println("emailAddress: " + e.getEmailAddress());
                }
                System.out.println("##### END OTHEREMAILS #####");
                System.out.println("sex: " + c.getSex());
                System.out.println("employerType: " + c.getEmployerType());
                System.out.println("##### BEGIN CONTACTRELATIONSHIPS #####");
                for (XContactStudentRelationshipType csr : c.getRelationships().getRelationship()) {
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
