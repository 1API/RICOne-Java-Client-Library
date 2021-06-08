package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for xEmailType complex type.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"emailType", "emailAddress"})
public class Email {
    @JsonProperty("emailType")
    @JacksonXmlProperty(localName = "emailType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String emailType;

    @JsonProperty("emailAddress")
    @JacksonXmlProperty(localName = "emailAddress", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private String emailAddress;

    public Email() { }

    public Email(String emailType, String emailAddress) {
        super();
        this.emailType = emailType;
        this.emailAddress = emailAddress;
    }

    /**
     * <p>Gets the value of the emailType property.</p>
     * <p>The type of electronic mail (e-mail) address listed for a person or organization.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("emailType")
    public String getEmailType() {
        return emailType;
    }

    /**
     * <p>Sets the value of the emailType property.</p>
     * <p>The type of electronic mail (e-mail) address listed for a person or organization.</p>
     *
     * @param emailType allowed object is {@link String }
     */
    @JsonProperty("emailType")
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    /**
     * <p>Gets the value of the emailAddress property.</p>
     * <p>The numbers, letters, and symbols used to identify an electronic mail (e-mail) user within the network to which the person or organization belongs.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * <p>Sets the value of the emailAddress property.</p>
     * <p>The numbers, letters, and symbols used to identify an electronic mail (e-mail) user within the network to which the person or organization belongs.</p>
     *
     * @param emailAddress allowed object is {@link String }
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(emailType, emailAddress).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "Email{" + "emailType='" + emailType + '\'' + ", emailAddress='" + emailAddress + '\'' + '}';
    }
}