package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.ErrorOrWarningCodeDetailsResponseDto;
import jp.co.ana.cas.b18.dto.response.ErrorWarningDescriptionResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NameErrorResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class NameErrorResponseDto   {
  @JsonProperty("errorOrWarningCodeDetails")
  private ErrorOrWarningCodeDetailsResponseDto errorOrWarningCodeDetails;

  @JsonProperty("errorWarningDescription")
  private ErrorWarningDescriptionResponseDto errorWarningDescription;

  public NameErrorResponseDto errorOrWarningCodeDetails(ErrorOrWarningCodeDetailsResponseDto errorOrWarningCodeDetails) {
    this.errorOrWarningCodeDetails = errorOrWarningCodeDetails;
    return this;
  }

  /**
   * Get errorOrWarningCodeDetails
   * @return errorOrWarningCodeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorOrWarningCodeDetailsResponseDto getErrorOrWarningCodeDetails() {
    return errorOrWarningCodeDetails;
  }

  public void setErrorOrWarningCodeDetails(ErrorOrWarningCodeDetailsResponseDto errorOrWarningCodeDetails) {
    this.errorOrWarningCodeDetails = errorOrWarningCodeDetails;
  }

  public NameErrorResponseDto errorWarningDescription(ErrorWarningDescriptionResponseDto errorWarningDescription) {
    this.errorWarningDescription = errorWarningDescription;
    return this;
  }

  /**
   * Get errorWarningDescription
   * @return errorWarningDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorWarningDescriptionResponseDto getErrorWarningDescription() {
    return errorWarningDescription;
  }

  public void setErrorWarningDescription(ErrorWarningDescriptionResponseDto errorWarningDescription) {
    this.errorWarningDescription = errorWarningDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameErrorResponseDto nameErrorResponseDto = (NameErrorResponseDto) o;
    return Objects.equals(this.errorOrWarningCodeDetails, nameErrorResponseDto.errorOrWarningCodeDetails) &&
        Objects.equals(this.errorWarningDescription, nameErrorResponseDto.errorWarningDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorOrWarningCodeDetails, errorWarningDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameErrorResponseDto {\n");
    
    sb.append("    errorOrWarningCodeDetails: ").append(toIndentedString(errorOrWarningCodeDetails)).append("\n");
    sb.append("    errorWarningDescription: ").append(toIndentedString(errorWarningDescription)).append("\n");
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

