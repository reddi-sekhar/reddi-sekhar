package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RateTariffClassInformationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RateTariffClassInformationTypeI   {
  @JsonProperty("otherRateTariffClass")
  private String otherRateTariffClass;

  @JsonProperty("otherRateTariffIndicator")
  private String otherRateTariffIndicator;

  @JsonProperty("rateTariffClass")
  private String rateTariffClass;

  @JsonProperty("rateTariffIndicator")
  private String rateTariffIndicator;

  public RateTariffClassInformationTypeI otherRateTariffClass(String otherRateTariffClass) {
    this.otherRateTariffClass = otherRateTariffClass;
    return this;
  }

  /**
   * Get otherRateTariffClass
   * @return otherRateTariffClass
  */
  @ApiModelProperty(value = "")


  public String getOtherRateTariffClass() {
    return otherRateTariffClass;
  }

  public void setOtherRateTariffClass(String otherRateTariffClass) {
    this.otherRateTariffClass = otherRateTariffClass;
  }

  public RateTariffClassInformationTypeI otherRateTariffIndicator(String otherRateTariffIndicator) {
    this.otherRateTariffIndicator = otherRateTariffIndicator;
    return this;
  }

  /**
   * Get otherRateTariffIndicator
   * @return otherRateTariffIndicator
  */
  @ApiModelProperty(value = "")


  public String getOtherRateTariffIndicator() {
    return otherRateTariffIndicator;
  }

  public void setOtherRateTariffIndicator(String otherRateTariffIndicator) {
    this.otherRateTariffIndicator = otherRateTariffIndicator;
  }

  public RateTariffClassInformationTypeI rateTariffClass(String rateTariffClass) {
    this.rateTariffClass = rateTariffClass;
    return this;
  }

  /**
   * Get rateTariffClass
   * @return rateTariffClass
  */
  @ApiModelProperty(value = "")


  public String getRateTariffClass() {
    return rateTariffClass;
  }

  public void setRateTariffClass(String rateTariffClass) {
    this.rateTariffClass = rateTariffClass;
  }

  public RateTariffClassInformationTypeI rateTariffIndicator(String rateTariffIndicator) {
    this.rateTariffIndicator = rateTariffIndicator;
    return this;
  }

  /**
   * Get rateTariffIndicator
   * @return rateTariffIndicator
  */
  @ApiModelProperty(value = "")


  public String getRateTariffIndicator() {
    return rateTariffIndicator;
  }

  public void setRateTariffIndicator(String rateTariffIndicator) {
    this.rateTariffIndicator = rateTariffIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateTariffClassInformationTypeI rateTariffClassInformationTypeI = (RateTariffClassInformationTypeI) o;
    return Objects.equals(this.otherRateTariffClass, rateTariffClassInformationTypeI.otherRateTariffClass) &&
        Objects.equals(this.otherRateTariffIndicator, rateTariffClassInformationTypeI.otherRateTariffIndicator) &&
        Objects.equals(this.rateTariffClass, rateTariffClassInformationTypeI.rateTariffClass) &&
        Objects.equals(this.rateTariffIndicator, rateTariffClassInformationTypeI.rateTariffIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherRateTariffClass, otherRateTariffIndicator, rateTariffClass, rateTariffIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateTariffClassInformationTypeI {\n");
    
    sb.append("    otherRateTariffClass: ").append(toIndentedString(otherRateTariffClass)).append("\n");
    sb.append("    otherRateTariffIndicator: ").append(toIndentedString(otherRateTariffIndicator)).append("\n");
    sb.append("    rateTariffClass: ").append(toIndentedString(rateTariffClass)).append("\n");
    sb.append("    rateTariffIndicator: ").append(toIndentedString(rateTariffIndicator)).append("\n");
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

