package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationDetailsType270802C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MonetaryInformationType193831S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MonetaryInformationType193831S   {
  @JsonProperty("monetaryDetails")
  private MonetaryInformationDetailsType270802C monetaryDetails;

  @JsonProperty("otherMonetaryDetails")
  @Valid
  private List<MonetaryInformationDetailsType270802C> otherMonetaryDetails = null;

  public MonetaryInformationType193831S monetaryDetails(MonetaryInformationDetailsType270802C monetaryDetails) {
    this.monetaryDetails = monetaryDetails;
    return this;
  }

  /**
   * Get monetaryDetails
   * @return monetaryDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationDetailsType270802C getMonetaryDetails() {
    return monetaryDetails;
  }

  public void setMonetaryDetails(MonetaryInformationDetailsType270802C monetaryDetails) {
    this.monetaryDetails = monetaryDetails;
  }

  public MonetaryInformationType193831S otherMonetaryDetails(List<MonetaryInformationDetailsType270802C> otherMonetaryDetails) {
    this.otherMonetaryDetails = otherMonetaryDetails;
    return this;
  }

  public MonetaryInformationType193831S addOtherMonetaryDetailsItem(MonetaryInformationDetailsType270802C otherMonetaryDetailsItem) {
    if (this.otherMonetaryDetails == null) {
      this.otherMonetaryDetails = new ArrayList<>();
    }
    this.otherMonetaryDetails.add(otherMonetaryDetailsItem);
    return this;
  }

  /**
   * Get otherMonetaryDetails
   * @return otherMonetaryDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MonetaryInformationDetailsType270802C> getOtherMonetaryDetails() {
    return otherMonetaryDetails;
  }

  public void setOtherMonetaryDetails(List<MonetaryInformationDetailsType270802C> otherMonetaryDetails) {
    this.otherMonetaryDetails = otherMonetaryDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonetaryInformationType193831S monetaryInformationType193831S = (MonetaryInformationType193831S) o;
    return Objects.equals(this.monetaryDetails, monetaryInformationType193831S.monetaryDetails) &&
        Objects.equals(this.otherMonetaryDetails, monetaryInformationType193831S.otherMonetaryDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monetaryDetails, otherMonetaryDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetaryInformationType193831S {\n");
    
    sb.append("    monetaryDetails: ").append(toIndentedString(monetaryDetails)).append("\n");
    sb.append("    otherMonetaryDetails: ").append(toIndentedString(otherMonetaryDetails)).append("\n");
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

