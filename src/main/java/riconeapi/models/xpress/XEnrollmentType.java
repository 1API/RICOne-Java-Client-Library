
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.datatype.XMLGregorianCalendar;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "leaRefId",
        "schoolRefId",
        "studentSchoolAssociationRefId",
        "responsibleSchoolType",
        "membershipType",
        "entryDate",
        "entryType",
        "exitDate",
        "exitType",
        "homeRoomNumber",
        "homeRoomTeacher",
        "gradeLevel",
        "projectedGraduationYear",
        "counselor"
})
public class XEnrollmentType {

    @JsonProperty("leaRefId")
    private String leaRefId;
    @JsonProperty("schoolRefId")
    private String schoolRefId;
    @JsonProperty("studentSchoolAssociationRefId")
    private String studentSchoolAssociationRefId;
    @JsonProperty("responsibleSchoolType")
    private String responsibleSchoolType;
    @JsonProperty("membershipType")
    private String membershipType;
    @JsonProperty("entryDate")
    private XMLGregorianCalendar entryDate;
    @JsonProperty("entryType")
    private XOtherCodeListType entryType;
    @JsonProperty("exitDate")
    private XMLGregorianCalendar exitDate;
    @JsonProperty("exitType")
    private XOtherCodeListType exitType;
    @JsonProperty("homeRoomNumber")
    private String homeRoomNumber;
    @JsonProperty("homeRoomTeacher")
    private XPersonReferenceType homeRoomTeacher;
    @JsonProperty("gradeLevel")
    private String gradeLevel;
    @JsonProperty("projectedGraduationYear")
    private XMLGregorianCalendar projectedGraduationYear;
    @JsonProperty("counselor")
    private XPersonReferenceType counselor;

    public XEnrollmentType() {
    }

    public XEnrollmentType(String leaRefId, String schoolRefId, String studentSchoolAssociationRefId, String responsibleSchoolType, String membershipType, XMLGregorianCalendar entryDate, XOtherCodeListType entryType, XMLGregorianCalendar exitDate, XOtherCodeListType exitType, String homeRoomNumber, XPersonReferenceType homeRoomTeacher, String gradeLevel, XMLGregorianCalendar projectedGraduationYear, XPersonReferenceType counselor) {
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

    @JsonProperty("leaRefId")
    public String getLeaRefId() {
        return leaRefId;
    }

    @JsonProperty("leaRefId")
    public void setLeaRefId(String leaRefId) {
        this.leaRefId = leaRefId;
    }

    @JsonProperty("schoolRefId")
    public String getSchoolRefId() {
        return schoolRefId;
    }

    @JsonProperty("schoolRefId")
    public void setSchoolRefId(String schoolRefId) {
        this.schoolRefId = schoolRefId;
    }

    @JsonProperty("studentSchoolAssociationRefId")
    public String getStudentSchoolAssociationRefId() {
        return studentSchoolAssociationRefId;
    }

    @JsonProperty("studentSchoolAssociationRefId")
    public void setStudentSchoolAssociationRefId(String studentSchoolAssociationRefId) {
        this.studentSchoolAssociationRefId = studentSchoolAssociationRefId;
    }

    @JsonProperty("responsibleSchoolType")
    public String getResponsibleSchoolType() {
        return responsibleSchoolType;
    }

    @JsonProperty("responsibleSchoolType")
    public void setResponsibleSchoolType(String responsibleSchoolType) {
        this.responsibleSchoolType = responsibleSchoolType;
    }

    @JsonProperty("membershipType")
    public String getMembershipType() {
        return membershipType;
    }

    @JsonProperty("membershipType")
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    @JsonProperty("entryDate")
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    @JsonProperty("entryDate")
    public void setEntryDate(XMLGregorianCalendar entryDate) {
        this.entryDate = entryDate;
    }

    @JsonProperty("entryType")
    public XOtherCodeListType getEntryType() {
        return entryType;
    }

    @JsonProperty("entryType")
    public void setEntryType(XOtherCodeListType entryType) {
        this.entryType = entryType;
    }

    @JsonProperty("exitDate")
    public XMLGregorianCalendar getExitDate() {
        return exitDate;
    }

    @JsonProperty("exitDate")
    public void setExitDate(XMLGregorianCalendar exitDate) {
        this.exitDate = exitDate;
    }

    @JsonProperty("exitType")
    public XOtherCodeListType getExitType() {
        return exitType;
    }

    @JsonProperty("exitType")
    public void setExitType(XOtherCodeListType exitType) {
        this.exitType = exitType;
    }

    @JsonProperty("homeRoomNumber")
    public String getHomeRoomNumber() {
        return homeRoomNumber;
    }

    @JsonProperty("homeRoomNumber")
    public void setHomeRoomNumber(String homeRoomNumber) {
        this.homeRoomNumber = homeRoomNumber;
    }

    @JsonProperty("homeRoomTeacher")
    public XPersonReferenceType getHomeRoomTeacher() {
        return homeRoomTeacher;
    }

    @JsonProperty("homeRoomTeacher")
    public void setHomeRoomTeacher(XPersonReferenceType homeRoomTeacher) {
        this.homeRoomTeacher = homeRoomTeacher;
    }

    @JsonProperty("gradeLevel")
    public String getGradeLevel() {
        return gradeLevel;
    }

    @JsonProperty("gradeLevel")
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @JsonProperty("projectedGraduationYear")
    public XMLGregorianCalendar getProjectedGraduationYear() {
        return projectedGraduationYear;
    }

    @JsonProperty("projectedGraduationYear")
    public void setProjectedGraduationYear(XMLGregorianCalendar projectedGraduationYear) {
        this.projectedGraduationYear = projectedGraduationYear;
    }

    @JsonProperty("counselor")
    public XPersonReferenceType getCounselor() {
        return counselor;
    }

    @JsonProperty("counselor")
    public void setCounselor(XPersonReferenceType counselor) {
        this.counselor = counselor;
    }

    @Override public String toString()
    {
        return "XEnrollmentType{" + "leaRefId='" + leaRefId + '\'' + ", schoolRefId='" + schoolRefId + '\'' + ", studentSchoolAssociationRefId='" + studentSchoolAssociationRefId + '\'' + ", responsibleSchoolType='" + responsibleSchoolType + '\'' + ", membershipType='" + membershipType + '\''
                + ", entryDate=" + entryDate + ", entryType=" + entryType + ", exitDate=" + exitDate + ", exitType=" + exitType + ", homeRoomNumber='" + homeRoomNumber + '\'' + ", homeRoomTeacher=" + homeRoomTeacher + ", gradeLevel='" + gradeLevel + '\'' + ", projectedGraduationYear="
                + projectedGraduationYear + ", counselor=" + counselor + '}';
    }
}
