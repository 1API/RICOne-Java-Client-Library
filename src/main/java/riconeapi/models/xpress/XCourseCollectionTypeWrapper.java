package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
	"xCourses"
})
public class XCourseCollectionTypeWrapper {

	@JsonProperty("xCourses")
	private XCourseCollectionType xCourses;

	public XCourseCollectionTypeWrapper() {
	}

	public XCourseCollectionTypeWrapper(XCourseCollectionType xCourses) {
	super();
	this.xCourses = xCourses;
	}

	@JsonProperty("xCourses")
	public XCourseCollectionType getXCourses() {
	return xCourses;
	}

	@JsonProperty("xCourses")
	public void setXCourses(XCourseCollectionType xCourses) {
	this.xCourses = xCourses;
	}

	@Override public String toString()
	{
		return "XCourseCollectionTypeWrapper{" + "xCourses=" + xCourses + '}';
	}
}