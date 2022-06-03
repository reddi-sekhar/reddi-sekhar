package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.DeliveryInformationResponseDto;
import jp.co.ana.cas.b18.dto.response.ReasonsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccregReasonResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class AccregReasonResponseDto   {
  @JsonProperty("reasons")
  private ReasonsResponseDto reasons;

  @JsonProperty("deliveryInformation")
  private DeliveryInformationResponseDto deliveryInformation;

  public AccregReasonResponseDto reasons(ReasonsResponseDto reasons) {
    this.reasons = reasons;
    return this;
  }

  /**
   * Get reasons
   * @return reasons
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReasonsResponseDto getReasons() {
    return reasons;
  }

  public void setReasons(ReasonsResponseDto reasons) {
    this.reasons = reasons;
  }

  public AccregReasonResponseDto deliveryInformation(DeliveryInformationResponseDto deliveryInformation) {
    this.deliveryInformation = deliveryInformation;
    return this;
  }

  /**
   * Get deliveryInformation
   * @return deliveryInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public DeliveryInformationResponseDto getDeliveryInformation() {
    return deliveryInformation;
  }

  public void setDeliveryInformation(DeliveryInformationResponseDto deliveryInformation) {
    this.deliveryInformation = deliveryInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccregReasonResponseDto accregReasonResponseDto = (AccregReasonResponseDto) o;
    return Objects.equals(this.reasons, accregReasonResponseDto.reasons) &&
        Objects.equals(this.deliveryInformation, accregReasonResponseDto.deliveryInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasons, deliveryInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccregReasonResponseDto {\n");
    
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    deliveryInformation: ").append(toIndentedString(deliveryInformation)).append("\n");
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

