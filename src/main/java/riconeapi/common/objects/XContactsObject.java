package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.authentication.Endpoint;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XContactCollectionType;
import riconeapi.models.xpress.XContactType;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.9.0
 * @since 5/8/2020
 */
@SuppressWarnings("unused")
public class XContactsObject {
    private final RestTemplate rt;
    private final Endpoint endpoint;

    /**
     * XContacts Object Constructor.
     * @param rt REST template.
     * @param endpoint Endpoint Object.
     */
    public XContactsObject(RestTemplate rt, Endpoint endpoint) {
        this.rt = rt;
        this.endpoint = endpoint;
    }

    /**
     * Request all xContacts
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts() throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request all xContacts by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts(int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request all xContacts with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request all xContacts with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request all xContacts value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts(String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request all xContacts value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request single xContact by refId.
     * @param refId of xContact.
     * @return Single xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XContactType> getXContact(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XContactType.class);
    }

    /**
     * Request single xContact by refId by school year.
     * @param refId of xContact.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XContactType> getXContact(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XContactType.class);
    }

    /**
     * Request xContacts associated to a specific xLea by refId.
     * @param refId of xLea.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request xContacts associated to a specific xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXLea(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request xContacts associated to a specific xLea by refId with paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request xContacts associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request all xContacts value changes from a given point by a specific xLea.
     * @param refId of xLea.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXLea(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request all xContacts value changes from a given point by a specific xLea with paging.
     * @param refId of xLea.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request xContacts associated to a specific xSchool by refId.
     * @param refId of xSchool.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXSchool(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request xContacts associated to a specific xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request xContacts associated to a specific xSchool by refId with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request xContacts associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request all xContacts value changes from a given point by a specific xSchool.
     * @param refId of xSchool.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXSchool(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request all xContacts value changes from a given point by a specific xSchool with paging.
     * @param refId of xSchool.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request xContacts associated to a specific xStudent by refId.
     * @param refId of xStudent.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXStudent(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request xContacts associated to a specific xStudent by refId by school year.
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request xContacts associated to a specific xStudent by refId with paging.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request xContacts associated to a specific xStudent by refId with paging by school year.
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request all xContacts value changes from a given point by a specific xStudent.
     * @param refId of xStudent.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXStudent(String refId, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * Request all xContacts value changes from a given point by a specific xStudent with paging.
     * @param refId of xStudent.
     * @param navigationPage Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xContacts type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, ServicePath.GETXCONTACTSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }
}
