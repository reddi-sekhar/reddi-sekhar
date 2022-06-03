package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CreditCardInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PaymentDetailsTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PaymentInformationTypeU   {
  @JsonProperty("creditCardInformation")
  private CreditCardInformationTypeU creditCardInformation;

  @JsonProperty("paymentDetails")
  private PaymentDetailsTypeU paymentDetails;

  public PaymentInformationTypeU creditCardInformation(CreditCardInformationTypeU creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
    return this;
  }

  /**
   * Get creditCardInformation
   * @return creditCardInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public CreditCardInformationTypeU getCreditCardInformation() {
    return creditCardInformation;
  }

  public void setCreditCardInformation(CreditCardInformationTypeU creditCardInformation) {
    this.creditCardInformation = creditCardInformation;
  }

  public PaymentInformationTypeU paymentDetails(PaymentDetailsTypeU paymentDetails) {
    this.paymentDetails = paymentDetails;
    return this;
  }

  /**
   * Get paymentDetails
   * @return paymentDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaymentDetailsTypeU getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(PaymentDetailsTypeU paymentDetails) {
    this.paymentDetails = paymentDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInformationTypeU paymentInformationTypeU = (PaymentInformationTypeU) o;
    return Objects.equals(this.creditCardInformation, paymentInformationTypeU.creditCardInformation) &&
        Objects.equals(this.paymentDetails, paymentInformationTypeU.paymentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardInformation, paymentDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformationTypeU {\n");
    
    sb.append("    creditCardInformation: ").append(toIndentedString(creditCardInformation)).append("\n");
    sb.append("    paymentDetails: ").append(toIndentedString(paymentDetails)).append("\n");
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

