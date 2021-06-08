package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for xApplicableEducationLevelListType complex type.</p>
 * <p>A list of applicable education levels.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"applicableEducationLevel"})
public class ApplicableEducationLevels {
    @JsonProperty("applicableEducationLevel")
    @JacksonXmlProperty(localName = "applicableEducationLevel", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> applicableEducationLevel;

    public ApplicableEducationLevels() {
        applicableEducationLevel = new ArrayList<>();
    }

    public ApplicableEducationLevels(List<String> applicableEducationLevel) {
        super();
        this.applicableEducationLevel = applicableEducationLevel;
    }

    /**
     * <p>Gets the value of the applicableEducationLevel property.</p>
     * <p>The education level, grade level or primary instructional level at which a course is intended.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("applicableEducationLevel")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<String> getApplicableEducationLevel() {
        return applicableEducationLevel;
    }

    /**
     * <p>Sets the value of the applicableEducationLevel property.</p>
     * <p>The education level, grade level or primary instructional level at which a course is intended.</p>
     *
     * @param applicableEducationLevel allowed object is {@link String }
     */
    @JsonProperty("applicableEducationLevel")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setApplicableEducationLevel(List<String> applicableEducationLevel) {
        this.applicableEducationLevel = applicableEducationLevel;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return applicableEducationLevel.isEmpty();
    }

    @Override
    public String toString() {
        return "ApplicableEducationLevels{" + "applicableEducationLevel=" + applicableEducationLevel + '}';
    }
}