package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.CommissionInformation1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommissionElementRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class CommissionElementRequestDto   {
  @JsonProperty("commissionInfo")
  private CommissionInformation1RequestDto commissionInfo;

  @JsonProperty("passengerType")
  private String passengerType;

  public CommissionElementRequestDto commissionInfo(CommissionInformation1RequestDto commissionInfo) {
    this.commissionInfo = commissionInfo;
    return this;
  }

  /**
   * Get commissionInfo
   * @return commissionInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommissionInformation1RequestDto getCommissionInfo() {
    return commissionInfo;
  }

  public void setCommissionInfo(CommissionInformation1RequestDto commissionInfo) {
    this.commissionInfo = commissionInfo;
  }

  public CommissionElementRequestDto passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Passenger type  PAX for Passenger
   * @return passengerType
  */
  @ApiModelProperty(value = "Passenger type  PAX for Passenger")

@Size(min=1,max=3) 
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
    CommissionElementRequestDto commissionElementRequestDto = (CommissionElementRequestDto) o;
    return Objects.equals(this.commissionInfo, commissionElementRequestDto.commissionInfo) &&
        Objects.equals(this.passengerType, commissionElementRequestDto.passengerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissionInfo, passengerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommissionElementRequestDto {\n");
    
    sb.append("    commissionInfo: ").append(toIndentedString(commissionInfo)).append("\n");
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

