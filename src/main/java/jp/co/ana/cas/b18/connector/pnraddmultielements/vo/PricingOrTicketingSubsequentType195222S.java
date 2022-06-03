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
 * PricingOrTicketingSubsequentType195222S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PricingOrTicketingSubsequentType195222S   {
  @JsonProperty("itemNumber")
  private String itemNumber;

  @JsonProperty("otherSpecialCondition")
  private String otherSpecialCondition;

  @JsonProperty("specialCondition")
  private String specialCondition;

  public PricingOrTicketingSubsequentType195222S itemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }

  /**
   * Get itemNumber
   * @return itemNumber
  */
  @ApiModelProperty(value = "")


  public String getItemNumber() {
    return itemNumber;
  }

  public void setItemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
  }

  public PricingOrTicketingSubsequentType195222S otherSpecialCondition(String otherSpecialCondition) {
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

  public PricingOrTicketingSubsequentType195222S specialCondition(String specialCondition) {
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
    PricingOrTicketingSubsequentType195222S pricingOrTicketingSubsequentType195222S = (PricingOrTicketingSubsequentType195222S) o;
    return Objects.equals(this.itemNumber, pricingOrTicketingSubsequentType195222S.itemNumber) &&
        Objects.equals(this.otherSpecialCondition, pricingOrTicketingSubsequentType195222S.otherSpecialCondition) &&
        Objects.equals(this.specialCondition, pricingOrTicketingSubsequentType195222S.specialCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemNumber, otherSpecialCondition, specialCondition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingOrTicketingSubsequentType195222S {\n");
    
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
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

