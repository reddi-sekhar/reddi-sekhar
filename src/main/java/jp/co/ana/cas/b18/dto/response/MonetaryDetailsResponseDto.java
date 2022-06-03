package jp.co.ana.cas.b18.dto.response;

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
 * MonetaryDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class MonetaryDetailsResponseDto   {
  @JsonProperty("typeQualifier")
  private String typeQualifier;

  @JsonProperty("amount")
  private BigDecimal amount;

  public MonetaryDetailsResponseDto typeQualifier(String typeQualifier) {
    this.typeQualifier = typeQualifier;
    return this;
  }

  /**
   * Yeild Type
   * @return typeQualifier
  */
  @ApiModelProperty(value = "Yeild Type")

@Size(min=1,max=3) 
  public String getTypeQualifier() {
    return typeQualifier;
  }

  public void setTypeQualifier(String typeQualifier) {
    this.typeQualifier = typeQualifier;
  }

  public MonetaryDetailsResponseDto amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount of yeild
   * @return amount
  */
  @ApiModelProperty(value = "Amount of yeild")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonetaryDetailsResponseDto monetaryDetailsResponseDto = (MonetaryDetailsResponseDto) o;
    return Objects.equals(this.typeQualifier, monetaryDetailsResponseDto.typeQualifier) &&
        Objects.equals(this.amount, monetaryDetailsResponseDto.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeQualifier, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetaryDetailsResponseDto {\n");
    
    sb.append("    typeQualifier: ").append(toIndentedString(typeQualifier)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

