
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "language"
})
public class XLanguageListType {

    @JsonProperty("language")
    private List<XLanguageType> language;

    public XLanguageListType() {
    }

    public XLanguageListType(List<XLanguageType> language) {
        super();
        this.language = language;
    }

    @JsonProperty("language")
    public List<XLanguageType> getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(List<XLanguageType> language) {
        this.language = language;
    }

    @Override public String toString()
    {
        return "XLanguageListType{" + "language=" + language + '}';
    }
}
