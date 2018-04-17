package riconeapi.common;

import org.springframework.util.StringUtils;
import riconeapi.common.paths.ServicePath;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/16/2018
 */
public class RestProperties {
    private String baseUrl;
    private ServicePath servicePath;
    private String refId;
    private RestHeader restHeader;
    private RestQueryParameter restQueryParameter;


    public RestProperties(String baseUrl, ServicePath servicePath, RestHeader restHeader) {
        this.baseUrl = baseUrl;
        this.servicePath = servicePath;
        this.restHeader = restHeader;
    }

    public RestProperties(String baseUrl, ServicePath servicePath, RestHeader restHeader, RestQueryParameter restQueryParameter) {
        this.baseUrl = baseUrl;
        this.servicePath = servicePath;
        this.restHeader = restHeader;
        this.restQueryParameter = restQueryParameter;
    }

    public RestProperties(String baseUrl, ServicePath servicePath, String refId, RestHeader restHeader) {
        this.baseUrl = baseUrl;
        this.servicePath = servicePath;
        this.refId = refId;
        this.restHeader = restHeader;
    }

    public RestProperties(String baseUrl, ServicePath servicePath, String refId, RestHeader restHeader, RestQueryParameter restQueryParameter) {
        this.baseUrl = baseUrl;
        this.servicePath = servicePath;
        this.refId = refId;
        this.restHeader = restHeader;
        this.restQueryParameter = restQueryParameter;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public ServicePath getServicePath() {
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

    public RestQueryParameter getRestQueryParameter() {
        return restQueryParameter;
    }

    public void setRestQueryParameter(RestQueryParameter restQueryParameter) {
        this.restQueryParameter = restQueryParameter;
    }

    public boolean hasRefId() {
        return !StringUtils.isEmpty(this.getRefId());
    }
}
