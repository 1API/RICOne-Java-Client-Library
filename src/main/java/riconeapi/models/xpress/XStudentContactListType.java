
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This data element is meant to be used in one of two ways.  1) Populate the contactPersonRefId field so that the xContact details can be retrieved from an xContact service endpoint.  This allows you to access related xContact data only as needed.  If you use this option, leave the "xContact" element unpopulated. 2) Populate the "xContact."  Use this option if you don't offer an xContact resource endpoint or if one is not appropriate in your use case (e.g. Student Record Exchange).  If this option is used, leave contactPersonRefId unpopulated.
 * 
 * <p>Java class for xStudentContactListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xStudentContactListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPersonRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="xContact" type="{http://www.sifassociation.org/datamodel/na/3.2}xContactType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xStudentContactListType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "contactPersonRefId",
    "xContact"
})
public class XStudentContactListType {

	public XStudentContactListType()
    {
        contactPersonRefId = new ArrayList<String>();
        xContact = new ArrayList<XContactType>();
    }
	
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> contactPersonRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XContactType> xContact;

    /**
     * Gets the value of the contactPersonRefId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPersonRefId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPersonRefId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactPersonRefId() {
        if (contactPersonRefId == null) {
            contactPersonRefId = new ArrayList<String>();
        }
        return this.contactPersonRefId;
    }

    /**
     * Gets the value of the xContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XContactType }
     * 
     * 
     */
    public List<XContactType> getXContact() {
        if (xContact == null) {
            xContact = new ArrayList<XContactType>();
        }
        return this.xContact;
    }

}
