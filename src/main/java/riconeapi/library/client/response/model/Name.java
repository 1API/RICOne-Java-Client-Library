package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xPersonNameType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"type", "prefix", "familyName", "givenName", "middleName", "suffix"})
public class Name {
    @JsonProperty("type")
    @JacksonXmlProperty(localName = "type", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String type;

    @JsonProperty("prefix")
    @JacksonXmlProperty(localName = "prefix", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String prefix;

    @JsonProperty("familyName")
    @JacksonXmlProperty(localName = "familyName", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String familyName;

    @JsonProperty("givenName")
    @JacksonXmlProperty(localName = "givenName", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String givenName;

    @JsonProperty("middleName")
    @JacksonXmlProperty(localName = "middleName", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String middleName;

    @JsonProperty("suffix")
    @JacksonXmlProperty(localName = "suffix", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String suffix;

    public Name() { }

    public Name(String type, String prefix, String familyName, String givenName, String middleName, String suffix) {
        super();
        this.type = type;
        this.prefix = prefix;
        this.familyName = familyName;
        this.givenName = givenName;
        this.middleName = middleName;
        this.suffix = suffix;
    }

    /**
     * <p>Gets the value of the type property.</p>
     * <p>The types of previous, alternate or other names for a person. Generally the "LegalName" for the primary name.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * <p>Sets the value of the type property.</p>
     * <p>The types of previous, alternate or other names for a person. Generally the "LegalName" for the primary name.</p>
     *
     * @param type allowed object is {@link String }
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>Gets the value of the prefix property.</p>
     * <p>An appellation, if any, used to denote rank, placement, or status (e.g., Mr., Ms., Reverend, Sister, Dr., Colonel).</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>Sets the value of the prefix property.</p>
     * <p>An appellation, if any, used to denote rank, placement, or status (e.g., Mr., Ms., Reverend, Sister, Dr., Colonel).</p>
     *
     * @param prefix allowed object is {@link String }
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
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
     * <p>Gets the value of the middleName property.</p>
     * <p>A full legal middle name given to a person at birth, baptism, or through legal change.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * <p>Sets the value of the middleName property.</p>
     * <p>A full legal middle name given to a person at birth, baptism, or through legal change.</p>
     *
     * @param middleName allowed object is {@link String }
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * <p>Gets the value of the suffix property.</p>
     * <p>An appendage, if any, used to denote a person's generation in his family (e.g., Jr., Sr., III).</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    /**
     * <p>Sets the value of the suffix property.</p>
     * <p>An appendage, if any, used to denote a person's generation in his family (e.g., Jr., Sr., III).</p>
     *
     * @param suffix allowed object is {@link String }
     */
    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(type, prefix, familyName, givenName, middleName, suffix).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "Name{" + "type='" + type + '\'' + ", prefix='" + prefix + '\'' + ", familyName='" + familyName + '\'' + ", givenName='" + givenName + '\'' + ", middleName='" + middleName + '\'' + ", suffix='" + suffix + '\'' + '}';
    }
}