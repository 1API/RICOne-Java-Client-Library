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
	public List<XLeaType> GetXLeas(String navigationPage, String navigationPageSize)
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
	public XLeaType GetXLea(String refId, String navigationPage, String navigationPageSize)
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
	public List<XLeaType> GetXLeasByXSchool(String refId, String navigationPage, String navigationPageSize)
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
	public List<XLeaType> GetXLeasByXStudent(String refId, String navigationPage, String navigationPageSize)
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
	public List<XLeaType> GetXLeasByXContact(String refId, String navigationPage, String navigationPageSize)
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
	public List<XSchoolType> GetXSchools(String navigationPage, String navigationPageSize)
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
	public XSchoolType GetXSchool(String refId, String navigationPage, String navigationPageSize)
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
	public List<XSchoolType> GetXSchoolsByXLea(String refId, String navigationPage, String navigationPageSize)
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
	public List<XSchoolType> GetXSchoolsByXCalendar(String refId, String navigationPage, String navigationPageSize)
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
	public List<XSchoolType> GetXSchoolsByXCourse(String refId, String navigationPage, String navigationPageSize)
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
	public List<XSchoolType> GetXSchoolsByXRoster(String refId, String navigationPage, String navigationPageSize)
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
	public List<XSchoolType> GetXSchoolsByXStaff(String refId, String navigationPage, String navigationPageSize)
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
	public List<XSchoolType> GetXSchoolsByXStudent(String refId, String navigationPage, String navigationPageSize)
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
	public List<XSchoolType> GetXSchoolsByXContact(String refId, String navigationPage, String navigationPageSize)
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
	public List<XCalendarType> GetXCalendars(String navigationPage, String navigationPageSize)
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
	public XCalendarType GetXCalendar(String refId, String navigationPage, String navigationPageSize)
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
	public List<XCalendarType> GetXCalendarsByXSchool(String refId, String navigationPage, String navigationPageSize)
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
	public List<XCourseType> GetXCourses(String navigationPage, String navigationPageSize)
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
	public XCourseType GetXCourse(String refId, String navigationPage, String navigationPageSize)
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
	public List<XCourseType> GetXCoursesByXLea(String refId, String navigationPage, String navigationPageSize)
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
	public List<XRosterType> GetXRosters(String navigationPage, String navigationPageSize)
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
	public XRosterType GetXRoster(String refId, String navigationPage, String navigationPageSize)
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
	public List<XRosterType> GetXRostersByXLea(String refId, String navigationPage, String navigationPageSize)
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
	public List<XRosterType> GetXRostersByXSchool(String refId, String navigationPage, String navigationPageSize)
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
	public List<XRosterType> GetXRostersByXCourse(String refId, String navigationPage, String navigationPageSize)
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
	public List<XRosterType> GetXRostersByXStaff(String refId, String navigationPage, String navigationPageSize)
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
	public List<XRosterType> GetXRostersByXStudent(String refId, String navigationPage, String navigationPageSize)
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
	public List<XStaffType> GetXStaffs(String navigationPage, String navigationPageSize)
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
	public XStaffType GetXStaff(String refId, String navigationPage, String navigationPageSize)
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
	public List<XStaffType> GetXStaffsByXLea(String refId, String navigationPage, String navigationPageSize)
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
	public List<XStaffType> GetXStaffsByXSchool(String refId, String navigationPage, String navigationPageSize)
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
	public List<XStaffType> GetXStaffsByXCourse(String refId, String navigationPage, String navigationPageSize)
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
	public List<XStaffType> GetXStaffsByXRoster(String refId, String navigationPage, String navigationPageSize)
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
	public List<XStudentType> GetXStudents(String navigationPage, String navigationPageSize)
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
	public XStudentType GetXStudent(String refId, String navigationPage, String navigationPageSize)
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
	public List<XStudentType> GetXStudentsByXLea(String refId, String navigationPage, String navigationPageSize)
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
	public List<XStudentType> GetXStudentsByXSchool(String refId, String navigationPage, String navigationPageSize)
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
	public List<XStudentType> GetXStudentsByXRoster(String refId, String navigationPage, String navigationPageSize)
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
	public List<XStudentType> GetXStudentsByXStaff(String refId, String navigationPage, String navigationPageSize)
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
	public List<XStudentType> GetXStudentsByXContact(String refId, String navigationPage, String navigationPageSize)
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
	public List<XContactType> GetXContacts(String navigationPage, String navigationPageSize)
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
	public XContactType GetXContact(String refId, String navigationPage, String navigationPageSize)
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
	public List<XContactType> GetXContactsByXLea(String refId, String navigationPage, String navigationPageSize)
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
	public List<XContactType> GetXContactsByXSchool(String refId, String navigationPage, String navigationPageSize)
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
	public List<XContactType> GetXContactsByXStudent(String refId, String navigationPage, String navigationPageSize)
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
	
	
}
