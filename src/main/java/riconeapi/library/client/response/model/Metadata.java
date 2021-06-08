package riconeapi.library.client.response.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * <p>Java class for Metadata complex type.</p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"schoolYear"})
public class Metadata {
    @JsonProperty("schoolYear")
    @JacksonXmlProperty(localName = "schoolYear", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    private Integer schoolYear;

    public Metadata() { }

    public Metadata(Integer schoolYear) {
        super();
        this.schoolYear = schoolYear;
    }

    /**
     * <p>Gets the value of the schoolYear property.</p>
     * <p>The year for the data.</p>
     *
     * @return possible object is {@link String }
     */
    @JsonProperty("schoolYear")
    @JacksonXmlProperty(localName = "schoolYear", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    public Integer getSchoolYear() {
        return schoolYear;
    }

    /**
     * <p>Sets the value of the schoolYear property.</p>
     * <p>The year for the data.</p>
     *
     * @param schoolYear allowed object is {@link String }
     */
    @JsonProperty("schoolYear")
    @JacksonXmlProperty(localName = "schoolYear", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    public void setSchoolYear(Integer schoolYear) {
        this.schoolYear = schoolYear;
    }

    @JsonIgnore
    public boolean isEmptyObject() {
        return Stream.of(schoolYear).allMatch(Objects::isNull);
    }

    @Override
    public String toString() {
        return "Metadata{" + "schoolYear='" + schoolYear + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Metadata)) return false;

        Metadata metadata = (Metadata) o;

        return schoolYear != null ? schoolYear.equals(metadata.schoolYear) : metadata.schoolYear == null;
    }

    @Override
    public int hashCode() {
        return schoolYear != null ? schoolYear.hashCode() : 0;
    }
}