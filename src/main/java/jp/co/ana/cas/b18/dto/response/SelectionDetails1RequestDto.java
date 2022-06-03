package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SelectionDetails1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SelectionDetails1RequestDto   {
  @JsonProperty("option")
  private String option;

  public SelectionDetails1RequestDto option(String option) {
    this.option = option;
    return this;
  }

  /**
   * Selection Option
   * @return option
  */
  @ApiModelProperty(required = true, value = "Selection Option")
  @NotNull

@Size(min=1,max=3) 
  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectionDetails1RequestDto selectionDetails1RequestDto = (SelectionDetails1RequestDto) o;
    return Objects.equals(this.option, selectionDetails1RequestDto.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectionDetails1RequestDto {\n");
    
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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

