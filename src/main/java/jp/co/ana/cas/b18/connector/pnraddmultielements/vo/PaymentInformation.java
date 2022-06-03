package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyInformationType25420S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PaymentInformationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PaymentInformation   {
  @JsonProperty("operatorCode")
  private CompanyInformationType25420S operatorCode;

  @JsonProperty("payment")
  private PaymentInformationTypeU payment;

  public PaymentInformation operatorCode(CompanyInformationType25420S operatorCode) {
    this.operatorCode = operatorCode;
    return this;
  }

  /**
   * Get operatorCode
   * @return operatorCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyInformationType25420S getOperatorCode() {
    return operatorCode;
  }

  public void setOperatorCode(CompanyInformationType25420S operatorCode) {
    this.operatorCode = operatorCode;
  }

  public PaymentInformation payment(PaymentInformationTypeU payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaymentInformationTypeU getPayment() {
    return payment;
  }

  public void setPayment(PaymentInformationTypeU payment) {
    this.payment = payment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInformation paymentInformation = (PaymentInformation) o;
    return Objects.equals(this.operatorCode, paymentInformation.operatorCode) &&
        Objects.equals(this.payment, paymentInformation.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorCode, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformation {\n");
    
    sb.append("    operatorCode: ").append(toIndentedString(operatorCode)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

