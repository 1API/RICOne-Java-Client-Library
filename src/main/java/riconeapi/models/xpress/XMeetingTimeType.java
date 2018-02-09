
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.datatype.XMLGregorianCalendar;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "timeTableDay",
        "classMeetingDays",
        "timeTablePeriod",
        "roomNumber",
        "classBeginningTime",
        "classEndingTime",
        "sessionCode",
        "schoolCalendarRefId"
})
public class XMeetingTimeType {

    @JsonProperty("timeTableDay")
    private String timeTableDay;
    @JsonProperty("classMeetingDays")
    private XDayListType classMeetingDays;
    @JsonProperty("timeTablePeriod")
    private String timeTablePeriod;
    @JsonProperty("roomNumber")
    private String roomNumber;
    @JsonProperty("classBeginningTime")
    private XMLGregorianCalendar classBeginningTime;
    @JsonProperty("classEndingTime")
    private XMLGregorianCalendar classEndingTime;
    @JsonProperty("sessionCode")
    private String sessionCode;
    @JsonProperty("schoolCalendarRefId")
    private String schoolCalendarRefId;


    public XMeetingTimeType() {
    }

    public XMeetingTimeType(String timeTableDay, XDayListType classMeetingDays, String timeTablePeriod, String roomNumber, XMLGregorianCalendar classBeginningTime, XMLGregorianCalendar classEndingTime, String sessionCode, String schoolCalendarRefId) {
        super();
        this.timeTableDay = timeTableDay;
        this.classMeetingDays = classMeetingDays;
        this.timeTablePeriod = timeTablePeriod;
        this.roomNumber = roomNumber;
        this.classBeginningTime = classBeginningTime;
        this.classEndingTime = classEndingTime;
        this.sessionCode = sessionCode;
        this.schoolCalendarRefId = schoolCalendarRefId;
    }

    @JsonProperty("timeTableDay")
    public String getTimeTableDay() {
        return timeTableDay;
    }

    @JsonProperty("timeTableDay")
    public void setTimeTableDay(String timeTableDay) {
        this.timeTableDay = timeTableDay;
    }

    @JsonProperty("classMeetingDays")
    public XDayListType getClassMeetingDays() {
        return classMeetingDays;
    }

    @JsonProperty("classMeetingDays")
    public void setClassMeetingDays(XDayListType classMeetingDays) {
        this.classMeetingDays = classMeetingDays;
    }

    @JsonProperty("timeTablePeriod")
    public String getTimeTablePeriod() {
        return timeTablePeriod;
    }

    @JsonProperty("timeTablePeriod")
    public void setTimeTablePeriod(String timeTablePeriod) {
        this.timeTablePeriod = timeTablePeriod;
    }

    @JsonProperty("roomNumber")
    public String getRoomNumber() {
        return roomNumber;
    }

    @JsonProperty("roomNumber")
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @JsonProperty("classBeginningTime")
    public XMLGregorianCalendar getClassBeginningTime() {
        return classBeginningTime;
    }

    @JsonProperty("classBeginningTime")
    public void setClassBeginningTime(XMLGregorianCalendar classBeginningTime) {
        this.classBeginningTime = classBeginningTime;
    }

    @JsonProperty("classEndingTime")
    public XMLGregorianCalendar getClassEndingTime() {
        return classEndingTime;
    }

    @JsonProperty("classEndingTime")
    public void setClassEndingTime(XMLGregorianCalendar classEndingTime) {
        this.classEndingTime = classEndingTime;
    }

    @JsonProperty("sessionCode")
    public String getSessionCode() {
        return sessionCode;
    }

    @JsonProperty("sessionCode")
    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }

    @JsonProperty("schoolCalendarRefId")
    public String getSchoolCalendarRefId() {
        return schoolCalendarRefId;
    }

    @JsonProperty("schoolCalendarRefId")
    public void setSchoolCalendarRefId(String schoolCalendarRefId) {
        this.schoolCalendarRefId = schoolCalendarRefId;
    }

    @Override public String toString()
    {
        return "XMeetingTimeType{" + "timeTableDay='" + timeTableDay + '\'' + ", classMeetingDays=" + classMeetingDays + ", timeTablePeriod='" + timeTablePeriod + '\'' + ", roomNumber='" + roomNumber + '\'' + ", classBeginningTime=" + classBeginningTime + ", classEndingTime=" + classEndingTime
                + ", sessionCode='" + sessionCode + '\'' + ", schoolCalendarRefId='" + schoolCalendarRefId + '\'' + '}';
    }
}
