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
 * <p>Java class for xEnrollmentListType complex type.</p>
 * <p> A list of enrollments.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"enrollment"})
public class OtherEnrollments {
    @JsonProperty("enrollment")
    @JacksonXmlProperty(localName = "enrollment", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Enrollment> enrollment;

    public OtherEnrollments() {
        enrollment = new ArrayList<>();
    }

    public OtherEnrollments(List<Enrollment> enrollment) {
        super();
        this.enrollment = enrollment;
    }

    /**
     * <p>Gets the value of the enrollment property.</p>
     * <p>Enrollment information for the student.</p>
     *
     * @return possible object is {@link Enrollment }
     */

    @JsonProperty("enrollment")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Enrollment> getEnrollment() {
        return enrollment;
    }

    /**
     * <p>Sets the value of the enrollment property.</p>
     * <p>Enrollment information for the student.</p>
     *
     * @param enrollment allowed object is {@link Enrollment }
     */
    @JsonProperty("enrollment")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setEnrollment(List<Enrollment> enrollment) {
        this.enrollment = enrollment;
    }

    @Override
    public String toString() {
        return "OtherEnrollments{" + "enrollment=" + enrollment + '}';
    }
}