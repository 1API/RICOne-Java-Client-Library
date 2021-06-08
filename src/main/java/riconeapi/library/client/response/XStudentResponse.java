package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XStudent;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for a single xStudent record.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xStudent"})
public class XStudentResponse extends XResponse<XStudent> {
    @JsonProperty("xStudent")
    private XStudent xStudent;

    /**
     * Empty constructor.
     */
    public XStudentResponse() {
    }

    /**
     * Creates an empty constructor with an xStudent object.
     * @param xStudent a single xStudent.
     */
    public XStudentResponse(XStudent xStudent) {
        super();
        this.xStudent = xStudent;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xStudent")
//    public XStudent getXStudent() {
//        return xStudent;
//    }
//
//    @JsonProperty("xStudent")
//    public void setXStudent(XStudent xStudent) {
//        this.xStudent = xStudent;
//    }

    @Override
    public XStudent getData() {
        return xStudent;
    }

    @Override
    public void setData(XStudent data) {
        this.xStudent = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XStudentResponse{" + "xStudent=" + xStudent + '}';
    }
}