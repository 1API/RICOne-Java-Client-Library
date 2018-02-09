
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.datatype.XMLGregorianCalendar;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@refId",
        "schoolRefId",
        "schoolYear",
        "sessions"
})
public class XCalendarType {

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    private String refId;
    @JsonProperty("schoolRefId")
    private String schoolRefId;
    @JsonProperty("schoolYear")
    private XMLGregorianCalendar schoolYear;
    @JsonProperty("sessions")
    private XSessionListType sessions;

    public XCalendarType() {
    }

    public XCalendarType(String refId, String schoolRefId, XMLGregorianCalendar schoolYear, XSessionListType sessions) {
        super();
        this.refId = refId;
        this.schoolRefId = schoolRefId;
        this.schoolYear = schoolYear;
        this.sessions = sessions;
    }

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    public String getRefId() {
        return refId;
    }

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    public void setRefId(String refId) {
        this.refId = refId;
    }

    @JsonProperty("schoolRefId")
    public String getSchoolRefId() {
        return schoolRefId;
    }

    @JsonProperty("schoolRefId")
    public void setSchoolRefId(String schoolRefId) {
        this.schoolRefId = schoolRefId;
    }

    @JsonProperty("schoolYear")
    public XMLGregorianCalendar getSchoolYear() {
        return schoolYear;
    }

    @JsonProperty("schoolYear")
    public void setSchoolYear(XMLGregorianCalendar schoolYear) {
        this.schoolYear = schoolYear;
    }

    @JsonProperty("sessions")
    public XSessionListType getSessions() {
        return sessions;
    }

    @JsonProperty("sessions")
    public void setSessions(XSessionListType sessions) {
        this.sessions = sessions;
    }

    @Override public String toString()
    {
        return "XCalendarType{" + "refId='" + refId + '\'' + ", schoolRefId='" + schoolRefId + '\'' + ", schoolYear=" + schoolYear + ", sessions=" + sessions + '}';
    }
}
