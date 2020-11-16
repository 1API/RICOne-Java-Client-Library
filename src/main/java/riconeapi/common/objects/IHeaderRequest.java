package riconeapi.common.objects;

import riconeapi.common.rest.HeaderResponse;
import riconeapi.exceptions.AuthenticationException;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 1.9.0
 * @since 11/5/2020
 */
public interface IHeaderRequest {
    HeaderResponse getHeaders(ServicePath servicePath) throws AuthenticationException;
    HeaderResponse getHeaders(ServicePath servicePath, int navigationPageSize) throws AuthenticationException;
    HeaderResponse getHeaders(ServicePath servicePath, int navigationPageSize, int schoolYear) throws AuthenticationException;
    HeaderResponse getHeaders(ServicePath servicePath, int navigationPageSize, String opaqueMarker) throws AuthenticationException;
    HeaderResponse getHeaders(ServicePath servicePath, String refId) throws AuthenticationException;
    HeaderResponse getHeaders(ServicePath servicePath, String refId, int navigationPageSize) throws AuthenticationException;
    HeaderResponse getHeaders(ServicePath servicePath, String refId, int navigationPageSize, int schoolYear) throws AuthenticationException;
}
