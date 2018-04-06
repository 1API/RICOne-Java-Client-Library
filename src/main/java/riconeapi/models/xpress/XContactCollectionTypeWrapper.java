package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
	"xContacts"
})
public class XContactCollectionTypeWrapper {

	@JsonProperty("xContacts")
	private XContactCollectionType xContacts;

	public XContactCollectionTypeWrapper() {
	}

	public XContactCollectionTypeWrapper(XContactCollectionType xContacts) {
		super();
		this.xContacts = xContacts;
	}

	@JsonProperty("xContacts")
	public XContactCollectionType getXContacts() {
	return xContacts;
	}

	@JsonProperty("xContacts")
	public void setXContacts(XContactCollectionType xContacts) {
	this.xContacts = xContacts;
	}

	@Override public String toString()
	{
		return "XContactCollectionTypeWrapper{" + "xContacts=" + xContacts + '}';
	}
}