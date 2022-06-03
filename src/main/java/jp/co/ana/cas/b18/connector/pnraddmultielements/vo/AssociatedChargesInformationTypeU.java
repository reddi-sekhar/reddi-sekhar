package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssociatedChargesInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AssociatedChargesInformationTypeU   {
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("chargeUnitCode")
  private String chargeUnitCode;

  @JsonProperty("percentage")
  private BigDecimal percentage;

  public AssociatedChargesInformationTypeU amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public AssociatedChargesInformationTypeU chargeUnitCode(String chargeUnitCode) {
    this.chargeUnitCode = chargeUnitCode;
    return this;
  }

  /**
   * Get chargeUnitCode
   * @return chargeUnitCode
  */
  @ApiModelProperty(value = "")


  public String getChargeUnitCode() {
    return chargeUnitCode;
  }

  public void setChargeUnitCode(String chargeUnitCode) {
    this.chargeUnitCode = chargeUnitCode;
  }

  public AssociatedChargesInformationTypeU percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Get percentage
   * @return percentage
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociatedChargesInformationTypeU associatedChargesInformationTypeU = (AssociatedChargesInformationTypeU) o;
    return Objects.equals(this.amount, associatedChargesInformationTypeU.amount) &&
        Objects.equals(this.chargeUnitCode, associatedChargesInformationTypeU.chargeUnitCode) &&
        Objects.equals(this.percentage, associatedChargesInformationTypeU.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, chargeUnitCode, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedChargesInformationTypeU {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeUnitCode: ").append(toIndentedString(chargeUnitCode)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

