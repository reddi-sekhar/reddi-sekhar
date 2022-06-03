package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NumberOfUnitsType76106S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class NumberOfUnitsType76106S   {
  @JsonProperty("quantityDetails")
  @Valid
  private List<NumberOfUnitDetailsTypeI> quantityDetails = null;

  public NumberOfUnitsType76106S quantityDetails(List<NumberOfUnitDetailsTypeI> quantityDetails) {
    this.quantityDetails = quantityDetails;
    return this;
  }

  public NumberOfUnitsType76106S addQuantityDetailsItem(NumberOfUnitDetailsTypeI quantityDetailsItem) {
    if (this.quantityDetails == null) {
      this.quantityDetails = new ArrayList<>();
    }
    this.quantityDetails.add(quantityDetailsItem);
    return this;
  }

  /**
   * Get quantityDetails
   * @return quantityDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<NumberOfUnitDetailsTypeI> getQuantityDetails() {
    return quantityDetails;
  }

  public void setQuantityDetails(List<NumberOfUnitDetailsTypeI> quantityDetails) {
    this.quantityDetails = quantityDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOfUnitsType76106S numberOfUnitsType76106S = (NumberOfUnitsType76106S) o;
    return Objects.equals(this.quantityDetails, numberOfUnitsType76106S.quantityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOfUnitsType76106S {\n");
    
    sb.append("    quantityDetails: ").append(toIndentedString(quantityDetails)).append("\n");
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

