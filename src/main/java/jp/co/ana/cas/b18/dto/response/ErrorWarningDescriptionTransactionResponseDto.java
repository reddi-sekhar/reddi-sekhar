package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.FreeTextDetailTransactionResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorWarningDescriptionTransactionResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ErrorWarningDescriptionTransactionResponseDto   {
  @JsonProperty("freeTextDetails")
  private FreeTextDetailTransactionResponseDto freeTextDetails;

  @JsonProperty("freeText")
  private String freeText;

  public ErrorWarningDescriptionTransactionResponseDto freeTextDetails(FreeTextDetailTransactionResponseDto freeTextDetails) {
    this.freeTextDetails = freeTextDetails;
    return this;
  }

  /**
   * Get freeTextDetails
   * @return freeTextDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextDetailTransactionResponseDto getFreeTextDetails() {
    return freeTextDetails;
  }

  public void setFreeTextDetails(FreeTextDetailTransactionResponseDto freeTextDetails) {
    this.freeTextDetails = freeTextDetails;
  }

  public ErrorWarningDescriptionTransactionResponseDto freeText(String freeText) {
    this.freeText = freeText;
    return this;
  }

  /**
   * FOP freeflow
   * @return freeText
  */
  @ApiModelProperty(value = "FOP freeflow")

@Size(min=1,max=999) 
  public String getFreeText() {
    return freeText;
  }

  public void setFreeText(String freeText) {
    this.freeText = freeText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorWarningDescriptionTransactionResponseDto errorWarningDescriptionTransactionResponseDto = (ErrorWarningDescriptionTransactionResponseDto) o;
    return Objects.equals(this.freeTextDetails, errorWarningDescriptionTransactionResponseDto.freeTextDetails) &&
        Objects.equals(this.freeText, errorWarningDescriptionTransactionResponseDto.freeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeTextDetails, freeText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorWarningDescriptionTransactionResponseDto {\n");
    
    sb.append("    freeTextDetails: ").append(toIndentedString(freeTextDetails)).append("\n");
    sb.append("    freeText: ").append(toIndentedString(freeText)).append("\n");
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

