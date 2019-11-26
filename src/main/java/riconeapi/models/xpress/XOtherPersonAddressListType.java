
package riconeapi.models.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for xOtherPersonListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xOtherPersonListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherAddresses" type="{http://www.sifassociation.org/datamodel/na/3.2}xOtherPersonAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xPersonAddressListType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "address"
})
public class XOtherPersonAddressListType {

	public XOtherPersonAddressListType()
    {
        address = new ArrayList<XPersonAddressType>();
    }
	
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XPersonAddressType> address;

    /**
     * Gets the value of the phoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPersonAddressType }
     * 
     * 
     */
    public List<XPersonAddressType> getAddress() {
        if(address == null) {
            address = new ArrayList<XPersonAddressType>();
        }
        return address;
    }
}
