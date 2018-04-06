package riconeapi.common;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import riconeapi.common.paths.*;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.*;

import java.util.Collections;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.7
 * @since       Feb 14, 2018
 *
 * Static class allowing access to xPress data model objects
 */
public class XPress
{
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

	public XPress(String baseApiUrl)
	{
		this.baseApiUrl = baseApiUrl;
		this.rt = new RestTemplate();


		ObjectMapper jsonMapper = new ObjectMapper();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setObjectMapper(jsonMapper);
		jsonMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		jsonMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

		JacksonXmlModule module = new JacksonXmlModule();
		module.setDefaultUseWrapper(false);
		ObjectMapper xmlMapper = new XmlMapper(module);
		xmlMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		xmlMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

		rt.setMessageConverters(Collections.<HttpMessageConverter<?>>singletonList(converter));

		xLeasPath = new XLeasPath(rt, baseApiUrl, jsonMapper, xmlMapper);
		xSchoolsPath = new XSchoolsPath(rt, baseApiUrl, jsonMapper, xmlMapper);
		xCalendarsPath = new XCalendarsPath(rt, baseApiUrl, jsonMapper, xmlMapper);
		xCoursesPath = new XCoursesPath(rt, baseApiUrl, jsonMapper, xmlMapper);
		xRostersPath = new XRostersPath(rt, baseApiUrl, jsonMapper, xmlMapper);
		xStaffsPath = new XStaffsPath(rt, baseApiUrl, jsonMapper, xmlMapper);
		xStudentsPath = new XStudentsPath(rt, baseApiUrl, jsonMapper, xmlMapper);
		xContactsPath = new XContactsPath(rt, baseApiUrl, jsonMapper, xmlMapper);
		getLastPagePath = new GetLastPagePath(rt, baseApiUrl);
		aupp = new AUPP(rt, baseApiUrl, jsonMapper, xmlMapper);

	}

	/* xLeas */
	public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xLeasPath.getXLeas(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XLeaType> getXLeas(String opaqueMarker) throws AuthenticationException
	{
		return xLeasPath.getXLeas(opaqueMarker);
	}
	public ResponseMulti<XLeaType> getXLeas() throws AuthenticationException
	{
		return xLeasPath.getXLeas();
	}
	public ResponseSingle<XLeaType> getXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xLeasPath.getXLea(refId, navigationPage, navigationPageSize);
	}
	public ResponseSingle<XLeaType> getXLea(String refId) throws AuthenticationException
	{
		return xLeasPath.getXLea(refId);
	}
	public ResponseSingle<XLeaType> getXLea(String idType, String id) throws AuthenticationException
	{
		return xLeasPath.getXLea(idType, id);
	}
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xLeasPath.getXLeasByXSchool(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId) throws AuthenticationException
	{
		return xLeasPath.getXLeasByXSchool(refId);
	}
	public ResponseMulti<XLeaType> getXLeasByXSchool(String idType, String id) throws AuthenticationException
	{
		return xLeasPath.getXLeasByXSchool(idType, id);
	}
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xLeasPath.getXLeasByXRoster(refId,navigationPage, navigationPageSize);
	}
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId) throws AuthenticationException
	{
		return xLeasPath.getXLeasByXRoster(refId);
	}
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xLeasPath.getXLeasByXStaff(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId) throws AuthenticationException
	{
		return xLeasPath.getXLeasByXStaff(refId);
	}
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xLeasPath.getXLeasByXStudent(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId) throws AuthenticationException
	{
		return xLeasPath.getXLeasByXStudent(refId);
	}
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xLeasPath.getXLeasByXContact(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId) throws AuthenticationException
	{
		return xLeasPath.getXLeasByXContact(refId);
	}

	/* xSchools */
	public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xSchoolsPath.getXSchools(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XSchoolType> getXSchools(String opaqueMarker) throws AuthenticationException
	{
		return xSchoolsPath.getXSchools(opaqueMarker);
	}
	public ResponseMulti<XSchoolType> getXSchools() throws AuthenticationException
	{
		return xSchoolsPath.getXSchools();
	}
	public ResponseSingle<XSchoolType> getXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xSchoolsPath.getXSchool(refId, navigationPage, navigationPageSize);
	}
	public ResponseSingle<XSchoolType> getXSchool(String refId) throws AuthenticationException
	{
		return xSchoolsPath.getXSchool(refId);
	}
	public ResponseSingle<XSchoolType> getXSchool(String idType, String id) throws AuthenticationException
	{
		return xSchoolsPath.getXSchool(idType, id);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXLea(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXLea(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String idType, String id) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXLea(idType, id);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXCalendar(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXCalendar(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXCourse(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXCourse(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXRoster(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXRoster(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXStaff(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXStaff(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXStudent(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXStudent(refId);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXContact(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId) throws AuthenticationException
	{
		return xSchoolsPath.getXSchoolsByXContact(refId);
	}

	/* xCalendars */
	public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xCalendarsPath.getXCalendars(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XCalendarType> getXCalendars(String opaqueMarker) throws AuthenticationException
	{
		return xCalendarsPath.getXCalendars(opaqueMarker);
	}
	public ResponseMulti<XCalendarType> getXCalendars() throws AuthenticationException
	{
		return xCalendarsPath.getXCalendars();
	}
	public ResponseSingle<XCalendarType> getXCalendar(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xCalendarsPath.getXCalendar(refId, navigationPage, navigationPageSize);
	}
	public ResponseSingle<XCalendarType> getXCalendar(String refId) throws AuthenticationException
	{
		return xCalendarsPath.getXCalendar(refId);
	}
	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xCalendarsPath.getXCalendarsByXLea(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId) throws AuthenticationException
	{
		return xCalendarsPath.getXCalendarsByXLea(refId);
	}
	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String idType, String id) throws AuthenticationException
	{
		return xCalendarsPath.getXCalendarsByXLea(idType, id);
	}
	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xCalendarsPath.getXCalendarsByXSchool(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId) throws AuthenticationException
	{
		return xCalendarsPath.getXCalendarsByXSchool(refId);
	}
	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String idType, String id) throws AuthenticationException
	{
		return xCalendarsPath.getXCalendarsByXSchool(idType, id);
	}

	/* xCourses */
	public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xCoursesPath.getXCourses(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XCourseType> getXCourses(String opaqueMarker) throws AuthenticationException
	{
		return xCoursesPath.getXCourses(opaqueMarker);
	}
	public ResponseMulti<XCourseType> getXCourses() throws AuthenticationException
	{
		return xCoursesPath.getXCourses();
	}
	public ResponseSingle<XCourseType> getXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xCoursesPath.getXCourse(refId, navigationPage, navigationPageSize);
	}
	public ResponseSingle<XCourseType> getXCourse(String refId) throws AuthenticationException
	{
		return xCoursesPath.getXCourse(refId);
	}
	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xCoursesPath.getXCoursesByXLea(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId) throws AuthenticationException
	{
		return xCoursesPath.getXCoursesByXLea(refId);
	}
	public ResponseMulti<XCourseType> getXCoursesByXLea(String idType, String id) throws AuthenticationException
	{
		return xCoursesPath.getXCoursesByXLea(idType, id);
	}
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xCoursesPath.getXCoursesByXSchool(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId) throws AuthenticationException
	{
		return xCoursesPath.getXCoursesByXSchool(refId);
	}
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String idType, String id) throws AuthenticationException
	{
		return xCoursesPath.getXCoursesByXSchool(idType, id);
	}
	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xCoursesPath.getXCoursesByXRoster(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId) throws AuthenticationException
	{
		return xCoursesPath.getXCoursesByXRoster(refId);
	}

	/* xRosters */
	public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xRostersPath.getXRosters(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XRosterType> getXRosters(String opaqueMarker) throws AuthenticationException
	{
		return xRostersPath.getXRosters(opaqueMarker);
	}
	public ResponseMulti<XRosterType> getXRosters() throws AuthenticationException
	{
		return xRostersPath.getXRosters();
	}
	public ResponseSingle<XRosterType> getXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xRostersPath.getXRoster(refId, navigationPage, navigationPageSize);
	}
	public ResponseSingle<XRosterType> getXRoster(String refId) throws AuthenticationException
	{
		return xRostersPath.getXRoster(refId);
	}
	public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xRostersPath.getXRostersByXLea(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XRosterType> getXRostersByXLea(String refId) throws AuthenticationException
	{
		return xRostersPath.getXRostersByXLea(refId);
	}
	public ResponseMulti<XRosterType> getXRostersByXLea(String idType, String id) throws AuthenticationException
	{
		return xRostersPath.getXRostersByXLea(idType, id);
	}
	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xRostersPath.getXRostersByXSchool(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId) throws AuthenticationException
	{
		return xRostersPath.getXRostersByXSchool(refId);
	}
	public ResponseMulti<XRosterType> getXRostersByXSchool(String idType, String id) throws AuthenticationException
	{
		return xRostersPath.getXRostersByXSchool(idType, id);
	}
	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xRostersPath.getXRostersByXCourse(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId) throws AuthenticationException
	{
		return xRostersPath.getXRostersByXCourse(refId);
	}
	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xRostersPath.getXRostersByXStaff(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId) throws AuthenticationException
	{
		return xRostersPath.getXRostersByXStaff(refId);
	}
	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xRostersPath.getXRostersByXStudent(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId) throws AuthenticationException
	{
		return xRostersPath.getXRostersByXStudent(refId);
	}

	/* xStaffs */
	public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStaffsPath.getXStaffs(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStaffType> getXStaffs(String opaqueMarker) throws AuthenticationException
	{
		return xStaffsPath.getXStaffs(opaqueMarker);
	}
	public ResponseMulti<XStaffType> getXStaffs() throws AuthenticationException
	{
		return xStaffsPath.getXStaffs();
	}
	public ResponseSingle<XStaffType> getXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStaffsPath.getXStaff(refId, navigationPage, navigationPageSize);
	}
	public ResponseSingle<XStaffType> getXStaff(String refId) throws AuthenticationException
	{
		return xStaffsPath.getXStaff(refId);
	}
	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStaffsPath.getXStaffsByXLea(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId) throws AuthenticationException
	{
		return xStaffsPath.getXStaffsByXLea(refId);
	}
	public ResponseMulti<XStaffType> getXStaffsByXLea(String idType, String id) throws AuthenticationException
	{
		return xStaffsPath.getXStaffsByXLea(idType, id);
	}
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStaffsPath.getXStaffsByXSchool(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId) throws AuthenticationException
	{
		return xStaffsPath.getXStaffsByXSchool(refId);
	}
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String idType, String id) throws AuthenticationException
	{
		return xStaffsPath.getXStaffsByXSchool(idType, id);
	}
	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStaffsPath.getXStaffsByXCourse(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId) throws AuthenticationException
	{
		return xStaffsPath.getXStaffsByXCourse(refId);
	}
	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStaffsPath.getXStaffsByXRoster(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId) throws AuthenticationException
	{
		return xStaffsPath.getXStaffsByXRoster(refId);
	}
	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStaffsPath.getXStaffsByXStudent(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId) throws AuthenticationException
	{
		return xStaffsPath.getXStaffsByXStudent(refId);
	}

	/* xStudents */
	public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStudentsPath.getXStudents(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStudentType> getXStudents(String opaqueMarker) throws AuthenticationException
	{
		return xStudentsPath.getXStudents(opaqueMarker);
	}
	public ResponseMulti<XStudentType> getXStudents() throws AuthenticationException
	{
		return xStudentsPath.getXStudents();
	}
	public ResponseSingle<XStudentType> getXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStudentsPath.getXStudent(refId, navigationPage, navigationPageSize);
	}
	public ResponseSingle<XStudentType> getXStudent(String refId) throws AuthenticationException
	{
		return xStudentsPath.getXStudent(refId);
	}
	public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStudentsPath.getXStudentsByXLea(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStudentType> getXStudentsByXLea(String refId) throws AuthenticationException
	{
		return xStudentsPath.getXStudentsByXLea(refId);
	}
	public ResponseMulti<XStudentType> getXStudentsByXLea(String idType, String id) throws AuthenticationException
	{
		return xStudentsPath.getXStudentsByXLea(idType, id);
	}
	public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStudentsPath.getXStudentsByXSchool(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId) throws AuthenticationException
	{
		return xStudentsPath.getXStudentsByXSchool(refId);
	}
	public ResponseMulti<XStudentType> getXStudentsByXSchool(String idType, String id) throws AuthenticationException
	{
		return xStudentsPath.getXStudentsByXSchool(idType, id);
	}
	public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStudentsPath.getXStudentsByXRoster(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId) throws AuthenticationException
	{
		return xStudentsPath.getXStudentsByXRoster(refId);
	}
	public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStudentsPath.getXStudentsByXStaff(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId) throws AuthenticationException
	{
		return xStudentsPath.getXStudentsByXStaff(refId);
	}
	public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xStudentsPath.getXStudentsByXContact(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStudentType> getXStudentsByXContact(String refId) throws AuthenticationException
	{
		return xStudentsPath.getXStudentsByXContact(refId);
	}

	/* xContacts */
	public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xContactsPath.getXContacts(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XContactType> getXContacts(String opaqueMarker) throws AuthenticationException
	{
		return xContactsPath.getXContacts(opaqueMarker);
	}
	public ResponseMulti<XContactType> getXContacts() throws AuthenticationException
	{
		return xContactsPath.getXContacts();
	}
	public ResponseSingle<XContactType> getXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xContactsPath.getXContact(refId, navigationPage, navigationPageSize);
	}
	public ResponseSingle<XContactType> getXContact(String refId) throws AuthenticationException
	{
		return xContactsPath.getXContact(refId);
	}
	public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xContactsPath.getXContactsByXLea(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XContactType> getXContactsByXLea(String refId) throws AuthenticationException
	{
		return xContactsPath.getXContactsByXLea(refId);
	}
	public ResponseMulti<XContactType> getXContactsByXLea(String idType, String id) throws AuthenticationException
	{
		return xContactsPath.getXContactsByXLea(idType, id);
	}
	public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xContactsPath.getXContactsByXSchool(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XContactType> getXContactsByXSchool(String refId) throws AuthenticationException
	{
		return xContactsPath.getXContactsByXSchool(refId);
	}
	public ResponseMulti<XContactType> getXContactsByXSchool(String idType, String id) throws AuthenticationException
	{
		return xContactsPath.getXContactsByXSchool(idType, id);
	}
	public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xContactsPath.getXContactsByXStudent(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XContactType> getXContactsByXStudent(String refId) throws AuthenticationException
	{
		return xContactsPath.getXContactsByXStudent(refId);
	}

	/* navigationLastPage */
	public int getLastPage(int navigationPageSize, ServicePath p, String refId)
	{
		return getLastPagePath.getLastPage(navigationPageSize, p, refId);
	}

	public int getLastPage(int navigationPageSize, ServicePath p)
	{
		return getLastPagePath.getLastPage(navigationPageSize, p);
	}


	/* AUPP */
	public ResponseMulti<XStaffType> createXStaffUsers(String refId) throws AuthenticationException
	{
		return aupp.createXStaffUsers(refId);
	}
	public ResponseMulti<XStaffType> deleteXStaffUsers(String refId) throws AuthenticationException
	{
		return aupp.deleteXStaffUsers(refId);
	}
	public ResponseMulti<XStaffType> getXStaffUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return aupp.getXStaffUsers(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStaffType> getXStaffUsers(String refId) throws AuthenticationException
	{
		return aupp.getXStaffUsers(refId);
	}
	public ResponseMulti<XStudentType> createXStudentUsers(String refId) throws AuthenticationException
	{
		return aupp.createXStudentUsers(refId);
	}
	public ResponseMulti<XStudentType> deleteXStudentUsers(String refId) throws AuthenticationException
	{
		return aupp.deleteXStudentUsers(refId);
	}
	public ResponseMulti<XStudentType> getXStudentUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return aupp.getXStudentUsers(refId, navigationPage, navigationPageSize);
	}
	public ResponseMulti<XStudentType> getXStudentUsers(String refId) throws AuthenticationException
	{
		return aupp.getXStudentUsers(refId);
	}
//	private ResponseMulti<XContactType> createXContactUsers(String refId) throws AuthenticationException
//	{
//		return aupp.createXContactUsers(refId);
//	}
//	private ResponseMulti<XContactType> deleteXContactUsers(String refId) throws AuthenticationException
//	{
//		return aupp.deleteXContactUsers(refId);
//	}
//	private ResponseMulti<XContactType> getXContactUsers(String refId) throws AuthenticationException
//	{
//		return aupp.getXContactUsers(refId);
//	}
}
