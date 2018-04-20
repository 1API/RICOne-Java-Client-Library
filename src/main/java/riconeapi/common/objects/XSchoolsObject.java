package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XSchoolCollectionType;
import riconeapi.models.xpress.XSchoolType;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/20/2018
 */
@SuppressWarnings("unused")
public class XSchoolsObject {
    private final RestTemplate rt;
    private final String baseApiUrl;

    public XSchoolsObject(RestTemplate rt, String baseApiUrl) {
        this.rt = rt;
        this.baseApiUrl = baseApiUrl;
    }

    /**
     * @return All Schools.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools() throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return All Schools.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools(int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return All Schools with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
    }
    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return All Schools with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return All School value changes from a given point.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools(String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return All School value changes from a given point with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xSchool.
     * @return Single School by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XSchoolType> getXSchool(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XSchoolType.class);
    }

    /**
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single School by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XSchoolType> getXSchool(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XSchoolType.class);
    }

    /**
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @return Single School by BEDS code or Local Id.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XSchoolType> getXSchool(String idType, String id) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(idType, id);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLBYID, rh, rqp);
        return rr.makeSingleRequestById(rt, rp, XSchoolType.class);
    }

    /**
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single School by BEDS code or Local Id.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XSchoolType> getXSchool(String idType, String id, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(idType, id, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLBYID, rh, rqp);
        return rr.makeSingleRequestById(rt, rp, XSchoolType.class);
    }

    /**
     * @param refId of xLea.
     * @return Schools associated to a specific Lea by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Lea by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Schools associated to a specific Lea by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Lea by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xCalendar.
     * @return Schools associated to a specific Calendar by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xCalendar.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Calendar by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xCalendar.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Schools associated to a specific Calendar by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestQueryParameter rqp = new RestQueryParameter();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xCalendar.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Calendar by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestQueryParameter rqp = new RestQueryParameter();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xCourse.
     * @return Schools associated to a specific Course by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xCourse.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Course by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Schools associated to a specific Course by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Course by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xRoster.
     * @return Schools associated to a specific Roster by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xRoster.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Roster by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Schools associated to a specific Roster by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Roster by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xStaff.
     * @return Schools associated to a specific Staff by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xStaff.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Staff by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Schools associated to a specific Staff by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Staff by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xStudent.
     * @return Schools associated to a specific Student by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Student by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Schools associated to a specific Student by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Student by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xContact.
     * @return Schools associated to a specific Contact by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId of xContact.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Contact by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Schools associated to a specific Contact by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Schools associated to a specific Contact by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }
}
