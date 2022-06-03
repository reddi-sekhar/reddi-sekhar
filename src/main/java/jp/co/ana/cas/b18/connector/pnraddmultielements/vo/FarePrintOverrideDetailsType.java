package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FarePrintOverrideDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FarePrintOverrideDetailsType   {
  @JsonProperty("baseFare")
  private String baseFare;

  @JsonProperty("equivalentFare")
  private String equivalentFare;

  @JsonProperty("taxAmount")
  @Valid
  private List<String> taxAmount = null;

  @JsonProperty("totalFare")
  private String totalFare;

  public FarePrintOverrideDetailsType baseFare(String baseFare) {
    this.baseFare = baseFare;
    return this;
  }

  /**
   * Get baseFare
   * @return baseFare
  */
  @ApiModelProperty(value = "")


  public String getBaseFare() {
    return baseFare;
  }

  public void setBaseFare(String baseFare) {
    this.baseFare = baseFare;
  }

  public FarePrintOverrideDetailsType equivalentFare(String equivalentFare) {
    this.equivalentFare = equivalentFare;
    return this;
  }

  /**
   * Get equivalentFare
   * @return equivalentFare
  */
  @ApiModelProperty(value = "")


  public String getEquivalentFare() {
    return equivalentFare;
  }

  public void setEquivalentFare(String equivalentFare) {
    this.equivalentFare = equivalentFare;
  }

  public FarePrintOverrideDetailsType taxAmount(List<String> taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  public FarePrintOverrideDetailsType addTaxAmountItem(String taxAmountItem) {
    if (this.taxAmount == null) {
      this.taxAmount = new ArrayList<>();
    }
    this.taxAmount.add(taxAmountItem);
    return this;
  }

  /**
   * Get taxAmount
   * @return taxAmount
  */
  @ApiModelProperty(value = "")


  public List<String> getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(List<String> taxAmount) {
    this.taxAmount = taxAmount;
  }

  public FarePrintOverrideDetailsType totalFare(String totalFare) {
    this.totalFare = totalFare;
    return this;
  }

  /**
   * Get totalFare
   * @return totalFare
  */
  @ApiModelProperty(value = "")


  public String getTotalFare() {
    return totalFare;
  }

  public void setTotalFare(String totalFare) {
    this.totalFare = totalFare;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FarePrintOverrideDetailsType farePrintOverrideDetailsType = (FarePrintOverrideDetailsType) o;
    return Objects.equals(this.baseFare, farePrintOverrideDetailsType.baseFare) &&
        Objects.equals(this.equivalentFare, farePrintOverrideDetailsType.equivalentFare) &&
        Objects.equals(this.taxAmount, farePrintOverrideDetailsType.taxAmount) &&
        Objects.equals(this.totalFare, farePrintOverrideDetailsType.totalFare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseFare, equivalentFare, taxAmount, totalFare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FarePrintOverrideDetailsType {\n");
    
    sb.append("    baseFare: ").append(toIndentedString(baseFare)).append("\n");
    sb.append("    equivalentFare: ").append(toIndentedString(equivalentFare)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalFare: ").append(toIndentedString(totalFare)).append("\n");
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

