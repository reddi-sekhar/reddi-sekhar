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
 * GeneralErrorInfoResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class GeneralErrorInfoResponseDto   {
  @JsonProperty("errorOrWarningCodeDetails")
  private ErrorOrWarningCodeDetailsResponseDto errorOrWarningCodeDetails;

  @JsonProperty("errorWarningDescription")
  private ErrorWarningDescriptionResponseDto errorWarningDescription;

  public GeneralErrorInfoResponseDto errorOrWarningCodeDetails(ErrorOrWarningCodeDetailsResponseDto errorOrWarningCodeDetails) {
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

  public GeneralErrorInfoResponseDto errorWarningDescription(ErrorWarningDescriptionResponseDto errorWarningDescription) {
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
    GeneralErrorInfoResponseDto generalErrorInfoResponseDto = (GeneralErrorInfoResponseDto) o;
    return Objects.equals(this.errorOrWarningCodeDetails, generalErrorInfoResponseDto.errorOrWarningCodeDetails) &&
        Objects.equals(this.errorWarningDescription, generalErrorInfoResponseDto.errorWarningDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorOrWarningCodeDetails, errorWarningDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralErrorInfoResponseDto {\n");
    
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

