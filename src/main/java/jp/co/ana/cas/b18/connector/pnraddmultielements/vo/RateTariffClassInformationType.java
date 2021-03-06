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
 * RateTariffClassInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RateTariffClassInformationType   {
  @JsonProperty("otherRateTariffClass")
  private String otherRateTariffClass;

  @JsonProperty("rateTariffClass")
  private String rateTariffClass;

  public RateTariffClassInformationType otherRateTariffClass(String otherRateTariffClass) {
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

  public RateTariffClassInformationType rateTariffClass(String rateTariffClass) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateTariffClassInformationType rateTariffClassInformationType = (RateTariffClassInformationType) o;
    return Objects.equals(this.otherRateTariffClass, rateTariffClassInformationType.otherRateTariffClass) &&
        Objects.equals(this.rateTariffClass, rateTariffClassInformationType.rateTariffClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherRateTariffClass, rateTariffClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateTariffClassInformationType {\n");
    
    sb.append("    otherRateTariffClass: ").append(toIndentedString(otherRateTariffClass)).append("\n");
    sb.append("    rateTariffClass: ").append(toIndentedString(rateTariffClass)).append("\n");
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

