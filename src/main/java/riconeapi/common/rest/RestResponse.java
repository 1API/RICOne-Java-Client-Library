package riconeapi.common.rest;

import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import riconeapi.exceptions.AuthenticationException;
import riconeapi.models.xpress.ICollectionType;
import riconeapi.models.xpress.IType;

import java.util.Collections;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.9.0
 * @since 5/8/2020
 */
@SuppressWarnings("unchecked")
public class RestResponse {
    private Integer navigationLastPage;

    public HeaderResponse headRequest(RestTemplate rt, RestProperties rp) throws AuthenticationException {
        ResponseEntity<String> response;
        HeaderResponse headerResponse = new HeaderResponse();

        response = rt.exchange(UrlBuilder.urlBuildler(rp), HttpMethod.HEAD, getEntityHeaders(rp), String.class);
        headerResponse.setHeader(response.toString());
        headerResponse.setStatusCode(response.getStatusCode().value());
        headerResponse.setMessage(response.getStatusCode().getReasonPhrase());
        if(rp.getRestHeader().hasPaging()) {
            headerResponse.setNavigationLastPage(Integer.parseInt(response.getHeaders().getFirst("NavigationLastPage")));
            headerResponse.setRecordCount(Integer.parseInt(response.getHeaders().getFirst("NavigationCount")));
        }
        else {
            headerResponse.setRecordCount(Integer.parseInt(response.getHeaders().getFirst("X-Record-Count")));
        }
        return headerResponse;
    }

    // Response for all object returns.
    public <T extends ICollectionType<E>, E> ResponseMulti<E> makeAllRequest(RestTemplate rt, RestProperties rp, Class clazz) throws AuthenticationException {
        ResponseEntity<T> response;
        ResponseMulti<E> output = new ResponseMulti<>();

        try {
            response = rt.exchange(UrlBuilder.urlBuildler(rp), HttpMethod.GET, getEntityHeaders(rp), clazz);

            if(rp.getRestHeader().hasPaging()) {
                setNavigationLastPage(Integer.parseInt(response.getHeaders().getFirst("navigationLastPage")));
            }
            if (response.getBody() != null) {
                output.setData(response.getBody().getObject());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        }
        catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    // Response for predicate returns.
    public <T extends ICollectionType<E>, E> ResponseMulti<E> makeAllRequestByRefId(RestTemplate rt, RestProperties rp, Class clazz) throws AuthenticationException {
        ResponseEntity<T> response;
        ResponseMulti<E> output = new ResponseMulti<>();

        try {
            response = rt.exchange(UrlBuilder.urlBuildler(rp), HttpMethod.GET, getEntityHeaders(rp), clazz, rp.getRefId());

            if(rp.getRestHeader().hasPaging()) {
                setNavigationLastPage(Integer.parseInt(response.getHeaders().getFirst("navigationLastPage")));
            }
            if (response.getBody() != null) {
                output.setData(response.getBody().getObject());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        }
        catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    // Response for AUPP returns.
    public <T extends ICollectionType<E>, E> ResponseMulti<E> makeAllRequestByAupp(RestTemplate rt, RestProperties rp, Class clazz) throws AuthenticationException {
        ResponseEntity<T> response;
        ResponseMulti<E> output = new ResponseMulti<>();

        try {
            response = rt.exchange(UrlBuilder.urlBuildler(rp), HttpMethod.GET, getEntityHeaders(rp), clazz, rp.getRefId());

            if(rp.getRestHeader().hasPaging()) {
                setNavigationLastPage(Integer.parseInt(response.getHeaders().getFirst("navigationLastPage")));
            }
            if (response.getBody() != null) {
                output.setData(response.getBody().getObject());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        }
        catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    // Response for single refId returns.
    public <T extends IType<E>, E> ResponseSingle<E> makeSingleRequest(RestTemplate rt, RestProperties rp, Class clazz) throws AuthenticationException {
        ResponseEntity<T> response;
        ResponseSingle<E> output = new ResponseSingle<>();

        try {
            response = rt.exchange(UrlBuilder.urlBuildler(rp), HttpMethod.GET, getEntityHeaders(rp), clazz, rp.getRefId());

            if (response.getBody() != null) {
                output.setData(response.getBody().getObject());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        }
        catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    // Response for BEDS code and Local Id returns.
    public <T extends IType<E>, E> ResponseSingle<E> makeSingleRequestById(RestTemplate rt, RestProperties rp, Class clazz) throws AuthenticationException {
        ResponseEntity<T> response;
        ResponseSingle<E> output = new ResponseSingle<>();

        try {
            response = rt.exchange(UrlBuilder.urlBuildler(rp), HttpMethod.GET, getEntityHeaders(rp), clazz, rp.getRestHeader().getId());

            if (response.getBody() != null) {
                output.setData(response.getBody().getObject());
            }
            output.setMessage(response.getStatusCode().getReasonPhrase());
            output.setStatusCode(response.getStatusCode().value());
            output.setHeader(response.getHeaders().toString());
        }
        catch (HttpClientErrorException e) {
            output.setMessage(e.getStatusText());
            output.setStatusCode(e.getStatusCode().value());
            output.setHeader(e.getResponseHeaders().toString());
        }
        return output;
    }

    // Response for JSON and XML returns.
    public String makeJsonXmlRequest(RestTemplate rt, RestProperties rp) throws AuthenticationException {
        ResponseEntity<String> response;

        if(rp.hasRefId()) {
            response = rt.exchange(UrlBuilder.urlBuildler(rp), HttpMethod.GET, getEntityHeaders(rp), String.class, rp.getRefId());
        }
        else if(rp.getRestHeader().hasIdType()) {
            response = rt.exchange(UrlBuilder.urlBuildler(rp), HttpMethod.GET, getEntityHeaders(rp), String.class, rp.getRestHeader().getId());
        }
        else {
            response = rt.exchange(UrlBuilder.urlBuildler(rp), HttpMethod.GET, getEntityHeaders(rp), String.class);
        }
        return response.getBody();
    }

    // Get Headers for request
    private HttpEntity<?> getEntityHeaders(RestProperties rp) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + rp.getEndpoint().getToken());

        if(rp.getRestHeader().hasContentType()) {
            headers.setContentType(rp.getRestHeader().getContentType().getValue());
            headers.setAccept(Collections.singletonList(rp.getRestHeader().getContentType().getValue()));
        }
        else {
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        }

        if (rp.getRestHeader().hasPaging()) {
            headers.set("navigationPage", rp.getRestHeader().getNavigationPage());
            headers.set("navigationPageSize", rp.getRestHeader().getNavigationPageSize());
        }
        if (rp.getRestHeader().hasIdType()) {
            headers.set("IdType", rp.getRestHeader().getIdType());
        }
        if (rp.getRestHeader().hasSchoolYear()) {
            headers.set("SchoolYear", rp.getRestHeader().getSchoolYear());
        }
        return new HttpEntity<>(headers);
    }

    @Deprecated
    public Integer getNavigationLastPage() {
        return navigationLastPage;
    }

    @Deprecated
    private void setNavigationLastPage(Integer navigationLastPage) {
        this.navigationLastPage = navigationLastPage;
    }
}
