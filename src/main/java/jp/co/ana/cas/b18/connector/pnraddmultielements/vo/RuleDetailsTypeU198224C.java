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
 * RuleDetailsTypeU198224C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RuleDetailsTypeU198224C   {
  @JsonProperty("amount")
  private Long amount;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("daysOfOperation")
  private String daysOfOperation;

  @JsonProperty("qualifier")
  private String qualifier;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("quantityUnit")
  private String quantityUnit;

  @JsonProperty("type")
  private String type;

  public RuleDetailsTypeU198224C amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public RuleDetailsTypeU198224C currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public RuleDetailsTypeU198224C daysOfOperation(String daysOfOperation) {
    this.daysOfOperation = daysOfOperation;
    return this;
  }

  /**
   * Get daysOfOperation
   * @return daysOfOperation
  */
  @ApiModelProperty(value = "")


  public String getDaysOfOperation() {
    return daysOfOperation;
  }

  public void setDaysOfOperation(String daysOfOperation) {
    this.daysOfOperation = daysOfOperation;
  }

  public RuleDetailsTypeU198224C qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * Get qualifier
   * @return qualifier
  */
  @ApiModelProperty(value = "")


  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  public RuleDetailsTypeU198224C quantity(Long quantity) {
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

  public RuleDetailsTypeU198224C quantityUnit(String quantityUnit) {
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

  public RuleDetailsTypeU198224C type(String type) {
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
    RuleDetailsTypeU198224C ruleDetailsTypeU198224C = (RuleDetailsTypeU198224C) o;
    return Objects.equals(this.amount, ruleDetailsTypeU198224C.amount) &&
        Objects.equals(this.currency, ruleDetailsTypeU198224C.currency) &&
        Objects.equals(this.daysOfOperation, ruleDetailsTypeU198224C.daysOfOperation) &&
        Objects.equals(this.qualifier, ruleDetailsTypeU198224C.qualifier) &&
        Objects.equals(this.quantity, ruleDetailsTypeU198224C.quantity) &&
        Objects.equals(this.quantityUnit, ruleDetailsTypeU198224C.quantityUnit) &&
        Objects.equals(this.type, ruleDetailsTypeU198224C.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, daysOfOperation, qualifier, quantity, quantityUnit, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleDetailsTypeU198224C {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    daysOfOperation: ").append(toIndentedString(daysOfOperation)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
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

