
package riconeapi.models.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * xStudent is a composite object that provides a view of the most commonly used core data elements for students, and references to important associated objects like contacts. The refId of a xStudent object coincides with the refId of a corresponding student object.
 * 
 * <p>Java class for xStudentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xStudentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_CompositeType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonNameType" minOccurs="0"/>
 *         &lt;element name="otherNames" type="{http://www.sifassociation.org/datamodel/na/3.2}xOtherPersonNameListType" minOccurs="0"/>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonIdType" minOccurs="0"/>
 *         &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonIdType" minOccurs="0"/>
 *         &lt;element name="otherIds" type="{http://www.sifassociation.org/datamodel/na/3.2}xOtherPersonIdListType" minOccurs="0"/>
 *         &lt;element name="appProvisioningInfo" type="{http://www.sifassociation.org/datamodel/na/3.2}xAppProvisioningInfoType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonAddressType" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.2}xTelephoneType" minOccurs="0"/>
 *         &lt;element name="otherPhoneNumbers" type="{http://www.sifassociation.org/datamodel/na/3.2}xTelephoneListType" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.sifassociation.org/datamodel/na/3.2}xEmailType" minOccurs="0"/>
 *         &lt;element name="otherEmails" type="{http://www.sifassociation.org/datamodel/na/3.2}xEmailListType" minOccurs="0"/>
 *         &lt;element name="demographics" type="{http://www.sifassociation.org/datamodel/na/3.2}xDemographicsType" minOccurs="0"/>
 *         &lt;element name="enrollment" type="{http://www.sifassociation.org/datamodel/na/3.2}xEnrollmentType" minOccurs="0"/>
 *         &lt;element name="otherEnrollments" type="{http://www.sifassociation.org/datamodel/na/3.2}xEnrollmentListType" minOccurs="0"/>
 *         &lt;element name="academicSummary" type="{http://www.sifassociation.org/datamodel/na/3.2}xAcademicSummaryType" minOccurs="0"/>
 *         &lt;element name="studentContacts" type="{http://www.sifassociation.org/datamodel/na/3.2}xStudentContactListType" minOccurs="0"/>
 *         &lt;element name="languages" type="{http://www.sifassociation.org/datamodel/na/3.2}xLanguageListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xStudentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "name",
    "otherNames",
    "localId",
    "stateProvinceId",
    "otherIds",
    "appProvisioningInfo",
    "address",
    "phoneNumber",
    "otherPhoneNumbers",
    "email",
    "otherEmails",
    "demographics",
    "enrollment",
    "otherEnrollments",
    "academicSummary",
    "studentContacts",
    "languages"
})
public class XStudentType
    extends GSIFCompositeType implements IType<XStudentType>
{
	public XStudentType()
    {
        refId = null;
        name = new XPersonNameType();
        otherNames = new XOtherPersonNameListType();
        localId = null;
        stateProvinceId = null;
        otherIds = new XOtherPersonIdListType();
        appProvisioningInfo = new XAppProvisioningInfoType();
        address = new XPersonAddressType();
        phoneNumber = new XTelephoneType();
        otherPhoneNumbers = new XTelephoneListType();
        email = new XEmailType();
        otherEmails = new XEmailListType();
        demographics = new XDemographicsType();
        enrollment = new XEnrollmentType();
        otherEnrollments = new XEnrollmentListType();
        academicSummary = new XAcademicSummaryType();
        studentContacts = new XStudentContactListType();
        languages = new XLanguageListType();

    }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XPersonNameType name;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XOtherPersonNameListType otherNames;
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
    protected XTelephoneType phoneNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XTelephoneListType otherPhoneNumbers;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XEmailType email;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XEmailListType otherEmails;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XDemographicsType demographics;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XEnrollmentType enrollment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XEnrollmentListType otherEnrollments;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XAcademicSummaryType academicSummary;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XStudentContactListType studentContacts;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XLanguageListType languages;

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
     * Gets the value of the demographics property.
     * 
     * @return
     *     possible object is
     *     {@link XDemographicsType }
     *     
     */
    public XDemographicsType getDemographics() {
        return demographics;
    }

    /**
     * Sets the value of the demographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDemographicsType }
     *     
     */
    public void setDemographics(XDemographicsType value) {
        this.demographics = value;
    }

    /**
     * Gets the value of the enrollment property.
     * 
     * @return
     *     possible object is
     *     {@link XEnrollmentType }
     *     
     */
    public XEnrollmentType getEnrollment() {
        return enrollment;
    }

    /**
     * Sets the value of the enrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEnrollmentType }
     *     
     */
    public void setEnrollment(XEnrollmentType value) {
        this.enrollment = value;
    }

    /**
     * Gets the value of the otherEnrollments property.
     * 
     * @return
     *     possible object is
     *     {@link XEnrollmentListType }
     *     
     */
    public XEnrollmentListType getOtherEnrollments() {
        return otherEnrollments;
    }

    /**
     * Sets the value of the otherEnrollments property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEnrollmentListType }
     *     
     */
    public void setOtherEnrollments(XEnrollmentListType value) {
        this.otherEnrollments = value;
    }

    /**
     * Gets the value of the academicSummary property.
     * 
     * @return
     *     possible object is
     *     {@link XAcademicSummaryType }
     *     
     */
    public XAcademicSummaryType getAcademicSummary() {
        return academicSummary;
    }

    /**
     * Sets the value of the academicSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAcademicSummaryType }
     *     
     */
    public void setAcademicSummary(XAcademicSummaryType value) {
        this.academicSummary = value;
    }

    /**
     * Gets the value of the studentContacts property.
     * 
     * @return
     *     possible object is
     *     {@link XStudentContactListType }
     *     
     */
    public XStudentContactListType getStudentContacts() {
        return studentContacts;
    }

    /**
     * Sets the value of the studentContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link XStudentContactListType }
     *     
     */
    public void setStudentContacts(XStudentContactListType value) {
        this.studentContacts = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link XLanguageListType }
     *     
     */
    public XLanguageListType getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLanguageListType }
     *     
     */
    public void setLanguages(XLanguageListType value) {
        this.languages = value;
    }

    @Override
    public XStudentType getObject() {
        return this;
    }
}
