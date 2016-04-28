
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xOtherPersonIdListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xOtherPersonIdListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherId" type="{http://www.sifassociation.org/datamodel/na/3.2}xOtherPersonIdType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xOtherPersonIdListType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "otherId"
})
public class XOtherPersonIdListType {
	
	 public XOtherPersonIdListType()
     {
         otherId = new ArrayList<XOtherPersonIdType>();
     }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XOtherPersonIdType> otherId;

    /**
     * Gets the value of the otherId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XOtherPersonIdType }
     * 
     * 
     */
    public List<XOtherPersonIdType> getOtherId() {
        if (otherId == null) {
            otherId = new ArrayList<XOtherPersonIdType>();
        }
        return this.otherId;
    }

}
