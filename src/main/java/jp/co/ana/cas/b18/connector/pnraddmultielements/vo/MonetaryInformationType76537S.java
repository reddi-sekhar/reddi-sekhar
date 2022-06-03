package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MonetaryInformationType76537S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MonetaryInformationType76537S   {
  @JsonProperty("monetaryDetails")
  private MonetaryInformationDetailsTypeI monetaryDetails;

  @JsonProperty("otherMonetaryDetails")
  @Valid
  private List<MonetaryInformationDetailsTypeI> otherMonetaryDetails = null;

  public MonetaryInformationType76537S monetaryDetails(MonetaryInformationDetailsTypeI monetaryDetails) {
    this.monetaryDetails = monetaryDetails;
    return this;
  }

  /**
   * Get monetaryDetails
   * @return monetaryDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationDetailsTypeI getMonetaryDetails() {
    return monetaryDetails;
  }

  public void setMonetaryDetails(MonetaryInformationDetailsTypeI monetaryDetails) {
    this.monetaryDetails = monetaryDetails;
  }

  public MonetaryInformationType76537S otherMonetaryDetails(List<MonetaryInformationDetailsTypeI> otherMonetaryDetails) {
    this.otherMonetaryDetails = otherMonetaryDetails;
    return this;
  }

  public MonetaryInformationType76537S addOtherMonetaryDetailsItem(MonetaryInformationDetailsTypeI otherMonetaryDetailsItem) {
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

  public List<MonetaryInformationDetailsTypeI> getOtherMonetaryDetails() {
    return otherMonetaryDetails;
  }

  public void setOtherMonetaryDetails(List<MonetaryInformationDetailsTypeI> otherMonetaryDetails) {
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
    MonetaryInformationType76537S monetaryInformationType76537S = (MonetaryInformationType76537S) o;
    return Objects.equals(this.monetaryDetails, monetaryInformationType76537S.monetaryDetails) &&
        Objects.equals(this.otherMonetaryDetails, monetaryInformationType76537S.otherMonetaryDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monetaryDetails, otherMonetaryDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetaryInformationType76537S {\n");
    
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

