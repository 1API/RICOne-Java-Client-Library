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
 * <p>Java class for xSchoolCollectionType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xSchool"})
@JsonRootName(value = "xSchools")
@JacksonXmlRootElement(localName = "xSchools", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XSchools extends Model {
    @JsonProperty("xSchool")
    @JacksonXmlProperty(localName = "xSchool", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<XSchool> xSchools;

    public XSchools() {
        xSchools = new ArrayList<>();
    }

    public XSchools(List<XSchool> xSchools) {
        super();
        this.xSchools = xSchools;
    }

    /**
     * <p>Gets the value of the xSchool property.</p>
     *
     * @return object of {@link XSchool }
     */
    @JsonProperty("xSchool")
    @JacksonXmlProperty(localName = "xSchool", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<XSchool> getXSchools() {
        return xSchools;
    }

    /**
     * <p>Sets the value of the xSchool property.</p>
     *
     * @param xSchools allowed object is {@link XSchool }
     */
    @JsonProperty("xSchool")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "xSchool", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    public void setXSchools(List<XSchool> xSchools) {
        this.xSchools = xSchools;
    }

    @Override
    public boolean isEmpty() {
        return xSchools.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XSchools xSchools1 = (XSchools) o;
        return Objects.equals(xSchools, xSchools1.xSchools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSchools);
    }

    @Override
    public String toString() {
        return "XSchools{" +
            "xSchools=" + xSchools +
            "} " + super.toString();
    }
}