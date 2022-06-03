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
 * TaxDetailsTypeI12177C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TaxDetailsTypeI12177C   {
  @JsonProperty("currCode")
  private String currCode;

  @JsonProperty("taxRate")
  private String taxRate;

  @JsonProperty("taxType")
  @Valid
  private List<String> taxType = null;

  public TaxDetailsTypeI12177C currCode(String currCode) {
    this.currCode = currCode;
    return this;
  }

  /**
   * Get currCode
   * @return currCode
  */
  @ApiModelProperty(value = "")


  public String getCurrCode() {
    return currCode;
  }

  public void setCurrCode(String currCode) {
    this.currCode = currCode;
  }

  public TaxDetailsTypeI12177C taxRate(String taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * Get taxRate
   * @return taxRate
  */
  @ApiModelProperty(value = "")


  public String getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
  }

  public TaxDetailsTypeI12177C taxType(List<String> taxType) {
    this.taxType = taxType;
    return this;
  }

  public TaxDetailsTypeI12177C addTaxTypeItem(String taxTypeItem) {
    if (this.taxType == null) {
      this.taxType = new ArrayList<>();
    }
    this.taxType.add(taxTypeItem);
    return this;
  }

  /**
   * Get taxType
   * @return taxType
  */
  @ApiModelProperty(value = "")


  public List<String> getTaxType() {
    return taxType;
  }

  public void setTaxType(List<String> taxType) {
    this.taxType = taxType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDetailsTypeI12177C taxDetailsTypeI12177C = (TaxDetailsTypeI12177C) o;
    return Objects.equals(this.currCode, taxDetailsTypeI12177C.currCode) &&
        Objects.equals(this.taxRate, taxDetailsTypeI12177C.taxRate) &&
        Objects.equals(this.taxType, taxDetailsTypeI12177C.taxType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currCode, taxRate, taxType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDetailsTypeI12177C {\n");
    
    sb.append("    currCode: ").append(toIndentedString(currCode)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
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

