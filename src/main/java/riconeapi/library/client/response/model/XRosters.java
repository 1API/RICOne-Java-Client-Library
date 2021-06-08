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
 * <p>Java class for xRosterCollectionType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xRoster"})
@JsonRootName(value = "xRosters")
@JacksonXmlRootElement(localName = "xRosters", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XRosters extends Model {
    @JsonProperty("xRoster")
    @JacksonXmlProperty(localName = "xRoster", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<XRoster> xRosters;

    public XRosters() {
        xRosters = new ArrayList<>();
    }

    public XRosters(List<XRoster> xRosters) {
        super();
        this.xRosters = xRosters;
    }

    /**
     * <p>Gets the value of the xRoster property.</p>
     *
     * @return possible object is {@link XRoster }
     */
    @JsonProperty("xRoster")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<XRoster> getXRosters() {
        return xRosters;
    }

    /**
     * <p>Sets the value of the xRoster property.</p>
     *
     * @param xRosters allowed object is {@link XRoster }
     */
    @JsonProperty("xRoster")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setXRosters(List<XRoster> xRosters) {
        this.xRosters = xRosters;
    }

    @Override
    public boolean isEmpty() {
        return xRosters.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XRosters xRosters1 = (XRosters) o;
        return Objects.equals(xRosters, xRosters1.xRosters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xRosters);
    }

    @Override
    public String toString() {
        return "XRosters{" +
            "xRosters=" + xRosters +
            "} " + super.toString();
    }
}