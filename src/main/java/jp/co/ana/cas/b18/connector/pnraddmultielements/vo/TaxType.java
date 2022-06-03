package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TaxDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TaxType   {
  @JsonProperty("taxCategory")
  private String taxCategory;

  @JsonProperty("taxDetails")
  private TaxDetailsType taxDetails;

  public TaxType taxCategory(String taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

  /**
   * Get taxCategory
   * @return taxCategory
  */
  @ApiModelProperty(value = "")


  public String getTaxCategory() {
    return taxCategory;
  }

  public void setTaxCategory(String taxCategory) {
    this.taxCategory = taxCategory;
  }

  public TaxType taxDetails(TaxDetailsType taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  /**
   * Get taxDetails
   * @return taxDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaxDetailsType getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(TaxDetailsType taxDetails) {
    this.taxDetails = taxDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxType taxType = (TaxType) o;
    return Objects.equals(this.taxCategory, taxType.taxCategory) &&
        Objects.equals(this.taxDetails, taxType.taxDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxCategory, taxDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxType {\n");
    
    sb.append("    taxCategory: ").append(toIndentedString(taxCategory)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
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

