package riconeapi.common.paths;

import com.fasterxml.jackson.core.JsonProcessingException;
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
import riconeapi.models.xpress.XSchoolCollectionType;
import riconeapi.models.xpress.XSchoolCollectionTypeWrapper;
import riconeapi.models.xpress.XSchoolType;
import riconeapi.models.xpress.XSchoolTypeWrapper;

public class XSchoolsPath
{
	private RestTemplate rt;
	private String baseApiUrl;
	private ObjectMapper jsonMapper;
	private ObjectMapper xmlMapper;

	public XSchoolsPath(RestTemplate rt, String baseApiUrl, ObjectMapper jsonMapper, ObjectMapper xmlMapper)
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
	 * @return All Schools with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchools(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
	 * @return All School value changes from a given point.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchools(String opaqueMarker) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			//headers.set("Content-Type", "application/json");

			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools")
					.queryParam("changesSinceMarker", opaqueMarker);

			HttpEntity<?> entity = new HttpEntity<Object>(headers);

			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XSchoolCollectionType.class);

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
	 * @return All Schools.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchools() throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionTypeWrapper> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xSchools", HttpMethod.GET, entity, XSchoolCollectionTypeWrapper.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXSchools().getXSchool());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXSchools()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXSchools()));
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
		catch(JsonProcessingException jpe)
		{
			jpe.printStackTrace();
		}
		return output;
	}

	/**
	 *
	 * @param refId of xSchool.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Single School by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XSchoolType> getXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XSchoolType> response;
		ResponseSingle<XSchoolType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xSchool.
	 * @return Single School by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XSchoolType> getXSchool(String refId) throws AuthenticationException
	{
		ResponseEntity<XSchoolTypeWrapper> response;
		ResponseSingle<XSchoolType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xSchools/{refId}", HttpMethod.GET, entity, XSchoolTypeWrapper.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getxSchool());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getxSchool()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getxSchool()));
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
		catch(JsonProcessingException jpe)
		{
			jpe.printStackTrace();
		}
		return output;
	}

	/**
	 *
	 * @param idType Header value can be set to beds or local.
	 * @param id BEDS or Local Id.
	 * @return Single School by BEDS code or Local Id.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XSchoolType> getXSchool(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XSchoolType> response;
		ResponseSingle<XSchoolType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("IdType", idType);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);

			response = rt.exchange(baseApiUrl + "xSchools/{id}", HttpMethod.GET, entity, XSchoolType.class, id);

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
	 * @return Schools associated to a specific Lea by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xLea.
	 * @return Schools associated to a specific Lea by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String refId) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param idType Header value can be set to beds or local.
	 * @param id BEDS or Local Id.
	 * @return Schools associated to a specific Lea by BEDS code or Local Id.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXLea(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("IdType", idType);
			//headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);

			response = rt.exchange(baseApiUrl + "xLeas/{id}/xSchools", HttpMethod.GET, entity, XSchoolCollectionType.class, id);

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
	 * @param refId of xCalendar.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Schools associated to a specific Calendar by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xCalendar.
	 * @return Schools associated to a specific Calendar by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXCalendar(String refId) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xCourse.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Schools associated to a specific Course by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xCourse.
	 * @return Schools associated to a specific Course by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXCourse(String refId) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xRoster.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Schools associated to a specific Roster by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xRoster.
	 * @return Schools associated to a specific Roster by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXRoster(String refId) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xStaff.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Schools associated to a specific Staff by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xStaff.
	 * @return Schools associated to a specific Staff by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXStaff(String refId) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xStudent.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Schools associated to a specific Student by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xStudent.
	 * @return Schools associated to a specific Student by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXStudent(String refId) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xContact.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Schools associated to a specific Contact by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xContact.
	 * @return Schools associated to a specific Contact by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XSchoolType> getXSchoolsByXContact(String refId) throws AuthenticationException
	{
		ResponseEntity<XSchoolCollectionType> response;
		ResponseMulti<XSchoolType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
}
