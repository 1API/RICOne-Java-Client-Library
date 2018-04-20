package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XRosterCollectionType;
import riconeapi.models.xpress.XRosterType;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/18/2018
 */
@SuppressWarnings("unused")
public class XRostersObject {
    private final RestTemplate rt;
    private final String baseApiUrl;

    public XRostersObject(RestTemplate rt, String baseApiUrl) {
        this.rt = rt;
        this.baseApiUrl = baseApiUrl;
    }

    /**
     * @return All Rosters.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters() throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return All Rosters.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters(int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return All Rosters with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return All Rosters with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return All Roster value changes from a given point.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters(String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return All Roster value changes from a given point with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId of xRoster.
     * @return Single Roster by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XRosterType> getXRoster(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XRosterType.class);
    }

    /**
     * @param refId of xRoster.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single Roster by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XRosterType> getXRoster(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XRosterType.class);
    }

    /**
     * @param refId of xLea.
     * @return Rosters associated to a specific Lea by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Rosters associated to a specific Lea by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Rosters associated to a specific Lea by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Rosters associated to a specific Lea by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId of xSchool.
     * @return Rosters associated to a specific School by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXSchool(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Rosters associated to a specific School by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Rosters associated to a specific School by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Rosters associated to a specific School by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId of xCourse.
     * @return Rosters associated to a specific Course by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXCourse(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId of xCourse.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Rosters associated to a specific Course by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Rosters associated to a specific Course by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }
    /**
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Rosters associated to a specific Course by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId of xStaff.
     * @return Rosters associated to a specific Staff by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStaff(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId of xStaff.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Rosters associated to a specific Staff by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Rosters associated to a specific Staff by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Rosters associated to a specific Staff by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId of xStudent.
     * @return Rosters associated to a specific Student by refId.
     * @throws AuthenticationException if login does not succeed. if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStudent(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Rosters associated to a specific Student by refId.
     * @throws AuthenticationException if login does not succeed. if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }

    /**
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Rosters associated to a specific Student by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }
    /**
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Rosters associated to a specific Student by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
    }
}
