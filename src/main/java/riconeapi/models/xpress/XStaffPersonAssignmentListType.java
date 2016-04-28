
package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of staff person assignments.
 * 
 * <p>Java class for xStaffPersonAssignmentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xStaffPersonAssignmentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staffPersonAssignment" type="{http://www.sifassociation.org/datamodel/na/3.2}xStaffPersonAssignmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xStaffPersonAssignmentListType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "staffPersonAssignment"
})
public class XStaffPersonAssignmentListType {

	public XStaffPersonAssignmentListType()
	{
		staffPersonAssignment = new ArrayList<XStaffPersonAssignmentType>();
	}
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XStaffPersonAssignmentType> staffPersonAssignment;

    /**
     * Gets the value of the staffPersonAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffPersonAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffPersonAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XStaffPersonAssignmentType }
     * 
     * 
     */
    public List<XStaffPersonAssignmentType> getStaffPersonAssignment() {
        if (staffPersonAssignment == null) {
            staffPersonAssignment = new ArrayList<XStaffPersonAssignmentType>();
        }
        return this.staffPersonAssignment;
    }

}
