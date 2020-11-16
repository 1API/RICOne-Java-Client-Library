package riconeapi.common.objects;

import org.springframework.web.client.RestTemplate;
import riconeapi.authentication.Endpoint;
import riconeapi.common.rest.*;
import riconeapi.exceptions.AuthenticationException;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 1.9.0
 * @since 11/5/2020
 */
public class HeaderRequest implements IHeaderRequest {
    private final RestTemplate rt;
    private final Endpoint endpoint;

    public HeaderRequest(RestTemplate rt, Endpoint endpoint) {
        this.rt = rt;
        this.endpoint = endpoint;
    }

    @Override
    public HeaderResponse getHeaders(ServicePath servicePath) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, rh, rqp);
        return rr.headRequest(rt, rp);
    }

    @Override
    public HeaderResponse getHeaders(ServicePath servicePath, int navigationPageSize) throws AuthenticationException {
        int navigationPage = 1;
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, rh, rqp);
        return rr.headRequest(rt, rp);
    }

    @Override
    public HeaderResponse getHeaders(ServicePath servicePath, int navigationPageSize, int schoolYear) throws AuthenticationException {
        int navigationPage = 1;
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, rh, rqp);
        return rr.headRequest(rt, rp);
    }

    @Override
    public HeaderResponse getHeaders(ServicePath servicePath, int navigationPageSize, String opaqueMarker) throws AuthenticationException {
        int navigationPage = 1;
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter(opaqueMarker);
        RestProperties rp = new RestProperties(endpoint, servicePath, rh, rqp);
        return rr.headRequest(rt, rp);
    }

    @Override
    public HeaderResponse getHeaders(ServicePath servicePath, String refId) throws AuthenticationException {
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader();
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
        return rr.headRequest(rt, rp);
    }

    @Override
    public HeaderResponse getHeaders(ServicePath servicePath, String refId, int navigationPageSize) throws AuthenticationException {
        int navigationPage = 1;
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
        return rr.headRequest(rt, rp);
    }

    @Override
    public HeaderResponse getHeaders(ServicePath servicePath, String refId, int navigationPageSize, int schoolYear) throws AuthenticationException {
        int navigationPage = 1;
        RestResponse rr = new RestResponse();
        RestHeader rh = new RestHeader(navigationPage, navigationPageSize, schoolYear);
        RestQueryParameter rqp = new RestQueryParameter();
        RestProperties rp = new RestProperties(endpoint, servicePath, refId, rh, rqp);
        return rr.headRequest(rt, rp);
    }

}
