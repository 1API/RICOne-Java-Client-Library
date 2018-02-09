
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
		"studentReference"
})
public class XStudentReferenceListType {

	@JsonProperty("studentReference")
	private List<XPersonReferenceType> studentReference = new ArrayList<>();

	public XStudentReferenceListType() {
	}

	public XStudentReferenceListType(List<XPersonReferenceType> studentReference) {
		super();
		this.studentReference = studentReference;
	}

	@JsonProperty("studentReference")
	public List<XPersonReferenceType> getStudentReference() {
		return studentReference;
	}

	@JsonProperty("studentReference")
	public void setStudentReference(List<XPersonReferenceType> studentReference) {
		this.studentReference = studentReference;
	}

	@Override public String toString()
	{
		return "XStudentReferenceListType{" + "studentReference=" + studentReference + '}';
	}
}
