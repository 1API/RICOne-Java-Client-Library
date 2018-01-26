
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@refId",
        "leaRefId",
        "schoolName",
        "address",
        "localId",
        "stateProvinceId",
        "otherIds",
        "gradeLevels",
        "phoneNumber",
        "otherPhoneNumbers"
})
public class XSchoolType {

    @JsonProperty("@refId")
    private String refId;
    @JsonProperty("leaRefId")
    private String leaRefId;
    @JsonProperty("schoolName")
    private String schoolName;
    @JsonProperty("address")
    private XOrganizationAddressType address;
    @JsonProperty("localId")
    private String localId;
    @JsonProperty("stateProvinceId")
    private String stateProvinceId;
    @JsonProperty("otherIds")
    private XOtherOrganizationIdListType otherIds;
    @JsonProperty("gradeLevels")
    private XGradeLevelListType gradeLevels;
    @JsonProperty("phoneNumber")
    private XTelephoneType phoneNumber;
    @JsonProperty("otherPhoneNumbers")
    private XTelephoneListType otherPhoneNumbers;

    public XSchoolType() {
    }

    public XSchoolType(String refId, String leaRefId, String schoolName, XOrganizationAddressType address, String localId, String stateProvinceId, XOtherOrganizationIdListType otherIds, XGradeLevelListType gradeLevels, XTelephoneType phoneNumber, XTelephoneListType otherPhoneNumbers) {
        super();
        this.refId = refId;
        this.leaRefId = leaRefId;
        this.schoolName = schoolName;
        this.address = address;
        this.localId = localId;
        this.stateProvinceId = stateProvinceId;
        this.otherIds = otherIds;
        this.gradeLevels = gradeLevels;
        this.phoneNumber = phoneNumber;
        this.otherPhoneNumbers = otherPhoneNumbers;
    }

    @JsonProperty("@refId")
    public String getRefId() {
        return refId;
    }

    @JsonProperty("@refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    @JsonProperty("leaRefId")
    public String getLeaRefId() {
        return leaRefId;
    }

    @JsonProperty("leaRefId")
    public void setLeaRefId(String leaRefId) {
        this.leaRefId = leaRefId;
    }

    @JsonProperty("schoolName")
    public String getSchoolName() {
        return schoolName;
    }

    @JsonProperty("schoolName")
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @JsonProperty("address")
    public XOrganizationAddressType getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(XOrganizationAddressType address) {
        this.address = address;
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
    public XOtherOrganizationIdListType getOtherIds() {
        return otherIds;
    }

    @JsonProperty("otherIds")
    public void setOtherIds(XOtherOrganizationIdListType otherIds) {
        this.otherIds = otherIds;
    }

    @JsonProperty("gradeLevels")
    public XGradeLevelListType getGradeLevels() {
        return gradeLevels;
    }

    @JsonProperty("gradeLevels")
    public void setGradeLevels(XGradeLevelListType gradeLevels) {
        this.gradeLevels = gradeLevels;
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

}
