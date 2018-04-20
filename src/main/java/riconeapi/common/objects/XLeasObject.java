package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XLeaCollectionType;
import riconeapi.models.xpress.XLeaType;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/20/2018
 */
@SuppressWarnings("unused")
public class XLeasObject {
    private final RestTemplate rt;
    private final String baseApiUrl;

    public XLeasObject(RestTemplate rt, String baseApiUrl) {
        this.rt = rt;
        this.baseApiUrl = baseApiUrl;
    }

    /**
     * @return All Leas.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeas() throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEAS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return All Leas.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeas(int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEAS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return All Leas with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEAS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return All Leas with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEAS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return All Lea value changes from a given point.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeas(String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEAS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return All Lea value changes from a given point with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEAS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId of xLea.
     * @return Single Lea by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XLeaType> getXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEABYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XLeaType.class);
    }

    /**
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single Lea by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XLeaType> getXLea(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEABYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XLeaType.class);
    }

    /**
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @return Single Lea by BEDS code or Local Id.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XLeaType> getXLea(String idType, String id) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(idType, id);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEABYID, rh, rqp);
        return rr.makeSingleRequestById(rt, rp, XLeaType.class);
    }

    /**
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single Lea by BEDS code or Local Id.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XLeaType> getXLea(String idType, String id, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(idType, id, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEABYID, rh, rqp);
        return rr.makeSingleRequestById(rt, rp, XLeaType.class);
    }

    /**
     * @param refId of xSchools.
     * @return Leas associated to a specific School by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXSchool(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId of xSchools.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Leas associated to a specific School by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId              of xSchools.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Leas associated to a specific School by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId              of xSchools.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Leas associated to a specific School by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId of xRosters.
     * @return Leas associated to a specific Roster by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXRoster(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId of xRosters.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Leas associated to a specific Roster by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Leas associated to a specific Roster by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Leas associated to a specific Roster by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId of xStaffs.
     * @return Leas associated to a specific Staff by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXStaff(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId of xStaffs.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Leas associated to a specific Staff by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId              of xStaffs.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Leas associated to a specific Staff by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId              of xStaffs.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Leas associated to a specific Staff by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId of xStudents.
     * @return Leas associated to a specific Student by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXStudent(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId of xStudents.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Leas associated to a specific Student by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId              of xStudents.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Leas associated to a specific Student by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId              of xStudents.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Leas associated to a specific Student by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSTUDENT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId of xContact.
     * @return Leas associated to a specific Contact by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXContact(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId of xContact.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Leas associated to a specific Contact by refId.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Leas associated to a specific Contact by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }

    /**
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Leas associated to a specific Contact by refId with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
    }
}
