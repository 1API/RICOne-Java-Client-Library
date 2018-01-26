package riconeapi.models.xpress;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"gradeLevel"
})
public class XGradeLevelListType {

	@JsonProperty("gradeLevel")
	private List<String> gradeLevel = new ArrayList<String>();

	public XGradeLevelListType() {
	}

	public XGradeLevelListType(List<String> gradeLevel) {
		super();
		this.gradeLevel = gradeLevel;
	}

	@JsonProperty("gradeLevel")
	public List<String> getGradeLevel() {
		return gradeLevel;
	}

	@JsonProperty("gradeLevel")
	public void setGradeLevel(List<String> gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	@Override public String toString()
	{
		return "XGradeLevelListType{" + "gradeLevel=" + gradeLevel + '}';
	}
}
