package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XCourses;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for multiple xCourse records.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xCourses"})
public class XCoursesResponse extends XResponse<XCourses> {
    @JsonProperty("xCourses")
    private XCourses xCourses;

    /**
     * Empty constructor.
     */
    public XCoursesResponse() {
    }

    /**
     * Creates an empty constructor with an xCourses object.
     * @param xCourses a list of xCourse.
     */
    public XCoursesResponse(XCourses xCourses) {
        super();
        this.xCourses = xCourses;
    }

    // TODO: 4/14/2021 remove?
//    @JsonProperty("xCourses")
//    public XCourses getXCourses() {
//        return xCourses;
//    }
//
//    @JsonProperty("xCourses")
//    public void setXCourses(XCourses xCourses) {
//        this.xCourses = xCourses;
//    }

    @Override
    public XCourses getData() {
        return xCourses;
    }

    @Override
    public void setData(XCourses data) {
        this.xCourses = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XCoursesResponse{" + "xCourses=" + xCourses + '}';
    }
}