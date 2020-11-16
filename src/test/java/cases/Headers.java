package cases;

import riconeapi.authentication.Authenticator;
import riconeapi.authentication.Endpoint;
import riconeapi.common.XPress;
import riconeapi.common.objects.ServicePath;
import riconeapi.exceptions.AuthenticationException;

import java.util.Optional;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version x.x.x
 * @since 11/5/2020
 */
public class Headers {
    // RestResponse Constants
    final static String authUrl = "https://auth.test.ricone.org/login";
    final static String clientId = "dpaDemo";
    final static String clientSecret = "deecd889bff5ed0101a86680752f5f9";
    final static String providerId = "localhost";

    static String LEA_REFID = "03ACF04F-DC12-411A-9A42-E8323516D699";
    static String LEA_BEDSIDTYPE = "beds";
    static String LEA_BEDSID = "530501060000";
    static String LEA_LOCALIDTYPE = "local";
    static String LEA_LOCALID = "530501";
    static String SCHOOL_REFID = "AE6B3441-5E31-4573-BADB-081669D79C7F";
    static String SCHOOL_BEDSIDTYPE = "BEDS";
    static String SCHOOL_BEDSID = "530501060004";
    static String SCHOOL_LOCALIDTYPE = "localhost";
    static String SCHOOL_LOCALID = "shm";
    static String CALENDAR_REFID = "09F0C2E3-B437-3671-AB05-1BA18B6FA034";
    static String COURSE_REFID = "82045B14-FE41-4FA8-8CD7-2350BF7C4C9B";
    static String ROSTER_REFID = "00E1179D-60AF-4C98-8B59-557830BDD5FC";
    static String STAFF_REFID = "15355903-789E-434E-A0EA-B8F9F0E3374A";
    static String STUDENT_REFID = "C5039D85-FEA9-46E2-8D3D-C468937953B4";
    static String CONTACT_REFID = "2D6E0697-EDF8-4E9E-ADCF-18CA9EDF0529";

    public static void main(String[] args) throws AuthenticationException {
        Authenticator auth = Authenticator.getInstance();
        auth.authenticate(authUrl, clientId, clientSecret);

        Optional<Endpoint> e = auth.getEndpoints(providerId);
        XPress xPress = new XPress(e.get());

//        headers(xPress);
        message(xPress);
//        statusCode(xPress);
//        navigationLastPage(xPress);
//        recordCount(xPress);

    }

    private static void headers(XPress xPress) throws AuthenticationException {
        System.out.println("### HEADERS");
        System.out.println("Header: " + xPress.getHeaders(ServicePath.GETXROSTERS).getHeader());
        System.out.println("Header with RefId: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID).getHeader());
        System.out.println("Header with Paging " + xPress.getHeaders(ServicePath.GETXROSTERS, 100).getHeader());
        System.out.println("Header with Paging and SchoolYear " + xPress.getHeaders(ServicePath.GETXROSTERS, 100, 2020).getHeader());
        System.out.println("Header with Paging and OpaqueMarker " + xPress.getHeaders(ServicePath.GETXROSTERS, 100, "2018-11-30T11:37:55.626-05:00").getHeader());
        System.out.println("Header with RefId and Paging: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID, 100).getHeader());
        System.out.println("Header with RefId and Paging and SchoolYear: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID, 100, 2020).getHeader());
    }

    private static void message(XPress xPress) throws AuthenticationException {
        System.out.println("### MESSAGE");
        System.out.println("Header: " + xPress.getHeaders(ServicePath.GETXROSTERS).getMessage());
        System.out.println("Header with RefId: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID).getMessage());
        System.out.println("Header with Paging " + xPress.getHeaders(ServicePath.GETXROSTERS, 100).getMessage());
        System.out.println("Header with Paging and SchoolYear " + xPress.getHeaders(ServicePath.GETXROSTERS, 100, 2020).getMessage());
        System.out.println("Header with Paging and OpaqueMarker " + xPress.getHeaders(ServicePath.GETXROSTERS, 100, "2018-11-30T11:37:55.626-05:00").getMessage());
        System.out.println("Header with RefId and Paging: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID, 100).getMessage());
        System.out.println("Header with RefId and Paging and SchoolYear: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID, 100, 2020).getMessage());
    }

    private static void statusCode(XPress xPress) throws AuthenticationException {
        System.out.println("### STATUS CODE");
        System.out.println("Header: " + xPress.getHeaders(ServicePath.GETXROSTERS).getStatusCode());
        System.out.println("Header with RefId: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID).getStatusCode());
        System.out.println("Header with Paging " + xPress.getHeaders(ServicePath.GETXROSTERS, 100).getStatusCode());
        System.out.println("Header with Paging and SchoolYear " + xPress.getHeaders(ServicePath.GETXROSTERS, 100, 2020).getStatusCode());
        System.out.println("Header with Paging and OpaqueMarker " + xPress.getHeaders(ServicePath.GETXROSTERS, 100, "2018-11-30T11:37:55.626-05:00").getStatusCode());
        System.out.println("Header with RefId and Paging: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID, 100).getStatusCode());
        System.out.println("Header with RefId and Paging and SchoolYear: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID, 100, 2020).getStatusCode());
    }

    private static void navigationLastPage(XPress xPress) throws AuthenticationException {
        System.out.println("### LAST PAGE");
        System.out.println("Header: " + xPress.getHeaders(ServicePath.GETXROSTERS).getNavigationLastPage());
        System.out.println("Header with RefId: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID).getNavigationLastPage());
        System.out.println("Header with Paging " + xPress.getHeaders(ServicePath.GETXROSTERS, 100).getNavigationLastPage());
        System.out.println("Header with Paging and SchoolYear " + xPress.getHeaders(ServicePath.GETXROSTERS, 100, 2020).getNavigationLastPage());
        System.out.println("Header with Paging and OpaqueMarker " + xPress.getHeaders(ServicePath.GETXROSTERS, 100, "2018-11-30T11:37:55.626-05:00").getNavigationLastPage());
        System.out.println("Header with RefId and Paging: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID, 100).getNavigationLastPage());
        System.out.println("Header with RefId and Paging and SchoolYear: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID, 100, 2020).getNavigationLastPage());
    }

    private static void recordCount(XPress xPress) throws AuthenticationException {
        System.out.println("### RECORD COUNT");
        System.out.println("Header: " + xPress.getHeaders(ServicePath.GETXROSTERS).getRecordCount());
        System.out.println("Header with RefId: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID).getRecordCount());
        System.out.println("Header with Paging " + xPress.getHeaders(ServicePath.GETXROSTERS, 100).getRecordCount());
        System.out.println("Header with Paging and SchoolYear " + xPress.getHeaders(ServicePath.GETXROSTERS, 100, 2020).getRecordCount());
        System.out.println("Header with Paging and OpaqueMarker " + xPress.getHeaders(ServicePath.GETXROSTERS, 100, "2018-11-30T11:37:55.626-05:00").getRecordCount());
        System.out.println("Header with RefId and Paging: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID, 100).getRecordCount());
        System.out.println("Header with RefId and Paging and SchoolYear: " + xPress.getHeaders(ServicePath.GETXROSTERSBYXLEA, LEA_REFID, 100, 2020).getRecordCount());
    }
}
