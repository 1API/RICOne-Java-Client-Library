package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
	"xContact"
})
public class XContactTypeWrapper {

	@JsonProperty("xContact")
	private XContactType xContact;

	public XContactTypeWrapper() {
	}

	public XContactTypeWrapper(XContactType xContact) {
		super();
		this.xContact = xContact;
	}

	@JsonProperty("xContact")
	public XContactType getXContact() {
	return xContact;
	}

	@JsonProperty("xContact")
	public void setXContact(XContactType xContact) {
	this.xContact = xContact;
	}

	@Override public String toString()
	{
		return "XContactTypeWrapper{" + "xContact=" + xContact + '}';
	}
}