
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "applicableEducationLevel"
})
public class XApplicableEducationLevelListType {

    @JsonProperty("applicableEducationLevel")
    private List<String> applicableEducationLevel = new ArrayList<String>();

    public XApplicableEducationLevelListType() {
    }

    public XApplicableEducationLevelListType(List<String> applicableEducationLevel) {
        super();
        this.applicableEducationLevel = applicableEducationLevel;
    }

    @JsonProperty("applicableEducationLevel")
    public List<String> getApplicableEducationLevel() {
        return applicableEducationLevel;
    }

    @JsonProperty("applicableEducationLevel")
    public void setApplicableEducationLevel(List<String> applicableEducationLevel) {
        this.applicableEducationLevel = applicableEducationLevel;
    }

    @Override public String toString()
    {
        return "XApplicableEducationLevelListType{" + "applicableEducationLevel=" + applicableEducationLevel + '}';
    }
}
