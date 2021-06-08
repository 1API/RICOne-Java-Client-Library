package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xAppProvisioningInfoType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"loginId", "tempPassword", "tempPasswordExpiryDate"})
public class AppProvisioningInfo {
    @JsonProperty("loginId")
    @JacksonXmlProperty(localName = "loginId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String loginId;

    @JsonProperty("tempPassword")
    @JacksonXmlProperty(localName = "tempPassword", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String tempPassword;

    @JsonProperty("tempPasswordExpiryDate")
    @JacksonXmlProperty(localName = "tempPasswordExpiryDate", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String tempPasswordExpiryDate;

    public AppProvisioningInfo() {
    }

    public AppProvisioningInfo(String loginId, String tempPassword, String tempPasswordExpiryDate) {
        super();
        this.loginId = loginId;
        this.tempPassword = tempPassword;
        this.tempPasswordExpiryDate = tempPasswordExpiryDate;
    }

    /**
     * <p>Gets the value of the loginId property.</p>
     * <p>The username associated to a person.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("loginId")
    public String getLoginId() {
        return loginId;
    }

    /**
     * <p>Sets the value of the loginId property.</p>
     * <p>The username associated to a person.</p>
     *
     * @param loginId allowed object is {@link String }
     */
    @JsonProperty("loginId")
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * <p>Gets the value of the tempPassword property.</p>
     * <p>A temporary password defined by the district.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("tempPassword")
    public String getTempPassword() {
        return tempPassword;
    }

    /**
     * <p>Sets the value of the tempPassword property.</p>
     * <p>A temporary password defined by the district.</p>
     *
     * @param tempPassword allowed object is {@link String }
     */
    @JsonProperty("tempPassword")
    public void setTempPassword(String tempPassword) {
        this.tempPassword = tempPassword;
    }

    /**
     * <p>Gets the value of the tempPasswordExpiryDate property.</p>
     * <p>A date in which the temporary password is set to expire.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("tempPasswordExpiryDate")
    public String getTempPasswordExpiryDate() {
        return tempPasswordExpiryDate;
    }

    /**
     * <p>Sets the value of the tempPasswordExpiryDate property.</p>
     * <p>A date in which the temporary password is set to expire.</p>
     *
     * @param tempPasswordExpiryDate allowed object is {@link String }
     */
    @JsonProperty("tempPasswordExpiryDate")
    public void setTempPasswordExpiryDate(String tempPasswordExpiryDate) {
        this.tempPasswordExpiryDate = tempPasswordExpiryDate;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(loginId, tempPassword, tempPasswordExpiryDate).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "AppProvisioningInfo{" +
            "loginId='" + loginId + '\'' +
            ", tempPassword='" + tempPassword + '\'' +
            ", tempPasswordExpiryDate='" + tempPasswordExpiryDate + '\'' +
            '}';
    }
}