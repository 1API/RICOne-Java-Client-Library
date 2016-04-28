
package riconeapi.models.xpress;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Academic information for the student.
 * 
 * <p>Java class for xAcademicSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xAcademicSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cumulativeWeightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="termWeightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="classRank" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xAcademicSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "cumulativeWeightedGpa",
    "termWeightedGpa",
    "classRank",
    "any"
})
public class XAcademicSummaryType {
	public XAcademicSummaryType()
    {
        cumulativeWeightedGpa = null;
        termWeightedGpa = null;
        classRank = null;
    }
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected BigDecimal cumulativeWeightedGpa;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected BigDecimal termWeightedGpa;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected BigInteger classRank;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the cumulativeWeightedGpa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumulativeWeightedGpa() {
        return cumulativeWeightedGpa;
    }

    /**
     * Sets the value of the cumulativeWeightedGpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumulativeWeightedGpa(BigDecimal value) {
        this.cumulativeWeightedGpa = value;
    }

    /**
     * Gets the value of the termWeightedGpa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTermWeightedGpa() {
        return termWeightedGpa;
    }

    /**
     * Sets the value of the termWeightedGpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTermWeightedGpa(BigDecimal value) {
        this.termWeightedGpa = value;
    }

    /**
     * Gets the value of the classRank property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClassRank() {
        return classRank;
    }

    /**
     * Sets the value of the classRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClassRank(BigInteger value) {
        this.classRank = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
