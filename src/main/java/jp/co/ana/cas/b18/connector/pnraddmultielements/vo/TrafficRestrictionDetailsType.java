package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TrafficRestrictionDetailsTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TrafficRestrictionDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TrafficRestrictionDetailsType   {
  @JsonProperty("restrictionDetails")
  private TrafficRestrictionDetailsTypeU restrictionDetails;

  public TrafficRestrictionDetailsType restrictionDetails(TrafficRestrictionDetailsTypeU restrictionDetails) {
    this.restrictionDetails = restrictionDetails;
    return this;
  }

  /**
   * Get restrictionDetails
   * @return restrictionDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TrafficRestrictionDetailsTypeU getRestrictionDetails() {
    return restrictionDetails;
  }

  public void setRestrictionDetails(TrafficRestrictionDetailsTypeU restrictionDetails) {
    this.restrictionDetails = restrictionDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficRestrictionDetailsType trafficRestrictionDetailsType = (TrafficRestrictionDetailsType) o;
    return Objects.equals(this.restrictionDetails, trafficRestrictionDetailsType.restrictionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrictionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficRestrictionDetailsType {\n");
    
    sb.append("    restrictionDetails: ").append(toIndentedString(restrictionDetails)).append("\n");
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

