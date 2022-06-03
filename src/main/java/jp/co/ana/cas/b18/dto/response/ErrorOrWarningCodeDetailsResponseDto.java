package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.ErrorDetailsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorOrWarningCodeDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ErrorOrWarningCodeDetailsResponseDto   {
  @JsonProperty("errorDetails")
  private ErrorDetailsResponseDto errorDetails;

  public ErrorOrWarningCodeDetailsResponseDto errorDetails(ErrorDetailsResponseDto errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails
   * @return errorDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorDetailsResponseDto getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetailsResponseDto errorDetails) {
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
    ErrorOrWarningCodeDetailsResponseDto errorOrWarningCodeDetailsResponseDto = (ErrorOrWarningCodeDetailsResponseDto) o;
    return Objects.equals(this.errorDetails, errorOrWarningCodeDetailsResponseDto.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorOrWarningCodeDetailsResponseDto {\n");
    
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

