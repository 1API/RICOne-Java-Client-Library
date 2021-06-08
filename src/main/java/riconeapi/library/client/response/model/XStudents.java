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
 * <p>Java class for xStudentCollectionType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xStudent"})
@JsonRootName(value = "xStudents")
@JacksonXmlRootElement(localName = "xStudents", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XStudents extends Model {
    @JsonProperty("xStudent")
    @JacksonXmlProperty(localName = "xStudent", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<XStudent> xStudents;

    public XStudents() {
        xStudents = new ArrayList<>();
    }

    public XStudents(List<XStudent> xStudents) {
        super();
        this.xStudents = xStudents;
    }

    /**
     * <p>Gets the value of the xStudent property.</p>
     *
     * @return object of {@link XStudent }
     */
    @JsonProperty("xStudent")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<XStudent> getXStudents() {
        return xStudents;
    }

    /**
     * <p>Sets the value of the xStudent property.</p>
     *
     * @param xStudents allowed object is {@link XStudent }
     */
    @JsonProperty("xStudent")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setXStudents(List<XStudent> xStudents) {
        this.xStudents = xStudents;
    }

    @Override
    public boolean isEmpty() {
        return xStudents.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XStudents xStudents1 = (XStudents) o;
        return Objects.equals(xStudents, xStudents1.xStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xStudents);
    }

    @Override
    public String toString() {
        return "XStudents{" +
            "xStudents=" + xStudents +
            "} " + super.toString();
    }
}