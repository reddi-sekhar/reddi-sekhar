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
 * ErrorDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ErrorDetailsResponseDto   {
  @JsonProperty("errorCode")
  private String errorCode;

  @JsonProperty("errorCategory")
  private String errorCategory;

  @JsonProperty("errorCodeOwner")
  private String errorCodeOwner;

  public ErrorDetailsResponseDto errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Message number or ZZZ if no number
   * @return errorCode
  */
  @ApiModelProperty(example = "23951", value = "Message number or ZZZ if no number")

@Size(min=1,max=5) 
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorDetailsResponseDto errorCategory(String errorCategory) {
    this.errorCategory = errorCategory;
    return this;
  }

  /**
   * EC for Error codes  WEC for Warning code  INF for Information code
   * @return errorCategory
  */
  @ApiModelProperty(example = "INF", value = "EC for Error codes  WEC for Warning code  INF for Information code")

@Size(min=1,max=3) 
  public String getErrorCategory() {
    return errorCategory;
  }

  public void setErrorCategory(String errorCategory) {
    this.errorCategory = errorCategory;
  }

  public ErrorDetailsResponseDto errorCodeOwner(String errorCodeOwner) {
    this.errorCodeOwner = errorCodeOwner;
    return this;
  }

  /**
   * 3 for IATA UN for UN  1A for AMADEUS
   * @return errorCodeOwner
  */
  @ApiModelProperty(example = "1A", value = "3 for IATA UN for UN  1A for AMADEUS")

@Size(min=1,max=3) 
  public String getErrorCodeOwner() {
    return errorCodeOwner;
  }

  public void setErrorCodeOwner(String errorCodeOwner) {
    this.errorCodeOwner = errorCodeOwner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetailsResponseDto errorDetailsResponseDto = (ErrorDetailsResponseDto) o;
    return Objects.equals(this.errorCode, errorDetailsResponseDto.errorCode) &&
        Objects.equals(this.errorCategory, errorDetailsResponseDto.errorCategory) &&
        Objects.equals(this.errorCodeOwner, errorDetailsResponseDto.errorCodeOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorCategory, errorCodeOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetailsResponseDto {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorCategory: ").append(toIndentedString(errorCategory)).append("\n");
    sb.append("    errorCodeOwner: ").append(toIndentedString(errorCodeOwner)).append("\n");
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

