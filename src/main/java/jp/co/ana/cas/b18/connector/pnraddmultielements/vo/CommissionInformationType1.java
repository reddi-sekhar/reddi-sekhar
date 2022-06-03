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
 * CommissionInformationType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CommissionInformationType1   {
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("percentage")
  private BigDecimal percentage;

  @JsonProperty("remitIndicator")
  private String remitIndicator;

  @JsonProperty("vatIndicator")
  private String vatIndicator;

  public CommissionInformationType1 amount(BigDecimal amount) {
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

  public CommissionInformationType1 percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Get percentage
   * @return percentage
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }

  public CommissionInformationType1 remitIndicator(String remitIndicator) {
    this.remitIndicator = remitIndicator;
    return this;
  }

  /**
   * Get remitIndicator
   * @return remitIndicator
  */
  @ApiModelProperty(value = "")


  public String getRemitIndicator() {
    return remitIndicator;
  }

  public void setRemitIndicator(String remitIndicator) {
    this.remitIndicator = remitIndicator;
  }

  public CommissionInformationType1 vatIndicator(String vatIndicator) {
    this.vatIndicator = vatIndicator;
    return this;
  }

  /**
   * Get vatIndicator
   * @return vatIndicator
  */
  @ApiModelProperty(value = "")


  public String getVatIndicator() {
    return vatIndicator;
  }

  public void setVatIndicator(String vatIndicator) {
    this.vatIndicator = vatIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommissionInformationType1 commissionInformationType1 = (CommissionInformationType1) o;
    return Objects.equals(this.amount, commissionInformationType1.amount) &&
        Objects.equals(this.percentage, commissionInformationType1.percentage) &&
        Objects.equals(this.remitIndicator, commissionInformationType1.remitIndicator) &&
        Objects.equals(this.vatIndicator, commissionInformationType1.vatIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, percentage, remitIndicator, vatIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommissionInformationType1 {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    remitIndicator: ").append(toIndentedString(remitIndicator)).append("\n");
    sb.append("    vatIndicator: ").append(toIndentedString(vatIndicator)).append("\n");
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

