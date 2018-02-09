
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.datatype.XMLGregorianCalendar;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@refId",
        "courseRefId",
        "courseTitle",
        "sectionRefId",
        "schoolRefId",
        "schoolSectionId",
        "schoolYear",
        "sessionCode",
        "schoolCalendarRefId",
        "meetingTimes",
        "students",
        "primaryStaff",
        "otherStaffs"
})
@JsonRootName(value = "xRoster")
public class XRosterType {

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    private String refId;
    @JsonProperty("courseRefId")
    private String courseRefId;
    @JsonProperty("courseTitle")
    private String courseTitle;
    @JsonProperty("sectionRefId")
    private String sectionRefId;
    @JsonProperty("schoolRefId")
    private String schoolRefId;
    @JsonProperty("schoolSectionId")
    private String schoolSectionId;
    @JsonProperty("schoolYear")
    private XMLGregorianCalendar schoolYear;
    /**
     * @deprecated
     * Use sessionCode in XMeetingTimeType
     */
    @Deprecated
    @JsonProperty("sessionCode")
    private String sessionCode;
    /**
     * @deprecated
     * Use schoolCalendarRefId in XMeetingTimeType
     */
    @Deprecated
    @JsonProperty("schoolCalendarRefId")
    private String schoolCalendarRefId;
    @JsonProperty("meetingTimes")
    private XMeetingTimeListType meetingTimes;
    @JsonProperty("students")
    private XStudentReferenceListType students;
    @JsonProperty("primaryStaff")
    private XStaffReferenceType primaryStaff;
    @JsonProperty("otherStaffs")
    private XStaffReferenceListType otherStaffs;

    public XRosterType() {
    }

    public XRosterType(String refId, String courseRefId, String courseTitle, String sectionRefId, String schoolRefId, String schoolSectionId, XMLGregorianCalendar schoolYear, String sessionCode, String schoolCalendarRefId, XMeetingTimeListType meetingTimes, XStudentReferenceListType students, XStaffReferenceType primaryStaff, XStaffReferenceListType otherStaffs) {
        super();
        this.refId = refId;
        this.courseRefId = courseRefId;
        this.courseTitle = courseTitle;
        this.sectionRefId = sectionRefId;
        this.schoolRefId = schoolRefId;
        this.schoolSectionId = schoolSectionId;
        this.schoolYear = schoolYear;
        this.sessionCode = sessionCode;
        this.schoolCalendarRefId = schoolCalendarRefId;
        this.meetingTimes = meetingTimes;
        this.students = students;
        this.primaryStaff = primaryStaff;
        this.otherStaffs = otherStaffs;
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

    @JsonProperty("courseRefId")
    public String getCourseRefId() {
        return courseRefId;
    }

    @JsonProperty("courseRefId")
    public void setCourseRefId(String courseRefId) {
        this.courseRefId = courseRefId;
    }

    @JsonProperty("courseTitle")
    public String getCourseTitle() {
        return courseTitle;
    }

    @JsonProperty("courseTitle")
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    @JsonProperty("sectionRefId")
    public String getSectionRefId() {
        return sectionRefId;
    }

    @JsonProperty("sectionRefId")
    public void setSectionRefId(String sectionRefId) {
        this.sectionRefId = sectionRefId;
    }

    @JsonProperty("schoolRefId")
    public String getSchoolRefId() {
        return schoolRefId;
    }

    @JsonProperty("schoolRefId")
    public void setSchoolRefId(String schoolRefId) {
        this.schoolRefId = schoolRefId;
    }

    @JsonProperty("schoolSectionId")
    public String getSchoolSectionId() {
        return schoolSectionId;
    }

    @JsonProperty("schoolSectionId")
    public void setSchoolSectionId(String schoolSectionId) {
        this.schoolSectionId = schoolSectionId;
    }

    @JsonProperty("schoolYear")
    public XMLGregorianCalendar getSchoolYear() {
        return schoolYear;
    }

    @JsonProperty("schoolYear")
    public void setSchoolYear(XMLGregorianCalendar schoolYear) {
        this.schoolYear = schoolYear;
    }

    @Deprecated
    @JsonProperty("sessionCode")
    public String getSessionCode() {
        return sessionCode;
    }

    @Deprecated
    @JsonProperty("sessionCode")
    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }

    @Deprecated
    @JsonProperty("schoolCalendarRefId")
    public String getSchoolCalendarRefId() {
        return schoolCalendarRefId;
    }

    @Deprecated
    @JsonProperty("schoolCalendarRefId")
    public void setSchoolCalendarRefId(String schoolCalendarRefId) {
        this.schoolCalendarRefId = schoolCalendarRefId;
    }

    @JsonProperty("meetingTimes")
    public XMeetingTimeListType getMeetingTimes() {
        return meetingTimes;
    }

    @JsonProperty("meetingTimes")
    public void setMeetingTimes(XMeetingTimeListType meetingTimes) {
        this.meetingTimes = meetingTimes;
    }

    @JsonProperty("students")
    public XStudentReferenceListType getStudents() {
        return students;
    }

    @JsonProperty("students")
    public void setStudents(XStudentReferenceListType students) {
        this.students = students;
    }

    @JsonProperty("primaryStaff")
    public XStaffReferenceType getPrimaryStaff() {
        return primaryStaff;
    }

    @JsonProperty("primaryStaff")
    public void setPrimaryStaff(XStaffReferenceType primaryStaff) {
        this.primaryStaff = primaryStaff;
    }

    @JsonProperty("otherStaffs")
    public XStaffReferenceListType getOtherStaffs() {
        return otherStaffs;
    }

    @JsonProperty("otherStaffs")
    public void setOtherStaffs(XStaffReferenceListType otherStaffs) {
        this.otherStaffs = otherStaffs;
    }

    @Override public String toString()
    {
        return "XRosterType{" + "refId='" + refId + '\'' + ", courseRefId='" + courseRefId + '\'' + ", courseTitle='" + courseTitle + '\'' + ", sectionRefId='" + sectionRefId + '\'' + ", schoolRefId='" + schoolRefId + '\'' + ", schoolSectionId='" + schoolSectionId + '\'' + ", schoolYear="
                + schoolYear + ", sessionCode='" + sessionCode + '\'' + ", schoolCalendarRefId='" + schoolCalendarRefId + '\'' + ", meetingTimes=" + meetingTimes + ", students=" + students + ", primaryStaff=" + primaryStaff + ", otherStaffs=" + otherStaffs + '}';
    }
}
