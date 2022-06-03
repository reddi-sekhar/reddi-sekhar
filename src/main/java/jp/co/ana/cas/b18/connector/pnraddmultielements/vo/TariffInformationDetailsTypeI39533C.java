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
 * TariffInformationDetailsTypeI39533C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffInformationDetailsTypeI39533C   {
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("amountType")
  private String amountType;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("totalAmount")
  private BigDecimal totalAmount;

  public TariffInformationDetailsTypeI39533C amount(BigDecimal amount) {
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

  public TariffInformationDetailsTypeI39533C amountType(String amountType) {
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

  public TariffInformationDetailsTypeI39533C currency(String currency) {
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

  public TariffInformationDetailsTypeI39533C totalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffInformationDetailsTypeI39533C tariffInformationDetailsTypeI39533C = (TariffInformationDetailsTypeI39533C) o;
    return Objects.equals(this.amount, tariffInformationDetailsTypeI39533C.amount) &&
        Objects.equals(this.amountType, tariffInformationDetailsTypeI39533C.amountType) &&
        Objects.equals(this.currency, tariffInformationDetailsTypeI39533C.currency) &&
        Objects.equals(this.totalAmount, tariffInformationDetailsTypeI39533C.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountType, currency, totalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffInformationDetailsTypeI39533C {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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

