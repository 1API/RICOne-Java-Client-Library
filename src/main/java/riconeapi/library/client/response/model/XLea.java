package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import riconeapi.library.client.common.Model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xLeaType complex type.</p>
 * <p>xLea is a composite object that provides core information about a Local Educuation Agency (e.g. district, division, intermediate agency). The refId of a xLea object coincides with the refId of a corresponding lea object.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"@refId", "localId", "stateProvinceId", "ncesId", "leaName", "address", "phoneNumber", "otherPhoneNumbers", "metadata"})
@JsonRootName(value = "xLea")
@JacksonXmlRootElement(localName = "xLea", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
public class XLea extends Model {
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true, namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlAttribute(name = "refId")
    private String refId;

    @JsonProperty("localId")
    @JacksonXmlProperty(localName = "localId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String localId;

    @JsonProperty("stateProvinceId")
    @JacksonXmlProperty(localName = "stateProvinceId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String stateProvinceId;

    @JsonProperty("ncesId")
    @JacksonXmlProperty(localName = "ncesId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String ncesId;

    @JsonProperty("leaName")
    @JacksonXmlProperty(localName = "leaName", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String leaName;

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

    public XLea() { }

    public XLea(String refId, String localId, String stateProvinceId, String ncesId, String leaName, Address address, PhoneNumber phoneNumber, OtherPhoneNumbers otherPhoneNumbers, Metadata metadata) {
        this.refId = refId;
        this.localId = localId;
        this.stateProvinceId = stateProvinceId;
        this.ncesId = ncesId;
        this.leaName = leaName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.otherPhoneNumbers = otherPhoneNumbers;
        this.metadata = metadata;
    }

    /**
     * <p>Gets the value of the refId property.</p>
     * <p>The refid to which this lea applies.</p>
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
     * <p>The refid to which this lea applies.</p>
     *
     * @param refId allowed object is {@link String }
     */
    @JsonProperty("@refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>Gets the value of the localId property.</p>
     * <p>A unique number or alphanumeric code assigned to a local education agency by a school system.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("localId")
    public String getLocalId() {
        return localId;
    }

    /**
     * <p>Sets the value of the localId property.</p>
     * <p>A unique number or alphanumeric code assigned to a local education agency by a school system.</p>
     *
     * @param localId allowed object is {@link String }
     */
    @JsonProperty("localId")
    public void setLocalId(String localId) {
        this.localId = localId;
    }

    /**
     * <p>Gets the value of the stateProvinceId property.</p>
     * <p>A unique number or alphanumeric code assigned to a local education agency by a state.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("stateProvinceId")
    public String getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * <p>Sets the value of the stateProvinceId property.</p>
     * <p>A unique number or alphanumeric code assigned to a local education agency by a state.</p>
     *
     * @param stateProvinceId allowed object is {@link String }
     */
    @JsonProperty("stateProvinceId")
    public void setStateProvinceId(String stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    /**
     * <p>Gets the value of the ncesId property.</p>
     * <p>A unique number or alphanumeric code assigned to a local education agency by NCES.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("ncesId")
    public String getNcesId() {
        return ncesId;
    }

    /**
     * <p>Sets the value of the ncesId property.</p>
     * <p>A unique number or alphanumeric code assigned to a local education agency by NCES.</p>
     *
     * @param ncesId allowed object is {@link String }
     */
    @JsonProperty("ncesId")
    public void setNcesId(String ncesId) {
        this.ncesId = ncesId;
    }

    /**
     * <p>Gets the value of the leaName property.</p>
     * <p>The name of a non-person entity such as an organization, institution, agency or business; in this case, a Local Education Agency.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("leaName")
    public String getLeaName() {
        return leaName;
    }

    /**
     * <p>Sets the value of the leaName property.</p>
     * <p>The name of a non-person entity such as an organization, institution, agency or business; in this case, a Local Education Agency.</p>
     *
     * @param leaName allowed object is {@link String }
     */
    @JsonProperty("leaName")
    public void setLeaName(String leaName) {
        this.leaName = leaName;
    }

    /**
     * <p>Gets the value of the address property.</p>
     * <p>The address of the LEA.</p>
     *
     * @return possible object is {@link Address }
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * <p>Sets the value of the address property.</p>
     * <p>The address of the LEA.</p>
     *
     * @param address allowed object is {@link Address }
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * <p>Gets the value of the phoneNumber property.</p>
     * <p>The phone number of the LEA.</p>
     *
     * @return possible object is {@link PhoneNumber }
     */
    @JsonProperty("phoneNumber")
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>Sets the value of the phoneNumber property.</p>
     * <p>The phone number of the LEA.</p>
     *
     * @param phoneNumber allowed object is {@link PhoneNumber }
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>Gets the value of the otherPhoneNumbers property.</p>
     * <p>A list of other phone numbers for the LEA.</p>
     *
     * @return possible object is {@link OtherPhoneNumbers }
     */
    @JsonProperty("otherPhoneNumbers")
    public OtherPhoneNumbers getOtherPhoneNumbers() {
        return otherPhoneNumbers;
    }

    /**
     * <p>Sets the value of the otherPhoneNumbers property.</p>
     * <p>A list of other phone numbers for the LEA.</p>
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
        return Stream.of(refId, localId, stateProvinceId, ncesId, leaName, address, phoneNumber, otherPhoneNumbers, metadata).allMatch(Objects::isNull);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        XLea xLea = (XLea) o;
        return Objects.equals(refId, xLea.refId) && Objects.equals(localId, xLea.localId) && Objects.equals(stateProvinceId, xLea.stateProvinceId) && Objects.equals(ncesId, xLea.ncesId) && Objects.equals(leaName, xLea.leaName) && Objects.equals(address, xLea.address) && Objects.equals(phoneNumber, xLea.phoneNumber) && Objects.equals(otherPhoneNumbers, xLea.otherPhoneNumbers) && Objects.equals(metadata, xLea.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refId, localId, stateProvinceId, ncesId, leaName, address, phoneNumber, otherPhoneNumbers, metadata);
    }

    @Override
    public String toString() {
        return "XLea{" + "refId='" + refId + '\'' + ", localId='" + localId + '\'' + ", stateProvinceId='" + stateProvinceId + '\'' + ", ncesId='" + ncesId + '\'' + ", leaName='" + leaName + '\'' + ", address=" + address + ", phoneNumber=" + phoneNumber + ", otherPhoneNumbers=" + otherPhoneNumbers + ", metadata=" + metadata + '}';
    }
}