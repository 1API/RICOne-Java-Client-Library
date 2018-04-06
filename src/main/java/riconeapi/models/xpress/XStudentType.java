
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
        "stateProvinceId",
        "otherIds",
        "appProvisioningInfo",
        "address",
        "phoneNumber",
        "otherPhoneNumbers",
        "email",
        "otherEmails",
        "demographics",
        "enrollment",
        "otherEnrollments",
        "academicSummary",
        "studentContacts",
        "languages"
})
@JsonRootName(value = "xStudent")
public class XStudentType {

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    private String refId;
    @JsonProperty("name")
    private XPersonNameType name;
    @JsonProperty("otherNames")
    private XOtherPersonNameListType otherNames;
    @JsonProperty("localId")
    private String localId;
    @JsonProperty("stateProvinceId")
    private String stateProvinceId;
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
    @JsonProperty("demographics")
    private XDemographicsType demographics;
    @JsonProperty("enrollment")
    private XEnrollmentType enrollment;
    @JsonProperty("otherEnrollments")
    private XEnrollmentListType otherEnrollments;
    @JsonProperty("academicSummary")
    private XAcademicSummaryType academicSummary;
    @JsonProperty("studentContacts")
    private XStudentContactListType studentContacts;
    @JsonProperty("languages")
    private XLanguageListType languages;

    public XStudentType() {
    }

    public XStudentType(String refId, XPersonNameType name, XOtherPersonNameListType otherNames, String localId, String stateProvinceId, XOtherPersonIdListType otherIds, XAppProvisioningInfoType appProvisioningInfo, XPersonAddressType address, XTelephoneType phoneNumber, XTelephoneListType otherPhoneNumbers, XEmailType email, XEmailListType otherEmails, XDemographicsType demographics, XEnrollmentType enrollment, XEnrollmentListType otherEnrollments, XAcademicSummaryType academicSummary, XStudentContactListType studentContacts, XLanguageListType languages) {
        super();
        this.refId = refId;
        this.name = name;
        this.otherNames = otherNames;
        this.localId = localId;
        this.stateProvinceId = stateProvinceId;
        this.otherIds = otherIds;
        this.appProvisioningInfo = appProvisioningInfo;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.otherPhoneNumbers = otherPhoneNumbers;
        this.email = email;
        this.otherEmails = otherEmails;
        this.demographics = demographics;
        this.enrollment = enrollment;
        this.otherEnrollments = otherEnrollments;
        this.academicSummary = academicSummary;
        this.studentContacts = studentContacts;
        this.languages = languages;
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

    @JsonProperty("stateProvinceId")
    public String getStateProvinceId() {
        return stateProvinceId;
    }

    @JsonProperty("stateProvinceId")
    public void setStateProvinceId(String stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
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
    public void setAppProvisioningInfo(XAppProvisioningInfoType value) {
        this.appProvisioningInfo = value;
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

    @JsonProperty("demographics")
    public XDemographicsType getDemographics() {
        return demographics;
    }

    @JsonProperty("demographics")
    public void setDemographics(XDemographicsType demographics) {
        this.demographics = demographics;
    }

    @JsonProperty("enrollment")
    public XEnrollmentType getEnrollment() {
        return enrollment;
    }

    @JsonProperty("enrollment")
    public void setEnrollment(XEnrollmentType enrollment) {
        this.enrollment = enrollment;
    }

    @JsonProperty("otherEnrollments")
    public XEnrollmentListType getOtherEnrollments() {
        return otherEnrollments;
    }

    @JsonProperty("otherEnrollments")
    public void setOtherEnrollments(XEnrollmentListType otherEnrollments) {
        this.otherEnrollments = otherEnrollments;
    }

    @JsonProperty("academicSummary")
    public XAcademicSummaryType getAcademicSummary() {
        return academicSummary;
    }

    @JsonProperty("academicSummary")
    public void setAcademicSummary(XAcademicSummaryType academicSummary) {
        this.academicSummary = academicSummary;
    }

    @JsonProperty("studentContacts")
    public XStudentContactListType getStudentContacts() {
        return studentContacts;
    }

    @JsonProperty("studentContacts")
    public void setStudentContacts(XStudentContactListType studentContacts) {
        this.studentContacts = studentContacts;
    }

    @JsonProperty("languages")
    public XLanguageListType getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(XLanguageListType languages) {
        this.languages = languages;
    }

    @Override public String toString()
    {
        return "XStudentType{" + "refId='" + refId + '\'' + ", name=" + name + ", otherNames=" + otherNames + ", localId='" + localId + '\'' + ", stateProvinceId='" + stateProvinceId + '\'' + ", otherIds=" + otherIds + ", appProvisioningInfo=" + appProvisioningInfo + ", address=" + address
                + ", phoneNumber=" + phoneNumber + ", otherPhoneNumbers=" + otherPhoneNumbers + ", email=" + email + ", otherEmails=" + otherEmails + ", demographics=" + demographics + ", enrollment=" + enrollment + ", otherEnrollments=" + otherEnrollments + ", academicSummary=" + academicSummary
                + ", studentContacts=" + studentContacts + ", languages=" + languages + '}';
    }
}
