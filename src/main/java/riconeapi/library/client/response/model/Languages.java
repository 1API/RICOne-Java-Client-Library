package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for xLanguageListType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"language"})
public class Languages {
    @JsonProperty("language")
    @JacksonXmlProperty(localName = "language", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Language> language;

    public Languages() {
        language = new ArrayList<>();
    }

    public Languages(List<Language> language) {
        super();
        this.language = language;
    }

    /**
     * <p>Gets the value of the language property.</p>
     *
     * @return possible object is {@link Language }
     */

    @JsonProperty("language")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Language> getLanguage() {
        return language;
    }

    /**
     * <p>Sets the value of the language property.</p>
     *
     * @param language allowed object is {@link Language }
     */
    @JsonProperty("language")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setLanguage(List<Language> language) {
        this.language = language;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return language.isEmpty();
    }

    @Override
    public String toString() {
        return "Languages{" + "language=" + language + '}';
    }
}