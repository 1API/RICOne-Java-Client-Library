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
 * <p>Java class for xEmailListType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"email"})
public class OtherEmails {
    @JsonProperty("email")
    @JacksonXmlProperty(localName = "email", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Email> email;

    public OtherEmails() {
        email = new ArrayList<>();
    }

    public OtherEmails(List<Email> email) {
        super();
        this.email = email;
    }

    /**
     * <p>Gets the value of the email property.</p>
     * <p>The numbers, letters, and symbols used to identify an electronic mail (e-mail) user within the network to which the person or organization belongs.</p>
     *
     * @return possible object is {@link Email }
     */
    @JsonProperty("email")
    @JacksonXmlElementWrapper(useWrapping = false)
    public List<Email> getEmail() {
        return email;
    }

    /**
     * <p>Sets the value of the email property.</p>
     * <p>The numbers, letters, and symbols used to identify an electronic mail (e-mail) user within the network to which the person or organization belongs.</p>
     *
     * @param email allowed object is {@link Email }
     */
    @JsonProperty("email")
    @JacksonXmlElementWrapper(useWrapping = false)
    public void setEmail(List<Email> email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "OtherEmails{" + "email=" + email + '}';
    }
}