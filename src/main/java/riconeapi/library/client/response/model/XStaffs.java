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
 * <p>Java class for xStaffCollectionType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xStaff"})
@JsonRootName(value = "xStaffs")
@JacksonXmlRootElement(localName = "xLeas", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XStaffs extends Model {
    @JsonProperty("xStaff")
    @JacksonXmlProperty(localName = "xStaff", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<XStaff> xStaffs;

    public XStaffs() {
        xStaffs = new ArrayList<>();
    }

    public XStaffs(List<XStaff> xStaffs) {
        super();
        this.xStaffs = xStaffs;
    }

    /**
     * <p>Gets the value of the xStaff property.</p>
     *
     * @return object of {@link XStaff }
     */
    @JsonProperty("xStaff")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<XStaff> getXStaffs() {
        return xStaffs;
    }

    /**
     * <p>Sets the value of the xStaff property.</p>
     *
     * @param xStaffs allowed object is {@link XStaff }
     */
    @JsonProperty("xStaff")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setXStaffs(List<XStaff> xStaffs) {
        this.xStaffs = xStaffs;
    }

    @Override
    public boolean isEmpty() {
        return xStaffs.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XStaffs xStaffs1 = (XStaffs) o;
        return Objects.equals(xStaffs, xStaffs1.xStaffs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xStaffs);
    }

    @Override
    public String toString() {
        return "XStaffs{" +
            "xStaffs=" + xStaffs +
            "} " + super.toString();
    }
}