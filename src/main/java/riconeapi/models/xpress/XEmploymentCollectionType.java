
package riconeapi.models.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for xEmploymentCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xEmploymentCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xEmployment" type="{http://www.sifassociation.org/datamodel/na/3.2}xEmployment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xEmploymentCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "xEmployment"
})
public class XEmploymentCollectionType implements ICollectionType<XEmploymentType> {
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<XEmploymentType> xEmployment;

    public XEmploymentCollectionType()
    {
        xEmployment = new ArrayList<XEmploymentType>();
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
     * {@link XEmploymentType }
     * 
     * 
     */
    public List<XEmploymentType> getXEmployment() {
        if (xEmployment == null) {
            xEmployment = new ArrayList<XEmploymentType>();
        }
        return this.xEmployment;
    }

    @Override
    public List<XEmploymentType> getObject() {
        if (xEmployment == null) {
            xEmployment = new ArrayList<XEmploymentType>();
        }
        return this.xEmployment;
    }
}
