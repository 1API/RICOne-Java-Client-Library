package riconeapi.common;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import riconeapi.authentication.Authenticator;
import riconeapi.common.paths.XLeasPath;
import riconeapi.common.paths.XSchoolsPath;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.*;

import java.util.Collections;

//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     1.6
 * @since       Sep 21, 2017
 *
 * Static class allowing access to xPress data model objects
 */
public class XPress2
{
	private RestTemplate rt;
	private String baseApiUrl;
	private XLeasPath xLeasPath;
	private XSchoolsPath xSchoolsPath;

	public XPress2(String baseApiUrl)
	{
		this.baseApiUrl = baseApiUrl;
		this.rt = new RestTemplate();


		ObjectMapper jsonMapper = new ObjectMapper();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setObjectMapper(jsonMapper);
		jsonMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		jsonMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

		JacksonXmlModule module = new JacksonXmlModule();
		module.setDefaultUseWrapper(false);
		ObjectMapper xmlMapper = new XmlMapper(module);
		xmlMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		xmlMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

		rt.setMessageConverters(Collections.<HttpMessageConverter<?>>singletonList(converter));

		xLeasPath = new XLeasPath(rt, baseApiUrl, jsonMapper, xmlMapper);
		xSchoolsPath = new XSchoolsPath(rt, baseApiUrl, jsonMapper, xmlMapper);
	}

	/* xLeas */
	public ResponseMulti<XLeaType> getXLeas(int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xLeasPath.getXLeas(navigationPage, navigationPageSize);
	}
	public ResponseMulti<XLeaType> getXLeas(String opaqueMarker) throws AuthenticationException
	{
		return xLeasPath.getXLeas(opaqueMarker);
	}
	public ResponseMulti<XLeaType> getXLeas() throws AuthenticationException
	{
		return xLeasPath.getXLeas();
	}
	public ResponseSingle<XLeaType> getXLea(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xLeasPath.getXLea(refId, navigationPage, navigationPageSize);
	}
	public ResponseSingle<XLeaType> getXLea(String refId) throws AuthenticationException
	{
		return xLeasPath.getXLea(refId);
	}
	public ResponseSingle<XLeaType> getXLea(String idType, String id) throws AuthenticationException
	{
		return xLeasPath.getXLea(idType, id);
	}

	public ResponseMulti<XLeaType>getXLeasByXSchool(String refId, int navigationPage, int navigationPageSize) throws AuthenticationException
	{
		return xLeasPath.getXLeasByXSchool(refId, navigationPage, navigationPageSize);
	}
//	getXLeasByXSchool(java.lang.String)
//	getXLeasByXSchool(java.lang.String, java.lang.String)
//	getXLeasByXRoster(java.lang.String, int, int)
//	getXLeasByXRoster(java.lang.String)
//	getXLeasByXStaff(java.lang.String, int, int)
//	getXLeasByXStaff(java.lang.String)
//	getXLeasByXStudent(java.lang.String, int, int)
//	getXLeasByXStudent(java.lang.String)
//	getXLeasByXContact(java.lang.String, int, int)
//	getXLeasByXContact(java.lang.String)

	/* xSchools */
	public ResponseMulti<XSchoolType> getXSchools() throws AuthenticationException
	{
		return xSchoolsPath.getXSchools();
	}

	public ResponseSingle<XSchoolType> getXSchool(String refId) throws AuthenticationException
	{
		return xSchoolsPath.getXSchool(refId);
	}

	// #################### xCalendars ####################


	// #################### xCourses ####################


	// #################### xRosters ####################


	// #################### xStaffs ####################


	// #################### xStudents ####################


	// #################### xContacts ####################


	// #################### navigationLastPage ####################

	// #################### AUPP ####################

}
