package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
	"xStaff"
})
public class XStaffTypeWrapper {

	@JsonProperty("xStaff")
	private XStaffType xStaff;

	public XStaffTypeWrapper() {
	}

	public XStaffTypeWrapper(XStaffType xStaff) {
		super();
		this.xStaff = xStaff;
	}

	@JsonProperty("xStaff")
	public XStaffType getXStaff() {
	return xStaff;
	}

	@JsonProperty("xStaff")
	public void setXStaff(XStaffType xStaff) {
	this.xStaff = xStaff;
	}

}