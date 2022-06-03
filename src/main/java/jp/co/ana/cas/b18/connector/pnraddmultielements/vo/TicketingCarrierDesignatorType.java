package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TicketingCarrierType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TicketingCarrierDesignatorType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TicketingCarrierDesignatorType   {
  @JsonProperty("carrier")
  private TicketingCarrierType carrier;

  @JsonProperty("passengerType")
  private String passengerType;

  public TicketingCarrierDesignatorType carrier(TicketingCarrierType carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Get carrier
   * @return carrier
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketingCarrierType getCarrier() {
    return carrier;
  }

  public void setCarrier(TicketingCarrierType carrier) {
    this.carrier = carrier;
  }

  public TicketingCarrierDesignatorType passengerType(String passengerType) {
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
    TicketingCarrierDesignatorType ticketingCarrierDesignatorType = (TicketingCarrierDesignatorType) o;
    return Objects.equals(this.carrier, ticketingCarrierDesignatorType.carrier) &&
        Objects.equals(this.passengerType, ticketingCarrierDesignatorType.passengerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, passengerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketingCarrierDesignatorType {\n");
    
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

