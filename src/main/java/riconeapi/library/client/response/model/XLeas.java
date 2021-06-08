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
 * <p>Java class for xLeaCollectionType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xLea"})
@JsonRootName(value = "xLeas")
@JacksonXmlRootElement(localName = "xLeas", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XLeas extends Model {
    @JsonProperty("xLea")
    @JacksonXmlProperty(localName = "xLea", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<XLea> xLeas;

    public XLeas() {
        xLeas = new ArrayList<>();
    }

    public XLeas(List<XLea> xLeas) {
        super();
        this.xLeas = xLeas;
    }

    /**
     * <p>Gets the value of the xLea property.</p>
     *
     * @return possible object is {@link XLea }
     */
    @JsonProperty("xLea")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<XLea> getXLeas() {
        return xLeas;
    }

    /**
     * <p>Sets the value of the xLea property.</p>
     *
     * @param xLeas allowed object is {@link XLea }
     */
    @JsonProperty("xLea")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setXLeas(List<XLea> xLeas) {
        this.xLeas = xLeas;
    }

    @Override
    public boolean isEmpty() { return xLeas.isEmpty(); }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XLeas xLeas1 = (XLeas) o;
        return Objects.equals(xLeas, xLeas1.xLeas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLeas);
    }

    @Override
    public String toString() {
        return "XLeas{" +
            "xLeas=" + xLeas +
            "} " + super.toString();
    }
}