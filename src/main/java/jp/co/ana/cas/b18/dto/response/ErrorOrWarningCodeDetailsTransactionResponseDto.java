package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.ErrorDetailsTransactionResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorOrWarningCodeDetailsTransactionResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ErrorOrWarningCodeDetailsTransactionResponseDto   {
  @JsonProperty("errorDetails")
  private ErrorDetailsTransactionResponseDto errorDetails;

  public ErrorOrWarningCodeDetailsTransactionResponseDto errorDetails(ErrorDetailsTransactionResponseDto errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails
   * @return errorDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorDetailsTransactionResponseDto getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetailsTransactionResponseDto errorDetails) {
    this.errorDetails = errorDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorOrWarningCodeDetailsTransactionResponseDto errorOrWarningCodeDetailsTransactionResponseDto = (ErrorOrWarningCodeDetailsTransactionResponseDto) o;
    return Objects.equals(this.errorDetails, errorOrWarningCodeDetailsTransactionResponseDto.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorOrWarningCodeDetailsTransactionResponseDto {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

