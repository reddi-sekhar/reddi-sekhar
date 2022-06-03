package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusDetailsTypeI20684C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatusTypeI13270S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StatusTypeI13270S   {
  @JsonProperty("otherStatusDetails")
  @Valid
  private List<StatusDetailsTypeI20684C> otherStatusDetails = null;

  @JsonProperty("statusDetails")
  private StatusDetailsTypeI20684C statusDetails;

  public StatusTypeI13270S otherStatusDetails(List<StatusDetailsTypeI20684C> otherStatusDetails) {
    this.otherStatusDetails = otherStatusDetails;
    return this;
  }

  public StatusTypeI13270S addOtherStatusDetailsItem(StatusDetailsTypeI20684C otherStatusDetailsItem) {
    if (this.otherStatusDetails == null) {
      this.otherStatusDetails = new ArrayList<>();
    }
    this.otherStatusDetails.add(otherStatusDetailsItem);
    return this;
  }

  /**
   * Get otherStatusDetails
   * @return otherStatusDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StatusDetailsTypeI20684C> getOtherStatusDetails() {
    return otherStatusDetails;
  }

  public void setOtherStatusDetails(List<StatusDetailsTypeI20684C> otherStatusDetails) {
    this.otherStatusDetails = otherStatusDetails;
  }

  public StatusTypeI13270S statusDetails(StatusDetailsTypeI20684C statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  /**
   * Get statusDetails
   * @return statusDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusDetailsTypeI20684C getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(StatusDetailsTypeI20684C statusDetails) {
    this.statusDetails = statusDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusTypeI13270S statusTypeI13270S = (StatusTypeI13270S) o;
    return Objects.equals(this.otherStatusDetails, statusTypeI13270S.otherStatusDetails) &&
        Objects.equals(this.statusDetails, statusTypeI13270S.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherStatusDetails, statusDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusTypeI13270S {\n");
    
    sb.append("    otherStatusDetails: ").append(toIndentedString(otherStatusDetails)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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

