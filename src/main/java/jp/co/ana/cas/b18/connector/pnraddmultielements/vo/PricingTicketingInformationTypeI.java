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
 * PricingTicketingInformationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PricingTicketingInformationTypeI   {
  @JsonProperty("indicators")
  private String indicators;

  public PricingTicketingInformationTypeI indicators(String indicators) {
    this.indicators = indicators;
    return this;
  }

  /**
   * Get indicators
   * @return indicators
  */
  @ApiModelProperty(value = "")


  public String getIndicators() {
    return indicators;
  }

  public void setIndicators(String indicators) {
    this.indicators = indicators;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingTicketingInformationTypeI pricingTicketingInformationTypeI = (PricingTicketingInformationTypeI) o;
    return Objects.equals(this.indicators, pricingTicketingInformationTypeI.indicators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingTicketingInformationTypeI {\n");
    
    sb.append("    indicators: ").append(toIndentedString(indicators)).append("\n");
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

