
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xRaceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xRaceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="race" type="{http://www.sifassociation.org/datamodel/na/3.2}xRaceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xRaceListType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "race"
})
public class XRaceListType {

	public XRaceListType()
    {
        race = new ArrayList<XRaceType>();
    }
	
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XRaceType> race;

    /**
     * Gets the value of the race property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the race property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XRaceType }
     * 
     * 
     */
    public List<XRaceType> getRace() {
        if (race == null) {
            race = new ArrayList<XRaceType>();
        }
        return this.race;
    }

}
