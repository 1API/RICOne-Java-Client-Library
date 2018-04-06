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
import riconeapi.models.xpress.XCourseCollectionTypeWrapper;
import riconeapi.models.xpress.XCourseType;
import riconeapi.models.xpress.XCourseTypeWrapper;

public class XCoursesPath
{
	private RestTemplate rt;
	private String baseApiUrl;
	private ObjectMapper jsonMapper;
	private ObjectMapper xmlMapper;

	public XCoursesPath(RestTemplate rt, String baseApiUrl, ObjectMapper jsonMapper, ObjectMapper xmlMapper)
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
	 * @return All Courses with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XCourseType> getXCourses(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XCourseCollectionTypeWrapper> response;
		ResponseMulti<XCourseType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xCourses", HttpMethod.GET, entity, XCourseCollectionTypeWrapper.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourses().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourses()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourses()));
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
	 * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
	 * @return All Course value changes from a given point.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XCourseType> getXCourses(String opaqueMarker) throws AuthenticationException
	{
		ResponseEntity<XCourseCollectionTypeWrapper> response;
		ResponseMulti<XCourseType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xCourses")
					.queryParam("changesSinceMarker", opaqueMarker);
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XCourseCollectionTypeWrapper.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourses().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourses()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourses()));
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
	 * @return All Courses.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XCourseType> getXCourses() throws AuthenticationException
	{
		ResponseEntity<XCourseCollectionTypeWrapper> response;
		ResponseMulti<XCourseType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xCourses", HttpMethod.GET, entity, XCourseCollectionTypeWrapper.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourses().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourses()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourses()));
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
	 * @param refId of xCourse.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Single Course by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XCourseType> getXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XCourseTypeWrapper> response;
		ResponseSingle<XCourseType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xCourses/{refId}", HttpMethod.GET, entity, XCourseTypeWrapper.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourse()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourse()));
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
	 * @param refId of xCourse.
	 * @return Single Course by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XCourseType> getXCourse(String refId) throws AuthenticationException
	{
		ResponseEntity<XCourseTypeWrapper> response;
		ResponseSingle<XCourseType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xCourses/{refId}", HttpMethod.GET, entity, XCourseTypeWrapper.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourse()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourse()));
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
	 * @param refId of xLea.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Courses associated to a specific Lea by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XCourseCollectionTypeWrapper> response;
		ResponseMulti<XCourseType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionTypeWrapper.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourses().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourses()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourses()));
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
	 * @param refId of xLea.
	 * @return Courses associated to a specific Lea by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XCourseType> getXCoursesByXLea(String refId) throws AuthenticationException
	{
		ResponseEntity<XCourseCollectionTypeWrapper> response;
		ResponseMulti<XCourseType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xLeas/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionTypeWrapper.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourses().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourses()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourses()));
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
	 * @return Courses associated to a specific Lea by BEDS code or Local Id.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XCourseType> getXCoursesByXLea(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XCourseCollectionTypeWrapper> response;
		ResponseMulti<XCourseType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("IdType", idType);
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xLeas/{id}/xCourses", HttpMethod.GET, entity, XCourseCollectionTypeWrapper.class, id);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourses().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourses()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourses()));
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
	 * @return Courses associated to a specific School by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XCourseCollectionTypeWrapper> response;
		ResponseMulti<XCourseType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionTypeWrapper.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourses().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourses()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourses()));
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
	 * @return Courses associated to a specific School by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String refId) throws AuthenticationException
	{
		ResponseEntity<XCourseCollectionTypeWrapper> response;
		ResponseMulti<XCourseType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xSchools/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionTypeWrapper.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourses().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourses()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourses()));
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
	 * @return Courses associated to a specific School by BEDS code or Local Id.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XCourseType> getXCoursesByXSchool(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XCourseCollectionTypeWrapper> response;
		ResponseMulti<XCourseType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("IdType", idType);
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xSchools/{id}/xCourses", HttpMethod.GET, entity, XCourseCollectionTypeWrapper.class, id);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourses().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourses()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourses()));
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
	 * @param refId of xRoster.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Courses associated to a specific Roster by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XCourseCollectionTypeWrapper> response;
		ResponseMulti<XCourseType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xRosters/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionTypeWrapper.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourses().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourses()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourses()));
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
	 * @param refId of xRoster.
	 * @return Courses associated to a specific Roster by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XCourseType> getXCoursesByXRoster(String refId) throws AuthenticationException
	{
		ResponseEntity<XCourseCollectionTypeWrapper> response;
		ResponseMulti<XCourseType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xRosters/{refId}/xCourses", HttpMethod.GET, entity, XCourseCollectionTypeWrapper.class, refId);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXCourses().getXCourse());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXCourses()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXCourses()));
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
}
