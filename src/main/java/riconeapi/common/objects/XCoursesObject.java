package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XCourseCollectionType;
import riconeapi.models.xpress.XCourseType;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.8
 * @since 12/17/2018
 */
@SuppressWarnings("unused")
public class XCoursesObject {
    private final RestTemplate rt;
    private final String baseApiUrl;

    /**
     * XCourses Object Constructor.
     * @param rt REST template.
     * @param baseApiUrl Base API url.
     */
    public XCoursesObject(RestTemplate rt, String baseApiUrl) {
        this.rt = rt;
        this.baseApiUrl = baseApiUrl;
    }

    /**
     * Request all xCourses.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCourses() throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSES, rh, rqp);
        return rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request all xCourses by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCourses(int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSES, rh, rqp);
        return rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request all xCourses with paging
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSES, rh, rqp);
        return rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request all xCourses with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSES, rh, rqp);
        return rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request all xCourse value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCourses(String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSES, rh, rqp);
        return rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request all xCourse value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSES, rh, rqp);
        return rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request single xCourse by refId.
     * @param refId of xCourse.
     * @return Single xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XCourseType> getXCourse(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSEBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XCourseType.class);
    }

    /**
     * Request single xCourse by refId by school year.
     * @param refId of xCourse.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XCourseType> getXCourse(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSEBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XCourseType.class);
    }

    /**
     * Request xCourses associated to a specific xLea by refId.
     * @param refId of xLea.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request xCourses associated to a specific xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request xCourses associated to a specific xLea by refId wtih paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request xCourses associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request all xCourses value changes from a given point by a specific xLea.
     * @param refId of xLea.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request all xCourses value changes from a given point by a specific xLea with paging.
     * @param refId of xLea.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request xCourses associated to a specific xSchool by refId.
     * @param refId of xSchool.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request xCourses associated to a specific xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request xCourses associated to a specific xSchool by refId with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request xCourses associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request all xCourses value changes from a given point by a specific xSchool.
     * @param refId of xSchool.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request all xCourses value changes from a given point by a specific xSchool with paging.
     * @param refId of xSchool.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request xCourses associated to a specific xRoster by refId.
     * @param refId of xRoster.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request xCourses associated to a specific xRoster by refId by school year.
     * @param refId of xRoster.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request xCourses associated to a specific xRoster by refId with paging.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request xCourses associated to a specific xRoster by refId with paging by school year.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request all xCourses value changes from a given point by a specific xRoster.
     * @param refId of xRoster.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }

    /**
     * Request all xCourses value changes from a given point by a specific xRoster with paging.
     * @param refId of xRoster.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCourses type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
    }
}
