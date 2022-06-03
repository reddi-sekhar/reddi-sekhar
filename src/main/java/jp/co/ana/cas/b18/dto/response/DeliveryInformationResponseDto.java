package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.FreeTextQualificationResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeliveryInformationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DeliveryInformationResponseDto   {
  @JsonProperty("freeTextQualification")
  private FreeTextQualificationResponseDto freeTextQualification;

  @JsonProperty("freeText")
  @Valid
  private List<String> freeText = null;

  public DeliveryInformationResponseDto freeTextQualification(FreeTextQualificationResponseDto freeTextQualification) {
    this.freeTextQualification = freeTextQualification;
    return this;
  }

  /**
   * Get freeTextQualification
   * @return freeTextQualification
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextQualificationResponseDto getFreeTextQualification() {
    return freeTextQualification;
  }

  public void setFreeTextQualification(FreeTextQualificationResponseDto freeTextQualification) {
    this.freeTextQualification = freeTextQualification;
  }

  public DeliveryInformationResponseDto freeText(List<String> freeText) {
    this.freeText = freeText;
    return this;
  }

  public DeliveryInformationResponseDto addFreeTextItem(String freeTextItem) {
    if (this.freeText == null) {
      this.freeText = new ArrayList<>();
    }
    this.freeText.add(freeTextItem);
    return this;
  }

  /**
   * Get freeText
   * @return freeText
  */
  @ApiModelProperty(value = "")


  public List<String> getFreeText() {
    return freeText;
  }

  public void setFreeText(List<String> freeText) {
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
    DeliveryInformationResponseDto deliveryInformationResponseDto = (DeliveryInformationResponseDto) o;
    return Objects.equals(this.freeTextQualification, deliveryInformationResponseDto.freeTextQualification) &&
        Objects.equals(this.freeText, deliveryInformationResponseDto.freeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeTextQualification, freeText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryInformationResponseDto {\n");
    
    sb.append("    freeTextQualification: ").append(toIndentedString(freeTextQualification)).append("\n");
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

