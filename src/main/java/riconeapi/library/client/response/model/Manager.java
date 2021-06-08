package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xPersonReferenceType complex type.</p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"refId", "givenName", "familyName"})
public class Manager implements Serializable {
    private final static long serialVersionUID = -8959172243041470240L;
    @JsonProperty("refId")
    private String refId;
    @JsonProperty("givenName")
    private String givenName;
    @JsonProperty("familyName")
    private String familyName;

    public Manager() {
    }

    public Manager(String refId, String givenName, String familyName) {
        super();
        this.refId = refId;
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
        return Stream.of(refId, givenName, familyName).allMatch(Objects::isNull);
    }
}