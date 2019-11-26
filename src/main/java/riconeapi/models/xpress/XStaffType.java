
package riconeapi.models.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * xStaff is a composite object that provides a view of the most commonly used core data elements for teachers and non-teaching staff. The refId of a xStaff object coincides with the refId of a corresponding staff object.
 * 
 * <p>Java class for xStaffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xStaffType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_CompositeType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonNameType" minOccurs="0"/>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonIdType" minOccurs="0"/>
 *         &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonIdType" minOccurs="0"/>
 *         &lt;element name="otherIds" type="{http://www.sifassociation.org/datamodel/na/3.2}xOtherPersonIdListType" minOccurs="0"/>
 *         &lt;element name="appProvisioningInfo" type="{http://www.sifassociation.org/datamodel/na/3.2}xAppProvisioningInfoType" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.sifassociation.org/datamodel/na/3.2}xSexType" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.sifassociation.org/datamodel/na/3.2}xEmailType" minOccurs="0"/>
 *         &lt;element name="primaryAssignment" type="{http://www.sifassociation.org/datamodel/na/3.2}xStaffPersonAssignmentType" minOccurs="0"/>
 *         &lt;element name="otherAssignments" type="{http://www.sifassociation.org/datamodel/na/3.2}xStaffPersonAssignmentListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xStaffType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "name",
    "sex",
    "localId",
    "stateProvinceId",
    "otherIds",
    "appProvisioningInfo",
    "address",
    "otherAddresses",
    "phoneNumber",
    "otherPhoneNumbers",
    "email",
    "otherEmails",
    "primaryAssignment",
    "otherAssignments",
    "languages",
    "metadata"
})
public class XStaffType
    extends GSIFCompositeType implements IType<XStaffType>
{
	public XStaffType()
    {
	    refId = null;
	    name = new XPersonNameType();
	    localId = null;
	    stateProvinceId = null;
	    otherIds = new XOtherPersonIdListType();
	    appProvisioningInfo = new XAppProvisioningInfoType();
        address = new XPersonAddressType();
        otherAddresses = new XOtherPersonAddressListType();
        phoneNumber = new XTelephoneType();
        otherPhoneNumbers = new XTelephoneListType();
	    sex = null;
	    email = new XEmailType();
        otherEmails = new XEmailListType();
	    primaryAssignment = new XStaffPersonAssignmentType();
	    otherAssignments = new XStaffPersonAssignmentListType();
        languages = new XLanguageListType();
        metadata = new XMetadata();
    }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XPersonNameType name;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stateProvinceId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XOtherPersonIdListType otherIds;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XAppProvisioningInfoType appProvisioningInfo;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XPersonAddressType address;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XOtherPersonAddressListType otherAddresses;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XTelephoneType phoneNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XTelephoneListType otherPhoneNumbers;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sex;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XEmailType email;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XEmailListType otherEmails;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XStaffPersonAssignmentType primaryAssignment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XStaffPersonAssignmentListType otherAssignments;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XLanguageListType languages;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XMetadata metadata;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link XPersonNameType }
     *     
     */
    public XPersonNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPersonNameType }
     *     
     */
    public void setName(XPersonNameType value) {
        this.name = value;
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
     *     {@link XOtherPersonIdListType }
     *     
     */
    public XOtherPersonIdListType getOtherIds() {
        return otherIds;
    }

    /**
     * Sets the value of the otherIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link XOtherPersonIdListType }
     *     
     */
    public void setOtherIds(XOtherPersonIdListType value) {
        this.otherIds = value;
    }

    /**
     * Gets the value of the appProvisioningInfo property.
     * 
     * @return
     *     possible object is
     *     {@link XAppProvisioningInfoType }
     *     
     */
    public XAppProvisioningInfoType getAppProvisioningInfo() {
        return appProvisioningInfo;
    }

    /**
     * Sets the value of the appProvisioningInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAppProvisioningInfoType }
     *     
     */
    public void setAppProvisioningInfo(XAppProvisioningInfoType value) {
        this.appProvisioningInfo = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link XPersonAddressType }
     *
     */
    public XPersonAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link XPersonAddressType }
     *
     */
    public void setAddress(XPersonAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the otherAddresses property.
     *
     * @return
     *     possible object is
     *     {@link XOtherPersonAddressListType }
     *
     */
    public XOtherPersonAddressListType getOtherAddresses() {
        return otherAddresses;
    }

    /**
     * Sets the value of the otherAddresses property.
     *
     * @return
     *     possible object is
     *     {@link XOtherPersonAddressListType }
     *
     */
    public void setOtherAddresses(XOtherPersonAddressListType otherAddresses) {
        this.otherAddresses = otherAddresses;
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

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link XEmailType }
     *     
     */
    public XEmailType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEmailType }
     *     
     */
    public void setEmail(XEmailType value) {
        this.email = value;
    }

    /**
     * Gets the value of the otherEmails property.
     *
     * @return
     *     possible object is
     *     {@link XEmailListType }
     *
     */
    public XEmailListType getOtherEmails() {
        return otherEmails;
    }

    /**
     * Sets the value of the otherEmails property.
     *
     * @param value
     *     allowed object is
     *     {@link XEmailListType }
     *
     */
    public void setOtherEmails(XEmailListType value) {
        this.otherEmails = value;
    }

    /**
     * Gets the value of the primaryAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link XStaffPersonAssignmentType }
     *     
     */
    public XStaffPersonAssignmentType getPrimaryAssignment() {
        return primaryAssignment;
    }

    /**
     * Sets the value of the primaryAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XStaffPersonAssignmentType }
     *     
     */
    public void setPrimaryAssignment(XStaffPersonAssignmentType value) {
        this.primaryAssignment = value;
    }

    /**
     * Gets the value of the otherAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link XStaffPersonAssignmentListType }
     *     
     */
    public XStaffPersonAssignmentListType getOtherAssignments() {
        return otherAssignments;
    }

    /**
     * Sets the value of the otherAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link XStaffPersonAssignmentListType }
     *     
     */
    public void setOtherAssignments(XStaffPersonAssignmentListType value) {
        this.otherAssignments = value;
    }

    /**
     * Gets the value of the languages property.
     *
     *     allowed object is
     *     {@link XLanguageListType }
     *
     */
    public XLanguageListType getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     *
     * @return
     *     possible object is
     *     {@link XLanguageListType }
     *
     */
    public void setLanguages(XLanguageListType value) {
        this.languages = value;
    }

    public XMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(XMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public XStaffType getObject() {
        return this;
    }
}
