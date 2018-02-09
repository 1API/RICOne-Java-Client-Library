
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
		"staffPersonAssignment"
})
public class XStaffPersonAssignmentListType {

	@JsonProperty("staffPersonAssignment")
	private List<XStaffPersonAssignmentType> staffPersonAssignment = new ArrayList<>();

	public XStaffPersonAssignmentListType() {
	}

	public XStaffPersonAssignmentListType(List<XStaffPersonAssignmentType> staffPersonAssignment) {
		super();
		this.staffPersonAssignment = staffPersonAssignment;
	}

	@JsonProperty("staffPersonAssignment")
	public List<XStaffPersonAssignmentType> getStaffPersonAssignment() {
		return staffPersonAssignment;
	}

	@JsonProperty("staffPersonAssignment")
	public void setStaffPersonAssignment(List<XStaffPersonAssignmentType> staffPersonAssignment) {
		this.staffPersonAssignment = staffPersonAssignment;
	}

	@Override public String toString()
	{
		return "XStaffPersonAssignmentListType{" + "staffPersonAssignment=" + staffPersonAssignment + '}';
	}
}
