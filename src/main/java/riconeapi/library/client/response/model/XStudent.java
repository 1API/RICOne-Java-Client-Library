package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import riconeapi.library.client.common.Model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xStudentType complex type.</p>
 * <p>xStudent is a composite object that provides a view of the most commonly used core data elements for students, and references to important associated objects like contacts. The refId of a xStudent object coincides with the refId of a corresponding student object.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@refId", "name", "otherNames", "localId", "stateProvinceId", "otherIds", "address", "otherAddresses", "phoneNumber", "otherPhoneNumbers", "email", "otherEmails", "demographics", "enrollment", "otherEnrollments", "academicSummary", "studentContacts", "languages", "metadata"})
@JsonRootName(value = "xStudent")
@JacksonXmlRootElement(localName = "xStudent", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XStudent extends Model {
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true, namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlAttribute(name = "refId")
    private String refId;

    @JsonProperty("name")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Name name;

    @JsonProperty("otherNames")
    @JacksonXmlProperty(localName = "otherNames", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private OtherNames otherNames;

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

    @JsonProperty("demographics")
    @JacksonXmlProperty(localName = "demographics", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Demographics demographics;

    @JsonProperty("enrollment")
    @JacksonXmlProperty(localName = "enrollment", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Enrollment enrollment;

    @JsonProperty("otherEnrollments")
    @JacksonXmlProperty(localName = "otherEnrollments", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private OtherEnrollments otherEnrollments;

    @JsonProperty("academicSummary")
    @JacksonXmlProperty(localName = "academicSummary", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private AcademicSummary academicSummary;

    @JsonProperty("studentContacts")
    @JacksonXmlProperty(localName = "studentContacts", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private StudentContacts studentContacts;

    @JsonProperty("languages")
    @JacksonXmlProperty(localName = "languages", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Languages languages;

    @JsonProperty("appProvisioningInfo")
    @JacksonXmlProperty(localName = "appProvisioningInfo", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private AppProvisioningInfo appProvisioningInfo;

    @JsonProperty("metadata")
    @JacksonXmlProperty(localName = "metadata", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Metadata metadata;

    public XStudent() { }

    public XStudent(String refId, Name name, OtherNames otherNames, String localId, String stateProvinceId, OtherIds otherIds, Address address, OtherAddresses otherAddresses, PhoneNumber phoneNumber, OtherPhoneNumbers otherPhoneNumbers, Email email, OtherEmails otherEmails, Demographics demographics, Enrollment enrollment, OtherEnrollments otherEnrollments, AcademicSummary academicSummary, StudentContacts studentContacts, Languages languages, Metadata metadata) {
        this.refId = refId;
        this.name = name;
        this.otherNames = otherNames;
        this.localId = localId;
        this.stateProvinceId = stateProvinceId;
        this.otherIds = otherIds;
        this.address = address;
        this.otherAddresses = otherAddresses;
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
        this.metadata = metadata;
    }

    public XStudent(String refId, AppProvisioningInfo appProvisioningInfo) {
        super();
        this.refId = refId;
        this.appProvisioningInfo = appProvisioningInfo;
    }

    /**
     * <p>Gets the value of the refId property.</p>
     * <p>The refid to which this student applies.</p>
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
     * <p>The refid to which this student applies.</p>
     *
     * @param refId allowed object is {@link String }
     */
    @JsonProperty("@refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>Gets the value of the name property.</p>
     * <p>Name of Student.</p>
     *
     * @return possible object is {@link Name }
     */
    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    /**
     * <p>Sets the value of the name property.</p>
     * <p>Name of Student.</p>
     *
     * @param name allowed object is {@link Name }
     */
    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * <p>Gets the value of the otherNames property.</p>
     * <p>Other names for the student.</p>
     *
     * @return possible object is {@link OtherNames }
     */
    @JsonProperty("otherNames")
    public OtherNames getOtherNames() {
        return otherNames;
    }

    /**
     * <p>Sets the value of the otherNames property.</p>
     * <p>Other names for the student.</p>
     *
     * @param otherNames allowed object is {@link OtherNames }
     */
    @JsonProperty("otherNames")
    public void setOtherNames(OtherNames otherNames) {
        this.otherNames = otherNames;
    }

    /**
     * <p>Gets the value of the localId property.</p>
     * <p>A unique number or alphanumeric code assigned to a student by a district or LEA.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("localId")
    public String getLocalId() {
        return localId;
    }

    /**
     * <p>Sets the value of the localId property.</p>
     * <p>A unique number or alphanumeric code assigned to a student by a district or LEA.</p>
     *
     * @param localId allowed object is {@link String }
     */
    @JsonProperty("localId")
    public void setLocalId(String localId) {
        this.localId = localId;
    }

    /**
     * <p>Gets the value of the stateProvinceId property.</p>
     * <p>A unique number or alphanumeric code assigned to a student by a state.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("stateProvinceId")
    public String getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * <p>Sets the value of the stateProvinceId property.</p>
     * <p>A unique number or alphanumeric code assigned to a student by a state.</p>
     *
     * @param stateProvinceId allowed object is {@link String }
     */
    @JsonProperty("stateProvinceId")
    public void setStateProvinceId(String stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    /**
     * <p>Gets the value of the otherIds property.</p>
     * <p>Other Ids for the student.</p>
     *
     * @return possible object is {@link OtherIds }
     */
    @JsonProperty("otherIds")
    public OtherIds getOtherIds() {
        return otherIds;
    }

    /**
     * <p>Sets the value of the otherIds property.</p>
     * <p>Other Ids for the student.</p>
     *
     * @param otherIds allowed object is {@link OtherIds }
     */
    @JsonProperty("otherIds")
    public void setOtherIds(OtherIds otherIds) {
        this.otherIds = otherIds;
    }

    /**
     * <p>Gets the value of the address property.</p>
     * <p>Address of the student.</p>
     *
     * @return possible object is {@link Address }
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * <p>Sets the value of the address property.</p>
     * <p>Address of the student.</p>
     *
     * @param address allowed object is {@link Address }
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * <p>Gets the value of the otherAddresses property.</p>
     * <p>Other addresses for the student.</p>
     *
     * @return possible object is {@link OtherAddresses }
     */
    @JsonProperty("otherAddresses")
    public OtherAddresses getOtherAddresses() {
        return otherAddresses;
    }

    /**
     * <p>Sets the value of the otherAddresses property.</p>
     * <p>Other addresses for the student.</p>
     *
     * @param otherAddresses allowed object is {@link OtherAddresses }
     */
    @JsonProperty("otherAddresses")
    public void setOtherAddresses(OtherAddresses otherAddresses) {
        this.otherAddresses = otherAddresses;
    }

    /**
     * <p>Gets the value of the phoneNumber property.</p>
     * <p>Phone number of the student.</p>
     *
     * @return possible object is {@link PhoneNumber }
     */
    @JsonProperty("phoneNumber")
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>Sets the value of the phoneNumber property.</p>
     * <p>Phone number of the student.</p>
     *
     * @param phoneNumber allowed object is {@link PhoneNumber }
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>Gets the value of the otherPhoneNumbers property.</p>
     * <p>Other phone numbers for the student.</p>
     *
     * @return possible object is {@link OtherPhoneNumbers }
     */
    @JsonProperty("otherPhoneNumbers")
    public OtherPhoneNumbers getOtherPhoneNumbers() {
        return otherPhoneNumbers;
    }

    /**
     * <p>Sets the value of the otherPhoneNumbers property.</p>
     * <p>Other phone numbers for the student.</p>
     *
     * @param otherPhoneNumbers allowed object is {@link OtherPhoneNumbers }
     */
    @JsonProperty("otherPhoneNumbers")
    public void setOtherPhoneNumbers(OtherPhoneNumbers otherPhoneNumbers) {
        this.otherPhoneNumbers = otherPhoneNumbers;
    }

    /**
     * <p>Gets the value of the email property.</p>
     * <p>Email of the student.</p>
     *
     * @return possible object is {@link Email }
     */
    @JsonProperty("email")
    public Email getEmail() {
        return email;
    }

    /**
     * <p>Sets the value of the email property.</p>
     * <p>Email of the student.</p>
     *
     * @param email allowed object is {@link Email }
     */
    @JsonProperty("email")
    public void setEmail(Email email) {
        this.email = email;
    }

    /**
     * <p>Gets the value of the otherEmails property.</p>
     * <p>Other emails for the student.</p>
     *
     * @return possible object is {@link OtherEmails }
     */
    @JsonProperty("otherEmails")
    public OtherEmails getOtherEmails() {
        return otherEmails;
    }

    /**
     * <p>Sets the value of the otherEmails property.</p>
     * <p>Other emails for the student.</p>
     *
     * @param otherEmails allowed object is {@link OtherEmails }
     */
    @JsonProperty("otherEmails")
    public void setOtherEmails(OtherEmails otherEmails) {
        this.otherEmails = otherEmails;
    }

    /**
     * <p>Gets the value of the demographics property.</p>
     * <p>Demographic information about the student.</p>
     *
     * @return possible object is {@link Demographics }
     */
    @JsonProperty("demographics")
    public Demographics getDemographics() {
        return demographics;
    }

    /**
     * <p>Sets the value of the demographics property.</p>
     * <p>Demographic information about the student.</p>
     *
     * @param demographics allowed object is {@link Demographics }
     */
    @JsonProperty("demographics")
    public void setDemographics(Demographics demographics) {
        this.demographics = demographics;
    }

    /**
     * <p>Gets the value of the enrollment property.</p>
     * <p>Current enrollment information for the student.</p>
     *
     * @return possible object is {@link Enrollment }
     */
    @JsonProperty("enrollment")
    public Enrollment getEnrollment() {
        return enrollment;
    }

    /**
     * <p>Sets the value of the enrollment property.</p>
     * <p>Current enrollment information for the student.</p>
     *
     * @param enrollment allowed object is {@link Enrollment }
     */
    @JsonProperty("enrollment")
    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    /**
     * <p>Gets the value of the otherEnrollments property.</p>
     * <p>Other enrollment information for the student.</p>
     *
     * @return possible object is {@link OtherEnrollments }
     */
    @JsonProperty("otherEnrollments")
    public OtherEnrollments getOtherEnrollments() {
        return otherEnrollments;
    }

    /**
     * <p>Sets the value of the otherEnrollments property.</p>
     * <p>Other enrollment information for the student.</p>
     *
     * @param otherEnrollments allowed object is {@link OtherEnrollments }
     */
    @JsonProperty("otherEnrollments")
    public void setOtherEnrollments(OtherEnrollments otherEnrollments) {
        this.otherEnrollments = otherEnrollments;
    }

    /**
     * <p>Gets the value of the academicSummary property.</p>
     * <p>Summary academic information for the student.</p>
     *
     * @return possible object is {@link AcademicSummary }
     */
    @JsonProperty("academicSummary")
    public AcademicSummary getAcademicSummary() {
        return academicSummary;
    }

    /**
     * <p>Sets the value of the academicSummary property.</p>
     * <p>Summary academic information for the student.</p>
     *
     * @param academicSummary allowed object is {@link AcademicSummary }
     */
    @JsonProperty("academicSummary")
    public void setAcademicSummary(AcademicSummary academicSummary) {
        this.academicSummary = academicSummary;
    }

    /**
     * <p>Gets the value of the studentContacts property.</p>
     * <p>Persons that may be contacted regarding the student.</p>
     *
     * @return possible object is {@link StudentContacts }
     */
    @JsonProperty("studentContacts")
    public StudentContacts getStudentContacts() {
        return studentContacts;
    }

    /**
     * <p>Sets the value of the studentContacts property.</p>
     * <p>Persons that may be contacted regarding the student.</p>
     *
     * @param studentContacts allowed object is {@link StudentContacts }
     */
    @JsonProperty("studentContacts")
    public void setStudentContacts(StudentContacts studentContacts) {
        this.studentContacts = studentContacts;
    }

    /**
     * <p>Gets the value of the languages property.</p>
     * <p>Languages of the student.</p>
     *
     * @return possible object is {@link Languages }
     */
    @JsonProperty("languages")
    public Languages getLanguages() {
        return languages;
    }

    /**
     * <p>Sets the value of the languages property.</p>
     * <p>Languages of the student.</p>
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
    public void setAppProvisioningInfo(AppProvisioningInfo appProvisioningInfo) { this.appProvisioningInfo = appProvisioningInfo; }

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
        return Stream.of(refId, name, otherNames, localId, stateProvinceId, otherIds, address, phoneNumber, otherPhoneNumbers, email, otherEmails, demographics, enrollment, otherEnrollments, academicSummary, studentContacts, languages, metadata).allMatch(Objects::isNull);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XStudent xStudent = (XStudent) o;
        return Objects.equals(refId, xStudent.refId) &&
            Objects.equals(name, xStudent.name) &&
            Objects.equals(otherNames, xStudent.otherNames) &&
            Objects.equals(localId, xStudent.localId) &&
            Objects.equals(stateProvinceId, xStudent.stateProvinceId) &&
            Objects.equals(otherIds, xStudent.otherIds) &&
            Objects.equals(address, xStudent.address) &&
            Objects.equals(otherAddresses, xStudent.otherAddresses) &&
            Objects.equals(phoneNumber, xStudent.phoneNumber) &&
            Objects.equals(otherPhoneNumbers, xStudent.otherPhoneNumbers) &&
            Objects.equals(email, xStudent.email) &&
            Objects.equals(otherEmails, xStudent.otherEmails) &&
            Objects.equals(demographics, xStudent.demographics) &&
            Objects.equals(enrollment, xStudent.enrollment) &&
            Objects.equals(otherEnrollments, xStudent.otherEnrollments) &&
            Objects.equals(academicSummary, xStudent.academicSummary) &&
            Objects.equals(studentContacts, xStudent.studentContacts) &&
            Objects.equals(languages, xStudent.languages) &&
            Objects.equals(appProvisioningInfo, xStudent.appProvisioningInfo) &&
            Objects.equals(metadata, xStudent.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refId, name, otherNames, localId, stateProvinceId, otherIds, address, otherAddresses, phoneNumber, otherPhoneNumbers, email, otherEmails, demographics, enrollment, otherEnrollments, academicSummary, studentContacts, languages, appProvisioningInfo, metadata);
    }

    @Override
    public String toString() {
        return "XStudent{" + "refId='" + refId + '\'' + ", name=" + name + ", otherNames=" + otherNames + ", localId='" + localId + '\'' + ", stateProvinceId='" + stateProvinceId + '\'' + ", otherIds=" + otherIds + ", address=" + address + ", phoneNumber=" + phoneNumber + ", otherPhoneNumbers=" + otherPhoneNumbers + ", email=" + email + ", otherEmails=" + otherEmails + ", demographics=" + demographics + ", enrollment=" + enrollment + ", otherEnrollments=" + otherEnrollments + ", academicSummary=" + academicSummary + ", studentContacts=" + studentContacts + ", languages=" + languages + ", metadata=" + metadata + '}';
    }

}