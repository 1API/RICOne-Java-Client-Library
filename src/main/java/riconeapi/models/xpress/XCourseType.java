
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "@refId",
        "schoolRefId",
        "schoolCourseId",
        "leaCourseId",
        "otherIds",
        "courseTitle",
        "description",
        "subject",
        "applicableEducationLevels",
        "scedCourseCode",
        "scedCourseLevelCode",
        "scedCourseSubjectAreaCode"
})
public class XCourseType {

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    private String refId;
    @JsonProperty("schoolRefId")
    private String schoolRefId;
    @JsonProperty("schoolCourseId")
    private String schoolCourseId;
    @JsonProperty("leaCourseId")
    private String leaCourseId;
    @JsonProperty("otherIds")
    private XOtherCourseIdListType otherIds;
    @JsonProperty("courseTitle")
    private String courseTitle;
    @JsonProperty("description")
    private String description;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("applicableEducationLevels")
    private XApplicableEducationLevelListType applicableEducationLevels;
    @JsonProperty("scedCourseCode")
    private String scedCourseCode;
    @JsonProperty("scedCourseLevelCode")
    private String scedCourseLevelCode;
    @JsonProperty("scedCourseSubjectAreaCode")
    private String scedCourseSubjectAreaCode;

    public XCourseType() {
    }

    public XCourseType(String refId, String schoolRefId, String schoolCourseId, String leaCourseId, XOtherCourseIdListType otherIds, String courseTitle, String description, String subject, XApplicableEducationLevelListType applicableEducationLevels, String scedCourseCode, String scedCourseLevelCode, String scedCourseSubjectAreaCode) {
        super();
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
    }

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    public String getRefId() {
        return refId;
    }

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    public void setRefId(String refId) {
        this.refId = refId;
    }

    @JsonProperty("schoolRefId")
    public String getSchoolRefId() {
        return schoolRefId;
    }

    @JsonProperty("schoolRefId")
    public void setSchoolRefId(String schoolRefId) {
        this.schoolRefId = schoolRefId;
    }

    @JsonProperty("schoolCourseId")
    public String getSchoolCourseId() {
        return schoolCourseId;
    }

    @JsonProperty("schoolCourseId")
    public void setSchoolCourseId(String schoolCourseId) {
        this.schoolCourseId = schoolCourseId;
    }

    @JsonProperty("leaCourseId")
    public String getLeaCourseId() {
        return leaCourseId;
    }

    @JsonProperty("leaCourseId")
    public void setLeaCourseId(String leaCourseId) {
        this.leaCourseId = leaCourseId;
    }

    @JsonProperty("otherIds")
    public XOtherCourseIdListType getOtherIds() {
        return otherIds;
    }

    @JsonProperty("otherIds")
    public void setOtherIds(XOtherCourseIdListType otherIds) {
        this.otherIds = otherIds;
    }

    @JsonProperty("courseTitle")
    public String getCourseTitle() {
        return courseTitle;
    }

    @JsonProperty("courseTitle")
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("applicableEducationLevels")
    public XApplicableEducationLevelListType getApplicableEducationLevels() {
        return applicableEducationLevels;
    }

    @JsonProperty("applicableEducationLevels")
    public void setApplicableEducationLevels(XApplicableEducationLevelListType applicableEducationLevels) {
        this.applicableEducationLevels = applicableEducationLevels;
    }

    @JsonProperty("scedCourseCode")
    public String getScedCourseCode() {
        return scedCourseCode;
    }

    @JsonProperty("scedCourseCode")
    public void setScedCourseCode(String scedCourseCode) {
        this.scedCourseCode = scedCourseCode;
    }

    @JsonProperty("scedCourseLevelCode")
    public String getScedCourseLevelCode() {
        return scedCourseLevelCode;
    }

    @JsonProperty("scedCourseLevelCode")
    public void setScedCourseLevelCode(String scedCourseLevelCode) {
        this.scedCourseLevelCode = scedCourseLevelCode;
    }

    @JsonProperty("scedCourseSubjectAreaCode")
    public String getScedCourseSubjectAreaCode() {
        return scedCourseSubjectAreaCode;
    }

    @JsonProperty("scedCourseSubjectAreaCode")
    public void setScedCourseSubjectAreaCode(String scedCourseSubjectAreaCode) {
        this.scedCourseSubjectAreaCode = scedCourseSubjectAreaCode;
    }

    @Override public String toString()
    {
        return "XCourseType{" + "refId='" + refId + '\'' + ", schoolRefId='" + schoolRefId + '\'' + ", schoolCourseId='" + schoolCourseId + '\'' + ", leaCourseId='" + leaCourseId + '\'' + ", otherIds=" + otherIds + ", courseTitle='" + courseTitle + '\'' + ", description='" + description + '\''
                + ", subject='" + subject + '\'' + ", applicableEducationLevels=" + applicableEducationLevels + ", scedCourseCode='" + scedCourseCode + '\'' + ", scedCourseLevelCode='" + scedCourseLevelCode + '\'' + ", scedCourseSubjectAreaCode='" + scedCourseSubjectAreaCode + '\'' + '}';
    }
}
