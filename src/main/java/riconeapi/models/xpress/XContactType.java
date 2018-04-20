
package riconeapi.models.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xContactType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_CompositeType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonNameType"/>
 *         &lt;element name="otherNames" type="{http://www.sifassociation.org/datamodel/na/3.2}xOtherPersonNameListType" minOccurs="0"/>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonIdType" minOccurs="0"/>
 *         &lt;element name="otherIds" type="{http://www.sifassociation.org/datamodel/na/3.2}xOtherPersonIdListType" minOccurs="0"/>
 *         &lt;element name="appProvisioningInfo" type="{http://www.sifassociation.org/datamodel/na/3.2}xAppProvisioningInfoType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonAddressType" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}xTelephoneType" minOccurs="0"/>
 *         &lt;element name="otherPhoneNumbers" type="{http://www.sifassociation.org/datamodel/na/3.2}xTelephoneListType" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.sifassociation.org/datamodel/na/3.2}xEmailType" minOccurs="0"/>
 *         &lt;element name="otherEmails" type="{http://www.sifassociation.org/datamodel/na/3.2}xEmailListType" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.sifassociation.org/datamodel/na/3.2}xSexType" minOccurs="0"/>
 *         &lt;element name="employerType" type="{http://www.sifassociation.org/datamodel/na/3.2}xEmployerType" minOccurs="0"/>
 *         &lt;element name="relationships" type="{http://www.sifassociation.org/datamodel/na/3.2}xContactStudentRelationshipListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xContactType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "name",
    "otherNames",
    "localId",
    "otherIds",
    "appProvisioningInfo",
    "address",
    "phoneNumber",
    "otherPhoneNumbers",
    "email",
    "otherEmails",
    "sex",
    "employerType",
    "relationships"
})
public class XContactType
    extends GSIFCompositeType implements IType<XContactType>
{
	
	public XContactType()
    {
        name = new XPersonNameType();
        otherNames = new XOtherPersonNameListType();
        localId = null;
        otherIds = new XOtherPersonIdListType();
        appProvisioningInfo = new XAppProvisioningInfoType();
        address = new XPersonAddressType();
        phoneNumber = new XTelephoneType();
        otherPhoneNumbers = new XTelephoneListType();
        email = new XEmailType();
        otherEmails = new XEmailListType();
        sex = null;
        employerType = null;
        relationships = new XContactStudentRelationshipListType();
    }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected XPersonNameType name;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XOtherPersonNameListType otherNames;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XOtherPersonIdListType otherIds;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XAppProvisioningInfoType appProvisioningInfo;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XPersonAddressType address;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XTelephoneType phoneNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XTelephoneListType otherPhoneNumbers;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XEmailType email;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XEmailListType otherEmails;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sex;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String employerType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XContactStudentRelationshipListType relationships;

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
     * Gets the value of the otherNames property.
     * 
     * @return
     *     possible object is
     *     {@link XOtherPersonNameListType }
     *     
     */
    public XOtherPersonNameListType getOtherNames() {
        return otherNames;
    }

    /**
     * Sets the value of the otherNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link XOtherPersonNameListType }
     *     
     */
    public void setOtherNames(XOtherPersonNameListType value) {
        this.otherNames = value;
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
     * Gets the value of the employerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerType() {
        return employerType;
    }

    /**
     * Sets the value of the employerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerType(String value) {
        this.employerType = value;
    }

    /**
     * Gets the value of the relationships property.
     * 
     * @return
     *     possible object is
     *     {@link XContactStudentRelationshipListType }
     *     
     */
    public XContactStudentRelationshipListType getRelationships() {
        return relationships;
    }

    /**
     * Sets the value of the relationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link XContactStudentRelationshipListType }
     *     
     */
    public void setRelationships(XContactStudentRelationshipListType value) {
        this.relationships = value;
    }

    @Override
    public XContactType getObject() {
        return this;
    }
}
