
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "leaRefId",
        "schoolRefId",
        "jobFunction"
})
public class XStaffPersonAssignmentType {

    @JsonProperty("leaRefId")
    private String leaRefId;
    @JsonProperty("schoolRefId")
    private String schoolRefId;
    @JsonProperty("jobFunction")
    private String jobFunction;

    public XStaffPersonAssignmentType() {
    }

    public XStaffPersonAssignmentType(String leaRefId, String schoolRefId, String jobFunction) {
        super();
        this.leaRefId = leaRefId;
        this.schoolRefId = schoolRefId;
        this.jobFunction = jobFunction;
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

    @JsonProperty("jobFunction")
    public String getJobFunction() {
        return jobFunction;
    }

    @JsonProperty("jobFunction")
    public void setJobFunction(String jobFunction) {
        this.jobFunction = jobFunction;
    }

    @Override public String toString()
    {
        return "XStaffPersonAssignmentType{" + "leaRefId='" + leaRefId + '\'' + ", schoolRefId='" + schoolRefId + '\'' + ", jobFunction='" + jobFunction + '\'' + '}';
    }
}
