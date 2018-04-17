
package riconeapi.models.xpress;

import riconeapi.common.ICollectionType;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xCourseCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xCourseCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xCourse" type="{http://www.sifassociation.org/datamodel/na/3.2}xCourseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xCourseCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "xCourse"
})
public class XCourseCollectionType implements ICollectionType<XCourseType> {

	 public XCourseCollectionType()
     {
         xCourse = new ArrayList<XCourseType>();
     }
	 
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XCourseType> xCourse;

    /**
     * Gets the value of the xCourse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xCourse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXCourse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XCourseType }
     * 
     * 
     */
    public List<XCourseType> getXCourse() {
        if (xCourse == null) {
            xCourse = new ArrayList<XCourseType>();
        }
        return this.xCourse;
    }

    @Override
    public List<XCourseType> getObject() {
        if (xCourse == null) {
            xCourse = new ArrayList<XCourseType>();
        }
        return this.xCourse;
    }
}
