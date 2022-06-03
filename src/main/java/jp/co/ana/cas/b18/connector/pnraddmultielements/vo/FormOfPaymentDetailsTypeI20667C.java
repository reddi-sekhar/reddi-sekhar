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
 * FormOfPaymentDetailsTypeI20667C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FormOfPaymentDetailsTypeI20667C   {
  @JsonProperty("addressVerification")
  private String addressVerification;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("approvalCode")
  private String approvalCode;

  @JsonProperty("authorisedAmount")
  private BigDecimal authorisedAmount;

  @JsonProperty("creditCardNumber")
  private String creditCardNumber;

  @JsonProperty("customerAccount")
  private String customerAccount;

  @JsonProperty("expiryDate")
  private String expiryDate;

  @JsonProperty("extendedPayment")
  private String extendedPayment;

  @JsonProperty("fopFreeText")
  private String fopFreeText;

  @JsonProperty("indicator")
  private String indicator;

  @JsonProperty("membershipStatus")
  private String membershipStatus;

  @JsonProperty("sourceOfApproval")
  private String sourceOfApproval;

  @JsonProperty("transactionInfo")
  private String transactionInfo;

  @JsonProperty("type")
  private String type;

  @JsonProperty("vendorCode")
  private String vendorCode;

  public FormOfPaymentDetailsTypeI20667C addressVerification(String addressVerification) {
    this.addressVerification = addressVerification;
    return this;
  }

  /**
   * Get addressVerification
   * @return addressVerification
  */
  @ApiModelProperty(value = "")


  public String getAddressVerification() {
    return addressVerification;
  }

  public void setAddressVerification(String addressVerification) {
    this.addressVerification = addressVerification;
  }

  public FormOfPaymentDetailsTypeI20667C amount(BigDecimal amount) {
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

  public FormOfPaymentDetailsTypeI20667C approvalCode(String approvalCode) {
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

  public FormOfPaymentDetailsTypeI20667C authorisedAmount(BigDecimal authorisedAmount) {
    this.authorisedAmount = authorisedAmount;
    return this;
  }

  /**
   * Get authorisedAmount
   * @return authorisedAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAuthorisedAmount() {
    return authorisedAmount;
  }

  public void setAuthorisedAmount(BigDecimal authorisedAmount) {
    this.authorisedAmount = authorisedAmount;
  }

  public FormOfPaymentDetailsTypeI20667C creditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
    return this;
  }

  /**
   * Get creditCardNumber
   * @return creditCardNumber
  */
  @ApiModelProperty(value = "")


  public String getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public FormOfPaymentDetailsTypeI20667C customerAccount(String customerAccount) {
    this.customerAccount = customerAccount;
    return this;
  }

  /**
   * Get customerAccount
   * @return customerAccount
  */
  @ApiModelProperty(value = "")


  public String getCustomerAccount() {
    return customerAccount;
  }

  public void setCustomerAccount(String customerAccount) {
    this.customerAccount = customerAccount;
  }

  public FormOfPaymentDetailsTypeI20667C expiryDate(String expiryDate) {
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

  public FormOfPaymentDetailsTypeI20667C extendedPayment(String extendedPayment) {
    this.extendedPayment = extendedPayment;
    return this;
  }

  /**
   * Get extendedPayment
   * @return extendedPayment
  */
  @ApiModelProperty(value = "")


  public String getExtendedPayment() {
    return extendedPayment;
  }

  public void setExtendedPayment(String extendedPayment) {
    this.extendedPayment = extendedPayment;
  }

  public FormOfPaymentDetailsTypeI20667C fopFreeText(String fopFreeText) {
    this.fopFreeText = fopFreeText;
    return this;
  }

  /**
   * Get fopFreeText
   * @return fopFreeText
  */
  @ApiModelProperty(value = "")


  public String getFopFreeText() {
    return fopFreeText;
  }

  public void setFopFreeText(String fopFreeText) {
    this.fopFreeText = fopFreeText;
  }

  public FormOfPaymentDetailsTypeI20667C indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Get indicator
   * @return indicator
  */
  @ApiModelProperty(value = "")


  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public FormOfPaymentDetailsTypeI20667C membershipStatus(String membershipStatus) {
    this.membershipStatus = membershipStatus;
    return this;
  }

  /**
   * Get membershipStatus
   * @return membershipStatus
  */
  @ApiModelProperty(value = "")


  public String getMembershipStatus() {
    return membershipStatus;
  }

  public void setMembershipStatus(String membershipStatus) {
    this.membershipStatus = membershipStatus;
  }

  public FormOfPaymentDetailsTypeI20667C sourceOfApproval(String sourceOfApproval) {
    this.sourceOfApproval = sourceOfApproval;
    return this;
  }

  /**
   * Get sourceOfApproval
   * @return sourceOfApproval
  */
  @ApiModelProperty(value = "")


  public String getSourceOfApproval() {
    return sourceOfApproval;
  }

  public void setSourceOfApproval(String sourceOfApproval) {
    this.sourceOfApproval = sourceOfApproval;
  }

  public FormOfPaymentDetailsTypeI20667C transactionInfo(String transactionInfo) {
    this.transactionInfo = transactionInfo;
    return this;
  }

  /**
   * Get transactionInfo
   * @return transactionInfo
  */
  @ApiModelProperty(value = "")


  public String getTransactionInfo() {
    return transactionInfo;
  }

  public void setTransactionInfo(String transactionInfo) {
    this.transactionInfo = transactionInfo;
  }

  public FormOfPaymentDetailsTypeI20667C type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FormOfPaymentDetailsTypeI20667C vendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
    return this;
  }

  /**
   * Get vendorCode
   * @return vendorCode
  */
  @ApiModelProperty(value = "")


  public String getVendorCode() {
    return vendorCode;
  }

  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormOfPaymentDetailsTypeI20667C formOfPaymentDetailsTypeI20667C = (FormOfPaymentDetailsTypeI20667C) o;
    return Objects.equals(this.addressVerification, formOfPaymentDetailsTypeI20667C.addressVerification) &&
        Objects.equals(this.amount, formOfPaymentDetailsTypeI20667C.amount) &&
        Objects.equals(this.approvalCode, formOfPaymentDetailsTypeI20667C.approvalCode) &&
        Objects.equals(this.authorisedAmount, formOfPaymentDetailsTypeI20667C.authorisedAmount) &&
        Objects.equals(this.creditCardNumber, formOfPaymentDetailsTypeI20667C.creditCardNumber) &&
        Objects.equals(this.customerAccount, formOfPaymentDetailsTypeI20667C.customerAccount) &&
        Objects.equals(this.expiryDate, formOfPaymentDetailsTypeI20667C.expiryDate) &&
        Objects.equals(this.extendedPayment, formOfPaymentDetailsTypeI20667C.extendedPayment) &&
        Objects.equals(this.fopFreeText, formOfPaymentDetailsTypeI20667C.fopFreeText) &&
        Objects.equals(this.indicator, formOfPaymentDetailsTypeI20667C.indicator) &&
        Objects.equals(this.membershipStatus, formOfPaymentDetailsTypeI20667C.membershipStatus) &&
        Objects.equals(this.sourceOfApproval, formOfPaymentDetailsTypeI20667C.sourceOfApproval) &&
        Objects.equals(this.transactionInfo, formOfPaymentDetailsTypeI20667C.transactionInfo) &&
        Objects.equals(this.type, formOfPaymentDetailsTypeI20667C.type) &&
        Objects.equals(this.vendorCode, formOfPaymentDetailsTypeI20667C.vendorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressVerification, amount, approvalCode, authorisedAmount, creditCardNumber, customerAccount, expiryDate, extendedPayment, fopFreeText, indicator, membershipStatus, sourceOfApproval, transactionInfo, type, vendorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormOfPaymentDetailsTypeI20667C {\n");
    
    sb.append("    addressVerification: ").append(toIndentedString(addressVerification)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    approvalCode: ").append(toIndentedString(approvalCode)).append("\n");
    sb.append("    authorisedAmount: ").append(toIndentedString(authorisedAmount)).append("\n");
    sb.append("    creditCardNumber: ").append(toIndentedString(creditCardNumber)).append("\n");
    sb.append("    customerAccount: ").append(toIndentedString(customerAccount)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    extendedPayment: ").append(toIndentedString(extendedPayment)).append("\n");
    sb.append("    fopFreeText: ").append(toIndentedString(fopFreeText)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    membershipStatus: ").append(toIndentedString(membershipStatus)).append("\n");
    sb.append("    sourceOfApproval: ").append(toIndentedString(sourceOfApproval)).append("\n");
    sb.append("    transactionInfo: ").append(toIndentedString(transactionInfo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vendorCode: ").append(toIndentedString(vendorCode)).append("\n");
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

