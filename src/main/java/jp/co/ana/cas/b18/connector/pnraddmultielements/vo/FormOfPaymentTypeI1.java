package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FormOfPaymentDetailsTypeI1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormOfPaymentTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FormOfPaymentTypeI1   {
  @JsonProperty("fop")
  @Valid
  private List<FormOfPaymentDetailsTypeI1> fop = null;

  public FormOfPaymentTypeI1 fop(List<FormOfPaymentDetailsTypeI1> fop) {
    this.fop = fop;
    return this;
  }

  public FormOfPaymentTypeI1 addFopItem(FormOfPaymentDetailsTypeI1 fopItem) {
    if (this.fop == null) {
      this.fop = new ArrayList<>();
    }
    this.fop.add(fopItem);
    return this;
  }

  /**
   * Get fop
   * @return fop
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FormOfPaymentDetailsTypeI1> getFop() {
    return fop;
  }

  public void setFop(List<FormOfPaymentDetailsTypeI1> fop) {
    this.fop = fop;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormOfPaymentTypeI1 formOfPaymentTypeI1 = (FormOfPaymentTypeI1) o;
    return Objects.equals(this.fop, formOfPaymentTypeI1.fop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormOfPaymentTypeI1 {\n");
    
    sb.append("    fop: ").append(toIndentedString(fop)).append("\n");
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

