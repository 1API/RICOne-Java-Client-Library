/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.2.2
 * @since       June 17, 2016
 * Filename		XPress.java
 */

package riconeapi.common;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

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
	public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
    		headers.set("Authorization", "Bearer " + this.token);
    		headers.set("navigationPage", Integer.toString(navigationPage));
    		headers.set("navigationPageSize", Integer.toString(navigationPageSize));
    		//headers.set("Content-Type", "application/json");
			
    		HttpEntity<?> entity = new HttpEntity<Object>(headers);

    		response = rt.exchange(baseApiUrl + "xLeas", HttpMethod.GET, entity, XLeaCollectionType.class);
			
    		if(response.getBody() != null)
			{
    			output.setData(response.getBody().getXLea());
			}
    		output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * @return All Leas
	 */
	public ResponseMulti<XLeaType> getXLeas()
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			////headers.set("Content-Type", "application/json");
			
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas", HttpMethod.GET, entity, XLeaCollectionType.class);
			
			if(response.getBody() != null)
			{
    			output.setData(response.getBody().getXLea());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;	
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Lea by refId with paging
	 */
	public ResponseSingle<XLeaType> getXLea(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XLeaType> response = null;
		ResponseSingle<XLeaType> output = new ResponseSingle<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}", HttpMethod.GET, entity, XLeaType.class, refId);

			if(response.getBody() != null)
			{
    			output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Single Lea by refId
	 */
	public ResponseSingle<XLeaType> getXLea(String refId)
	{
		ResponseEntity<XLeaType> response = null;
		ResponseSingle<XLeaType> output = new ResponseSingle<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}", HttpMethod.GET, entity, XLeaType.class, refId);
			
			if(response.getBody() != null)
			{
    			output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;	
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific School by refId with paging
	 */
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			if(response.getBody() != null)
			{
    			output.setData(response.getBody().getXLea());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific School by refId
	 */
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			if(response.getBody() != null)
			{
    			output.setData(response.getBody().getXLea());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Roster by refId with paging
	 */
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			if(response.getBody() != null)
			{
    			output.setData(response.getBody().getXLea());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Roster by refId
	 */
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			if(response.getBody() != null)
			{
    			output.setData(response.getBody().getXLea());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Staff by refId with paging
	 */
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			if(response.getBody() != null)
			{
    			output.setData(response.getBody().getXLea());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Staff by refId
	 */
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			if(response.getBody() != null)
			{
    			output.setData(response.getBody().getXLea());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Student by refId with paging
	 */
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			if(response.getBody() != null)
			{
    			output.setData(response.getBody().getXLea());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Student by refId
	 */
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			if(response.getBody() != null)
			{
    			output.setData(response.getBody().getXLea());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Contact by refId with paging
	 */
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xContacts/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			if(response.getBody() != null)
			{
    			output.setData(response.getBody().getXLea());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Leas associated to a specific Contact by refId
	 */
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId)
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xContacts/{refId}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, refId);

			if(response.getBody() != null)
			{
    			output.setData(response.getBody().getXLea());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	// #################### xSchools ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Schools with paging
	 */
	public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
				
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @return All Schools
	 */
	public ResponseMulti<XSchoolType> getXSchools()
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class);
			
			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;	
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single School by refId with paging
	 */
	public ResponseSingle<XSchoolType> getXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XSchoolType> response = null;
		ResponseSingle<XSchoolType> output = new ResponseSingle<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");
			
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}", HttpMethod.GET, entity, XSchoolType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());	
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Single School by refId
	 */
	public ResponseSingle<XSchoolType> getXSchool(String refId)
	{
		ResponseEntity<XSchoolType> response = null;
		ResponseSingle<XSchoolType> output = new ResponseSingle<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}", HttpMethod.GET, entity, XSchoolType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Lea by refId with paging
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Lea by refId
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Calendar by refId with paging
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCalendars/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Calendar by refId
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCalendars/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Course by refId with paging
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{	
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCourses/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Course by refId
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCourses/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);
			
			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Roster by refId with paging
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Roster by refId
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Staff by refId with paging
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Staff by refId
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Student by refId with paging
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Student by refId
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Schools associated to a specific Contact by refId with paging
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xContacts/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Schools associated to a specific Contact by refId
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId)
	{
		ResponseEntity<XSchoolCollectionType> response = null;
		ResponseMulti<XSchoolType> output = new ResponseMulti<XSchoolType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xContacts/{refId}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchool());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	// #################### xCalendars ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Calendars with paging
	 */
	public ResponseMulti<XCalendarType> getXCalendars(int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XCalendarCollectionType> response = null;
		ResponseMulti<XCalendarType> output = new ResponseMulti<XCalendarType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCalendars", HttpMethod.GET, entity, XCalendarCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCalendar());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @return All Calendars
	 */
	public ResponseMulti<XCalendarType> getXCalendars()
	{
		ResponseEntity<XCalendarCollectionType> response = null;
		ResponseMulti<XCalendarType> output = new ResponseMulti<XCalendarType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCalendars", HttpMethod.GET, entity, XCalendarCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCalendar());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Calendar by refId with paging
	 */
	public ResponseSingle<XCalendarType> getXCalendar(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XCalendarType> response = null;
		ResponseSingle<XCalendarType> output = new ResponseSingle<XCalendarType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCalendars/{refId}", HttpMethod.GET, entity, XCalendarType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Single Calendar by refId
	 */
	public ResponseSingle<XCalendarType> getXCalendar(String refId)
	{
		ResponseEntity<XCalendarType> response = null;
		ResponseSingle<XCalendarType> output = new ResponseSingle<XCalendarType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCalendars/{refId}", HttpMethod.GET, entity, XCalendarType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Calendars associated to a specific Lea by refId with paging
	 */
	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XCalendarCollectionType> response = null;
		ResponseMulti<XCalendarType> output = new ResponseMulti<XCalendarType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xCalendars", HttpMethod.GET, entity, XCalendarCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCalendar());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Calendars associated to a specific Lea by refId
	 */
	public ResponseMulti<XCalendarType> getXCalendarsByXLea(String refId)
	{
		ResponseEntity<XCalendarCollectionType> response = null;
		ResponseMulti<XCalendarType> output = new ResponseMulti<XCalendarType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xCalendars", HttpMethod.GET, entity, XCalendarCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCalendar());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Calendars associated to a specific School by refId with paging
	 */
	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XCalendarCollectionType> response = null;
		ResponseMulti<XCalendarType> output = new ResponseMulti<XCalendarType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xCalendars", HttpMethod.GET, entity, XCalendarCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCalendar());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Calendars associated to a specific School by refId
	 */
	public ResponseMulti<XCalendarType> getXCalendarsByXSchool(String refId)
	{
		ResponseEntity<XCalendarCollectionType> response = null;
		ResponseMulti<XCalendarType> output = new ResponseMulti<XCalendarType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xCalendars", HttpMethod.GET, entity, XCalendarCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCalendar());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	// #################### xCourses ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Courses with paging
	 */
	public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XCourseCollectionType> response = null;
		ResponseMulti<XCourseType> output = new ResponseMulti<XCourseType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCourses", HttpMethod.GET, entity, XCourseCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourse());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @return All Courses
	 */
	public ResponseMulti<XCourseType> getXCourses()
	{
		ResponseEntity<XCourseCollectionType> response = null;
		ResponseMulti<XCourseType> output = new ResponseMulti<XCourseType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCourses", HttpMethod.GET, entity, XCourseCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourse());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Course by refId with paging
	 */
	public ResponseSingle<XCourseType> getXCourse(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XCourseType> response = null;
		ResponseSingle<XCourseType> output = new ResponseSingle<XCourseType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCourses/{refId}", HttpMethod.GET, entity, XCourseType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Single Course by refId
	 */
	public ResponseSingle<XCourseType> getXCourse(String refId)
	{
		ResponseEntity<XCourseType> response = null;
		ResponseSingle<XCourseType> output = new ResponseSingle<XCourseType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCourses/{refId}", HttpMethod.GET, entity, XCourseType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Courses associated to a specific Lea by refId with paging
	 */
	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XCourseCollectionType> response = null;
		ResponseMulti<XCourseType> output = new ResponseMulti<XCourseType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourse());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Courses associated to a specific Lea by refId
	 */
	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId)
	{
		ResponseEntity<XCourseCollectionType> response = null;
		ResponseMulti<XCourseType> output = new ResponseMulti<XCourseType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourse());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Courses associated to a specific School by refId with paging
	 */
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XCourseCollectionType> response = null;
		ResponseMulti<XCourseType> output = new ResponseMulti<XCourseType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourse());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Courses associated to a specific School by refId
	 */
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId)
	{
		ResponseEntity<XCourseCollectionType> response = null;
		ResponseMulti<XCourseType> output = new ResponseMulti<XCourseType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourse());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Courses associated to a specific Roster by refId with paging
	 */
	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XCourseCollectionType> response = null;
		ResponseMulti<XCourseType> output = new ResponseMulti<XCourseType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourse());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Courses associated to a specific Roster by refId
	 */
	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId)
	{
		ResponseEntity<XCourseCollectionType> response = null;
		ResponseMulti<XCourseType> output = new ResponseMulti<XCourseType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourse());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	// #################### xRosters ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Rosters with paging
	 */
	public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XRosterCollectionType> response = null;
		ResponseMulti<XRosterType> output = new ResponseMulti<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters", HttpMethod.GET, entity, XRosterCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXRoster());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @return All Rosters
	 */
	public ResponseMulti<XRosterType> getXRosters()
	{
		ResponseEntity<XRosterCollectionType> response = null;
		ResponseMulti<XRosterType> output = new ResponseMulti<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters", HttpMethod.GET, entity, XRosterCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXRoster());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Roster by refId with paging
	 */
	public ResponseSingle<XRosterType> getXRoster(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XRosterType> response = null;
		ResponseSingle<XRosterType> output = new ResponseSingle<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters/{refId}", HttpMethod.GET, entity, XRosterType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());	
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Single Roster by refId
	 */
	public ResponseSingle<XRosterType> getXRoster(String refId)
	{
		ResponseEntity<XRosterType> response = null;
		ResponseSingle<XRosterType> output = new ResponseSingle<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters/{refId}", HttpMethod.GET, entity, XRosterType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific Lea by refId with paging
	 */
	public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XRosterCollectionType> response = null;
		ResponseMulti<XRosterType> output = new ResponseMulti<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXRoster());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Lea by refId
	 */
	public ResponseMulti<XRosterType> getXRostersByXLea(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = null;
		ResponseMulti<XRosterType> output = new ResponseMulti<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXRoster());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific School by refId with paging
	 */
	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XRosterCollectionType> response = null;
		ResponseMulti<XRosterType> output = new ResponseMulti<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXRoster());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific School by refId
	 */
	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = null;
		ResponseMulti<XRosterType> output = new ResponseMulti<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXRoster());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific Course by refId with paging
	 */
	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XRosterCollectionType> response = null;
		ResponseMulti<XRosterType> output = new ResponseMulti<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCourses/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXRoster());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Course by refId
	 */
	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = null;
		ResponseMulti<XRosterType> output = new ResponseMulti<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCourses/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXRoster());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific Staff by refId with paging
	 */
	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XRosterCollectionType> response = null;
		ResponseMulti<XRosterType> output = new ResponseMulti<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXRoster());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Staff by refId
	 */
	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = null;
		ResponseMulti<XRosterType> output = new ResponseMulti<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXRoster());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Rosters associated to a specific Student by refId with paging
	 */
	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XRosterCollectionType> response = null;
		ResponseMulti<XRosterType> output = new ResponseMulti<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXRoster());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Rosters associated to a specific Student by refId
	 */
	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId)
	{
		ResponseEntity<XRosterCollectionType> response = null;
		ResponseMulti<XRosterType> output = new ResponseMulti<XRosterType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents/{refId}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, refId);
			
			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXRoster());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	// #################### xStaffs ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Staffs with paging
	 */
	public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class);
			
			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @return All Staffs
	 */
	public ResponseMulti<XStaffType> getXStaffs()
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class);
			
			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Staffs by refId with paging
	 */
	public ResponseSingle<XStaffType> getXStaff(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStaffType> response = null;
		ResponseSingle<XStaffType> output = new ResponseSingle<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStaffs/{refId}", HttpMethod.GET, entity, XStaffType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Single Staffs by refId
	 */
	public ResponseSingle<XStaffType> getXStaff(String refId)
	{
		ResponseEntity<XStaffType> response = null;
		ResponseSingle<XStaffType> output = new ResponseSingle<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStaffs/{refId}", HttpMethod.GET, entity, XStaffType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific Lea by refId with paging
	 */
	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Lea by refId
	 */
	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific School by refId with paging
	 */
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific School by refId
	 */
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific Course by refId with paging
	 */
	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCourses/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Course by refId
	 */
	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xCourses/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific Roster by refId with paging
	 */
	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Roster by refId
	 */
	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			//headers.set("Content-Type", "application/json");
			
			response = rt.exchange(baseApiUrl + "xRosters/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Staffs associated to a specific Student by refId with paging
	 */
	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Staffs associated to a specific Student by refId
	 */
	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			//headers.set("Content-Type", "application/json");
			
			response = rt.exchange(baseApiUrl + "xStudents/{refId}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	// #################### xStudents ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Students with paging
	 */
	public ResponseMulti<XStudentType> getXStudents(int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents", HttpMethod.GET, entity, XStudentCollectionType.class);
			
			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @return All Students
	 */
	public ResponseMulti<XStudentType> getXStudents()
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents", HttpMethod.GET, entity, XStudentCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	} 
	
	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Student by refId with paging
	 */
	public ResponseSingle<XStudentType> getXStudent(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStudentType> response = null;
		ResponseSingle<XStudentType> output = new ResponseSingle<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents/{refId}", HttpMethod.GET, entity, XStudentType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Single Student by refId
	 */
	public ResponseSingle<XStudentType> getXStudent(String refId)
	{
		ResponseEntity<XStudentType> response = null;
		ResponseSingle<XStudentType> output = new ResponseSingle<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents/{refId}", HttpMethod.GET, entity, XStudentType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific Lea by refId with paging
	 */
	public ResponseMulti<XStudentType> getXStudentsByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Lea by refId
	 */
	public ResponseMulti<XStudentType> getXStudentsByXLea(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific School by refId with paging
	 */
	public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific School by refId
	 */
	public ResponseMulti<XStudentType> getXStudentsByXSchool(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific Roster by refId with paging
	 */
	public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Roster by refId
	 */
	public ResponseMulti<XStudentType> getXStudentsByXRoster(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xRosters/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific Staff by refId with paging
	 */
	public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Staff by refId
	 */
	public ResponseMulti<XStudentType> getXStudentsByXStaff(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStaffs/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Students associated to a specific Contact by refId with paging
	 */
	public ResponseMulti<XStudentType> getXStudentsByXContact(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xContacts/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Students associated to a specific Contact by refId
	 */
	public ResponseMulti<XStudentType> getXStudentsByXContact(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xContacts/{refId}/xStudents", HttpMethod.GET, entity, XStudentCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	// #################### xContacts ####################
	/**
	 * 
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Contacts with paging
	 */
	public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XContactCollectionType> response = null;
		ResponseMulti<XContactType> output = new ResponseMulti<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xContacts", HttpMethod.GET, entity, XContactCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXContact());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @return All Contacts
	 */
	public ResponseMulti<XContactType> getXContacts()
	{
		ResponseEntity<XContactCollectionType> response = null;
		ResponseMulti<XContactType> output = new ResponseMulti<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xContacts", HttpMethod.GET, entity, XContactCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXContact());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Contact by refId with paging
	 */
	public ResponseSingle<XContactType> getXContact(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XContactType> response = null;
		ResponseSingle<XContactType> output = new ResponseSingle<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xContacts/{refId}", HttpMethod.GET, entity, XContactType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Single Contact by refId
	 */
	public ResponseSingle<XContactType> getXContact(String refId)
	{
		ResponseEntity<XContactType> response = null;
		ResponseSingle<XContactType> output = new ResponseSingle<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xContacts/{refId}", HttpMethod.GET, entity, XContactType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Contacts associated to a specific Lea by refId wtih paging
	 */
	public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XContactCollectionType> response = null;
		ResponseMulti<XContactType> output = new ResponseMulti<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXContact());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Contacts associated to a specific Lea by refId
	 */
	public ResponseMulti<XContactType> getXContactsByXLea(String refId)
	{
		ResponseEntity<XContactCollectionType> response = null;
		ResponseMulti<XContactType> output = new ResponseMulti<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXContact());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Contacts associated to a specific School by refId with paging
	 */
	public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XContactCollectionType> response = null;
		ResponseMulti<XContactType> output = new ResponseMulti<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXContact());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Contacts associated to a specific School by refId
	 */
	public ResponseMulti<XContactType> getXContactsByXSchool(String refId)
	{
		ResponseEntity<XContactCollectionType> response = null;
		ResponseMulti<XContactType> output = new ResponseMulti<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXContact());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Contacts associated to a specific Student by refId with paging
	 */
	public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize)
	{
		ResponseEntity<XContactCollectionType> response = null;
		ResponseMulti<XContactType> output = new ResponseMulti<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents/{refId}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, refId);
			
			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXContact());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 * 
	 * @param refId
	 * @return Contacts associated to a specific Student by refId
	 */
	public ResponseMulti<XContactType> getXContactsByXStudent(String refId)
	{
		ResponseEntity<XContactCollectionType> response = null;
		ResponseMulti<XContactType> output = new ResponseMulti<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			
			response = rt.exchange(baseApiUrl + "xStudents/{refId}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXContact());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
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

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}
			else if (p.name().equals("GETXSTAFFSBYXLEA") || p.name().equals("GETXSTAFFSBYXSCHOOL") || p.name().equals("GETXSTAFFSBYXCOURSE") || p.name().equals("GETXSTAFFSBYXROSTER") || p.name().equals("GETXSTAFFSBYXSTUDENT"))
			{
				HttpHeaders headers = new HttpHeaders();
				headers.set("Authorization", "Bearer " + this.token);
				headers.set("navigationPage", Integer.toString(navigationPage));
				headers.set("navigationPageSize", Integer.toString(navigationPageSize));
				//headers.set("Content-Type", "application/json");

				HttpEntity<?> entity = new HttpEntity<Object>(headers);
				
				ResponseEntity<XStaffCollectionType> response = rt.exchange(baseApiUrl + p.value, HttpMethod.GET, entity, XStaffCollectionType.class, refId);

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

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}

			return navigationLastPage;
		}
		catch(HttpClientErrorException e)
		{
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

				navigationLastPage = Integer.parseInt(response.getHeaders().getFirst("navigationLastPage"));
			}

			return navigationLastPage;
		}
		catch(HttpClientErrorException e)
		{
			return 0;
		}
	}

	/**
	 * Create staff usernames and passwords by school
	 * @param refId
	 * @return 
	 */
	public ResponseMulti<XStaffType> createXStaffUsers(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStaffs")
					.queryParam("createUsers", "true");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			System.out.println(builder.build().encode().toUriString());
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XStaffCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * Delete generated staff passwords by school
	 * @param refId
	 * @return
	 */
	public ResponseMulti<XStaffType> deleteXStaffUsers(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStaffs")
					.queryParam("deleteUsers", "true");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			System.out.println(builder.build().encode().toUriString());
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XStaffCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * Return generated staff usernames and passwords by school
	 * @param refId
	 * @return
	 */
	public ResponseMulti<XStaffType> getXStaffUsers(String refId)
	{
		ResponseEntity<XStaffCollectionType> response = null;
		ResponseMulti<XStaffType> output = new ResponseMulti<XStaffType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStaffs")
					.queryParam("getUsers", "true");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			System.out.println(builder.build().encode().toUriString());
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XStaffCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaff());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * Create student usernames and passwords by school
	 * @param refId
	 * @return
	 */
	public ResponseMulti<XStudentType> createXStudentUsers(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStudents")
					.queryParam("createUsers", "true");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			System.out.println(builder.build().encode().toUriString());
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XStudentCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * Delete generated student passwords by school
	 * @param refId
	 * @return
	 */
	public ResponseMulti<XStudentType> deleteXStudentUsers(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStudents")
					.queryParam("deleteUsers", "true");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			System.out.println(builder.build().encode().toUriString());
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XStudentCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * Return generated student usernames and passwords by school
	 * @param refId
	 * @return
	 */
	public ResponseMulti<XStudentType> getXStudentUsers(String refId)
	{
		ResponseEntity<XStudentCollectionType> response = null;
		ResponseMulti<XStudentType> output = new ResponseMulti<XStudentType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStudents")
					.queryParam("getUsers", "true");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			System.out.println(builder.build().encode().toUriString());
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XStudentCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudent());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * Create contact usernames and passwords by school
	 * @param refId
	 * @return
	 */
	private ResponseMulti<XContactType> createXContactUsers(String refId)
	{
		ResponseEntity<XContactCollectionType> response = null;
		ResponseMulti<XContactType> output = new ResponseMulti<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xContacts")
					.queryParam("createUsers", "true");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			System.out.println(builder.build().encode().toUriString());
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XContactCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXContact());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * Delete generated contact passwords by school
	 * @param refId
	 * @return
	 */
	private ResponseMulti<XContactType> deleteXContactUsers(String refId)
	{
		ResponseEntity<XContactCollectionType> response = null;
		ResponseMulti<XContactType> output = new ResponseMulti<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xContacts")
					.queryParam("deleteUsers", "true");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			System.out.println(builder.build().encode().toUriString());
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XContactCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXContact());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
	
	/**
	 * Return generated contact usernames and passwords by school
	 * @param refId
	 * @return
	 */
	private ResponseMulti<XContactType> getXContactUsers(String refId)
	{
		ResponseEntity<XContactCollectionType> response = null;
		ResponseMulti<XContactType> output = new ResponseMulti<XContactType>();
		
		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + this.token);
			//headers.set("Content-Type", "application/json");
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xContacts")
					.queryParam("getUsers", "true");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			System.out.println(builder.build().encode().toUriString());
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XContactCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXContact());
			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException e)
		{
			output.setMessage(e.getStatusText());
			output.setStatusCode(e.getStatusCode().value());
			output.setHeader(e.getResponseHeaders().toString());
		}

		return output;
	}
}
