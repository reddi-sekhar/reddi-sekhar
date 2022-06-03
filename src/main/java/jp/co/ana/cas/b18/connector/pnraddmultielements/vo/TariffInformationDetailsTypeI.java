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
 * TariffInformationDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffInformationDetailsTypeI   {
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("amountType")
  private String amountType;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("rateChangeIndicator")
  private String rateChangeIndicator;

  @JsonProperty("ratePlanIndicator")
  private String ratePlanIndicator;

  @JsonProperty("rateType")
  private String rateType;

  public TariffInformationDetailsTypeI amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TariffInformationDetailsTypeI amountType(String amountType) {
    this.amountType = amountType;
    return this;
  }

  /**
   * Get amountType
   * @return amountType
  */
  @ApiModelProperty(value = "")


  public String getAmountType() {
    return amountType;
  }

  public void setAmountType(String amountType) {
    this.amountType = amountType;
  }

  public TariffInformationDetailsTypeI currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public TariffInformationDetailsTypeI rateChangeIndicator(String rateChangeIndicator) {
    this.rateChangeIndicator = rateChangeIndicator;
    return this;
  }

  /**
   * Get rateChangeIndicator
   * @return rateChangeIndicator
  */
  @ApiModelProperty(value = "")


  public String getRateChangeIndicator() {
    return rateChangeIndicator;
  }

  public void setRateChangeIndicator(String rateChangeIndicator) {
    this.rateChangeIndicator = rateChangeIndicator;
  }

  public TariffInformationDetailsTypeI ratePlanIndicator(String ratePlanIndicator) {
    this.ratePlanIndicator = ratePlanIndicator;
    return this;
  }

  /**
   * Get ratePlanIndicator
   * @return ratePlanIndicator
  */
  @ApiModelProperty(value = "")


  public String getRatePlanIndicator() {
    return ratePlanIndicator;
  }

  public void setRatePlanIndicator(String ratePlanIndicator) {
    this.ratePlanIndicator = ratePlanIndicator;
  }

  public TariffInformationDetailsTypeI rateType(String rateType) {
    this.rateType = rateType;
    return this;
  }

  /**
   * Get rateType
   * @return rateType
  */
  @ApiModelProperty(value = "")


  public String getRateType() {
    return rateType;
  }

  public void setRateType(String rateType) {
    this.rateType = rateType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffInformationDetailsTypeI tariffInformationDetailsTypeI = (TariffInformationDetailsTypeI) o;
    return Objects.equals(this.amount, tariffInformationDetailsTypeI.amount) &&
        Objects.equals(this.amountType, tariffInformationDetailsTypeI.amountType) &&
        Objects.equals(this.currency, tariffInformationDetailsTypeI.currency) &&
        Objects.equals(this.rateChangeIndicator, tariffInformationDetailsTypeI.rateChangeIndicator) &&
        Objects.equals(this.ratePlanIndicator, tariffInformationDetailsTypeI.ratePlanIndicator) &&
        Objects.equals(this.rateType, tariffInformationDetailsTypeI.rateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountType, currency, rateChangeIndicator, ratePlanIndicator, rateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffInformationDetailsTypeI {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    rateChangeIndicator: ").append(toIndentedString(rateChangeIndicator)).append("\n");
    sb.append("    ratePlanIndicator: ").append(toIndentedString(ratePlanIndicator)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
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

