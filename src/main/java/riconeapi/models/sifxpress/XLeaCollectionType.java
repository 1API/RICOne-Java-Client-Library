
package riconeapi.models.sifxpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xLeaCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xLeaCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xLea" type="{http://www.sifassociation.org/datamodel/na/3.2}xLeaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xLeaCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "xLea"
})
public class XLeaCollectionType {
	
	 public XLeaCollectionType()
     {
         xLea = new ArrayList<XLeaType>();
     }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XLeaType> xLea;

    /**
     * Gets the value of the xLea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xLea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXLea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XLeaType }
     * 
     * 
     */
    public List<XLeaType> getXLea() {
        if (xLea == null) {
            xLea = new ArrayList<XLeaType>();
        }
        return this.xLea;
    }

}
