package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xMeetingTimeType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"timeTableDay", "classMeetingDays", "timeTablePeriod", "roomNumber", "classBeginningTime", "classEndingTime", "sessionCode", "schoolCalendarRefId"})
public class MeetingTime {
    @JsonProperty("timeTableDay")
    @JacksonXmlProperty(localName = "timeTableDay", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String timeTableDay;

    @JsonProperty("classMeetingDays")
    @JacksonXmlProperty(localName = "classMeetingDays", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private ClassMeetingDays classMeetingDays;

    @JsonProperty("timeTablePeriod")
    @JacksonXmlProperty(localName = "timeTablePeriod", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String timeTablePeriod;

    @JsonProperty("roomNumber")
    @JacksonXmlProperty(localName = "roomNumber", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String roomNumber;

    @JsonProperty("classBeginningTime")
    @JacksonXmlProperty(localName = "classBeginningTime", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String classBeginningTime;

    @JsonProperty("classEndingTime")
    @JacksonXmlProperty(localName = "classEndingTime", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String classEndingTime;

    @JsonProperty("sessionCode")
    @JacksonXmlProperty(localName = "sessionCode", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String sessionCode;

    @JsonProperty("schoolCalendarRefId")
    @JacksonXmlProperty(localName = "schoolCalendarRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String schoolCalendarRefId;

    public MeetingTime() { }

    public MeetingTime(String timeTableDay, ClassMeetingDays classMeetingDays, String timeTablePeriod, String roomNumber, String classBeginningTime, String classEndingTime, String sessionCode, String schoolCalendarRefId) {
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

    /**
     * <p>Gets the value of the timeTableDay property.</p>
     * <p>The unique identifier for the locally defined rotation cycle date code when the class meets (e.g., in a two day schedule, valid values could be "A" and "B", or "1" and "2").</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("timeTableDay")
    public String getTimeTableDay() {
        return timeTableDay;
    }

    /**
     * <p>Sets the value of the timeTableDay property.</p>
     * <p>The unique identifier for the locally defined rotation cycle date code when the class meets (e.g., in a two day schedule, valid values could be "A" and "B", or "1" and "2").</p>
     *
     * @param timeTableDay allowed object is {@link String }
     */
    @JsonProperty("timeTableDay")
    public void setTimeTableDay(String timeTableDay) {
        this.timeTableDay = timeTableDay;
    }

    /**
     * <p>Gets the value of the classMeetingDays property.</p>
     * <p>The day(s) of the week (e.g., Monday, Wednesday) that the class meets or an indication that a class meets "out-of-school" or "self-paced".</p>
     *
     * @return possible object is {@link ClassMeetingDays }
     */
    @JsonProperty("classMeetingDays")
    public ClassMeetingDays getClassMeetingDays() {
        return classMeetingDays;
    }

    /**
     * <p>Sets the value of the classMeetingDays property.</p>
     * <p>The day(s) of the week (e.g., Monday, Wednesday) that the class meets or an indication that a class meets "out-of-school" or "self-paced".</p>
     *
     * @param classMeetingDays allowed object is {@link ClassMeetingDays }
     */
    @JsonProperty("classMeetingDays")
    public void setClassMeetingDays(ClassMeetingDays classMeetingDays) {
        this.classMeetingDays = classMeetingDays;
    }

    /**
     * <p>Gets the value of the timeTablePeriod property.</p>
     * <p>An indication of the portion of a typical daily session in which students receive instruction in a specified subject (e.g., morning, sixth period, block period, or AB schedules).</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("timeTablePeriod")
    public String getTimeTablePeriod() {
        return timeTablePeriod;
    }

    /**
     * <p>Sets the value of the timeTablePeriod property.</p>
     * <p>An indication of the portion of a typical daily session in which students receive instruction in a specified subject (e.g., morning, sixth period, block period, or AB schedules).</p>
     *
     * @param timeTablePeriod allowed object is {@link String }
     */
    @JsonProperty("timeTablePeriod")
    public void setTimeTablePeriod(String timeTablePeriod) {
        this.timeTablePeriod = timeTablePeriod;
    }

    /**
     * <p>Gets the value of the roomNumber property.</p>
     * <p>A unique number or alphanumeric code assigned to a room by a school, school system, state, or other agency or entity.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("roomNumber")
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * <p>Sets the value of the roomNumber property.</p>
     * <p>A unique number or alphanumeric code assigned to a room by a school, school system, state, or other agency or entity.</p>
     *
     * @param roomNumber allowed object is {@link String }
     */
    @JsonProperty("roomNumber")
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * <p>Gets the value of the classBeginningTime property.</p>
     * <p>An indication of the time of day the class begins.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("classBeginningTime")
    public String getClassBeginningTime() {
        return classBeginningTime;
    }

    /**
     * <p>Sets the value of the classBeginningTime property.</p>
     * <p>An indication of the time of day the class begins.</p>
     *
     * @param classBeginningTime allowed object is {@link String }
     */
    @JsonProperty("classBeginningTime")
    public void setClassBeginningTime(String classBeginningTime) {
        this.classBeginningTime = classBeginningTime;
    }

    /**
     * <p>Gets the value of the classEndingTime property.</p>
     * <p>An indication of the time of day the class ends.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("classEndingTime")
    public String getClassEndingTime() {
        return classEndingTime;
    }

    /**
     * <p>Sets the value of the classEndingTime property.</p>
     * <p>An indication of the time of day the class ends.</p>
     *
     * @param classEndingTime allowed object is {@link String }
     */
    @JsonProperty("classEndingTime")
    public void setClassEndingTime(String classEndingTime) {
        this.classEndingTime = classEndingTime;
    }

    /**
     * <p>Gets the value of the sessionCode property.</p>
     * <p>A local code given to the session, usually for a session that represents a term within the school year such as a marking term.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("sessionCode")
    public String getSessionCode() {
        return sessionCode;
    }

    /**
     * <p>Sets the value of the sessionCode property.</p>
     * <p>A local code given to the session, usually for a session that represents a term within the school year such as a marking term.</p>
     *
     * @param sessionCode allowed object is {@link String }
     */
    @JsonProperty("sessionCode")
    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }

    /**
     * <p>Gets the value of the schoolCalendarRefId property.</p>
     * <p>The RefId of the school calendar.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("schoolCalendarRefId")
    public String getSchoolCalendarRefId() {
        return schoolCalendarRefId;
    }

    /**
     * <p>Sets the value of the schoolCalendarRefId property.</p>
     * <p>The RefId of the school calendar.</p>
     *
     * @param schoolCalendarRefId allowed object is {@link String }
     */
    @JsonProperty("schoolCalendarRefId")
    public void setSchoolCalendarRefId(String schoolCalendarRefId) {
        this.schoolCalendarRefId = schoolCalendarRefId;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(timeTableDay, classMeetingDays, timeTablePeriod, roomNumber, classBeginningTime, classEndingTime, sessionCode, schoolCalendarRefId).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "MeetingTime{" + "timeTableDay='" + timeTableDay + '\'' + ", classMeetingDays=" + classMeetingDays + ", timeTablePeriod='" + timeTablePeriod + '\'' + ", roomNumber='" + roomNumber + '\'' + ", classBeginningTime='" + classBeginningTime + '\'' + ", classEndingTime='" + classEndingTime + '\'' + ", sessionCode='" + sessionCode + '\'' + ", schoolCalendarRefId='" + schoolCalendarRefId + '\'' + '}';
    }
}