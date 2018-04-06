
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "@refId",
        "name",
        "localId",
        "stateProvinceId",
        "otherIds",
        "sex",
        "email",
        "primaryAssignment",
        "otherAssignments"
})
@JsonRootName(value = "xStaff")
public class XStaffType {

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    private String refId;
    @JsonProperty("name")
    private XPersonNameType name;
    @JsonProperty("localId")
    private String localId;
    @JsonProperty("stateProvinceId")
    private String stateProvinceId;
    @JsonProperty("otherIds")
    private XOtherPersonIdListType otherIds;
    @JsonProperty("appProvisioningInfo")
    private XAppProvisioningInfoType appProvisioningInfo;
    @JsonProperty("sex")
    private String sex;
    @JsonProperty("email")
    private XEmailType email;
    @JsonProperty("primaryAssignment")
    private XStaffPersonAssignmentType primaryAssignment;
    @JsonProperty("otherAssignments")
    private XStaffPersonAssignmentListType otherAssignments;

    public XStaffType() {
    }

    public XStaffType(String refId, XPersonNameType name, String localId, String stateProvinceId, XOtherPersonIdListType otherIds, XAppProvisioningInfoType appProvisioningInfo, String sex, XEmailType email, XStaffPersonAssignmentType primaryAssignment, XStaffPersonAssignmentListType otherAssignments) {
        super();
        this.refId = refId;
        this.name = name;
        this.localId = localId;
        this.stateProvinceId = stateProvinceId;
        this.otherIds = otherIds;
        this.appProvisioningInfo = appProvisioningInfo;
        this.sex = sex;
        this.email = email;
        this.primaryAssignment = primaryAssignment;
        this.otherAssignments = otherAssignments;
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

    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("email")
    public XEmailType getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(XEmailType email) {
        this.email = email;
    }

    @JsonProperty("primaryAssignment")
    public XStaffPersonAssignmentType getPrimaryAssignment() {
        return primaryAssignment;
    }

    @JsonProperty("primaryAssignment")
    public void setPrimaryAssignment(XStaffPersonAssignmentType primaryAssignment) {
        this.primaryAssignment = primaryAssignment;
    }

    @JsonProperty("otherAssignments")
    public XStaffPersonAssignmentListType getOtherAssignments() {
        return otherAssignments;
    }

    @JsonProperty("otherAssignments")
    public void setOtherAssignments(XStaffPersonAssignmentListType otherAssignments) {
        this.otherAssignments = otherAssignments;
    }

    @Override public String toString()
    {
        return "XStaffType{" + "refId='" + refId + '\'' + ", name=" + name + ", localId='" + localId + '\'' + ", stateProvinceId='" + stateProvinceId + '\'' + ", otherIds=" + otherIds + ", appProvisioningInfo=" + appProvisioningInfo + ", sex='" + sex + '\'' + ", email=" + email
                + ", primaryAssignment=" + primaryAssignment + ", otherAssignments=" + otherAssignments + '}';
    }
}
