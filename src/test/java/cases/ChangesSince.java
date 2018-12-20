package cases;

import riconeapi.authentication.Authenticator;
import riconeapi.common.XPress;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.authentication.Endpoint;
import riconeapi.models.xpress.*;

import java.util.List;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.5
 * @since       Jan 13, 2017
 */
public class ChangesSince
{
	final static String authUrl = "https://auth.test.ricone.org/login";
	final static String clientId = "dpaDemo";
	final static String clientSecret = "deecd889bff5ed0101a86680752f5f9";
	final static String providerId = "localhost";

    static String LEA_REFID = "03ACF04F-DC12-411A-9A42-E8323516D699";
    static String SCHOOL_REFID = "AE6B3441-5E31-4573-BADB-081669D79C7F";
    static String CALENDAR_REFID = "09C5E439-D7DA-45A1-AB0D-D7524C7B1DD0";
    static String COURSE_REFID = "32B850D8-2B67-47ED-ADC2-8BA02C376F67";
    static String ROSTER_REFID = "00BAD4F5-9CF4-4D49-A8CC-666D02180300";
    static String STAFF_REFID = "0C6E7BFA-4E4E-4F82-BCE8-C27729A79F29";
    static String STUDENT_REFID = "77F372FF-3C8B-450D-86DE-8899318813A7";
    static String CONTACT_REFID = "06F78B09-F30D-43F8-AC68-5399336B0972";

    static String OPAQUE_MARKER = "2018-11-30T10:28:24.626-05:00";
	
	public static void main(String[] args) throws AuthenticationException
	{
		
		Authenticator auth = Authenticator.getInstance();
        auth.authenticate(authUrl, clientId, clientSecret);

        for(Endpoint e : auth.getEndpoints(providerId)) {
            XPress xPress = new XPress(e.getHref());

            /* xLeas */
//            getXLeas(xPress);
//            getXLeasByXSchool(xPress);
//            getXLeasByXRoster(xPress);
//            getXLeasByXStaff(xPress);
//            getXLeasByXStudent(xPress);
//            getXLeasByXContact(xPress);
            /* xSchools */
//            getXSchools(xPress);
//            getXSchoolsByXLea(xPress);
//            getXSchoolsByXCalendar(xPress);
//            getXSchoolsByXCourse(xPress);
//            getXSchoolsByXRoster(xPress);
//            getXSchoolsByXStaff(xPress);
//            getXSchoolsByXStudent(xPress);
//            getXSchoolsByXContact(xPress);
            /* xCalendars */
//            getXCalendars(xPress);
//            getXCalendarsByXLea(xPress);
//            getXCalendarsByXSchool(xPress);
            /* xCourses */
//            getXCourses(xPress);
//            getXCoursesByXLea(xPress);
//            getXCoursesByXSchool(xPress);
//            getXCoursesByXRoster(xPress);
            /* xRosters */
//            getXRosters(xPress);
//            getXRostersByXLea(xPress);
//            getXRostersByXSchool(xPress);
//            getXRostersByXCourse(xPress);
//            getXRostersByXStaff(xPress);
//            getXRostersByXStudent(xPress);
            /* xStaffs */
//            getXStaffs(xPress);
//            getXStaffsByXLea(xPress);
//            getXStaffsByXSchool(xPress);
//            getXStaffsByXCourse(xPress);
//            getXStaffsByXRoster(xPress);
//            getXStaffsByXStudent(xPress);
            /* xStudents */
//            getXStudents(xPress);
//            getXStudentsByXLea(xPress);
//            getXStudentsByXSchool(xPress);
//            getXStudentsByXRoster(xPress);
//            getXStudentsByXStaff(xPress);
//            getXStudentsByXContact(xPress);
            /* xContacts */
//            getXContacts(xPress);
//            getXContactsByXLea(xPress);
//            getXContactsByXSchool(xPress);
//            getXContactsByXStudent(xPress);
        }
	}

	/* xLeas */
    public static void getXLeas(XPress xPress) throws AuthenticationException {
        List<XLeaType> xLeaTypeList = xPress.getXLeas(OPAQUE_MARKER).getData();
        for(XLeaType o : xLeaTypeList){
            System.out.println(o.getRefId() + " | "+ o.getLeaName() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXLeasByXSchool(XPress xPress) throws AuthenticationException {
        List<XLeaType> xLeaTypeList = xPress.getXLeasByXSchool(SCHOOL_REFID, OPAQUE_MARKER).getData();
        for(XLeaType o : xLeaTypeList){
            System.out.println(o.getRefId() + " | "+ o.getLeaName() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXLeasByXRoster(XPress xPress) throws AuthenticationException {
        List<XLeaType> xLeaTypeList = xPress.getXLeasByXRoster(ROSTER_REFID, OPAQUE_MARKER).getData();
        for(XLeaType o : xLeaTypeList){
            System.out.println(o.getRefId() + " | "+ o.getLeaName() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXLeasByXStaff(XPress xPress) throws AuthenticationException {
        List<XLeaType> xLeaTypeList = xPress.getXLeasByXStaff(STAFF_REFID, OPAQUE_MARKER).getData();
        for(XLeaType o : xLeaTypeList){
            System.out.println(o.getRefId() + " | "+ o.getLeaName() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXLeasByXStudent(XPress xPress) throws AuthenticationException {
        List<XLeaType> xLeaTypeList = xPress.getXLeasByXStudent(STUDENT_REFID, OPAQUE_MARKER).getData();
        for(XLeaType o : xLeaTypeList){
            System.out.println(o.getRefId() + " | "+ o.getLeaName() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXLeasByXContact(XPress xPress) throws AuthenticationException {
        List<XLeaType> xLeaTypeList = xPress.getXLeasByXContact(CONTACT_REFID, OPAQUE_MARKER).getData();
        for(XLeaType o : xLeaTypeList){
            System.out.println(o.getRefId() + " | "+ o.getLeaName() + " | " + o.getMetadata().getSchoolYear());
        }
    }

    /* xSchools */
    public static void getXSchools(XPress xPress) throws AuthenticationException {
        List<XSchoolType> xSchoolTypeList = xPress.getXSchools(OPAQUE_MARKER).getData();
        for(XSchoolType o : xSchoolTypeList){
            System.out.println(o.getRefId() + " | " + o.getSchoolName() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXSchoolsByXLea(XPress xPress) throws AuthenticationException {
        List<XSchoolType> xSchoolTypeList = xPress.getXSchoolsByXLea(LEA_REFID, OPAQUE_MARKER).getData();
        for(XSchoolType o : xSchoolTypeList){
            System.out.println(o.getRefId() + " | " + o.getSchoolName() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXSchoolsByXCalendar(XPress xPress) throws AuthenticationException {
        List<XSchoolType> xSchoolTypeList = xPress.getXSchoolsByXCalendar(CALENDAR_REFID, OPAQUE_MARKER).getData();
        for(XSchoolType o : xSchoolTypeList){
            System.out.println(o.getRefId() + " | " + o.getSchoolName() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXSchoolsByXCourse(XPress xPress) throws AuthenticationException {
        List<XSchoolType> xSchoolTypeList = xPress.getXSchoolsByXCourse(COURSE_REFID, OPAQUE_MARKER).getData();
        for(XSchoolType o : xSchoolTypeList){
            System.out.println(o.getRefId() + " | " + o.getSchoolName() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXSchoolsByXRoster(XPress xPress) throws AuthenticationException {
        List<XSchoolType> xSchoolTypeList = xPress.getXSchoolsByXRoster(ROSTER_REFID, OPAQUE_MARKER).getData();
        for(XSchoolType o : xSchoolTypeList){
            System.out.println(o.getRefId() + " | " + o.getSchoolName() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXSchoolsByXStaff(XPress xPress) throws AuthenticationException {
        List<XSchoolType> xSchoolTypeList = xPress.getXSchoolsByXStaff(STAFF_REFID, OPAQUE_MARKER).getData();
        for(XSchoolType o : xSchoolTypeList){
            System.out.println(o.getRefId() + " | " + o.getSchoolName() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXSchoolsByXStudent(XPress xPress) throws AuthenticationException {
        List<XSchoolType> xSchoolTypeList = xPress.getXSchoolsByXStudent(STUDENT_REFID, OPAQUE_MARKER).getData();
        for(XSchoolType o : xSchoolTypeList){
            System.out.println(o.getRefId() + " | " + o.getSchoolName() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXSchoolsByXContact(XPress xPress) throws AuthenticationException {
        List<XSchoolType> xSchoolTypeList = xPress.getXSchoolsByXContact(CONTACT_REFID, OPAQUE_MARKER).getData();
        for(XSchoolType o : xSchoolTypeList){
            System.out.println(o.getRefId() + " | " + o.getSchoolName() + " | " + o.getMetadata().getSchoolYear());
        }
    }

    /* xCalendars */
    public static void getXCalendars(XPress xPress) throws AuthenticationException {
        List<XCalendarType> xCalendarTypeList = xPress.getXCalendars(OPAQUE_MARKER).getData();
        for(XCalendarType o : xCalendarTypeList){
            System.out.println(o.getRefId() + " | " + o.getSchoolRefId()  + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXCalendarsByXLea(XPress xPress) throws AuthenticationException {
        List<XCalendarType> xCalendarTypeList = xPress.getXCalendarsByXLea(LEA_REFID, OPAQUE_MARKER).getData();
        for(XCalendarType o : xCalendarTypeList){
            System.out.println(o.getRefId() + " | " + o.getSchoolRefId()  + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXCalendarsByXSchool(XPress xPress) throws AuthenticationException {
        List<XCalendarType> xCalendarTypeList = xPress.getXCalendarsByXSchool(SCHOOL_REFID, OPAQUE_MARKER).getData();
        for(XCalendarType o : xCalendarTypeList){
            System.out.println(o.getRefId() + " | " + o.getSchoolRefId()  + " | " + o.getMetadata().getSchoolYear());
        }
    }

    /* xCourses */
    public static void getXCourses(XPress xPress) throws AuthenticationException {
        List<XCourseType> xCourseTypeList = xPress.getXCourses(OPAQUE_MARKER).getData();
        for(XCourseType o : xCourseTypeList){
            System.out.println(o.getRefId() + " | " + o.getCourseTitle() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXCoursesByXLea(XPress xPress) throws AuthenticationException {
        List<XCourseType> xCourseTypeList = xPress.getXCoursesByXLea(LEA_REFID, OPAQUE_MARKER).getData();
        for(XCourseType o : xCourseTypeList){
            System.out.println(o.getRefId() + " | " + o.getCourseTitle() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXCoursesByXSchool(XPress xPress) throws AuthenticationException {
        List<XCourseType> xCourseTypeList = xPress.getXCoursesByXSchool(SCHOOL_REFID, OPAQUE_MARKER).getData();
        for(XCourseType o : xCourseTypeList){
            System.out.println(o.getRefId() + " | " + o.getCourseTitle() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXCoursesByXRoster(XPress xPress) throws AuthenticationException {
        List<XCourseType> xCourseTypeList = xPress.getXCoursesByXRoster(ROSTER_REFID, OPAQUE_MARKER).getData();
        for(XCourseType o : xCourseTypeList){
            System.out.println(o.getRefId() + " | " + o.getCourseTitle() + " | " + o.getMetadata().getSchoolYear());
        }
    }

    /* xRosters */
    public static void getXRosters(XPress xPress) throws AuthenticationException {
        List<XRosterType> xRosterTypeList = xPress.getXRosters(OPAQUE_MARKER).getData();
        for(XRosterType o : xRosterTypeList){
            System.out.println(o.getRefId() + " | " + o.getCourseTitle() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXRostersByXLea(XPress xPress) throws AuthenticationException {
        List<XRosterType> xRosterTypeList = xPress.getXRostersByXLea(LEA_REFID, OPAQUE_MARKER).getData();
        for(XRosterType o : xRosterTypeList){
            System.out.println(o.getRefId() + " | " + o.getCourseTitle() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXRostersByXSchool(XPress xPress) throws AuthenticationException {
        List<XRosterType> xRosterTypeList = xPress.getXRostersByXSchool(SCHOOL_REFID, OPAQUE_MARKER).getData();
        for(XRosterType o : xRosterTypeList){
            System.out.println(o.getRefId() + " | " + o.getCourseTitle() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXRostersByXCourse(XPress xPress) throws AuthenticationException {
        List<XRosterType> xRosterTypeList = xPress.getXRostersByXCourse(COURSE_REFID, OPAQUE_MARKER).getData();
        for(XRosterType o : xRosterTypeList){
            System.out.println(o.getRefId() + " | " + o.getCourseTitle() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXRostersByXStaff(XPress xPress) throws AuthenticationException {
        List<XRosterType> xRosterTypeList = xPress.getXRostersByXStaff(STAFF_REFID, OPAQUE_MARKER).getData();
        for(XRosterType o : xRosterTypeList){
            System.out.println(o.getRefId() + " | " + o.getCourseTitle() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXRostersByXStudent(XPress xPress) throws AuthenticationException {
        List<XRosterType> xRosterTypeList = xPress.getXRostersByXStudent(STUDENT_REFID, OPAQUE_MARKER).getData();
        for(XRosterType o : xRosterTypeList){
            System.out.println(o.getRefId() + " | " + o.getCourseTitle() + " | " + o.getMetadata().getSchoolYear());
        }
    }

    /* xStaffs */
    public static void getXStaffs(XPress xPress) throws AuthenticationException {
        List<XStaffType> xStaffTypeList = xPress.getXStaffs(OPAQUE_MARKER).getData();
        for(XStaffType o : xStaffTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXStaffsByXLea(XPress xPress) throws AuthenticationException {
        List<XStaffType> xStaffTypeList = xPress.getXStaffsByXLea(LEA_REFID, OPAQUE_MARKER).getData();
        for(XStaffType o : xStaffTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXStaffsByXSchool(XPress xPress) throws AuthenticationException {
        List<XStaffType> xStaffTypeList = xPress.getXStaffsByXSchool(SCHOOL_REFID, OPAQUE_MARKER).getData();
        for(XStaffType o : xStaffTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXStaffsByXCourse(XPress xPress) throws AuthenticationException {
        List<XStaffType> xStaffTypeList = xPress.getXStaffsByXCourse(COURSE_REFID, OPAQUE_MARKER).getData();
        for(XStaffType o : xStaffTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXStaffsByXRoster(XPress xPress) throws AuthenticationException {
        List<XStaffType> xStaffTypeList = xPress.getXStaffsByXRoster(ROSTER_REFID, OPAQUE_MARKER).getData();
        for(XStaffType o : xStaffTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXStaffsByXStudent(XPress xPress) throws AuthenticationException {
        List<XStaffType> xStaffTypeList = xPress.getXStaffsByXStudent(STUDENT_REFID, OPAQUE_MARKER).getData();
        for(XStaffType o : xStaffTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }

    /* xStudents */
    public static void getXStudents(XPress xPress) throws AuthenticationException {
        List<XStudentType> xStudentTypeList = xPress.getXStudents(OPAQUE_MARKER).getData();
        for(XStudentType o : xStudentTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXStudentsByXLea(XPress xPress) throws AuthenticationException {
        List<XStudentType> xStudentTypeList = xPress.getXStudentsByXLea(LEA_REFID, OPAQUE_MARKER).getData();
        for(XStudentType o : xStudentTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXStudentsByXSchool(XPress xPress) throws AuthenticationException {
        List<XStudentType> xStudentTypeList = xPress.getXStudentsByXSchool(SCHOOL_REFID, OPAQUE_MARKER).getData();
        for(XStudentType o : xStudentTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXStudentsByXRoster(XPress xPress) throws AuthenticationException {
        List<XStudentType> xStudentTypeList = xPress.getXStudentsByXRoster(ROSTER_REFID, OPAQUE_MARKER).getData();
        for(XStudentType o : xStudentTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXStudentsByXStaff(XPress xPress) throws AuthenticationException {
        List<XStudentType> xStudentTypeList = xPress.getXStudentsByXStaff(STAFF_REFID, OPAQUE_MARKER).getData();
        for(XStudentType o : xStudentTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXStudentsByXContact(XPress xPress) throws AuthenticationException {
        List<XStudentType> xStudentTypeList = xPress.getXStudentsByXContact(CONTACT_REFID, OPAQUE_MARKER).getData();
        for(XStudentType o : xStudentTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }

    /* xContacts */
    public static void getXContacts(XPress xPress) throws AuthenticationException {
        List<XContactType> xContactTypeList = xPress.getXContacts(OPAQUE_MARKER).getData();
        for(XContactType o : xContactTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXContactsByXLea(XPress xPress) throws AuthenticationException {
        List<XContactType> xContactTypeList = xPress.getXContactsByXLea(LEA_REFID, OPAQUE_MARKER).getData();
        for(XContactType o : xContactTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXContactsByXSchool(XPress xPress) throws AuthenticationException {
        List<XContactType> xContactTypeList = xPress.getXContactsByXSchool(SCHOOL_REFID, OPAQUE_MARKER).getData();
        for(XContactType o : xContactTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }
    public static void getXContactsByXStudent(XPress xPress) throws AuthenticationException {
        List<XContactType> xContactTypeList = xPress.getXContactsByXStudent(STUDENT_REFID, OPAQUE_MARKER).getData();
        for(XContactType o : xContactTypeList){
            System.out.println(o.getRefId() + " | " + o.getMetadata().getSchoolYear());
        }
    }

}
