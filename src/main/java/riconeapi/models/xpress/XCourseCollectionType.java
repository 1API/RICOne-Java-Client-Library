
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "xCourse"
})
public class XCourseCollectionType {

    @JsonProperty("xCourse")
    private List<XCourseType> xCourse = new ArrayList<>();

    public XCourseCollectionType() {
    }

    public XCourseCollectionType(List<XCourseType> xCourse) {
        super();
        this.xCourse = xCourse;
    }

    @JsonProperty("xCourse")
    public List<XCourseType> getXCourse() {
        return xCourse;
    }

    @JsonProperty("xCourse")
    public void setXCourse(List<XCourseType> xCourse) {
        this.xCourse = xCourse;
    }

    @Override
    public String toString()
    {
        return "XCourseCollectionType{" + "xCourse=" + xCourse + '}';
    }
}
