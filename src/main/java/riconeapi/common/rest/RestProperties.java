package riconeapi.common.rest;

import org.springframework.util.StringUtils;
import riconeapi.authentication.Endpoint;
import riconeapi.common.objects.ServicePath;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.9.0
 * @since 5/8/2020
 */
@SuppressWarnings("unused")
public class RestProperties {
    private Endpoint endpoint;
    private String token;
    private String baseUrl;
    private ServicePath servicePath;
    private String refId;
    private RestHeader restHeader;
    private RestQueryParameter restQueryParameter;

    public RestProperties(Endpoint endpoint, ServicePath servicePath, RestHeader restHeader, RestQueryParameter restQueryParameter) {
        this.endpoint = endpoint;
        this.token = endpoint.getToken();
        this.baseUrl = endpoint.getHref();
        this.servicePath = servicePath;
        this.restHeader = restHeader;
        this.restQueryParameter = restQueryParameter;
    }

    public RestProperties(Endpoint endpoint, ServicePath servicePath, String refId, RestHeader restHeader, RestQueryParameter restQueryParameter) {
        this.endpoint = endpoint;
        this.token = endpoint.getToken();
        this.baseUrl = endpoint.getHref();
        this.servicePath = servicePath;
        this.refId = refId;
        this.restHeader = restHeader;
        this.restQueryParameter = restQueryParameter;
    }

    public Endpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    ServicePath getServicePath() {
        return servicePath;
    }

    public void setServicePath(ServicePath servicePath) {
        this.servicePath = servicePath;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public RestHeader getRestHeader() {
        return restHeader;
    }

    public void setRestHeader(RestHeader restHeader) {
        this.restHeader = restHeader;
    }

    RestQueryParameter getRestQueryParameter() {
        return restQueryParameter;
    }

    public void setRestQueryParameter(RestQueryParameter restQueryParameter) {
        this.restQueryParameter = restQueryParameter;
    }

    boolean hasRefId() {
        return !StringUtils.isEmpty(this.getRefId());
    }

    @Override
    public String toString() {
        return "RestProperties{" +
            "endpoint=" + endpoint +
            ", token='" + token + '\'' +
            ", baseUrl='" + baseUrl + '\'' +
            ", servicePath=" + servicePath +
            ", refId='" + refId + '\'' +
            ", restHeader=" + restHeader +
            ", restQueryParameter=" + restQueryParameter +
            '}';
    }
}
