package riconeapi.library.client.common;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 2.0.0
 * @since 11/17/2020
 */

/**
 * The root interface of an XResponse. The interface returns data and information about the response.
 * @param <M> the data model object response.
 */
public interface IResponse<M> {
    /**
     * Gets the response data of a model object.
     * @return data of a model object.
     */
    M getData();

    /**
     * Sets the response data of a model object.
     * @param data the values of a model object.
     */
    void setData(M data);

    /**
     * Gets the request url.
     * @return the string value of the request URL.
     */
    String getRequestUrl();

    /**
     * Sets the request url.
     * @param requestUrl the request URL.
     */
    void setRequestUrl(String requestUrl);

    /**
     * Gets the request headers.
     * @return a multi-value map of the request headers.
     */
    HttpHeaders getRequestHeaders();

    /**
     * Sets the request headers.
     * @param requestHeaders the request headers.
     */
    void setRequestHeaders(HttpHeaders requestHeaders);

    /**
     * Gets the http response status code.
     * @return the HttpStatus type of the response.
     */
    HttpStatus getResponseStatusCode();

    /**
     * Sets the http status code.
     * @param status the http status code.
     */
    void setResponseStatusCode(HttpStatus status);

    /**
     * Gets the http status text value.
     * @return the string value of the http status text.
     */
    String getResponseStatusText();

    /**
     * Sets the http status text.
     * @param statusText the status text value.
     */
    void setResponseStatusText(String statusText);

    /**
     * Gets the response headers.
     * @return a multi-value map of the response headers.
     */
    HttpHeaders getResponseHeaders();

    /**
     * Sets the response headers.
     * @param responseHeaders the response headers.
     */
    void setResponseHeaders(HttpHeaders responseHeaders);

    /**
     * Gets the response in JSON formatting.
     * @return the formatted JSON response.
     */
    String getJSON();

    /**
     * Gets the response in XML formatting.
     * @return the formatted XML response.
     */
    String getXML();

}
