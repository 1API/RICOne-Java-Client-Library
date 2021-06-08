package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import riconeapi.library.client.common.Model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xRosterType complex type.</p>
 * <p>xRoster is a composite object that provides a consolidated view of information related to a course section or class, including student enrollment and assigned staff. The refId of a xRoster object coincides with the refId of a corresponding section object</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@refId", "courseRefId", "courseTitle", "sectionRefId", "subject", "schoolRefId", "schoolSectionId", "schoolYear", "meetingTimes", "students", "primaryStaff", "otherStaffs", "metadata"})
@JsonRootName(value = "xRoster")
@JacksonXmlRootElement(localName = "xRoster", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XRoster extends Model {
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true, namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlAttribute(name = "refId")
    private String refId;

    @JsonProperty("courseRefId")
    @JacksonXmlProperty(localName = "courseRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String courseRefId;

    @JsonProperty("courseTitle")
    @JacksonXmlProperty(localName = "courseTitle", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String courseTitle;

    @JsonProperty("sectionRefId")
    @JacksonXmlProperty(localName = "sectionRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String sectionRefId;

    @JsonProperty("subject")
    @JacksonXmlProperty(localName = "subject", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String subject;

    @JsonProperty("schoolRefId")
    @JacksonXmlProperty(localName = "schoolRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String schoolRefId;

    @JsonProperty("schoolSectionId")
    @JacksonXmlProperty(localName = "schoolSectionId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String schoolSectionId;

    @JsonProperty("schoolYear")
    @JacksonXmlProperty(localName = "schoolYear", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String schoolYear;

    @JsonProperty("meetingTimes")
    @JacksonXmlProperty(localName = "meetingTimes", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private MeetingTimes meetingTimes;

    @JsonProperty("students")
    @JacksonXmlProperty(localName = "students", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Students students;

    @JsonProperty("primaryStaff")
    @JacksonXmlProperty(localName = "primaryStaff", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private PrimaryStaff primaryStaff;

    @JsonProperty("otherStaffs")
    @JacksonXmlProperty(localName = "otherStaffs", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private OtherStaffs otherStaffs;

    @JsonProperty("metadata")
    @JacksonXmlProperty(localName = "metadata", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Metadata metadata;

    public XRoster() { }

    public XRoster(String refId, String courseRefId, String courseTitle, String sectionRefId, String subject, String schoolRefId, String schoolSectionId, String schoolYear, MeetingTimes meetingTimes, Students students, PrimaryStaff primaryStaff, OtherStaffs otherStaffs, Metadata metadata) {
        this.refId = refId;
        this.courseRefId = courseRefId;
        this.courseTitle = courseTitle;
        this.sectionRefId = sectionRefId;
        this.subject = subject;
        this.schoolRefId = schoolRefId;
        this.schoolSectionId = schoolSectionId;
        this.schoolYear = schoolYear;
        this.meetingTimes = meetingTimes;
        this.students = students;
        this.primaryStaff = primaryStaff;
        this.otherStaffs = otherStaffs;
        this.metadata = metadata;
    }

    /**
     * <p>Gets the value of the refId property.</p>
     * <p>The refid to which this roster applies.</p>
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
     * <p>The refid to which this roster applies.</p>
     *
     * @param refId allowed object is {@link String }
     */
    @JsonProperty("@refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>Gets the value of the courseRefId property.</p>
     * <p>RefId of the course for this section.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("courseRefId")
    public String getCourseRefId() {
        return courseRefId;
    }

    /**
     * <p>Sets the value of the courseRefId property.</p>
     * <p>RefId of the course for this section.</p>
     *
     * @param courseRefId allowed object is {@link String }
     */
    @JsonProperty("courseRefId")
    public void setCourseRefId(String courseRefId) {
        this.courseRefId = courseRefId;
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
     * <p>Gets the value of the sectionRefId property.</p>
     * <p>RefId of the section.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("sectionRefId")
    public String getSectionRefId() {
        return sectionRefId;
    }

    /**
     * <p>Sets the value of the sectionRefId property.</p>
     * <p>RefId of the section.</p>
     *
     * @param sectionRefId allowed object is {@link String }
     */
    @JsonProperty("sectionRefId")
    public void setSectionRefId(String sectionRefId) {
        this.sectionRefId = sectionRefId;
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
     * <p>Gets the value of the schoolRefId property.</p>
     * <p>RefId of the school.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("schoolRefId")
    public String getSchoolRefId() {
        return schoolRefId;
    }

    /**
     * <p>Sets the value of the schoolRefId property.</p>
     * <p>RefId of the school.</p>
     *
     * @param schoolRefId allowed object is {@link String }
     */
    @JsonProperty("schoolRefId")
    public void setSchoolRefId(String schoolRefId) {
        this.schoolRefId = schoolRefId;
    }

    /**
     * <p>Gets the value of the schoolSectionId property.</p>
     * <p>A unique number or alphanumeric code assigned by an institution, school, school system, state, or other agency or entity for a particular course-section.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("schoolSectionId")
    public String getSchoolSectionId() {
        return schoolSectionId;
    }

    /**
     * <p>Sets the value of the schoolSectionId property.</p>
     * <p>A unique number or alphanumeric code assigned by an institution, school, school system, state, or other agency or entity for a particular course-section.</p>
     *
     * @param schoolSectionId allowed object is {@link String }
     */
    @JsonProperty("schoolSectionId")
    public void setSchoolSectionId(String schoolSectionId) {
        this.schoolSectionId = schoolSectionId;
    }

    /**
     * <p>Gets the value of the schoolYear property.</p>
     * <p>The year for a reported school session.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("schoolYear")
    public String getSchoolYear() {
        return schoolYear;
    }

    /**
     * <p>Sets the value of the schoolYear property.</p>
     * <p>The year for a reported school session.</p>
     *
     * @param schoolYear allowed object is {@link String }
     */
    @JsonProperty("schoolYear")
    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    /**
     * <p>Gets the value of the meetingTimes property.</p>
     * <p>A list of meeting times for the section.</p>
     *
     * @return possible object is {@link MeetingTimes }
     */
    @JsonProperty("meetingTimes")
    public MeetingTimes getMeetingTimes() {
        return meetingTimes;
    }

    /**
     * <p>Sets the value of the meetingTimes property.</p>
     * <p>A list of meeting times for the section.</p>
     *
     * @param meetingTimes allowed object is {@link MeetingTimes }
     */
    @JsonProperty("meetingTimes")
    public void setMeetingTimes(MeetingTimes meetingTimes) {
        this.meetingTimes = meetingTimes;
    }

    /**
     * <p>Gets the value of the students property.</p>
     * <p>A list of students associated with the roster.</p>
     *
     * @return possible object is {@link Students }
     */
    @JsonProperty("students")
    public Students getStudents() {
        return students;
    }

    /**
     * <p>Sets the value of the students property.</p>
     * <p>A list of students associated with the roster.</p>
     *
     * @param students allowed object is {@link Students }
     */
    @JsonProperty("students")
    public void setStudents(Students students) {
        this.students = students;
    }

    /**
     * <p>Gets the value of the primaryStaff property.</p>
     * <p>The primary staff person for the section.</p>
     *
     * @return possible object is {@link PrimaryStaff }
     */
    @JsonProperty("primaryStaff")
    public PrimaryStaff getPrimaryStaff() {
        return primaryStaff;
    }

    /**
     * <p>Sets the value of the primaryStaff property.</p>
     * <p>The primary staff person for the section.</p>
     *
     * @param primaryStaff allowed object is {@link PrimaryStaff }
     */
    @JsonProperty("primaryStaff")
    public void setPrimaryStaff(PrimaryStaff primaryStaff) {
        this.primaryStaff = primaryStaff;
    }

    /**
     * <p>Gets the value of the otherStaffs property.</p>
     * <p>Other staff persons associated with the section.</p>
     *
     * @return possible object is {@link OtherStaffs }
     */
    @JsonProperty("otherStaffs")
    public OtherStaffs getOtherStaffs() {
        return otherStaffs;
    }

    /**
     * <p>Sets the value of the otherStaffs property.</p>
     * <p>Other staff persons associated with the section.</p>
     *
     * @param otherStaffs allowed object is {@link OtherStaffs }
     */
    @JsonProperty("otherStaffs")
    public void setOtherStaffs(OtherStaffs otherStaffs) {
        this.otherStaffs = otherStaffs;
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
        return Stream.of(refId, courseRefId, courseTitle, sectionRefId, subject, schoolRefId, schoolSectionId, schoolYear, meetingTimes, students, primaryStaff, otherStaffs, metadata).allMatch(Objects::isNull);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XRoster xRoster = (XRoster) o;
        return Objects.equals(refId, xRoster.refId) &&
            Objects.equals(courseRefId, xRoster.courseRefId) &&
            Objects.equals(courseTitle, xRoster.courseTitle) &&
            Objects.equals(sectionRefId, xRoster.sectionRefId) &&
            Objects.equals(subject, xRoster.subject) &&
            Objects.equals(schoolRefId, xRoster.schoolRefId) &&
            Objects.equals(schoolSectionId, xRoster.schoolSectionId) &&
            Objects.equals(schoolYear, xRoster.schoolYear) &&
            Objects.equals(meetingTimes, xRoster.meetingTimes) &&
            Objects.equals(students, xRoster.students) &&
            Objects.equals(primaryStaff, xRoster.primaryStaff) &&
            Objects.equals(otherStaffs, xRoster.otherStaffs) &&
            Objects.equals(metadata, xRoster.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refId, courseRefId, courseTitle, sectionRefId, subject, schoolRefId, schoolSectionId, schoolYear, meetingTimes, students, primaryStaff, otherStaffs, metadata);
    }

    @Override
    public String toString() {
        return "XRoster{" +
            "refId='" + refId + '\'' +
            ", courseRefId='" + courseRefId + '\'' +
            ", courseTitle='" + courseTitle + '\'' +
            ", sectionRefId='" + sectionRefId + '\'' +
            ", subject='" + subject + '\'' +
            ", schoolRefId='" + schoolRefId + '\'' +
            ", schoolSectionId='" + schoolSectionId + '\'' +
            ", schoolYear='" + schoolYear + '\'' +
            ", meetingTimes=" + meetingTimes +
            ", students=" + students +
            ", primaryStaff=" + primaryStaff +
            ", otherStaffs=" + otherStaffs +
            ", metadata=" + metadata +
            '}';
    }
}