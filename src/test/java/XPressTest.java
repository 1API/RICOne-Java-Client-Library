import riconeapi.authentication.Authenticator;
import riconeapi.authentication.Endpoint;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.library.client.common.IResponse;
import riconeapi.library.client.common.Model;
import riconeapi.library.client.request.*;
import riconeapi.library.client.response.XResponse;
import riconeapi.library.client.response.model.*;

import java.time.LocalDateTime;
import java.util.*;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version x.x.x
 * @since 3/8/2021
 */
public class XPressTest {
    private static final int NAVIGATION_PAGE = 1, NAVIGATION_PAGE_SIZE = 5, SCHOOL_YEAR = 2020;
    private static final LocalDateTime CHANGES_SINCE = LocalDateTime.now();
    private static final IdType ID_TYPE = IdType.LOCAL; // Set to BEDS, STATE, LOCAL

    private static final int MAX = 5;
    private static final Random random = new Random();
    private static final int randomRecord = random.nextInt(((MAX - 1) + 1)); //random.nextInt(max - min + 1) + min

    private static final String FORMAT = "| %-105s | %-10s | %-10s | %-12s | %-14s |%n";

    private static List<XLea> xLeas = new ArrayList<>();
    private static List<XSchool> xSchools = new ArrayList<>();
    private static List<XCalendar> xCalendars = new ArrayList<>();
    private static List<XCourse> xCourses = new ArrayList<>();
    private static List<XRoster> xRosters = new ArrayList<>();
    private static List<XStaff> xStaffs = new ArrayList<>();
    private static List<XStudent> xStudents = new ArrayList<>();
    private static List<XContact> xContacts = new ArrayList<>();


    public static void main(String[] args) throws AuthenticationException {
        Authenticator auth = Authenticator.getInstance();
        auth.authenticate(System.getenv("auth_url"), System.getenv("client_id"), System.getenv("client_secret"));

        Optional<Endpoint> e = auth.getEndpoints(System.getenv("provider_id"));

        if(e.isPresent()) {
            XPress xPress = new XPress(e.get());
            loadLists(xPress);
            runTests(xPress);
        }
    }

    private static void loadLists(XPress xPress) {
        xLeas = xLeasList(xPress);
        xSchools = xSchoolsList(xPress);
        xCalendars = xCalendarsList(xPress);
        xCourses = xCoursesList(xPress);
        xRosters = xRostersList(xPress);
        xStaffs = xStaffsList(xPress);
        xStudents = xStudentsList(xPress);
        xContacts = xContactsList(xPress);
    }

    private static List<XLea> xLeasList(XPress xPress) {
        XResponse<XLeas> response = xPress.getXLeas(
            XRequest.builder()
                .servicePath(ServicePath.GET_XLEAS)
                .paging().end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXLeas();
    }

    private static List<XSchool> xSchoolsList(XPress xPress) {
        XResponse<XSchools> response = xPress.getXSchools(
            XRequest.builder()
                .servicePath(ServicePath.GET_XSCHOOLS)
                .paging().end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXSchools();
    }

    private static List<XCalendar> xCalendarsList(XPress xPress) {
        XResponse<XCalendars> response = xPress.getXCalendars(
            XRequest.builder()
                .servicePath(ServicePath.GET_XCALENDARS)
                .paging().end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXCalendars();
    }

    private static List<XCourse> xCoursesList(XPress xPress) {
        XResponse<XCourses> response = xPress.getXCourses(
            XRequest.builder()
                .servicePath(ServicePath.GET_XCOURSES)
                .paging().end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXCourses();
    }

    private static List<XRoster> xRostersList(XPress xPress) {
        XResponse<XRosters> response = xPress.getXRosters(
            XRequest.builder()
                .servicePath(ServicePath.GET_XROSTERS)
                .paging().end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXRosters();
    }

    private static List<XStaff> xStaffsList(XPress xPress) {
        XResponse<XStaffs> response = xPress.getXStaffs(
            XRequest.builder()
                .servicePath(ServicePath.GET_XSTAFFS)
                .paging().end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXStaffs();
    }

    private static List<XStudent> xStudentsList(XPress xPress) {
        XResponse<XStudents> response = xPress.getXStudents(
            XRequest.builder()
                .servicePath(ServicePath.GET_XSTUDENTS)
                .paging().end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXStudents();
    }

    private static List<XContact> xContactsList(XPress xPress) {
        XResponse<XContacts> response = xPress.getXContacts(
            XRequest.builder()
                .servicePath(ServicePath.GET_XCONTACTS)
                .paging().navigationPage(NAVIGATION_PAGE).end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXContacts();
    }

    private static void runTests(XPress xPress) {
        printTableHeader();
        for(ServicePath servicePath : ServicePath.values()) {
            IdType idType = servicePath.getRequestType().contains(RequestType.ID) ? ID_TYPE : IdType.REFID;
            switch(servicePath.name()) {
                // xLeas
                case "GET_XLEAS":

                    // xRosters/{refId}/xLeas
                case "GET_XLEAS_BY_XROSTER":

                    // xSchools/{refId}/xLeas
                case "GET_XLEAS_BY_XSCHOOL":

                    // xStaffs/{refId}/xLeas
                case "GET_XLEAS_BY_XSTAFF":

                    // xStudents/{refId}/xLeas
                case "GET_XLEAS_BY_XSTUDENT":

                    // xContacts/{refId}/xLeas
                case "GET_XLEAS_BY_XCONTACT":

                    // xLeas/{refId}
                case "GET_XLEA_BY_REFID":

                    // xLeas/{id}
                case "GET_XLEA_BY_ID": {
                    testXLeas(xPress, servicePath, idType);
                    break;
                }

                // xSchools
                case "GET_XSCHOOLS":

                // xLeas/{refId}/xSchools
                case "GET_XSCHOOLS_BY_XLEA":

                // xCalendars/{refId}/xSchools
                case "GET_XSCHOOLS_BY_XCALENDAR":

                // xCourses/{refId}/xSchools
                case "GET_XSCHOOLS_BY_XCOURSE":

                // xRosters/{refId}/xSchools
                case "GET_XSCHOOLS_BY_XROSTER":

                // xStaffs/{refId}/xSchools
                case "GET_XSCHOOLS_BY_XSTAFF":

                // xStudents/{refId}/xSchools
                case "GET_XSCHOOLS_BY_XSTUDENT":

                // xContacts/{refId}/xSchools
                case "GET_XSCHOOLS_BY_XCONTACT":

                // xSchools/{refId}
                case "GET_XSCHOOL_BY_REFID":

                // xSchools/{id}
                case "GET_XSCHOOL_BY_ID": {
                    testXSchools(xPress, servicePath, idType);
                    break;
                }

                // xCalendars
                case "GET_XCALENDARS":

                // xLeas/{refId}/xCalendars
                case "GET_XCALENDARS_BY_XLEA":

                // xSchools/{refId}/xCalendars
                case "GET_XCALENDARS_BY_XSCHOOL":

                // xCalendars/{refId}
                case "GET_XCALENDAR_BY_REFID": {
                    testXCalendars(xPress, servicePath, idType);
                    break;
                }

                // xCourses
                case "GET_XCOURSES":

                // xLeas/{refId}/xCourses
                case "GET_XCOURSES_BY_XLEA":

                // xSchools/{refId}/xCourses
                case "GET_XCOURSES_BY_XSCHOOL":

                // xRosters/{refId}/xCourses
                case "GET_XCOURSES_BY_XROSTER":

                // xCourses/{refId}
                case "GET_XCOURSE_BY_REFID": {
                    testXCourses(xPress, servicePath, idType);
                    break;
                }

                // xRosters
                case "GET_XROSTERS":

                // xLeas/{refId}/xRosters
                case "GET_XROSTERS_BY_XLEA":

                // xSchools/{refId}/xRosters
                case "GET_XROSTERS_BY_XSCHOOL":

                // xCourses/{refId}/xRosters
                case "GET_XROSTERS_BY_XCOURSE":

                // xStaffs/{refId}/xRosters
                case "GET_XROSTERS_BY_XSTAFF":

                // xStudents/{refId}/xRosters
                case "GET_XROSTERS_BY_XSTUDENT":

                // xRosters/{refId}
                case "GET_XROSTER_BY_REFID": {
                    testXRosters(xPress, servicePath, idType);
                    break;
                }

                // xStaffs
                case "GET_XSTAFFS":

                // xLeas/{refId}/xStaffs
                case "GET_XSTAFFS_BY_XLEA":

                // xSchools/{refId}/xStaffs
                case "GET_XSTAFFS_BY_XSCHOOL":

                // xCourses/{refId}/xStaffs
                case "GET_XSTAFFS_BY_XCOURSE":


                // xRosters/{refId}/xStaffs
                case "GET_XSTAFFS_BY_XROSTER":

                // xStudents/{refId}/xStaffs
                case "GET_XSTAFFS_BY_XSTUDENT":

                // xStaffs/{refId}
                case "GET_XSTAFF_BY_REFID": {
                    testXStaffs(xPress, servicePath, idType);
                    break;
                }

                // xStudents
                case "GET_XSTUDENTS":


                // xLeas/{refId}/xStudents
                case "GET_XSTUDENTS_BY_XLEA":


                // xSchools/{refId}/xStudents
                case "GET_XSTUDENTS_BY_XSCHOOL":


                // xRosters/{refId}/xStudents
                case "GET_XSTUDENTS_BY_XROSTER":

                // xStaffs/{refId}/xStudents
                case "GET_XSTUDENTS_BY_XSTAFF":

                // xContacts/{refId}/xStudents
                case "GET_XSTUDENTS_BY_XCONTACT":

                // xStudents/{refId}
                case "GET_XSTUDENT_BY_REFID": {
                    testXStudents(xPress, servicePath, idType);
                    break;
                }

                // xContacts
                case "GET_XCONTACTS":

                // xLeas/{refId}/xContacts
                case "GET_XCONTACTS_BY_XLEA":

                // xSchools/{refId}/xContacts
                case "GET_XCONTACTS_BY_XSCHOOL":

                // xStudents/{refId}/xContacts
                case "GET_XCONTACTS_BY_XSTUDENT":

                // xContacts/{refId}
                case "GET_XCONTACT_BY_REFID": {
                    testXContacts(xPress, servicePath, idType);
                    break;
                }

                // xEmployments
//                case "GET_XEMPLOYMENTS":
//
//                // xLeas/{refId}/xEmployments
//                case "GET_XEMPLOYMENTS_BY_XLEA":
//
//                // xSchools/{refId}/xEmployments
//                case "GET_XEMPLOYMENTS_BY_XSCHOOL":
//
//                // xEmployments/{refId}
//                case "GET_XEMPLOYMENT_BY_REFID": {
//                    testXEmployments(xPress, servicePath, idType);
//                    break;
//                }
            }
        }
    }

    // xLeas
    private static void testXLeas(XPress xPress, ServicePath servicePath, IdType idType) {
        // Request - No headers/query parameters
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XLeas> response = xPress.getXLeas(
                XRequest.builder()
                    .servicePath(servicePath)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XLeas> response = xPress.getXLeas(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XLea> response = xPress.getXLea(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }

        // Request - Paging
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XLeas> responsePaging = xPress.getXLeas(
                XRequest.builder()
                    .servicePath(servicePath)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XLeas> responsePaging = xPress.getXLeas(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XLea> responsePaging = xPress.getXLea(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }

        // Request - School year
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XLeas> responseSchoolYear = xPress.getXLeas(
                XRequest.builder()
                    .servicePath(servicePath)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XLeas> responseSchoolYear = xPress.getXLeas(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XLea> responseSchoolYear = xPress.getXLea(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }

        // Request - Changes since
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XLeas> responseChangesSince = xPress.getXLeas(
                XRequest.builder()
                    .servicePath(servicePath)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XLeas> responseChangesSince = xPress.getXLeas(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XLea> responseChangesSince = xPress.getXLea(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        printTableBorder();
    }

    // xSchools
    private static void testXSchools(XPress xPress, ServicePath servicePath, IdType idType) {
        // Request - No headers/query parameters
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XSchools> response = xPress.getXSchools(
                XRequest.builder()
                    .servicePath(servicePath)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XSchools> response = xPress.getXSchools(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XSchool> response = xPress.getXSchool(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }

        // Request - Paging
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XSchools> responsePaging = xPress.getXSchools(
                XRequest.builder()
                    .servicePath(servicePath)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XSchools> responsePaging = xPress.getXSchools(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XSchool> responsePaging = xPress.getXSchool(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }

        // Request - School year
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XSchools> responseSchoolYear = xPress.getXSchools(
                XRequest.builder()
                    .servicePath(servicePath)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XSchools> responseSchoolYear = xPress.getXSchools(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XSchool> responseSchoolYear = xPress.getXSchool(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }

        // Request - Changes since
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XSchools> responseChangesSince = xPress.getXSchools(
                XRequest.builder()
                    .servicePath(servicePath)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XSchools> responseChangesSince = xPress.getXSchools(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XSchool> responseChangesSince = xPress.getXSchool(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        printTableBorder();
    }

    // xCalendars
    private static void testXCalendars(XPress xPress, ServicePath servicePath, IdType idType) {
        // Request - No headers/query parameters
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XCalendars> response = xPress.getXCalendars(
                XRequest.builder()
                    .servicePath(servicePath)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XCalendars> response = xPress.getXCalendars(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XCalendar> response = xPress.getXCalendar(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }

        // Request - Paging
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XCalendars> responsePaging = xPress.getXCalendars(
                XRequest.builder()
                    .servicePath(servicePath)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XCalendars> responsePaging = xPress.getXCalendars(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XCalendar> responsePaging = xPress.getXCalendar(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }

        // Request - School year
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XCalendars> responseSchoolYear = xPress.getXCalendars(
                XRequest.builder()
                    .servicePath(servicePath)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XCalendars> responseSchoolYear = xPress.getXCalendars(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XCalendar> responseSchoolYear = xPress.getXCalendar(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }

        // Request - Changes since
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XCalendars> responseChangesSince = xPress.getXCalendars(
                XRequest.builder()
                    .servicePath(servicePath)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XCalendars> responseChangesSince = xPress.getXCalendars(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XCalendar> responseChangesSince = xPress.getXCalendar(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        printTableBorder();
    }

    // xCourses
    private static void testXCourses(XPress xPress, ServicePath servicePath, IdType idType) {
        // Request - No headers/query parameters
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XCourses> response = xPress.getXCourses(
                XRequest.builder()
                    .servicePath(servicePath)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XCourses> response = xPress.getXCourses(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XCourse> response = xPress.getXCourse(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }

        // Request - Paging
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XCourses> responsePaging = xPress.getXCourses(
                XRequest.builder()
                    .servicePath(servicePath)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XCourses> responsePaging = xPress.getXCourses(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XCourse> responsePaging = xPress.getXCourse(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }

        // Request - School year
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XCourses> responseSchoolYear = xPress.getXCourses(
                XRequest.builder()
                    .servicePath(servicePath)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XCourses> responseSchoolYear = xPress.getXCourses(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XCourse> responseSchoolYear = xPress.getXCourse(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }

        // Request - Changes since
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XCourses> responseChangesSince = xPress.getXCourses(
                XRequest.builder()
                    .servicePath(servicePath)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XCourses> responseChangesSince = xPress.getXCourses(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XCourse> responseChangesSince = xPress.getXCourse(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        printTableBorder();
    }

    // xRosters
    private static void testXRosters(XPress xPress, ServicePath servicePath, IdType idType) {
        // Request - No headers/query parameters
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XRosters> response = xPress.getXRosters(
                XRequest.builder()
                    .servicePath(servicePath)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XRosters> response = xPress.getXRosters(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XRoster> response = xPress.getXRoster(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }

        // Request - Paging
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XRosters> responsePaging = xPress.getXRosters(
                XRequest.builder()
                    .servicePath(servicePath)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XRosters> responsePaging = xPress.getXRosters(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XRoster> responsePaging = xPress.getXRoster(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }

        // Request - School year
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XRosters> responseSchoolYear = xPress.getXRosters(
                XRequest.builder()
                    .servicePath(servicePath)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XRosters> responseSchoolYear = xPress.getXRosters(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XRoster> responseSchoolYear = xPress.getXRoster(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }

        // Request - Changes since
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XRosters> responseChangesSince = xPress.getXRosters(
                XRequest.builder()
                    .servicePath(servicePath)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XRosters> responseChangesSince = xPress.getXRosters(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XRoster> responseChangesSince = xPress.getXRoster(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        printTableBorder();
    }

    // xStaffs
    private static void testXStaffs(XPress xPress, ServicePath servicePath, IdType idType) {
        // Request - No headers/query parameters
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XStaffs> response = xPress.getXStaffs(
                XRequest.builder()
                    .servicePath(servicePath)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XStaffs> response = xPress.getXStaffs(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XStaff> response = xPress.getXStaff(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }

        // Request - Paging
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XStaffs> responsePaging = xPress.getXStaffs(
                XRequest.builder()
                    .servicePath(servicePath)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XStaffs> responsePaging = xPress.getXStaffs(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XStaff> responsePaging = xPress.getXStaff(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }

        // Request - School year
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XStaffs> responseSchoolYear = xPress.getXStaffs(
                XRequest.builder()
                    .servicePath(servicePath)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XStaffs> responseSchoolYear = xPress.getXStaffs(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XStaff> responseSchoolYear = xPress.getXStaff(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }

        // Request - Changes since
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XStaffs> responseChangesSince = xPress.getXStaffs(
                XRequest.builder()
                    .servicePath(servicePath)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XStaffs> responseChangesSince = xPress.getXStaffs(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XStaff> responseChangesSince = xPress.getXStaff(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }

        // Request - AUPP
        if(servicePath.equals(ServicePath.GET_XSTAFFS_BY_XSCHOOL)) {
            XResponse<XStaffs> responseAupp = xPress.getXStaffs(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .accountProvisioning()
                    .build());
            printTableRow(responseAupp);
        }

        printTableBorder();
    }

    // xStudents
    private static void testXStudents(XPress xPress, ServicePath servicePath, IdType idType) {
        // Request - No headers/query parameters
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XStudents> response = xPress.getXStudents(
                XRequest.builder()
                    .servicePath(servicePath)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XStudents> response = xPress.getXStudents(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XStudent> response = xPress.getXStudent(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }

        // Request - Paging
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XStudents> responsePaging = xPress.getXStudents(
                XRequest.builder()
                    .servicePath(servicePath)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XStudents> responsePaging = xPress.getXStudents(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XStudent> responsePaging = xPress.getXStudent(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }

        // Request - School year
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XStudents> responseSchoolYear = xPress.getXStudents(
                XRequest.builder()
                    .servicePath(servicePath)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XStudents> responseSchoolYear = xPress.getXStudents(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XStudent> responseSchoolYear = xPress.getXStudent(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }

        // Request - Changes since
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XStudents> responseChangesSince = xPress.getXStudents(
                XRequest.builder()
                    .servicePath(servicePath)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XStudents> responseChangesSince = xPress.getXStudents(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XStudent> responseChangesSince = xPress.getXStudent(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }

        // Request - AUPP
        if(servicePath.equals(ServicePath.GET_XSTUDENTS_BY_XSCHOOL)) {
            XResponse<XStudents> responseAupp = xPress.getXStudents(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .accountProvisioning()
                    .build());
            printTableRow(responseAupp);
        }
        printTableBorder();
    }

    // xContacts
    private static void testXContacts(XPress xPress, ServicePath servicePath, IdType idType) {
        // Request - No headers/query parameters
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XContacts> response = xPress.getXContacts(
                XRequest.builder()
                    .servicePath(servicePath)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XContacts> response = xPress.getXContacts(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XContact> response = xPress.getXContact(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .build());
            printTableRow(response);
        }

        // Request - Paging
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XContacts> responsePaging = xPress.getXContacts(
                XRequest.builder()
                    .servicePath(servicePath)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XContacts> responsePaging = xPress.getXContacts(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XContact> responsePaging = xPress.getXContact(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
            printTableRow(responsePaging);
        }

        // Request - School year
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XContacts> responseSchoolYear = xPress.getXContacts(
                XRequest.builder()
                    .servicePath(servicePath)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XContacts> responseSchoolYear = xPress.getXContacts(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XContact> responseSchoolYear = xPress.getXContact(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .schoolYear(SCHOOL_YEAR)
                    .build());
            printTableRow(responseSchoolYear);
        }

        // Request - Changes since
        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            XResponse<XContacts> responseChangesSince = xPress.getXContacts(
                XRequest.builder()
                    .servicePath(servicePath)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            XResponse<XContacts> responseChangesSince = xPress.getXContacts(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getPredicate(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
            XResponse<XContact> responseChangesSince = xPress.getXContact(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(getId(getObject(servicePath), idType), idType)
                    .changesSince(CHANGES_SINCE)
                    .build());
            printTableRow(responseChangesSince);
        }
        printTableBorder();
    }

    // xEmployments
//    private static void testXEmployments(XPress xPress, ServicePath servicePath, IdType idType) {
//        // Request - No headers/query parameters
//        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
//            XResponse<XEmployments> response = xPress.getXEmployments(
//                XRequest.builder()
//                    .servicePath(servicePath)
//                    .build());
//            printTableRow(response);
//        }
//        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
//            XResponse<XEmployments> response = xPress.getXEmployments(
//                XRequest.builder()
//                    .servicePath(servicePath)
//                    .id(getId(getPredicate(servicePath), idType), idType)
//                    .build());
//            printTableRow(response);
//        }
//        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
//            XResponse<XEmployment> response = xPress.getXEmployment(
//                XRequest.builder()
//                    .servicePath(servicePath)
//                    .id(getId(getObject(servicePath), idType), idType)
//                    .build());
//            printTableRow(response);
//        }
//
//        // Request - Paging
//        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
//            XResponse<XEmployments> responsePaging = xPress.getXEmployments(
//                XRequest.builder()
//                    .servicePath(servicePath)
//                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
//                    .build());
//            printTableRow(responsePaging);
//        }
//        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
//            XResponse<XEmployments> responsePaging = xPress.getXEmployments(
//                XRequest.builder()
//                    .servicePath(servicePath)
//                    .id(getId(getPredicate(servicePath), idType), idType)
//                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
//                    .build());
//            printTableRow(responsePaging);
//        }
//        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
//            XResponse<XEmployment> responsePaging = xPress.getXEmployment(
//                XRequest.builder()
//                    .servicePath(servicePath)
//                    .id(getId(getObject(servicePath), idType), idType)
//                    .paging().navigationPage(NAVIGATION_PAGE).navigationPageSize(NAVIGATION_PAGE_SIZE).end()
//                    .build());
//            printTableRow(responsePaging);
//        }
//
//        // Request - School year
//        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
//            XResponse<XEmployments> responseSchoolYear = xPress.getXEmployments(
//                XRequest.builder()
//                    .servicePath(servicePath)
//                    .schoolYear(SCHOOL_YEAR)
//                    .build());
//            printTableRow(responseSchoolYear);
//        }
//        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
//            XResponse<XEmployments> responseSchoolYear = xPress.getXEmployments(
//                XRequest.builder()
//                    .servicePath(servicePath)
//                    .id(getId(getPredicate(servicePath), idType), idType)
//                    .schoolYear(SCHOOL_YEAR)
//                    .build());
//            printTableRow(responseSchoolYear);
//        }
//        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
//            XResponse<XEmployment> responseSchoolYear = xPress.getXEmployment(
//                XRequest.builder()
//                    .servicePath(servicePath)
//                    .id(getId(getObject(servicePath), idType), idType)
//                    .schoolYear(SCHOOL_YEAR)
//                    .build());
//            printTableRow(responseSchoolYear);
//        }
//
//        // Request - Changes since
//        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
//            XResponse<XEmployments> responseChangesSince = xPress.getXEmployments(
//                XRequest.builder()
//                    .servicePath(servicePath)
//                    .changesSince(CHANGES_SINCE)
//                    .build());
//            printTableRow(responseChangesSince);
//        }
//        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
//            XResponse<XEmployments> responseChangesSince = xPress.getXEmployments(
//                XRequest.builder()
//                    .servicePath(servicePath)
//                    .id(getId(getPredicate(servicePath), idType), idType)
//                    .changesSince(CHANGES_SINCE)
//                    .build());
//            printTableRow(responseChangesSince);
//        }
//        else if(servicePath.getServicePathType().equals(ServicePathType.SINGLE)) {
//            XResponse<XEmployment> responseChangesSince = xPress.getXEmployment(
//                XRequest.builder()
//                    .servicePath(servicePath)
//                    .id(getId(getObject(servicePath), idType), idType)
//                    .changesSince(CHANGES_SINCE)
//                    .build());
//            printTableRow(responseChangesSince);
//        }
//        printTableBorder();
//    }

    private static String getId(String predicate, IdType idType) {
        switch(predicate) {
            case "XLEA":
            case "XLEAS": {
                switch(idType) {
                    case REFID:
                        return xLeas.get(randomRecord).getRefId();
                    case LOCAL:
                        return xLeas.get(randomRecord).getLocalId();
                    case BEDS:
                        return xLeas.get(randomRecord).getStateProvinceId();
                    case STATE:
                        return xLeas.get(randomRecord).getStateProvinceId();
                }
            }
            case "XSCHOOL":
            case "XSCHOOLS": {
                switch(idType) {
                    case REFID:
                        return xSchools.get(randomRecord).getRefId();
                    case LOCAL:
                        return xSchools.get(randomRecord).getLocalId();
                    case BEDS:
                        return xSchools.get(randomRecord).getStateProvinceId();
                    case STATE:
                        return xSchools.get(randomRecord).getStateProvinceId();
                }
            }
            case "XCALENDAR":
            case "XCALENDARS":
                return xCalendars.get(randomRecord).getRefId();
            case "XCOURSE":
            case "XCOURSES":
                return xCourses.get(randomRecord).getRefId();
            case "XROSTER":
            case "XROSTERS":
                return xRosters.get(randomRecord).getRefId();
            case "XSTAFF":
            case "XSTAFFS":
                return xStaffs.get(randomRecord).getRefId();
            case "XSTUDENT":
            case "XSTUDENTS":
                return xStudents.get(randomRecord).getRefId();
            case "XCONTACT":
            case "XCONTACTS":
                return xContacts.get(randomRecord).getRefId();
            default: return "NO ID";
        }
    }

    // GET_Object_By_Predicate
    private static String getPredicate(ServicePath servicePath) {
        String[] array = servicePath.toString().split("_");
        return array[3];
    }

    //GET_Object_By_Id
    private static String getObject(ServicePath servicePath) {
        String[] array = servicePath.toString().split("_");
        return array[1];
    }

    // Output methods
    private static void showResults(IResponse<? extends Model> response) {
        System.out.println("Request: " + response.getRequestUrl() + " | Status: " + response.getResponseStatusCode() + " | HasData: " + response.getData().hasData() + " | Response Headers: " + response.getResponseHeaders());
    }

    // runTests() table
    private static void printTableHeader() {
        printTableBorder();
        System.out.format(FORMAT, "Request Url", "Paging", "SchoolYear", "Status Code", "X-Record-Count");
        printTableBorder();
    }

    private static void printTableBorder() {
        System.out.format("+-----------------------------------------------------------------------------------------------------------+------------+------------+--------------+----------------+%n");
    }

    private static void printTableRow(IResponse<? extends Model> response) {

        System.out.format(FORMAT, response.getRequestUrl().replace("http://localhost:8080/api/requests/", ""), getHeaders(response), getSchoolYear(response), response.getResponseStatusCode().value(), getRecordCount(response));
    }

    private static String getHeaders(IResponse<? extends Model> response) {
        if(response.getResponseHeaders().getFirst("NavigationPage") != null) {
            return response.getResponseHeaders().getFirst("NavigationPage") + "," +
                response.getResponseHeaders().getFirst("NavigationPageSize");
        }
        return "-";
    }

    private static String getSchoolYear(IResponse<? extends Model> response) {
        if(response.getResponseHeaders().getFirst("SchoolYear") != null) {
            return response.getResponseHeaders().getFirst("SchoolYear");
        }
        return "-";
    }

    private static String getRecordCount(IResponse<? extends Model> response) {
        if(response.getResponseHeaders().getFirst("X-Record-Count") != null) {
            return response.getResponseHeaders().getFirst("X-Record-Count");
        }
        return "-";
    }

}
