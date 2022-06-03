package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QuantityTypeI65488S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class QuantityTypeI65488S   {
  @JsonProperty("quantityDetails")
  private QuantityDetailsTypeI quantityDetails;

  public QuantityTypeI65488S quantityDetails(QuantityDetailsTypeI quantityDetails) {
    this.quantityDetails = quantityDetails;
    return this;
  }

  /**
   * Get quantityDetails
   * @return quantityDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityDetailsTypeI getQuantityDetails() {
    return quantityDetails;
  }

  public void setQuantityDetails(QuantityDetailsTypeI quantityDetails) {
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
    QuantityTypeI65488S quantityTypeI65488S = (QuantityTypeI65488S) o;
    return Objects.equals(this.quantityDetails, quantityTypeI65488S.quantityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantityTypeI65488S {\n");
    
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

