package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.authentication.Endpoint;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XRosterCollectionType;
import riconeapi.models.xpress.XRosterType;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.9.0
 * @since 5/8/2020
 */
@SuppressWarnings("unused")
public class XRostersObject {
    private final RestTemplate rt;
    private final Endpoint endpoint;

    /**
     * XRosters Object Constructor.
     * @param rt REST template.
     * @param endpoint Base API url.
     */
    public XRostersObject(RestTemplate rt, Endpoint endpoint) {
        this.rt = rt;
        this.endpoint = endpoint;
    }

    /**
     * Request all xRosters.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters() throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters(int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters(String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request single xRoster by refId.
     * @param refId of xRoster.
     * @return Single xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XRosterType> getXRoster(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XRosterType.class);
    }

    /**
     * Request single xRoster by refId by school year.
     * @param refId of xRoster.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XRosterType> getXRoster(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XRosterType.class);
    }

    /**
     * Request xRosters associated to a specific xLea by refId.
     * @param refId of xLea.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xLea by refId with paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters value changes from a given point by a specific xLea.
     * @param refId of xLea.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXLea(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters value changes from a given point by a specific xLea with paging.
     * @param refId of xLea.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xSchool by refId.
     * @param refId of xSchool.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXSchool(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xSchool by refId with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters value changes from a given point by a specific xSchool.
     * @param refId of xSchool.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters value changes from a given point by a specific xSchool with paging.
     * @param refId of xSchool.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xCourse by refId.
     * @param refId of xCourse.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXCourse(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xCourse by refId by school year.
     * @param refId of xCourse.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xCourse by refId with paging.
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xCourse by refId with paging by school year.
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters value changes from a given point by a specific xCourse.
     * @param refId of xCourse.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters value changes from a given point by a specific xCourse with paging.
     * @param refId of xCourse.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xStaff by refId.
     * @param refId of xStaff.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStaff(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xStaff by refId by school year.
     * @param refId of xStaff.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xStaff by refId with paging.
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xStaff by refId with paging by school year.
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters value changes from a given point by a specific xStaff.
     * @param refId of xStaff.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters value changes from a given point by a specific xStaff with paging.
     * @param refId of xStaff.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xStudent by refId.
     * @param refId of xStudent.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed. if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStudent(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xStudent by refId by school year.
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed. if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xStudent by refId wtih paging.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request xRosters associated to a specific xStudent by refId with paging by school year.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters value changes from a given point by a specific xStudent.
     * @param refId of xStudent.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * Request all xRosters value changes from a given point by a specific xStudent with paging.
     * @param refId of xStudent.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xRosters type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXROSTERSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }
}
