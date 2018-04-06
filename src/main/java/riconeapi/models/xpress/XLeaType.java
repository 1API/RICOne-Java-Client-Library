package riconeapi.models.xpress;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "@refId",
        "localId",
        "stateProvinceId",
        "ncesId",
        "leaName",
        "address",
        "phoneNumber",
        "otherPhoneNumbers"
})
@JsonRootName(value = "xLea")
public class XLeaType
{
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    private String refId;
    @JsonProperty("localId")
    private String localId;
    @JsonProperty("leaRefId")
    private String leaRefId;
    @JsonProperty("stateProvinceId")
    private String stateProvinceId;
    @JsonProperty("ncesId")
    private String ncesId;
    @JsonProperty("leaName")
    private String leaName;
    @JsonProperty("address")
    private XOrganizationAddressType address;
    @JsonProperty("phoneNumber")
    private XTelephoneType phoneNumber;
    @JsonProperty("otherPhoneNumbers")
    private XTelephoneListType otherPhoneNumbers;

    public XLeaType() {
    }

    public XLeaType(String refId, String localId, String leaRefId, String stateProvinceId, String ncesId, String leaName, XOrganizationAddressType address, XTelephoneType phoneNumber, XTelephoneListType otherPhoneNumbers) {
        super();
        this.refId = refId;
        this.localId = localId;
        this.leaRefId = leaRefId;
        this.stateProvinceId = stateProvinceId;
        this.ncesId = ncesId;
        this.leaName = leaName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.otherPhoneNumbers = otherPhoneNumbers;
    }

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    public String getRefId() {
        return refId;
    }

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    public void setRefId(String refId) {
        this.refId = refId;
    }

    @JsonProperty("localId")
    public String getLocalId() {
        return localId;
    }

    @JsonProperty("localId")
    public void setLocalId(String localId) {
        this.localId = localId;
    }

    @JsonProperty("leaRefId")
    public String getLeaRefId() {
        return leaRefId;
    }

    @JsonProperty("leaRefId")
    public void setLeaRefId(String leaRefId) {
        this.leaRefId = leaRefId;
    }

    @JsonProperty("stateProvinceId")
    public String getStateProvinceId() {
        return stateProvinceId;
    }

    @JsonProperty("stateProvinceId")
    public void setStateProvinceId(String stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    @JsonProperty("ncesId")
    public String getNcesId() {
        return ncesId;
    }

    @JsonProperty("ncesId")
    public void setNcesId(String ncesId) {
        this.ncesId = ncesId;
    }

    @JsonProperty("leaName")
    public String getLeaName() {
        return leaName;
    }

    @JsonProperty("leaName")
    public void setLeaName(String leaName) {
        this.leaName = leaName;
    }

    @JsonProperty("address")
    public XOrganizationAddressType getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(XOrganizationAddressType address) {
        this.address = address;
    }

    @JsonProperty("phoneNumber")
    public XTelephoneType getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(XTelephoneType phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("otherPhoneNumbers")
    public XTelephoneListType getOtherPhoneNumbers() {
        return otherPhoneNumbers;
    }

    @JsonProperty("otherPhoneNumbers")
    public void setOtherPhoneNumbers(XTelephoneListType otherPhoneNumbers) {
        this.otherPhoneNumbers = otherPhoneNumbers;
    }

    @Override public String toString()
    {
        return "XLeaType{" + "refId='" + refId + '\'' + ", localId='" + localId + '\'' + ", leaRefId='" + leaRefId + '\'' + ", stateProvinceId='" + stateProvinceId + '\'' + ", ncesId='" + ncesId + '\'' + ", leaName='" + leaName + '\'' + ", address=" + address + ", phoneNumber=" + phoneNumber
                + ", otherPhoneNumbers=" + otherPhoneNumbers + '}';
    }
}