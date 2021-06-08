import org.springframework.util.StringUtils;
import riconeapi.authentication.Authenticator;
import riconeapi.authentication.Endpoint;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.library.client.common.IResponse;
import riconeapi.library.client.common.Model;
import riconeapi.library.client.request.*;
import riconeapi.library.client.response.XResponse;
import riconeapi.library.client.response.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version x.x.x
 * @since 4/1/2021
 */
public class XPressLastPageTest {
    private static final int NAVIGATION_PAGE = 1, NAVIGATION_PAGE_SIZE = 5, SCHOOL_YEAR = 2020;

    private static final int MAX = 5;
    private static final Random random = new Random();
    private static final int randomRecord = random.nextInt(((MAX - 1) + 1)); //random.nextInt(max - min + 1) + min

    public static final String FORMAT = "| %-60s | %-10s | %-10s |%n";

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
            runLastPageTests(xPress);
        }
    }

    private static void loadLists(XPress xPress) {
        xLeas = loadXLeas(xPress);
        xSchools = loadXSchools(xPress);
        xCalendars = loadXCalendars(xPress);
        xCourses = loadXCourses(xPress);
        xRosters = loadXRosters(xPress);
        xStaffs = loadXStaffs(xPress);
        xStudents = loadXStudents(xPress);
        xContacts = loadXContacts(xPress);
    }

    private static List<XLea> loadXLeas(XPress xPress) {
        XResponse<XLeas> response = xPress.getXLeas(
            XRequest.builder()
                .servicePath(ServicePath.GET_XLEAS)
                .paging().navigationPage(NAVIGATION_PAGE).end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXLeas();
    }

    private static List<XSchool> loadXSchools(XPress xPress) {
        XResponse<XSchools> response = xPress.getXSchools(
            XRequest.builder()
                .servicePath(ServicePath.GET_XSCHOOLS)
                .paging().navigationPage(NAVIGATION_PAGE).end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXSchools();
    }

    private static List<XCalendar> loadXCalendars(XPress xPress) {
        XResponse<XCalendars> response = xPress.getXCalendars(
            XRequest.builder()
                .servicePath(ServicePath.GET_XCALENDARS)
                .paging().navigationPage(NAVIGATION_PAGE).end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXCalendars();
    }

    private static List<XCourse> loadXCourses(XPress xPress) {
        XResponse<XCourses> response = xPress.getXCourses(
            XRequest.builder()
                .servicePath(ServicePath.GET_XCOURSES)
                .paging().navigationPage(NAVIGATION_PAGE).end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXCourses();
    }

    private static List<XRoster> loadXRosters(XPress xPress) {
        XResponse<XRosters> response = xPress.getXRosters(
            XRequest.builder()
                .servicePath(ServicePath.GET_XROSTERS)
                .paging().navigationPage(NAVIGATION_PAGE).end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXRosters();
    }

    private static List<XStaff> loadXStaffs(XPress xPress) {
        XResponse<XStaffs> response = xPress.getXStaffs(
            XRequest.builder()
                .servicePath(ServicePath.GET_XSTAFFS)
                .paging().navigationPage(NAVIGATION_PAGE).end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXStaffs();
    }

    private static List<XStudent> loadXStudents(XPress xPress) {
        XResponse<XStudents> response = xPress.getXStudents(
            XRequest.builder()
                .servicePath(ServicePath.GET_XSTUDENTS)
                .paging().navigationPage(NAVIGATION_PAGE).end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXStudents();
    }

    private static List<XContact> loadXContacts(XPress xPress) {
        XResponse<XContacts> response = xPress.getXContacts(
            XRequest.builder()
                .servicePath(ServicePath.GET_XCONTACTS)
                .paging().navigationPage(NAVIGATION_PAGE).end()
                .schoolYear(SCHOOL_YEAR)
                .build());
        showResults(response);
        return response.getData().getXContacts();
    }

    private static void showResults(IResponse<? extends Model> response) {
        System.out.println("Request: " + response.getRequestUrl() + " | Status: " + response.getResponseStatusCode() + " | HasData: " + response.getData().hasData() + " | Response Headers: " + response.getResponseHeaders());
    }

    private static void runLastPageTests(XPress xPress) {
        printTableHeader();
        for(ServicePath servicePath : ServicePath.values()) {
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

                    // xCalendars
                case "GET_XCALENDARS":

                    // xLeas/{refId}/xCalendars
                case "GET_XCALENDARS_BY_XLEA":

                    // xSchools/{refId}/xCalendars
                case "GET_XCALENDARS_BY_XSCHOOL":

                    // xCourses
                case "GET_XCOURSES":

                    // xLeas/{refId}/xCourses
                case "GET_XCOURSES_BY_XLEA":

                    // xSchools/{refId}/xCourses
                case "GET_XCOURSES_BY_XSCHOOL":

                    // xRosters/{refId}/xCourses
                case "GET_XCOURSES_BY_XROSTER":

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

                    // xContacts
                case "GET_XCONTACTS":

                    // xLeas/{refId}/xContacts
                case "GET_XCONTACTS_BY_XLEA":

                    // xSchools/{refId}/xContacts
                case "GET_XCONTACTS_BY_XSCHOOL":

                    // xStudents/{refId}/xContacts
                case "GET_XCONTACTS_BY_XSTUDENT": {
                    testXLastPage(xPress, servicePath);
                    break;
                }
            }
        }
    }

    private static void testXLastPage(XPress xPress, ServicePath servicePath) {
        int lastPage = 0;
        String refId = null;

        if(servicePath.getServicePathType().equals(ServicePathType.OBJECT)) {
            lastPage = xPress.getXLastPage(
            XRequest.builder()
                .servicePath(servicePath)
                .paging().navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                .build());
        }
        else if(servicePath.getServicePathType().equals(ServicePathType.PREDICATE)) {
            refId = getId(getPredicate(servicePath));
            lastPage = xPress.getXLastPage(
                XRequest.builder()
                    .servicePath(servicePath)
                    .id(refId)
                    .paging().navigationPageSize(NAVIGATION_PAGE_SIZE).end()
                    .build());
        }
        printTableRow(servicePath, refId, lastPage);
        printTableBorder();
    }

    private static String getId(String predicate) {
        switch(predicate) {
            case "XLEA":
            case "XLEAS": {
                return xLeas.get(randomRecord).getRefId();
            }
            case "XSCHOOL":
            case "XSCHOOLS": {
                return xSchools.get(randomRecord).getRefId();
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

    // runLastPage() table
    private static void printTableHeader() {
        printTableBorder();
        System.out.format(FORMAT, "Request Url", "PageSize", "LastPage");
        printTableBorder();
    }

    private static void printTableBorder() {
        System.out.format("+--------------------------------------------------------------+------------+------------+%n");
    }

    private static void printTableRow(ServicePath servicePath, String refId, int lastPage) {
        System.out.format(FORMAT, StringUtils.replace(servicePath.getValue(), "{refId}", refId), NAVIGATION_PAGE_SIZE, lastPage);
    }
}
