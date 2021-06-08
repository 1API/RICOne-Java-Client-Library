package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xStaffPersonAssignmentType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"leaRefId", "schoolRefId", "jobFunction"})
public class PrimaryAssignment {
    @JsonProperty("leaRefId")
    @JacksonXmlProperty(localName = "leaRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String leaRefId;

    @JsonProperty("schoolRefId")
    @JacksonXmlProperty(localName = "schoolRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String schoolRefId;

    @JsonProperty("jobFunction")
    @JacksonXmlProperty(localName = "jobFunction", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String jobFunction;

    public PrimaryAssignment() { }

    public PrimaryAssignment(String leaRefId, String schoolRefId, String jobFunction) {
        super();
        this.leaRefId = leaRefId;
        this.schoolRefId = schoolRefId;
        this.jobFunction = jobFunction;
    }

    /**
     * <p>Gets the value of the leaRefId property.</p>
     * <p>The RefId for the LEA Object.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("leaRefId")
    public String getLeaRefId() {
        return leaRefId;
    }

    /**
     * <p>Sets the value of the leaRefId property.</p>
     * <p>The RefId for the LEA Object.</p>
     *
     * @param leaRefId allowed object is {@link String }
     */
    @JsonProperty("leaRefId")
    public void setLeaRefId(String leaRefId) {
        this.leaRefId = leaRefId;
    }

    /**
     * <p>Gets the value of the schoolRefId property.</p>
     * <p>The RefId of the school object.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("schoolRefId")
    public String getSchoolRefId() {
        return schoolRefId;
    }

    /**
     * <p>Sets the value of the schoolRefId property.</p>
     * <p>The RefId of the school object.</p>
     *
     * @param schoolRefId allowed object is {@link String }
     */
    @JsonProperty("schoolRefId")
    public void setSchoolRefId(String schoolRefId) {
        this.schoolRefId = schoolRefId;
    }

    /**
     * <p>Gets the value of the jobFunction property.</p>
     * <p>The titles of employment, official status, or rank of education staff.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("jobFunction")
    public String getJobFunction() {
        return jobFunction;
    }

    /**
     * <p>Sets the value of the jobFunction property.</p>
     * <p>The titles of employment, official status, or rank of education staff.</p>
     *
     * @param jobFunction allowed object is {@link String }
     */
    @JsonProperty("jobFunction")
    public void setJobFunction(String jobFunction) {
        this.jobFunction = jobFunction;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(leaRefId, schoolRefId, jobFunction).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "PrimaryAssignment{" + "leaRefId='" + leaRefId + '\'' + ", schoolRefId='" + schoolRefId + '\'' + ", jobFunction='" + jobFunction + '\'' + '}';
    }
}