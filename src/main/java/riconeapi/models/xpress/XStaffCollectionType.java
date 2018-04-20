
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xStaffCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xStaffCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xStaff" type="{http://www.sifassociation.org/datamodel/na/3.2}xStaffType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xStaffCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "xStaff"
})
public class XStaffCollectionType implements ICollectionType<XStaffType> {

	public XStaffCollectionType()
    {
        xStaff = new ArrayList<XStaffType>();
    }
	
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XStaffType> xStaff;

    /**
     * Gets the value of the xStaff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xStaff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXStaff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XStaffType }
     * 
     * 
     */
    public List<XStaffType> getXStaff() {
        if (xStaff == null) {
            xStaff = new ArrayList<XStaffType>();
        }
        return this.xStaff;
    }

    @Override
    public List<XStaffType> getObject() {
        if (xStaff == null) {
            xStaff = new ArrayList<XStaffType>();
        }
        return this.xStaff;
    }
}
