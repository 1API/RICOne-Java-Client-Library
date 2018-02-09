
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
        "otherStaff"
})
public class XStaffReferenceListType {

    @JsonProperty("otherStaff")
    private List<XStaffReferenceType> otherStaff = new ArrayList<>();

    public XStaffReferenceListType() {
    }

    public XStaffReferenceListType(List<XStaffReferenceType> otherStaff) {
        super();
        this.otherStaff = otherStaff;
    }

    @JsonProperty("otherStaff")
    public List<XStaffReferenceType> getOtherStaff() {
        return otherStaff;
    }

    @JsonProperty("otherStaff")
    public void setOtherStaff(List<XStaffReferenceType> otherStaff) {
        this.otherStaff = otherStaff;
    }

}
