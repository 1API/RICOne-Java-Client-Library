
package riconeapi.models.sifxpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of enrollments.
 * 
 * <p>Java class for xEnrollmentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xEnrollmentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enrollment" type="{http://www.sifassociation.org/datamodel/na/3.2}xEnrollmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xEnrollmentListType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "enrollment"
})
public class XEnrollmentListType {

	public XEnrollmentListType()
    {
        enrollment = new ArrayList<XEnrollmentType>();
    }
	
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XEnrollmentType> enrollment;

    /**
     * Gets the value of the enrollment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enrollment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnrollment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XEnrollmentType }
     * 
     * 
     */
    public List<XEnrollmentType> getEnrollment() {
        if (enrollment == null) {
            enrollment = new ArrayList<XEnrollmentType>();
        }
        return this.enrollment;
    }

}
