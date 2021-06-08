package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XRoster;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for a single xRoster record.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xRoster"})
public class XRosterResponse extends XResponse<XRoster> {
    @JsonProperty("xRoster")
    private XRoster xRoster;

    /**
     * Empty constructor.
     */
    public XRosterResponse() {
    }

    /**
     * Creates an empty constructor with an xRoster object.
     * @param xRoster a single xRoster.
     */
    public XRosterResponse(XRoster xRoster) {
        super();
        this.xRoster = xRoster;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xRoster")
//    public XRoster getXRoster() {
//        return xRoster;
//    }
//
//    @JsonProperty("xRoster")
//    public void setXRoster(XRoster xRoster) {
//        this.xRoster = xRoster;
//    }

    @Override
    public XRoster getData() {
        return xRoster;
    }

    @Override
    public void setData(XRoster data) {
        this.xRoster = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XRosterResponse{" + "xRoster=" + xRoster + '}';
    }
}