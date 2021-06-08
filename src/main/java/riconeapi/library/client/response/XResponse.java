package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import riconeapi.library.client.common.IResponse;
import riconeapi.library.client.common.Model;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 2.0.0
 * @since 11/17/2020
 */

/**
 * The XResponse class implements the IResponse interface {@link IResponse}.
 * @param <M> the xPress data model object response.
 */
public abstract class XResponse<M extends Model> implements IResponse<M> {
    @JsonIgnore
    private String requestUrl;
    @JsonIgnore
    private HttpHeaders requestHeaders;
    @JsonIgnore
    private HttpStatus responseStatusCode;
    @JsonIgnore
    private String responseStatusText;
    @JsonIgnore
    private HttpHeaders responseHeaders;

    @Override
    public abstract M getData();

    @Override
    public abstract void setData(M data);

    @Override
    public String getRequestUrl() {
        return requestUrl;
    }

    @Override
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    @Override
    public HttpHeaders getRequestHeaders() {
        return requestHeaders;
    }

    @Override
    public void setRequestHeaders(HttpHeaders requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    @Override
    public HttpStatus getResponseStatusCode() {
        return responseStatusCode;
    }

    @Override
    public void setResponseStatusCode(HttpStatus responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    @Override
    public String getResponseStatusText() {
        return responseStatusText;
    }

    @Override
    public void setResponseStatusText(String responseStatusText) {
        this.responseStatusText = responseStatusText;
    }

    @Override
    public HttpHeaders getResponseHeaders() {
        return responseHeaders;
    }

    @Override
    public void setResponseHeaders(HttpHeaders responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    @Override
    public String getJSON() {
        if(getData() != null) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            mapper.enable(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);

            ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
            try {
                return writer.writeValueAsString(getData());
            }
            catch(JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public String getXML() {
        if(getData() != null) {
            XmlMapper mapper = new XmlMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            try {
                return mapper.writeValueAsString(getData());
            }
            catch(JsonProcessingException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}

