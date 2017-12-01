package riconeapi.common.paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import riconeapi.authentication.Authenticator;
import riconeapi.common.ResponseMulti;
import riconeapi.common.ResponseSingle;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.XLeaCollectionType;
import riconeapi.models.xpress.XLeaCollectionTypeResponse;
import riconeapi.models.xpress.XLeaType;

import java.util.Collections;

public class XLeaPath
{
	private RestTemplate rt;
	private String baseApiUrl;
	private ObjectMapper mapper;
	private ObjectMapper xmlMapper;

	public XLeaPath(RestTemplate rt, String baseApiUrl, ObjectMapper mapper, ObjectMapper xmlMapper)
	{
		this.rt = rt;
		this.baseApiUrl = baseApiUrl;
		this.mapper = mapper;
		this.xmlMapper = xmlMapper;
	}

	// #################### xLeas ####################
	/**
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return All Leas with paging
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("navigationPage", Integer.toString(navigationPage));
			headers.set("navigationPageSize", Integer.toString(navigationPageSize));
			headers.set("Content-Type", "application/json");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);

			response = rt.exchange(baseApiUrl + "xLeas", HttpMethod.GET, entity, XLeaCollectionType.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXLea());
				System.out.println(response.getBody().getXLea());
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
	 * @param opaqueMarker
	 * @return All Lea value changes from a given point
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeas(String opaqueMarker) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");

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
	 * @return All Leas
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeas() throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionTypeResponse> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

		Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

		try
		{

			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());
			headers.set("Content-Type", "application/json");
//			headers.set("Content-Type", "application/xml");

			HttpEntity<?> entity = new HttpEntity<Object>(headers);

			response = rt.exchange(baseApiUrl + "xLeas", HttpMethod.GET, entity, XLeaCollectionTypeResponse.class);

			if(response.getBody() != null)
			{
				output.setData(response.getBody().getXLeas().getXLea());

				//    			ObjectMapper jsonMapper = new ObjectMapper();
				String json = mapper.writeValueAsString(response.getBody());
				output.setJson(json);

//				ObjectMapper module = new XmlMapper();
//				//module.setDefaultUseWrapper(false);
//				//XmlMapper xmlMapper = new XmlMapper(module);
				String xml = xmlMapper.writeValueAsString(response.getBody().getXLeas().getXLea());
				output.setXml(xml);

				//				JAXBContext jaxbContext = JAXBContext.newInstance(XLeaCollectionType.class);
				//				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
				//				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				//				jaxbMarshaller.marshal(response.getBody(), System.out);
				//				output.setXml(jaxbMarshaller.toString());

				//    			output.setXml(response.getBody().toString());

			}
			output.setMessage(response.getStatusCode().getReasonPhrase());
			output.setStatusCode(response.getStatusCode().value());
			output.setHeader(response.getHeaders().toString());
		}
		catch(HttpClientErrorException | JsonProcessingException e)
		{
			//			output.setMessage(((HttpStatusCodeException) e).getStatusText());
			//			output.setStatusCode(((HttpStatusCodeException) e).getStatusCode().value());
			//			output.setHeader(((HttpStatusCodeException) e).getResponseHeaders().toString());
		}

		return output;
	}

	/**
	 *
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Single Lea by refId with paging
	 * @throws AuthenticationException
	 */
	public ResponseSingle<XLeaType> getXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaType> response = null;
		ResponseSingle<XLeaType> output = new ResponseSingle<XLeaType>();

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
	 * @param refId
	 * @return Single Lea by refId
	 * @throws AuthenticationException
	 */
	public ResponseSingle<XLeaType> getXLea(String refId) throws AuthenticationException
	{
		ResponseEntity<XLeaType> response = null;
		ResponseSingle<XLeaType> output = new ResponseSingle<XLeaType>();

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
	 * @param idType
	 * @param id
	 * @return Single Lea by BEDS code or Local Id. Header IdType value can be set to beds or local
	 * @throws AuthenticationException
	 */
	public ResponseSingle<XLeaType> getXLea(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XLeaType> response = null;
		ResponseSingle<XLeaType> output = new ResponseSingle<XLeaType>();

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
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific School by refId with paging
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

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
	 * @param refId
	 * @return Leas associated to a specific School by refId
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeasByXSchool(String refId) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

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
	 * @param idType
	 * @param id
	 * @return Leas associated to a specific School by BEDS code or Local Id. Header IdType value can be set to beds or local
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeasByXSchool(String idType, String id) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

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
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Roster by refId with paging
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

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
	 * @param refId
	 * @return Leas associated to a specific Roster by refId
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeasByXRoster(String refId) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

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
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Staff by refId with paging
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

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
	 * @param refId
	 * @return Leas associated to a specific Staff by refId
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeasByXStaff(String refId) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

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
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Student by refId with paging
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

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
	 * @param refId
	 * @return Leas associated to a specific Student by refId
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeasByXStudent(String refId) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

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
	 * @param refId
	 * @param navigationPage
	 * @param navigationPageSize
	 * @return Leas associated to a specific Contact by refId with paging
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

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
	 * @param refId
	 * @return Leas associated to a specific Contact by refId
	 * @throws AuthenticationException
	 */
	public ResponseMulti<XLeaType> getXLeasByXContact(String refId) throws AuthenticationException
	{
		ResponseEntity<XLeaCollectionType> response = null;
		ResponseMulti<XLeaType> output = new ResponseMulti<XLeaType>();

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
