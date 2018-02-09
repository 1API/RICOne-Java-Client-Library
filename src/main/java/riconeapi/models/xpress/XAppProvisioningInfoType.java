
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.datatype.XMLGregorianCalendar;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "loginId",
        "tempPassword",
        "tempPasswordExpiryDate"
})
public class XAppProvisioningInfoType {

    @JsonProperty("loginId")
    private String loginId;
    @JsonProperty("tempPassword")
    private String tempPassword;
    @JsonProperty("tempPasswordExpiryDate")
    private XMLGregorianCalendar tempPasswordExpiryDate;

    public XAppProvisioningInfoType() {
    }

    public XAppProvisioningInfoType(String loginId, String tempPassword, XMLGregorianCalendar tempPasswordExpiryDate) {
        super();
        this.loginId = loginId;
        this.tempPassword = tempPassword;
        this.tempPasswordExpiryDate = tempPasswordExpiryDate;
    }

    @JsonProperty("loginId")
    public String getLoginId() {
        return loginId;
    }

    @JsonProperty("loginId")
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    @JsonProperty("tempPassword")
    public String getTempPassword() {
        return tempPassword;
    }

    @JsonProperty("tempPassword")
    public void setTempPassword(String tempPassword) {
        this.tempPassword = tempPassword;
    }

    @JsonProperty("tempPasswordExpiryDate")
    public XMLGregorianCalendar getTempPasswordExpiryDate() {
        return tempPasswordExpiryDate;
    }

    @JsonProperty("tempPasswordExpiryDate")
    public void setTempPasswordExpiryDate(XMLGregorianCalendar tempPasswordExpiryDate) {
        this.tempPasswordExpiryDate = tempPasswordExpiryDate;
    }

    @Override public String toString()
    {
        return "XAppProvisioningInfoType{" + "loginId='" + loginId + '\'' + ", tempPassword='" + tempPassword + '\'' + ", tempPasswordExpiryDate=" + tempPasswordExpiryDate + '}';
    }
}
