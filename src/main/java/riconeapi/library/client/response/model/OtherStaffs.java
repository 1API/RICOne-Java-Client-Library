package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for xStaffReferenceListType complex type.</p>
 * <p>A list of staff references.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"otherStaff"})
public class OtherStaffs {
    @JsonProperty("otherStaff")
    @JacksonXmlProperty(localName = "otherStaff", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<OtherStaff> otherStaff;

    public OtherStaffs() {
        otherStaff = new ArrayList<>();
    }

    public OtherStaffs(List<OtherStaff> otherStaff) {
        super();
        this.otherStaff = otherStaff;
    }

    /**
     * <p>Gets the value of the otherStaff property.</p>
     * <p>A collection of information about other staff.</p>
     * @return possible object is {@link OtherStaff }
     */
    @JsonProperty("otherStaff")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<OtherStaff> getOtherStaff() {
        return otherStaff;
    }

    /**
     * <p>Sets the value of the otherStaff property.</p>
     * <p>A collection of information about other staff.</p>
     * @param otherStaff allowed object is {@link OtherStaff }
     */
    @JsonProperty("otherStaff")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setOtherStaff(List<OtherStaff> otherStaff) {
        this.otherStaff = otherStaff;
    }

    @Override
    public String toString() {
        return "OtherStaffs{" + "otherStaff=" + otherStaff + '}';
    }
}