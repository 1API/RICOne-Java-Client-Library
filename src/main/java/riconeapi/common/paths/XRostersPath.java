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
import riconeapi.models.xpress.XRosterCollectionType;
import riconeapi.models.xpress.XRosterType;

public class XRostersPath
{
	private RestTemplate rt;
	private String baseApiUrl;

	public XRostersPath(RestTemplate rt, String baseApiUrl)
	{
		this.rt = rt;
		this.baseApiUrl = baseApiUrl;
	}

	/**
	 *
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return All Rosters with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRosters(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
	 * @return All Roster value changes from a given point.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRosters(String opaqueMarker) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			//headers.set("Content-Type", "application/json");
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseApiUrl)
					.path("xRosters")
					.queryParam("changesSinceMarker", opaqueMarker);
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(builder.build().encode().toUriString(), HttpMethod.GET, entity, XRosterCollectionType.class);

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
	 * @return All Rosters.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRosters() throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xRoster.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Single Roster by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XRosterType> getXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XRosterType> response;
		ResponseSingle<XRosterType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xRoster.
	 * @return Single Roster by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseSingle<XRosterType> getXRoster(String refId) throws AuthenticationException
	{
		ResponseEntity<XRosterType> response;
		ResponseSingle<XRosterType> output = new ResponseSingle<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xLea.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Rosters associated to a specific Lea by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRostersByXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xLea.
	 * @return Rosters associated to a specific Lea by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRostersByXLea(String refId) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param idType Header value can be set to beds or local.
	 * @param id BEDS or Local Id.
	 * @return Rosters associated to a specific Lea by BEDS code or Local Id.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRostersByXLea(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("IdType", idType);
			//headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xLeas/{id}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, id);

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
	 * @param refId of xSchool.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Rosters associated to a specific School by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xSchool.
	 * @return Rosters associated to a specific School by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRostersByXSchool(String refId) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param idType Header value can be set to beds or local.
	 * @param id BEDS or Local Id.
	 * @return Rosters associated to a specific School by BEDS code or Local Id.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRostersByXSchool(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("IdType", idType);
			//headers.set("Content-Type", "application/json");
			HttpEntity<?> entity = new HttpEntity<Object>(headers);
			response = rt.exchange(baseApiUrl + "xSchools/{id}/xRosters", HttpMethod.GET, entity, XRosterCollectionType.class, id);

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
	 * @param refId of xCourse.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Rosters associated to a specific Course by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xCourse.
	 * @return Rosters associated to a specific Course by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRostersByXCourse(String refId) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xStaff.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Rosters associated to a specific Staff by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xStaff.
	 * @return Rosters associated to a specific Staff by refId.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRostersByXStaff(String refId) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xStudent.
	 * @param navigationPage Page to retrieve.
	 * @param navigationPageSize Number of resources to retrieve.
	 * @return Rosters associated to a specific Student by refId with paging.
	 * @throws AuthenticationException if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
	 * @param refId of xStudent.
	 * @return Rosters associated to a specific Student by refId.
	 * @throws AuthenticationException if login does not succeed. if login does not succeed.
	 */
	public ResponseMulti<XRosterType> getXRostersByXStudent(String refId) throws AuthenticationException
	{
		ResponseEntity<XRosterCollectionType> response;
		ResponseMulti<XRosterType> output = new ResponseMulti<>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
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
}
