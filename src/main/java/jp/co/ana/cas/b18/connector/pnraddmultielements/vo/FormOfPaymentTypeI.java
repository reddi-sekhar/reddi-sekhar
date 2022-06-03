package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FormOfPaymentDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormOfPaymentTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FormOfPaymentTypeI   {
  @JsonProperty("formOfPayment")
  @Valid
  private List<FormOfPaymentDetailsTypeI> formOfPayment = null;

  public FormOfPaymentTypeI formOfPayment(List<FormOfPaymentDetailsTypeI> formOfPayment) {
    this.formOfPayment = formOfPayment;
    return this;
  }

  public FormOfPaymentTypeI addFormOfPaymentItem(FormOfPaymentDetailsTypeI formOfPaymentItem) {
    if (this.formOfPayment == null) {
      this.formOfPayment = new ArrayList<>();
    }
    this.formOfPayment.add(formOfPaymentItem);
    return this;
  }

  /**
   * Get formOfPayment
   * @return formOfPayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FormOfPaymentDetailsTypeI> getFormOfPayment() {
    return formOfPayment;
  }

  public void setFormOfPayment(List<FormOfPaymentDetailsTypeI> formOfPayment) {
    this.formOfPayment = formOfPayment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormOfPaymentTypeI formOfPaymentTypeI = (FormOfPaymentTypeI) o;
    return Objects.equals(this.formOfPayment, formOfPaymentTypeI.formOfPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formOfPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormOfPaymentTypeI {\n");
    
    sb.append("    formOfPayment: ").append(toIndentedString(formOfPayment)).append("\n");
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

