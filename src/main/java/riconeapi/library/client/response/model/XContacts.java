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
 * <p>Java class for xContactCollectionType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xContact"})
@JsonRootName(value = "xContacts")
@JacksonXmlRootElement(localName = "xContacts", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XContacts extends Model {
    @JsonProperty("xContact")
    @JacksonXmlProperty(localName = "xContact", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<XContact> xContacts;

    public XContacts() {
        xContacts = new ArrayList<>();
    }

    public XContacts(List<XContact> xContacts) {
        super();
        this.xContacts = xContacts;
    }

    /**
     * <p>Gets the value of the xContact property.</p>
     *
     * @return object of {@link XContact }
     */
    @JsonProperty("xContact")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<XContact> getXContacts() {
        return xContacts;
    }

    /**
     * <p>Sets the value of the xContact property.</p>
     *
     * @param xContacts allowed object is {@link XContact }
     */
    @JsonProperty("xContact")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setXContacts(List<XContact> xContacts) {
        this.xContacts = xContacts;
    }

    @Override
    public boolean isEmpty() { return xContacts.isEmpty(); }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XContacts xContacts1 = (XContacts) o;
        return Objects.equals(xContacts, xContacts1.xContacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xContacts);
    }

    @Override
    public String toString() {
        return "XContacts{" +
            "xContacts=" + xContacts +
            "} " + super.toString();
    }
}