package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CommissionDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommissionInformationTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CommissionInformationTypeI   {
  @JsonProperty("commissionDetails")
  private CommissionDetailsTypeI commissionDetails;

  @JsonProperty("otherComDetails")
  private CommissionDetailsTypeI otherComDetails;

  public CommissionInformationTypeI commissionDetails(CommissionDetailsTypeI commissionDetails) {
    this.commissionDetails = commissionDetails;
    return this;
  }

  /**
   * Get commissionDetails
   * @return commissionDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommissionDetailsTypeI getCommissionDetails() {
    return commissionDetails;
  }

  public void setCommissionDetails(CommissionDetailsTypeI commissionDetails) {
    this.commissionDetails = commissionDetails;
  }

  public CommissionInformationTypeI otherComDetails(CommissionDetailsTypeI otherComDetails) {
    this.otherComDetails = otherComDetails;
    return this;
  }

  /**
   * Get otherComDetails
   * @return otherComDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommissionDetailsTypeI getOtherComDetails() {
    return otherComDetails;
  }

  public void setOtherComDetails(CommissionDetailsTypeI otherComDetails) {
    this.otherComDetails = otherComDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommissionInformationTypeI commissionInformationTypeI = (CommissionInformationTypeI) o;
    return Objects.equals(this.commissionDetails, commissionInformationTypeI.commissionDetails) &&
        Objects.equals(this.otherComDetails, commissionInformationTypeI.otherComDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissionDetails, otherComDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommissionInformationTypeI {\n");
    
    sb.append("    commissionDetails: ").append(toIndentedString(commissionDetails)).append("\n");
    sb.append("    otherComDetails: ").append(toIndentedString(otherComDetails)).append("\n");
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

