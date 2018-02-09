
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "prefix",
        "familyName",
        "givenName",
        "middleName",
        "suffix"
})
public class XPersonNameType {

    @JsonProperty("type")
    private String type;
    @JsonProperty("prefix")
    private String prefix;
    @JsonProperty("familyName")
    private String familyName;
    @JsonProperty("givenName")
    private String givenName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("suffix")
    private String suffix;

    public XPersonNameType() {
    }

    public XPersonNameType(String type, String prefix, String familyName, String givenName, String middleName, String suffix) {
        super();
        this.type = type;
        this.prefix = prefix;
        this.familyName = familyName;
        this.givenName = givenName;
        this.middleName = middleName;
        this.suffix = suffix;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonProperty("givenName")
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty("givenName")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override public String toString()
    {
        return "XPersonNameType{" + "type='" + type + '\'' + ", prefix='" + prefix + '\'' + ", familyName='" + familyName + '\'' + ", givenName='" + givenName + '\'' + ", middleName='" + middleName + '\'' + ", suffix='" + suffix + '\'' + '}';
    }
}
