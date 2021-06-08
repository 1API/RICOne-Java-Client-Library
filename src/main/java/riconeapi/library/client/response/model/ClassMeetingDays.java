package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xDayListType complex type.</p>
 * <p>A list of days.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"bellScheduleDay"})
public class ClassMeetingDays {
    @JsonProperty("bellScheduleDay")
    @JacksonXmlProperty(localName = "bellScheduleDay", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String bellScheduleDay;

    public ClassMeetingDays() { }

    public ClassMeetingDays(String bellScheduleDay) {
        super();
        this.bellScheduleDay = bellScheduleDay;
    }

    /**
     * <p>Gets the value of the bellScheduleDay property.</p>
     * <p>The day(s) of the week (e.g., Monday, Wednesday) that the class meets or an indication that a class meets 'out-of-school' or 'self-paced'.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("bellScheduleDay")
    public String getBellScheduleDay() {
        return bellScheduleDay;
    }

    /**
     * <p>Sets the value of the bellScheduleDay property.</p>
     * <p>The day(s) of the week (e.g., Monday, Wednesday) that the class meets or an indication that a class meets 'out-of-school' or 'self-paced'.</p>
     *
     * @param bellScheduleDay allowed object is {@link String }
     */
    @JsonProperty("bellScheduleDay")
    public void setBellScheduleDay(String bellScheduleDay) {
        this.bellScheduleDay = bellScheduleDay;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(bellScheduleDay).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "ClassMeetingDays{" + "bellScheduleDay='" + bellScheduleDay + '\'' + '}';
    }
}