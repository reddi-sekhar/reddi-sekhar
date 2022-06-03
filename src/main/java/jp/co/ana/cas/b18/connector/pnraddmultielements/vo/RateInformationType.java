package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RateIndicatorsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RateInformationDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RatePriceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RateInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RateInformationType   {
  @JsonProperty("rateIndicator")
  private RateIndicatorsType rateIndicator;

  @JsonProperty("rateInfo")
  private RateInformationDetailsType rateInfo;

  @JsonProperty("ratePrice")
  private RatePriceType ratePrice;

  public RateInformationType rateIndicator(RateIndicatorsType rateIndicator) {
    this.rateIndicator = rateIndicator;
    return this;
  }

  /**
   * Get rateIndicator
   * @return rateIndicator
  */
  @ApiModelProperty(value = "")

  @Valid

  public RateIndicatorsType getRateIndicator() {
    return rateIndicator;
  }

  public void setRateIndicator(RateIndicatorsType rateIndicator) {
    this.rateIndicator = rateIndicator;
  }

  public RateInformationType rateInfo(RateInformationDetailsType rateInfo) {
    this.rateInfo = rateInfo;
    return this;
  }

  /**
   * Get rateInfo
   * @return rateInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public RateInformationDetailsType getRateInfo() {
    return rateInfo;
  }

  public void setRateInfo(RateInformationDetailsType rateInfo) {
    this.rateInfo = rateInfo;
  }

  public RateInformationType ratePrice(RatePriceType ratePrice) {
    this.ratePrice = ratePrice;
    return this;
  }

  /**
   * Get ratePrice
   * @return ratePrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public RatePriceType getRatePrice() {
    return ratePrice;
  }

  public void setRatePrice(RatePriceType ratePrice) {
    this.ratePrice = ratePrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateInformationType rateInformationType = (RateInformationType) o;
    return Objects.equals(this.rateIndicator, rateInformationType.rateIndicator) &&
        Objects.equals(this.rateInfo, rateInformationType.rateInfo) &&
        Objects.equals(this.ratePrice, rateInformationType.ratePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateIndicator, rateInfo, ratePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateInformationType {\n");
    
    sb.append("    rateIndicator: ").append(toIndentedString(rateIndicator)).append("\n");
    sb.append("    rateInfo: ").append(toIndentedString(rateInfo)).append("\n");
    sb.append("    ratePrice: ").append(toIndentedString(ratePrice)).append("\n");
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

