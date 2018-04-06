
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "enrollment"
})
public class XEnrollmentListType {

    @JsonProperty("enrollment")
    private List<XEnrollmentType> enrollment = new ArrayList<>();

    public XEnrollmentListType() {
    }

    public XEnrollmentListType(List<XEnrollmentType> enrollment) {
        super();
        this.enrollment = enrollment;
    }

    @JsonProperty("enrollment")
    public List<XEnrollmentType> getEnrollment() {
        return enrollment;
    }

    @JsonProperty("enrollment")
    public void setEnrollment(List<XEnrollmentType> enrollment) {
        this.enrollment = enrollment;
    }

    @Override public String toString()
    {
        return "XEnrollmentListType{" + "enrollment=" + enrollment + '}';
    }
}