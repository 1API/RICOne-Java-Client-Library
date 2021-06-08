package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xPersonReferenceType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"refId", "givenName", "familyName", "localId"})
public class StudentReference {
    @JsonProperty("refId")
    @JacksonXmlProperty(localName = "refId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String refId;

    @JsonProperty("localId")
    @JacksonXmlProperty(localName = "localId", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String localId;

    @JsonProperty("givenName")
    @JacksonXmlProperty(localName = "givenName", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String givenName;

    @JsonProperty("familyName")
    @JacksonXmlProperty(localName = "familyName", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String familyName;

    public StudentReference() { }

    public StudentReference(String refId, String localId, String givenName, String familyName) {
        super();
        this.refId = refId;
        this.localId = localId;
        this.givenName = givenName;
        this.familyName = familyName;
    }

    /**
     * <p>Gets the value of the refId property.</p>
     * <p>A SIF RefId.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("refId")
    public String getRefId() {
        return refId;
    }

    /**
     * <p>Sets the value of the refId property.</p>
     * <p>A SIF RefId.</p>
     *
     * @param refId allowed object is {@link String }
     */
    @JsonProperty("refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>Gets the value of the localId property.</p>
     * <p>A unique number or alphanumeric code assigned by a district or LEA.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("localId")
    public String getLocalId() {
        return localId;
    }

    /**
     * <p>Sets the value of the localId property.</p>
     * <p>A unique number or alphanumeric code assigned by a district or LEA.</p>
     *
     * @param localId allowed object is {@link String }
     */
    @JsonProperty("localId")
    public void setLocalId(String localId) {
        this.localId = localId;
    }

    /**
     * <p>Gets the value of the givenName property.</p>
     * <p>The full legal first name given to a person at birth, baptism, or through legal change.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("givenName")
    public String getGivenName() {
        return givenName;
    }

    /**
     * <p>Sets the value of the givenName property.</p>
     * <p>The full legal first name given to a person at birth, baptism, or through legal change.</p>
     *
     * @param givenName allowed object is {@link String }
     */
    @JsonProperty("givenName")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * <p>Gets the value of the familyName property.</p>
     * <p>The full legal last name borne in common by members of a family.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    /**
     * <p>Sets the value of the familyName property.</p>
     * <p>The full legal last name borne in common by members of a family.</p>
     *
     * @param familyName allowed object is {@link String }
     */
    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(refId, localId, givenName, familyName).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "StudentReference{" +
            "refId='" + refId + '\'' +
            ", localId='" + localId + '\'' +
            ", givenName='" + givenName + '\'' +
            ", familyName='" + familyName + '\'' +
            '}';
    }
}