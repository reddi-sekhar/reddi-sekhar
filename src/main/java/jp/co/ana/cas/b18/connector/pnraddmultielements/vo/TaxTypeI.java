package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TaxDetailsTypeI12177C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TaxTypeI   {
  @JsonProperty("taxDetails")
  @Valid
  private List<TaxDetailsTypeI12177C> taxDetails = null;

  public TaxTypeI taxDetails(List<TaxDetailsTypeI12177C> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public TaxTypeI addTaxDetailsItem(TaxDetailsTypeI12177C taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

  /**
   * Get taxDetails
   * @return taxDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TaxDetailsTypeI12177C> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<TaxDetailsTypeI12177C> taxDetails) {
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
    TaxTypeI taxTypeI = (TaxTypeI) o;
    return Objects.equals(this.taxDetails, taxTypeI.taxDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxTypeI {\n");
    
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

