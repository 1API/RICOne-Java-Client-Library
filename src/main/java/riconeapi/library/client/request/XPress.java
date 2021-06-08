package riconeapi.library.client.request;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.StringUtils;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import riconeapi.authentication.Endpoint;
import riconeapi.library.client.common.IResponse;
import riconeapi.library.client.common.Model;
import riconeapi.library.client.response.*;
import riconeapi.library.client.response.model.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/*
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     2.0.0
 * @since       1/20/2020
 */

/**
 * Root class of the client library.
 */
public class XPress {
    private Endpoint endpoint;
    private RestTemplate restTemplate;

    /**
     * The XPress API class constructor. This constructor requires an endpoint object from the authentication
     * library specifying the location where data will be requested. The href url is contained in the
     * endpoint object and is used to construct the requests.
     * @param endpoint the location where requests are made.
     */
    public XPress(Endpoint endpoint) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
        messageConverter.setObjectMapper(objectMapper);
        
        this.endpoint = endpoint;
        this.restTemplate = new RestTemplate();
        this.restTemplate.setMessageConverters(Collections.singletonList(messageConverter));
    }

    /**
     * Get a list of xLeas. This method uses the XResponse class with the parameter XLeas model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * list of xLeas. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XLEAS</li>
     *         <li>GET_XLEAS_BY_XSCHOOL</li>
     *         <li>GET_XLEAS_BY_XROSTER</li>
     *         <li>GET_XLEAS_BY_XSTAFF</li>
     *         <li>GET_XLEAS_BY_XSTUDENT</li>
     *         <li>GET_XLEAS_BY_XCONTACT</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a list of xLeas.
     */
    public XResponse<XLeas> getXLeas(XRequest request) {
        return request(request, XLeasResponse.class, XLeas.class);
    }

    /**
     * Get a single xLea. This method uses the XResponse class with the parameter XLea model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * single xLea. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XLEA_BY_REFID</li>
     *         <li>GET_XLEA_BY_ID</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a single xSchool.
     */
    public XResponse<XLea> getXLea(XRequest request) {
        return request(request, XLeaResponse.class, XLea.class);
    }

    /**
     * Get a list of xSchools. This method uses the XResponse class with the parameter XSchools model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * list of xSchools. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XSCHOOLS</li>
     *         <li>GET_XSCHOOLS_BY_XLEA</li>
     *         <li>GET_XSCHOOLS_BY_XCALENDAR</li>
     *         <li>GET_XSCHOOLS_BY_XCOURSE</li>
     *         <li>GET_XSCHOOLS_BY_XROSTER</li>
     *         <li>GET_XSCHOOLS_BY_XSTAFF</li>
     *         <li>GET_XSCHOOLS_BY_XSTUDENT</li>
     *         <li>GET_XSCHOOLS_BY_XCONTACT</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a list of xSchools.
     */
    public XResponse<XSchools> getXSchools(XRequest request) {
        return request(request, XSchoolsResponse.class, XSchools.class);
    }

    /**
     * Get a single xSchool. This method uses the XResponse class with the parameter XSchool model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * single xSchool. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XSCHOOL_BY_REFID</li>
     *         <li>GET_XSCHOOL_BY_ID</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a single xSchool.
     */
    public XResponse<XSchool> getXSchool(XRequest request) {
        return request(request, XSchoolResponse.class, XSchool.class);
    }

    /**
     * Get a list of xCalendars. This method uses the XResponse class with the parameter XCalendars model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * list of xCalendars. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XCALENDARS</li>
     *         <li>GET_XCALENDARS_XLEA</li>
     *         <li>GET_XCALENDARS_BY_XSCHOOL</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a list of xCalendars.
     */
    public XResponse<XCalendars> getXCalendars(XRequest request) {
        return request(request, XCalendarsResponse.class, XCalendars.class);
    }

    /**
     * Get a single xCalendar. This method uses the XResponse class with the parameter XCalendar model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * single xCalendar. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XCALENDAR_BY_REFID</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a single xCalendar.
     */
    public XResponse<XCalendar> getXCalendar(XRequest request) {
        return request(request, XCalendarResponse.class, XCalendar.class);
    }

    /**
     * Get a list of xCourses. This method uses the XResponse class with the parameter XCourses model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * list of xCourses. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XCOURSES</li>
     *         <li>GET_XCOURSES_BY_XLEA</li>
     *         <li>GET_XCOURSES_BY_XSCHOOL</li>
     *         <li>GET_XCOURSES_BY_XROSTER</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a list of xCourses.
     */
    public XResponse<XCourses> getXCourses(XRequest request) {
        return request(request, XCoursesResponse.class, XCourses.class);
    }

    /**
     * Get a single xCourse. This method uses the XResponse class with the parameter XCourse model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * single xCourse. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_COURSE_BY_REFID</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a single xCourse.
     */
    public XResponse<XCourse> getXCourse(XRequest request) {
        return request(request, XCourseResponse.class, XCourse.class);
    }

    /**
     * Get a list of xRosters. This method uses the XResponse class with the parameter XRosters model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * list of xRosters. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XROSTERS</li>
     *         <li>GET_XROSTERS_BY_XLEA</li>
     *         <li>GET_XROSTERS_BY_XSCHOOL</li>
     *         <li> GET_XROSTERS_BY_XCOURSE</li>
     *         <li>GET_XROSTERS_BY_XSTAFF</li>
     *         <li>GET_XROSTERS_BY_XSTUDENT</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a list of XRosters.
     */
    public XResponse<XRosters> getXRosters(XRequest request) {
        return request(request, XRostersResponse.class, XRosters.class);
    }

    /**
     * Get a single xRosters. This method uses the XResponse class with the parameter XRoster model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * single xRosters. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XROSTER_BY_REFID</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a single xRoster.
     */
    public XResponse<XRoster> getXRoster(XRequest request) {
        return request(request, XRosterResponse.class, XRoster.class);
    }

    /**
     * Get a list of xStaffs. This method uses the XResponse class with the parameter XStaffs model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * list of xStaffs. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XSTAFFS</li>
     *         <li>GET_XSTAFFS_BY_XLEA</li>
     *         <li>GET_XSTAFFS_BY_XSCHOOL</li>
     *         <li>GET_XSTAFFS_BY_XCOURSE</li>
     *         <li>GET_XSTAFFS_BY_XROSTER</li>
     *         <li>GET_XSTAFFS_BY_XSTUDENT</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a list of xStaffs.
     */
    public XResponse<XStaffs> getXStaffs(XRequest request) {
        return request(request, XStaffsResponse.class, XStaffs.class);
    }

    /**
     * Get a single xStaff. This method uses the XResponse class with the parameter XStaff model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * single xStaff. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XSTAFF_BY_REFID</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a single xStaff.
     */
    public XResponse<XStaff> getXStaff(XRequest request) {
        return request(request, XStaffResponse.class, XStaff.class);
    }

    /**
     * Get a list of xStudents. This method uses the XResponse class with the parameter XStudents model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * list of xStudents. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XSTUDENTS</li>
     *         <li>GET_XSTUDENTS_BY_XLEA</li>
     *         <li>GET_XSTUDENTS_BY_XSCHOOL</li>
     *         <li>GET_XSTUDENTS_BY_XROSTER</li>
     *         <li>GET_XSTUDENTS_BY_XSTAFF</li>
     *         <li>GET_XSTUDENTS_BY_XCONTACT</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a list of xStudents.
     */
    public XResponse<XStudents> getXStudents(XRequest request) {
        return request(request, XStudentsResponse.class, XStudents.class);
    }

    /**
     * Get a single xStudent. This method uses the XResponse class with the parameter XStudent model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * single xStudent. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XSTUDENT_BY_REFID</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a single xStudent.
     */
    public XResponse<XStudent> getXStudent(XRequest request) {
        return request(request, XStudentResponse.class, XStudent.class);
    }

    /**
     * Get a list of xContacts. This method uses the XResponse class with the parameter XContacts model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * list of xContacts. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XCONTACTS</li>
     *         <li>>GET_XCONTACTS_BY_XLEA</li>
     *         <li>GET_XCONTACTS_BY_XSCHOOL</li>
     *         <li>GET_XCONTACTS_BY_XSTUDENT</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a list of xContacts.
     */
    public XResponse<XContacts> getXContacts(XRequest request) {
        return request(request, XContactsResponse.class, XContacts.class);
    }

    /**
     * Get a single xContact. This method uses the XResponse class with the parameter XContact model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * single xContact. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XCONTACT_BY_REFID</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a single xContact.
     */
    public XResponse<XContact> getXContact(XRequest request) {
        return request(request, XContactResponse.class, XContact.class);
    }

    /**
     * Get a list of xEmployments. This method uses the XResponse class with the parameter XEmployments model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * list of xEmployments. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XEMPLOYMENTS</li>
     *         <li>GET_XEMPLOYMENTS_BY_XLEA</li>
     *         <li>GET_XEMPLOYMENTS_BY_XSCHOOL</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a list of xEmployments.
     */
    public XResponse<XEmployments> getXEmployments(XRequest request) {
        return request(request, XEmploymentsResponse.class, XEmployments.class);
    }

    /**
     * Get a single xEmployment. This method uses the XResponse class with the parameter XEmployment model class.
     * <p>
     * To use this method, an XRequest with components must be provided where the desired return is a
     * single xEmployment. The service path component is required and may optionally include paging, schoolYear, changesSince,
     * and/or accountProvisioning.
     * <p>
     * Example request service paths include:
     * <p>
     *     <ul>
     *         <li>GET_XEMPLOYMENT_BY_REFID</li>
     *     </ul>
     * @param request the XRequest with appended components.
     * @return a single xEmployment.
     */
    public XResponse<XEmployment> getXEmployment(XRequest request) {
        return request(request, XEmploymentResponse.class, XEmployment.class);
    }

    /**
     * Get the Integer value of the NavigationLastPage header. This method can be used to determine the value needed for
     * the NavigationPage header and the number of times a list must be iterated though with the provided NavigationPageSize.
     * It performs a HEAD request with the provided XRequest components.
     * <p>
     * To use this method, an XRequest with components must be provided where the return is an Integer value of the
     * NavigationLastPage header. The service path and navigation page size components are required and may optionally
     * include schoolYear, changesSince, and/or accountProvisioning.
     * @param request the XRequest with appended components.
     * @return an Integer value to be used for NavigationPage and iterating though a list.
     */
    public Integer getXLastPage(XRequest request) {
        return getLastPage(request);

    }

    /**
     * <p>Generic response method to process a request and return a data payload from the xPress API.
     * </p>
     * <p>Response classes include: XLeasResponse, XLeaResponse, XSchoolsResponse, XSchoolResponse,
     * XCalendarsResponse, XCalendarResponse, XCoursesResponse, XCourseResponse, XRostersResponse,
     * XRosterResponse, XStaffsResponse, XStaffResponse, XStudentsResponse, XStudentResponse,
     * XContactsResponse, XContactResponse, XEmploymentsResponse, XEmploymentResponse.
     * </p>
     * <p>Model classes include: XLeas, XLea, XSchools, XSchool, XCalendars, XCalendar, XCourses, XCourse,
     * XRosters, XRoster, XStaffs, XStaff, XStudents, XStudent, XContacts, XContact, XEmployments, XEmployment.
     * </p>
     *
     * @param request XRequest class.
     * @param responseClass xPress object response.
     * @param modelClass xPress data model.
     * @param <R> response class.
     * @param <M> model class.
     * @return an xPress response type.
     */
    private <R extends IResponse<M>, M extends Model> R request(XRequest request, Class<R> responseClass, Class<M> modelClass) {
        verifyRequest(request, responseClass);

        R response = null;
        String requestUrl = getRequestUrl(request);
        HttpEntity<?> requestEntity = getRequestEntityHeaders(request);

        try {
            ResponseEntity<R> responseEntity = restTemplate.exchange(requestUrl, HttpMethod.GET, requestEntity, responseClass);
            if(responseEntity.hasBody()) {
                response = responseEntity.getBody();

                assert response != null;
                response.setRequestUrl(requestUrl);
                response.setRequestHeaders(requestEntity.getHeaders());
                response.setResponseStatusCode(responseEntity.getStatusCode());
                response.setResponseHeaders(responseEntity.getHeaders());

//                if(request.hasPaging() && !request.servicePath().getServicePathType().equals(ServicePathType.SINGLE)) {
//                    response.setLastPage(Integer.parseInt(Objects.requireNonNull(responseEntity.getHeaders().getFirst("navigationLastPage"))));
//                }
            }
            else {
               response = setNoContent(responseClass, modelClass, requestUrl, requestEntity, responseEntity);
            }
        }
        catch(HttpClientErrorException e)
        {
            response = setClientError(responseClass, modelClass, requestUrl, requestEntity, e);
        }
        catch(ResourceAccessException e) {
            response = setServerError(responseClass, modelClass, requestUrl, requestEntity, e);
        }
        return response;
    }

    // Head request for last page value
    private Integer getLastPage(XRequest request) {
        Integer response = null;
        String requestUrl = getRequestUrl(request);
        HttpEntity<?> requestEntity = getRequestEntityHeaders(request);

        try {
            ResponseEntity<String> responseEntity = restTemplate.exchange(requestUrl, HttpMethod.HEAD, requestEntity, String.class);
            response = Integer.parseInt(Objects.requireNonNull(responseEntity.getHeaders().getFirst("navigationLastPage")));
        }
        catch(HttpClientErrorException | ResourceAccessException e)
        {
            System.out.println("Request error: " + e.getMessage());
        }
        return response;
    }

    // Creates the request url. Optional query parameter values appended here.
    private String getRequestUrl(XRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(endpoint.getHref());
        if(!request.servicePath().getServicePathType().equals(ServicePathType.OBJECT)) {
            if(request.idType().equals(IdType.REFID)) {
                builder.path(StringUtils.replace(request.servicePath().getValue(), "{refId}", request.id()));
            }
            else {
                builder.path(StringUtils.replace(request.servicePath().getValue(), "{id}", request.id()));
            }
        }
        else {
            builder.path(request.servicePath().getValue());
        }

        if(request.hasChangesSince()) {
            builder.queryParam("changesSinceMarker", request.changesSince().toISO8601());
        }
        else if(request.hasAUPP()) {
            builder.queryParam(AUPPType.GET.getValue(), true);
        }
        return builder.build().toUriString();
    }

    // Creates the request url with the provided header values.
    private HttpEntity<?> getRequestEntityHeaders(XRequest request) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + endpoint.getToken());

        if(request.hasIdType() && !request.idType().equals(IdType.REFID)) {
            headers.set("IdType", request.idType().getValue());
        }

        if(request.hasPaging()) {
            headers.set("navigationPage", String.valueOf(request.paging().getNavigationPage()));
            headers.set("navigationPageSize", String.valueOf(request.paging().getNavigationPageSize()));
        }

        if(request.hasSchoolYear()) {
            headers.set("SchoolYear", String.valueOf(request.schoolYear()));
        }
        return new HttpEntity<>(headers);
    }

    // Verify the request matches the response type.
    private <R extends IResponse<M>, M extends Model> void verifyRequest(XRequest request, Class<R> responseClass) {
        if(!request.servicePath().getResponseClass().equals(responseClass)) {
            throw new IllegalArgumentException("The service path " + request.servicePath() + " requires the response: " + request.servicePath().getResponseClass().getCanonicalName()
                + ". The current response type is: " + responseClass.getCanonicalName() +".");
        }
    }

    // Set response for no content.
    private <R extends IResponse<M>, M extends Model> R setNoContent(Class<R> responseClass, Class<M> modelClass, String setRequestUrl, HttpEntity<?> httpEntity, ResponseEntity<?> response) {
        R responseError = null;
        try {
            responseError = responseClass.getDeclaredConstructor().newInstance();
            responseError.setData(modelClass.getDeclaredConstructor().newInstance());
            responseError.setRequestUrl(setRequestUrl);
            responseError.setRequestHeaders(httpEntity.getHeaders());
            responseError.setResponseStatusCode(response.getStatusCode());
            responseError.setResponseStatusText(response.getStatusCode().getReasonPhrase());
            responseError.setResponseHeaders(response.getHeaders());
        }
        catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return responseError;
    }

    // Set response on client error i.e. status code 404.
    private <R extends IResponse<M>, M extends Model> R setClientError(Class<R> responseClass, Class<M> modelClass, String requestUrl, HttpEntity<?> httpEntity, HttpClientErrorException exception) {
        R responseError = null;
        try {
            responseError = responseClass.getDeclaredConstructor().newInstance();
            responseError.setData(modelClass.getDeclaredConstructor().newInstance());
            responseError.setRequestUrl(requestUrl);
            responseError.setRequestHeaders(httpEntity.getHeaders());
            responseError.setResponseStatusCode(exception.getStatusCode());
            responseError.setResponseStatusText(exception.getStatusCode().getReasonPhrase());
            responseError.setResponseHeaders(exception.getResponseHeaders());
        }
        catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return responseError;
    }

    // Set response on server error i.e. status code 500.
    private <R extends IResponse<M>, M extends Model> R setServerError(Class<R> responseClass, Class<M> modelClass, String requestUrl, HttpEntity<?> httpEntity, ResourceAccessException exception) {
        R responseError = null;
        try {
            responseError = responseClass.getDeclaredConstructor().newInstance();
            responseError.setData(modelClass.getDeclaredConstructor().newInstance());
            responseError.setRequestUrl(requestUrl);
            responseError.setRequestHeaders(httpEntity.getHeaders());
            responseError.setResponseStatusCode(HttpStatus.INTERNAL_SERVER_ERROR);
            responseError.setResponseStatusText(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
            responseError.setResponseHeaders(new HttpHeaders());
        }
        catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return responseError;
    }
}