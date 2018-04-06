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
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.*;

public class AUPP
{
	private RestTemplate rt;
	private String baseApiUrl;
	private ObjectMapper jsonMapper;
	private ObjectMapper xmlMapper;

	public AUPP(RestTemplate rt, String baseApiUrl, ObjectMapper jsonMapper, ObjectMapper xmlMapper)
	{
		this.rt = rt;
		this.baseApiUrl = baseApiUrl;
		this.jsonMapper = jsonMapper;
		this.xmlMapper = xmlMapper;
	}

	/**
	 * Create staff username and passwords by school.
	 * @param refId of xSchool.
	 * @return Create staff username and passwords by school.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> createXStaffUsers(String refId) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			//headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStaffs")
					.queryParam("createUsers", "true");
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
	 * Delete generated staff passwords by school.
	 * @param refId of xSchool.
	 * @return Delete generated staff passwords by school.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> deleteXStaffUsers(String refId) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionType> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			//headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStaffs")
					.queryParam("deleteUsers", "true");
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
	 * Return generated staff username and passwords by school with paging.
	 * @param refId of xSchool.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Return generated staff username and passwords by school with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionTypeWrapper> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStaffs")
					.queryParam("getUsers", "true");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XStaffCollectionTypeWrapper.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaffs().getXStaff());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXStaffs()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXStaffs()));
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
	 * Return generated staff username and passwords by school.
	 * @param refId of xSchool.
	 * @return Generated staff username and passwords by school.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStaffType> getXStaffUsers(String refId) throws AuthenticationException
	{
		ResponseEntity<XStaffCollectionTypeWrapper> response;
		ResponseMulti<XStaffType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStaffs")
					.queryParam("getUsers", "true");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XStaffCollectionTypeWrapper.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStaffs().getXStaff());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXStaffs()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXStaffs()));
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
	 * Create student username and passwords by school.
	 * @param refId of xSchool.
	 * @return Create student username and passwords by school.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStudentType> createXStudentUsers(String refId) throws AuthenticationException
	{
		ResponseEntity<XStudentCollectionType> response;
		ResponseMulti<XStudentType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			//headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStudents")
					.queryParam("createUsers", "true");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
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
	 * Delete generated student passwords by school.
	 * @param refId of xSchool.
	 * @return Delete generated student passwords by school.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStudentType> deleteXStudentUsers(String refId) throws AuthenticationException
	{
		ResponseEntity<XStudentCollectionType> response;
		ResponseMulti<XStudentType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			//headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStudents")
					.queryParam("deleteUsers", "true");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
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
	 * Return generated student username and passwords by school with paging.
	 * @param refId of xSchool.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Return generated student username and passwords by school with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStudentType> getXStudentUsers(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XStudentCollectionTypeWrapper> response;
		ResponseMulti<XStudentType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStudents")
					.queryParam("getUsers", "true");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XStudentCollectionTypeWrapper.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudents().getXStudent());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXStudents()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXStudents()));
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
	 * Return generated student username and passwords by school.
	 * @param refId of xSchool.
	 * @return Generated student username and passwords by school.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XStudentType> getXStudentUsers(String refId) throws AuthenticationException
	{
		ResponseEntity<XStudentCollectionTypeWrapper> response;
		ResponseMulti<XStudentType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xStudents")
					.queryParam("getUsers", "true");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XStudentCollectionTypeWrapper.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXStudents().getXStudent());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXStudents()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXStudents()));
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
	 * Create contact username and passwords by school.
	 * @param refId of xSchool.
	 * @return Create contact username and passwords by school.
	 * @throws AuthenticationException if login does not succeed.
	 */
	private ResponseMulti<XContactType> createXContactUsers(String refId) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			//headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xContacts")
					.queryParam("createUsers", "true");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			//			System.out.println(builder.build().encode().toUriString());
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
	 * Delete generated contact passwords by school.
	 * @param refId of xSchool.
	 * @return Delete generated contact passwords by school.
	 * @throws AuthenticationException if login does not succeed.
	 */
	private ResponseMulti<XContactType> deleteXContactUsers(String refId) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			//headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xContacts")
					.queryParam("deleteUsers", "true");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			//			System.out.println(builder.build().encode().toUriString());
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
	 * Return generated contact username and passwords by school.
	 * @param refId of xSchool.
	 * @return Generated contact username and passwords by school.
	 * @throws AuthenticationException if login does not succeed.
	 */
	private ResponseMulti<XContactType> getXContactUsers(String refId) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionTypeWrapper> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			//headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xSchools/" + refId + "/xContacts")
					.queryParam("getUsers", "true");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			//			System.out.println(builder.build().encode().toUriString());
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XContactCollectionTypeWrapper.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXContacts().getXContact());
				output.setJson(jsonMapper.writeValueAsString(response.getBody().getXContacts()));
				output.setXml(xmlMapper.writeValueAsString(response.getBody().getXContacts()));
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