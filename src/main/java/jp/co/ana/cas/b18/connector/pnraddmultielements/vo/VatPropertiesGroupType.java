package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI53012S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SelectionDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VatPropertiesGroupType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class VatPropertiesGroupType   {
  @JsonProperty("fareFiling")
  private SelectionDetailsTypeI fareFiling;

  @JsonProperty("vatRateAndAmount")
  private MonetaryInformationTypeI53012S vatRateAndAmount;

  public VatPropertiesGroupType fareFiling(SelectionDetailsTypeI fareFiling) {
    this.fareFiling = fareFiling;
    return this;
  }

  /**
   * Get fareFiling
   * @return fareFiling
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelectionDetailsTypeI getFareFiling() {
    return fareFiling;
  }

  public void setFareFiling(SelectionDetailsTypeI fareFiling) {
    this.fareFiling = fareFiling;
  }

  public VatPropertiesGroupType vatRateAndAmount(MonetaryInformationTypeI53012S vatRateAndAmount) {
    this.vatRateAndAmount = vatRateAndAmount;
    return this;
  }

  /**
   * Get vatRateAndAmount
   * @return vatRateAndAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI53012S getVatRateAndAmount() {
    return vatRateAndAmount;
  }

  public void setVatRateAndAmount(MonetaryInformationTypeI53012S vatRateAndAmount) {
    this.vatRateAndAmount = vatRateAndAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VatPropertiesGroupType vatPropertiesGroupType = (VatPropertiesGroupType) o;
    return Objects.equals(this.fareFiling, vatPropertiesGroupType.fareFiling) &&
        Objects.equals(this.vatRateAndAmount, vatPropertiesGroupType.vatRateAndAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fareFiling, vatRateAndAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VatPropertiesGroupType {\n");
    
    sb.append("    fareFiling: ").append(toIndentedString(fareFiling)).append("\n");
    sb.append("    vatRateAndAmount: ").append(toIndentedString(vatRateAndAmount)).append("\n");
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

