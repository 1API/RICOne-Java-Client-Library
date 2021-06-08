package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XCalendar;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for a single xCalendar record.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xCalendar"})
public class XCalendarResponse extends XResponse<XCalendar> {
    @JsonProperty("xCalendar")
    private XCalendar xCalendar;

    /**
     * Empty constructor.
     */
    public XCalendarResponse() {
    }

    /**
     * Creates an empty constructor with an xCalendar object.
     * @param xCalendar a single xCalendar.
     */
    public XCalendarResponse(XCalendar xCalendar) {
        super();
        this.xCalendar = xCalendar;
    }
    // TODO: 4/14/2021 remove?
//
//    @JsonProperty("xCalendar")
//    public XCalendar getXCalendar() {
//        return xCalendar;
//    }
//
//    @JsonProperty("xCalendar")
//    public void setXCalendar(XCalendar xCalendar) {
//        this.xCalendar = xCalendar;
//    }

    @Override
    public XCalendar getData() {
        return xCalendar;
    }

    @Override
    public void setData(XCalendar data) {
        this.xCalendar = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XCalendarResponse{" + "xCalendar=" + xCalendar + '}';
    }
}