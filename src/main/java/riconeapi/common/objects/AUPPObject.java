package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.*;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/20/2018
 */
@SuppressWarnings("unused")
public class AUPPObject {
    private final RestTemplate rt;
    private final String baseApiUrl;

    public AUPPObject(RestTemplate rt, String baseApiUrl) {
        this.rt = rt;
        this.baseApiUrl = baseApiUrl;
    }

    /**
     * @param refId of xSchool.
     * @return Create staff username and passwords by school.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> createXStaffUsers(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.CREATE);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByAupp(rt, rp, XStaffCollectionType.class);
    }

    /**
     * @param refId of xSchool.
     * @return Delete generated staff passwords by school.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> deleteXStaffUsers(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.DELETE);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByAupp(rt, rp, XStaffCollectionType.class);
    }

    /**
     * @param refId of xSchool.
     * @return Generated staff username and passwords by school.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffUsers(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.GET);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByAupp(rt, rp, XStaffCollectionType.class);
    }

    /**
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Return generated staff username and passwords by school with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStaffType> getXStaffUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.GET);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByAupp(rt, rp, XStaffCollectionType.class);
    }

    /**
     * @param refId of xSchool.
     * @return Create student username and passwords by school.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> createXStudentUsers(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.CREATE);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByAupp(rt, rp, XStudentCollectionType.class);
    }

    /**
     * @param refId of xSchool.
     * @return Delete generated student passwords by school.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> deleteXStudentUsers(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.DELETE);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByAupp(rt, rp, XStudentCollectionType.class);
    }

    /**
     * @param refId of xSchool.
     * @return Generated student username and passwords by school.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentUsers(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.GET);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByAupp(rt, rp, XStudentCollectionType.class);
    }

    /**
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return Return generated student username and passwords by school with paging.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.GET);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByAupp(rt, rp, XStudentCollectionType.class);
    }

//    /**
//     * @param refId of xSchool.
//     * @return Create contact username and passwords by school.
//     * @throws AuthenticationException if login does not succeed.
//     */
//    private ResponseMulti<XContactType> createXContactUsers(String refId) throws AuthenticationException {
//        RestResponse rr = new RestResponse();
//        RestHeader rh = new RestHeader();
//        RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.CREATE);
//        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
//        return rr.makeAllRequestByAupp(rt, rp, XContactCollectionType.class);
//    }
//
//    /**
//     * @param refId of xSchool.
//     * @return Delete generated contact passwords by school.
//     * @throws AuthenticationException if login does not succeed.
//     */
//    private ResponseMulti<XContactType> deleteXContactUsers(String refId) throws AuthenticationException {
//        RestResponse rr = new RestResponse();
//        RestHeader rh = new RestHeader();
//        RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.DELETE);
//        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
//        return rr.makeAllRequestByAupp(rt, rp, XContactCollectionType.class);
//    }
//
//    /**
//     * @param refId of xSchool.
//     * @return Generated contact username and passwords by school.
//     * @throws AuthenticationException if login does not succeed.
//     */
//    private ResponseMulti<XContactType> getXContactUsers(String refId) throws AuthenticationException {
//        RestResponse rr = new RestResponse();
//        RestHeader rh = new RestHeader();
//        RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.GET);
//        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
//        return rr.makeAllRequestByAupp(rt, rp, XContactCollectionType.class);
//    }
//
//    /**
//     * @param refId              of xSchool.
//     * @param navigationPage     Page to retrieve.
//     * @param navigationPageSize Number of resources to retrieve.
//     * @return Generated contact username and passwords by school with paging.
//     * @throws AuthenticationException if login does not succeed.
//     */
//    private ResponseMulti<XContactType> getXContactUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
//        RestResponse rr = new RestResponse();
//        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
//        RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.GET);
//        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
//        return rr.makeAllRequestByAupp(rt, rp, XContactCollectionType.class);
//    }
}