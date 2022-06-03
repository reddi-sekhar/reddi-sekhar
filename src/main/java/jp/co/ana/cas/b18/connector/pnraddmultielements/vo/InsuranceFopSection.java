package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FormOfPaymentTypeI16862S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusTypeI13270S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InsuranceFopSection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InsuranceFopSection   {
  @JsonProperty("fopExtendedData")
  @Valid
  private List<StatusTypeI13270S> fopExtendedData = null;

  @JsonProperty("formOfPaymentSection")
  private FormOfPaymentTypeI16862S formOfPaymentSection;

  public InsuranceFopSection fopExtendedData(List<StatusTypeI13270S> fopExtendedData) {
    this.fopExtendedData = fopExtendedData;
    return this;
  }

  public InsuranceFopSection addFopExtendedDataItem(StatusTypeI13270S fopExtendedDataItem) {
    if (this.fopExtendedData == null) {
      this.fopExtendedData = new ArrayList<>();
    }
    this.fopExtendedData.add(fopExtendedDataItem);
    return this;
  }

  /**
   * Get fopExtendedData
   * @return fopExtendedData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StatusTypeI13270S> getFopExtendedData() {
    return fopExtendedData;
  }

  public void setFopExtendedData(List<StatusTypeI13270S> fopExtendedData) {
    this.fopExtendedData = fopExtendedData;
  }

  public InsuranceFopSection formOfPaymentSection(FormOfPaymentTypeI16862S formOfPaymentSection) {
    this.formOfPaymentSection = formOfPaymentSection;
    return this;
  }

  /**
   * Get formOfPaymentSection
   * @return formOfPaymentSection
  */
  @ApiModelProperty(value = "")

  @Valid

  public FormOfPaymentTypeI16862S getFormOfPaymentSection() {
    return formOfPaymentSection;
  }

  public void setFormOfPaymentSection(FormOfPaymentTypeI16862S formOfPaymentSection) {
    this.formOfPaymentSection = formOfPaymentSection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceFopSection insuranceFopSection = (InsuranceFopSection) o;
    return Objects.equals(this.fopExtendedData, insuranceFopSection.fopExtendedData) &&
        Objects.equals(this.formOfPaymentSection, insuranceFopSection.formOfPaymentSection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fopExtendedData, formOfPaymentSection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceFopSection {\n");
    
    sb.append("    fopExtendedData: ").append(toIndentedString(fopExtendedData)).append("\n");
    sb.append("    formOfPaymentSection: ").append(toIndentedString(formOfPaymentSection)).append("\n");
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

