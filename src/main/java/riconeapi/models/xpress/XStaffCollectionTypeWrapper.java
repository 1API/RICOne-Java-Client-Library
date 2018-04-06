package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
	"xStaffs"
})
public class XStaffCollectionTypeWrapper {

	@JsonProperty("xStaffs")
	private XStaffCollectionType xStaffs;

	public XStaffCollectionTypeWrapper() {
	}

	public XStaffCollectionTypeWrapper(XStaffCollectionType xStaffs) {
		super();
		this.xStaffs = xStaffs;
	}

	@JsonProperty("xStaffs")
	public XStaffCollectionType getXStaffs() {
	return xStaffs;
	}

	@JsonProperty("xStaffs")
	public void setXStaffs(XStaffCollectionType xStaffs) {
	this.xStaffs = xStaffs;
	}

}