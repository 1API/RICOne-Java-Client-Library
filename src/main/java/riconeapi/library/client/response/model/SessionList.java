package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xSessionType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"sessionType", "sessionCode", "description", "markingTerm", "schedulingTerm", "linkedSessionCode", "startDate", "endDate"})
public class SessionList {
    @JsonProperty("sessionType")
    @JacksonXmlProperty(localName = "sessionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String sessionType;

    @JsonProperty("sessionCode")
    @JacksonXmlProperty(localName = "sessionCode", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String sessionCode;

    @JsonProperty("description")
    @JacksonXmlProperty(localName = "description", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String description;

    @JsonProperty("markingTerm")
    @JacksonXmlProperty(localName = "markingTerm", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Boolean markingTerm;

    @JsonProperty("schedulingTerm")
    @JacksonXmlProperty(localName = "schedulingTerm", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Boolean schedulingTerm;

    @JsonProperty("linkedSessionCode")
    @JacksonXmlProperty(localName = "linkedSessionCode", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String linkedSessionCode;

    @JsonProperty("startDate")
    @JacksonXmlProperty(localName = "startDate", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String startDate;

    @JsonProperty("endDate")
    @JacksonXmlProperty(localName = "endDate", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String endDate;

    public SessionList() { }

    public SessionList(String sessionType, String sessionCode, String description, Boolean markingTerm, Boolean schedulingTerm, String linkedSessionCode, String startDate, String endDate) {
        super();
        this.sessionType = sessionType;
        this.sessionCode = sessionCode;
        this.description = description;
        this.markingTerm = markingTerm;
        this.schedulingTerm = schedulingTerm;
        this.linkedSessionCode = linkedSessionCode;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * <p>Gets the value of the sessionType property.</p>
     * <p>A prescribed span of time when an education institution is open, instruction is provided, and students are under the direction and guidance of teachers and/or education institution administration. A session may be interrupted by one or more vacations.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("sessionType")
    public String getSessionType() {
        return sessionType;
    }

    /**
     * <p>Sets the value of the sessionType property.</p>
     * <p>A prescribed span of time when an education institution is open, instruction is provided, and students are under the direction and guidance of teachers and/or education institution administration. A session may be interrupted by one or more vacations.</p>
     *
     * @param sessionType allowed object is {@link String }
     */
    @JsonProperty("sessionType")
    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
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
     * <p>Gets the value of the description property.</p>
     * <p>A short description of the Session.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * <p>Sets the value of the description property.</p>
     * <p>A short description of the Session.</p>
     *
     * @param description allowed object is {@link String }
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>Gets the value of the markingTerm property.</p>
     * <p>Indicates that the session is a marking term.</p>
     *
     * @return possible object is {@link Boolean }
     */
    @JsonProperty("markingTerm")
    public Boolean getMarkingTerm() {
        return markingTerm;
    }

    /**
     * <p>Sets the value of the markingTerm property.</p>
     * <p>Indicates that the session is a marking term.</p>
     *
     * @param markingTerm allowed object is {@link Boolean }
     */
    @JsonProperty("markingTerm")
    public void setMarkingTerm(Boolean markingTerm) {
        this.markingTerm = markingTerm;
    }

    /**
     * <p>Gets the value of the schedulingTerm property.</p>
     * <p>Indicates that the session is a scheduling term.</p>
     *
     * @return possible object is {@link Boolean }
     */
    @JsonProperty("schedulingTerm")
    public Boolean getSchedulingTerm() {
        return schedulingTerm;
    }

    /**
     * <p>Sets the value of the schedulingTerm property.</p>
     * <p>Indicates that the session is a scheduling term.</p>
     *
     * @param schedulingTerm allowed object is {@link Boolean }
     */
    @JsonProperty("schedulingTerm")
    public void setSchedulingTerm(Boolean schedulingTerm) {
        this.schedulingTerm = schedulingTerm;
    }

    /**
     * <p>Gets the value of the linkedSessionCode property.</p>
     * <p>Enables sessions to be linked (e.g. link a marking term to a scheduling term)</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("linkedSessionCode")
    public String getLinkedSessionCode() {
        return linkedSessionCode;
    }

    /**
     * <p>Sets the value of the linkedSessionCode property.</p>
     * <p>Enables sessions to be linked (e.g. link a marking term to a scheduling term)</p>
     *
     * @param linkedSessionCode allowed object is {@link String }
     */
    @JsonProperty("linkedSessionCode")
    public void setLinkedSessionCode(String linkedSessionCode) {
        this.linkedSessionCode = linkedSessionCode;
    }

    /**
     * <p>Gets the value of the startDate property.</p>
     * <p>The year, month and day on which a session begins.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    /**
     * <p>Sets the value of the startDate property.</p>
     * <p>The year, month and day on which a session begins.</p>
     *
     * @param startDate allowed object is {@link String }
     */
    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>Gets the value of the xxx property.</p>
     * <p>The year, month and day on which a session ends.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    /**
     * <p>Sets the value of the endDate property.</p>
     * <p>The year, month and day on which a session ends.</p>
     *
     * @param endDate allowed object is {@link String }
     */
    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(sessionType, sessionCode, description, markingTerm, schedulingTerm, linkedSessionCode, startDate, endDate).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "SessionList{" + "sessionType='" + sessionType + '\'' + ", sessionCode='" + sessionCode + '\'' + ", description='" + description + '\'' + ", markingTerm='" + markingTerm + '\'' + ", schedulingTerm='" + schedulingTerm + '\'' + ", linkedSessionCode='" + linkedSessionCode + '\'' + ", startDate='" + startDate + '\'' + ", endDate='" + endDate + '\'' + '}';
    }
}