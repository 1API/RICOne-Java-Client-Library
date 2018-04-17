package riconeapi.common.paths;

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
import riconeapi.models.xpress.XLeaCollectionType;
import riconeapi.models.xpress.XLeaType;

public class XLeasPath
{
	private RestTemplate rt;
	private String baseApiUrl;

	public XLeasPath(RestTemplate rt, String baseApiUrl)
	{
		this.rt = rt;
		this.baseApiUrl = baseApiUrl;
	}

	/**
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return All Leas with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 *
	 * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
	 * @return All Lea value changes from a given point.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeas(String opaqueMarker) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			//headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xLeas")
					.queryParam("changesSinceMarker", opaqueMarker);
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XLeaCollectionType.class);

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
	 * @return All Leas.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeas() throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 *
	 * @param refId of xLea.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Single Lea by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XLeaType> getXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaType> response;
		ResponseSingle<XLeaType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xLea.
	 * @return Single Lea by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XLeaType> getXLea(String refId) throws AuthenticationException
	{
		ResponseEntity<XLeaType> response;
		ResponseSingle<XLeaType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param idType Header value can be set to beds or local.
	 * @param id BEDS or Local Id.
	 * @return Single Lea by BEDS code or Local Id.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XLeaType> getXLea(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XLeaType> response;
		ResponseSingle<XLeaType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("IdType", idType);
			//headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xLeas/{id}", HttpMethod.GET, entity, XLeaType.class, id);

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
	 * @param refId of xSchools.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Leas associated to a specific School by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xSchools.
	 * @return Leas associated to a specific School by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param idType Header value can be set to beds or local.
	 * @param id BEDS or Local Id.
	 * @return Leas associated to a specific School by BEDS code or Local Id.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeasByXSchool(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("IdType", idType);
			//headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xSchools/{id}/xLeas", HttpMethod.GET, entity, XLeaCollectionType.class, id);

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
	 * @param refId of xRoster.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Leas associated to a specific Roster by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xRosters.
	 * @return Leas associated to a specific Roster by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xStaffs.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Leas associated to a specific Staff by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xStaffs.
	 * @return Leas associated to a specific Staff by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xStudents.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Leas associated to a specific Student by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xStudents.
	 * @return Leas associated to a specific Student by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xContact.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Leas associated to a specific Contact by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xContact.
	 * @return Leas associated to a specific Contact by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response;
		ResponseMulti<XLeaType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
}
