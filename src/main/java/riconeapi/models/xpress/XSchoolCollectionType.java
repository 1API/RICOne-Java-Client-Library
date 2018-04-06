
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "xSchool"
})
@JsonRootName(value = "xSchools")
public class XSchoolCollectionType {

    @JsonProperty("xSchool")
    private List<XSchoolType> xSchool = new ArrayList<XSchoolType>();

    public XSchoolCollectionType() {
    }

    public XSchoolCollectionType(List<XSchoolType> xSchool) {
        super();
        this.xSchool = xSchool;
    }

    @JsonProperty("xSchool")
    public List<XSchoolType> getXSchool() {
        return xSchool;
    }

    @JsonProperty("xSchool")
    public void setXSchool(List<XSchoolType> xSchool)
    {
        this.xSchool = xSchool;

    }

    @Override public String toString()
    {
        return "XSchoolCollectionType{" + "xSchool=" + xSchool + '}';
    }
}
