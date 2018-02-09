
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "xStaff"
})
@JsonRootName(value = "xStaffs")
public class XStaffCollectionType {

    @JsonProperty("xStaff")
    private List<XStaffType> xStaff = new ArrayList<>();

    public XStaffCollectionType() {
    }

    public XStaffCollectionType(List<XStaffType> xStaff) {
        super();
        this.xStaff = xStaff;
    }

    @JsonProperty("xStaff")
    public List<XStaffType> getXStaff() {
        return xStaff;
    }

    @JsonProperty("xStaff")
    public void setXStaff(List<XStaffType> xStaff) {
        this.xStaff = xStaff;
    }

}
