package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DiscountInformationType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DiscountInformationType1   {
  @JsonProperty("adjustmentReason")
  private String adjustmentReason;

  @JsonProperty("percentage")
  private Long percentage;

  @JsonProperty("staffName")
  private String staffName;

  @JsonProperty("staffNumber")
  private String staffNumber;

  @JsonProperty("status")
  private String status;

  public DiscountInformationType1 adjustmentReason(String adjustmentReason) {
    this.adjustmentReason = adjustmentReason;
    return this;
  }

  /**
   * Get adjustmentReason
   * @return adjustmentReason
  */
  @ApiModelProperty(value = "")


  public String getAdjustmentReason() {
    return adjustmentReason;
  }

  public void setAdjustmentReason(String adjustmentReason) {
    this.adjustmentReason = adjustmentReason;
  }

  public DiscountInformationType1 percentage(Long percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Get percentage
   * @return percentage
  */
  @ApiModelProperty(value = "")


  public Long getPercentage() {
    return percentage;
  }

  public void setPercentage(Long percentage) {
    this.percentage = percentage;
  }

  public DiscountInformationType1 staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  */
  @ApiModelProperty(value = "")


  public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public DiscountInformationType1 staffNumber(String staffNumber) {
    this.staffNumber = staffNumber;
    return this;
  }

  /**
   * Get staffNumber
   * @return staffNumber
  */
  @ApiModelProperty(value = "")


  public String getStaffNumber() {
    return staffNumber;
  }

  public void setStaffNumber(String staffNumber) {
    this.staffNumber = staffNumber;
  }

  public DiscountInformationType1 status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountInformationType1 discountInformationType1 = (DiscountInformationType1) o;
    return Objects.equals(this.adjustmentReason, discountInformationType1.adjustmentReason) &&
        Objects.equals(this.percentage, discountInformationType1.percentage) &&
        Objects.equals(this.staffName, discountInformationType1.staffName) &&
        Objects.equals(this.staffNumber, discountInformationType1.staffNumber) &&
        Objects.equals(this.status, discountInformationType1.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentReason, percentage, staffName, staffNumber, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountInformationType1 {\n");
    
    sb.append("    adjustmentReason: ").append(toIndentedString(adjustmentReason)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNumber: ").append(toIndentedString(staffNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

