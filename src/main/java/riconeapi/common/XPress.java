package riconeapi.common;

import org.springframework.web.client.RestTemplate;

//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;

import riconeapi.common.paths.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.*;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.7
 * @since       Feb 14, 2018
 *
 * Static class allowing access to xPress data model objects
 */
public class XPress {
	private RestTemplate rt;
	private String baseApiUrl;
	private XLeasPath xLeasPath;
	private XSchoolsPath xSchoolsPath;
	private XCalendarsPath xCalendarsPath;
	private XCoursesPath xCoursesPath;
	private XRostersPath xRostersPath;
	private XStaffsPath xStaffsPath;
	private XStudentsPath xStudentsPath;
	private XContactsPath xContactsPath;
	private GetLastPagePath getLastPagePath;
	private AUPP aupp;

	public XPress(String baseApiUrl) {
		this.baseApiUrl = baseApiUrl;
		this.rt = new RestTemplate();

		xLeasPath = new XLeasPath(rt, baseApiUrl);
		xSchoolsPath = new XSchoolsPath(rt, baseApiUrl);
		xCalendarsPath = new XCalendarsPath(rt, baseApiUrl);
		xCoursesPath = new XCoursesPath(rt, baseApiUrl);
		xRostersPath = new XRostersPath(rt, baseApiUrl);
		xStaffsPath = new XStaffsPath(rt, baseApiUrl);
		xStudentsPath = new XStudentsPath(rt, baseApiUrl);
		xContactsPath = new XContactsPath(rt, baseApiUrl);
		getLastPagePath = new GetLastPagePath(rt, baseApiUrl);
		aupp = new AUPP(rt, baseApiUrl);
	}

	/* xLeas */
	public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEAS, rh);
		return rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
	}

	// TODO NEW
	public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEAS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
	}

	public ResponseMulti<XLeaType> getXLeas(String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEAS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
	}

	public ResponseMulti<XLeaType> getXLeas() throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEAS, rh);
		return rr.makeAllRequest(rt, rp, XLeaCollectionType.class);
	}

	// TODO removed getXLea(String refId, int navigationPage, int navigationPageSize)

	public ResponseSingle<XLeaType> getXLea(String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEABYREFID, refId, rh);
        return rr.makeSingleRequest(rt, rp, XLeaType.class);
	}

	public ResponseSingle<XLeaType> getXLea(String idType, String id) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(idType, id);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEABYID, rh);
		return rr.makeSingleRequestById(rt, rp, XLeaType.class);
	}

	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
	}

	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
	}

	// TODO removed getXLeasByXSchool(String idType, String id)

	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXROSTER, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
	}

	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXROSTER, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
	}

	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSTAFF, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
	}

	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSTAFF, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
	}

	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSTUDENT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
	}

	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXSTUDENT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
	}

	public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXCONTACT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
	}

	public ResponseMulti<XLeaType> getXLeasByXContact(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXLEASBYXCONTACT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XLeaCollectionType.class);
	}

	/* xSchools */
	public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLS, rh);
		return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
	}

	// todo NEW
	public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchools(String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchools() throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLS, rh);
		return rr.makeAllRequest(rt, rp, XSchoolCollectionType.class);
	}

	// TODO removed  getXSchool(String refId, int navigationPage, int navigationPageSize)

	public ResponseSingle<XSchoolType> getXSchool(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLBYREFID, refId, rh);
		return rr.makeSingleRequest(rt, rp, XSchoolType.class);
	}

	public ResponseSingle<XSchoolType> getXSchool(String idType, String id) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(idType, id);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLBYREFID, rh);
		return rr.makeSingleRequestById(rt, rp, XSchoolType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	// todo removed getXSchoolsByXLea(String idType, String id)

	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCOURSE, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCALENDAR, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXROSTER, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXROSTER, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXSTAFF, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXSTAFF, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXSTUDENT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXSTUDENT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCONTACT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSCHOOLSBYXCONTACT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XSchoolCollectionType.class);
	}

	/* xCalendars */
	public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARS, rh);
		return rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
	}

	//todo NEW
	public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
	}

	public ResponseMulti<XCalendarType> getXCalendars(String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
	}

	public ResponseMulti<XCalendarType> getXCalendars() throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARS, rh);
		return rr.makeAllRequest(rt, rp, XCalendarCollectionType.class);
	}

	//todo removed getXCalendar(String refId, int navigationPage, int navigationPageSize)


	public ResponseSingle<XCalendarType> getXCalendar(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARBYREFID, refId, rh);
		return rr.makeSingleRequest(rt, rp, XCalendarType.class);
	}

	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARSBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
	}

	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARSBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
	}

	//todo removed getXCalendarsByXLea(String idType, String id)

	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARSBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
	}

	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCALENDARSBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XCalendarCollectionType.class);
	}

	//todo removed getXCalendarsByXSchool(String idType, String id)

	/* xCourses */
	public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSES, rh);
		return rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
	}

	//todo NEW
	public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSES, rh, rqp);
		return rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
	}

	public ResponseMulti<XCourseType> getXCourses(String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSES, rh, rqp);
		return rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
	}

	public ResponseMulti<XCourseType> getXCourses() throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSES, rh);
		return rr.makeAllRequest(rt, rp, XCourseCollectionType.class);
	}

	//todo removed getXCourse(String refId, int navigationPage, int navigationPageSize)

	public ResponseSingle<XCourseType> getXCourse(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSES, refId, rh);
		return rr.makeSingleRequest(rt, rp, XCourseType.class);
	}

	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
	}

	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
	}

	//todo removed getXCoursesByXLea(String idType, String id)

	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
	}

	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
	}

	//todo removed getXCoursesByXSchool(String idType, String id)

	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXROSTER, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
	}

	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCOURSESBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XCourseCollectionType.class);
	}

	/* xRosters */
	public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERS, rh);
		return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
	}

	//todo NEW
	public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
	}

	public ResponseMulti<XRosterType> getXRosters(String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
	}

	public ResponseMulti<XRosterType> getXRosters() throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERS, rh);
		return rr.makeAllRequest(rt, rp, XRosterCollectionType.class);
	}

	//todo removed getXRoster(String refId, int navigationPage, int navigationPageSize)

	public ResponseSingle<XRosterType> getXRoster(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERS, refId, rh);
		return rr.makeSingleRequest(rt, rp, XRosterType.class);
	}

	public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
	}

	public ResponseMulti<XRosterType> getXRostersByXLea(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
	}

	//todo removed getXRostersByXLea(String idType, String id)

	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
	}

	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
	}

	//todo removed getXRostersByXSchool(String idType, String id)

	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXCOURSE, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
	}

	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXCOURSE, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
	}

	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSTAFF, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
	}

	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSTAFF, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
	}

	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSTUDENT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
	}

	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXROSTERSBYXSTUDENT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XRosterCollectionType.class);
	}

	/* xStaffs */
	public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFS, rh);
		return rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
	}

	//TODO NEW
	public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStaffType> getXStaffs(String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStaffType> getXStaffs() throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFS, rh);
		return rr.makeAllRequest(rt, rp, XStaffCollectionType.class);
	}

	//todo removed getXStaff(String refId, int navigationPage, int navigationPageSize)

	public ResponseSingle<XStaffType> getXStaff(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFBYREFID, refId, rh);
		return rr.makeSingleRequest(rt, rp, XStaffType.class);
	}

	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
	}

	//todo removed getXStaffsByXLea(String idType, String id)

	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
	}

	//todo removed getXStaffsByXSchool(String idType, String id)

	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXCOURSE, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXCOURSE, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXROSTER, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXROSTER, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSTUDENT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSTUDENT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStaffCollectionType.class);
	}

	/* xStudents */
	public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTS, rh);
		return rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
	}

	//todo NEW
	public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
	}

	public ResponseMulti<XStudentType> getXStudents(String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
	}

	public ResponseMulti<XStudentType> getXStudents() throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTS, rh);
		return rr.makeAllRequest(rt, rp, XStudentCollectionType.class);
	}

	//todo removed getXStudent(String refId, int navigationPage, int navigationPageSize)

	public ResponseSingle<XStudentType> getXStudent(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTBYREFID, refId, rh);
		return rr.makeSingleRequest(rt, rp, XStudentType.class);
	}

	public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
	}

	public ResponseMulti<XStudentType> getXStudentsByXLea(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
	}

	//todo removed getXStudentsByXLea(String idType, String id)

	public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
	}

	public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
	}

	//todo removed getXStudentsByXSchool(String idType, String id)

	public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXROSTER, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
	}

	public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXROSTER, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
	}

	public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSTAFF, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
	}

	public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSTAFF, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
	}

	public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXCONTACT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
	}

	public ResponseMulti<XStudentType> getXStudentsByXContact(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXCONTACT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XStudentCollectionType.class);
	}

	/* xContacts */
	public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTS, rh);
		return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
	}

	//todo NEW
	public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
	}

	public ResponseMulti<XContactType> getXContacts(String opaqueMarker) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTS, rh, rqp);
		return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
	}

	public ResponseMulti<XContactType> getXContacts() throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTS, rh);
		return rr.makeAllRequest(rt, rp, XContactCollectionType.class);
	}

	//todo removed getXContact(String refId, int navigationPage, int navigationPageSize)

	public ResponseSingle<XContactType> getXContact(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTBYREFID, refId, rh);
		return rr.makeSingleRequest(rt, rp, XContactType.class);
	}

	public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
	}

	public ResponseMulti<XContactType> getXContactsByXLea(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXLEA, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
	}

	//todo removed getXContactsByXLea(String idType, String id)

	public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
	}

	public ResponseMulti<XContactType> getXContactsByXSchool(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
	}

	//todo removed getXContactsByXSchool(String idType, String id)

	public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSTUDENT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
	}

	public ResponseMulti<XContactType> getXContactsByXStudent(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSTUDENT, refId, rh);
		return rr.makeAllRequestByRefId(rt, rp, XContactCollectionType.class);
	}


	//TODO rework this!!!!!!!!!!!!!!
	/* navigationLastPage */
	public int getLastPage(int navigationPageSize, ServicePath p, String refId) {
		return getLastPagePath.getLastPage(navigationPageSize, p, refId);
	}

	public int getLastPage(int navigationPageSize, ServicePath p) {
		return getLastPagePath.getLastPage(navigationPageSize, p);
	}


	/* AUPP */
	public ResponseMulti<XStaffType> createXStaffUsers(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.CREATE);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh, rqp);
		return rr.makeAllRequestByAupp(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStaffType> deleteXStaffUsers(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.DELETE);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh, rqp);
		return rr.makeAllRequestByAupp(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStaffType> getXStaffUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.GET);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh, rqp);
		return rr.makeAllRequestByAupp(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStaffType> getXStaffUsers(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.GET);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTAFFSBYXSCHOOL, refId, rh, rqp);
		return rr.makeAllRequestByAupp(rt, rp, XStaffCollectionType.class);
	}

	public ResponseMulti<XStudentType> createXStudentUsers(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.CREATE);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh, rqp);
		return rr.makeAllRequestByAupp(rt, rp, XStudentCollectionType.class);
	}

	public ResponseMulti<XStudentType> deleteXStudentUsers(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.DELETE);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh, rqp);
		return rr.makeAllRequestByAupp(rt, rp, XStudentCollectionType.class);
	}

	public ResponseMulti<XStudentType> getXStudentUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.GET);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh, rqp);
		return rr.makeAllRequestByAupp(rt, rp, XStudentCollectionType.class);
	}

	public ResponseMulti<XStudentType> getXStudentUsers(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.GET);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXSTUDENTSBYXSCHOOL, refId, rh, rqp);
		return rr.makeAllRequestByAupp(rt, rp, XStudentCollectionType.class);
	}

	private ResponseMulti<XContactType> createXContactUsers(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.CREATE);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
		return rr.makeAllRequestByAupp(rt, rp, XContactCollectionType.class);
	}

	private ResponseMulti<XContactType> deleteXContactUsers(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.DELETE);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
		return rr.makeAllRequestByAupp(rt, rp, XContactCollectionType.class);
	}

	private ResponseMulti<XContactType> getXContactUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
		RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.GET);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
		return rr.makeAllRequestByAupp(rt, rp, XContactCollectionType.class);
	}

	private ResponseMulti<XContactType> getXContactUsers(String refId) throws AuthenticationException {
		RestResponse rr = new RestResponse();
		RestHeader rh = new RestHeader();
		RestQueryParameter rqp = new RestQueryParameter(AUPPEnum.GET);
		RestProperties rp = new RestProperties(baseApiUrl, ServicePath.GETXCONTACTSBYXSCHOOL, refId, rh, rqp);
		return rr.makeAllRequestByAupp(rt, rp, XContactCollectionType.class);
	}
}