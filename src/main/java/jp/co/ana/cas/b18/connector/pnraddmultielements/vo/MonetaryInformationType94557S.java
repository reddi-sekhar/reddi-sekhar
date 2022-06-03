package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MonetaryInformationType94557S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MonetaryInformationType94557S   {
  @JsonProperty("monetaryDetails")
  private MonetaryInformationDetailsType monetaryDetails;

  @JsonProperty("otherMonetaryDetails")
  @Valid
  private List<MonetaryInformationDetailsType> otherMonetaryDetails = null;

  public MonetaryInformationType94557S monetaryDetails(MonetaryInformationDetailsType monetaryDetails) {
    this.monetaryDetails = monetaryDetails;
    return this;
  }

  /**
   * Get monetaryDetails
   * @return monetaryDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationDetailsType getMonetaryDetails() {
    return monetaryDetails;
  }

  public void setMonetaryDetails(MonetaryInformationDetailsType monetaryDetails) {
    this.monetaryDetails = monetaryDetails;
  }

  public MonetaryInformationType94557S otherMonetaryDetails(List<MonetaryInformationDetailsType> otherMonetaryDetails) {
    this.otherMonetaryDetails = otherMonetaryDetails;
    return this;
  }

  public MonetaryInformationType94557S addOtherMonetaryDetailsItem(MonetaryInformationDetailsType otherMonetaryDetailsItem) {
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

  public List<MonetaryInformationDetailsType> getOtherMonetaryDetails() {
    return otherMonetaryDetails;
  }

  public void setOtherMonetaryDetails(List<MonetaryInformationDetailsType> otherMonetaryDetails) {
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
    MonetaryInformationType94557S monetaryInformationType94557S = (MonetaryInformationType94557S) o;
    return Objects.equals(this.monetaryDetails, monetaryInformationType94557S.monetaryDetails) &&
        Objects.equals(this.otherMonetaryDetails, monetaryInformationType94557S.otherMonetaryDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monetaryDetails, otherMonetaryDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetaryInformationType94557S {\n");
    
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

