package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
	"xRosters"
})
public class XRosterCollectionTypeWrapper {

	@JsonProperty("xRosters")
	private XRosterCollectionType xRosters;

	public XRosterCollectionTypeWrapper() {
	}

	public XRosterCollectionTypeWrapper(XRosterCollectionType xRosters) {
	super();
	this.xRosters = xRosters;
	}

	@JsonProperty("xRosters")
	public XRosterCollectionType getXRosters() {
	return xRosters;
	}

	@JsonProperty("xRosters")
	public void setXRosters(XRosterCollectionType xRosters) {
	this.xRosters = xRosters;
	}

}