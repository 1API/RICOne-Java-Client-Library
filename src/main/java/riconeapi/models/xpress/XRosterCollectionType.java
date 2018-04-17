
package riconeapi.models.xpress;

import riconeapi.common.ICollectionType;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xRosterCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xRosterCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xRoster" type="{http://www.sifassociation.org/datamodel/na/3.2}xRosterType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xRosterCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "xRoster"
})
public class XRosterCollectionType implements ICollectionType<XRosterType> {
	
	public XRosterCollectionType()
    {
        xRoster = new ArrayList<XRosterType>();
    }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XRosterType> xRoster;

    /**
     * Gets the value of the xRoster property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xRoster property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXRoster().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XRosterType }
     * 
     * 
     */
    public List<XRosterType> getXRoster() {
        if (xRoster == null) {
            xRoster = new ArrayList<XRosterType>();
        }
        return this.xRoster;
    }

    @Override
    public List<XRosterType> getObject() {
        if (xRoster == null) {
            xRoster = new ArrayList<XRosterType>();
        }
        return this.xRoster;
    }
}
