
package riconeapi.models.xpress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.math.BigInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
        "cumulativeWeightedGpa",
        "termWeightedGpa",
        "classRank"
})
public class XAcademicSummaryType {

    @JsonProperty("cumulativeWeightedGpa")
    private BigDecimal cumulativeWeightedGpa;
    @JsonProperty("termWeightedGpa")
    private BigDecimal termWeightedGpa;
    @JsonProperty("classRank")
    private BigInteger classRank;

    public XAcademicSummaryType() {
    }

    public XAcademicSummaryType(BigDecimal cumulativeWeightedGpa, BigDecimal termWeightedGpa, BigInteger classRank) {
        super();
        this.cumulativeWeightedGpa = cumulativeWeightedGpa;
        this.termWeightedGpa = termWeightedGpa;
        this.classRank = classRank;
    }

    @JsonProperty("cumulativeWeightedGpa")
    public BigDecimal getCumulativeWeightedGpa() {
        return cumulativeWeightedGpa;
    }

    @JsonProperty("cumulativeWeightedGpa")
    public void setCumulativeWeightedGpa(BigDecimal cumulativeWeightedGpa) {
        this.cumulativeWeightedGpa = cumulativeWeightedGpa;
    }

    @JsonProperty("termWeightedGpa")
    public BigDecimal getTermWeightedGpa() {
        return termWeightedGpa;
    }

    @JsonProperty("termWeightedGpa")
    public void setTermWeightedGpa(BigDecimal termWeightedGpa) {
        this.termWeightedGpa = termWeightedGpa;
    }

    @JsonProperty("classRank")
    public BigInteger getClassRank() {
        return classRank;
    }

    @JsonProperty("classRank")
    public void setClassRank(BigInteger classRank) {
        this.classRank = classRank;
    }

    @Override public String toString()
    {
        return "XAcademicSummaryType{" + "cumulativeWeightedGpa=" + cumulativeWeightedGpa + ", termWeightedGpa=" + termWeightedGpa + ", classRank=" + classRank + '}';
    }
}