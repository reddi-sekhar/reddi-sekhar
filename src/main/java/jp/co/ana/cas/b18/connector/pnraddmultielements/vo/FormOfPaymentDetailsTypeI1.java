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
 * FormOfPaymentDetailsTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FormOfPaymentDetailsTypeI1   {
  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("approvalCode")
  private String approvalCode;

  @JsonProperty("creditCardCode")
  private String creditCardCode;

  @JsonProperty("currencyCode")
  private String currencyCode;

  @JsonProperty("customerAccountNumber")
  private String customerAccountNumber;

  @JsonProperty("expiryDate")
  private String expiryDate;

  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("identification")
  private String identification;

  @JsonProperty("paymentTimeReference")
  private String paymentTimeReference;

  public FormOfPaymentDetailsTypeI1 accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  */
  @ApiModelProperty(value = "")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public FormOfPaymentDetailsTypeI1 amount(BigDecimal amount) {
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

  public FormOfPaymentDetailsTypeI1 approvalCode(String approvalCode) {
    this.approvalCode = approvalCode;
    return this;
  }

  /**
   * Get approvalCode
   * @return approvalCode
  */
  @ApiModelProperty(value = "")


  public String getApprovalCode() {
    return approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public FormOfPaymentDetailsTypeI1 creditCardCode(String creditCardCode) {
    this.creditCardCode = creditCardCode;
    return this;
  }

  /**
   * Get creditCardCode
   * @return creditCardCode
  */
  @ApiModelProperty(value = "")


  public String getCreditCardCode() {
    return creditCardCode;
  }

  public void setCreditCardCode(String creditCardCode) {
    this.creditCardCode = creditCardCode;
  }

  public FormOfPaymentDetailsTypeI1 currencyCode(String currencyCode) {
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

  public FormOfPaymentDetailsTypeI1 customerAccountNumber(String customerAccountNumber) {
    this.customerAccountNumber = customerAccountNumber;
    return this;
  }

  /**
   * Get customerAccountNumber
   * @return customerAccountNumber
  */
  @ApiModelProperty(value = "")


  public String getCustomerAccountNumber() {
    return customerAccountNumber;
  }

  public void setCustomerAccountNumber(String customerAccountNumber) {
    this.customerAccountNumber = customerAccountNumber;
  }

  public FormOfPaymentDetailsTypeI1 expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
  */
  @ApiModelProperty(value = "")


  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public FormOfPaymentDetailsTypeI1 freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

  /**
   * Get freetext
   * @return freetext
  */
  @ApiModelProperty(value = "")


  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public FormOfPaymentDetailsTypeI1 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  */
  @ApiModelProperty(value = "")


  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public FormOfPaymentDetailsTypeI1 paymentTimeReference(String paymentTimeReference) {
    this.paymentTimeReference = paymentTimeReference;
    return this;
  }

  /**
   * Get paymentTimeReference
   * @return paymentTimeReference
  */
  @ApiModelProperty(value = "")


  public String getPaymentTimeReference() {
    return paymentTimeReference;
  }

  public void setPaymentTimeReference(String paymentTimeReference) {
    this.paymentTimeReference = paymentTimeReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormOfPaymentDetailsTypeI1 formOfPaymentDetailsTypeI1 = (FormOfPaymentDetailsTypeI1) o;
    return Objects.equals(this.accountNumber, formOfPaymentDetailsTypeI1.accountNumber) &&
        Objects.equals(this.amount, formOfPaymentDetailsTypeI1.amount) &&
        Objects.equals(this.approvalCode, formOfPaymentDetailsTypeI1.approvalCode) &&
        Objects.equals(this.creditCardCode, formOfPaymentDetailsTypeI1.creditCardCode) &&
        Objects.equals(this.currencyCode, formOfPaymentDetailsTypeI1.currencyCode) &&
        Objects.equals(this.customerAccountNumber, formOfPaymentDetailsTypeI1.customerAccountNumber) &&
        Objects.equals(this.expiryDate, formOfPaymentDetailsTypeI1.expiryDate) &&
        Objects.equals(this.freetext, formOfPaymentDetailsTypeI1.freetext) &&
        Objects.equals(this.identification, formOfPaymentDetailsTypeI1.identification) &&
        Objects.equals(this.paymentTimeReference, formOfPaymentDetailsTypeI1.paymentTimeReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, amount, approvalCode, creditCardCode, currencyCode, customerAccountNumber, expiryDate, freetext, identification, paymentTimeReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormOfPaymentDetailsTypeI1 {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    creditCardCode: ").append(toIndentedString(creditCardCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    customerAccountNumber: ").append(toIndentedString(customerAccountNumber)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    paymentTimeReference: ").append(toIndentedString(paymentTimeReference)).append("\n");
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

