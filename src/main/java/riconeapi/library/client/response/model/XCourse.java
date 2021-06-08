package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import riconeapi.library.client.common.Model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xCourseType complex type.</p>
 * <p>xCourse is a composite object that provides essential information about a course. The refId of a xCourse object coincides with the refId of a corresponding course object.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@refId", "schoolRefId", "schoolCourseId", "leaCourseId", "otherIds", "courseTitle", "description", "subject", "applicableEducationLevels", "scedCourseCode", "scedCourseLevelCode", "scedCourseSubjectAreaCode", "metadata"})
@JsonRootName(value = "xCourse")
@JacksonXmlRootElement(localName = "xCourse", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XCourse extends Model {
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true, namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlAttribute(name = "refId")
    private String refId;

    @JsonProperty("schoolRefId")
    @JacksonXmlProperty(localName = "schoolRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String schoolRefId;

    @JsonProperty("schoolCourseId")
    @JacksonXmlProperty(localName = "schoolCourseId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String schoolCourseId;

    @JsonProperty("leaCourseId")
    @JacksonXmlProperty(localName = "leaCourseId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String leaCourseId;

    @JsonProperty("otherIds")
    @JacksonXmlProperty(localName = "otherIds", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private OtherIds otherIds;

    @JsonProperty("courseTitle")
    @JacksonXmlProperty(localName = "courseTitle", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String courseTitle;

    @JsonProperty("description")
    @JacksonXmlProperty(localName = "description", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String description;

    @JsonProperty("subject")
    @JacksonXmlProperty(localName = "subject", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String subject;

    @JsonProperty("applicableEducationLevels")
    @JacksonXmlProperty(localName = "applicableEducationLevels", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private ApplicableEducationLevels applicableEducationLevels;

    @JsonProperty("scedCourseCode")
    @JacksonXmlProperty(localName = "scedCourseCode", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String scedCourseCode;

    @JsonProperty("scedCourseLevelCode")
    @JacksonXmlProperty(localName = "scedCourseLevelCode", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String scedCourseLevelCode;

    @JsonProperty("scedCourseSubjectAreaCode")
    @JacksonXmlProperty(localName = "scedCourseSubjectAreaCode", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String scedCourseSubjectAreaCode;

    @JsonProperty("metadata")
    @JacksonXmlProperty(localName = "metadata", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Metadata metadata;

    public XCourse() { }

    public XCourse(String refId, String schoolRefId, String schoolCourseId, String leaCourseId, OtherIds otherIds, String courseTitle, String description, String subject, ApplicableEducationLevels applicableEducationLevels, String scedCourseCode, String scedCourseLevelCode, String scedCourseSubjectAreaCode, Metadata metadata) {
        this.refId = refId;
        this.schoolRefId = schoolRefId;
        this.schoolCourseId = schoolCourseId;
        this.leaCourseId = leaCourseId;
        this.otherIds = otherIds;
        this.courseTitle = courseTitle;
        this.description = description;
        this.subject = subject;
        this.applicableEducationLevels = applicableEducationLevels;
        this.scedCourseCode = scedCourseCode;
        this.scedCourseLevelCode = scedCourseLevelCode;
        this.scedCourseSubjectAreaCode = scedCourseSubjectAreaCode;
        this.metadata = metadata;
    }

    /**
     * <p>Gets the value of the refId property.</p>
     * <p>The refid to which this course applies.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    @XmlAttribute(name = "refId")
    public String getRefId() {
        return refId;
    }

    /**
     * <p>Sets the value of the refId property.</p>
     * <p>The refid to which this course applies.</p>
     *
     * @param refId allowed object is {@link String }
     */
    @JsonProperty("@refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>Gets the value of the schoolRefId property.</p>
     * <p>Refid of the school in which the course is delivered.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("schoolRefId")
    public String getSchoolRefId() {
        return schoolRefId;
    }

    /**
     * <p>Sets the value of the schoolRefId property.</p>
     * <p>Refid of the school in which the course is delivered.</p>
     *
     * @param schoolRefId allowed object is {@link String }
     */
    @JsonProperty("schoolRefId")
    public void setSchoolRefId(String schoolRefId) {
        this.schoolRefId = schoolRefId;
    }

    /**
     * <p>Gets the value of the schoolCourseId property.</p>
     * <p>The actual code that identifies the organization of subject matter and related learning experiences provided for the instruction of students.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("schoolCourseId")
    public String getSchoolCourseId() {
        return schoolCourseId;
    }

    /**
     * <p>Sets the value of the schoolCourseId property.</p>
     * <p>The actual code that identifies the organization of subject matter and related learning experiences provided for the instruction of students.</p>
     *
     * @param schoolCourseId allowed object is {@link String }
     */
    @JsonProperty("schoolCourseId")
    public void setSchoolCourseId(String schoolCourseId) {
        this.schoolCourseId = schoolCourseId;
    }

    /**
     * <p>Gets the value of the leaCourseId property.</p>
     * <p>The actual code that identifies the organization of subject matter and related learning experiences provided for the instruction of students as defined at the district level (i.e. district course code).</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("leaCourseId")
    public String getLeaCourseId() {
        return leaCourseId;
    }

    /**
     * <p>Sets the value of the leaCourseId property.</p>
     * <p>The actual code that identifies the organization of subject matter and related learning experiences provided for the instruction of students as defined at the district level (i.e. district course code).</p>
     *
     * @param leaCourseId allowed object is {@link String }
     */
    @JsonProperty("leaCourseId")
    public void setLeaCourseId(String leaCourseId) {
        this.leaCourseId = leaCourseId;
    }

    /**
     * <p>Gets the value of the otherIds property.</p>
     * <p>A system that is used to identify the organization of subject matter and related learning experiences provided for the instruction of students.</p>
     *
     * @return possible object is {@link OtherIds }
     */
    @JsonProperty("otherIds")
    public OtherIds getOtherIds() {
        return otherIds;
    }

    /**
     * <p>Sets the value of the otherIds property.</p>
     * <p>A system that is used to identify the organization of subject matter and related learning experiences provided for the instruction of students.</p>
     *
     * @param otherIds allowed object is {@link OtherIds }
     */
    @JsonProperty("otherIds")
    public void setOtherIds(OtherIds otherIds) {
        this.otherIds = otherIds;
    }

    /**
     * <p>Gets the value of the courseTitle property.</p>
     * <p>The descriptive name given to a course of study offered in a school or other institution or organization. In departmentalized classes at the elementary, secondary, and postsecondary levels (and for staff development activities), this refers to the name by which a course is identified (e.g., American History, English III). For elementary and other non-departmentalized classes, it refers to any portion of the instruction for which a grade or report is assigned (e.g., reading, composition, spelling, and language arts).</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("courseTitle")
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * <p>Sets the value of the courseTitle property.</p>
     * <p>The descriptive name given to a course of study offered in a school or other institution or organization. In departmentalized classes at the elementary, secondary, and postsecondary levels (and for staff development activities), this refers to the name by which a course is identified (e.g., American History, English III). For elementary and other non-departmentalized classes, it refers to any portion of the instruction for which a grade or report is assigned (e.g., reading, composition, spelling, and language arts).</p>
     *
     * @param courseTitle allowed object is {@link String }
     */
    @JsonProperty("courseTitle")
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    /**
     * <p>Gets the value of the description property.</p>
     * <p>A description of the course content and/or goals. Reference may be made to state or national content standards.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * <p>Sets the value of the description property.</p>
     * <p>A description of the course content and/or goals. Reference may be made to state or national content standards.</p>
     *
     * @param description allowed object is {@link String }
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>Gets the value of the subject property.</p>
     * <p>The subject of the course.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * <p>Sets the value of the subject property.</p>
     * <p>The subject of the course.</p>
     *
     * @param subject allowed object is {@link String }
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>Gets the value of the applicableEducationLevels property.</p>
     * <p>The education level, grade level or primary instructional level at which a course is intended.</p>
     *
     * @return possible object is {@link ApplicableEducationLevels }
     */
    @JsonProperty("applicableEducationLevels")
    public ApplicableEducationLevels getApplicableEducationLevels() {
        return applicableEducationLevels;
    }

    /**
     * <p>Sets the value of the applicableEducationLevels property.</p>
     * <p>The education level, grade level or primary instructional level at which a course is intended.</p>
     *
     * @param applicableEducationLevels allowed object is {@link ApplicableEducationLevels }
     */
    @JsonProperty("applicableEducationLevels")
    public void setApplicableEducationLevels(ApplicableEducationLevels applicableEducationLevels) {
        this.applicableEducationLevels = applicableEducationLevels;
    }

    /**
     * <p>Gets the value of the scedCourseCode property.</p>
     * <p>SCED code for the course.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("scedCourseCode")
    public String getScedCourseCode() {
        return scedCourseCode;
    }

    /**
     * <p>Sets the value of the scedCourseCode property.</p>
     * <p>SCED code for the course.</p>
     *
     * @param scedCourseCode allowed object is {@link String }
     */
    @JsonProperty("scedCourseCode")
    public void setScedCourseCode(String scedCourseCode) {
        this.scedCourseCode = scedCourseCode;
    }

    /**
     * <p>Gets the value of the scedCourseLevelCode property.</p>
     * <p>SCED Course Level Code.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("scedCourseLevelCode")
    public String getScedCourseLevelCode() {
        return scedCourseLevelCode;
    }

    /**
     * <p>Sets the value of the scedCourseLevelCode property.</p>
     * <p>SCED Course Level Code.</p>
     *
     * @param scedCourseLevelCode allowed object is {@link String }
     */
    @JsonProperty("scedCourseLevelCode")
    public void setScedCourseLevelCode(String scedCourseLevelCode) {
        this.scedCourseLevelCode = scedCourseLevelCode;
    }

    /**
     * <p>Gets the value of the scedCourseSubjectAreaCode property.</p>
     * <p>SCED Course Subject Area Code.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("scedCourseSubjectAreaCode")
    public String getScedCourseSubjectAreaCode() {
        return scedCourseSubjectAreaCode;
    }

    /**
     * <p>Sets the value of the scedCourseSubjectAreaCode property.</p>
     * <p>SCED Course Subject Area Code.</p>
     *
     * @param scedCourseSubjectAreaCode allowed object is {@link String }
     */
    @JsonProperty("scedCourseSubjectAreaCode")
    public void setScedCourseSubjectAreaCode(String scedCourseSubjectAreaCode) {
        this.scedCourseSubjectAreaCode = scedCourseSubjectAreaCode;
    }

    /**
     * <p>Gets the value of the metadata property.</p>
     * <p>An object containing additional information about the record.</p>
     *
     * @return metadata allowed object is {@link Metadata }
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * <p>Sets the value of the metadata property.</p>
     * <p>An object containing additional information about the record.</p>
     *
     * @param metadata allowed object is {@link Metadata }
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonIgnore
    public boolean isEmpty() {
        return Stream.of(refId, schoolRefId, schoolCourseId, leaCourseId, otherIds, courseTitle, description, subject, applicableEducationLevels, scedCourseCode, scedCourseLevelCode, scedCourseSubjectAreaCode, metadata).allMatch(Objects::isNull);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XCourse xCourse = (XCourse) o;
        return Objects.equals(refId, xCourse.refId) &&
            Objects.equals(schoolRefId, xCourse.schoolRefId) &&
            Objects.equals(schoolCourseId, xCourse.schoolCourseId) &&
            Objects.equals(leaCourseId, xCourse.leaCourseId) &&
            Objects.equals(otherIds, xCourse.otherIds) &&
            Objects.equals(courseTitle, xCourse.courseTitle) &&
            Objects.equals(description, xCourse.description) &&
            Objects.equals(subject, xCourse.subject) &&
            Objects.equals(applicableEducationLevels, xCourse.applicableEducationLevels) &&
            Objects.equals(scedCourseCode, xCourse.scedCourseCode) &&
            Objects.equals(scedCourseLevelCode, xCourse.scedCourseLevelCode) &&
            Objects.equals(scedCourseSubjectAreaCode, xCourse.scedCourseSubjectAreaCode) &&
            Objects.equals(metadata, xCourse.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refId, schoolRefId, schoolCourseId, leaCourseId, otherIds, courseTitle, description, subject, applicableEducationLevels, scedCourseCode, scedCourseLevelCode, scedCourseSubjectAreaCode, metadata);
    }

    @Override
    public String toString() {
        return "XCourse{" + "refId='" + refId + '\'' + ", schoolRefId='" + schoolRefId + '\'' + ", schoolCourseId='" + schoolCourseId + '\'' + ", leaCourseId='" + leaCourseId + '\'' + ", otherIds=" + otherIds + ", courseTitle='" + courseTitle + '\'' + ", description='" + description + '\'' + ", subject='" + subject + '\'' + ", applicableEducationLevels=" + applicableEducationLevels + ", scedCourseCode='" + scedCourseCode + '\'' + ", scedCourseLevelCode='" + scedCourseLevelCode + '\'' + ", scedCourseSubjectAreaCode='" + scedCourseSubjectAreaCode + '\'' + ", metadata=" + metadata + '}';
    }
}