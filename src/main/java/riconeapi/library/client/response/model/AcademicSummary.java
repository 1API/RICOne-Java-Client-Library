package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xAcademicSummary complex type.</p>
 * <p>Academic information for the student.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"cumulativeWeightedGpa", "termWeightedGpa", "classRank"})
public class AcademicSummary {
    @JsonProperty("cumulativeWeightedGpa")
    @JacksonXmlProperty(localName = "cumulativeWeightedGpa", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String cumulativeWeightedGpa;

    @JsonProperty("termWeightedGpa")
    @JacksonXmlProperty(localName = "termWeightedGpa", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String termWeightedGpa;

    @JsonProperty("classRank")
    @JacksonXmlProperty(localName = "classRank", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String classRank;

    public AcademicSummary() { }

    public AcademicSummary(String cumulativeWeightedGpa, String termWeightedGpa, String classRank) {
        super();
        this.cumulativeWeightedGpa = cumulativeWeightedGpa;
        this.termWeightedGpa = termWeightedGpa;
        this.classRank = classRank;
    }

    /**
     * <p>Gets the value of the cumulativeWeightedGpa property.</p>
     * <p>A measure of average performance in all courses taken by a person during his or her school career as determined for record-keeping purposes. This is obtained by dividing the total grade points received by the total number of credits attempted. This usually includes grade points received and credits attempted in his or her current school as well as those transferred from schools in which the person was previously enrolled.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("cumulativeWeightedGpa")
    public String getCumulativeWeightedGpa() {
        return cumulativeWeightedGpa;
    }

    /**
     * <p>Sets the value of the cumulativeWeightedGpa property.</p>
     * <p>A measure of average performance in all courses taken by a person during his or her school career as determined for record-keeping purposes. This is obtained by dividing the total grade points received by the total number of credits attempted. This usually includes grade points received and credits attempted in his or her current school as well as those transferred from schools in which the person was previously enrolled.</p>
     *
     * @param cumulativeWeightedGpa allowed object is {@link String }
     */
    @JsonProperty("cumulativeWeightedGpa")
    public void setCumulativeWeightedGpa(String cumulativeWeightedGpa) {
        this.cumulativeWeightedGpa = cumulativeWeightedGpa;
    }

    /**
     * <p>Gets the value of the termWeightedGpa property.</p>
     * <p>A measure of average performance in all courses taken by a person during a given session. This is obtained by dividing the total grade points received by the number of credits attempted for the same session.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("termWeightedGpa")
    public String getTermWeightedGpa() {
        return termWeightedGpa;
    }

    /**
     * <p>Sets the value of the termWeightedGpa property.</p>
     * <p>A measure of average performance in all courses taken by a person during a given session. This is obtained by dividing the total grade points received by the number of credits attempted for the same session.</p>
     *
     * @param termWeightedGpa allowed object is {@link String }
     */
    @JsonProperty("termWeightedGpa")
    public void setTermWeightedGpa(String termWeightedGpa) {
        this.termWeightedGpa = termWeightedGpa;
    }

    /**
     * <p>Gets the value of the classRank property.</p>
     * <p>The academic rank of a student in relation to his or her high school graduating class (e.g., 1, 2, 3) based on high school GPA.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("classRank")
    public String getClassRank() {
        return classRank;
    }

    /**
     * <p>Sets the value of the classRank property.</p>
     * <p>The academic rank of a student in relation to his or her high school graduating class (e.g., 1, 2, 3) based on high school GPA.</p>
     *
     * @param classRank allowed object is {@link String }
     */
    @JsonProperty("classRank")
    public void setClassRank(String classRank) {
        this.classRank = classRank;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(cumulativeWeightedGpa, termWeightedGpa, classRank).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "AcademicSummary{" + "cumulativeWeightedGpa='" + cumulativeWeightedGpa + '\'' + ", termWeightedGpa='" + termWeightedGpa + '\'' + ", classRank='" + classRank + '\'' + '}';
    }
}