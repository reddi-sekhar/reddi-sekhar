package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CommissionInformationType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CommissionInformationType6428C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommissionElementType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CommissionElementType   {
  @JsonProperty("commissionInfo")
  private CommissionInformationType1 commissionInfo;

  @JsonProperty("indicator")
  private String indicator;

  @JsonProperty("manualCapping")
  private BigDecimal manualCapping;

  @JsonProperty("oldCommission")
  private CommissionInformationType6428C oldCommission;

  @JsonProperty("passengerType")
  private String passengerType;

  public CommissionElementType commissionInfo(CommissionInformationType1 commissionInfo) {
    this.commissionInfo = commissionInfo;
    return this;
  }

  /**
   * Get commissionInfo
   * @return commissionInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommissionInformationType1 getCommissionInfo() {
    return commissionInfo;
  }

  public void setCommissionInfo(CommissionInformationType1 commissionInfo) {
    this.commissionInfo = commissionInfo;
  }

  public CommissionElementType indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Get indicator
   * @return indicator
  */
  @ApiModelProperty(value = "")


  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public CommissionElementType manualCapping(BigDecimal manualCapping) {
    this.manualCapping = manualCapping;
    return this;
  }

  /**
   * Get manualCapping
   * @return manualCapping
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getManualCapping() {
    return manualCapping;
  }

  public void setManualCapping(BigDecimal manualCapping) {
    this.manualCapping = manualCapping;
  }

  public CommissionElementType oldCommission(CommissionInformationType6428C oldCommission) {
    this.oldCommission = oldCommission;
    return this;
  }

  /**
   * Get oldCommission
   * @return oldCommission
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommissionInformationType6428C getOldCommission() {
    return oldCommission;
  }

  public void setOldCommission(CommissionInformationType6428C oldCommission) {
    this.oldCommission = oldCommission;
  }

  public CommissionElementType passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Get passengerType
   * @return passengerType
  */
  @ApiModelProperty(value = "")


  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommissionElementType commissionElementType = (CommissionElementType) o;
    return Objects.equals(this.commissionInfo, commissionElementType.commissionInfo) &&
        Objects.equals(this.indicator, commissionElementType.indicator) &&
        Objects.equals(this.manualCapping, commissionElementType.manualCapping) &&
        Objects.equals(this.oldCommission, commissionElementType.oldCommission) &&
        Objects.equals(this.passengerType, commissionElementType.passengerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissionInfo, indicator, manualCapping, oldCommission, passengerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommissionElementType {\n");
    
    sb.append("    commissionInfo: ").append(toIndentedString(commissionInfo)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    manualCapping: ").append(toIndentedString(manualCapping)).append("\n");
    sb.append("    oldCommission: ").append(toIndentedString(oldCommission)).append("\n");
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
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

