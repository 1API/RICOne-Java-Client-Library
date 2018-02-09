package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"xCalendars"
})
public class XCalendarCollectionTypeWrapper {

	@JsonProperty("xCalendars")
	private XCalendarCollectionType xCalendars;

	public XCalendarCollectionTypeWrapper() {
	}

	public XCalendarCollectionTypeWrapper(XCalendarCollectionType xCalendars) {
		super();
		this.xCalendars = xCalendars;
	}

	@JsonProperty("xCalendars")
	public XCalendarCollectionType getXCalendars() {
		return xCalendars;
	}

	@JsonProperty("xCalendars")
	public void setXCalendars(XCalendarCollectionType xCalendars) {
		this.xCalendars = xCalendars;
	}

	@Override
	public String toString()
	{
		return "XCalendarCollectionTypeWrapper{" + "xCalendars=" + xCalendars + '}';
	}
}