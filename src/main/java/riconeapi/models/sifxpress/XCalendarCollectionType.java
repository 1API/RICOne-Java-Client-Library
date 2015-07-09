
package riconeapi.models.sifxpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xCalendarCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xCalendarCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xCalendar" type="{http://www.sifassociation.org/datamodel/na/3.2}xCalendarType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xCalendarCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "xCalendar"
})
public class XCalendarCollectionType {
	
	 public XCalendarCollectionType()
     {
         xCalendar = new ArrayList<XCalendarType>();
     }
	 
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XCalendarType> xCalendar;

    /**
     * Gets the value of the xCalendar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xCalendar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXCalendar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XCalendarType }
     * 
     * 
     */
    public List<XCalendarType> getXCalendar() {
        if (xCalendar == null) {
            xCalendar = new ArrayList<XCalendarType>();
        }
        return this.xCalendar;
    }

}
