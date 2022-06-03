package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.TicketingCarrierTypeRequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TicketingCarrierRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TicketingCarrierRequestDto   {
  @JsonProperty("carrier")
  private TicketingCarrierTypeRequestDto carrier;

  @JsonProperty("passengerType")
  private String passengerType;

  public TicketingCarrierRequestDto carrier(TicketingCarrierTypeRequestDto carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Get carrier
   * @return carrier
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketingCarrierTypeRequestDto getCarrier() {
    return carrier;
  }

  public void setCarrier(TicketingCarrierTypeRequestDto carrier) {
    this.carrier = carrier;
  }

  public TicketingCarrierRequestDto passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Passenger type
   * @return passengerType
  */
  @ApiModelProperty(value = "Passenger type")

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
    TicketingCarrierRequestDto ticketingCarrierRequestDto = (TicketingCarrierRequestDto) o;
    return Objects.equals(this.carrier, ticketingCarrierRequestDto.carrier) &&
        Objects.equals(this.passengerType, ticketingCarrierRequestDto.passengerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, passengerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketingCarrierRequestDto {\n");
    
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
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

