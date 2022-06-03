package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationDetailsTypeI86190C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MonetaryInformationTypeI53012S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MonetaryInformationTypeI53012S   {
  @JsonProperty("monetaryDetails")
  private MonetaryInformationDetailsTypeI86190C monetaryDetails;

  @JsonProperty("otherMonetaryDetails")
  private MonetaryInformationDetailsTypeI86190C otherMonetaryDetails;

  public MonetaryInformationTypeI53012S monetaryDetails(MonetaryInformationDetailsTypeI86190C monetaryDetails) {
    this.monetaryDetails = monetaryDetails;
    return this;
  }

  /**
   * Get monetaryDetails
   * @return monetaryDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationDetailsTypeI86190C getMonetaryDetails() {
    return monetaryDetails;
  }

  public void setMonetaryDetails(MonetaryInformationDetailsTypeI86190C monetaryDetails) {
    this.monetaryDetails = monetaryDetails;
  }

  public MonetaryInformationTypeI53012S otherMonetaryDetails(MonetaryInformationDetailsTypeI86190C otherMonetaryDetails) {
    this.otherMonetaryDetails = otherMonetaryDetails;
    return this;
  }

  /**
   * Get otherMonetaryDetails
   * @return otherMonetaryDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationDetailsTypeI86190C getOtherMonetaryDetails() {
    return otherMonetaryDetails;
  }

  public void setOtherMonetaryDetails(MonetaryInformationDetailsTypeI86190C otherMonetaryDetails) {
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
    MonetaryInformationTypeI53012S monetaryInformationTypeI53012S = (MonetaryInformationTypeI53012S) o;
    return Objects.equals(this.monetaryDetails, monetaryInformationTypeI53012S.monetaryDetails) &&
        Objects.equals(this.otherMonetaryDetails, monetaryInformationTypeI53012S.otherMonetaryDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monetaryDetails, otherMonetaryDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetaryInformationTypeI53012S {\n");
    
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

