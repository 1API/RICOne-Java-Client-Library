package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
	"xRoster"
})
public class XRosterTypeWrapper {

	@JsonProperty("xRoster")
	private XRosterType xRoster;

	public XRosterTypeWrapper() {
	}

	public XRosterTypeWrapper(XRosterType xRoster) {
		super();
		this.xRoster = xRoster;
	}

	@JsonProperty("xRoster")
	public XRosterType getXRoster() {
	return xRoster;
	}

	@JsonProperty("xRoster")
	public void setXRoster(XRosterType xRoster) {
	this.xRoster = xRoster;
	}

	@Override public String toString()
	{
		return "XRosterTypeWrapper{" + "xRoster=" + xRoster + '}';
	}
}