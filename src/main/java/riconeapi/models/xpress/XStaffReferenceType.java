
package riconeapi.models.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xStaffReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xStaffReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staffPersonReference" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonReferenceType" minOccurs="0"/>
 *         &lt;element name="teacherOfRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="percentResponsible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xStaffReferenceType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "staffPersonReference",
    "teacherOfRecord",
    "percentResponsible"
})
public class XStaffReferenceType {
	
	public XStaffReferenceType()
    {
        staffPersonReference = new XPersonReferenceType();
        teacherOfRecord = null;
        percentResponsible = null;
    }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XPersonReferenceType staffPersonReference;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Boolean teacherOfRecord;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected BigDecimal percentResponsible;

    /**
     * Gets the value of the staffPersonReference property.
     * 
     * @return
     *     possible object is
     *     {@link XPersonReferenceType }
     *     
     */
    public XPersonReferenceType getStaffPersonReference() {
        return staffPersonReference;
    }

    /**
     * Sets the value of the staffPersonReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPersonReferenceType }
     *     
     */
    public void setStaffPersonReference(XPersonReferenceType value) {
        this.staffPersonReference = value;
    }

    /**
     * Gets the value of the teacherOfRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeacherOfRecord() {
        return teacherOfRecord;
    }

    /**
     * Sets the value of the teacherOfRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeacherOfRecord(Boolean value) {
        this.teacherOfRecord = value;
    }

    /**
     * Gets the value of the percentResponsible property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentResponsible() {
        return percentResponsible;
    }

    /**
     * Sets the value of the percentResponsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentResponsible(BigDecimal value) {
        this.percentResponsible = value;
    }

}
