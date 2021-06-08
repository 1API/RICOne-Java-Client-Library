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
 * <p>Java class for xCourses complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"xCourse"})
@JsonRootName(value = "xCourses")
@JacksonXmlRootElement(localName = "xCourses", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XCourses extends Model {
    @JsonProperty("xCourse")
    @JacksonXmlProperty(localName = "xCourse", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<XCourse> xCourses;

    public XCourses() {
        xCourses = new ArrayList<>();
    }

    public XCourses(List<XCourse> xCourses) {
        super();
        this.xCourses = xCourses;
    }

    /**
     * <p>Gets the value of the xCourse property.</p>
     *
     * @return possible object is {@link XCourse }
     */
    @JsonProperty("xCourse")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<XCourse> getXCourses() {
        return xCourses;
    }

    /**
     * <p>Sets the value of the xCourse property.</p>
     *
     * @param xCourses allowed object is {@link XCourse }
     */
    @JsonProperty("xCourse")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setXCourses(List<XCourse> xCourses) {
        this.xCourses = xCourses;
    }

    @Override
    public boolean isEmpty() {
        return xCourses.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XCourses xCourses1 = (XCourses) o;
        return Objects.equals(xCourses, xCourses1.xCourses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCourses);
    }

    @Override
    public String toString() {
        return "XCourses{" +
            "xCourses=" + xCourses +
            "} " + super.toString();
    }
}