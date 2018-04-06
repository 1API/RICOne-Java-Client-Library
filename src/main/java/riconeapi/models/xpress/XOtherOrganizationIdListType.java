
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
        "otherId"
})
public class XOtherOrganizationIdListType {

    @JsonProperty("otherId")
    private List<XOtherOrganizationIdType> otherId = new ArrayList<XOtherOrganizationIdType>();

    public XOtherOrganizationIdListType() {
    }

    public XOtherOrganizationIdListType(List<XOtherOrganizationIdType> otherId) {
        super();
        this.otherId = otherId;
    }

    @JsonProperty("otherId")
    public List<XOtherOrganizationIdType> getOtherId() {
        return otherId;
    }

    @JsonProperty("otherId")
    public void setOtherId(List<XOtherOrganizationIdType> otherId) {
        this.otherId = otherId;
    }

    @Override public String toString()
    {
        return "XOtherOrganizationIdListType{" + "otherId=" + otherId + '}';
    }
}
