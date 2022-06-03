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
 * RatePriceType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RatePriceType   {
  @JsonProperty("rateAmount")
  private BigDecimal rateAmount;

  public RatePriceType rateAmount(BigDecimal rateAmount) {
    this.rateAmount = rateAmount;
    return this;
  }

  /**
   * Get rateAmount
   * @return rateAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getRateAmount() {
    return rateAmount;
  }

  public void setRateAmount(BigDecimal rateAmount) {
    this.rateAmount = rateAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatePriceType ratePriceType = (RatePriceType) o;
    return Objects.equals(this.rateAmount, ratePriceType.rateAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatePriceType {\n");
    
    sb.append("    rateAmount: ").append(toIndentedString(rateAmount)).append("\n");
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

