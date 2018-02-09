
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "emailType",
        "emailAddress"
})
public class XEmailType {

    @JsonProperty("emailType")
    private String emailType;
    @JsonProperty("emailAddress")
    private String emailAddress;

    public XEmailType() {
    }

    public XEmailType(String emailType, String emailAddress) {
        super();
        this.emailType = emailType;
        this.emailAddress = emailAddress;
    }

    @JsonProperty("emailType")
    public String getEmailType() {
        return emailType;
    }

    @JsonProperty("emailType")
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override public String toString()
    {
        return "XEmailType{" + "emailType='" + emailType + '\'' + ", emailAddress='" + emailAddress + '\'' + '}';
    }
}
