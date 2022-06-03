package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DiscountInformationDetailsType141679C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DiscountInformationType94068S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DiscountInformationType94068S   {
  @JsonProperty("discountDetails")
  private DiscountInformationDetailsType141679C discountDetails;

  @JsonProperty("otherDiscountDetails")
  @Valid
  private List<DiscountInformationDetailsType141679C> otherDiscountDetails = null;

  public DiscountInformationType94068S discountDetails(DiscountInformationDetailsType141679C discountDetails) {
    this.discountDetails = discountDetails;
    return this;
  }

  /**
   * Get discountDetails
   * @return discountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public DiscountInformationDetailsType141679C getDiscountDetails() {
    return discountDetails;
  }

  public void setDiscountDetails(DiscountInformationDetailsType141679C discountDetails) {
    this.discountDetails = discountDetails;
  }

  public DiscountInformationType94068S otherDiscountDetails(List<DiscountInformationDetailsType141679C> otherDiscountDetails) {
    this.otherDiscountDetails = otherDiscountDetails;
    return this;
  }

  public DiscountInformationType94068S addOtherDiscountDetailsItem(DiscountInformationDetailsType141679C otherDiscountDetailsItem) {
    if (this.otherDiscountDetails == null) {
      this.otherDiscountDetails = new ArrayList<>();
    }
    this.otherDiscountDetails.add(otherDiscountDetailsItem);
    return this;
  }

  /**
   * Get otherDiscountDetails
   * @return otherDiscountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DiscountInformationDetailsType141679C> getOtherDiscountDetails() {
    return otherDiscountDetails;
  }

  public void setOtherDiscountDetails(List<DiscountInformationDetailsType141679C> otherDiscountDetails) {
    this.otherDiscountDetails = otherDiscountDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountInformationType94068S discountInformationType94068S = (DiscountInformationType94068S) o;
    return Objects.equals(this.discountDetails, discountInformationType94068S.discountDetails) &&
        Objects.equals(this.otherDiscountDetails, discountInformationType94068S.otherDiscountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountDetails, otherDiscountDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountInformationType94068S {\n");
    
    sb.append("    discountDetails: ").append(toIndentedString(discountDetails)).append("\n");
    sb.append("    otherDiscountDetails: ").append(toIndentedString(otherDiscountDetails)).append("\n");
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

