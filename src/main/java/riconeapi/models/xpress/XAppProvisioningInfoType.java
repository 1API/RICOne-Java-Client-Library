
package riconeapi.models.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xAppProvisioningInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xAppProvisioningInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginId" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonIdType"/>
 *         &lt;element name="tempPassword" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="tempPasswordExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xAppProvisioningInfoType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "loginId",
    "tempPassword",
    "tempPasswordExpiryDate"
})
public class XAppProvisioningInfoType {

	public XAppProvisioningInfoType()
	{
		loginId = null; 
	    tempPassword = null;
	    tempPasswordExpiryDate = null;
	}
	
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loginId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tempPassword;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tempPasswordExpiryDate;

    /**
     * Gets the value of the loginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * Sets the value of the loginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginId(String value) {
        this.loginId = value;
    }

    /**
     * Gets the value of the tempPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempPassword() {
        return tempPassword;
    }

    /**
     * Sets the value of the tempPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempPassword(String value) {
        this.tempPassword = value;
    }

    /**
     * Gets the value of the tempPasswordExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempPasswordExpiryDate() {
        return tempPasswordExpiryDate;
    }

    /**
     * Sets the value of the tempPasswordExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempPasswordExpiryDate(XMLGregorianCalendar value) {
        this.tempPasswordExpiryDate = value;
    }

}
