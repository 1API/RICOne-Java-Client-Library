package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for xOtherPersonNameListType complex type.</p>
 * <p>A List of other names for the person.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"name"})
public class OtherNames {
    @JsonProperty("name")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Name> name;

    public OtherNames() {
        name = new ArrayList<>();
    }

    public OtherNames(List<Name> name) {
        super();
        this.name = name;
    }

    /**
     * <p>Gets the value of the name property.</p>
     * <p>The types of previous, alternate or other names for a person. Generally the "LegalName" for the primary name.</p>
     *
     * @return possible object is {@link Name }
     */
    @JsonProperty("name")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Name> getName() {
        return name;
    }

    /**
     * <p>Sets the value of the name property.</p>
     * <p>The types of previous, alternate or other names for a person. Generally the "LegalName" for the primary name.</p>
     *
     * @param name allowed object is {@link Name }
     */
    @JsonProperty("name")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setName(List<Name> name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OtherNames{" + "name=" + name + '}';
    }
}