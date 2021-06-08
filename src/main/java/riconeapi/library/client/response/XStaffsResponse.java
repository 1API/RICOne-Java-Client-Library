package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XStaffs;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for multiple xStaff records.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xStaffs"})
public class XStaffsResponse extends XResponse<XStaffs> {
    @JsonProperty("xStaffs")
    private XStaffs xStaffs;

    /**
     * Empty constructor.
     */
    public XStaffsResponse() {
    }

    /**
     * Creates an empty constructor with an xStaffs object.
     * @param xStaffs a list of xStaff.
     */
    public XStaffsResponse(XStaffs xStaffs) {
        super();
        this.xStaffs = xStaffs;
    }

// TODO: 4/14/2021 remove?
//    @JsonProperty("xStaffs")
//    public XStaffs getXStaffs() {
//        return xStaffs;
//    }
//
//    @JsonProperty("xStaffs")
//    public void setXStaffs(XStaffs xStaffs) {
//        this.xStaffs = xStaffs;
//    }

    @Override
    public XStaffs getData() {
        return xStaffs;
    }

    @Override
    public void setData(XStaffs data) {
        this.xStaffs = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XStaffsResponse{" + "xStaffs=" + xStaffs + '}';
    }
}