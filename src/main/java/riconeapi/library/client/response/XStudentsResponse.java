package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XStudents;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for multiple xStudent records.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xStudents"})
public class XStudentsResponse extends XResponse<XStudents> {
    @JsonProperty("xStudents")
    private XStudents xStudents;

    /**
     * Empty constructor.
     */
    public XStudentsResponse() {
    }

    /**
     * Creates an empty constructor with an xStudents object.
     * @param xStudents a list of xStudent.
     */
    public XStudentsResponse(XStudents xStudents) {
        super();
        this.xStudents = xStudents;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xStudents")
//    public XStudents getXStudents() {
//        return xStudents;
//    }
//
//    @JsonProperty("xStudents")
//    public void setXStudents(XStudents xStudents) {
//        this.xStudents = xStudents;
//    }

    @Override
    public XStudents getData() {
        return xStudents;
    }

    @Override
    public void setData(XStudents data) {
        this.xStudents = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XStudentsResponse{" + "xStudents=" + xStudents + '}';
    }
}