package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
	"xStudent"
})
public class XStudentTypeWrapper {

	@JsonProperty("xStudent")
	private XStudentType xStudent;

	public XStudentTypeWrapper() {
	}

	public XStudentTypeWrapper(XStudentType xStudent) {
		super();
		this.xStudent = xStudent;
	}

	@JsonProperty("xStudent")
	public XStudentType getXStudent() {
return xStudent;
}

	@JsonProperty("xStudent")
	public void setXStudent(XStudentType xStudent) {
	this.xStudent = xStudent;
	}

	@Override public String toString()
	{
		return "XStudentTypeWrapper{" + "xStudent=" + xStudent + '}';
	}
}