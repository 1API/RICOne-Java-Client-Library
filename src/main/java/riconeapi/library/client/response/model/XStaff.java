package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import riconeapi.library.client.common.Model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xStaffType complex type.</p>
 * <p>xStaff is a composite object that provides a view of the most commonly used core data elements for teachers and non-teaching staff. The refId of a xStaff object coincides with the refId of a corresponding staff object.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@refId", "name", "sex", "localId", "stateProvinceId", "otherIds", "address", "otherAddresses", "phoneNumber", "otherPhoneNumbers", "email", "otherEmails", "primaryAssignment", "otherAssignments", "languages", "metadata"})
@JsonRootName(value = "xStaff")
@JacksonXmlRootElement(localName = "xStaff", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XStaff extends Model {
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true, namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlAttribute(name = "refId")
    private String refId;

    @JsonProperty("name")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Name name;

    @JsonProperty("sex")
    @JacksonXmlProperty(localName = "sex", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String sex;

    @JsonProperty("localId")
    @JacksonXmlProperty(localName = "localId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String localId;

    @JsonProperty("stateProvinceId")
    @JacksonXmlProperty(localName = "stateProvinceId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String stateProvinceId;

    @JsonProperty("otherIds")
    @JacksonXmlProperty(localName = "otherIds", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private OtherIds otherIds;

    @JsonProperty("address")
    @JacksonXmlProperty(localName = "address", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Address address;

    @JsonProperty("otherAddresses")
    @JacksonXmlProperty(localName = "otherAddresses", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private OtherAddresses otherAddresses;

    @JsonProperty("phoneNumber")
    @JacksonXmlProperty(localName = "phoneNumber", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private PhoneNumber phoneNumber;

    @JsonProperty("otherPhoneNumbers")
    @JacksonXmlProperty(localName = "otherPhoneNumbers", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private OtherPhoneNumbers otherPhoneNumbers;

    @JsonProperty("email")
    @JacksonXmlProperty(localName = "email", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Email email;

    @JsonProperty("otherEmails")
    @JacksonXmlProperty(localName = "otherEmails", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private OtherEmails otherEmails;

    @JsonProperty("primaryAssignment")
    @JacksonXmlProperty(localName = "primaryAssignment", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private PrimaryAssignment primaryAssignment;

    @JsonProperty("otherAssignments")
    @JacksonXmlProperty(localName = "otherAssignments", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private OtherAssignments otherAssignments;

    @JsonProperty("languages")
    @JacksonXmlProperty(localName = "languages", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Languages languages;

    @JsonProperty("appProvisioningInfo")
    @JacksonXmlProperty(localName = "appProvisioningInfo", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private AppProvisioningInfo appProvisioningInfo;

    @JsonProperty("metadata")
    @JacksonXmlProperty(localName = "metadata", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Metadata metadata;

    public XStaff() { }

    public XStaff(String refId, Name name, String sex, String localId, String stateProvinceId, OtherIds otherIds, Address address, OtherAddresses otherAddresses, PhoneNumber phoneNumber, OtherPhoneNumbers otherPhoneNumbers, Email email, OtherEmails otherEmails, PrimaryAssignment primaryAssignment, OtherAssignments otherAssignments, Languages languages, Metadata metadata) {
        this.refId = refId;
        this.name = name;
        this.sex = sex;
        this.localId = localId;
        this.stateProvinceId = stateProvinceId;
        this.otherIds = otherIds;
        this.address = address;
        this.otherAddresses = otherAddresses;
        this.phoneNumber = phoneNumber;
        this.otherPhoneNumbers = otherPhoneNumbers;
        this.email = email;
        this.otherEmails = otherEmails;
        this.primaryAssignment = primaryAssignment;
        this.otherAssignments = otherAssignments;
        this.languages = languages;
        this.metadata = metadata;
    }

    public XStaff(String refId, AppProvisioningInfo appProvisioningInfo) {
        super();
        this.refId = refId;
        this.appProvisioningInfo = appProvisioningInfo;
    }

    /**
     * <p>Gets the value of the refId property.</p>
     * <p>The refid to which this staff applies.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    @XmlAttribute(name = "refId")
    public String getRefId() {
        return refId;
    }

    /**
     * <p>Sets the value of the refId property.</p>
     * <p>The refid to which this staff applies.</p>
     *
     * @param refId allowed object is {@link String }
     */
    @JsonProperty("@refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>Gets the value of the name property.</p>
     * <p>Name of the staff person.</p>
     *
     * @return possible object is {@link Name }
     */
    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    /**
     * <p>Sets the value of the name property.</p>
     * <p>Name of the staff person.</p>
     *
     * @param name allowed object is {@link Name }
     */
    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * <p>Gets the value of the sex property.</p>
     * <p>The concept describing the biological traits that distinguish the males and females of a species.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    /**
     * <p>Sets the value of the sex property.</p>
     * <p>The concept describing the biological traits that distinguish the males and females of a species.</p>
     *
     * @param sex allowed object is {@link String }
     */
    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * <p>Gets the value of the localId property.</p>
     * <p>A unique number or alphanumeric code assigned to a staff member by a district or LEA.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("localId")
    public String getLocalId() {
        return localId;
    }

    /**
     * <p>Sets the value of the localId property.</p>
     * <p>A unique number or alphanumeric code assigned to a staff member by a district or LEA.</p>
     *
     * @param localId allowed object is {@link String }
     */
    @JsonProperty("localId")
    public void setLocalId(String localId) {
        this.localId = localId;
    }

    /**
     * <p>Gets the value of the stateProvinceId property.</p>
     * <p>A unique number or alphanumeric code assigned to a staff member by a state.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("stateProvinceId")
    public String getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * <p>Sets the value of the stateProvinceId property.</p>
     * <p>A unique number or alphanumeric code assigned to a staff member by a state.</p>
     *
     * @param stateProvinceId allowed object is {@link String }
     */
    @JsonProperty("stateProvinceId")
    public void setStateProvinceId(String stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    /**
     * <p>Gets the value of the otherIds property.</p>
     * <p>Other Ids for the person.</p>
     *
     * @return possible object is {@link OtherIds }
     */
    @JsonProperty("otherIds")
    public OtherIds getOtherIds() {
        return otherIds;
    }

    /**
     * <p>Sets the value of the otherIds property.</p>
     * <p>Other Ids for the person.</p>
     *
     * @param otherIds allowed object is {@link OtherIds }
     */
    @JsonProperty("otherIds")
    public void setOtherIds(OtherIds otherIds) {
        this.otherIds = otherIds;
    }

    /**
     * <p>Gets the value of the address property.</p>
     * <p>Address of the staff.</p>
     *
     * @return possible object is {@link Address }
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * <p>Sets the value of the address property.</p>
     * <p>Address of the staff.</p>
     *
     * @param address allowed object is {@link Address }
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * <p>Gets the value of the otherAddresses property.</p>
     * <p>Other addresses for the staff.</p>
     *
     * @return possible object is {@link OtherAddresses }
     */
    @JsonProperty("otherAddresses")
    public OtherAddresses getOtherAddresses() {
        return otherAddresses;
    }

    /**
     * <p>Sets the value of the otherAddresses property.</p>
     * <p>Other addresses for the staff.</p>
     *
     * @param otherAddresses allowed object is {@link OtherAddresses }
     */
    @JsonProperty("otherAddresses")
    public void setOtherAddresses(OtherAddresses otherAddresses) {
        this.otherAddresses = otherAddresses;
    }

    /**
     * <p>Gets the value of the phoneNumber property.</p>
     * <p>Phone number of the staff.</p>
     *
     * @return possible object is {@link PhoneNumber }
     */
    @JsonProperty("phoneNumber")
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>Sets the value of the phoneNumber property.</p>
     * <p>Phone number of the staff.</p>
     *
     * @param phoneNumber allowed object is {@link PhoneNumber }
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>Gets the value of the otherPhoneNumbers property.</p>
     * <p>Other phone numbers for the staff.</p>
     *
     * @return possible object is {@link OtherPhoneNumbers }
     */
    @JsonProperty("otherPhoneNumbers")
    public OtherPhoneNumbers getOtherPhoneNumbers() {
        return otherPhoneNumbers;
    }

    /**
     * <p>Sets the value of the otherPhoneNumbers property.</p>
     * <p>Other phone numbers for the staff.</p>
     *
     * @param otherPhoneNumbers allowed object is {@link OtherPhoneNumbers }
     */
    @JsonProperty("otherPhoneNumbers")
    public void setOtherPhoneNumbers(OtherPhoneNumbers otherPhoneNumbers) {
        this.otherPhoneNumbers = otherPhoneNumbers;
    }

    /**
     * <p>Gets the value of the email property.</p>
     * <p>Email of the staff.</p>
     *
     * @return possible object is {@link Email }
     */
    @JsonProperty("email")
    public Email getEmail() {
        return email;
    }

    /**
     * <p>Sets the value of the email property.</p>
     * <p>Email of the staff.</p>
     *
     * @param email allowed object is {@link Email }
     */
    @JsonProperty("email")
    public void setEmail(Email email) {
        this.email = email;
    }

    /**
     * <p>Gets the value of the otherEmails property.</p>
     * <p>Other emails for the staff.</p>
     *
     * @return possible object is {@link OtherEmails }
     */
    @JsonProperty("otherEmails")
    public OtherEmails getOtherEmails() {
        return otherEmails;
    }

    /**
     * <p>Sets the value of the otherEmails property.</p>
     * <p>Other emails for the staff.</p>
     *
     * @param otherEmails allowed object is {@link OtherEmails }
     */
    @JsonProperty("otherEmails")
    public void setOtherEmails(OtherEmails otherEmails) {
        this.otherEmails = otherEmails;
    }

    /**
     * <p>Gets the value of the primaryAssignment property.</p>
     * <p>The primary district, school, and function to which the person is assigned.</p>
     *
     * @return possible object is {@link PrimaryAssignment }
     */
    @JsonProperty("primaryAssignment")
    public PrimaryAssignment getPrimaryAssignment() {
        return primaryAssignment;
    }

    /**
     * <p>Sets the value of the primaryAssignment property.</p>
     * <p>The primary district, school, and function to which the person is assigned.</p>
     *
     * @param primaryAssignment allowed object is {@link PrimaryAssignment }
     */
    @JsonProperty("primaryAssignment")
    public void setPrimaryAssignment(PrimaryAssignment primaryAssignment) {
        this.primaryAssignment = primaryAssignment;
    }

    /**
     * <p>Gets the value of the otherAssignments property.</p>
     * <p>Other locations and functions to which the person is assigned.</p>
     *
     * @return possible object is {@link OtherAssignments }
     */
    @JsonProperty("otherAssignments")
    public OtherAssignments getOtherAssignments() {
        return otherAssignments;
    }

    /**
     * <p>Sets the value of the otherAssignments property.</p>
     * <p>Other locations and functions to which the person is assigned.</p>
     *
     * @param otherAssignments allowed object is {@link OtherAssignments }
     */
    @JsonProperty("otherAssignments")
    public void setOtherAssignments(OtherAssignments otherAssignments) {
        this.otherAssignments = otherAssignments;
    }

    /**
     * <p>Gets the value of the languages property.</p>
     * <p>Languages of the staff.</p>
     *
     * @return possible object is {@link Languages }
     */
    @JsonProperty("languages")
    public Languages getLanguages() {
        return languages;
    }

    /**
     * <p>Sets the value of the languages property.</p>
     * <p>Languages of the staff.</p>
     *
     * @param languages allowed object is {@link Languages }
     */
    @JsonProperty("languages")
    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    /**
     * <p>Gets the value of the appProvisioningInfo property.</p>
     * <p>An object containing login information about the record.</p>
     *
     * @return possible object is {@link AppProvisioningInfo }
     */
    @JsonProperty("appProvisioningInfo")
    public AppProvisioningInfo getAppProvisioningInfo() {
        return appProvisioningInfo;
    }

    /**
     * <p>Sets the value of the appProvisioningInfo property.</p>
     * <p>An object containing login information about the record.</p>
     *
     * @param appProvisioningInfo allowed object is {@link AppProvisioningInfo }
     */
    @JsonProperty("appProvisioningInfo")
    public void setAppProvisioningInfo(AppProvisioningInfo appProvisioningInfo) {
        this.appProvisioningInfo = appProvisioningInfo;
    }

    /**
     * <p>Gets the value of the metadata property.</p>
     * <p>An object containing additional information about the record.</p>
     *
     * @return metadata allowed object is {@link Metadata }
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * <p>Sets the value of the metadata property.</p>
     * <p>An object containing additional information about the record.</p>
     *
     * @param metadata allowed object is {@link Metadata }
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonIgnore
    public boolean isEmpty() {
        return Stream.of(refId, name, localId, stateProvinceId, otherIds, appProvisioningInfo, sex, email, primaryAssignment, otherAssignments, languages, metadata).allMatch(Objects::isNull);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XStaff xStaff = (XStaff) o;
        return Objects.equals(refId, xStaff.refId) &&
            Objects.equals(name, xStaff.name) &&
            Objects.equals(sex, xStaff.sex) &&
            Objects.equals(localId, xStaff.localId) &&
            Objects.equals(stateProvinceId, xStaff.stateProvinceId) &&
            Objects.equals(otherIds, xStaff.otherIds) &&
            Objects.equals(address, xStaff.address) &&
            Objects.equals(otherAddresses, xStaff.otherAddresses) &&
            Objects.equals(phoneNumber, xStaff.phoneNumber) &&
            Objects.equals(otherPhoneNumbers, xStaff.otherPhoneNumbers) &&
            Objects.equals(email, xStaff.email) &&
            Objects.equals(otherEmails, xStaff.otherEmails) &&
            Objects.equals(primaryAssignment, xStaff.primaryAssignment) &&
            Objects.equals(otherAssignments, xStaff.otherAssignments) &&
            Objects.equals(languages, xStaff.languages) &&
            Objects.equals(appProvisioningInfo, xStaff.appProvisioningInfo) &&
            Objects.equals(metadata, xStaff.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refId, name, sex, localId, stateProvinceId, otherIds, address, otherAddresses, phoneNumber, otherPhoneNumbers, email, otherEmails, primaryAssignment, otherAssignments, languages, appProvisioningInfo, metadata);
    }

    @Override
    public String toString() {
        return "XStaff{" + "refId='" + refId + '\'' + ", name=" + name + ", sex='" + sex + '\'' + ", localId='" + localId + '\'' + ", stateProvinceId='" + stateProvinceId + '\'' + ", otherIds=" + otherIds + ", address=" + address + ", otherAddresses=" + otherAddresses + ", phoneNumber=" + phoneNumber + ", otherPhoneNumbers=" + otherPhoneNumbers + ", email=" + email + ", otherEmails=" + otherEmails + ", primaryAssignment=" + primaryAssignment + ", otherAssignments=" + otherAssignments + ", languages=" + languages + ", metadata=" + metadata + '}';
    }

}