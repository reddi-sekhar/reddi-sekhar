package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FormOfPaymentDetailsTypeI20667C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormOfPaymentTypeI16862S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FormOfPaymentTypeI16862S   {
  @JsonProperty("formOfPayment")
  private FormOfPaymentDetailsTypeI20667C formOfPayment;

  @JsonProperty("otherFormOfPayment")
  @Valid
  private List<FormOfPaymentDetailsTypeI20667C> otherFormOfPayment = null;

  public FormOfPaymentTypeI16862S formOfPayment(FormOfPaymentDetailsTypeI20667C formOfPayment) {
    this.formOfPayment = formOfPayment;
    return this;
  }

  /**
   * Get formOfPayment
   * @return formOfPayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public FormOfPaymentDetailsTypeI20667C getFormOfPayment() {
    return formOfPayment;
  }

  public void setFormOfPayment(FormOfPaymentDetailsTypeI20667C formOfPayment) {
    this.formOfPayment = formOfPayment;
  }

  public FormOfPaymentTypeI16862S otherFormOfPayment(List<FormOfPaymentDetailsTypeI20667C> otherFormOfPayment) {
    this.otherFormOfPayment = otherFormOfPayment;
    return this;
  }

  public FormOfPaymentTypeI16862S addOtherFormOfPaymentItem(FormOfPaymentDetailsTypeI20667C otherFormOfPaymentItem) {
    if (this.otherFormOfPayment == null) {
      this.otherFormOfPayment = new ArrayList<>();
    }
    this.otherFormOfPayment.add(otherFormOfPaymentItem);
    return this;
  }

  /**
   * Get otherFormOfPayment
   * @return otherFormOfPayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FormOfPaymentDetailsTypeI20667C> getOtherFormOfPayment() {
    return otherFormOfPayment;
  }

  public void setOtherFormOfPayment(List<FormOfPaymentDetailsTypeI20667C> otherFormOfPayment) {
    this.otherFormOfPayment = otherFormOfPayment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormOfPaymentTypeI16862S formOfPaymentTypeI16862S = (FormOfPaymentTypeI16862S) o;
    return Objects.equals(this.formOfPayment, formOfPaymentTypeI16862S.formOfPayment) &&
        Objects.equals(this.otherFormOfPayment, formOfPaymentTypeI16862S.otherFormOfPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formOfPayment, otherFormOfPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormOfPaymentTypeI16862S {\n");
    
    sb.append("    formOfPayment: ").append(toIndentedString(formOfPayment)).append("\n");
    sb.append("    otherFormOfPayment: ").append(toIndentedString(otherFormOfPayment)).append("\n");
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

