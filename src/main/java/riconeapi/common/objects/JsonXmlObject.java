package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.authentication.Endpoint;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;

import java.util.Date;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.9.0
 * @since 5/8/2020
 */
public class JsonXmlObject {
    private final RestTemplate rt;
    private final Endpoint endpoint;

    /**
     * JsonXml Object Constructor.
     * @param rt REST template.
     * @param endpoint Endpoint object.
     */
    public JsonXmlObject(RestTemplate rt, Endpoint endpoint) {
        this.rt = rt;
        this.endpoint = endpoint;
    }

    /**
     * Request String response of a service path in JSON or XML format.
     * @param servicePath The requested service path.
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(type);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request String response of a service path by school year in JSON or XML format.
     * @param servicePath The requested service path.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, int schoolYear, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear, type);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request String response of a service path with paging in JSON or XML format.
     * @param servicePath The requested service path.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, int navigationPage, int navigationPageSize, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, type);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request String response of a service path with paging by school year in JSON or XML format.
     * @param servicePath The requested service path.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, int navigationPage, int navigationPageSize, int schoolYear, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear, type);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request String response of a service path by refId in JSON or XML format.
     * @param servicePath The requested service path.
     * @param refId of xObject.
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, String refId, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(type);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request String response of a service path by refId and school year in JSON or XML format.
     * @param servicePath The requested service path.
     * @param refId of xObject.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, String refId, int schoolYear, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(schoolYear, type);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request String response of a service path by refId with paging in JSON or XML format.
     * @param servicePath The requested service path.
     * @param refId of xObject.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, String refId, int navigationPage, int navigationPageSize, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, type);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request String response of a service path by refId with paging by school year in JSON or XML format.
     * @param servicePath The requested service path.
     * @param refId of xObject.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param schoolYear  The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, String refId, int navigationPage, int navigationPageSize, int schoolYear, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear, type);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request String response of a service path by BEDS code or Local Id in JSON or XML format.
     * @param servicePath The requested service path.
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, String idType, String id, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(idType, id, type);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request String response of a service path by BEDS code or Local Id by school year in JSON or XML format.
     * @param servicePath The requested service path.
     * @param idType Header value can be set to beds or local.
     * @param id     BEDS or Local Id.
     * @param schoolYear The year of the requested data (i.e. 2018 for the 2017-2018 school year).
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, String idType, String id, int schoolYear, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(idType, id, schoolYear, type);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request value changes from a given point on a service path in JSON or XML format.
     * This will only work for ServicePath.GETXLEAS, ServicePath.GETXSCHOOLS, ServicePath.GETXCALENDARS, ServicePath.GETXCOURSES,
     * ServicePath.GETXROSTERS, ServicePath.GETXSTAFFS, ServicePath.GETXSTUDENTS, ServicePath.GETXCONTACTS.
     * @param servicePath The requested service path.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, Date opaqueMarker, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(type);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, servicePath, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request value changes from a given point on a service path with paging in JSON or XML format.
     * This will only work for ServicePath.GETXLEAS, ServicePath.GETXSCHOOLS, ServicePath.GETXCALENDARS, ServicePath.GETXCOURSES,
     * ServicePath.GETXROSTERS, ServicePath.GETXSTAFFS, ServicePath.GETXSTUDENTS, ServicePath.GETXCONTACTS.
     * @param servicePath The requested service path.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param opaqueMarker Uses an ISO8601 timestamp that indicates a point since the last changes have been requested.
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, int navigationPage, int navigationPageSize, Date opaqueMarker, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, type);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, servicePath, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request String response of a service path for AUPP in JSON or XML format.
     * @param servicePath The requested service path.
     * @param refId of xObject.
     * @param auppEnum AUPP Enumerator for values AUPPEnum.CREATE, AUPPEnum.DELETE, AUPPEnum.GET.
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see AUPPEnum
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, String refId, AUPPEnum auppEnum, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(type);
        RestQueryParameter rqp = new RestQueryParameter(auppEnum);
        RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }

    /**
     * Request String response of a service path for AUPP with paging in JSON or XML format.
     * @param servicePath The requested service path.
     * @param refId of xObject.
     * @param navigationPage     Page to retrieve.
     * @param navigationPageSize Number of resources to retrieve.
     * @param auppEnum AUPP Enumerator for values AUPPEnum.CREATE, AUPPEnum.DELETE, AUPPEnum.GET.
     * @param type MediaType Enumerator for values MediaTypeEnum.JSON or MediaTypeEnum.XML.
     * @return String value of requested service path.
     * @see ServicePath
     * @see AUPPEnum
     * @see MediaTypeEnum
     * @throws AuthenticationException if login does not succeed.
     */
    public String getJsonXml(ServicePath servicePath, String refId, int navigationPage, int navigationPageSize, AUPPEnum auppEnum, MediaTypeEnum type) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, type);
        RestQueryParameter rqp = new RestQueryParameter(auppEnum);
        RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
        return rr.makeJsonXmlRequest(rt, rp);
    }
}
