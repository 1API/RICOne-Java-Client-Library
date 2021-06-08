package riconeapi.library.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import riconeapi.library.client.response.model.XCalendars;

/**
 * Extends the XResponse class for accessing response data.
 * <p>
 * This class returns data for multiple xCalendar records.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xCalendars"})
public class XCalendarsResponse extends XResponse<XCalendars> {
    @JsonProperty("xCalendars")
    private XCalendars xCalendars;

    /**
     * Empty constructor.
     */
    public XCalendarsResponse() {
    }

    /**
     * Creates an empty constructor with an xCalendars object.
     * @param xCalendars a list of xCalendar.
     */
    public XCalendarsResponse(XCalendars xCalendars) {
        super();
        this.xCalendars = xCalendars;
    }
    // TODO: 4/14/2021 remove?
//    @JsonProperty("xCalendars")
//    public XCalendars getXCalendars() {
//        return xCalendars;
//    }
//
//    @JsonProperty("xCalendars")
//    public void setXCalendars(XCalendars xCalendars) {
//        this.xCalendars = xCalendars;
//    }

    @Override
    public XCalendars getData() {
        return xCalendars;
    }

    @Override
    public void setData(XCalendars data) {
        this.xCalendars = data;
    }

    /**
     * Returns a string representation of the collection. The string representation consists of a list of the collection's
     * elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     * @return a string representation of the collection.
     */
    @Override
    public String toString() {
        return "XCalendarsResponse{" + "xCalendars=" + xCalendars + '}';
    }
}