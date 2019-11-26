
package riconeapi.models.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * xStaff is a composite object that provides a view of the most commonly used core data elements for teachers and non-teaching staff. The refId of a xStaff object coincides with the refId of a corresponding staff object.
 *
 * <p>Java class for xStaffType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="xStaffType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_CompositeType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonNameType" minOccurs="0"/>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonIdType" minOccurs="0"/>
 *         &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/3.2}xPersonIdType" minOccurs="0"/>
 *         &lt;element name="otherIds" type="{http://www.sifassociation.org/datamodel/na/3.2}xOtherPersonIdListType" minOccurs="0"/>
 *         &lt;element name="appProvisioningInfo" type="{http://www.sifassociation.org/datamodel/na/3.2}xAppProvisioningInfoType" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.sifassociation.org/datamodel/na/3.2}xSexType" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.sifassociation.org/datamodel/na/3.2}xEmailType" minOccurs="0"/>
 *         &lt;element name="primaryAssignment" type="{http://www.sifassociation.org/datamodel/na/3.2}xStaffPersonAssignmentType" minOccurs="0"/>
 *         &lt;element name="otherAssignments" type="{http://www.sifassociation.org/datamodel/na/3.2}xStaffPersonAssignmentListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xAssignmentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {"leaRefId", "schoolRefId", "type", "department", "positionTitle", "manager", "hireDate", "terminationDate", "active", "removeEmployee", "assignments"})
public class XAssignmentType extends GSIFCompositeType implements IType<XAssignmentType> {
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String department;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String positionTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XManagerType manager;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hireDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String terminationDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Boolean active;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Boolean removeEmployee;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected XAssignmentCollectionType assignments;

    public XAssignmentType() {
        leaRefId = null;
        schoolRefId = null;
        type = null;
        department = null;
        positionTitle = null;
        manager = new XManagerType();
        hireDate = null;
        terminationDate = null;
        active = false;
        removeEmployee = false;
        assignments = new XAssignmentCollectionType();
    }

    public String getLeaRefId() {
        return leaRefId;
    }

    public void setLeaRefId(String leaRefId) {
        this.leaRefId = leaRefId;
    }

    public String getSchoolRefId() {
        return schoolRefId;
    }

    public void setSchoolRefId(String schoolRefId) {
        this.schoolRefId = schoolRefId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public XManagerType getManager() {
        return manager;
    }

    public void setManager(XManagerType manager) {
        this.manager = manager;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(String terminationDate) {
        this.terminationDate = terminationDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getRemoveEmployee() {
        return removeEmployee;
    }

    public void setRemoveEmployee(Boolean removeEmployee) {
        this.removeEmployee = removeEmployee;
    }

    public XAssignmentCollectionType getAssignments() {
        return assignments;
    }

    public void setAssignments(XAssignmentCollectionType assignments) {
        this.assignments = assignments;
    }

    @Override
    public XAssignmentType getObject() {
        return this;
    }
}
