package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import riconeapi.library.client.common.Model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xContactType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@refId", "name", "otherNames", "localId", "otherIds", "address", "phoneNumber", "otherPhoneNumbers", "email", "otherEmails", "sex", "employerType", "relationships", "metadata"})
@JsonRootName(value = "xContact")
@JacksonXmlRootElement(localName = "xContact", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XContact extends Model {
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

    @JsonProperty("otherIds")
    @JacksonXmlProperty(localName = "otherIds", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private OtherIds otherIds;

    @JsonProperty("address")
    @JacksonXmlProperty(localName = "address", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Address address;

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

    @JsonProperty("sex")
    @JacksonXmlProperty(localName = "sex", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String sex;

    @JsonProperty("employerType")
    @JacksonXmlProperty(localName = "employerType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String employerType;

    @JsonProperty("relationships")
    @JacksonXmlProperty(localName = "relationships", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Relationships relationships;

    @JsonProperty("metadata")
    @JacksonXmlProperty(localName = "metadata", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Metadata metadata;

    public XContact() {
    }

    public XContact(String refId, Name name, OtherNames otherNames, String localId, OtherIds otherIds, Address address, PhoneNumber phoneNumber, OtherPhoneNumbers otherPhoneNumbers, Email email, OtherEmails otherEmails, String sex, String employerType, Relationships relationships, Metadata metadata) {
        this.refId = refId;
        this.name = name;
        this.otherNames = otherNames;
        this.localId = localId;
        this.otherIds = otherIds;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.otherPhoneNumbers = otherPhoneNumbers;
        this.email = email;
        this.otherEmails = otherEmails;
        this.sex = sex;
        this.employerType = employerType;
        this.relationships = relationships;
        this.metadata = metadata;
    }

    /**
     * <p>Gets the value of the refId property.</p>
     * <p>The refId for the contact.</p>
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
     * <p>The refId for the contact.</p>
     *
     * @param refId allowed object is {@link String }
     */
    @JsonProperty("@refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>Gets the value of the name property.</p>
     * <p>Name of the contact.</p>
     *
     * @return possible object is {@link Name }
     */
    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    /**
     * <p>Sets the value of the name property.</p>
     * <p>Name of the contact.</p>
     *
     * @param name allowed object is {@link Name }
     */
    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * <p>Gets the value of the otherNames property.</p>
     * <p>Other names of the contact.</p>
     *
     * @return possible object is {@link OtherNames }
     */
    @JsonProperty("otherNames")
    public OtherNames getOtherNames() {
        return otherNames;
    }

    /**
     * <p>Sets the value of the otherNames property.</p>
     * <p>Other names of the contact.</p>
     *
     * @param otherNames allowed object is {@link OtherNames }
     */
    @JsonProperty("otherNames")
    public void setOtherNames(OtherNames otherNames) {
        this.otherNames = otherNames;
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
     * Sets the value of the localId property.
     * <p>A unique number or alphanumeric code assigned to a staff member by a district or LEA.</p>
     *
     * @param localId allowed object is {@link String }
     */
    @JsonProperty("localId")
    public void setLocalId(String localId) {
        this.localId = localId;
    }

    /**
     * <p>Gets the value of the otherIds property.</p>
     * <p>Other Ids of the contact</p>
     *
     * @return possible object is {@link OtherIds }
     */
    @JsonProperty("otherIds")
    public OtherIds getOtherIds() {
        return otherIds;
    }

    /**
     * <p>Sets the value of the otherIds property.</p>
     * <p>Other Ids of the contact</p>
     *
     * @param otherIds allowed object is {@link OtherIds }
     */
    @JsonProperty("otherIds")
    public void setOtherIds(OtherIds otherIds) {
        this.otherIds = otherIds;
    }

    /**
     * <p>Gets the value of the address property.</p>
     * <p>Address of the contact.</p>
     *
     * @return possible object is {@link Address }
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * <p>Sets the value of the address property.</p>
     * <p>Address of the contact.</p>
     *
     * @param address allowed object is {@link Address }
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * <p>Gets the value of the phoneNumber property.</p>
     * <p>Phone number of the contact.</p>
     *
     * @return possible object is {@link PhoneNumber }
     */
    @JsonProperty("phoneNumber")
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>Sets the value of the phoneNumber property.</p>
     * <p>Phone number of the contact.</p>
     *
     * @param phoneNumber allowed object is {@link PhoneNumber }
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>Gets the value of the otherPhoneNumbers property.</p>
     * <p>Other phone numbers for the contact.</p>
     *
     * @return possible object is {@link OtherPhoneNumbers }
     */
    @JsonProperty("otherPhoneNumbers")
    public OtherPhoneNumbers getOtherPhoneNumbers() {
        return otherPhoneNumbers;
    }

    /**
     * <p>Sets the value of the otherPhoneNumbers property.</p>
     * <p>Other phone numbers for the contact.</p>
     *
     * @param otherPhoneNumbers allowed object is {@link OtherPhoneNumbers }
     */
    @JsonProperty("otherPhoneNumbers")
    public void setOtherPhoneNumbers(OtherPhoneNumbers otherPhoneNumbers) {
        this.otherPhoneNumbers = otherPhoneNumbers;
    }

    /**
     * <p>Gets the value of the email property.</p>
     * <p>The numbers, letters, and symbols used to identify an electronic mail (e-mail) user within the network to which the person or organization belongs.</p>
     *
     * @return possible object is {@link Email }
     */
    @JsonProperty("email")
    public Email getEmail() {
        return email;
    }

    /**
     * <p>Sets the value of the email property.</p>
     * <p>The numbers, letters, and symbols used to identify an electronic mail (e-mail) user within the network to which the person or organization belongs.</p>
     *
     * @param email allowed object is {@link Email }
     */
    @JsonProperty("email")
    public void setEmail(Email email) {
        this.email = email;
    }

    /**
     * <p>Gets the value of the otherEmails property.</p>
     * <p>Other emails of the contact</p>
     *
     * @return possible object is {@link OtherEmails }
     */
    @JsonProperty("otherEmails")
    public OtherEmails getOtherEmails() {
        return otherEmails;
    }

    /**
     * <p>Sets the value of the otherEmails property.</p>
     * <p>Other emails of the contact</p>
     *
     * @param otherEmails allowed object is {@link OtherEmails }
     */
    @JsonProperty("otherEmails")
    public void setOtherEmails(OtherEmails otherEmails) {
        this.otherEmails = otherEmails;
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
     * <p>Gets the value of the employerType property.</p>
     * <p>A code that defines the employer type.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("employerType")
    public String getEmployerType() {
        return employerType;
    }

    /**
     * <p>Sets the value of the employerType property.</p>
     * <p>A code that defines the employer type.</p>
     *
     * @param employerType allowed object is {@link String }
     */
    @JsonProperty("employerType")
    public void setEmployerType(String employerType) {
        this.employerType = employerType;
    }

    /**
     * <p>Gets the value of the relationships property.</p>
     * <p>Relationships that this contact has with the student.</p>
     *
     * @return possible object is {@link Relationships }
     */
    @JsonProperty("relationships")
    public Relationships getRelationships() {
        return relationships;
    }

    /**
     * <p>Sets the value of the relationships property.</p>
     * <p>Relationships that this contact has with the student.</p>
     *
     * @param relationships allowed object is {@link Relationship }
     */
    @JsonProperty("relationships")
    public void setRelationships(Relationships relationships) {
        this.relationships = relationships;
    }

    /**
     * <p>Gets the value of the metadata property.</p>
     * <p>An object containing additional information about the record.</p>
     *
     * @return possible object is {@link Metadata }
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
        return Stream.of(refId, name, otherNames, localId, otherIds, address, phoneNumber, otherPhoneNumbers, email, otherEmails, sex, employerType, relationships, metadata).allMatch(Objects::isNull);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XContact xContact = (XContact) o;
        return Objects.equals(refId, xContact.refId) &&
            Objects.equals(name, xContact.name) &&
            Objects.equals(otherNames, xContact.otherNames) &&
            Objects.equals(localId, xContact.localId) &&
            Objects.equals(otherIds, xContact.otherIds) &&
            Objects.equals(address, xContact.address) &&
            Objects.equals(phoneNumber, xContact.phoneNumber) &&
            Objects.equals(otherPhoneNumbers, xContact.otherPhoneNumbers) &&
            Objects.equals(email, xContact.email) &&
            Objects.equals(otherEmails, xContact.otherEmails) &&
            Objects.equals(sex, xContact.sex) &&
            Objects.equals(employerType, xContact.employerType) &&
            Objects.equals(relationships, xContact.relationships) &&
            Objects.equals(metadata, xContact.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refId, name, otherNames, localId, otherIds, address, phoneNumber, otherPhoneNumbers, email, otherEmails, sex, employerType, relationships, metadata);
    }

    @Override
    public String toString() {
        return "XContact{" + "refId='" + refId + '\'' + ", name=" + name + ", otherNames=" + otherNames + ", localId='" + localId + '\'' + ", otherIds=" + otherIds + ", address=" + address + ", phoneNumber=" + phoneNumber + ", otherPhoneNumbers=" + otherPhoneNumbers + ", email=" + email + ", otherEmails=" + otherEmails + ", sex='" + sex + '\'' + ", employerType='" + employerType + '\'' + ", relationships=" + relationships + ", metadata=" + metadata + '}';
    }
}