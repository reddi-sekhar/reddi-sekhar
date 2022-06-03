package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityDetailsTypeI46334C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QuantityType25433S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class QuantityType25433S   {
  @JsonProperty("quantityDetails")
  private QuantityDetailsTypeI46334C quantityDetails;

  public QuantityType25433S quantityDetails(QuantityDetailsTypeI46334C quantityDetails) {
    this.quantityDetails = quantityDetails;
    return this;
  }

  /**
   * Get quantityDetails
   * @return quantityDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityDetailsTypeI46334C getQuantityDetails() {
    return quantityDetails;
  }

  public void setQuantityDetails(QuantityDetailsTypeI46334C quantityDetails) {
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
    QuantityType25433S quantityType25433S = (QuantityType25433S) o;
    return Objects.equals(this.quantityDetails, quantityType25433S.quantityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuantityType25433S {\n");
    
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

