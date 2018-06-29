package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XStudentCollectionType;
import riconeapi.models.xpress.XStudentType;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/18/2018
 */
@SuppressWarnings("unused")
public class XStudentsObject {
    private final RestTemplate rt;
    private final String baseApiUrl;

    /**
     * XStudents Object Constructor.
     * @param rt REST template.
     * @param baseApiUrl Base API url.
     */
    public XStudentsObject(RestTemplate rt, String baseApiUrl) {
        this.rt = rt;
        this.baseApiUrl = baseApiUrl;
    }

    /**
     * Request all xStudents.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudents() throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request all xStudents by school year.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudents(int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request all xStudents with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request all xStudents with paging by school year.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request all xStudents value changes from a given point.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudents(String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request all xStudents value changes from a given point with paging.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve
     * @param opaqueMarker       Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTS, rh, rqp);
        return rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request single xStudent by refId.
     * @param refId of xStudent.
     * @return Single xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XStudentType> getXStudent(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XStudentType.class);
    }

    /**
     * Request single xStudent by refId by school year.
     * @param refId of xStudent.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return Single xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseSingle<XStudentType> getXStudent(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTBYREFID, refId, rh, rqp);
        return rr.makeSingleRequest(rt, rp, XStudentType.class);
    }

    /**
     * Request xStudents associated to a specific xLea by refId.
     * @param refId of xLea.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xLea by refId by school year.
     * @param refId of xLea.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xLea by refId with paging.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xLea by refId with paging by school year.
     * @param refId              of xLea.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXLEA, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xSchool by refId.
     * @param refId of xSchool.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xSchool by refId by school year.
     * @param refId of xSchool.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xSchool by refId with paging.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xSchool by refId with paging by school year.
     * @param refId              of xSchool.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xRoster by refId.
     * @param refId of xRoster.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xRoster by refId by school year.
     * @param refId of xRoster.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xRoster by refId with paging.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xRoster by refId with paging by school year.
     * @param refId              of xRoster.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXROSTER, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xStaff by refId.
     * @param refId of xStaff.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xStaff by refId by school year.
     * @param refId of xStaff.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xStaff by refId with paging.
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xStaff by refId with paging by school year.
     * @param refId              of xStaff.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSTAFF, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xContact by refId.
     * @param refId of xContact.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXContact(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xContact by refId by school year.
     * @param refId of xContact.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xContact by refId with paging.
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }

    /**
     * Request xStudents associated to a specific xContact by refId with paging by school year.
     * @param refId              of xContact.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @return List of xStudents type.
     * @throws AuthenticationException if login does not succeed.
     */
    public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int navigationPage, int navigationPageSize, int schoolYear) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXCONTACT, refId, rh, rqp);
        return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
    }
}
