package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FormOfPaymentTypeI29553S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PaymentInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GuaranteeOrDeposit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class GuaranteeOrDeposit   {
  @JsonProperty("creditCardInfo")
  private FormOfPaymentTypeI29553S creditCardInfo;

  @JsonProperty("paymentInfo")
  private PaymentInformationTypeI paymentInfo;

  public GuaranteeOrDeposit creditCardInfo(FormOfPaymentTypeI29553S creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
    return this;
  }

  /**
   * Get creditCardInfo
   * @return creditCardInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FormOfPaymentTypeI29553S getCreditCardInfo() {
    return creditCardInfo;
  }

  public void setCreditCardInfo(FormOfPaymentTypeI29553S creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
  }

  public GuaranteeOrDeposit paymentInfo(PaymentInformationTypeI paymentInfo) {
    this.paymentInfo = paymentInfo;
    return this;
  }

  /**
   * Get paymentInfo
   * @return paymentInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaymentInformationTypeI getPaymentInfo() {
    return paymentInfo;
  }

  public void setPaymentInfo(PaymentInformationTypeI paymentInfo) {
    this.paymentInfo = paymentInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuaranteeOrDeposit guaranteeOrDeposit = (GuaranteeOrDeposit) o;
    return Objects.equals(this.creditCardInfo, guaranteeOrDeposit.creditCardInfo) &&
        Objects.equals(this.paymentInfo, guaranteeOrDeposit.paymentInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardInfo, paymentInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuaranteeOrDeposit {\n");
    
    sb.append("    creditCardInfo: ").append(toIndentedString(creditCardInfo)).append("\n");
    sb.append("    paymentInfo: ").append(toIndentedString(paymentInfo)).append("\n");
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

