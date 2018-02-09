
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
		"meetingTime"
})
public class XMeetingTimeListType {

	@JsonProperty("meetingTime")
	private List<XMeetingTimeType> meetingTime = new ArrayList<>();

	public XMeetingTimeListType(List<XMeetingTimeType> meetingTime) {
		super();
		this.meetingTime = meetingTime;
	}

	@JsonProperty("meetingTime")
	public List<XMeetingTimeType> getMeetingTime() {
		return meetingTime;
	}

	@JsonProperty("meetingTime")
	public void setMeetingTime(List<XMeetingTimeType> meetingTime) {
		this.meetingTime = meetingTime;
	}

	@Override public String toString()
	{
		return "XMeetingTimeListType{" + "meetingTime=" + meetingTime + '}';
	}
}
