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
 * PaymentDetailsTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PaymentDetailsTypeU   {
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("currencyCode")
  private String currencyCode;

  @JsonProperty("date")
  private String date;

  @JsonProperty("methodCode")
  private String methodCode;

  @JsonProperty("purposeCode")
  private String purposeCode;

  public PaymentDetailsTypeU amount(BigDecimal amount) {
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

  public PaymentDetailsTypeU currencyCode(String currencyCode) {
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

  public PaymentDetailsTypeU date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PaymentDetailsTypeU methodCode(String methodCode) {
    this.methodCode = methodCode;
    return this;
  }

  /**
   * Get methodCode
   * @return methodCode
  */
  @ApiModelProperty(value = "")


  public String getMethodCode() {
    return methodCode;
  }

  public void setMethodCode(String methodCode) {
    this.methodCode = methodCode;
  }

  public PaymentDetailsTypeU purposeCode(String purposeCode) {
    this.purposeCode = purposeCode;
    return this;
  }

  /**
   * Get purposeCode
   * @return purposeCode
  */
  @ApiModelProperty(value = "")


  public String getPurposeCode() {
    return purposeCode;
  }

  public void setPurposeCode(String purposeCode) {
    this.purposeCode = purposeCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetailsTypeU paymentDetailsTypeU = (PaymentDetailsTypeU) o;
    return Objects.equals(this.amount, paymentDetailsTypeU.amount) &&
        Objects.equals(this.currencyCode, paymentDetailsTypeU.currencyCode) &&
        Objects.equals(this.date, paymentDetailsTypeU.date) &&
        Objects.equals(this.methodCode, paymentDetailsTypeU.methodCode) &&
        Objects.equals(this.purposeCode, paymentDetailsTypeU.purposeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode, date, methodCode, purposeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetailsTypeU {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    methodCode: ").append(toIndentedString(methodCode)).append("\n");
    sb.append("    purposeCode: ").append(toIndentedString(purposeCode)).append("\n");
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

