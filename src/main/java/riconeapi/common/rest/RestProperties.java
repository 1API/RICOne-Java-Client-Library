package riconeapi.common.rest;

import org.springframework.util.StringUtils;
import riconeapi.common.objects.ServicePath;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/20/2018
 */
@SuppressWarnings("unused")
public class RestProperties {
    private String baseUrl;
    private ServicePath servicePath;
    private String refId;
    private RestHeader restHeader;
    private RestQueryParameter restQueryParameter;

    public RestProperties(String baseUrl, ServicePath servicePath, RestHeader restHeader, RestQueryParameter restQueryParameter) {
        this.baseUrl = baseUrl;
        this.servicePath = servicePath;
        this.restHeader = restHeader;
        this.restQueryParameter = restQueryParameter;
    }

    public RestProperties(String baseUrl, ServicePath servicePath, String refId, RestHeader restHeader, RestQueryParameter restQueryParameter) {
        this.baseUrl = baseUrl;
        this.servicePath = servicePath;
        this.refId = refId;
        this.restHeader = restHeader;
        this.restQueryParameter = restQueryParameter;
    }

    String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
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

    RestHeader getRestHeader() {
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
                "baseUrl='" + baseUrl + '\'' +
                ", servicePath=" + servicePath +
                ", refId='" + refId + '\'' +
                ", restHeader=" + restHeader +
                ", restQueryParameter=" + restQueryParameter +
                '}';
    }
}
