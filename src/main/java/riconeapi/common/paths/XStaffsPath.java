package riconeapi.common.paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import riconeapi.authentication.Authenticator;
import riconeapi.common.ResponseMulti;
import riconeapi.common.ResponseSingle;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XStaffCollectionType;
import riconeapi.models.xpress.XStaffType;

public class XStaffsPath
{
	private RestTemplate rt;
	private String baseApiUrl;
	private ObjectMapper jsonMapper;
	private ObjectMapper xmlMapper;

	public XStaffsPath(RestTemplate rt, String baseApiUrl, ObjectMapper jsonMapper, ObjectMapper xmlMapper)
	{
		this.rt = rt;
		this.baseApiUrl = baseApiUrl;
		this.jsonMapper = jsonMapper;
		this.xmlMapper = xmlMapper;
	}

	/**
	 *
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return All Staffs with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffs(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
	 * @return All Staff value changes from a given point.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffs(String opaqueMarker) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xStaffs")
					.queryParam("changesSinceMarker", opaqueMarker);
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
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
	 *
	 * @return All Staffs.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffs() throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xStaff.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Single Staffs by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XStaffType> getXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XStaffType> response;
		ResponseSingle<XStaffType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xStaff.
	 * @return Single Staffs by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XStaffType> getXStaff(String refId) throws AuthenticationException
	{
		ResponseEntity<XStaffType> response;
		ResponseSingle<XStaffType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xLea.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Staffs associated to a specific Lea by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xStaff.
	 * @return Staffs associated to a specific Lea by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffsByXLea(String refId) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
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
	 * @param idType Header value can be set to beds or local.
	 * @param id BEDS or Local Id.
	 * @return Staff associated to a specific Lea by BEDS code or Local Id.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffsByXLea(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("IdType", idType);
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xLeas/{id}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, id);

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
	 * @param refId of xSchool.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Staffs associated to a specific School by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xSchool.
	 * @return Staffs associated to a specific School by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String refId) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
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
	 * @param idType Header value can be set to beds or local.
	 * @param id BEDS or Local Id.
	 * @return Staff associated to a specific School by BEDS code or Local Id.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffsByXSchool(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("IdType", idType);
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xSchools/{id}/xStaffs", HttpMethod.GET, entity, XStaffCollectionType.class, id);

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
	 * @param refId of xCourse.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Staffs associated to a specific Course by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xCourse.
	 * @return Staffs associated to a specific Course by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffsByXCourse(String refId) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xRoster.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Staffs associated to a specific Roster by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xRoster.
	 * @return Staffs associate to a specific Roster by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffsByXRoster(String refId) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xStudent.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Staffs associated to a specific Student by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xStudent.
	 * @return Staffs associated to a specific Student by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffsByXStudent(String refId) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
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
}
