package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PaymentDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentInformationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PaymentInformationTypeI   {
  @JsonProperty("paymentDetails")
  private PaymentDetailsTypeI paymentDetails;

  public PaymentInformationTypeI paymentDetails(PaymentDetailsTypeI paymentDetails) {
    this.paymentDetails = paymentDetails;
    return this;
  }

  /**
   * Get paymentDetails
   * @return paymentDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaymentDetailsTypeI getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(PaymentDetailsTypeI paymentDetails) {
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
    PaymentInformationTypeI paymentInformationTypeI = (PaymentInformationTypeI) o;
    return Objects.equals(this.paymentDetails, paymentInformationTypeI.paymentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformationTypeI {\n");
    
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

