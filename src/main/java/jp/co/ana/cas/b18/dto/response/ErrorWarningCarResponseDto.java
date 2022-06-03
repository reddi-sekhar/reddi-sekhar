package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.ApplicationErrorResponseDto;
import jp.co.ana.cas.b18.dto.response.ErrorFreeTextCarResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorWarningCarResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ErrorWarningCarResponseDto   {
  @JsonProperty("applicationError")
  private ApplicationErrorResponseDto applicationError;

  @JsonProperty("errorFreeText")
  private ErrorFreeTextCarResponseDto errorFreeText;

  public ErrorWarningCarResponseDto applicationError(ApplicationErrorResponseDto applicationError) {
    this.applicationError = applicationError;
    return this;
  }

  /**
   * Get applicationError
   * @return applicationError
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApplicationErrorResponseDto getApplicationError() {
    return applicationError;
  }

  public void setApplicationError(ApplicationErrorResponseDto applicationError) {
    this.applicationError = applicationError;
  }

  public ErrorWarningCarResponseDto errorFreeText(ErrorFreeTextCarResponseDto errorFreeText) {
    this.errorFreeText = errorFreeText;
    return this;
  }

  /**
   * Get errorFreeText
   * @return errorFreeText
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorFreeTextCarResponseDto getErrorFreeText() {
    return errorFreeText;
  }

  public void setErrorFreeText(ErrorFreeTextCarResponseDto errorFreeText) {
    this.errorFreeText = errorFreeText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorWarningCarResponseDto errorWarningCarResponseDto = (ErrorWarningCarResponseDto) o;
    return Objects.equals(this.applicationError, errorWarningCarResponseDto.applicationError) &&
        Objects.equals(this.errorFreeText, errorWarningCarResponseDto.errorFreeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationError, errorFreeText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorWarningCarResponseDto {\n");
    
    sb.append("    applicationError: ").append(toIndentedString(applicationError)).append("\n");
    sb.append("    errorFreeText: ").append(toIndentedString(errorFreeText)).append("\n");
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

