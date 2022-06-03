package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DiscountPenaltyInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareQualifierDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FareQualifierDetailsType   {
  @JsonProperty("discountDetails")
  @Valid
  private List<DiscountPenaltyInformationType> discountDetails = null;

  public FareQualifierDetailsType discountDetails(List<DiscountPenaltyInformationType> discountDetails) {
    this.discountDetails = discountDetails;
    return this;
  }

  public FareQualifierDetailsType addDiscountDetailsItem(DiscountPenaltyInformationType discountDetailsItem) {
    if (this.discountDetails == null) {
      this.discountDetails = new ArrayList<>();
    }
    this.discountDetails.add(discountDetailsItem);
    return this;
  }

  /**
   * Get discountDetails
   * @return discountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DiscountPenaltyInformationType> getDiscountDetails() {
    return discountDetails;
  }

  public void setDiscountDetails(List<DiscountPenaltyInformationType> discountDetails) {
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
    FareQualifierDetailsType fareQualifierDetailsType = (FareQualifierDetailsType) o;
    return Objects.equals(this.discountDetails, fareQualifierDetailsType.discountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareQualifierDetailsType {\n");
    
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

