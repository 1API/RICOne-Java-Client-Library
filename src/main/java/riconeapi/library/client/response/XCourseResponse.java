package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XCourse;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for a single xCourse record.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xCourse"})
public class XCourseResponse extends XResponse<XCourse> {
    @JsonProperty("xCourse")
    private XCourse xCourse;

    /**
     * Empty constructor.
     */
    public XCourseResponse() {
    }

    /**
     * Creates an empty constructor with an xCourse object.
     * @param xCourse a single xCourse.
     */
    public XCourseResponse(XCourse xCourse) {
        super();
        this.xCourse = xCourse;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xCourse")
//    public XCourse getXCourse() {
//        return xCourse;
//    }
//
//    @JsonProperty("xCourse")
//    public void setXCourse(XCourse xCourse) {
//        this.xCourse = xCourse;
//    }

    @Override
    public XCourse getData() {
        return xCourse;
    }

    @Override
    public void setData(XCourse data) {
        this.xCourse = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XCourseResponse{" + "xCourse=" + xCourse + '}';
    }
}