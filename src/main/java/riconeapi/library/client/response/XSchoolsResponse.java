package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XSchools;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for multiple xSchool records.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xSchools"})
public class XSchoolsResponse extends XResponse<XSchools> {
    @JsonProperty("xSchools")
    private XSchools xSchools;

    /**
     * Empty constructor.
     */
    public XSchoolsResponse() {
    }

    /**
     * Creates an empty constructor with an xSchools object.
     * @param xSchools a list of xSchool.
     */
    public XSchoolsResponse(XSchools xSchools) {
        super();
        this.xSchools = xSchools;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xSchools")
//    public XSchools getXSchools() {
//        return xSchools;
//    }
//
//    @JsonProperty("xSchools")
//    public void setXSchools(XSchools xSchools) {
//        this.xSchools = xSchools;
//    }

    @Override
    public XSchools getData() {
        return xSchools;
    }

    @Override
    public void setData(XSchools data) {
        this.xSchools = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XSchoolsResponse{" + "xSchools=" + xSchools + '}';
    }
}