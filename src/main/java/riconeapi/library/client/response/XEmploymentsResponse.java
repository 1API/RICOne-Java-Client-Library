package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XEmployments;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for multiple xEmployment records.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xEmployments"})
public class XEmploymentsResponse extends XResponse<XEmployments> {
    @JsonProperty("xEmployments")
    private XEmployments xEmployments;

    /**
     * Empty constructor.
     */
    public XEmploymentsResponse() { }

    /**
     * Creates an empty constructor with an xEmployments object.
     * @param xEmployments a list of xEmployment.
     */
    public XEmploymentsResponse(XEmployments xEmployments) {
        super();
        this.xEmployments = xEmployments;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xEmployments")
//    public XEmployments getXEmployments() {
//        return xEmployments;
//    }
//
//    @JsonProperty("xEmployments")
//    public void setXEmployments(XEmployments xEmployments) {
//        this.xEmployments = xEmployments;
//    }

    @Override
    public XEmployments getData() {
        return xEmployments;
    }

    @Override
    public void setData(XEmployments data) {
        this.xEmployments = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XEmploymentsResponse{" + "xEmployments=" + xEmployments + '}';
    }
}