import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import riconeapi.authentication.Authenticator;
import riconeapi.authentication.Endpoint;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.library.client.request.ServicePath;
import riconeapi.library.client.request.XPress;
import riconeapi.library.client.request.XRequest;
import riconeapi.library.client.response.XLeasResponse;
import riconeapi.library.client.response.XResponse;
import riconeapi.library.client.response.model.*;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version x.x.x
 * @since 2/4/2021
 */
public class XPressBuilderTest {
    public static void main(String[] args) throws AuthenticationException {
        Authenticator auth = Authenticator.getInstance();
        auth.authenticate(System.getenv("auth_url"), System.getenv("client_id"), System.getenv("client_secret"));

        Optional<Endpoint> e = auth.getEndpoints(System.getenv("provider_id"));
        XPress xPress = new XPress(e.get());

//        getXLeas(xPress);
//        getXLea(xPress);
//        getXLastPage(xPress);
//        getXStudents(xPress);
//        getTest(xPress);
        getAupp(xPress);
    }

    private static void getXLeas(XPress xPress) {
        XResponse<XLeas> response = xPress.getXLeas(
            XRequest.builder()
                .servicePath(ServicePath.GET_XLEAS)
//                .paging()
//                    .navigationPage(1)
//                    .navigationPageSize(2)
//                    .end()
//                .schoolYear(2021)
//                .changesSince(LocalDateTime.now())
//                .accountProvisioning()
            .build());

        for(XLea xLea : response.getData().getXLeas()) {
            System.out.println(xLea.getRefId() + " - " + xLea.getLeaName());
        }

        System.out.println(response.getRequestUrl());
    }

    private static void getXLea(XPress xPress) {
        XResponse<XLea> response = xPress.getXLea(
            XRequest.builder()
                .servicePath(ServicePath.GET_XLEA_BY_REFID)
                .id("03ACF04F-DC12-411A-9A42-E8323516D699")
//                .id("A9F798CE-DA1A-3195-88CD-13AAC9416187")
                .paging().navigationPage(1).navigationPageSize(1).end()
            .build());

        if(response.getResponseStatusCode().equals(HttpStatus.OK)) {
            XLea xLea = response.getData();

            System.out.println(xLea.getRefId() + " - " + xLea.getLeaName());
        }
        else {
            System.out.println(response.getRequestUrl());
            System.out.println(response.getResponseStatusCode() + " - " + response.getResponseStatusText());
        }

        System.out.println(response.getData().hasData());

    }

//    private static void getXStudents(XPress xPress) {
//        int pageSize = 500;
//        XResponse<XStudents> response = xPress.getXStudents(
//            XRequest.builder()
//                .servicePath(ServicePath.GET_XSTUDENTS)
//                .paging().navigationPageSize(pageSize).end()
//            .build());
//
//        Integer lastPage = response.getLastPage();
////        for(XStudent xStudent : response.get)
//
//        System.out.println(lastPage);
//    }

    private static void getXLastPage(XPress xPress) {
        int pageSize = 500;
        int lastPage = xPress.getXLastPage(
            XRequest.builder()
                .servicePath(ServicePath.GET_XSTUDENTS)
                .paging().navigationPageSize(pageSize).end()
            .build());

        System.out.println("Lastpage: " + lastPage);
    }

    private static void getTest(XPress xPress) {
        XResponse<XLeas> response = xPress.getXLeas(
            XRequest.builder()
                .servicePath(ServicePath.GET_XLEAS)
//                .paging()
//                    .navigationPage(1)
//                    .navigationPageSize(2)
//                    .end()
//                .schoolYear(2021)
//                .changesSince(LocalDateTime.now())
//                .accountProvisioning()
                .build());
        System.out.println(response.toString());
        for(XLea xLea : response.getData().getXLeas()) {
            System.out.println(xLea.getRefId() + " - " + xLea.getLeaName());
        }
    }

    private static void getAupp(XPress xPress) {
        XResponse<XStaffs> response = xPress.getXStaffs(
            XRequest.builder()
                .servicePath(ServicePath.GET_XSTAFFS_BY_XSCHOOL)
                .id("78C72FBF-8C29-4107-BF2B-E3BA9F9849C5")
                .accountProvisioning()
                .build()
        );
        System.out.println(response.getResponseStatusCode() + " - Staff");
        for(XStaff s : response.getData().getXStaffs()) {
            System.out.println(s.getRefId());
        }
        System.out.println("End Staff");

        XResponse<XStudents> response2 = xPress.getXStudents(
            XRequest.builder()
                .servicePath(ServicePath.GET_XSTUDENTS_BY_XSCHOOL)
                .id("78C72FBF-8C29-4107-BF2B-E3BA9F9849C5")
                .accountProvisioning()
                .build()
        );
        System.out.println(response.getResponseStatusCode() + " - Student");
        for(XStaff s : response.getData().getXStaffs()) {
            System.out.println(s.getRefId());
        }
        System.out.println("End Student");

        XResponse<XLeas> response3 = xPress.getXLeas(XRequest.builder().servicePath(ServicePath.GET_XLEAS).build());
        for(XLea l : response3.getData().getXLeas()) {
            System.out.println(l.getRefId());
        }
        System.out.println(response3.getJSON());
        System.out.println(response3.getData().toString());
        System.out.println(response.getData().toString());
        System.out.println(response3);
        System.out.println(response);
    }

}
