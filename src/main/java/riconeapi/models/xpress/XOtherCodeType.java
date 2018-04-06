
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "codesetName",
        "otherCodeValue"
})
public class XOtherCodeType {

    @JsonProperty("codesetName")
    private String codesetName;
    @JsonProperty("otherCodeValue")
    private String otherCodeValue;

    public XOtherCodeType() {
    }

    public XOtherCodeType(String codesetName, String otherCodeValue) {
        super();
        this.codesetName = codesetName;
        this.otherCodeValue = otherCodeValue;
    }

    @JsonProperty("codesetName")
    public String getCodesetName() {
        return codesetName;
    }

    @JsonProperty("codesetName")
    public void setCodesetName(String codesetName) {
        this.codesetName = codesetName;
    }

    @JsonProperty("otherCodeValue")
    public String getOtherCodeValue() {
        return otherCodeValue;
    }

    @JsonProperty("otherCodeValue")
    public void setOtherCodeValue(String otherCodeValue) {
        this.otherCodeValue = otherCodeValue;
    }

}
