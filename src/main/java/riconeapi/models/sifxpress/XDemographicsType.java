
package riconeapi.models.sifxpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xDemographicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xDemographicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="races" type="{http://www.sifassociation.org/datamodel/na/3.2}xRaceListType" minOccurs="0"/>
 *         &lt;element name="hispanicLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.sifassociation.org/datamodel/na/3.2}xSexType" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="countryOfBirth" type="{http://www.sifassociation.org/datamodel/na/3.2}xCountryCodeType" minOccurs="0"/>
 *         &lt;element name="usCitizenshipStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gCitizenshipStatusType" minOccurs="0"/>
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
@XmlType(name = "xDemographicsType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "races",
    "hispanicLatinoEthnicity",
    "sex",
    "birthDate",
    "countryOfBirth",
    "usCitizenshipStatus",
    "any"
})
public class XDemographicsType {
	
	public XDemographicsType()
    {
        races = new XRaceListType();
        hispanicLatinoEthnicity = null;
        sex = null;
        birthDate = null;
        countryOfBirth = null;
        usCitizenshipStatus = null;
    }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XRaceListType races;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Boolean hispanicLatinoEthnicity;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sex;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String countryOfBirth;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String usCitizenshipStatus;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the races property.
     * 
     * @return
     *     possible object is
     *     {@link XRaceListType }
     *     
     */
    public XRaceListType getRaces() {
        return races;
    }

    /**
     * Sets the value of the races property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRaceListType }
     *     
     */
    public void setRaces(XRaceListType value) {
        this.races = value;
    }

    /**
     * Gets the value of the hispanicLatinoEthnicity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHispanicLatinoEthnicity() {
        return hispanicLatinoEthnicity;
    }

    /**
     * Sets the value of the hispanicLatinoEthnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHispanicLatinoEthnicity(Boolean value) {
        this.hispanicLatinoEthnicity = value;
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
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the countryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Sets the value of the countryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfBirth(String value) {
        this.countryOfBirth = value;
    }

    /**
     * Gets the value of the usCitizenshipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsCitizenshipStatus() {
        return usCitizenshipStatus;
    }

    /**
     * Sets the value of the usCitizenshipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsCitizenshipStatus(String value) {
        this.usCitizenshipStatus = value;
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
