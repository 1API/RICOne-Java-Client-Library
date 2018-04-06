
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "type",
        "code"
})
public class XLanguageType {

    @JsonProperty("type")
    private String type;
    @JsonProperty("code")
    private String code;

    public XLanguageType() {
    }

    public XLanguageType(String type, String code) {
        super();
        this.type = type;
        this.code = code;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @Override public String toString()
    {
        return "XLanguageType{" + "type='" + type + '\'' + ", code='" + code + '\'' + '}';
    }
}
