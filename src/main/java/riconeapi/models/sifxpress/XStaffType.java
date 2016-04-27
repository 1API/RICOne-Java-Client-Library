
package riconeapi.models.sifxpress;

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
    "localId",
    "stateProvinceId",
    "otherIds",
    "appProvisioningInfo",
    "sex",
    "email",
    "primaryAssignment",
    "otherAssignments"
})
public class XStaffType
    extends GSIFCompositeType
{
	public XStaffType()
    {
	    refId = null;
	    name = new XPersonNameType();
	    localId = null;
	    stateProvinceId = null;
	    otherIds = new XOtherPersonIdListType();
	    appProvisioningInfo = new XAppProvisioningInfoType();
	    sex = null;
	    email = new XEmailType();
	    primaryAssignment = new XStaffPersonAssignmentType();
	    otherAssignments = new XStaffPersonAssignmentListType();
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
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sex;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XEmailType email;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XStaffPersonAssignmentType primaryAssignment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XStaffPersonAssignmentListType otherAssignments;

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

}
