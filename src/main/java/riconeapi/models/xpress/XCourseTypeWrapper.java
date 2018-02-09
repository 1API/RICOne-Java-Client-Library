package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"xCourse"
})
public class XCourseTypeWrapper {

	@JsonProperty("xCourse")
	private XCourseType xCourse;

	public XCourseTypeWrapper() {
	}

	public XCourseTypeWrapper(XCourseType xCourse) {
	super();
	this.xCourse = xCourse;
	}

	@JsonProperty("xCourse")
	public XCourseType getXCourse() {
	return xCourse;
	}

	@JsonProperty("xCourse")
	public void setXCourse(XCourseType xCourse) {
	this.xCourse = xCourse;
	}

	@Override public String toString()
	{
		return "XCourseTypeWrapper{" + "xCourse=" + xCourse + '}';
	}
}