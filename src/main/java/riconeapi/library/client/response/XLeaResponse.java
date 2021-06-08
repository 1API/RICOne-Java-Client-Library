package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import riconeapi.library.client.response.model.XLea;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for a single xLea record.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class XLeaResponse extends XResponse<XLea> {
    @JsonProperty("xLea")
    private XLea xLea;

    /**
     * Empty constructor.
     */
    public XLeaResponse() {
    }

    /**
     * Creates an empty constructor with an xLea object.
     * @param xLea a single xLea.
     */
    public XLeaResponse(XLea xLea) {
        super();
        this.xLea = xLea;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xLea")
//    public XLea getXLea() {
//        return xLea;
//    }
//
//    @JsonProperty("xLea")
//    public void setXLea(XLea xLea) {
//        this.xLea = xLea;
//    }

    @Override
    public XLea getData() {
        return xLea;
    }

    @Override
    public void setData(XLea data) {
        this.xLea = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XLeaResponse{" + "xLea=" + xLea + '}';
    }

}