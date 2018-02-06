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
import riconeapi.models.xpress.XContactCollectionType;
import riconeapi.models.xpress.XContactType;

public class XContactsPath
{
	private RestTemplate rt;
	private String baseApiUrl;
	private ObjectMapper jsonMapper;
	private ObjectMapper xmlMapper;

	public XContactsPath(RestTemplate rt, String baseApiUrl, ObjectMapper jsonMapper, ObjectMapper xmlMapper)
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
	 * @return All Contacts with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XContactType> getXContacts(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
	 * @return All Contact value changes from a given point.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XContactType> getXContacts(String opaqueMarker) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xContacts")
					.queryParam("changesSinceMarker", opaqueMarker);
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
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
	 *
	 * @return All Contacts.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XContactType> getXContacts() throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xContact.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Single Contact by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XContactType> getXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XContactType> response;
		ResponseSingle<XContactType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xContact.
	 * @return Single Contact by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XContactType> getXContact(String refId) throws AuthenticationException
	{
		ResponseEntity<XContactType> response;
		ResponseSingle<XContactType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xLea.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Contacts associated to a specific Lea by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XContactType> getXContactsByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xLea.
	 * @return Contacts associated to a specific Lea by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XContactType> getXContactsByXLea(String refId) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
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
	 * @param idType Header value can be set to beds or local.
	 * @param id BEDS or Local Id.
	 * @return Contacts associated to a specific Lea by BEDS code or Local Id.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XContactType> getXContactsByXLea(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("IdType", idType);
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xLeas/{id}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, id);

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
	 * @param refId of xSchool.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Contacts associated to a specific School by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XContactType> getXContactsByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xSchool.
	 * @return Contacts associated to a specific School by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XContactType> getXContactsByXSchool(String refId) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
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
	 * @param idType Header value can be set to beds or local.
	 * @param id BEDS or Local Id.
	 * @return Contacts associated to a specific School by BEDS code or Local Id. Header IdType value can be set to beds or local.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XContactType> getXContactsByXSchool(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("IdType", idType);
			headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xSchools/{id}/xContacts", HttpMethod.GET, entity, XContactCollectionType.class, id);

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
	 * @param refId of xStudent.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Contacts associated to a specific Student by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XContactType> getXContactsByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");
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
	 * @param refId of xStudent.
	 * @return Contacts associated to a specific Student by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XContactType> getXContactsByXStudent(String refId) throws AuthenticationException
	{
		ResponseEntity<XContactCollectionType> response;
		ResponseMulti<XContactType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
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
}
