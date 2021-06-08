package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XEmployment;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for a single xEmployment record.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xEmployment"})
public class XEmploymentResponse extends XResponse<XEmployment> {
    @JsonProperty("xEmployment")
    private XEmployment xEmployment;

    /**
     * Empty constructor.
     */
    public XEmploymentResponse() {
    }

    /**
     * Creates an empty constructor with an xEmployment object.
     * @param xEmployment a single xEmployment.
     */
    public XEmploymentResponse(XEmployment xEmployment) {
        super();
        this.xEmployment = xEmployment;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xEmployment")
//    public XEmployment getXEmployment() {
//        return xEmployment;
//    }
//
//    @JsonProperty("xEmployment")
//    public void setXEmployment(XEmployment xEmployment) {
//        this.xEmployment = xEmployment;
//    }

    @Override
    public XEmployment getData() {
        return xEmployment;
    }

    @Override
    public void setData(XEmployment data) {
        this.xEmployment = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XEmploymentResponse{" + "xEmployment=" + xEmployment + '}';
    }
}