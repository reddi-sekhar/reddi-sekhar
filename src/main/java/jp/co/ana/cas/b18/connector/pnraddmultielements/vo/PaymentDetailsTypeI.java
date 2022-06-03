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
 * PaymentDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PaymentDetailsTypeI   {
  @JsonProperty("formOfPaymentCode")
  private String formOfPaymentCode;

  @JsonProperty("paymentType")
  private String paymentType;

  @JsonProperty("referenceNumber")
  private String referenceNumber;

  @JsonProperty("serviceToPay")
  private String serviceToPay;

  public PaymentDetailsTypeI formOfPaymentCode(String formOfPaymentCode) {
    this.formOfPaymentCode = formOfPaymentCode;
    return this;
  }

  /**
   * Get formOfPaymentCode
   * @return formOfPaymentCode
  */
  @ApiModelProperty(value = "")


  public String getFormOfPaymentCode() {
    return formOfPaymentCode;
  }

  public void setFormOfPaymentCode(String formOfPaymentCode) {
    this.formOfPaymentCode = formOfPaymentCode;
  }

  public PaymentDetailsTypeI paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  */
  @ApiModelProperty(value = "")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public PaymentDetailsTypeI referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Get referenceNumber
   * @return referenceNumber
  */
  @ApiModelProperty(value = "")


  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public PaymentDetailsTypeI serviceToPay(String serviceToPay) {
    this.serviceToPay = serviceToPay;
    return this;
  }

  /**
   * Get serviceToPay
   * @return serviceToPay
  */
  @ApiModelProperty(value = "")


  public String getServiceToPay() {
    return serviceToPay;
  }

  public void setServiceToPay(String serviceToPay) {
    this.serviceToPay = serviceToPay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetailsTypeI paymentDetailsTypeI = (PaymentDetailsTypeI) o;
    return Objects.equals(this.formOfPaymentCode, paymentDetailsTypeI.formOfPaymentCode) &&
        Objects.equals(this.paymentType, paymentDetailsTypeI.paymentType) &&
        Objects.equals(this.referenceNumber, paymentDetailsTypeI.referenceNumber) &&
        Objects.equals(this.serviceToPay, paymentDetailsTypeI.serviceToPay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formOfPaymentCode, paymentType, referenceNumber, serviceToPay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetailsTypeI {\n");
    
    sb.append("    formOfPaymentCode: ").append(toIndentedString(formOfPaymentCode)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    serviceToPay: ").append(toIndentedString(serviceToPay)).append("\n");
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

