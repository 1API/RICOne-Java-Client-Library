
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "bellScheduleDay"
})
public class XDayListType {

    @JsonProperty("bellScheduleDay")
    private String bellScheduleDay;

    public XDayListType() {
    }

    public XDayListType(String bellScheduleDay) {
        super();
        this.bellScheduleDay = bellScheduleDay;
    }

    @JsonProperty("bellScheduleDay")
    public String getBellScheduleDay() {
        return bellScheduleDay;
    }

    @JsonProperty("bellScheduleDay")
    public void setBellScheduleDay(String bellScheduleDay) {
        this.bellScheduleDay = bellScheduleDay;
    }

    @Override
    public String toString()
    {
        return "XDayListType{" + "bellScheduleDay='" + bellScheduleDay + '\'' + '}';
    }
}
