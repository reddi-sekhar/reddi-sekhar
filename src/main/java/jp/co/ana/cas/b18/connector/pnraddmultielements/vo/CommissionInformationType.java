package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CommissionDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommissionInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CommissionInformationType   {
  @JsonProperty("commissionDetails")
  private CommissionDetailsType commissionDetails;

  public CommissionInformationType commissionDetails(CommissionDetailsType commissionDetails) {
    this.commissionDetails = commissionDetails;
    return this;
  }

  /**
   * Get commissionDetails
   * @return commissionDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommissionDetailsType getCommissionDetails() {
    return commissionDetails;
  }

  public void setCommissionDetails(CommissionDetailsType commissionDetails) {
    this.commissionDetails = commissionDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommissionInformationType commissionInformationType = (CommissionInformationType) o;
    return Objects.equals(this.commissionDetails, commissionInformationType.commissionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommissionInformationType {\n");
    
    sb.append("    commissionDetails: ").append(toIndentedString(commissionDetails)).append("\n");
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

