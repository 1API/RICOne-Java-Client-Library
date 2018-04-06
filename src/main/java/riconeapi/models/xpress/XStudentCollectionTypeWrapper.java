package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
	"xStudents"
})
public class XStudentCollectionTypeWrapper
{
	@JsonProperty("xStudents")
	private XStudentCollectionType xStudents;

	public XStudentCollectionTypeWrapper() {
	}

	public XStudentCollectionTypeWrapper(XStudentCollectionType xStudents) {
		super();
		this.xStudents = xStudents;
	}

	@JsonProperty("xStudents")
	public XStudentCollectionType getXStudents() {
		return xStudents;
	}

	@JsonProperty("xStudents")
	public void setXStudents(XStudentCollectionType xStudents) {
		this.xStudents = xStudents;
	}

	@Override public String toString()
	{
		return "XStudentCollectionTypeWrapper{" + "xStudents=" + xStudents + '}';
	}
}
