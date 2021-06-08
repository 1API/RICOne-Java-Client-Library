package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XLeas;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for multiple xLea records.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xLeas"})
public class XLeasResponse extends XResponse<XLeas> {
    @JsonProperty("xLeas")
    private XLeas xLeas;

    /**
     * Empty constructor.
     */
    public XLeasResponse() { }

    /**
     * Creates an empty constructor with an xLeas object.
     * @param xLeas a list of xLea.
     */
    public XLeasResponse(XLeas xLeas) {
        super();
        this.xLeas = xLeas;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xLeas")
//    public XLeas getXLeas() {
//        return xLeas;
//    }
//
//    @JsonProperty("xLeas")
//    public void setXLeas(XLeas xLeas) {
//        this.xLeas = xLeas;
//    }

    @Override
    public XLeas getData() {
        return xLeas;
    }

    @Override
    public void setData(XLeas data) {
        this.xLeas = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XLeasResponse{" + "xLeas=" + xLeas + '}';
    }
}