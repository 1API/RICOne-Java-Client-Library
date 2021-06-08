package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XStaff;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for a single xStaff record.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xStaff"})
public class XStaffResponse extends XResponse<XStaff> {
    @JsonProperty("xStaff")
    private XStaff xStaff;

    /**
     * Empty constructor.
     */
    public XStaffResponse() {
    }

    /**
     * Creates an empty constructor with an xStaff object.
     * @param xStaff a single xStaff.
     */
    public XStaffResponse(XStaff xStaff) {
        super();
        this.xStaff = xStaff;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xStaff")
//    public XStaff getXStaff() {
//        return xStaff;
//    }
//
//    @JsonProperty("xStaff")
//    public void setXStaff(XStaff xStaff) {
//        this.xStaff = xStaff;
//    }

    @Override
    public XStaff getData() {
        return xStaff;
    }

    @Override
    public void setData(XStaff data) {
        this.xStaff = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XStaffResponse{" + "xStaff=" + xStaff + '}';
    }
}