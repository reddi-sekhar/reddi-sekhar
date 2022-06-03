package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssociatedChargesInformationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AssociatedChargesInformationTypeI   {
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("description")
  private String description;

  @JsonProperty("numberInParty")
  private Long numberInParty;

  @JsonProperty("type")
  private String type;

  public AssociatedChargesInformationTypeI amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public AssociatedChargesInformationTypeI comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  @ApiModelProperty(value = "")


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public AssociatedChargesInformationTypeI currency(String currency) {
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

  public AssociatedChargesInformationTypeI description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssociatedChargesInformationTypeI numberInParty(Long numberInParty) {
    this.numberInParty = numberInParty;
    return this;
  }

  /**
   * Get numberInParty
   * @return numberInParty
  */
  @ApiModelProperty(value = "")


  public Long getNumberInParty() {
    return numberInParty;
  }

  public void setNumberInParty(Long numberInParty) {
    this.numberInParty = numberInParty;
  }

  public AssociatedChargesInformationTypeI type(String type) {
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
    AssociatedChargesInformationTypeI associatedChargesInformationTypeI = (AssociatedChargesInformationTypeI) o;
    return Objects.equals(this.amount, associatedChargesInformationTypeI.amount) &&
        Objects.equals(this.comment, associatedChargesInformationTypeI.comment) &&
        Objects.equals(this.currency, associatedChargesInformationTypeI.currency) &&
        Objects.equals(this.description, associatedChargesInformationTypeI.description) &&
        Objects.equals(this.numberInParty, associatedChargesInformationTypeI.numberInParty) &&
        Objects.equals(this.type, associatedChargesInformationTypeI.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, comment, currency, description, numberInParty, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedChargesInformationTypeI {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    numberInParty: ").append(toIndentedString(numberInParty)).append("\n");
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

