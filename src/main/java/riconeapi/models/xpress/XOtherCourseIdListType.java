
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xOtherCourseIdListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xOtherCourseIdListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherId" type="{http://www.sifassociation.org/datamodel/na/3.2}xOtherCourseIdType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xOtherCourseIdListType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "otherId"
})
public class XOtherCourseIdListType {
	
	public XOtherCourseIdListType()
	{
		otherId = new ArrayList<XOtherCourseIdType>();
	}
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XOtherCourseIdType> otherId;

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
     * {@link XOtherCourseIdType }
     * 
     * 
     */
    public List<XOtherCourseIdType> getOtherId() {
        if (otherId == null) {
            otherId = new ArrayList<XOtherCourseIdType>();
        }
        return this.otherId;
    }

}
