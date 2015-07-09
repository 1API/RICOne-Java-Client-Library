
package riconeapi.models.sifxpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xSchoolCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xSchoolCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xSchool" type="{http://www.sifassociation.org/datamodel/na/3.2}xSchoolType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xSchoolCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "xSchool"
})
public class XSchoolCollectionType {

	public XSchoolCollectionType()
    {
        xSchool = new ArrayList<XSchoolType>();
    }
	
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XSchoolType> xSchool;

    /**
     * Gets the value of the xSchool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xSchool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXSchool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XSchoolType }
     * 
     * 
     */
    public List<XSchoolType> getXSchool() {
        if (xSchool == null) {
            xSchool = new ArrayList<XSchoolType>();
        }
        return this.xSchool;
    }

}
