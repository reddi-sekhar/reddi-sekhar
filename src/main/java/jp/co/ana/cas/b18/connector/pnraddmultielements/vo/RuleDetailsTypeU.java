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
 * RuleDetailsTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RuleDetailsTypeU   {
  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("quantityUnit")
  private String quantityUnit;

  @JsonProperty("type")
  private String type;

  public RuleDetailsTypeU quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(value = "")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public RuleDetailsTypeU quantityUnit(String quantityUnit) {
    this.quantityUnit = quantityUnit;
    return this;
  }

  /**
   * Get quantityUnit
   * @return quantityUnit
  */
  @ApiModelProperty(value = "")


  public String getQuantityUnit() {
    return quantityUnit;
  }

  public void setQuantityUnit(String quantityUnit) {
    this.quantityUnit = quantityUnit;
  }

  public RuleDetailsTypeU type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleDetailsTypeU ruleDetailsTypeU = (RuleDetailsTypeU) o;
    return Objects.equals(this.quantity, ruleDetailsTypeU.quantity) &&
        Objects.equals(this.quantityUnit, ruleDetailsTypeU.quantityUnit) &&
        Objects.equals(this.type, ruleDetailsTypeU.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, quantityUnit, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleDetailsTypeU {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityUnit: ").append(toIndentedString(quantityUnit)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

