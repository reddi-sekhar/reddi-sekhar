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
 * MonetaryInformationDetailsTypeI17849C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MonetaryInformationDetailsTypeI17849C   {
  @JsonProperty("amount")
  private String amount;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("typeQualifier")
  private String typeQualifier;

  public MonetaryInformationDetailsTypeI17849C amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public MonetaryInformationDetailsTypeI17849C currency(String currency) {
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

  public MonetaryInformationDetailsTypeI17849C typeQualifier(String typeQualifier) {
    this.typeQualifier = typeQualifier;
    return this;
  }

  /**
   * Get typeQualifier
   * @return typeQualifier
  */
  @ApiModelProperty(value = "")


  public String getTypeQualifier() {
    return typeQualifier;
  }

  public void setTypeQualifier(String typeQualifier) {
    this.typeQualifier = typeQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonetaryInformationDetailsTypeI17849C monetaryInformationDetailsTypeI17849C = (MonetaryInformationDetailsTypeI17849C) o;
    return Objects.equals(this.amount, monetaryInformationDetailsTypeI17849C.amount) &&
        Objects.equals(this.currency, monetaryInformationDetailsTypeI17849C.currency) &&
        Objects.equals(this.typeQualifier, monetaryInformationDetailsTypeI17849C.typeQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, typeQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetaryInformationDetailsTypeI17849C {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    typeQualifier: ").append(toIndentedString(typeQualifier)).append("\n");
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

