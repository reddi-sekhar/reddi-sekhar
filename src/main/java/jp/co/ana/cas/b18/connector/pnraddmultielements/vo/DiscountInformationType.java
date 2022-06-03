package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DiscountInformationDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DiscountInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DiscountInformationType   {
  @JsonProperty("discountDetails")
  private DiscountInformationDetailsType discountDetails;

  public DiscountInformationType discountDetails(DiscountInformationDetailsType discountDetails) {
    this.discountDetails = discountDetails;
    return this;
  }

  /**
   * Get discountDetails
   * @return discountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public DiscountInformationDetailsType getDiscountDetails() {
    return discountDetails;
  }

  public void setDiscountDetails(DiscountInformationDetailsType discountDetails) {
    this.discountDetails = discountDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountInformationType discountInformationType = (DiscountInformationType) o;
    return Objects.equals(this.discountDetails, discountInformationType.discountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountInformationType {\n");
    
    sb.append("    discountDetails: ").append(toIndentedString(discountDetails)).append("\n");
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

