
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
        "xCalendar"
})
public class XCalendarCollectionType {

    @JsonProperty("xCalendar")
    private List<XCalendarType> xCalendar = new ArrayList<>();

    public XCalendarCollectionType() {
    }

    public XCalendarCollectionType(List<XCalendarType> xCalendar) {
        super();
        this.xCalendar = xCalendar;
    }

    @JsonProperty("xCalendar")
    public List<XCalendarType> getXCalendar() {
        return xCalendar;
    }

    @JsonProperty("xCalendar")
    public void setXCalendar(List<XCalendarType> xCalendar) {
        this.xCalendar = xCalendar;
    }

    @Override public String toString()
    {
        return "XCalendarCollectionType{" + "xCalendar=" + xCalendar + '}';
    }
}