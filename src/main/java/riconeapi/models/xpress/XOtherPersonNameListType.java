
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
        "name"
})
public class XOtherPersonNameListType {

    @JsonProperty("name")
    private List<XPersonNameType> name = new ArrayList<>();

    public XOtherPersonNameListType() {
    }

    public XOtherPersonNameListType(List<XPersonNameType> name) {
        super();
        this.name = name;
    }

    @JsonProperty("name")
    public List<XPersonNameType> getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(List<XPersonNameType> name) {
        this.name = name;
    }

}
