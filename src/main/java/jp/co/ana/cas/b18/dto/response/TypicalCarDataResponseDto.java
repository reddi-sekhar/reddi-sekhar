package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.ErrorWarningCarResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TypicalCarDataResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TypicalCarDataResponseDto   {
  @JsonProperty("errorWarning")
  private ErrorWarningCarResponseDto errorWarning;

  public TypicalCarDataResponseDto errorWarning(ErrorWarningCarResponseDto errorWarning) {
    this.errorWarning = errorWarning;
    return this;
  }

  /**
   * Get errorWarning
   * @return errorWarning
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorWarningCarResponseDto getErrorWarning() {
    return errorWarning;
  }

  public void setErrorWarning(ErrorWarningCarResponseDto errorWarning) {
    this.errorWarning = errorWarning;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypicalCarDataResponseDto typicalCarDataResponseDto = (TypicalCarDataResponseDto) o;
    return Objects.equals(this.errorWarning, typicalCarDataResponseDto.errorWarning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorWarning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypicalCarDataResponseDto {\n");
    
    sb.append("    errorWarning: ").append(toIndentedString(errorWarning)).append("\n");
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

