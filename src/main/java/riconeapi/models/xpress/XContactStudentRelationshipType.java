
package riconeapi.models.xpress;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xContactStudentRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xContactStudentRelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="relationshipCode" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonRelationshipToLearnerType" minOccurs="0"/>
 *         &lt;element name="restrictions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="livesWith" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="primaryContactIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emergencyContactIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="financialResponsibilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="custodialIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="communicationsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contactSequence" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xContactStudentRelationshipType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "studentRefId",
    "relationshipCode",
    "restrictions",
    "livesWith",
    "primaryContactIndicator",
    "emergencyContactIndicator",
    "financialResponsibilityIndicator",
    "custodialIndicator",
    "communicationsIndicator",
    "contactSequence"
})
public class XContactStudentRelationshipType {

	public XContactStudentRelationshipType()
    {
        studentRefId = null;
        relationshipCode = null;
        restrictions = null;
        livesWith = null;
        primaryContactIndicator = null;
        emergencyContactIndicator = null;
        financialResponsibilityIndicator = null;
        custodialIndicator = null;
        communicationsIndicator = null;
        contactSequence = null;
    }
	
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String relationshipCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String restrictions;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Boolean livesWith;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Boolean primaryContactIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Boolean emergencyContactIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Boolean financialResponsibilityIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Boolean custodialIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Boolean communicationsIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected BigInteger contactSequence;

    /**
     * Gets the value of the studentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentRefId() {
        return studentRefId;
    }

    /**
     * Sets the value of the studentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentRefId(String value) {
        this.studentRefId = value;
    }

    /**
     * Gets the value of the relationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * Sets the value of the relationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipCode(String value) {
        this.relationshipCode = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictions(String value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the livesWith property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLivesWith() {
        return livesWith;
    }

    /**
     * Sets the value of the livesWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLivesWith(Boolean value) {
        this.livesWith = value;
    }

    /**
     * Gets the value of the primaryContactIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryContactIndicator() {
        return primaryContactIndicator;
    }

    /**
     * Sets the value of the primaryContactIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryContactIndicator(Boolean value) {
        this.primaryContactIndicator = value;
    }

    /**
     * Gets the value of the emergencyContactIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmergencyContactIndicator() {
        return emergencyContactIndicator;
    }

    /**
     * Sets the value of the emergencyContactIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmergencyContactIndicator(Boolean value) {
        this.emergencyContactIndicator = value;
    }

    /**
     * Gets the value of the financialResponsibilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinancialResponsibilityIndicator() {
        return financialResponsibilityIndicator;
    }

    /**
     * Sets the value of the financialResponsibilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinancialResponsibilityIndicator(Boolean value) {
        this.financialResponsibilityIndicator = value;
    }

    /**
     * Gets the value of the custodialIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustodialIndicator() {
        return custodialIndicator;
    }

    /**
     * Sets the value of the custodialIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustodialIndicator(Boolean value) {
        this.custodialIndicator = value;
    }

    /**
     * Gets the value of the communicationsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommunicationsIndicator() {
        return communicationsIndicator;
    }

    /**
     * Sets the value of the communicationsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommunicationsIndicator(Boolean value) {
        this.communicationsIndicator = value;
    }

    /**
     * Gets the value of the contactSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContactSequence() {
        return contactSequence;
    }

    /**
     * Sets the value of the contactSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContactSequence(BigInteger value) {
        this.contactSequence = value;
    }

}
