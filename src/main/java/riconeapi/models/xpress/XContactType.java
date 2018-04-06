
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "@refId",
        "name",
        "otherNames",
        "localId",
        "otherIds",
        "appProvisioningInfo",
        "address",
        "phoneNumber",
        "otherPhoneNumbers",
        "email",
        "otherEmails",
        "sex",
        "employerType",
        "relationships"
})
@JsonRootName(value = "xContact")
public class XContactType {

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    private String refId;
    @JsonProperty("name")
    private XPersonNameType name;
    @JsonProperty("otherNames")
    private XOtherPersonNameListType otherNames;
    @JsonProperty("localId")
    private String localId;
    @JsonProperty("otherIds")
    private XOtherPersonIdListType otherIds;
    @JsonProperty("appProvisioningInfo")
    private XAppProvisioningInfoType appProvisioningInfo;
    @JsonProperty("address")
    private XPersonAddressType address;
    @JsonProperty("phoneNumber")
    private XTelephoneType phoneNumber;
    @JsonProperty("otherPhoneNumbers")
    private XTelephoneListType otherPhoneNumbers;
    @JsonProperty("email")
    private XEmailType email;
    @JsonProperty("otherEmails")
    private XEmailListType otherEmails;
    @JsonProperty("sex")
    private String sex;
    @JsonProperty("employerType")
    private String employerType;
    @JsonProperty("relationships")
    private XContactStudentRelationshipListType relationships;

    public XContactType() {
    }

    public XContactType(String refId, XPersonNameType name, XOtherPersonNameListType otherNames, String localId, XOtherPersonIdListType otherIds, XAppProvisioningInfoType appProvisioningInfo, XPersonAddressType address, XTelephoneType phoneNumber, XTelephoneListType otherPhoneNumbers, XEmailType email, XEmailListType otherEmails, String sex, String employerType, XContactStudentRelationshipListType relationships) {
        super();
        this.refId = refId;
        this.name = name;
        this.otherNames = otherNames;
        this.localId = localId;
        this.otherIds = otherIds;
        this.appProvisioningInfo = appProvisioningInfo;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.otherPhoneNumbers = otherPhoneNumbers;
        this.email = email;
        this.otherEmails = otherEmails;
        this.sex = sex;
        this.employerType = employerType;
        this.relationships = relationships;
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

    @JsonProperty("name")
    public XPersonNameType getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(XPersonNameType name) {
        this.name = name;
    }

    @JsonProperty("otherNames")
    public XOtherPersonNameListType getOtherNames() {
        return otherNames;
    }

    @JsonProperty("otherNames")
    public void setOtherNames(XOtherPersonNameListType otherNames) {
        this.otherNames = otherNames;
    }

    @JsonProperty("localId")
    public String getLocalId() {
        return localId;
    }

    @JsonProperty("localId")
    public void setLocalId(String localId) {
        this.localId = localId;
    }

    @JsonProperty("otherIds")
    public XOtherPersonIdListType getOtherIds() {
        return otherIds;
    }

    @JsonProperty("otherIds")
    public void setOtherIds(XOtherPersonIdListType otherIds) {
        this.otherIds = otherIds;
    }

    @JsonProperty("appProvisioningInfo")
    public XAppProvisioningInfoType getAppProvisioningInfo() {
        return appProvisioningInfo;
    }

    @JsonProperty("appProvisioningInfo")
    public void setAppProvisioningInfo(XAppProvisioningInfoType appProvisioningInfo) {
        this.appProvisioningInfo = appProvisioningInfo;
    }

    @JsonProperty("address")
    public XPersonAddressType getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(XPersonAddressType address) {
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

    @JsonProperty("email")
    public XEmailType getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(XEmailType email) {
        this.email = email;
    }

    @JsonProperty("otherEmails")
    public XEmailListType getOtherEmails() {
        return otherEmails;
    }

    @JsonProperty("otherEmails")
    public void setOtherEmails(XEmailListType otherEmails) {
        this.otherEmails = otherEmails;
    }

    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("employerType")
    public String getEmployerType() {
        return employerType;
    }

    @JsonProperty("employerType")
    public void setEmployerType(String employerType) {
        this.employerType = employerType;
    }

    @JsonProperty("relationships")
    public XContactStudentRelationshipListType getRelationships() {
        return relationships;
    }

    @JsonProperty("relationships")
    public void setRelationships(XContactStudentRelationshipListType relationships) {
        this.relationships = relationships;
    }

    @Override public String toString()
    {
        return "XContactType{" + "refId='" + refId + '\'' + ", name=" + name + ", otherNames=" + otherNames + ", localId='" + localId + '\'' + ", otherIds=" + otherIds + ", appProvisioningInfo=" + appProvisioningInfo + ", address=" + address + ", phoneNumber=" + phoneNumber + ", otherPhoneNumbers="
                + otherPhoneNumbers + ", email=" + email + ", otherEmails=" + otherEmails + ", sex='" + sex + '\'' + ", employerType='" + employerType + '\'' + ", relationships=" + relationships + '}';
    }
}