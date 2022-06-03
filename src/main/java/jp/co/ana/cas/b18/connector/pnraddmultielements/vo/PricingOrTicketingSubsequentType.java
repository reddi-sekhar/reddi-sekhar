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
 * PricingOrTicketingSubsequentType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PricingOrTicketingSubsequentType   {
  @JsonProperty("otherSpecialCondition")
  private String otherSpecialCondition;

  @JsonProperty("specialCondition")
  private String specialCondition;

  public PricingOrTicketingSubsequentType otherSpecialCondition(String otherSpecialCondition) {
    this.otherSpecialCondition = otherSpecialCondition;
    return this;
  }

  /**
   * Get otherSpecialCondition
   * @return otherSpecialCondition
  */
  @ApiModelProperty(value = "")


  public String getOtherSpecialCondition() {
    return otherSpecialCondition;
  }

  public void setOtherSpecialCondition(String otherSpecialCondition) {
    this.otherSpecialCondition = otherSpecialCondition;
  }

  public PricingOrTicketingSubsequentType specialCondition(String specialCondition) {
    this.specialCondition = specialCondition;
    return this;
  }

  /**
   * Get specialCondition
   * @return specialCondition
  */
  @ApiModelProperty(value = "")


  public String getSpecialCondition() {
    return specialCondition;
  }

  public void setSpecialCondition(String specialCondition) {
    this.specialCondition = specialCondition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingOrTicketingSubsequentType pricingOrTicketingSubsequentType = (PricingOrTicketingSubsequentType) o;
    return Objects.equals(this.otherSpecialCondition, pricingOrTicketingSubsequentType.otherSpecialCondition) &&
        Objects.equals(this.specialCondition, pricingOrTicketingSubsequentType.specialCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherSpecialCondition, specialCondition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingOrTicketingSubsequentType {\n");
    
    sb.append("    otherSpecialCondition: ").append(toIndentedString(otherSpecialCondition)).append("\n");
    sb.append("    specialCondition: ").append(toIndentedString(specialCondition)).append("\n");
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

