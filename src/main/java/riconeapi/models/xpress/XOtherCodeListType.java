
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
        "code",
        "otherCode"
})
public class XOtherCodeListType {

    @JsonProperty("code")
    private String code;
    @JsonProperty("otherCode")
    private List<XOtherCodeType> otherCode = new ArrayList<>();


    public XOtherCodeListType() {
    }

    public XOtherCodeListType(String code, List<XOtherCodeType> otherCode) {
        super();
        this.code = code;
        this.otherCode = otherCode;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("otherCode")
    public List<XOtherCodeType> getOtherCode() {
        return otherCode;
    }

    @JsonProperty("otherCode")
    public void setOtherCode(List<XOtherCodeType> otherCode) {
        this.otherCode = otherCode;
    }

    @Override public String toString()
    {
        return "XOtherCodeListType{" + "code='" + code + '\'' + ", otherCode=" + otherCode + '}';
    }
}
