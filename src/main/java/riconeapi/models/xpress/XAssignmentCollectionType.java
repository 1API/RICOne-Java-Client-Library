
package riconeapi.models.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xAssignmentCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assignment"
})
public class XAssignmentCollectionType implements ICollectionType<XAssignmentType> {
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XAssignmentType> assignment;

    public XAssignmentCollectionType()
    {
        assignment = new ArrayList<XAssignmentType>();
    }

    /**
     * Gets the value of the xEmployment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xEmployment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXEmployment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XAssignmentType }
     * 
     * 
     */
    public List<XAssignmentType> getXAssignment() {
        if (assignment == null) {
            assignment = new ArrayList<XAssignmentType>();
        }
        return this.assignment;
    }

    @Override
    public List<XAssignmentType> getObject() {
        if (assignment == null) {
            assignment = new ArrayList<XAssignmentType>();
        }
        return this.assignment;
    }
}
