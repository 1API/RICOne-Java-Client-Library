package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import riconeapi.library.client.common.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <p>Java class for xCalendarCollectionType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xCalendar"})
@JsonRootName(value = "xCalendars")
@JacksonXmlRootElement(localName = "xCalendars", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XCalendars extends Model {
    @JsonProperty("xCalendar")
    @JacksonXmlProperty(localName = "xCalendar", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<XCalendar> xCalendars;

    public XCalendars() {
        xCalendars = new ArrayList<>();
    }

    public XCalendars(List<XCalendar> xCalendars) {
        super();
        this.xCalendars = xCalendars;
    }

    /**
     * <p>Gets the value of the xCalendar property.</p>
     *
     * @return object of {@link XCalendar }
     */
    @JsonProperty("xCalendar")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<XCalendar> getXCalendars() {
        return xCalendars;
    }

    /**
     * <p>Sets the value of the xCalendar property.</p>
     *
     * @param xCalendars allowed object is {@link XCalendar }
     */
    @JsonProperty("xCalendar")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setXCalendars(List<XCalendar> xCalendars) {
        this.xCalendars = xCalendars;
    }

    @Override
    public boolean isEmpty() {
        return xCalendars.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XCalendars that = (XCalendars) o;
        return Objects.equals(xCalendars, that.xCalendars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCalendars);
    }

    @Override
    public String toString() {
        return "XCalendars{" +
            "xCalendars=" + xCalendars +
            "} " + super.toString();
    }
}