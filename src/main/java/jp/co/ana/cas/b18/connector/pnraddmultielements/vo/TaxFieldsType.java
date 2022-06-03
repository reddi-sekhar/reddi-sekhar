package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxFieldsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TaxFieldsType   {
  @JsonProperty("taxAmount")
  private String taxAmount;

  @JsonProperty("taxCountryCode")
  private String taxCountryCode;

  @JsonProperty("taxCurrency")
  private String taxCurrency;

  @JsonProperty("taxIndicator")
  private String taxIndicator;

  @JsonProperty("taxNatureCode")
  private String taxNatureCode;

  public TaxFieldsType taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * Get taxAmount
   * @return taxAmount
  */
  @ApiModelProperty(value = "")


  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public TaxFieldsType taxCountryCode(String taxCountryCode) {
    this.taxCountryCode = taxCountryCode;
    return this;
  }

  /**
   * Get taxCountryCode
   * @return taxCountryCode
  */
  @ApiModelProperty(value = "")


  public String getTaxCountryCode() {
    return taxCountryCode;
  }

  public void setTaxCountryCode(String taxCountryCode) {
    this.taxCountryCode = taxCountryCode;
  }

  public TaxFieldsType taxCurrency(String taxCurrency) {
    this.taxCurrency = taxCurrency;
    return this;
  }

  /**
   * Get taxCurrency
   * @return taxCurrency
  */
  @ApiModelProperty(value = "")


  public String getTaxCurrency() {
    return taxCurrency;
  }

  public void setTaxCurrency(String taxCurrency) {
    this.taxCurrency = taxCurrency;
  }

  public TaxFieldsType taxIndicator(String taxIndicator) {
    this.taxIndicator = taxIndicator;
    return this;
  }

  /**
   * Get taxIndicator
   * @return taxIndicator
  */
  @ApiModelProperty(value = "")


  public String getTaxIndicator() {
    return taxIndicator;
  }

  public void setTaxIndicator(String taxIndicator) {
    this.taxIndicator = taxIndicator;
  }

  public TaxFieldsType taxNatureCode(String taxNatureCode) {
    this.taxNatureCode = taxNatureCode;
    return this;
  }

  /**
   * Get taxNatureCode
   * @return taxNatureCode
  */
  @ApiModelProperty(value = "")


  public String getTaxNatureCode() {
    return taxNatureCode;
  }

  public void setTaxNatureCode(String taxNatureCode) {
    this.taxNatureCode = taxNatureCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxFieldsType taxFieldsType = (TaxFieldsType) o;
    return Objects.equals(this.taxAmount, taxFieldsType.taxAmount) &&
        Objects.equals(this.taxCountryCode, taxFieldsType.taxCountryCode) &&
        Objects.equals(this.taxCurrency, taxFieldsType.taxCurrency) &&
        Objects.equals(this.taxIndicator, taxFieldsType.taxIndicator) &&
        Objects.equals(this.taxNatureCode, taxFieldsType.taxNatureCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxAmount, taxCountryCode, taxCurrency, taxIndicator, taxNatureCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxFieldsType {\n");
    
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxCountryCode: ").append(toIndentedString(taxCountryCode)).append("\n");
    sb.append("    taxCurrency: ").append(toIndentedString(taxCurrency)).append("\n");
    sb.append("    taxIndicator: ").append(toIndentedString(taxIndicator)).append("\n");
    sb.append("    taxNatureCode: ").append(toIndentedString(taxNatureCode)).append("\n");
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

