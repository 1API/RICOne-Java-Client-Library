package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XRosters;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for multiple xRoster records.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xRosters"})
public class XRostersResponse extends XResponse<XRosters> {
    @JsonProperty("xRosters")
    private XRosters xRosters;

    /**
     * Empty constructor.
     */
    public XRostersResponse() {
    }

    /**
     * Creates an empty constructor with an xRosters object.
     * @param xRosters a list of xRoster.
     */
    public XRostersResponse(XRosters xRosters) {
        super();
        this.xRosters = xRosters;
    }
    // TODO: 4/14/2021 remove?
//    @JsonProperty("xRosters")
//    public XRosters getXRosters() {
//        return xRosters;
//    }
//
//    @JsonProperty("xRosters")
//    public void setXRosters(XRosters xRosters) {
//        this.xRosters = xRosters;
//    }

    @Override
    public XRosters getData() {
        return xRosters;
    }

    @Override
    public void setData(XRosters data) {
        this.xRosters = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XRostersResponse{" + "xRosters=" + xRosters + '}';
    }
}