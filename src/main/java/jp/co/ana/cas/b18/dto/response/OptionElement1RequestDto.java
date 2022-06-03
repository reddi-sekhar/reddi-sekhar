package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.OptionElementDetail1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OptionElement1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class OptionElement1RequestDto   {
  @JsonProperty("optionDetail")
  private OptionElementDetail1RequestDto optionDetail;

  public OptionElement1RequestDto optionDetail(OptionElementDetail1RequestDto optionDetail) {
    this.optionDetail = optionDetail;
    return this;
  }

  /**
   * Get optionDetail
   * @return optionDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public OptionElementDetail1RequestDto getOptionDetail() {
    return optionDetail;
  }

  public void setOptionDetail(OptionElementDetail1RequestDto optionDetail) {
    this.optionDetail = optionDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionElement1RequestDto optionElement1RequestDto = (OptionElement1RequestDto) o;
    return Objects.equals(this.optionDetail, optionElement1RequestDto.optionDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionElement1RequestDto {\n");
    
    sb.append("    optionDetail: ").append(toIndentedString(optionDetail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

