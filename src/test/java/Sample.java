import riconeapi.authentication.Authenticator;
import riconeapi.authentication.Endpoint;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.library.client.request.ServicePath;
import riconeapi.library.client.request.XPress;
import riconeapi.library.client.request.XRequest;
import riconeapi.library.client.response.XResponse;
import riconeapi.library.client.response.model.*;

import java.util.Optional;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 2.0.0
 * @since 6/22/2021
 */
public class Sample {
    public static void main(String[] args) throws AuthenticationException {
        String authUrl = "AUTH URL";
        String clientId = "YOUR USERNAME";
        String clientSecret = "YOUR PASSWORD";
        String providerId = "PROVIDER ID";

        Authenticator authenticator = Authenticator.getInstance();
        authenticator.authenticate(authUrl, clientId, clientSecret);

        Optional<Endpoint> e = authenticator.getEndpoints(providerId);
        if(e.isPresent()) {
            XPress xPress = new XPress(e.get());
            getXRosterEnrollmentsByXLea(xPress);
        }
        else {
            System.out.println("Error: No endpoint value.");
        }
    }

    /**
     *  Using a list of xLeas, print the page number, xLea refid, course title, xRoster refid, and student info for each
     *  xRoster enrollment using a navigationPageSize of 250. The number of pages (NavigationPage) to iterate is
     *  determined by using the getPredicateLastPage() helper method.
     */
    private static void getXRosterEnrollmentsByXLea(XPress xPress) {
        int navigationPageSize = 250; // the page size per page

        XResponse<XLeas> xLeasXResponse = xLeasList(xPress); // xLeas request

        if(xLeasXResponse.getResponseStatusCode() == 200) {
            for(XLea xLea : xLeasXResponse.getData().getXLeas()) {
                int lastPage = getPredicateLastPage(xPress, ServicePath.GET_XROSTERS_BY_XLEA, xLea.getRefId(), navigationPageSize); // get last page value
                if(lastPage > 0) {
                    for(int page = 1; page <= lastPage; page++) {
                        XResponse<XRosters> xRostersXResponse = xRostersByXLeasList(xPress, xLea, page, navigationPageSize); // xRosters by xLeas request
                        if(xRostersXResponse.getResponseStatusCode() == 200) {
                            for(XRoster xRoster : xRostersXResponse.getData().getXRosters()) {
                                printOutput(page, xLea, xRoster); // print output
                            }
                        }
                        else {
                            System.out.println("Error: xRosters did not return status code 200 for xLea: " + xLea.getRefId());
                        }
                    }
                }
                else {
                    System.out.println("Error: Last page must be greater than 0.");
                }
            }
        }
        else {
            System.out.println("Error: xLeas did not return status code 200.");
        }
    }

    // xLeas builder request.
    private static XResponse<XLeas> xLeasList(XPress xPress) {
        return xPress.getXLeas(
            XRequest.builder()
                .servicePath(ServicePath.GET_XLEAS)
                .build());
    }

    // xRosters by xLea builder request.
    private static XResponse<XRosters> xRostersByXLeasList(XPress xPress, XLea xLea, int page, int navigationPageSize) {
        return xPress.getXRosters(
            XRequest.builder()
                .servicePath(ServicePath.GET_XROSTERS_BY_XLEA)
                .id(xLea.getRefId())
                .paging().navigationPage(page).navigationPageSize(navigationPageSize).end()
                .build());
    }

    // Last page helper method for xPress predicate requests.
    private static int getPredicateLastPage(XPress xPress, ServicePath servicePath, String refId, int navigationPageSize) {
        return xPress.getXLastPage(
            XRequest.builder()
                .servicePath(servicePath)
                .id(refId)
                .paging().navigationPageSize(navigationPageSize).end()
                .build());
    }

    // Print the output.
    private static void printOutput(int page, XLea xLea, XRoster xRoster) {
        if(xRoster.getStudents() != null) {
            for(StudentReference studentReference : xRoster.getStudents().getStudentReference())
                System.out.println(
                    "Page: " + page + " | " +
                        "xLea RefId: " + xLea.getRefId() + " | " +
                        "Course Title: " + xRoster.getCourseTitle() + " | " +
                        "Roster RefId: " + xRoster.getRefId() + " | " +
                        "Student RefId: " + studentReference.getRefId() + " | " +
                        "Student LocalId: " + studentReference.getLocalId() + " | " +
                        "Student Given Name: " + studentReference.getGivenName() + " | " +
                        "Student Family Name: " + studentReference.getFamilyName()
                );
        }
        else {
            System.out.println(
                "Page: " + page + " | " +
                    "xLea RefId: " + xLea.getRefId() + " | " +
                    "Course Title: " + xRoster.getCourseTitle() + " | " +
                    "Roster RefId: " + xRoster.getRefId() + " | " +
                    "no students enrolled.");
        }
    }
}
