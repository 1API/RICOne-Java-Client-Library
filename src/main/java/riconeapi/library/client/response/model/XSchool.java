package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import riconeapi.library.client.common.Model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xSchoolType complex type.</p>
 * <p>xSchool is a composite object that provides essential information about a school building or campus. The refId of a xSchool object coincides with the refId of a corresponding school object.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@refId", "leaRefId", "localId", "stateProvinceId", "otherIds", "schoolName", "gradeLevels", "address", "phoneNumber", "otherPhoneNumbers", "metadata"})
@JsonRootName(value = "xSchool")
@JacksonXmlRootElement(localName = "xSchool", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XSchool extends Model {
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true, namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlAttribute(name = "refId")
    private String refId;

    @JsonProperty("leaRefId")
    @JacksonXmlProperty(localName = "leaRefId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String leaRefId;

    @JsonProperty("localId")
    @JacksonXmlProperty(localName = "localId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String localId;

    @JsonProperty("stateProvinceId")
    @JacksonXmlProperty(localName = "stateProvinceId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String stateProvinceId;

    @JsonProperty("otherIds")
    @JacksonXmlProperty(localName = "otherIds", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private OtherIds otherIds;

    @JsonProperty("schoolName")
    @JacksonXmlProperty(localName = "schoolName", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String schoolName;

    @JsonProperty("gradeLevels")
    @JacksonXmlProperty(localName = "gradeLevels", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private GradeLevels gradeLevels;

    @JsonProperty("address")
    @JacksonXmlProperty(localName = "address", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Address address;

    @JsonProperty("phoneNumber")
    @JacksonXmlProperty(localName = "phoneNumber", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private PhoneNumber phoneNumber;

    @JsonProperty("otherPhoneNumbers")
    @JacksonXmlProperty(localName = "otherPhoneNumbers", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private OtherPhoneNumbers otherPhoneNumbers;

    @JsonProperty("metadata")
    @JacksonXmlProperty(localName = "metadata", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Metadata metadata;

    public XSchool() { }

    public XSchool(String refId, String leaRefId, String localId, String stateProvinceId, OtherIds otherIds, String schoolName, GradeLevels gradeLevels, Address address, PhoneNumber phoneNumber, OtherPhoneNumbers otherPhoneNumbers, Metadata metadata) {
        this.refId = refId;
        this.leaRefId = leaRefId;
        this.localId = localId;
        this.stateProvinceId = stateProvinceId;
        this.otherIds = otherIds;
        this.schoolName = schoolName;
        this.gradeLevels = gradeLevels;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.otherPhoneNumbers = otherPhoneNumbers;
        this.metadata = metadata;
    }

    /**
     * <p>Gets the value of the refId property.</p>
     * <p>The refid to which this school applies.</p>
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
     * <p>The refid to which this school applies.</p>
     *
     * @param refId allowed object is {@link String }
     */
    @JsonProperty("@refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>Gets the value of the leaRefId property.</p>
     * <p>Refid of the LEA of which the school is a part.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("leaRefId")
    public String getLeaRefId() {
        return leaRefId;
    }

    /**
     * <p>Sets the value of the leaRefId property.</p>
     * <p>Refid of the LEA of which the school is a part.</p>
     *
     * @param leaRefId allowed object is {@link String }
     */
    @JsonProperty("leaRefId")
    public void setLeaRefId(String leaRefId) {
        this.leaRefId = leaRefId;
    }

    /**
     * <p>Gets the value of the localId property.</p>
     * <p>A unique number or alphanumeric code assigned to a school by a district or LEA.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("localId")
    public String getLocalId() {
        return localId;
    }

    /**
     * <p>Sets the value of the localId property.</p>
     * <p>A unique number or alphanumeric code assigned to a school by a district or LEA.</p>
     *
     * @param localId allowed object is {@link String }
     */
    @JsonProperty("localId")
    public void setLocalId(String localId) {
        this.localId = localId;
    }

    /**
     * <p>Gets the value of the stateProvinceId property.</p>
     * <p>A unique number or alphanumeric code assigned to a school by a state.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("stateProvinceId")
    public String getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * <p>Sets the value of the stateProvinceId property.</p>
     * <p>A unique number or alphanumeric code assigned to a school by a state.</p>
     *
     * @param stateProvinceId allowed object is {@link String }
     */
    @JsonProperty("stateProvinceId")
    public void setStateProvinceId(String stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    /**
     * <p>Gets the value of the otherIds property.</p>
     * <p>A list of other Ids for the school.</p>
     *
     * @return possible object is {@link OtherIds }
     */
    @JsonProperty("otherIds")
    public OtherIds getOtherIds() {
        return otherIds;
    }

    /**
     * <p>Sets the value of the otherIds property.</p>
     * <p>A list of other Ids for the school.</p>
     *
     * @param otherIds allowed object is {@link OtherIds }
     */
    @JsonProperty("otherIds")
    public void setOtherIds(OtherIds otherIds) {
        this.otherIds = otherIds;
    }

    /**
     * <p>Gets the value of the schoolName property.</p>
     * <p>The full legally accepted name of the institution.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("schoolName")
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * <p>Sets the value of the schoolName property.</p>
     * <p>The full legally accepted name of the institution.</p>
     *
     * @param schoolName allowed object is {@link String }
     */
    @JsonProperty("schoolName")
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * <p>Gets the value of the gradeLevels property.</p>
     * <p>The specific grade or combination of grades offered by an education institution.</p>
     *
     * @return possible object is {@link GradeLevels }
     */
    @JsonProperty("gradeLevels")
    public GradeLevels getGradeLevels() {
        return gradeLevels;
    }

    /**
     * <p>Sets the value of the gradeLevels property.</p>
     * <p>The specific grade or combination of grades offered by an education institution.</p>
     *
     * @param gradeLevels allowed object is {@link GradeLevels }
     */
    @JsonProperty("gradeLevels")
    public void setGradeLevels(GradeLevels gradeLevels) {
        this.gradeLevels = gradeLevels;
    }

    /**
     * <p>Gets the value of the address property.</p>
     * <p>Address of the school.</p>
     *
     * @return possible object is {@link Address }
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * <p>Sets the value of the address property.</p>
     * <p>Address of the school.</p>
     *
     * @param address allowed object is {@link Address }
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * <p>Gets the value of the phoneNumber property.</p>
     * <p>Phone number of the school.</p>
     *
     * @return possible object is {@link PhoneNumber }
     */
    @JsonProperty("phoneNumber")
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>Sets the value of the phoneNumber property.</p>
     * <p>Phone number of the school.</p>
     *
     * @param phoneNumber allowed object is {@link PhoneNumber }
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>Gets the value of the otherPhoneNumbers property.</p>
     * <p>A list of other phone numbers for the school.</p>
     *
     * @return possible object is {@link OtherPhoneNumbers }
     */
    @JsonProperty("otherPhoneNumbers")
    public OtherPhoneNumbers getOtherPhoneNumbers() {
        return otherPhoneNumbers;
    }

    /**
     * <p>Sets the value of the otherPhoneNumbers property.</p>
     * <p>A list of other phone numbers for the school.</p>
     *
     * @param otherPhoneNumbers allowed object is {@link OtherPhoneNumbers }
     */
    @JsonProperty("otherPhoneNumbers")
    public void setOtherPhoneNumbers(OtherPhoneNumbers otherPhoneNumbers) {
        this.otherPhoneNumbers = otherPhoneNumbers;
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
        return Stream.of(refId, leaRefId, localId, stateProvinceId, otherIds, schoolName, gradeLevels, address, phoneNumber, otherPhoneNumbers, metadata).allMatch(Objects::isNull);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XSchool xSchool = (XSchool) o;
        return Objects.equals(refId, xSchool.refId) &&
            Objects.equals(leaRefId, xSchool.leaRefId) &&
            Objects.equals(localId, xSchool.localId) &&
            Objects.equals(stateProvinceId, xSchool.stateProvinceId) &&
            Objects.equals(otherIds, xSchool.otherIds) &&
            Objects.equals(schoolName, xSchool.schoolName) &&
            Objects.equals(gradeLevels, xSchool.gradeLevels) &&
            Objects.equals(address, xSchool.address) &&
            Objects.equals(phoneNumber, xSchool.phoneNumber) &&
            Objects.equals(otherPhoneNumbers, xSchool.otherPhoneNumbers) &&
            Objects.equals(metadata, xSchool.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refId, leaRefId, localId, stateProvinceId, otherIds, schoolName, gradeLevels, address, phoneNumber, otherPhoneNumbers, metadata);
    }

    @Override
    public String toString() {
        return "XSchool{" + "refId='" + refId + '\'' + ", leaRefId='" + leaRefId + '\'' + ", localId='" + localId + '\'' + ", stateProvinceId='" + stateProvinceId + '\'' + ", otherIds=" + otherIds + ", schoolName='" + schoolName + '\'' + ", gradeLevels=" + gradeLevels + ", address=" + address + ", phoneNumber=" + phoneNumber + ", otherPhoneNumbers=" + otherPhoneNumbers + ", metadata=" + metadata + '}';
    }

}