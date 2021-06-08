package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;


/**
 * <p>Java class for xLanguageType complex type.</p>
 * <p>xLanguageType is the base type for the following data types: xLanguageListType</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"type", "code"})
public class Language {
    @JsonProperty("type")
    @JacksonXmlProperty(localName = "type", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String type;

    @JsonProperty("code")
    @JacksonXmlProperty(localName = "code", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String code;

    public Language() { }

    public Language(String type, String code) {
        super();
        this.type = type;
        this.code = code;
    }

    /**
     * <p>Gets the value of the type property.</p>
     * <p>An indication of the function and context in which a person uses a language to communicate.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * <p>Sets the value of the type property.</p>
     * <p>An indication of the function and context in which a person uses a language to communicate.</p>
     *
     * @param type allowed object is {@link String }
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>Gets the value of the code property.</p>
     * <p>The code for the specific language or dialect that a person uses to communicate.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * <p>Sets the value of the code property.</p>
     * <p>The code for the specific language or dialect that a person uses to communicate.</p>
     *
     * @param code allowed object is {@link String }
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(type, code).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "Language{" + "type='" + type + '\'' + ", code='" + code + '\'' + '}';
    }
}