package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for xGradeLevelListType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"gradeLevel"})
public class GradeLevels {
    @JsonProperty("gradeLevel")
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "gradeLevel", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private List<String> gradeLevel;

    public GradeLevels() {
        gradeLevel = new ArrayList<>();
    }

    public GradeLevels(List<String> gradeLevel) {
        super();
        this.gradeLevel = gradeLevel;
    }

    /**
     * <p>Gets the value of the gradeLevel property.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("gradeLevel")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<String> getGradeLevel() {
        return gradeLevel;
    }

    /**
     * <p>Sets the value of the gradeLevel property.</p>
     *
     * @param gradeLevel allowed object is {@link String }
     */
    @JsonProperty("gradeLevel")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setGradeLevel(List<String> gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return gradeLevel.isEmpty();
    }

    @Override
    public String toString() {
        return "GradeLevels{" + "gradeLevel=" + gradeLevel + '}';
    }
}