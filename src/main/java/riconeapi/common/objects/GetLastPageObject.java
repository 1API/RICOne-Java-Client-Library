package riconeapi.common.objects;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import riconeapi.authentication.Endpoint;
import riconeapi.common.rest.RestHeader;
import riconeapi.common.rest.RestProperties;
import riconeapi.common.rest.RestQueryParameter;
import riconeapi.common.rest.RestResponse;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.*;

/*
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 1.9.0
 * @since 5/8/2020
 */
@Deprecated
@SuppressWarnings({"SpellCheckingInspection", "unused"})
public class GetLastPageObject {
    private final RestTemplate rt;
    private final Endpoint endpoint;

    /**
     * GetLastPage Object Constructor.
     * @param rt REST template.
     * @param endpoint Endpoint object.
     */
    @Deprecated
    public GetLastPageObject(RestTemplate rt, Endpoint endpoint) {
        this.rt = rt;
        this.endpoint = endpoint;
    }

    /**
     * Returns the max page value for specified service path object.
     * @param servicePath The requested service path.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Integer value.
     * @throws AuthenticationException if login does not succeed.
     * @deprecated As of version 1.9.0, use getHeaders().getNavigationLastPage().
     */
    @Deprecated
    public int getLastPage(ServicePath servicePath, int navigationPageSize) throws AuthenticationException {
        int navigationPage = 1;
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();

        try {
            switch (servicePath.name()) {
                case "GETXLEAS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXLEAS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
                    break;
                }
                case "GETXSCHOOLS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
                    break;
                }
                case "GETXCALENDARS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCALENDARS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
                    break;
                }
                case "GETXCOURSES": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCOURSES, rh, rqp);
                    rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
                    break;
                }
                case "GETXROSTERS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
                    break;
                }
                case "GETXSTAFFS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSTAFFS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
                    break;
                }
                case "GETXSTUDENTS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSTUDENTS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
                    break;
                }
                case "GETXCONTACTS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XContactCollectionType.class);
                    break;
                }
            }
            return rr.getNavigationLastPage();
        } catch (HttpClientErrorException e) {
            return 0;
        }
    }

    /**
     * Returns the max page value for specified service path object by school year.
     * @param servicePath The requested service path.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Integer value.
     * @throws AuthenticationException if login does not succeed.
     * @deprecated As of version 1.9.0, use getHeaders().getNavigationLastPage().
     */
    @Deprecated
    public int getLastPage(ServicePath servicePath, int navigationPageSize, int schoolYear) throws AuthenticationException {
        int navigationPage = 1;
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();

        try {
            switch (servicePath.name()) {
                case "GETXLEAS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXLEAS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
                    break;
                }
                case "GETXSCHOOLS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
                    break;
                }
                case "GETXCALENDARS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCALENDARS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
                    break;
                }
                case "GETXCOURSES": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCOURSES, rh, rqp);
                    rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
                    break;
                }
                case "GETXROSTERS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
                    break;
                }
                case "GETXSTAFFS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSTAFFS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
                    break;
                }
                case "GETXSTUDENTS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSTUDENTS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
                    break;
                }
                case "GETXCONTACTS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XContactCollectionType.class);
                    break;
                }
            }
            return rr.getNavigationLastPage();
        } catch (HttpClientErrorException e) {
            return 0;
        }
    }

    /**
     * Returns the max page value for specified service path object from a given point.
     * @param servicePath The requested service path.
     * @param navigationPageSize Number of resources to retrieve
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return Integer value.
     * @throws AuthenticationException if login does not succeed.
     * @deprecated As of version 1.9.0, use getHeaders().getNavigationLastPage().
     */
    @Deprecated
    public int getLastPage(ServicePath servicePath, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        int navigationPage = 1;
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);

        try {
            switch (servicePath.name()) {
                case "GETXLEAS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXLEAS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
                    break;
                }
                case "GETXSCHOOLS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
                    break;
                }
                case "GETXCALENDARS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCALENDARS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
                    break;
                }
                case "GETXCOURSES": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCOURSES, rh, rqp);
                    rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
                    break;
                }
                case "GETXROSTERS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
                    break;
                }
                case "GETXSTAFFS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSTAFFS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
                    break;
                }
                case "GETXSTUDENTS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSTUDENTS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
                    break;
                }
                case "GETXCONTACTS": {
                    RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTS, rh, rqp);
                    rr.makeAllRequest(rt, rp, XContactCollectionType.class);
                    break;
                }
            }
            return rr.getNavigationLastPage();
        } catch (HttpClientErrorException e) {
            return 0;
        }
    }

    /**
     * Returns the max page value for specified service path object.
     * @param servicePath The requested service path.
     * @param refId of xObject.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Integer value.
     * @throws AuthenticationException if login does not succeed.
     * @deprecated As of version 1.9.0, use getHeaders().getNavigationLastPage().
     */
    @Deprecated
    public int getLastPage(ServicePath servicePath, String refId, int navigationPageSize) throws AuthenticationException {
        int navigationPage = 1;
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();

        try {
            switch (servicePath.name()) {
                case "GETXLEASBYXSCHOOL":
                case "GETXLEASBYXROSTER":
                case "GETXLEASBYXSTAFF":
                case "GETXLEASBYXSTUDENT":
                case "GETXLEASBYXCONTACT": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
                    break;
                }
                case "GETXSCHOOLSBYXLEA":
                case "GETXSCHOOLSBYXCALENDAR":
                case "GETXSCHOOLSBYXCOURSE":
                case "GETXSCHOOLSBYXROSTER":
                case "GETXSCHOOLSBYXSTAFF":
                case "GETXSCHOOLSBYXSTUDENT":
                case "GETXSCHOOLSBYXCONTACT": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
                    break;
                }
                case "GETXCALENDARSBYXLEA":
                case "GETXCALENDARSBYXSCHOOL": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
                    break;
                }
                case "GETXCOURSESBYXLEA":
                case "GETXCOURSESBYXSCHOOL":
                case "GETXCOURSESBYXROSTER": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
                    break;
                }
                case "GETXROSTERSBYXLEA":
                case "GETXROSTERSBYXSCHOOL":
                case "GETXROSTERSBYXCOURSE":
                case "GETXROSTERSBYXSTAFF":
                case "GETXROSTERSBYXSTUDENT": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
                    break;
                }
                case "GETXSTAFFSBYXLEA":
                case "GETXSTAFFSBYXSCHOOL":
                case "GETXSTAFFSBYXCOURSE":
                case "GETXSTAFFSBYXROSTER":
                case "GETXSTAFFSBYXSTUDENT": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
                    break;
                }
                case "GETXSTUDENTSBYXLEA":
                case "GETXSTUDENTSBYXSCHOOL":
                case "GETXSTUDENTSBYXROSTER":
                case "GETXSTUDENTSBYXSTAFF":
                case "GETXSTUDENTSBYXCONTACT": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
                    break;
                }
                case "GETXCONTACTSBYXLEA":
                case "GETXCONTACTSBYXSCHOOL":
                case "GETXCONTACTSBYXSTUDENT": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
                    break;
                }
                case "GETXSTAFFSBYXSCHOOLAUPP": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
                    break;
                }
                case "GETXSTUDENTSBYXSCHOOLAUPP": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
                    break;
                }
            }
            return rr.getNavigationLastPage();
        } catch (HttpClientErrorException e) {
            return 0;
        }
    }

    /**
     * Returns the max page value for specified service path object by school year.
     * @param servicePath The requested service path.
     * @param refId of xObject.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Integer value.
     * @throws AuthenticationException if login does not succeed.
     * @deprecated As of version 1.9.0, use getHeaders().getNavigationLastPage().
     */
    @Deprecated
    public int getLastPage(ServicePath servicePath, String refId, int navigationPageSize, int schoolYear) throws AuthenticationException {
        int navigationPage = 1;
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();

        try {
            switch (servicePath.name()) {
                case "GETXLEASBYXSCHOOL":
                case "GETXLEASBYXROSTER":
                case "GETXLEASBYXSTAFF":
                case "GETXLEASBYXSTUDENT":
                case "GETXLEASBYXCONTACT": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
                    break;
                }
                case "GETXSCHOOLSBYXLEA":
                case "GETXSCHOOLSBYXCALENDAR":
                case "GETXSCHOOLSBYXCOURSE":
                case "GETXSCHOOLSBYXROSTER":
                case "GETXSCHOOLSBYXSTAFF":
                case "GETXSCHOOLSBYXSTUDENT":
                case "GETXSCHOOLSBYXCONTACT": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
                    break;
                }
                case "GETXCALENDARSBYXLEA":
                case "GETXCALENDARSBYXSCHOOL": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
                    break;
                }
                case "GETXCOURSESBYXLEA":
                case "GETXCOURSESBYXSCHOOL":
                case "GETXCOURSESBYXROSTER": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
                    break;
                }
                case "GETXROSTERSBYXLEA":
                case "GETXROSTERSBYXSCHOOL":
                case "GETXROSTERSBYXCOURSE":
                case "GETXROSTERSBYXSTAFF":
                case "GETXROSTERSBYXSTUDENT": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
                    break;
                }
                case "GETXSTAFFSBYXLEA":
                case "GETXSTAFFSBYXSCHOOL":
                case "GETXSTAFFSBYXCOURSE":
                case "GETXSTAFFSBYXROSTER":
                case "GETXSTAFFSBYXSTUDENT": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
                    break;
                }
                case "GETXSTUDENTSBYXLEA":
                case "GETXSTUDENTSBYXSCHOOL":
                case "GETXSTUDENTSBYXROSTER":
                case "GETXSTUDENTSBYXSTAFF":
                case "GETXSTUDENTSBYXCONTACT": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
                    break;
                }
                case "GETXCONTACTSBYXLEA":
                case "GETXCONTACTSBYXSCHOOL":
                case "GETXCONTACTSBYXSTUDENT": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
                    break;
                }
                case "GETXSTAFFSBYXSCHOOLAUPP": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
                    break;
                }
                case "GETXSTUDENTSBYXSCHOOLAUPP": {
                    RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
                    rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
                    break;
                }
            }
            return rr.getNavigationLastPage();
        } catch (HttpClientErrorException e) {
            return 0;
        }
    }
}
