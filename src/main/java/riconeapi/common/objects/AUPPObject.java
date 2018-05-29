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

    /**
     * AUPP Object Constructor.
     * @param rt REST template.
     * @param baseApiUrl Base API url.
     */
    public AUPPObject(RestTemplate rt, String baseApiUrl) {
        this.rt = rt;
        this.baseApiUrl = baseApiUrl;
    }

    /**
     * Request creation of xStaffs usernames and passwords by xSchool.
     * @param refId of xSchool.
     * @return List of xStaffs type.
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
     * Request deletion of generated xStaffs passwords by xSchool.
     * @param refId of xSchool.
     * @return List of xStaffs type.
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
     * Request generated xStaffs usernames and passwords by xSchool.
     * @param refId of xSchool.
     * @return List of xStaffs type.
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
     * Request generated xStaffs usernames and passwords by xSchool with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStaffs type.
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
     * Request creation of xStudents usernames and passwords by xSchool.
     * @param refId of xSchool.
     * @return List of xStudents type.
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
     * Request deletion of generated xStudents passwords by xSchool.
     * @param refId of xSchool.
     * @return List of xStudents type.
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
     * Request generated xStudents usernames and passwords by xSchool.
     * @param refId of xSchool.
     * @return List of xStudents type.
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
     * Request generated xStudents usernames and passwords by xSchool.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
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
//     * Request creation of xContacts usernames and passwords by xSchool.
//     * @param refId of xSchool.
//     * @return List of xContacts type.
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
//     * Request deletion of generated xContacts passwords by xSchool.
//     * @param refId of xSchool.
//     * @return List of xContacts type.
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
//     * Request generated xContacts usernames and passwords by xSchool.
//     * @param refId of xSchool.
//     * @return List of xContacts type.
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
//     * Request generated xContacts usernames and passwords by xSchool with paging.
//     * @param refId              of xSchool.
//     * @param navigationPage     Page to retrieve.
//     * @param navigationPageSize Number of resources to retrieve.
//     * @return List of xContacts type.
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