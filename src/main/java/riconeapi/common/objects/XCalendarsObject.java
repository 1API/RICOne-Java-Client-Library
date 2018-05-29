package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XCalendarCollectionType;
import riconeapi.models.xpress.XCalendarType;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/18/2018
 */
@SuppressWarnings("unused")
public class XCalendarsObject {
    private final RestTemplate rt;
    private final String baseApiUrl;

    /**
     * XCalendars Object Constructor.
     * @param rt Rest template.
     * @param baseApiUrl Base API url.
     */
    public XCalendarsObject(RestTemplate rt, String baseApiUrl) {
        this.rt = rt;
        this.baseApiUrl = baseApiUrl;
    }

    /**
     * Request all xCalendars.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendars() throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request all xCalendars by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendars(int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request all xCalendars with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request all xCalendars with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request all xCalendar value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendars(String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request all xCalendar value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request single xCalendar by refId.
     * @param refId of xCalendar.
     * @return Single xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XCalendarType> getXCalendar(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XCalendarType.class);
    }

    /**
     * Request single xCalendar by refId by school year.
     * @param refId of xCalendar.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XCalendarType> getXCalendar(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XCalendarType.class);
    }

    /**
     * Request xCalendars associated to a specific xLea by refId.
     * @param refId of xLea.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request xCalendars associated to a specific xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request xCalendars associated to a specific xLea by refId with paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request xCalendars associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request xCalendars associated to a specific xSchool by refId.
     * @param refId of xSchool.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request xCalendars associated to a specific xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request xCalendars associated to a specific xSchool by refId with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
    }

    /**
     * Request xCalendars associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xCalendars type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
    }
}
