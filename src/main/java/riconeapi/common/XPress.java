/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.2
 * @since       Feb 08, 2016
 * Filename		XPress.java
 */

package riconeapi.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import riconeapi.models.xpress.XCalendarCollectionType;
import riconeapi.models.xpress.XCalendarType;
import riconeapi.models.xpress.XContactCollectionType;
import riconeapi.models.xpress.XContactType;
import riconeapi.models.xpress.XCourseCollectionType;
import riconeapi.models.xpress.XCourseType;
import riconeapi.models.xpress.XLeaCollectionType;
import riconeapi.models.xpress.XLeaType;
import riconeapi.models.xpress.XRosterCollectionType;
import riconeapi.models.xpress.XRosterType;
import riconeapi.models.xpress.XSchoolCollectionType;
import riconeapi.models.xpress.XSchoolType;
import riconeapi.models.xpress.XStaffCollectionType;
import riconeapi.models.xpress.XStaffType;
import riconeapi.models.xpress.XStudentCollectionType;
import riconeapi.models.xpress.XStudentType;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

/**
 * Static class built off of RICOne client to allow access to SIFxPress data model objects
 * 
 */
public class XPress
{
	private String token;
	private RestTemplate rt;
	private String baseApiUrl;

	public XPress(String token, String baseApiUrl, RestTemplate rt)
	{
		this.token = token;
		this.baseApiUrl = baseApiUrl;
		this.rt = rt;
	}

	// #################### xLeas ####################
	/**
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Leas with paging
	 */
	public RestResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
    		headers.set("Authorization", "Bearer " + this.token);
    		headers.set("navigationPage", Integer.toString(navigationPage));
    		headers.set("navigationPageSize", Integer.toString(navigationPageSize));
    		//headers.set("Content-Type", "application/json");
			
    		HttpEntity<?> entity = new HttpEntity<Object>(headers);

			ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + "xLeas", HttpMethod.GET, entity, XLeaCollectionType.class);
			
			RestResponseMulti<XLeaType> output = new RestResponseMulti<XLeaType>();
			output.setData(response.getBody().getXLea());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XLeaType>();
		}
	}

	/**
	 * @return All Leas
	 */
	public RestResponseMulti<XLeaType> getXLeas()
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			////headers.set("Content-Type", "application/json");
			
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + "xLeas.json", HttpMethod.GET, entity, XLeaCollectionType.class);
			
			RestResponseMulti<XLeaType> output = new RestResponseMulti<XLeaType>();
			output.setData(response.getBody().getXLea());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XLeaType>();
		}	
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Lea by refId with paging
	 */
	public RestResponseSingle<XLeaType> getXLea(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaType> response = rt.exchange(baseApiUrl + "xLeas/{refId}", HttpMethod.GET, entity, XLeaType.class, refId);

			RestResponseSingle<XLeaType> output = new RestResponseSingle<XLeaType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XLeaType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Lea by refId
	 */
	public RestResponseSingle<XLeaType> getXLea(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaType> response = rt.exchange(baseApiUrl + "xLeas/{refId}", HttpMethod.GET, entity, XLeaType.class, refId);

			RestResponseSingle<XLeaType> output = new RestResponseSingle<XLeaType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XLeaType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific School by refId with paging
	 */
	public RestResponseMulti<XLeaType> getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			RestResponseMulti<XLeaType> output = new RestResponseMulti<XLeaType>();
			output.setData(response.getBody().getXLea());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XLeaType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific School by refId
	 */
	public RestResponseMulti<XLeaType> getXLeasByXSchool(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			RestResponseMulti<XLeaType> output = new RestResponseMulti<XLeaType>();
			output.setData(response.getBody().getXLea());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XLeaType>();
		}
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Roster by refId with paging
	 */
	public RestResponseMulti<XLeaType> getXLeasByXRoster(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + "xRosters/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			RestResponseMulti<XLeaType> output = new RestResponseMulti<XLeaType>();
			output.setData(response.getBody().getXLea());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XLeaType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Roster by refId
	 */
	public RestResponseMulti<XLeaType> getXLeasByXRoster(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + "xRosters/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			RestResponseMulti<XLeaType> output = new RestResponseMulti<XLeaType>();
			output.setData(response.getBody().getXLea());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XLeaType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Staff by refId with paging
	 */
	public RestResponseMulti<XLeaType> getXLeasByXStaff(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			RestResponseMulti<XLeaType> output = new RestResponseMulti<XLeaType>();
			output.setData(response.getBody().getXLea());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XLeaType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Staff by refId
	 */
	public RestResponseMulti<XLeaType> getXLeasByXStaff(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			RestResponseMulti<XLeaType> output = new RestResponseMulti<XLeaType>();
			output.setData(response.getBody().getXLea());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XLeaType>();
		}
	}
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Student by refId with paging
	 */
	public RestResponseMulti<XLeaType> getXLeasByXStudent(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + "xStudents/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			RestResponseMulti<XLeaType> output = new RestResponseMulti<XLeaType>();
			output.setData(response.getBody().getXLea());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XLeaType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Student by refId
	 */
	public RestResponseMulti<XLeaType> getXLeasByXStudent(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + "xStudents/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			RestResponseMulti<XLeaType> output = new RestResponseMulti<XLeaType>();
			output.setData(response.getBody().getXLea());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XLeaType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Contact by refId with paging
	 */
	public RestResponseMulti<XLeaType> getXLeasByXContact(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + "xContacts/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			RestResponseMulti<XLeaType> output = new RestResponseMulti<XLeaType>();
			output.setData(response.getBody().getXLea());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XLeaType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Contact by refId
	 */
	public RestResponseMulti<XLeaType> getXLeasByXContact(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + "xContacts/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			RestResponseMulti<XLeaType> output = new RestResponseMulti<XLeaType>();
			output.setData(response.getBody().getXLea());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XLeaType>();
		}
	}

	// #################### xSchools ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Schools with paging
	 */
	public RestResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @return All Schools
	 */
	public RestResponseMulti<XSchoolType> getXSchools()
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}		
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single School by refId with paging
	 */
	public RestResponseSingle<XSchoolType> getXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");
			
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolType> response = rt.exchange(baseApiUrl + "xSchools/{refId}", HttpMethod.GET, entity, XSchoolType.class, refId);

			RestResponseSingle<XSchoolType> output = new RestResponseSingle<XSchoolType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single School by refId
	 */
	public RestResponseSingle<XSchoolType> getXSchool(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolType> response = rt.exchange(baseApiUrl + "xSchools/{refId}", HttpMethod.GET, entity, XSchoolType.class, refId);

			RestResponseSingle<XSchoolType> output = new RestResponseSingle<XSchoolType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Lea by refId with paging
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Lea by refId
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXLea(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Calendar by refId with paging
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xCalendars/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Calendar by refId
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xCalendars/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Course by refId with paging
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{	
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xCourses/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Course by refId
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xCourses/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Roster by refId with paging
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xRosters/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Roster by refId
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xRosters/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Staff by refId with paging
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Staff by refId
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Student by refId with paging
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xStudents/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Student by refId
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xStudents/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Contact by refId with paging
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xContacts/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Contact by refId
	 */
	public RestResponseMulti<XSchoolType> getXSchoolsByXContact(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + "xContacts/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			RestResponseMulti<XSchoolType> output = new RestResponseMulti<XSchoolType>();
			output.setData(response.getBody().getXSchool());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XSchoolType>();
		}
	}

	// #################### xCalendars ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Calendars with paging
	 */
	public RestResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCalendarCollectionType> response = rt.exchange(baseApiUrl + "xCalendars", HttpMethod.GET, entity, XCalendarCollectionType.class);

			RestResponseMulti<XCalendarType> output = new RestResponseMulti<XCalendarType>();
			output.setData(response.getBody().getXCalendar());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCalendarType>();
		}
	}

	/**
	 * 
	 * @return All Calendars
	 */
	public RestResponseMulti<XCalendarType> getXCalendars()
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCalendarCollectionType> response = rt.exchange(baseApiUrl + "xCalendars", HttpMethod.GET, entity, XCalendarCollectionType.class);

			RestResponseMulti<XCalendarType> output = new RestResponseMulti<XCalendarType>();
			output.setData(response.getBody().getXCalendar());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCalendarType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Calendar by refId with paging
	 */
	public RestResponseSingle<XCalendarType> getXCalendar(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCalendarType> response = rt.exchange(baseApiUrl + "xCalendars/{refId}", HttpMethod.GET, entity, XCalendarType.class, refId);

			RestResponseSingle<XCalendarType> output = new RestResponseSingle<XCalendarType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XCalendarType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Calendar by refId
	 */
	public RestResponseSingle<XCalendarType> getXCalendar(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCalendarType> response = rt.exchange(baseApiUrl + "xCalendars/{refId}", HttpMethod.GET, entity, XCalendarType.class, refId);

			RestResponseSingle<XCalendarType> output = new RestResponseSingle<XCalendarType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XCalendarType>();
		}
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Calendars associated to a specific Lea by refId with paging
	 */
	public RestResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCalendarCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xCalendars", HttpMethod.GET, entity, XCalendarCollectionType.class, refId);

			RestResponseMulti<XCalendarType> output = new RestResponseMulti<XCalendarType>();
			output.setData(response.getBody().getXCalendar());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCalendarType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Calendars associated to a specific Lea by refId
	 */
	public RestResponseMulti<XCalendarType> getXCalendarsByXLea(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCalendarCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xCalendars", HttpMethod.GET, entity, XCalendarCollectionType.class, refId);

			RestResponseMulti<XCalendarType> output = new RestResponseMulti<XCalendarType>();
			output.setData(response.getBody().getXCalendar());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCalendarType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Calendars associated to a specific School by refId with paging
	 */
	public RestResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCalendarCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xCalendars", HttpMethod.GET, entity, XCalendarCollectionType.class, refId);

			RestResponseMulti<XCalendarType> output = new RestResponseMulti<XCalendarType>();
			output.setData(response.getBody().getXCalendar());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCalendarType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Calendars associated to a specific School by refId
	 */
	public RestResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCalendarCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xCalendars", HttpMethod.GET, entity, XCalendarCollectionType.class, refId);

			RestResponseMulti<XCalendarType> output = new RestResponseMulti<XCalendarType>();
			output.setData(response.getBody().getXCalendar());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCalendarType>();
		}
	}

	// #################### xCourses ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Courses with paging
	 */
	public RestResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + "xCourses", HttpMethod.GET, entity, XCourseCollectionType.class);

			RestResponseMulti<XCourseType> output = new RestResponseMulti<XCourseType>();
			output.setData(response.getBody().getXCourse());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCourseType>();
		}
	}

	/**
	 * 
	 * @return All Courses
	 */
	public RestResponseMulti<XCourseType> getXCourses()
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + "xCourses", HttpMethod.GET, entity, XCourseCollectionType.class);

			RestResponseMulti<XCourseType> output = new RestResponseMulti<XCourseType>();
			output.setData(response.getBody().getXCourse());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCourseType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Course by refId with paging
	 */
	public RestResponseSingle<XCourseType> getXCourse(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCourseType> response = rt.exchange(baseApiUrl + "xCourses/{refId}", HttpMethod.GET, entity, XCourseType.class, refId);

			RestResponseSingle<XCourseType> output = new RestResponseSingle<XCourseType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XCourseType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Course by refId
	 */
	public RestResponseSingle<XCourseType> getXCourse(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCourseType> response = rt.exchange(baseApiUrl + "xCourses/{refId}", HttpMethod.GET, entity, XCourseType.class, refId);

			RestResponseSingle<XCourseType> output = new RestResponseSingle<XCourseType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XCourseType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Courses associated to a specific Lea by refId with paging
	 */
	public RestResponseMulti<XCourseType> getXCoursesByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionType.class, refId);

			RestResponseMulti<XCourseType> output = new RestResponseMulti<XCourseType>();
			output.setData(response.getBody().getXCourse());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCourseType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Courses associated to a specific Lea by refId
	 */
	public RestResponseMulti<XCourseType> getXCoursesByXLea(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionType.class, refId);

			RestResponseMulti<XCourseType> output = new RestResponseMulti<XCourseType>();
			output.setData(response.getBody().getXCourse());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCourseType>();
		}
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Courses associated to a specific School by refId with paging
	 */
	public RestResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionType.class, refId);

			RestResponseMulti<XCourseType> output = new RestResponseMulti<XCourseType>();
			output.setData(response.getBody().getXCourse());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCourseType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Courses associated to a specific School by refId
	 */
	public RestResponseMulti<XCourseType> getXCoursesByXSchool(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionType.class, refId);

			RestResponseMulti<XCourseType> output = new RestResponseMulti<XCourseType>();
			output.setData(response.getBody().getXCourse());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCourseType>();
		}
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Courses associated to a specific Roster by refId with paging
	 */
	public RestResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + "xRosters/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionType.class, refId);

			RestResponseMulti<XCourseType> output = new RestResponseMulti<XCourseType>();
			output.setData(response.getBody().getXCourse());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCourseType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Courses associated to a specific Roster by refId
	 */
	public RestResponseMulti<XCourseType> getXCoursesByXRoster(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + "xRosters/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionType.class, refId);

			RestResponseMulti<XCourseType> output = new RestResponseMulti<XCourseType>();
			output.setData(response.getBody().getXCourse());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XCourseType>();
		}
	}

	// #################### xRosters ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Rosters with paging
	 */
	public RestResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + "xRosters", HttpMethod.GET, entity, XRosterCollectionType.class);

			RestResponseMulti<XRosterType> output = new RestResponseMulti<XRosterType>();
			output.setData(response.getBody().getXRoster());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XRosterType>();
		}
	}

	/**
	 * 
	 * @return All Rosters
	 */
	public RestResponseMulti<XRosterType> getXRosters()
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + "xRosters", HttpMethod.GET, entity, XRosterCollectionType.class);

			RestResponseMulti<XRosterType> output = new RestResponseMulti<XRosterType>();
			output.setData(response.getBody().getXRoster());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XRosterType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Roster by refId with paging
	 */
	public RestResponseSingle<XRosterType> getXRoster(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterType> response = rt.exchange(baseApiUrl + "xRosters/{refId}", HttpMethod.GET, entity, XRosterType.class, refId);

			RestResponseSingle<XRosterType> output = new RestResponseSingle<XRosterType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XRosterType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Roster by refId
	 */
	public RestResponseSingle<XRosterType> getXRoster(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterType> response = rt.exchange(baseApiUrl + "xRosters/{refId}", HttpMethod.GET, entity, XRosterType.class, refId);

			RestResponseSingle<XRosterType> output = new RestResponseSingle<XRosterType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XRosterType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific Lea by refId with paging
	 */
	public RestResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			RestResponseMulti<XRosterType> output = new RestResponseMulti<XRosterType>();
			output.setData(response.getBody().getXRoster());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XRosterType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Lea by refId
	 */
	public RestResponseMulti<XRosterType> getXRostersByXLea(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			RestResponseMulti<XRosterType> output = new RestResponseMulti<XRosterType>();
			output.setData(response.getBody().getXRoster());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XRosterType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific School by refId with paging
	 */
	public RestResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			RestResponseMulti<XRosterType> output = new RestResponseMulti<XRosterType>();
			output.setData(response.getBody().getXRoster());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XRosterType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific School by refId
	 */
	public RestResponseMulti<XRosterType> getXRostersByXSchool(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			RestResponseMulti<XRosterType> output = new RestResponseMulti<XRosterType>();
			output.setData(response.getBody().getXRoster());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XRosterType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific Course by refId with paging
	 */
	public RestResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + "xCourses/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			RestResponseMulti<XRosterType> output = new RestResponseMulti<XRosterType>();
			output.setData(response.getBody().getXRoster());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XRosterType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Course by refId
	 */
	public RestResponseMulti<XRosterType> getXRostersByXCourse(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + "xCourses/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			RestResponseMulti<XRosterType> output = new RestResponseMulti<XRosterType>();
			output.setData(response.getBody().getXRoster());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XRosterType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific Staff by refId with paging
	 */
	public RestResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			RestResponseMulti<XRosterType> output = new RestResponseMulti<XRosterType>();
			output.setData(response.getBody().getXRoster());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XRosterType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Staff by refId
	 */
	public RestResponseMulti<XRosterType> getXRostersByXStaff(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			RestResponseMulti<XRosterType> output = new RestResponseMulti<XRosterType>();
			output.setData(response.getBody().getXRoster());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XRosterType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific Student by refId with paging
	 */
	public RestResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + "xStudents/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			RestResponseMulti<XRosterType> output = new RestResponseMulti<XRosterType>();
			output.setData(response.getBody().getXRoster());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XRosterType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Student by refId
	 */
	public RestResponseMulti<XRosterType> getXRostersByXStudent(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + "xStudents/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			RestResponseMulti<XRosterType> output = new RestResponseMulti<XRosterType>();
			output.setData(response.getBody().getXRoster());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XRosterType>();
		}
	}

	// #################### xStaffs ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Staffs with paging
	 */
	public RestResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + "xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class);
			
			RestResponseMulti<XStaffType> output = new RestResponseMulti<XStaffType>();
			output.setData(response.getBody().getXStaff());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStaffType>();
		}
	}

	/**
	 * 
	 * @return All Staffs
	 */
	public RestResponseMulti<XStaffType> getXStaffs()
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + "xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class);
			
			RestResponseMulti<XStaffType> output = new RestResponseMulti<XStaffType>();
			output.setData(response.getBody().getXStaff());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStaffType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Staffs by refId with paging
	 */
	public RestResponseSingle<XStaffType> getXStaff(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStaffType> response = rt.exchange(baseApiUrl + "xStaffs/{refId}", HttpMethod.GET, entity, XStaffType.class, refId);

			RestResponseSingle<XStaffType> output = new RestResponseSingle<XStaffType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XStaffType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Staffs by refId
	 */
	public RestResponseSingle<XStaffType> getXStaff(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStaffType> response = rt.exchange(baseApiUrl + "xStaffs/{refId}", HttpMethod.GET, entity, XStaffType.class, refId);

			RestResponseSingle<XStaffType> output = new RestResponseSingle<XStaffType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XStaffType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific Lea by refId with paging
	 */
	public RestResponseMulti<XStaffType> getXStaffsByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			RestResponseMulti<XStaffType> output = new RestResponseMulti<XStaffType>();
			output.setData(response.getBody().getXStaff());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStaffType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Lea by refId
	 */
	public RestResponseMulti<XStaffType> getXStaffsByXLea(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			RestResponseMulti<XStaffType> output = new RestResponseMulti<XStaffType>();
			output.setData(response.getBody().getXStaff());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStaffType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific School by refId with paging
	 */
	public RestResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			RestResponseMulti<XStaffType> output = new RestResponseMulti<XStaffType>();
			output.setData(response.getBody().getXStaff());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStaffType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific School by refId
	 */
	public RestResponseMulti<XStaffType> getXStaffsByXSchool(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			Util.ResponseHandler(response.getStatusCode());

			RestResponseMulti<XStaffType> output = new RestResponseMulti<XStaffType>();
			output.setData(response.getBody().getXStaff());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStaffType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific Course by refId with paging
	 */
	public RestResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + "xCourses/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			RestResponseMulti<XStaffType> output = new RestResponseMulti<XStaffType>();
			output.setData(response.getBody().getXStaff());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStaffType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Course by refId
	 */
	public RestResponseMulti<XStaffType> getXStaffsByXCourse(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + "xCourses/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			RestResponseMulti<XStaffType> output = new RestResponseMulti<XStaffType>();
			output.setData(response.getBody().getXStaff());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStaffType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific Roster by refId with paging
	 */
	public RestResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + "xRosters/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			RestResponseMulti<XStaffType> output = new RestResponseMulti<XStaffType>();
			output.setData(response.getBody().getXStaff());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStaffType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Roster by refId
	 */
	public RestResponseMulti<XStaffType> getXStaffsByXRoster(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			//headers.set("Content-Type", "application/json");
			
			ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + "xRosters/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			RestResponseMulti<XStaffType> output = new RestResponseMulti<XStaffType>();
			output.setData(response.getBody().getXStaff());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStaffType>();
		}
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific Student by refId with paging
	 */
	public RestResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + "xStudents/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			RestResponseMulti<XStaffType> output = new RestResponseMulti<XStaffType>();
			output.setData(response.getBody().getXStaff());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStaffType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Student by refId
	 */
	public RestResponseMulti<XStaffType> getXStaffsByXStudent(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			//headers.set("Content-Type", "application/json");
			
			ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + "xStudents/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			RestResponseMulti<XStaffType> output = new RestResponseMulti<XStaffType>();
			output.setData(response.getBody().getXStaff());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStaffType>();
		}
	}

	// #################### xStudents ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Students with paging
	 */
	public RestResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + "xStudents", HttpMethod.GET, entity, XStudentCollectionType.class);

			RestResponseMulti<XStudentType> output = new RestResponseMulti<XStudentType>();
			output.setData(response.getBody().getXStudent());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStudentType>();
		}
	}

	/**
	 * 
	 * @return All Students
	 */
	public RestResponseMulti<XStudentType> getXStudents()
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + "xStudents", HttpMethod.GET, entity, XStudentCollectionType.class);
			
			RestResponseMulti<XStudentType> output = new RestResponseMulti<XStudentType>();
			output.setData(response.getBody().getXStudent());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStudentType>();
		}
	} 
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Student by refId with paging
	 */
	public RestResponseSingle<XStudentType> getXStudent(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentType> response = rt.exchange(baseApiUrl + "xStudents/{refId}", HttpMethod.GET, entity, XStudentType.class, refId);

			RestResponseSingle<XStudentType> output = new RestResponseSingle<XStudentType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XStudentType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Student by refId
	 */
	public RestResponseSingle<XStudentType> getXStudent(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentType> response = rt.exchange(baseApiUrl + "xStudents/{refId}", HttpMethod.GET, entity, XStudentType.class, refId);

			RestResponseSingle<XStudentType> output = new RestResponseSingle<XStudentType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XStudentType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific Lea by refId with paging
	 */
	public RestResponseMulti<XStudentType> getXStudentsByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			RestResponseMulti<XStudentType> output = new RestResponseMulti<XStudentType>();
			output.setData(response.getBody().getXStudent());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStudentType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Lea by refId
	 */
	public RestResponseMulti<XStudentType> getXStudentsByXLea(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			RestResponseMulti<XStudentType> output = new RestResponseMulti<XStudentType>();
			output.setData(response.getBody().getXStudent());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStudentType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific School by refId with paging
	 */
	public RestResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			RestResponseMulti<XStudentType> output = new RestResponseMulti<XStudentType>();
			output.setData(response.getBody().getXStudent());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStudentType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific School by refId
	 */
	public RestResponseMulti<XStudentType> getXStudentsByXSchool(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			RestResponseMulti<XStudentType> output = new RestResponseMulti<XStudentType>();
			output.setData(response.getBody().getXStudent());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStudentType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific Roster by refId with paging
	 */
	public RestResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + "xRosters/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			RestResponseMulti<XStudentType> output = new RestResponseMulti<XStudentType>();
			output.setData(response.getBody().getXStudent());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStudentType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Roster by refId
	 */
	public RestResponseMulti<XStudentType> getXStudentsByXRoster(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + "xRosters/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			RestResponseMulti<XStudentType> output = new RestResponseMulti<XStudentType>();
			output.setData(response.getBody().getXStudent());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStudentType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific Staff by refId with paging
	 */
	public RestResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			RestResponseMulti<XStudentType> output = new RestResponseMulti<XStudentType>();
			output.setData(response.getBody().getXStudent());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStudentType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Staff by refId
	 */
	public RestResponseMulti<XStudentType> getXStudentsByXStaff(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			RestResponseMulti<XStudentType> output = new RestResponseMulti<XStudentType>();
			output.setData(response.getBody().getXStudent());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStudentType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific Contact by refId with paging
	 */
	public RestResponseMulti<XStudentType> getXStudentsByXContact(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + "xContacts/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			RestResponseMulti<XStudentType> output = new RestResponseMulti<XStudentType>();
			output.setData(response.getBody().getXStudent());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStudentType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Contact by refId
	 */
	public RestResponseMulti<XStudentType> getXStudentsByXContact(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + "xContacts/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			RestResponseMulti<XStudentType> output = new RestResponseMulti<XStudentType>();
			output.setData(response.getBody().getXStudent());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XStudentType>();
		}
	}

	// #################### xContacts ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Contacts with paging
	 */
	public RestResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + "xContacts", HttpMethod.GET, entity, XContactCollectionType.class);

			RestResponseMulti<XContactType> output = new RestResponseMulti<XContactType>();
			output.setData(response.getBody().getXContact());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XContactType>();
		}
	}

	/**
	 * 
	 * @return All Contacts
	 */
	public RestResponseMulti<XContactType> getXContacts()
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + "xContacts", HttpMethod.GET, entity, XContactCollectionType.class);

			RestResponseMulti<XContactType> output = new RestResponseMulti<XContactType>();
			output.setData(response.getBody().getXContact());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XContactType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Contact by refId with paging
	 */
	public RestResponseSingle<XContactType> getXContact(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XContactType> response = rt.exchange(baseApiUrl + "xContacts/{refId}", HttpMethod.GET, entity, XContactType.class, refId);

			RestResponseSingle<XContactType> output = new RestResponseSingle<XContactType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseSingle<XContactType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Single Contact by refId
	 */
	public RestResponseSingle<XContactType> getXContact(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XContactType> response = rt.exchange(baseApiUrl + "xContacts/{refId}", HttpMethod.GET, entity, XContactType.class, refId);

			RestResponseSingle<XContactType> output = new RestResponseSingle<XContactType>();
			output.setData(response.getBody());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;	
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();

			return new RestResponseSingle<XContactType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Contacts associated to a specific Lea by refId wtih paging
	 */
	public RestResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, refId);

			RestResponseMulti<XContactType> output = new RestResponseMulti<XContactType>();
			output.setData(response.getBody().getXContact());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XContactType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Contacts associated to a specific Lea by refId
	 */
	public RestResponseMulti<XContactType> getXContactsByXLea(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + "xLeas/{refId}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, refId);

			RestResponseMulti<XContactType> output = new RestResponseMulti<XContactType>();
			output.setData(response.getBody().getXContact());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XContactType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Contacts associated to a specific School by refId with paging
	 */
	public RestResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, refId);

			RestResponseMulti<XContactType> output = new RestResponseMulti<XContactType>();
			output.setData(response.getBody().getXContact());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XContactType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Contacts associated to a specific School by refId
	 */
	public RestResponseMulti<XContactType> getXContactsByXSchool(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + "xSchools/{refId}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, refId);

			RestResponseMulti<XContactType> output = new RestResponseMulti<XContactType>();
			output.setData(response.getBody().getXContact());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XContactType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Contacts associated to a specific Student by refId with paging
	 */
	public RestResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + "xStudents/{refId}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, refId);

			RestResponseMulti<XContactType> output = new RestResponseMulti<XContactType>();
			output.setData(response.getBody().getXContact());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XContactType>();
		}
	}

	/**
	 * 
	 * @param refId
	 * @return Contacts associated to a specific Student by refId
	 */
	public RestResponseMulti<XContactType> getXContactsByXStudent(String refId)
	{
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + "xStudents/{refId}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, refId);

			RestResponseMulti<XContactType> output = new RestResponseMulti<XContactType>();
			output.setData(response.getBody().getXContact());
			output.setStatusCode(response.getStatusCode());
			output.setHeaders(response.getHeaders());
			
			return output;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			
			return new RestResponseMulti<XContactType>();
		}
	}

	// #################### navigationLastPage ####################
	/**
	 * Enumerator used to retrieve service path object for max page size
	 *
	 */
	public enum ServicePath
	{
		GETXLEAS("xLeas"), GETXLEASBYXSCHOOL("xSchools/{refId}/xLeas"), GETXLEASBYXROSTER("xRosters/{refId}/xLeas"), GETXLEASBYXSTAFF("xStaffs/{refId}/xLeas"), GETXLEASBYXSTUDENT("xStudents/{refId}/xLeas"), GETXLEASBYXCONTACT("xContacts/{refId}/xLeas"), GETXSCHOOLS("xSchools"), GETXSCHOOLSBYXLEA("xLeas/{refId}/xSchools"), GETXSCHOOLSBYXCALENDAR("xCalendars/{refId}/xSchools"), GETXSCHOOLSBYXCOURSE(
				"xCourses/{refId}/xSchools"), GETXSCHOOLSBYXROSTER("xRosters/{refId}/xSchools"), GETXSCHOOLSBYXSTAFF("xStaffs/{refId}/xSchools"), GETXSCHOOLSBYXSTUDENT("xStudents/{refId}/xSchools"), GETXSCHOOLSBYXCONTACT("xContacts/{refId}/xSchools"), GETXCALENDARS("xCalendars"), GETXCALENDARSBYXLEA("xLeas/{refId}/xCalendars"), GETXCALENDARSBYXSCHOOL(
				"xSchools/{refId}/xCalendars"), GETXCOURSES("xCourses"), GETXCOURSESBYXLEA("xLeas/{refId}/xCourses"), GETXCOURSESBYXSCHOOL("xSchools/{refId}/xCourses"), GETXCOURSESBYXROSTER("xRosters/{refId}/xCourses"), GETXROSTERS("xRosters"), GETXROSTERSBYXLEA("xLeas/{refId}/xRosters"), GETXROSTERSBYXSCHOOL("xSchools/{refId}/xRosters"), GETXROSTERSBYXCOURSE("xCourses/{refId}/xRosters"), GETXROSTERSBYXSTAFF(
				"xStaffs/{refId}/xRosters"), GETXROSTERSBYXSTUDENT("xStudents/{refId}/xRosters"), GETXSTAFFS("xStaffs"), GETXSTAFFSBYXLEA("xLeas/{refId}/xStaffs"), GETXSTAFFSBYXSCHOOL("xSchools/{refId}/xStaffs"), GETXSTAFFSBYXCOURSE("xCourses/{refId}/xStaffs"), GETXSTAFFSBYXROSTER(
				"xRosters/{refId}/xStaffs"), GETXSTAFFSBYXSTUDENT("xStudents/{refId}/xStaffs"), GETXSTUDENTS("xStudents"), GETXSTUDENTSBYXLEA("xLeas/{refId}/xStudents"), GETXSTUDENTSBYXSCHOOL("xSchools/{refId}/xStudents"), GETXSTUDENTSBYXROSTER("xRosters/{refId}/xStudents"), GETXSTUDENTSBYXSTAFF("xStaffs/{refId}/xStudents"), GETXSTUDENTSBYXCONTACT(
				"xContacts/{refId}/xStudents"), GETXCONTACTS("xContacts"), GETXCONTACTSBYXLEA("xLeas/{refId}/xContacts"), GETXCONTACTSBYXSCHOOL("xSchools/{refId}/xContacts"), GETXCONTACTSBYXSTUDENT("xStudents/{refId}/xContacts");

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
	public int getLastPage(int navigationPageSize, ServicePath p, String refId)
	{
		int navigationPage = 1;
		Integer navigationLastPage = null;
		
		try
		{	
			if (p.name().equals("GETXLEASBYXSCHOOL") || p.name().equals("GETXLEASBYXROSTER") || p.name().equals("GETXLEASBYXSTAFF") || p.name().equals("GETXLEASBYXSTUDENT") || p.name().equals("GETXLEASBYXCONTACT"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XLeaCollectionType.class, refId);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));	
			}
			else if (p.name().equals("GETXSCHOOLSBYXLEA") || p.name().equals("GETXSCHOOLSBYXCALENDAR") || p.name().equals("GETXSCHOOLSBYXCOURSE") || p.name().equals("GETXSCHOOLSBYXROSTER") || p.name().equals("GETXSCHOOLSBYXSTAFF") || p.name().equals("GETXSCHOOLSBYXSTUDENT")
					|| p.name().equals("GETXSCHOOLSBYXCONTACT"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXCALENDARSBYXLEA") || p.name().equals("GETXCALENDARSBYXSCHOOL"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XCalendarCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XCalendarCollectionType.class, refId);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXCOURSESBYXLEA") || p.name().equals("GETXCOURSESBYXSCHOOL") || p.name().equals("GETXCOURSESBYXROSTER"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XCourseCollectionType.class, refId);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));	
			}
			else if (p.name().equals("GETXROSTERSBYXLEA") || p.name().equals("GETXROSTERSBYXSCHOOL") || p.name().equals("GETXROSTERSBYXCOURSE") || p.name().equals("GETXROSTERSBYXSTAFF") || p.name().equals("GETXROSTERSBYXSTUDENT"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XRosterCollectionType.class, refId);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXSTAFFSBYXLEA") || p.name().equals("GETXSTAFFSBYXSCHOOL") || p.name().equals("GETXSTAFFSBYXCOURSE") || p.name().equals("GETXSTAFFSBYXROSTER") || p.name().equals("GETXSTAFFSBYXSTUDNET"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStaffCollectionType.class, refId);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXSTUDENTSBYXLEA") || p.name().equals("GETXSTUDENTSBYXSCHOOL") || p.name().equals("GETXSTUDENTSBYXROSTER") || p.name().equals("GETXSTUDENTSBYXSTAFF") || p.name().equals("GETXSTUDENTSBYXCONTACT"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStudentCollectionType.class, refId);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXCONTACTSBYXLEA") || p.name().equals("GETXCONTACTSBYXSCHOOL") || p.name().equals("GETXCONTACTSBYXSTUDENT"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XContactCollectionType.class, refId);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}

			return navigationLastPage;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			return 0;
		}
	}
	
	/**
	 * 
	 * @param navigationPageSize
	 * @param p
	 * @return Max page value for specified service path object
	 */
	public int getLastPage(int navigationPageSize, ServicePath p)
	{
		int navigationPage = 1;
		Integer navigationLastPage = null;
		
		try
		{
			if (p.name().equals("GETXLEAS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XLeaCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XLeaCollectionType.class);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXSCHOOLS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XSchoolCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XSchoolCollectionType.class);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXCALENDARS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XCalendarCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XCalendarCollectionType.class);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXCOURSES"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XCourseCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XCourseCollectionType.class);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXROSTERS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XRosterCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XRosterCollectionType.class);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXSTAFFS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStaffCollectionType.class);
				
				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
				
//				System.out.println(restTemplate.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStaffCollectionType.class, navigationPage, navigationPageSize).toString());
//				System.out.println(response.getHeaders().toString());
//				System.out.println(baseApiUrl + p.value, HttpMethod.GET, entity);
//				System.out.println(navigationLastPage);
				
			}
			else if (p.name().equals("GETXSTUDENTS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XStudentCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStudentCollectionType.class);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXCONTACTS"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XContactCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XContactCollectionType.class);

				Util.ResponseHandler(response.getStatusCode());

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}

			return navigationLastPage;
		}
		catch(RestClientException rce)
		{
			rce.printStackTrace();
			return 0;
		}
	}

}
