import java.util.List;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import riconeapi.models.sifxpress.XCalendarCollectionType;
import riconeapi.models.sifxpress.XCalendarType;
import riconeapi.models.sifxpress.XContactCollectionType;
import riconeapi.models.sifxpress.XContactType;
import riconeapi.models.sifxpress.XCourseCollectionType;
import riconeapi.models.sifxpress.XCourseType;
import riconeapi.models.sifxpress.XLeaCollectionType;
import riconeapi.models.sifxpress.XLeaType;
import riconeapi.models.sifxpress.XRosterCollectionType;
import riconeapi.models.sifxpress.XRosterType;
import riconeapi.models.sifxpress.XSchoolCollectionType;
import riconeapi.models.sifxpress.XSchoolType;
import riconeapi.models.sifxpress.XStaffCollectionType;
import riconeapi.models.sifxpress.XStaffType;
import riconeapi.models.sifxpress.XStudentCollectionType;
import riconeapi.models.sifxpress.XStudentType;

public class SifXpress
{
	private String token;
	private RestTemplate restTemplate;
	private String baseApiUrl;
	private String paging = "&navigationPage={navigationPage}&navigationPageSize={navigationPageSize}";

	public SifXpress(String token, String baseApiUrl, RestTemplate restTemplate)
	{
		this.token = token;
		this.baseApiUrl = baseApiUrl;
		this.restTemplate = restTemplate;
	}

	// #################### xLeas ####################
	/**
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Leas with paging
	 */
	public List<XLeaType> GetXLeas(Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas?accessToken=" + token + paging, XLeaCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXLea();

	}

	/**
	 * @return All Leas
	 */
	public List<XLeaType> GetXLeas()
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas?accessToken=" + token, XLeaCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXLea();

	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Lea by refId with paging
	 */
	public XLeaType GetXLea(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XLeaType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}?accessToken=" + token + paging, XLeaType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @return Single Lea by refId
	 */
	public XLeaType GetXLea(String refId)
	{
		ResponseEntity<XLeaType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}?accessToken=" + token, XLeaType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific School by refId with paging
	 */
	public List<XLeaType> GetXLeasByXSchool(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xLeas?accessToken=" + token + paging, XLeaCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXLea();
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific School by refId
	 */
	public List<XLeaType> GetXLeasByXSchool(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xLeas?accessToken=" + token, XLeaCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXLea();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Student by refId with paging
	 */
	public List<XLeaType> GetXLeasByXStudent(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xLeas?accessToken=" + token + paging, XLeaCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXLea();
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Student by refId
	 */
	public List<XLeaType> GetXLeasByXStudent(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xLeas?accessToken=" + token, XLeaCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXLea();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Contact by refId with paging
	 */
	public List<XLeaType> GetXLeasByXContact(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}/xLeas?accessToken=" + token + paging, XLeaCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXLea();
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Contact by refId
	 */
	public List<XLeaType> GetXLeasByXContact(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}/xLeas?accessToken=" + token, XLeaCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXLea();
	}

	// #################### xSchools ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Schools with paging
	 */
	public List<XSchoolType> GetXSchools(Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools?accessToken=" + token + paging, XSchoolCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @return All Schools
	 */
	public List<XSchoolType> GetXSchools()
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools?accessToken=" + token, XSchoolCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single School by refId with paging
	 */
	public XSchoolType GetXSchool(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XSchoolType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}?accessToken=" + token + paging, XSchoolType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @return Single School by refId
	 */
	public XSchoolType GetXSchool(String refId)
	{
		ResponseEntity<XSchoolType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}?accessToken=" + token, XSchoolType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Lea by refId with paging
	 */
	public List<XSchoolType> GetXSchoolsByXLea(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xSchools?accessToken=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Lea by refId
	 */
	public List<XSchoolType> GetXSchoolsByXLea(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xSchools?accessToken=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Calendar by refId with paging
	 */
	public List<XSchoolType> GetXSchoolsByXCalendar(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCalendars/{refId}/xSchools?accessToken=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Calendar by refId
	 */
	public List<XSchoolType> GetXSchoolsByXCalendar(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCalendars/{refId}/xSchools?accessToken=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Course by refId with paging
	 */
	public List<XSchoolType> GetXSchoolsByXCourse(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}/xSchools?accessToken=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Course by refId
	 */
	public List<XSchoolType> GetXSchoolsByXCourse(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}/xSchools?accessToken=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Roster by refId with paging
	 */
	public List<XSchoolType> GetXSchoolsByXRoster(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xSchools?accessToken=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Roster by refId
	 */
	public List<XSchoolType> GetXSchoolsByXRoster(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xSchools?accessToken=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Staff by refId with paging
	 */
	public List<XSchoolType> GetXSchoolsByXStaff(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xSchools?accessToken=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Staff by refId
	 */
	public List<XSchoolType> GetXSchoolsByXStaff(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xSchools?accessToken=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Student by refId with paging
	 */
	public List<XSchoolType> GetXSchoolsByXStudent(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xSchools?accessToken=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Student by refId
	 */
	public List<XSchoolType> GetXSchoolsByXStudent(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xSchools?accessToken=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Contact by refId with paging
	 */
	public List<XSchoolType> GetXSchoolsByXContact(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}/xSchools?accessToken=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Contact by refId
	 */
	public List<XSchoolType> GetXSchoolsByXContact(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}/xSchools?accessToken=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXSchool();
	}

	// #################### xCalendars ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Calendars with paging
	 */
	public List<XCalendarType> GetXCalendars(Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCalendars?accessToken=" + token + paging, XCalendarCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXCalendar();
	}

	/**
	 * 
	 * @return All Calendars
	 */
	public List<XCalendarType> GetXCalendars()
	{
		ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCalendars?accessToken=" + token, XCalendarCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXCalendar();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Calendar by refId with paging
	 */
	public XCalendarType GetXCalendar(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XCalendarType> response = restTemplate.getForEntity(baseApiUrl + "xCalendars/{refId}?accessToken=" + token + paging, XCalendarType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @return Single Calendar by refId
	 */
	public XCalendarType GetXCalendar(String refId)
	{
		ResponseEntity<XCalendarType> response = restTemplate.getForEntity(baseApiUrl + "xCalendars/{refId}?accessToken=" + token, XCalendarType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Calendars associated to a specific School by refId with paging
	 */
	public List<XCalendarType> GetXCalendarsByXSchool(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xCalendars?accessToken=" + token + paging, XCalendarCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXCalendar();
	}

	/**
	 * 
	 * @param refId
	 * @return Calendars associated to a specific School by refId
	 */
	public List<XCalendarType> GetXCalendarsByXSchool(String refId)
	{
		ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xCalendars?accessToken=" + token, XCalendarCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXCalendar();
	}

	// #################### xCourses ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Courses with paging
	 */
	public List<XCourseType> GetXCourses(Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses?accessToken=" + token + paging, XCourseCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXCourse();
	}

	/**
	 * 
	 * @return All Courses
	 */
	public List<XCourseType> GetXCourses()
	{
		ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses?accessToken=" + token, XCourseCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXCourse();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Course by refId with paging
	 */
	public XCourseType GetXCourse(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XCourseType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}?accessToken=" + token + paging, XCourseType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @return Single Course by refId
	 */
	public XCourseType GetXCourse(String refId)
	{
		ResponseEntity<XCourseType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}?accessToken=" + token, XCourseType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Courses associated to a specific Lea by refId with paging
	 */
	public List<XCourseType> GetXCoursesByXLea(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xCourses?accessToken=" + token + paging, XCourseCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXCourse();
	}

	/**
	 * 
	 * @param refId
	 * @return Courses associated to a specific Lea by refId
	 */
	public List<XCourseType> GetXCoursesByXLea(String refId)
	{
		ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xCourses?accessToken=" + token, XCourseCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXCourse();
	}

	// #################### xRosters ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Rosters with paging
	 */
	public List<XRosterType> GetXRosters(Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters?accessToken=" + token + paging, XRosterCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXRoster();
	}

	/**
	 * 
	 * @return All Rosters
	 */
	public List<XRosterType> GetXRosters()
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters?accessToken=" + token, XRosterCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXRoster();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Roster by refId with paging
	 */
	public XRosterType GetXRoster(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XRosterType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}?accessToken=" + token + paging, XRosterType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @return Single Roster by refId
	 */
	public XRosterType GetXRoster(String refId)
	{
		ResponseEntity<XRosterType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}?accessToken=" + token, XRosterType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific Lea by refId with paging
	 */
	public List<XRosterType> GetXRostersByXLea(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xRosters?accessToken=" + token + paging, XRosterCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXRoster();
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Lea by refId
	 */
	public List<XRosterType> GetXRostersByXLea(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xRosters?accessToken=" + token, XRosterCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXRoster();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific School by refId with paging
	 */
	public List<XRosterType> GetXRostersByXSchool(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xRosters?accessToken=" + token + paging, XRosterCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXRoster();
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific School by refId
	 */
	public List<XRosterType> GetXRostersByXSchool(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xRosters?accessToken=" + token, XRosterCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXRoster();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific Course by refId with paging
	 */
	public List<XRosterType> GetXRostersByXCourse(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}/xRosters?accessToken=" + token + paging, XRosterCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXRoster();
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Course by refId
	 */
	public List<XRosterType> GetXRostersByXCourse(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}/xRosters?accessToken=" + token, XRosterCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXRoster();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific Staff by refId with paging
	 */
	public List<XRosterType> GetXRostersByXStaff(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xRosters?accessToken=" + token + paging, XRosterCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXRoster();
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Staff by refId
	 */
	public List<XRosterType> GetXRostersByXStaff(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xRosters?accessToken=" + token, XRosterCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXRoster();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific Student by refId with paging
	 */
	public List<XRosterType> GetXRostersByXStudent(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xRosters?accessToken=" + token + paging, XRosterCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXRoster();
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Student by refId
	 */
	public List<XRosterType> GetXRostersByXStudent(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xRosters?accessToken=" + token, XRosterCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXRoster();
	}

	// #################### xStaffs ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Staffs with paging
	 */
	public List<XStaffType> GetXStaffs(Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs?accessToken=" + token + paging, XStaffCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStaff();
	}

	/**
	 * 
	 * @return All Staffs
	 */
	public List<XStaffType> GetXStaffs()
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs?accessToken=" + token, XStaffCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStaff();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Staffs by refId with paging
	 */
	public XStaffType GetXStaff(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStaffType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}?accessToken=" + token + paging, XStaffType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @return Single Staffs by refId
	 */
	public XStaffType GetXStaff(String refId)
	{
		ResponseEntity<XStaffType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}?accessToken=" + token, XStaffType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific Lea by refId with paging
	 */
	public List<XStaffType> GetXStaffsByXLea(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xStaffs?accessToken=" + token + paging, XStaffCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStaff();
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Lea by refId
	 */
	public List<XStaffType> GetXStaffsByXLea(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xStaffs?accessToken=" + token, XStaffCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStaff();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific School by refId with paging
	 */
	public List<XStaffType> GetXStaffsByXSchool(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xStaffs?accessToken=" + token + paging, XStaffCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStaff();
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific School by refId
	 */
	public List<XStaffType> GetXStaffsByXSchool(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xStaffs?accessToken=" + token, XStaffCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStaff();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific Course by refId with paging
	 */
	public List<XStaffType> GetXStaffsByXCourse(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}/xStaffs?accessToken=" + token + paging, XStaffCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStaff();
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Course by refId
	 */
	public List<XStaffType> GetXStaffsByXCourse(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}/xStaffs?accessToken=" + token, XStaffCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStaff();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific Roster by refId with paging
	 */
	public List<XStaffType> GetXStaffsByXRoster(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xStaffs?accessToken=" + token + paging, XStaffCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStaff();
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Roster by refId
	 */
	public List<XStaffType> GetXStaffsByXRoster(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xStaffs?accessToken=" + token, XStaffCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStaff();
	}

	// #################### xStudents ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Students with paging
	 */
	public List<XStudentType> GetXStudents(Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents?accessToken=" + token + paging, XStudentCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStudent();
	}

	/**
	 * 
	 * @return All Students
	 */
	public List<XStudentType> GetXStudents()
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents?accessToken=" + token, XStudentCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStudent();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Student by refId with paging
	 */
	public XStudentType GetXStudent(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStudentType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}?accessToken=" + token + paging, XStudentType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @return Single Student by refId
	 */
	public XStudentType GetXStudent(String refId)
	{
		ResponseEntity<XStudentType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}?accessToken=" + token, XStudentType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific Lea by refId with paging
	 */
	public List<XStudentType> GetXStudentsByXLea(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xStudents?accessToken=" + token + paging, XStudentCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStudent();
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Lea by refId
	 */
	public List<XStudentType> GetXStudentsByXLea(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xStudents?accessToken=" + token, XStudentCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStudent();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific School by refId with paging
	 */
	public List<XStudentType> GetXStudentsByXSchool(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xStudents?accessToken=" + token + paging, XStudentCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStudent();
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific School by refId
	 */
	public List<XStudentType> GetXStudentsByXSchool(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xStudents?accessToken=" + token, XStudentCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStudent();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific Roster by refId with paging
	 */
	public List<XStudentType> GetXStudentsByXRoster(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xStudents?accessToken=" + token + paging, XStudentCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStudent();
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Roster by refId
	 */
	public List<XStudentType> GetXStudentsByXRoster(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xStudents?accessToken=" + token, XStudentCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStudent();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific Staff by refId with paging
	 */
	public List<XStudentType> GetXStudentsByXStaff(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xStudents?accessToken=" + token + paging, XStudentCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStudent();
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Staff by refId
	 */
	public List<XStudentType> GetXStudentsByXStaff(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xStudents?accessToken=" + token, XStudentCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStudent();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific Contact by refId with paging
	 */
	public List<XStudentType> GetXStudentsByXContact(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}/xStudents?accessToken=" + token + paging, XStudentCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStudent();
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Contact by refId
	 */
	public List<XStudentType> GetXStudentsByXContact(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}/xStudents?accessToken=" + token, XStudentCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXStudent();
	}

	// #################### xContacts ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Contacts with paging
	 */
	public List<XContactType> GetXContacts(Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts?accessToken=" + token + paging, XContactCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXContact();
	}

	/**
	 * 
	 * @return All Contacts
	 */
	public List<XContactType> GetXContacts()
	{
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts?accessToken=" + token, XContactCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXContact();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Contact by refId with paging
	 */
	public XContactType GetXContact(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XContactType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}?accessToken=" + token + paging, XContactType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @return Single Contact by refId
	 */
	public XContactType GetXContact(String refId)
	{
		ResponseEntity<XContactType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}?accessToken=" + token, XContactType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Contacts associated to a specific Lea by refId wtih paging
	 */
	public List<XContactType> GetXContactsByXLea(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xContacts?accessToken=" + token + paging, XContactCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXContact();
	}

	/**
	 * 
	 * @param refId
	 * @return Contacts associated to a specific Lea by refId
	 */
	public List<XContactType> GetXContactsByXLea(String refId)
	{
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xContacts?accessToken=" + token, XContactCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXContact();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Contacts associated to a specific School by refId with paging
	 */
	public List<XContactType> GetXContactsByXSchool(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xContacts?accessToken=" + token + paging, XContactCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXContact();
	}

	/**
	 * 
	 * @param refId
	 * @return Contacts associated to a specific School by refId
	 */
	public List<XContactType> GetXContactsByXSchool(String refId)
	{
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xContacts?accessToken=" + token, XContactCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXContact();
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Contacts associated to a specific Student by refId with paging
	 */
	public List<XContactType> GetXContactsByXStudent(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xContacts?accessToken=" + token + paging, XContactCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXContact();
	}

	/**
	 * 
	 * @param refId
	 * @return Contacts associated to a specific Student by refId
	 */
	public List<XContactType> GetXContactsByXStudent(String refId)
	{
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xContacts?accessToken=" + token, XContactCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		return response.getBody().getXContact();
	}

	// #################### navigationLastPage ####################
	public enum ServicePath
	{
		GetXLeas("xLeas"), GetXLeasByXSchool("xSchools/{refId}/xLeas"), GetXLeasByXStudent("xStudents/{refId}/xLeas"), GetXLeasByXContact("xContacts/{refId}/xLeas"), GetXSchools("xSchools"), GetXSchoolsByXLea("xLeas/{refId}/xSchools"), GetXSchoolsByXCalendar("xCalendars/{refId}/xSchools"), GetXSchoolsByXCourse(
				"xCourses/{refId}/xSchools"), GetXSchoolsByXRoster("xRosters/{refId}/xSchools"), GetXSchoolsByXStaff("xStaffs/{refId}/xSchools"), GetXSchoolsByXStudent("xStudents/{refId}/xSchools"), GetXSchoolsByXContact("xContacts/{refId}/xSchools"), GetXCalendars("xCalendars"), GetXCalendarsByXSchool(
				"xSchools/{refId}/xCalendars"), GetXCourses("xCourses"), GetXCoursesByXLea("xLeas/{refId}/xCourses"), GetXRosters("xRosters"), GetXRostersByXLea("xLeas/{refId}/xRosters"), GetXRostersByXSchool("xSchools/{refId}/xRosters"), GetXRostersByXCourse("xCourses/{refId}/xRosters"), GetXRostersByXStaff(
				"xStaffs/{refId}/xRosters"), GetXRostersByXStudent("xStudents/{refId}/xRosters"), GetXStaffs("xStaffs"), GetXStaffsByXLea("xLeas/{refId}/xStaffs"), GetXStaffsByXSchool("xSchools/{refId}/xStaffs"), GetXStaffsByXCourse("xCourses/{refId}/xStaffs"), GetXStaffsByXRoster(
				"xRosters/{refId}/xStaffs"), GetXStudents("xStudents"), GetXStudentsByXLea("xLeas/{refId}/xStudents"), GetXStudentsByXSchool("xSchools/{refId}/xStudents"), GetXStudentsByXRoster("xRosters/{refId}/xStudents"), GetXStudentsByXStaff("xStaffs/{refId}/xStudents"), GetXStudentsByXContact(
				"xContacts/{refId}/xStudents"), GetXContacts("xContacts"), GetXContactsByXLea("xLeas/{refId}/xContacts"), GetXContactsByXSchool("xSchools/{refId}/xContacts"), GetXContactsByXStudent("xStudents/{refId}/xContacts");

		private String value;

		ServicePath(String value)
		{
			this.value = value;
		}

		public String getValue()
		{
			return value;
		}
	}

	/**
	 * 
	 * @param navigationPageSize
	 * @param p
	 * @param refId
	 * @return Max page value for specified service path object
	 */
	public int GetLastPage(int navigationPageSize, ServicePath p, String refId)
	{
		int navigationPage = 1;
		int navigationLastPage = 0;

		if (p.name().equals("GetXLeasByXSchool") || p.name().equals("GetXLeasByXStudent") || p.name().equals("GetXLeasByXContact"))
		{
			ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XLeaCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXSchoolsByXLea") || p.name().equals("GetXSchoolsByXCalendar") || p.name().equals("GetXSchoolsByXCourse") || p.name().equals("GetXSchoolsByXRoster") || p.name().equals("GetXSchoolsByXStaff") || p.name().equals("GetXSchoolsByXStudent")
				|| p.name().equals("GetXSchoolsByXContact"))
		{
			ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXCalendarsByXSchool"))
		{
			ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XCalendarCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXCoursesByXLea"))
		{
			ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XCourseCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXRostersByXLea") || p.name().equals("GetXRostersByXSchool") || p.name().equals("GetXRostersByXCourse") || p.name().equals("GetXRostersByXStaff") || p.name().equals("GetXRostersByXStudent"))
		{
			ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XRosterCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXStaffsByXLea") || p.name().equals("GetXStaffsByXSchool") || p.name().equals("GetXStaffsByXCourse") || p.name().equals("GetXStaffsByXRoster"))
		{
			ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XStaffCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXStudentsByXLea") || p.name().equals("GetXStudentsByXSchool") || p.name().equals("GetXStudentsByXRoster") || p.name().equals("GetXStudentsByXStaff") || p.name().equals("GetXStudentsByXContact"))
		{
			ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XStudentCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXContactsByXLea") || p.name().equals("GetXContactsByXSchool") || p.name().equals("GetXContactsByXStudent"))
		{
			ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XContactCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}

		return navigationLastPage;
	}
	
	/**
	 * 
	 * @param navigationPageSize
	 * @param p
	 * @return Max page value for specified service path object
	 */
	public int GetLastPage(int navigationPageSize, ServicePath p)
	{
		int navigationPage = 1;
		int navigationLastPage = 0;

		if (p.name().equals("GetXLeas"))
		{
			ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XLeaCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXSchools"))
		{
			ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XSchoolCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXCalendars"))
		{
			ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XCalendarCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXCourses"))
		{
			ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XCourseCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXRosters"))
		{
			ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XRosterCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXStaffs"))
		{
			ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XStaffCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXStudents"))
		{
			ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XStudentCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXContacts"))
		{
			ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?accessToken=" + token + paging, XContactCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}

		return navigationLastPage;
	}

	/**
	 * 
	 * @param navigationPageSize
	 * @param p
	 * @param refId
	 * @return Max page value for specified service path object
	 */
	// public int GetLastPage(int navigationPageSize, ServicePath p, String
	// refId)
	// {
	// int navigationPage = 1;
	// int navigationLastPage = 0;
	//
	// if (p == ServicePath.GetXLeas)
	// {
	// ResponseEntity<XLeaCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl + "xLeas?accessToken=" + token +
	// paging, XLeaCollectionType.class, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXLeasByXSchool)
	// {
	// ResponseEntity<XLeaCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xSchools/{refId}/xLeas?accessToken=" + token + paging,
	// XLeaCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXLeasByXStudent)
	// {
	// ResponseEntity<XLeaCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xStudents/{refId}/xLeas?accessToken=" + token + paging,
	// XLeaCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXLeasByXContact)
	// {
	// ResponseEntity<XLeaCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xContacts/{refId}/xLeas?accessToken=" + token + paging,
	// XLeaCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXSchools)
	// {
	// ResponseEntity<XSchoolType> response =
	// restTemplate.getForEntity(baseApiUrl + "xSchools?accessToken=" + token +
	// paging, XSchoolType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXSchoolsByXLea)
	// {
	// ResponseEntity<XSchoolType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xLeas/{refId}/xSchools?accessToken=" + token + paging,
	// XSchoolType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXSchoolsByXCalendar)
	// {
	// ResponseEntity<XSchoolType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xCalendars/{refId}/xSchools?accessToken=" + token + paging,
	// XSchoolType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXSchoolsByXCourse)
	// {
	// ResponseEntity<XSchoolType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xCourses/{refId}/xSchools?accessToken=" + token + paging,
	// XSchoolType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXSchoolsByXRoster)
	// {
	// ResponseEntity<XSchoolType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xRosters/{refId}/xSchools?accessToken=" + token + paging,
	// XSchoolType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXSchoolsByXStaff)
	// {
	// ResponseEntity<XSchoolType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xStaffs/{refId}/xSchools?accessToken=" + token + paging,
	// XSchoolType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXSchoolsByXStudent)
	// {
	// ResponseEntity<XSchoolType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xStudents/{refId}/xSchools?accessToken=" + token + paging,
	// XSchoolType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXSchoolsByXContact)
	// {
	// ResponseEntity<XSchoolType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xContacts/{refId}/xSchools?accessToken=" + token + paging,
	// XSchoolType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXCalendars)
	// {
	// ResponseEntity<XCalendarCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl + "xCalendars?accessToken=" + token
	// + paging, XCalendarCollectionType.class, navigationPage,
	// navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXCalendarsByXSchool)
	// {
	// ResponseEntity<XCalendarCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xSchools/{refId}/xCalendars?accessToken=" + token + paging,
	// XCalendarCollectionType.class, refId, navigationPage,
	// navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXCourses)
	// {
	// ResponseEntity<XCourseType> response =
	// restTemplate.getForEntity(baseApiUrl + "xCourses?accessToken=" + token +
	// paging, XCourseType.class, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXCoursesByXLea)
	// {
	// ResponseEntity<XCourseType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xLeas/{refId}/xCourses?accessToken=" + token + paging,
	// XCourseType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXRosters)
	// {
	// ResponseEntity<XRosterCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl + "xRosters?accessToken=" + token +
	// paging, XRosterCollectionType.class, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXRostersByXLea)
	// {
	// ResponseEntity<XRosterCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xLeas/{refId}/xRosters?accessToken=" + token + paging,
	// XRosterCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXRostersByXSchool)
	// {
	// ResponseEntity<XRosterCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xSchools/{refId}/xRosters?accessToken=" + token + paging,
	// XRosterCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXRostersByXCourse)
	// {
	// ResponseEntity<XRosterCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xCourses/{refId}/xRosters?accessToken=" + token + paging,
	// XRosterCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXRostersByXStaff)
	// {
	// ResponseEntity<XRosterCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xStaffs/{refId}/xRosters?accessToken=" + token + paging,
	// XRosterCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXRostersByXStudent)
	// {
	// ResponseEntity<XRosterCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xStudents/{refId}/xRosters?accessToken=" + token + paging,
	// XRosterCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXStaffs)
	// {
	// ResponseEntity<XStaffCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl + "xStaffs?accessToken=" + token +
	// paging, XStaffCollectionType.class, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXStaffsByXLea)
	// {
	// ResponseEntity<XStaffCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xLeas/{refId}/xStaffs?accessToken=" + token + paging,
	// XStaffCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXStaffsByXSchool)
	// {
	// ResponseEntity<XStaffCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xSchools/{refId}/xStaffs?accessToken=" + token + paging,
	// XStaffCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXStaffsByXCourse)
	// {
	// ResponseEntity<XStaffCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xCourses/{refId}/xStaffs?accessToken=" + token + paging,
	// XStaffCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXStaffsByXRoster)
	// {
	// ResponseEntity<XStaffCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xRosters/{refId}/xStaffs?accessToken=" + token + paging,
	// XStaffCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXStudents)
	// {
	// ResponseEntity<XStudentCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl + "xStudents?accessToken=" + token +
	// paging, XStudentCollectionType.class, navigationPage,
	// navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXStudentsByXLea)
	// {
	// ResponseEntity<XStudentCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xLeas/{refId}/xStudents?accessToken=" + token + paging,
	// XStudentCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXStudentsByXSchool)
	// {
	// ResponseEntity<XStudentCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xSchools/{refId}/xStudents?accessToken=" + token + paging,
	// XStudentCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXStudentsByXRoster)
	// {
	// ResponseEntity<XStudentCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xRosters/{refId}/xStudents?accessToken=" + token + paging,
	// XStudentCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXStudentsByXStaff)
	// {
	// ResponseEntity<XStudentCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xStaffs/{refId}/xStudents?accessToken=" + token + paging,
	// XStudentCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXStudentsByXContact)
	// {
	// ResponseEntity<XStudentCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xContacts/{refId}/xStudents?accessToken=" + token + paging,
	// XStudentCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXContacts)
	// {
	// ResponseEntity<XContactCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl + "xContacts?accessToken=" + token +
	// paging, XContactCollectionType.class, navigationPage,
	// navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXContactsByXLea)
	// {
	// ResponseEntity<XContactCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xLeas/{refId}/xContacts?accessToken=" + token + paging,
	// XContactCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXContactsByXSchool)
	// {
	// ResponseEntity<XContactCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xSchools/{refId}/xContacts?accessToken=" + token + paging,
	// XContactCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	// else if (p == ServicePath.GetXContactsByXStudent)
	// {
	// ResponseEntity<XContactCollectionType> response =
	// restTemplate.getForEntity(baseApiUrl +
	// "xStudents/{refId}/xContacts?accessToken=" + token + paging,
	// XContactCollectionType.class, refId, navigationPage, navigationPageSize);
	//
	// Util.ResponseHandler(response.getStatusCode());
	//
	// navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	// }
	//
	// //Util.ResponseHandler(response.getStatusCode());
	//
	// //int navigationLastPage =
	// Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
	//
	// return navigationLastPage;
	//
	// }

	// / <summary>
	// / Max page value for specified service path object
	// / </summary>
	// / <param name="navigationPageSize"></param>
	// / <param name="p"></param>
	// / <returns></returns>
	// public int GetLastPage(int navigationPageSize, ServicePath p)
	// {
	// string path = "";
	//
	// if (p == ServicePath.GetXLeas)
	// {
	// path = "xLeas";
	// }
	// else if (p == ServicePath.GetXLeasByXSchool)
	// {
	// path = "xSchools/{refId}/xLeas";
	// }
	// else if (p == ServicePath.GetXLeasByXStudent)
	// {
	// path = "xStudents/{refId}/xLeas";
	// }
	// else if (p == ServicePath.GetXLeasByXContact)
	// {
	// path = "xContacts/{refId}/xLeas";
	// }
	// else if (p == ServicePath.GetXSchools)
	// {
	// path = "xSchools";
	// }
	// else if (p == ServicePath.GetXSchoolsByXLea)
	// {
	// path = "xLeas/{refId}/xSchools";
	// }
	// else if (p == ServicePath.GetXSchoolsByXCalendar)
	// {
	// path = "xCalendars/{refId}/xSchools";
	// }
	// else if (p == ServicePath.GetXSchoolsByXCourse)
	// {
	// path = "xCourses/{refId}/xSchools";
	// }
	// else if (p == ServicePath.GetXSchoolsByXRoster)
	// {
	// path = "xRosters/{refId}/xSchools";
	// }
	// else if (p == ServicePath.GetXSchoolsByXStaff)
	// {
	// path = "xStaffs/{refId}/xSchools";
	// }
	// else if (p == ServicePath.GetXSchoolsByXStudent)
	// {
	// path = "xStudents/{refId}/xSchools";
	// }
	// else if (p == ServicePath.GetXSchoolsByXContact)
	// {
	// path = "xContacts/{refId}/xSchools";
	// }
	// else if (p == ServicePath.GetXCalendars)
	// {
	// path = "xCalendars";
	// }
	// else if (p == ServicePath.GetXCalendarsByXSchool)
	// {
	// path = "xSchools/{refId}/xCalendars";
	// }
	// else if (p == ServicePath.GetXCourses)
	// {
	// path = "xCourses";
	// }
	// else if (p == ServicePath.GetXCoursesByXLea)
	// {
	// path = "xLeas/{refId}/xCourses";
	// }
	// else if (p == ServicePath.GetXRosters)
	// {
	// path = "xRosters";
	// }
	// else if (p == ServicePath.GetXRostersByXLea)
	// {
	// path = "xLeas/{refId}/xRosters";
	// }
	// else if (p == ServicePath.GetXRostersByXSchool)
	// {
	// path = "xSchools/{refId}/xRosters";
	// }
	// else if (p == ServicePath.GetXRostersByXCourse)
	// {
	// path = "xCourses/{refId}/xRosters";
	// }
	// else if (p == ServicePath.GetXRostersByXStaff)
	// {
	// path = "xStaffs/{refId}/xRosters";
	// }
	// else if (p == ServicePath.GetXRostersByXStudent)
	// {
	// path = "xStudents/{refId}/xRosters";
	// }
	// else if (p == ServicePath.GetXStaffs)
	// {
	// path = "xStaffs";
	// }
	// else if (p == ServicePath.GetXStaffsByXLea)
	// {
	// path = "xLeas/{refId}/xStaffs";
	// }
	// else if (p == ServicePath.GetXStaffsByXSchool)
	// {
	// path = "xSchools/{refId}/xStaffs";
	// }
	// else if (p == ServicePath.GetXStaffsByXCourse)
	// {
	// path = "xCourses/{refId}/xStaffs";
	// }
	// else if (p == ServicePath.GetXStaffsByXRoster)
	// {
	// path = "xRosters/{refId}/xStaffs";
	// }
	// else if (p == ServicePath.GetXStudents)
	// {
	// path = "xStudents";
	// }
	// else if (p == ServicePath.GetXStudentsByXLea)
	// {
	// path = "xLeas/{refId}/xStudents";
	// }
	// else if (p == ServicePath.GetXStudentsByXSchool)
	// {
	// path = "xSchools/{refId}/xStudents";
	// }
	// else if (p == ServicePath.GetXStudentsByXRoster)
	// {
	// path = "xRosters/{refId}/xStudents";
	// }
	// else if (p == ServicePath.GetXStudentsByXStaff)
	// {
	// path = "xStaffs/{refId}/xStudents";
	// }
	// else if (p == ServicePath.GetXStudentsByXContact)
	// {
	// path = "xContacts/{refId}/xStudents";
	// }
	// else if (p == ServicePath.GetXContacts)
	// {
	// path = "xContacts";
	// }
	// else if (p == ServicePath.GetXContactsByXLea)
	// {
	// path = "xLeas/{refId}/xContacts";
	// }
	// else if (p == ServicePath.GetXContactsByXSchool)
	// {
	// path = "xSchools/{refId}/xContacts";
	// }
	// else if (p == ServicePath.GetXContactsByXStudent)
	// {
	// path = "xStudents/{refId}/xContacts";
	// }
	//
	// RestRequest request = new RestRequest(path, Method.GET);
	// request.AddHeader("Accept", "application/json");
	//
	// request.AddParameter("navigationPage", 1);
	// request.AddParameter("navigationPageSize", navigationPageSize);
	//
	// var response = restClient.Execute(request);
	//
	// int navigationLastPage = Int32.Parse(response.Headers.ToList()
	// .Find(x => x.Name == "navigationLastPage")
	// .Value.ToString());
	//
	// Util.ResponseHandler(response);
	//
	// return navigationLastPage;
	// }

}
