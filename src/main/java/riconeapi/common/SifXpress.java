/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.1.3.1
 * @since       Feb 08, 2016
 * Filename		SifXpress.java
 */

package riconeapi.common;

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

/**
 * Static class built off of RICOne client to allow access to SIFxPress data model objects
 * 
 */
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
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas?access_token=" + token + paging, XLeaCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());
		
		if(response.getBody() != null)
		{
			return response.getBody().getXLea();
		}
		else
		{
			return null;
		}
	}

	/**
	 * @return All Leas
	 */
	public List<XLeaType> GetXLeas()
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas?access_token=" + token, XLeaCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());
		
		if(response.getBody() != null)
		{
			return response.getBody().getXLea();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XLeaType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}?access_token=" + token + paging, XLeaType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Lea by refId
	 */
	public XLeaType GetXLea(String refId)
	{
		ResponseEntity<XLeaType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}?access_token=" + token, XLeaType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xLeas?access_token=" + token + paging, XLeaCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXLea();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific School by refId
	 */
	public List<XLeaType> GetXLeasByXSchool(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xLeas?access_token=" + token, XLeaCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXLea();
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Roster by refId with paging
	 */
	public List<XLeaType> GetXLeasByXRoster(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xLeas?access_token=" + token + paging, XLeaCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXLea();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Roster by refId
	 */
	public List<XLeaType> GetXLeasByXRoster(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xLeas?access_token=" + token, XLeaCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXLea();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Staff by refId with paging
	 */
	public List<XLeaType> GetXLeasByXStaff(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xLeas?access_token=" + token + paging, XLeaCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXLea();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Staff by refId
	 */
	public List<XLeaType> GetXLeasByXStaff(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xLeas?access_token=" + token, XLeaCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXLea();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xLeas?access_token=" + token + paging, XLeaCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXLea();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Student by refId
	 */
	public List<XLeaType> GetXLeasByXStudent(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xLeas?access_token=" + token, XLeaCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXLea();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}/xLeas?access_token=" + token + paging, XLeaCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXLea();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Contact by refId
	 */
	public List<XLeaType> GetXLeasByXContact(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}/xLeas?access_token=" + token, XLeaCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXLea();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools?access_token=" + token + paging, XSchoolCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @return All Schools
	 */
	public List<XSchoolType> GetXSchools()
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools?access_token=" + token, XSchoolCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XSchoolType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}?access_token=" + token + paging, XSchoolType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single School by refId
	 */
	public XSchoolType GetXSchool(String refId)
	{
		ResponseEntity<XSchoolType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}?access_token=" + token, XSchoolType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xSchools?access_token=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Lea by refId
	 */
	public List<XSchoolType> GetXSchoolsByXLea(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xSchools?access_token=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCalendars/{refId}/xSchools?access_token=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Calendar by refId
	 */
	public List<XSchoolType> GetXSchoolsByXCalendar(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCalendars/{refId}/xSchools?access_token=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}/xSchools?access_token=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Course by refId
	 */
	public List<XSchoolType> GetXSchoolsByXCourse(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}/xSchools?access_token=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xSchools?access_token=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Roster by refId
	 */
	public List<XSchoolType> GetXSchoolsByXRoster(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xSchools?access_token=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xSchools?access_token=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Staff by refId
	 */
	public List<XSchoolType> GetXSchoolsByXStaff(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xSchools?access_token=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xSchools?access_token=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Student by refId
	 */
	public List<XSchoolType> GetXSchoolsByXStudent(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xSchools?access_token=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}/xSchools?access_token=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Contact by refId
	 */
	public List<XSchoolType> GetXSchoolsByXContact(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}/xSchools?access_token=" + token, XSchoolCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXSchool();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCalendars?access_token=" + token + paging, XCalendarCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());
		
		if(response.getBody() != null)
		{
			return response.getBody().getXCalendar();
		}
		else
		{
			return null;
		}	
	}

	/**
	 * 
	 * @return All Calendars
	 */
	public List<XCalendarType> GetXCalendars()
	{
		ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCalendars?access_token=" + token, XCalendarCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCalendar();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XCalendarType> response = restTemplate.getForEntity(baseApiUrl + "xCalendars/{refId}?access_token=" + token + paging, XCalendarType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Calendar by refId
	 */
	public XCalendarType GetXCalendar(String refId)
	{
		ResponseEntity<XCalendarType> response = restTemplate.getForEntity(baseApiUrl + "xCalendars/{refId}?access_token=" + token, XCalendarType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Calendars associated to a specific Lea by refId with paging
	 */
	public List<XCalendarType> GetXCalendarsByXLea(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xCalendars?access_token=" + token + paging, XCalendarCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCalendar();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Calendars associated to a specific Lea by refId
	 */
	public List<XCalendarType> GetXCalendarsByXLea(String refId)
	{
		ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xCalendars?access_token=" + token, XCalendarCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCalendar();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xCalendars?access_token=" + token + paging, XCalendarCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCalendar();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Calendars associated to a specific School by refId
	 */
	public List<XCalendarType> GetXCalendarsByXSchool(String refId)
	{
		ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xCalendars?access_token=" + token, XCalendarCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCalendar();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses?access_token=" + token + paging, XCourseCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCourse();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @return All Courses
	 */
	public List<XCourseType> GetXCourses()
	{
		ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses?access_token=" + token, XCourseCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCourse();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XCourseType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}?access_token=" + token + paging, XCourseType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Course by refId
	 */
	public XCourseType GetXCourse(String refId)
	{
		ResponseEntity<XCourseType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}?access_token=" + token, XCourseType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xCourses?access_token=" + token + paging, XCourseCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCourse();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Courses associated to a specific Lea by refId
	 */
	public List<XCourseType> GetXCoursesByXLea(String refId)
	{
		ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xCourses?access_token=" + token, XCourseCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCourse();
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Courses associated to a specific School by refId with paging
	 */
	public List<XCourseType> GetXCoursesByXSchool(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xCourses?access_token=" + token + paging, XCourseCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCourse();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Courses associated to a specific School by refId
	 */
	public List<XCourseType> GetXCoursesByXSchool(String refId)
	{
		ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xCourses?access_token=" + token, XCourseCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCourse();
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Courses associated to a specific Roster by refId with paging
	 */
	public List<XCourseType> GetXCoursesByXRoster(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xCourses?access_token=" + token + paging, XCourseCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCourse();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Courses associated to a specific Roster by refId
	 */
	public List<XCourseType> GetXCoursesByXRoster(String refId)
	{
		ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xCourses?access_token=" + token, XCourseCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXCourse();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters?access_token=" + token + paging, XRosterCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXRoster();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @return All Rosters
	 */
	public List<XRosterType> GetXRosters()
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters?access_token=" + token, XRosterCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXRoster();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XRosterType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}?access_token=" + token + paging, XRosterType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Roster by refId
	 */
	public XRosterType GetXRoster(String refId)
	{
		ResponseEntity<XRosterType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}?access_token=" + token, XRosterType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xRosters?access_token=" + token + paging, XRosterCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXRoster();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Lea by refId
	 */
	public List<XRosterType> GetXRostersByXLea(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xRosters?access_token=" + token, XRosterCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXRoster();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xRosters?access_token=" + token + paging, XRosterCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXRoster();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific School by refId
	 */
	public List<XRosterType> GetXRostersByXSchool(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xRosters?access_token=" + token, XRosterCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXRoster();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}/xRosters?access_token=" + token + paging, XRosterCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXRoster();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Course by refId
	 */
	public List<XRosterType> GetXRostersByXCourse(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}/xRosters?access_token=" + token, XRosterCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXRoster();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xRosters?access_token=" + token + paging, XRosterCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXRoster();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Staff by refId
	 */
	public List<XRosterType> GetXRostersByXStaff(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xRosters?access_token=" + token, XRosterCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXRoster();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xRosters?access_token=" + token + paging, XRosterCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXRoster();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Student by refId
	 */
	public List<XRosterType> GetXRostersByXStudent(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xRosters?access_token=" + token, XRosterCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXRoster();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs?access_token=" + token + paging, XStaffCollectionType.class, navigationPage, navigationPageSize);
		
		Util.ResponseHandler(response.getStatusCode());
		
		if(response.getBody() != null)
		{
			return response.getBody().getXStaff();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @return All Staffs
	 */
	public List<XStaffType> GetXStaffs()
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs?access_token=" + token, XStaffCollectionType.class);
		
		Util.ResponseHandler(response.getStatusCode());
		
		if(response.getBody() != null)
		{
			return response.getBody().getXStaff();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStaffType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}?access_token=" + token + paging, XStaffType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Staffs by refId
	 */
	public XStaffType GetXStaff(String refId)
	{
		ResponseEntity<XStaffType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}?access_token=" + token, XStaffType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xStaffs?access_token=" + token + paging, XStaffCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStaff();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Lea by refId
	 */
	public List<XStaffType> GetXStaffsByXLea(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xStaffs?access_token=" + token, XStaffCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStaff();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xStaffs?access_token=" + token + paging, XStaffCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStaff();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific School by refId
	 */
	public List<XStaffType> GetXStaffsByXSchool(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xStaffs?access_token=" + token, XStaffCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStaff();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}/xStaffs?access_token=" + token + paging, XStaffCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStaff();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Course by refId
	 */
	public List<XStaffType> GetXStaffsByXCourse(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xCourses/{refId}/xStaffs?access_token=" + token, XStaffCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStaff();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xStaffs?access_token=" + token + paging, XStaffCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStaff();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Roster by refId
	 */
	public List<XStaffType> GetXStaffsByXRoster(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xStaffs?access_token=" + token, XStaffCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStaff();
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific Student by refId with paging
	 */
	public List<XStaffType> GetXStaffsByXStudent(String refId, Integer navigationPage, Integer navigationPageSize)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xStaffs?access_token=" + token + paging, XStaffCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStaff();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Student by refId
	 */
	public List<XStaffType> GetXStaffsByXStudent(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xStaffs?access_token=" + token, XStaffCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStaff();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents?access_token=" + token + paging, XStudentCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStudent();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @return All Students
	 */
	public List<XStudentType> GetXStudents()
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents?access_token=" + token, XStudentCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{	
			return response.getBody().getXStudent();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStudentType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}?access_token=" + token + paging, XStudentType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Student by refId
	 */
	public XStudentType GetXStudent(String refId)
	{
		ResponseEntity<XStudentType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}?access_token=" + token, XStudentType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xStudents?access_token=" + token + paging, XStudentCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStudent();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Lea by refId
	 */
	public List<XStudentType> GetXStudentsByXLea(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xStudents?access_token=" + token, XStudentCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStudent();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xStudents?access_token=" + token + paging, XStudentCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStudent();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific School by refId
	 */
	public List<XStudentType> GetXStudentsByXSchool(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xStudents?access_token=" + token, XStudentCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStudent();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xStudents?access_token=" + token + paging, XStudentCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStudent();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Roster by refId
	 */
	public List<XStudentType> GetXStudentsByXRoster(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xRosters/{refId}/xStudents?access_token=" + token, XStudentCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStudent();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xStudents?access_token=" + token + paging, XStudentCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStudent();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Staff by refId
	 */
	public List<XStudentType> GetXStudentsByXStaff(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStaffs/{refId}/xStudents?access_token=" + token, XStudentCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStudent();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}/xStudents?access_token=" + token + paging, XStudentCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStudent();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Contact by refId
	 */
	public List<XStudentType> GetXStudentsByXContact(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}/xStudents?access_token=" + token, XStudentCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXStudent();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts?access_token=" + token + paging, XContactCollectionType.class, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXContact();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @return All Contacts
	 */
	public List<XContactType> GetXContacts()
	{
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xContacts?access_token=" + token, XContactCollectionType.class);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXContact();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XContactType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}?access_token=" + token + paging, XContactType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Contact by refId
	 */
	public XContactType GetXContact(String refId)
	{
		ResponseEntity<XContactType> response = restTemplate.getForEntity(baseApiUrl + "xContacts/{refId}?access_token=" + token, XContactType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xContacts?access_token=" + token + paging, XContactCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXContact();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Contacts associated to a specific Lea by refId
	 */
	public List<XContactType> GetXContactsByXLea(String refId)
	{
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xLeas/{refId}/xContacts?access_token=" + token, XContactCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXContact();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xContacts?access_token=" + token + paging, XContactCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXContact();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Contacts associated to a specific School by refId
	 */
	public List<XContactType> GetXContactsByXSchool(String refId)
	{
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xSchools/{refId}/xContacts?access_token=" + token, XContactCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXContact();
		}
		else
		{
			return null;
		}
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
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xContacts?access_token=" + token + paging, XContactCollectionType.class, refId, navigationPage, navigationPageSize);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXContact();
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Contacts associated to a specific Student by refId
	 */
	public List<XContactType> GetXContactsByXStudent(String refId)
	{
		ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + "xStudents/{refId}/xContacts?access_token=" + token, XContactCollectionType.class, refId);

		Util.ResponseHandler(response.getStatusCode());

		if(response.getBody() != null)
		{
			return response.getBody().getXContact();
		}
		else
		{
			return null;
		}
	}

	// #################### navigationLastPage ####################
	/**
	 * Enumerator used to retrieve service path object for max page size
	 *
	 */
	public enum ServicePath
	{
		GetXLeas("xLeas"), GetXLeasByXSchool("xSchools/{refId}/xLeas"), GetXLeasByXRoster("xRosters/{refId}/xLeas"), GetXLeasByXStaff("xStaffs/{refId}/xLeas"), GetXLeasByXStudent("xStudents/{refId}/xLeas"), GetXLeasByXContact("xContacts/{refId}/xLeas"), GetXSchools("xSchools"), GetXSchoolsByXLea("xLeas/{refId}/xSchools"), GetXSchoolsByXCalendar("xCalendars/{refId}/xSchools"), GetXSchoolsByXCourse(
				"xCourses/{refId}/xSchools"), GetXSchoolsByXRoster("xRosters/{refId}/xSchools"), GetXSchoolsByXStaff("xStaffs/{refId}/xSchools"), GetXSchoolsByXStudent("xStudents/{refId}/xSchools"), GetXSchoolsByXContact("xContacts/{refId}/xSchools"), GetXCalendars("xCalendars"), GetXCalendarsByXLea("xLeas/{refId}/xCalendars"), GetXCalendarsByXSchool(
				"xSchools/{refId}/xCalendars"), GetXCourses("xCourses"), GetXCoursesByXLea("xLeas/{refId}/xCourses"), GetXCoursesByXSchool("xSchools/{refId}/xCourses"), GetXCoursesByXRoster("xRosters/{refId}/xCourses"), GetXRosters("xRosters"), GetXRostersByXLea("xLeas/{refId}/xRosters"), GetXRostersByXSchool("xSchools/{refId}/xRosters"), GetXRostersByXCourse("xCourses/{refId}/xRosters"), GetXRostersByXStaff(
				"xStaffs/{refId}/xRosters"), GetXRostersByXStudent("xStudents/{refId}/xRosters"), GetXStaffs("xStaffs"), GetXStaffsByXLea("xLeas/{refId}/xStaffs"), GetXStaffsByXSchool("xSchools/{refId}/xStaffs"), GetXStaffsByXCourse("xCourses/{refId}/xStaffs"), GetXStaffsByXRoster(
				"xRosters/{refId}/xStaffs"), GetXStaffsByXStudent("xStudents/{refId}/xStaffs"), GetXStudents("xStudents"), GetXStudentsByXLea("xLeas/{refId}/xStudents"), GetXStudentsByXSchool("xSchools/{refId}/xStudents"), GetXStudentsByXRoster("xRosters/{refId}/xStudents"), GetXStudentsByXStaff("xStaffs/{refId}/xStudents"), GetXStudentsByXContact(
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

		if (p.name().equals("GetXLeasByXSchool") || p.name().equals("GetXLeasByXRoster") || p.name().equals("GetXLeasByXStaff") || p.name().equals("GetXLeasByXStudent") || p.name().equals("GetXLeasByXContact"))
		{
			ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XLeaCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXSchoolsByXLea") || p.name().equals("GetXSchoolsByXCalendar") || p.name().equals("GetXSchoolsByXCourse") || p.name().equals("GetXSchoolsByXRoster") || p.name().equals("GetXSchoolsByXStaff") || p.name().equals("GetXSchoolsByXStudent")
				|| p.name().equals("GetXSchoolsByXContact"))
		{
			ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XSchoolCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXCalendarsByXLea") || p.name().equals("GetXCalendarsByXSchool"))
		{
			ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XCalendarCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXCoursesByXLea") || p.name().equals("GetXCoursesByXSchool") || p.name().equals("GetXCoursesByXRoster"))
		{
			ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XCourseCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXRostersByXLea") || p.name().equals("GetXRostersByXSchool") || p.name().equals("GetXRostersByXCourse") || p.name().equals("GetXRostersByXStaff") || p.name().equals("GetXRostersByXStudent"))
		{
			ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XRosterCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXStaffsByXLea") || p.name().equals("GetXStaffsByXSchool") || p.name().equals("GetXStaffsByXCourse") || p.name().equals("GetXStaffsByXRoster") || p.name().equals("GetXStaffsByXStudent"))
		{
			ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XStaffCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXStudentsByXLea") || p.name().equals("GetXStudentsByXSchool") || p.name().equals("GetXStudentsByXRoster") || p.name().equals("GetXStudentsByXStaff") || p.name().equals("GetXStudentsByXContact"))
		{
			ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XStudentCollectionType.class, refId, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXContactsByXLea") || p.name().equals("GetXContactsByXSchool") || p.name().equals("GetXContactsByXStudent"))
		{
			ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XContactCollectionType.class, refId, navigationPage, navigationPageSize);

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
			ResponseEntity<XLeaCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XLeaCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXSchools"))
		{
			ResponseEntity<XSchoolCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XSchoolCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXCalendars"))
		{
			ResponseEntity<XCalendarCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XCalendarCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXCourses"))
		{
			ResponseEntity<XCourseCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XCourseCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXRosters"))
		{
			ResponseEntity<XRosterCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XRosterCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXStaffs"))
		{
			ResponseEntity<XStaffCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XStaffCollectionType.class, navigationPage, navigationPageSize);
			
			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			
//			System.out.println(restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XStaffCollectionType.class, navigationPage, navigationPageSize).toString());
//			System.out.println(response.getHeaders().toString());
//			System.out.println(baseApiUrl + p.value + "?access_token=" + token + paging);
//			System.out.println(navigationLastPage);
			
		}
		else if (p.name().equals("GetXStudents"))
		{
			ResponseEntity<XStudentCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XStudentCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}
		else if (p.name().equals("GetXContacts"))
		{
			ResponseEntity<XContactCollectionType> response = restTemplate.getForEntity(baseApiUrl + p.value + "?access_token=" + token + paging, XContactCollectionType.class, navigationPage, navigationPageSize);

			Util.ResponseHandler(response.getStatusCode());

			navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
		}

		return navigationLastPage;
	}

}
