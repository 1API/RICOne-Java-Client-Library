
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
        "otherId"
})
public class XOtherPersonIdListType {

    @JsonProperty("otherId")
    private List<XOtherPersonIdType> otherId = new ArrayList<>();

    public XOtherPersonIdListType() {
    }

    public XOtherPersonIdListType(List<XOtherPersonIdType> otherId) {
        super();
        this.otherId = otherId;
    }

    @JsonProperty("otherId")
    public List<XOtherPersonIdType> getOtherId() {
        return otherId;
    }

    @JsonProperty("otherId")
    public void setOtherId(List<XOtherPersonIdType> otherId) {
        this.otherId = otherId;
    }

    @Override public String toString()
    {
        return "XOtherPersonIdListType{" + "otherId=" + otherId + '}';
    }
}
