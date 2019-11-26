package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XEmploymentCollectionType;
import riconeapi.models.xpress.XEmploymentType;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.9.0
 * @since 11/7/2019
 */
@SuppressWarnings("unused")
public class XEmploymentsObject {
    private final RestTemplate rt;
    private final String baseApiUrl;

    /**
     * XStaffs Object Constructor.
     *
     * @param rt         REST template.
     * @param baseApiUrl Base API url.
     */
    public XEmploymentsObject(RestTemplate rt, String baseApiUrl) {
        this.rt = rt;
        this.baseApiUrl = baseApiUrl;
    }

    /**
     * Request all xEmployments.
     *
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmployments() throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request all xEmployments by school year.
     *
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmployments(int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request all xEmployments with paging.
     *
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmployments(int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request all xEmployments with paging by school year.
     *
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear         The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmployments(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request all xEmployments value changes from a given point.
     *
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmployments(String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request all xEmployments value changes from a given point with paging.
     *
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmployments(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request single xEmployment by refId.
     *
     * @param refId of xEmployment.
     * @return Single xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XEmploymentType> getXEmployment(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XEmploymentType.class);
    }

    /**
     * Request single xEmployment by refId by school year.
     *
     * @param refId      of xEmployment.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XEmploymentType> getXEmployment(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XEmploymentType.class);
    }

    /**
     * Request xEmployments associated to a specific xLea by refId.
     *
     * @param refId of xLea.
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmploymentsByXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request xEmployments associated to a specific xLea by refId by school year.
     *
     * @param refId      of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmploymentsByXLea(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request xEmployments associated to a specific xLea by refId with paging.
     *
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmploymentsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request xEmployments associated to a specific xLea by refId with paging by school year.
     *
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear         The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmploymentsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request all xEmployments value changes from a given point by a specific xLea.
     *
     * @param refId        of xLea.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmploymentsByXLea(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request all xEmployments value changes from a given point by a specific xLea with paging.
     *
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmploymentsByXLea(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request xEmployments associated to a specific xSchool by refId.
     *
     * @param refId of xSchool.
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmploymentsByXSchool(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request xEmployments associated to a specific xSchool by refId by school year.
     *
     * @param refId      of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmploymentsByXSchool(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request xEmployments associated to a specific xSchool by refId with paging.
     *
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmploymentsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request xEmployments associated to a specific xSchool by refId with paging by school year.
     *
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear         The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmploymentsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request all xEmployments value changes from a given point by a specific xSchool.
     *
     * @param refId        of xSchool.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmploymentsByXSchool(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XEmploymentCollectionType.class);
    }

    /**
     * Request all xEmployments value changes from a given point by a specific xSchool with paging.
     *
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xEmployments type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XEmploymentType> getXEmploymentsByXSchool(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXEMPLOYMENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XEmploymentCollectionType.class);
    }
}
