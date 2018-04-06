
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "xStudent"
})
@JsonRootName(value = "xStudents")
public class XStudentCollectionType {

    @JsonProperty("xStudent")
    private List<XStudentType> xStudent = new ArrayList<>();

    public XStudentCollectionType() {
    }

    public XStudentCollectionType(List<XStudentType> xStudent) {
        super();
        this.xStudent = xStudent;
    }

    @JsonProperty("xStudent")
    public List<XStudentType> getXStudent() {
        return xStudent;
    }

    @JsonProperty("xStudent")
    public void setXStudent(List<XStudentType> xStudent) {
        this.xStudent = xStudent;
    }

    @Override public String toString()
    {
        return "XStudentCollectionType{" + "xStudent=" + xStudent + '}';
    }
}
