package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TariffInformationDetailsTypeI50731C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffInformationDetailsTypeI50731C   {
  @JsonProperty("currencyCode")
  private String currencyCode;

  @JsonProperty("fareBaseAmount")
  private BigDecimal fareBaseAmount;

  @JsonProperty("fareBasisCode")
  private String fareBasisCode;

  public TariffInformationDetailsTypeI50731C currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
  */
  @ApiModelProperty(value = "")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public TariffInformationDetailsTypeI50731C fareBaseAmount(BigDecimal fareBaseAmount) {
    this.fareBaseAmount = fareBaseAmount;
    return this;
  }

  /**
   * Get fareBaseAmount
   * @return fareBaseAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFareBaseAmount() {
    return fareBaseAmount;
  }

  public void setFareBaseAmount(BigDecimal fareBaseAmount) {
    this.fareBaseAmount = fareBaseAmount;
  }

  public TariffInformationDetailsTypeI50731C fareBasisCode(String fareBasisCode) {
    this.fareBasisCode = fareBasisCode;
    return this;
  }

  /**
   * Get fareBasisCode
   * @return fareBasisCode
  */
  @ApiModelProperty(value = "")


  public String getFareBasisCode() {
    return fareBasisCode;
  }

  public void setFareBasisCode(String fareBasisCode) {
    this.fareBasisCode = fareBasisCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffInformationDetailsTypeI50731C tariffInformationDetailsTypeI50731C = (TariffInformationDetailsTypeI50731C) o;
    return Objects.equals(this.currencyCode, tariffInformationDetailsTypeI50731C.currencyCode) &&
        Objects.equals(this.fareBaseAmount, tariffInformationDetailsTypeI50731C.fareBaseAmount) &&
        Objects.equals(this.fareBasisCode, tariffInformationDetailsTypeI50731C.fareBasisCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, fareBaseAmount, fareBasisCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffInformationDetailsTypeI50731C {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    fareBaseAmount: ").append(toIndentedString(fareBaseAmount)).append("\n");
    sb.append("    fareBasisCode: ").append(toIndentedString(fareBasisCode)).append("\n");
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

