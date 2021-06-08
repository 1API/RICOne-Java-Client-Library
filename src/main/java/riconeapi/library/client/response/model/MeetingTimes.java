package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for xMeetingTimeListType complex type.</p>
 * <p>A List of meeting times.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"meetingTime"})
public class MeetingTimes {
    @JsonProperty("meetingTime")
    @JacksonXmlProperty(localName = "meetingTime", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<MeetingTime> meetingTime;

    public MeetingTimes() {
        meetingTime = new ArrayList<>();
    }

    public MeetingTimes(List<MeetingTime> meetingTime) {
        super();
        this.meetingTime = meetingTime;
    }

    /**
     * <p>Gets the value of the meetingTime property.</p>
     * <p>Information about the periodic days and meeting times of a section.</p>
     *
     * @return possible object is {@link MeetingTime }
     */
    @JsonProperty("meetingTime")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<MeetingTime> getMeetingTime() {
        return meetingTime;
    }

    /**
     * <p>Sets the value of the meetingTime property.</p>
     * <p>Information about the periodic days and meeting times of a section.</p>
     *
     * @param meetingTime allowed object is {@link MeetingTime }
     */
    @JsonProperty("meetingTime")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setMeetingTime(List<MeetingTime> meetingTime) {
        this.meetingTime = meetingTime;
    }

    @Override
    public String toString() {
        return "MeetingTimes{" + "meetingTime=" + meetingTime + '}';
    }
}