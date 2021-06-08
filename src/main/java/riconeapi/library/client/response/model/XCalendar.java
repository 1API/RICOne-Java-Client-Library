package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import riconeapi.library.client.common.Model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xCalendarType complex type.</p>
 * <p>xCalendar is a composite object that provides information about sessions held at a particular school during a given school year. The refId of a xCalendar object coincides with the refId of a corresponding schoolCalendar object.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@refId", "schoolRefId", "schoolYear", "sessions", "metadata"})
@JsonRootName(value = "xCalendar")
@JacksonXmlRootElement(localName = "xCalendar", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XCalendar extends Model {
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true, namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlAttribute(name = "refId")
    private String refId;

    @JsonProperty("schoolRefId")
    @JacksonXmlProperty(localName = "schoolRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String schoolRefId;

    @JsonProperty("schoolYear")
    @JacksonXmlProperty(localName = "schoolYear", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String schoolYear;

    @JsonProperty("sessions")
    @JacksonXmlProperty(localName = "sessions", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Sessions sessions;

    @JsonProperty("metadata")
    @JacksonXmlProperty(localName = "metadata", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Metadata metadata;

    public XCalendar() { }

    public XCalendar(String refId, String schoolRefId, String schoolYear, Sessions sessions, Metadata metadata) {
        this.refId = refId;
        this.schoolRefId = schoolRefId;
        this.schoolYear = schoolYear;
        this.sessions = sessions;
        this.metadata = metadata;
    }

    /**
     * <p>Gets the value of the refId property.</p>
     * <p>The refid to which this calendar applies.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    public String getRefId() {
        return refId;
    }

    /**
     * <p>Sets the value of the refId property.</p>
     * <p>The refid to which this calendar applies.</p>
     *
     * @param refId allowed object is {@link String }
     */
    @JsonProperty("@refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>Gets the value of the schoolRefId property.</p>
     * <p>The school refid to which this calendar applies.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("schoolRefId")
    public String getSchoolRefId() {
        return schoolRefId;
    }

    /**
     * <p>Sets the value of the schoolRefId property.</p>
     * <p>The school refid to which this calendar applies.</p>
     *
     * @param schoolRefId allowed object is {@link String }
     */
    @JsonProperty("schoolRefId")
    public void setSchoolRefId(String schoolRefId) {
        this.schoolRefId = schoolRefId;
    }

    /**
     * <p>Gets the value of the schoolYear property.</p>
     * <p>The school year for the calendar.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("schoolYear")
    public String getSchoolYear() {
        return schoolYear;
    }

    /**
     * <p>Sets the value of the schoolYear property.</p>
     * <p>The school year for the calendar.</p>
     *
     * @param schoolYear allowed object is {@link String }
     */
    @JsonProperty("schoolYear")
    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    /**
     * <p>Gets the value of the sessions property.</p>
     * <p>A list of sessions for the calendar.</p>
     *
     * @return possible object is {@link Sessions }
     */
    @JsonProperty("sessions")
    public Sessions getSessions() {
        return sessions;
    }

    /**
     * <p>Sets the value of the sessions property.</p>
     * <p>A list of sessions for the calendar.</p>
     *
     * @param sessions allowed object is {@link Sessions }
     */
    @JsonProperty("sessions")
    public void setSessions(Sessions sessions) {
        this.sessions = sessions;
    }

    /**
     * <p>Gets the value of the metadata property.</p>
     * <p>An object containing additional information about the record.</p>
     *
     * @return metadata allowed object is {@link Metadata }
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * <p>Sets the value of the metadata property.</p>
     * <p>An object containing additional information about the record.</p>
     *
     * @param metadata allowed object is {@link Metadata }
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonIgnore
    public boolean isEmpty() {
        return Stream.of(refId, schoolRefId, schoolYear, sessions, metadata).allMatch(Objects::isNull);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XCalendar xCalendar = (XCalendar) o;
        return Objects.equals(refId, xCalendar.refId) &&
            Objects.equals(schoolRefId, xCalendar.schoolRefId) &&
            Objects.equals(schoolYear, xCalendar.schoolYear) &&
            Objects.equals(sessions, xCalendar.sessions) &&
            Objects.equals(metadata, xCalendar.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refId, schoolRefId, schoolYear, sessions, metadata);
    }

    @Override
    public String toString() {
        return "XCalendar{" + "refId='" + refId + '\'' + ", schoolRefId='" + schoolRefId + '\'' + ", schoolYear='" + schoolYear + '\'' + ", sessions=" + sessions + ", metadata=" + metadata + '}';
    }
}