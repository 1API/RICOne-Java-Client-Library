
package riconeapi.models.xpress;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sessionType",
        "sessionCode",
        "description",
        "markingTerm",
        "schedulingTerm",
        "linkedSessionCode",
        "startDate",
        "endDate"
})
public class XSessionType {

    @JsonProperty("sessionType")
    private String sessionType;
    @JsonProperty("sessionCode")
    private String sessionCode;
    @JsonProperty("description")
    private String description;
    @JsonProperty("markingTerm")
    private Boolean markingTerm;
    @JsonProperty("schedulingTerm")
    private Boolean schedulingTerm;
    @JsonProperty("linkedSessionCode")
    private String linkedSessionCode;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("endDate")
    private String endDate;

    public XSessionType() {
    }

    public XSessionType(String sessionType, String sessionCode, String description, Boolean markingTerm, Boolean schedulingTerm, String linkedSessionCode, String startDate, String endDate) {
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

    @JsonProperty("sessionType")
    public String getSessionType() {
        return sessionType;
    }

    @JsonProperty("sessionType")
    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    @JsonProperty("sessionCode")
    public String getSessionCode() {
        return sessionCode;
    }

    @JsonProperty("sessionCode")
    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("markingTerm")
    public Boolean getMarkingTerm() {
        return markingTerm;
    }

    @JsonProperty("markingTerm")
    public void setMarkingTerm(Boolean markingTerm) {
        this.markingTerm = markingTerm;
    }

    @JsonProperty("schedulingTerm")
    public Boolean getSchedulingTerm() {
        return schedulingTerm;
    }

    @JsonProperty("schedulingTerm")
    public void setSchedulingTerm(Boolean schedulingTerm) {
        this.schedulingTerm = schedulingTerm;
    }

    @JsonProperty("linkedSessionCode")
    public String getLinkedSessionCode() {
        return linkedSessionCode;
    }

    @JsonProperty("linkedSessionCode")
    public void setLinkedSessionCode(String linkedSessionCode) {
        this.linkedSessionCode = linkedSessionCode;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override public String toString()
    {
        return "XSessionType{" + "sessionType='" + sessionType + '\'' + ", sessionCode='" + sessionCode + '\'' + ", description='" + description + '\'' + ", markingTerm=" + markingTerm + ", schedulingTerm=" + schedulingTerm + ", linkedSessionCode='" + linkedSessionCode + '\'' + ", startDate='"
                + startDate + '\'' + ", endDate='" + endDate + '\'' + '}';
    }
}
