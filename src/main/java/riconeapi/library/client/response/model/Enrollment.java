package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xEnrollmentType complex type.</p>
 * <p>Type of enrollment.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"leaRefId", "schoolRefId", "studentSchoolAssociationRefId", "responsibleSchoolType", "membershipType", "entryDate", "entryType", "exitDate", "exitType", "homeRoomNumber", "homeRoomTeacher", "gradeLevel", "projectedGraduationYear", "counselor"})
public class Enrollment {
    @JsonProperty("leaRefId")
    @JacksonXmlProperty(localName = "leaRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String leaRefId;

    @JsonProperty("schoolRefId")
    @JacksonXmlProperty(localName = "schoolRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String schoolRefId;

    @JsonProperty("studentSchoolAssociationRefId")
    @JacksonXmlProperty(localName = "studentSchoolAssociationRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String studentSchoolAssociationRefId;

    @JsonProperty("responsibleSchoolType")
    @JacksonXmlProperty(localName = "responsibleSchoolType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String responsibleSchoolType;

    @JsonProperty("membershipType")
    @JacksonXmlProperty(localName = "membershipType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String membershipType;

    @JsonProperty("entryDate")
    @JacksonXmlProperty(localName = "entryDate", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String entryDate;

    @JsonProperty("entryType")
    @JacksonXmlProperty(localName = "entryType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private EntryType entryType;

    @JsonProperty("exitDate")
    @JacksonXmlProperty(localName = "exitDate", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String exitDate;

    @JsonProperty("exitType")
    @JacksonXmlProperty(localName = "exitType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private ExitType exitType;

    @JsonProperty("homeRoomNumber")
    @JacksonXmlProperty(localName = "homeRoomNumber", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String homeRoomNumber;

    @JsonProperty("homeRoomTeacher")
    @JacksonXmlProperty(localName = "homeRoomTeacher", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private HomeRoomTeacher homeRoomTeacher;

    @JsonProperty("gradeLevel")
    @JacksonXmlProperty(localName = "gradeLevel", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String gradeLevel;

    @JsonProperty("projectedGraduationYear")
    @JacksonXmlProperty(localName = "projectedGraduationYear", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String projectedGraduationYear;

    @JsonProperty("counselor")
    @JacksonXmlProperty(localName = "counselor", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Counselor counselor;

    public Enrollment() { }

    public Enrollment(String leaRefId, String schoolRefId, String studentSchoolAssociationRefId, String responsibleSchoolType, String membershipType, String entryDate, EntryType entryType, String exitDate, ExitType exitType, String homeRoomNumber, HomeRoomTeacher homeRoomTeacher, String gradeLevel, String projectedGraduationYear, Counselor counselor) {
        super();
        this.leaRefId = leaRefId;
        this.schoolRefId = schoolRefId;
        this.studentSchoolAssociationRefId = studentSchoolAssociationRefId;
        this.responsibleSchoolType = responsibleSchoolType;
        this.membershipType = membershipType;
        this.entryDate = entryDate;
        this.entryType = entryType;
        this.exitDate = exitDate;
        this.exitType = exitType;
        this.homeRoomNumber = homeRoomNumber;
        this.homeRoomTeacher = homeRoomTeacher;
        this.gradeLevel = gradeLevel;
        this.projectedGraduationYear = projectedGraduationYear;
        this.counselor = counselor;
    }

    /**
     * <p>Gets the value of the leaRefId property.</p>
     * <p>RefId of the LEA.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("leaRefId")
    public String getLeaRefId() {
        return leaRefId;
    }

    /**
     * <p>Sets the value of the leaRefId property.</p>
     * <p>RefId of the LEA.</p>
     *
     * @param leaRefId allowed object is {@link String }
     */
    @JsonProperty("leaRefId")
    public void setLeaRefId(String leaRefId) {
        this.leaRefId = leaRefId;
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
     * <p>Gets the value of the studentSchoolAssociationRefId property.</p>
     * <p>RefId of the SIF Student-School Association object.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("studentSchoolAssociationRefId")
    public String getStudentSchoolAssociationRefId() {
        return studentSchoolAssociationRefId;
    }

    /**
     * <p>Sets the value of the studentSchoolAssociationRefId property.</p>
     * <p>RefId of the SIF Student-School Association object.</p>
     *
     * @param studentSchoolAssociationRefId allowed object is {@link String }
     */
    @JsonProperty("studentSchoolAssociationRefId")
    public void setStudentSchoolAssociationRefId(String studentSchoolAssociationRefId) {
        this.studentSchoolAssociationRefId = studentSchoolAssociationRefId;
    }

    /**
     * <p>Gets the value of the responsibleSchoolType property.</p>
     * <p>The type of services/instruction the school is responsible for providing to the student.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("responsibleSchoolType")
    public String getResponsibleSchoolType() {
        return responsibleSchoolType;
    }

    /**
     * <p>Sets the value of the responsibleSchoolType property.</p>
     * <p>The type of services/instruction the school is responsible for providing to the student.</p>
     *
     * @param responsibleSchoolType allowed object is {@link String }
     */
    @JsonProperty("responsibleSchoolType")
    public void setResponsibleSchoolType(String responsibleSchoolType) {
        this.responsibleSchoolType = responsibleSchoolType;
    }

    /**
     * <p>Gets the value of the membershipType property.</p>
     * <p>The student's type of membership in the system.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("membershipType")
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * <p>Sets the value of the membershipType property.</p>
     * <p>The student's type of membership in the system.</p>
     *
     * @param membershipType allowed object is {@link String }
     */
    @JsonProperty("membershipType")
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    /**
     * <p>Gets the value of the entryDate property.</p>
     * <p>The month, day, and year on which a person enters and begins to receive instructional services in a school, institution, program, or class-section during a given session.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("entryDate")
    public String getEntryDate() {
        return entryDate;
    }

    /**
     * <p>Sets the value of the entryDate property.</p>
     * <p>The month, day, and year on which a person enters and begins to receive instructional services in a school, institution, program, or class-section during a given session.</p>
     *
     * @param entryDate allowed object is {@link String }
     */
    @JsonProperty("entryDate")
    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * <p>Gets the value of the entryType property.</p>
     * <p>Enrollment entry type codes.</p>
     *
     * @return possible object is {@link EntryType }
     */
    @JsonProperty("entryType")
    public EntryType getEntryType() {
        return entryType;
    }

    /**
     * <p>Sets the value of the entryType property.</p>
     * <p>Enrollment entry type codes.</p>
     *
     * @param entryType allowed object is {@link EntryType }
     */
    @JsonProperty("entryType")
    public void setEntryType(EntryType entryType) {
        this.entryType = entryType;
    }

    /**
     * <p>Gets the value of the exitDate property.</p>
     * <p>The year, month and day on which the student officially withdrew or graduated, i.e. the date on which the student's enrollment ended.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("exitDate")
    public String getExitDate() {
        return exitDate;
    }

    /**
     * <p>Sets the value of the exitDate property.</p>
     * <p>The year, month and day on which the student officially withdrew or graduated, i.e. the date on which the student's enrollment ended.</p>
     *
     * @param exitDate allowed object is {@link String }
     */
    @JsonProperty("exitDate")
    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }

    /**
     * <p>Gets the value of the exitType property.</p>
     * <p>Enrollment exit type codes.</p>
     *
     * @return possible object is {@link ExitType }
     */
    @JsonProperty("exitType")
    public ExitType getExitType() {
        return exitType;
    }

    /**
     * <p>Sets the value of the exitType property.</p>
     * <p>Enrollment exit type codes.</p>
     *
     * @param exitType allowed object is {@link ExitType }
     */
    @JsonProperty("exitType")
    public void setExitType(ExitType exitType) {
        this.exitType = exitType;
    }

    /**
     * <p>Gets the value of the homeRoomNumber property.</p>
     * <p>Home Room number.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("homeRoomNumber")
    public String getHomeRoomNumber() {
        return homeRoomNumber;
    }

    /**
     * <p>Sets the value of the homeRoomNumber property.</p>
     * <p>Home Room number.</p>
     *
     * @param homeRoomNumber allowed object is {@link String }
     */
    @JsonProperty("homeRoomNumber")
    public void setHomeRoomNumber(String homeRoomNumber) {
        this.homeRoomNumber = homeRoomNumber;
    }

    /**
     * <p>Gets the value of the homeRoomTeacher property.</p>
     * <p>RefId of the homeroom teacher.</p>
     *
     * @return possible object is {@link HomeRoomTeacher }
     */
    @JsonProperty("homeRoomTeacher")
    public HomeRoomTeacher getHomeRoomTeacher() {
        return homeRoomTeacher;
    }

    /**
     * <p>Sets the value of the homeRoomTeacher property.</p>
     * <p>RefId of the homeroom teacher.</p>
     *
     * @param homeRoomTeacher allowed object is {@link HomeRoomTeacher }
     */
    @JsonProperty("homeRoomTeacher")
    public void setHomeRoomTeacher(HomeRoomTeacher homeRoomTeacher) {
        this.homeRoomTeacher = homeRoomTeacher;
    }

    /**
     * <p>Gets the value of the gradeLevel property.</p>
     * <p>The current grade or academic level of the student within a school.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("gradeLevel")
    public String getGradeLevel() {
        return gradeLevel;
    }

    /**
     * <p>Sets the value of the gradeLevel property.</p>
     * <p>The current grade or academic level of the student within a school.</p>
     *
     * @param gradeLevel allowed object is {@link String }
     */
    @JsonProperty("gradeLevel")
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    /**
     * <p>Gets the value of the projectedGraduationYear property.</p>
     * <p>The year and month the student is projected to graduate.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("projectedGraduationYear")
    public String getProjectedGraduationYear() {
        return projectedGraduationYear;
    }

    /**
     * <p>Sets the value of the projectedGraduationYear property.</p>
     * <p>The year and month the student is projected to graduate.</p>
     *
     * @param projectedGraduationYear allowed object is {@link String }
     */
    @JsonProperty("projectedGraduationYear")
    public void setProjectedGraduationYear(String projectedGraduationYear) {
        this.projectedGraduationYear = projectedGraduationYear;
    }

    /**
     * <p>Gets the value of the counselor property.</p>
     * <p>RefId of the counselor.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("counselor")
    public Counselor getCounselor() {
        return counselor;
    }

    /**
     * <p>Sets the value of the counselor property.</p>
     * <p>RefId of the counselor.</p>
     *
     * @param counselor allowed object is {@link String }
     */
    @JsonProperty("counselor")
    public void setCounselor(Counselor counselor) {
        this.counselor = counselor;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(leaRefId, schoolRefId, studentSchoolAssociationRefId, responsibleSchoolType, membershipType, entryDate, entryType, exitDate, exitType, homeRoomNumber, homeRoomTeacher, gradeLevel, projectedGraduationYear, counselor).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "Enrollment{" + "leaRefId='" + leaRefId + '\'' + ", schoolRefId='" + schoolRefId + '\'' + ", studentSchoolAssociationRefId='" + studentSchoolAssociationRefId + '\'' + ", responsibleSchoolType='" + responsibleSchoolType + '\'' + ", membershipType='" + membershipType + '\'' + ", entryDate='" + entryDate + '\'' + ", entryType=" + entryType + ", exitDate='" + exitDate + '\'' + ", exitType=" + exitType + ", homeRoomNumber='" + homeRoomNumber + '\'' + ", homeRoomTeacher=" + homeRoomTeacher + ", gradeLevel='" + gradeLevel + '\'' + ", projectedGraduationYear='" + projectedGraduationYear + '\'' + ", counselor=" + counselor + '}';
    }
}