package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XSchool;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for a single xSchool record.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xSchool"})
public class XSchoolResponse extends XResponse<XSchool> {
    @JsonProperty("xSchool")
    private XSchool xSchool;

    /**
     * Empty constructor.
     */
    public XSchoolResponse() {
    }

    /**
     * Creates an empty constructor with an xSchool object.
     * @param xSchool a single xSchool.
     */
    public XSchoolResponse(XSchool xSchool) {
        super();
        this.xSchool = xSchool;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xSchool")
//    public XSchool getXSchool() {
//        return xSchool;
//    }
//
//    @JsonProperty("xSchool")
//    public void setXSchool(XSchool xSchool) {
//        this.xSchool = xSchool;
//    }

    @Override
    public XSchool getData() {
        return xSchool;
    }

    @Override
    public void setData(XSchool data) {
        this.xSchool = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XSchoolResponse{" + "xSchool=" + xSchool + '}';
    }
}