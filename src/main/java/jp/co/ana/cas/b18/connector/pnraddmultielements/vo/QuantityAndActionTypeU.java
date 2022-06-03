package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityAndActionDetailsTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QuantityAndActionTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class QuantityAndActionTypeU   {
  @JsonProperty("quantityActionDetails")
  @Valid
  private List<QuantityAndActionDetailsTypeU> quantityActionDetails = null;

  public QuantityAndActionTypeU quantityActionDetails(List<QuantityAndActionDetailsTypeU> quantityActionDetails) {
    this.quantityActionDetails = quantityActionDetails;
    return this;
  }

  public QuantityAndActionTypeU addQuantityActionDetailsItem(QuantityAndActionDetailsTypeU quantityActionDetailsItem) {
    if (this.quantityActionDetails == null) {
      this.quantityActionDetails = new ArrayList<>();
    }
    this.quantityActionDetails.add(quantityActionDetailsItem);
    return this;
  }

  /**
   * Get quantityActionDetails
   * @return quantityActionDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<QuantityAndActionDetailsTypeU> getQuantityActionDetails() {
    return quantityActionDetails;
  }

  public void setQuantityActionDetails(List<QuantityAndActionDetailsTypeU> quantityActionDetails) {
    this.quantityActionDetails = quantityActionDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantityAndActionTypeU quantityAndActionTypeU = (QuantityAndActionTypeU) o;
    return Objects.equals(this.quantityActionDetails, quantityAndActionTypeU.quantityActionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityActionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantityAndActionTypeU {\n");
    
    sb.append("    quantityActionDetails: ").append(toIndentedString(quantityActionDetails)).append("\n");
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

