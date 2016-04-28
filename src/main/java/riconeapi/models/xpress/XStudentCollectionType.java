
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xStudentCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xStudentCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xStudent" type="{http://www.sifassociation.org/datamodel/na/3.2}xStudentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xStudentCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "xStudent"
})
public class XStudentCollectionType {
	
	public XStudentCollectionType()
    {
        xStudent = new ArrayList<XStudentType>();
    }

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XStudentType> xStudent;

    /**
     * Gets the value of the xStudent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xStudent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXStudent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XStudentType }
     * 
     * 
     */
    public List<XStudentType> getXStudent() {
        if (xStudent == null) {
            xStudent = new ArrayList<XStudentType>();
        }
        return this.xStudent;
    }

}
