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
 * MonetaryInformationDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MonetaryInformationDetailsTypeI   {
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("typeQualifier")
  private String typeQualifier;

  public MonetaryInformationDetailsTypeI amount(BigDecimal amount) {
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

  public MonetaryInformationDetailsTypeI typeQualifier(String typeQualifier) {
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
    MonetaryInformationDetailsTypeI monetaryInformationDetailsTypeI = (MonetaryInformationDetailsTypeI) o;
    return Objects.equals(this.amount, monetaryInformationDetailsTypeI.amount) &&
        Objects.equals(this.typeQualifier, monetaryInformationDetailsTypeI.typeQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, typeQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetaryInformationDetailsTypeI {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

