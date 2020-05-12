package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.authentication.Endpoint;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XSchoolCollectionType;
import riconeapi.models.xpress.XSchoolType;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.9.0
 * @since 5/8/2020
 */
@SuppressWarnings("unused")
public class XSchoolsObject {
    private final RestTemplate rt;
    private final Endpoint endpoint;

    /**
     * XSchools Object Constructor.
     * @param rt REST template.
     * @param endpoint Base API url.
     */
    public XSchoolsObject(RestTemplate rt, Endpoint endpoint) {
        this.rt = rt;
        this.endpoint = endpoint;
    }

    /**
     * Request all xSchools.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools() throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools(int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
    }
    /**
     * Request all xSchools with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools(String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request single xSchool by refId.
     * @param refId of xSchool.
     * @return Single xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XSchoolType> getXSchool(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XSchoolType.class);
    }

    /**
     * Request single xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XSchoolType> getXSchool(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XSchoolType.class);
    }

    /**
     * Request single xSchool by BEDS code or Local Id.
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @return Single xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XSchoolType> getXSchool(String idType, String id) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(idType, id);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLBYID, rh, rqp);
        return rr.makeSingleRequestById(rt, rp, XSchoolType.class);
    }

    /**
     * Request single xSchool by BEDS code or Local Id by school year.
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XSchoolType> getXSchool(String idType, String id, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(idType, id, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLBYID, rh, rqp);
        return rr.makeSingleRequestById(rt, rp, XSchoolType.class);
    }

    /**
     * Request xSchools associated to a specific xLea by refId.
     * @param refId of xLea.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xLea by refId with paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xLea.
     * @param refId of xLea.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xLea with paging.
     * @param refId of xLea.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xCalendar by refId.
     * @param refId of xCalendar.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xCalendar by refId by school year.
     * @param refId of xCalendar.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xCalendar by refId with paging.
     * @param refId              of xCalendar.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestQueryParameter rqp = new RestQueryParameter();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xCalendar by refId with paging by school year.
     * @param refId              of xCalendar.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestQueryParameter rqp = new RestQueryParameter();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xCalendar.
     * @param refId of xCalendar.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xCalendar with paging.
     * @param refId of xCalendar.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xCourse by refId.
     * @param refId of xCourse.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xCourse by refId by school year.
     * @param refId of xCourse.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xCourse by refId with paging.
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xCourse by refId with paging by school year.
     * @param refId              of xCourse.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xCourse.
     * @param refId of xCourse.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xCourse with paging.
     * @param refId of xCourse.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCOURSE, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xRoster by refId.
     * @param refId of xRoster.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xRoster by refId by school year.
     * @param refId of xRoster.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xRoster by refId with paging.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xRoster by refId with paging by school year.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xRoster.
     * @param refId of xRoster.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xRoster with paging.
     * @param refId of xRoster.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xStaff by refId.
     * @param refId of xStaff.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xStaff by refId by school year.
     * @param refId of xStaff.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xStaff by refId with paging.
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xStaff by refId with paging by school year.
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xStaff.
     * @param refId of xStaff.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xStaff with paging.
     * @param refId of xStaff.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xStudent by refId.
     * @param refId of xStudent.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xStudent by refId by school year.
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xStudent by refId with paging.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xStudent by refId with paging by school year.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xStudent.
     * @param refId of xStudent.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xStudent with paging.
     * @param refId of xStudent.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xContact by refId.
     * @param refId of xContact.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xContact by refId by school year.
     * @param refId of xContact.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xContact by refId with paging.
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request xSchools associated to a specific xContact by refId with paging by school year.
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xContact.
     * @param refId of xContact.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }

    /**
     * Request all xSchools value changes from a given point by a specific xContact with paging.
     * @param refId of xContact.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xSchools type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXSCHOOLSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
    }
}
