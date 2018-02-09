
package riconeapi.models.xpress;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"otherId"
})
public class XOtherCourseIdListType {

	@JsonProperty("otherId")
	private List<XOtherCourseIdType> otherId = new ArrayList<>();

	public XOtherCourseIdListType() {
	}

	public XOtherCourseIdListType(List<XOtherCourseIdType> otherId) {
		super();
		this.otherId = otherId;
	}

	@JsonProperty("otherId")
	public List<XOtherCourseIdType> getOtherId() {
		return otherId;
	}

	@JsonProperty("otherId")
	public void setOtherId(List<XOtherCourseIdType> otherId) {
		this.otherId = otherId;
	}

	@Override
	public String toString()
	{
		return "XOtherCourseIdListType{" + "otherId=" + otherId + '}';
	}
}
