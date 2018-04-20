package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XContactCollectionType;
import riconeapi.models.xpress.XContactType;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/20/2018
 */
@SuppressWarnings("unused")
public class XContactsObject {
    private final RestTemplate rt;
    private final String baseApiUrl;

    public XContactsObject(RestTemplate rt, String baseApiUrl) {
        this.rt = rt;
        this.baseApiUrl = baseApiUrl;
    }

    /**
     * @return All Contacts.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts() throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return All Contacts.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts(int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return All Contacts with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return All Contacts with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return All Contact value changes from a given point.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts(String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return All Contact value changes from a given point with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param refId of xContact.
     * @return Single Contact by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XContactType> getXContact(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XContactType.class);
    }

    /**
     * @param refId of xContact.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single Contact by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XContactType> getXContact(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XContactType.class);
    }

    /**
     * @param refId of xLea.
     * @return Contacts associated to a specific Lea by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Contacts associated to a specific Lea by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXLea(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Contacts associated to a specific Lea by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }
    /**
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Contacts associated to a specific Lea by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }


    /**
     * @param refId of xSchool.
     * @return Contacts associated to a specific School by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXSchool(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Contacts associated to a specific School by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Contacts associated to a specific School by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Contacts associated to a specific School by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param refId of xStudent.
     * @return Contacts associated to a specific Student by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXStudent(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }
    /**
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Contacts associated to a specific Student by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Contacts associated to a specific Student by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }

    /**
     * @param refId              of xStudent.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Contacts associated to a specific Student by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
    }
}
