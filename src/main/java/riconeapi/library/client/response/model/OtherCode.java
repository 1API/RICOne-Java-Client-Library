package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xOtherCodeType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"codesetName", "otherCodeValue"})
public class OtherCode {
    @JsonProperty("codesetName")
    @JacksonXmlProperty(localName = "codesetName", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String codesetName;

    @JsonProperty("otherCodeValue")
    @JacksonXmlProperty(localName = "otherCodeValue", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String otherCodeValue;

    public OtherCode() { }

    public OtherCode(String codesetName, String otherCodeValue) {
        super();
        this.codesetName = codesetName;
        this.otherCodeValue = otherCodeValue;
    }

    /**
     * <p>Gets the value of the codesetName property.</p>
     * <p>Describes the OtherCode element content as either a state/province code, a local code, other code, or text string.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("codesetName")
    public String getCodesetName() {
        return codesetName;
    }

    /**
     * <p>Sets the value of the codesetName property.</p>
     * <p>Describes the OtherCode element content as either a state/province code, a local code, other code, or text string.</p>
     *
     * @param codesetName allowed object is {@link String }
     */
    @JsonProperty("codesetName")
    public void setCodesetName(String codesetName) {
        this.codesetName = codesetName;
    }

    /**
     * <p>Gets the value of the otherCodeValue property.</p>
     * <p>A state/province code, local code, other code or a text string that crosswalks to or serves as a translation of an associated Code element.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("otherCodeValue")
    public String getOtherCodeValue() {
        return otherCodeValue;
    }

    /**
     * <p>Sets the value of the otherCodeValue property.</p>
     * <p>A state/province code, local code, other code or a text string that crosswalks to or serves as a translation of an associated Code element.</p>
     *
     * @param otherCodeValue allowed object is {@link String }
     */
    @JsonProperty("otherCodeValue")
    public void setOtherCodeValue(String otherCodeValue) {
        this.otherCodeValue = otherCodeValue;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(codesetName, otherCodeValue).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "OtherCode{" + "codesetName='" + codesetName + '\'' + ", otherCodeValue='" + otherCodeValue + '\'' + '}';
    }
}