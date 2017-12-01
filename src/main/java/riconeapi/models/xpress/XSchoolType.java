
package riconeapi.models.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * xSchool is a composite object that provides essential information about a school building or campus. The refId of a xSchool object coincides with the refId of a corresponding school object.
 * 
 * <p>Java class for xSchoolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xSchoolType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_CompositeType">
 *       &lt;sequence>
 *         &lt;element name="leaRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}xOrganizationIdType" minOccurs="0"/>
 *         &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/3.2}xOrganizationIdType" minOccurs="0"/>
 *         &lt;element name="otherIds" type="{http://www.sifassociation.org/datamodel/na/3.2}xOtherOrganizationIdListType" minOccurs="0"/>
 *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gradeLevels" type="{http://www.sifassociation.org/datamodel/na/3.2}xGradeLevelListType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.sifassociation.org/datamodel/na/3.2}xOrganizationAddressType" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}xTelephoneType" minOccurs="0"/>
 *         &lt;element name="otherPhoneNumbers" type="{http://www.sifassociation.org/datamodel/na/3.2}xTelephoneListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xSchoolType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "leaRefId",
    "localId",
    "stateProvinceId",
    "otherIds",
    "schoolName",
    "gradeLevels",
    "address",
    "phoneNumber",
    "otherPhoneNumbers"
})
public class XSchoolType
    extends GSIFCompositeType
{
	public XSchoolType()
    {
        refId = null;
        leaRefId = null;
        localId = null;
        stateProvinceId = null;
        otherIds = new XOtherOrganizationIdListType();
        schoolName = null;
        gradeLevels = new XGradeLevelListType();
        address = new XOrganizationAddressType();
        phoneNumber = new XTelephoneType();
        otherPhoneNumbers = new XTelephoneListType();
    }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stateProvinceId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XOtherOrganizationIdListType otherIds;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String schoolName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XGradeLevelListType gradeLevels;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XOrganizationAddressType address;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XTelephoneType phoneNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XTelephoneListType otherPhoneNumbers;

    /**
     * Gets the value of the leaRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaRefId() {
        return leaRefId;
    }

    /**
     * Sets the value of the leaRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaRefId(String value) {
        this.leaRefId = value;
    }

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    /**
     * Gets the value of the stateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * Sets the value of the stateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvinceId(String value) {
        this.stateProvinceId = value;
    }

    /**
     * Gets the value of the otherIds property.
     * 
     * @return
     *     possible object is
     *     {@link XOtherOrganizationIdListType }
     *     
     */
    public XOtherOrganizationIdListType getOtherIds() {
        return otherIds;
    }

    /**
     * Sets the value of the otherIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link XOtherOrganizationIdListType }
     *     
     */
    public void setOtherIds(XOtherOrganizationIdListType value) {
        this.otherIds = value;
    }

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the gradeLevels property.
     * 
     * @return
     *     possible object is
     *     {@link XGradeLevelListType }
     *     
     */
    public XGradeLevelListType getGradeLevels() {
        return gradeLevels;
    }

    /**
     * Sets the value of the gradeLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link XGradeLevelListType }
     *     
     */
    public void setGradeLevels(XGradeLevelListType value) {
        this.gradeLevels = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link XTelephoneListType }
     *     
     */
    public XOrganizationAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTelephoneListType }
     *     
     */
    public void setAddress(XOrganizationAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XTelephoneType }
     *     
     */
    public XTelephoneType getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTelephoneType }
     *     
     */
    public void setPhoneNumber(XTelephoneType value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the otherPhoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link XTelephoneListType }
     *     
     */
    public XTelephoneListType getOtherPhoneNumbers() {
        return otherPhoneNumbers;
    }

    /**
     * Sets the value of the otherPhoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTelephoneListType }
     *     
     */
    public void setOtherPhoneNumbers(XTelephoneListType value) {
        this.otherPhoneNumbers = value;
    }

}
