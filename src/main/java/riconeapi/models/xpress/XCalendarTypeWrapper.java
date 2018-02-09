package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"xCalendar"
})
public class XCalendarTypeWrapper {

	@JsonProperty("xCalendar")
	private XCalendarType xCalendar;

	public XCalendarTypeWrapper() {
	}

	public XCalendarTypeWrapper(XCalendarType xCalendar) {
	super();
	this.xCalendar = xCalendar;
	}

	@JsonProperty("xCalendar")
	public XCalendarType getXCalendar() {
	return xCalendar;
	}

	@JsonProperty("xCalendar")
	public void setXCalendar(XCalendarType xCalendar) {
	this.xCalendar = xCalendar;
	}

	@Override
	public String toString()
	{
		return "XCalendarTypeWrapper{" + "xCalendar=" + xCalendar + '}';
	}
}