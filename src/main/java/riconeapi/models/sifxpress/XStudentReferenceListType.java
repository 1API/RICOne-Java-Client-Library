
package riconeapi.models.sifxpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xStudentReferenceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xStudentReferenceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentReference" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xStudentReferenceListType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "studentReference"
})
public class XStudentReferenceListType {

	public XStudentReferenceListType()
    {
        studentReference = new ArrayList<XPersonReferenceType>();
    }
	
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XPersonReferenceType> studentReference;

    /**
     * Gets the value of the studentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPersonReferenceType }
     * 
     * 
     */
    public List<XPersonReferenceType> getStudentReference() {
        if (studentReference == null) {
            studentReference = new ArrayList<XPersonReferenceType>();
        }
        return this.studentReference;
    }

	public void setStudentReference(List<XPersonReferenceType> studentReference)
	{
		this.studentReference = studentReference;
	}
	
}
