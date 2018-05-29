package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XStaffCollectionType;
import riconeapi.models.xpress.XStaffType;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/20/2018
 */
@SuppressWarnings("unused")
public class XStaffsObject {
    private final RestTemplate rt;
    private final String baseApiUrl;

    /**
     * XStaffs Object Constructor.
     * @param rt REST template.
     * @param baseApiUrl Base API url.
     */
    public XStaffsObject(RestTemplate rt, String baseApiUrl) {
        this.rt = rt;
        this.baseApiUrl = baseApiUrl;
    }

    /**
     * Request all xStaffs.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffs() throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request all xStaffs by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffs(int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request all xStaffs with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request all xStaffs with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type..
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request all xStaffs value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffs(String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request all xStaffs value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request single xStaff by refId.
     * @param refId of xStaff.
     * @return Single xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XStaffType> getXStaff(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XStaffType.class);
    }

    /**
     * Request single xStaff by refId by school year.
     * @param refId of xStaff.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XStaffType> getXStaff(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XStaffType.class);
    }

    /**
     * Request xStaffs associated to a specific xLea by refId.
     * @param refId of xStaff.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xLea by refId by school year.
     * @param refId of xStaff.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xLea by refId with paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xSchool by refId.
     * @param refId of xSchool.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xSchool by refId with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xCourse by refId.
     * @param refId of xCourse.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xCourse by refId by school year.
     * @param refId of xCourse.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xCourse by refId with paging.
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xCourse by refId with paging by school year.
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xRoster by refId.
     * @param refId of xRoster.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xRoster by refId by school year.
     * @param refId of xRoster.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xRoster by refId with paging.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xRoster by refId with paging by school year.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xStudent by refId.
     * @param refId of xStudent.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xStudent by refId by school year.
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xStudent by refId with paging.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }

    /**
     * Request xStaffs associated to a specific xStudent by refId with paging by school year.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStaffs type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
    }
}
