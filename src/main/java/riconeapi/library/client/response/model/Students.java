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
 * <p>Java class for xStudentReferenceListType complex type.</p>
 * <p>A list of student references.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"studentReference"})
public class Students {
    @JsonProperty("studentReference")
    @JacksonXmlProperty(localName = "studentReference", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<StudentReference> studentReference;

    public Students() {
        studentReference = new ArrayList<>();
    }

    public Students(List<StudentReference> studentReference) {
        super();
        this.studentReference = studentReference;
    }

    /**
     * <p>Gets the value of the studentReference property.</p>
     * <p>A collection of person information that identifies an unique student.</p>
     *
     * @return possible object is {@link StudentReference }
     */
    @JsonProperty("studentReference")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<StudentReference> getStudentReference() {
        return studentReference;
    }

    /**
     * <p>Sets the value of the studentReference property.</p>
     * <p>A collection of person information that identifies an unique student.</p>
     *
     * @param studentReference allowed object is {@link StudentReference }
     */
    @JsonProperty("studentReference")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setStudentReference(List<StudentReference> studentReference) {
        this.studentReference = studentReference;
    }

    @Override
    public String toString() {
        return "Students{" + "studentReference=" + studentReference + '}';
    }
}