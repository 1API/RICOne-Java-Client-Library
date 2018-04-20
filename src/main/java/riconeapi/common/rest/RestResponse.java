package riconeapi.common.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import riconeapi.authentication.Authenticator;
import riconeapi.models.xpress.ICollectionType;
import riconeapi.models.xpress.IType;
import riconeapi.exceptions.AuthenticationException;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/20/2018
 */
@SuppressWarnings("unchecked")
public class RestResponse {
    private Integer navigationLastPage;

    public <T extends ICollectionType<E>, E> ResponseMulti<E> makeAllRequest(RestTemplate rt, RestProperties rp, Class clazz) throws AuthenticationException {
        ResponseEntity<T> response;
        ResponseMulti<E> output = new ResponseMulti<>();
        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            response = rt.exchange(urlBuilder(rp), HttpMethod.GET, getEntityHeaders(rp), clazz);

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

    public <T extends ICollectionType<E>, E> ResponseMulti<E> makeAllRequestByRefId(RestTemplate rt, RestProperties rp, Class clazz) throws AuthenticationException {
        ResponseEntity<T> response;
        ResponseMulti<E> output = new ResponseMulti<>();
        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            response = rt.exchange(urlBuilder(rp), HttpMethod.GET, getEntityHeaders(rp), clazz, rp.getRefId());

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

    public <T extends ICollectionType<E>, E> ResponseMulti<E> makeAllRequestByAupp(RestTemplate rt, RestProperties rp, Class clazz) throws AuthenticationException {
        ResponseEntity<T> response;
        ResponseMulti<E> output = new ResponseMulti<>();
        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            response = rt.exchange(urlBuilder(rp), HttpMethod.GET, getEntityHeaders(rp), clazz, rp.getRefId());

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

    public <T extends IType<E>, E> ResponseSingle<E> makeSingleRequest(RestTemplate rt, RestProperties rp, Class clazz) throws AuthenticationException {
        ResponseEntity<T> response;
        ResponseSingle<E> output = new ResponseSingle<>();
        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            response = rt.exchange(urlBuilder(rp), HttpMethod.GET, getEntityHeaders(rp), clazz, rp.getRefId());

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

    public <T extends IType<E>, E> ResponseSingle<E> makeSingleRequestById(RestTemplate rt, RestProperties rp, Class clazz) throws AuthenticationException {
        ResponseEntity<T> response;
        ResponseSingle<E> output = new ResponseSingle<>();
        Authenticator.getInstance().refreshToken(Authenticator.getInstance().getToken());

        try {
            response = rt.exchange(urlBuilder(rp), HttpMethod.GET, getEntityHeaders(rp), clazz, rp.getRestHeader().getId());

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

    // Get Headers for request
    private HttpEntity<?> getEntityHeaders(RestProperties rp) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + Authenticator.getInstance().getToken());

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

        return new HttpEntity<Object>(headers);
    }

    // Build URL with optional query parameters
    private String urlBuilder(RestProperties rp) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(rp.getBaseUrl());
        if (rp.hasRefId() && !rp.getServicePath().getType().equals(ServicePathType.OBJECT)) {
            String tempUrl = rp.getServicePath().getValue();
            tempUrl = tempUrl.replaceAll("\\{[^}]*}", rp.getRefId());
            builder.path(tempUrl);

            if(rp.getRestQueryParameter().isCreateUsers()) {
                builder.queryParam("createUsers", "true");
            }
            else if(rp.getRestQueryParameter().isDeleteUsers()) {
                builder.queryParam("deleteUsers", "true");
            }
            else if(rp.getRestQueryParameter().isGetUsers()) {
                builder.queryParam("getUsers", "true");
            }
        }
        else if(rp.getRestHeader().hasIdType()) {
            String tempUrl = rp.getServicePath().getValue();
            tempUrl = tempUrl.replaceAll("\\{[^}]*}", rp.getRestHeader().getId());
            builder.path(tempUrl);
        }
        else {
            builder.path(rp.getServicePath().getValue());
            if (rp.getRestQueryParameter().hasOpaqueMarker()) {
                builder.queryParam("changesSinceMarker", rp.getRestQueryParameter().getOpaqueMarker());
            }
        }
        return builder.build().toUriString();
    }

    public Integer getNavigationLastPage() {
        return navigationLastPage;
    }

    private void setNavigationLastPage(Integer navigationLastPage) {
        this.navigationLastPage = navigationLastPage;
    }
}
