package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.PassengerResponseDto;
import jp.co.ana.cas.b18.dto.response.TravellerResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerInformationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TravellerInformationResponseDto   {
  @JsonProperty("traveller")
  private TravellerResponseDto traveller;

  @JsonProperty("passenger")
  @Valid
  private List<PassengerResponseDto> passenger = null;

  public TravellerInformationResponseDto traveller(TravellerResponseDto traveller) {
    this.traveller = traveller;
    return this;
  }

  /**
   * Get traveller
   * @return traveller
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerResponseDto getTraveller() {
    return traveller;
  }

  public void setTraveller(TravellerResponseDto traveller) {
    this.traveller = traveller;
  }

  public TravellerInformationResponseDto passenger(List<PassengerResponseDto> passenger) {
    this.passenger = passenger;
    return this;
  }

  public TravellerInformationResponseDto addPassengerItem(PassengerResponseDto passengerItem) {
    if (this.passenger == null) {
      this.passenger = new ArrayList<>();
    }
    this.passenger.add(passengerItem);
    return this;
  }

  /**
   * Get passenger
   * @return passenger
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PassengerResponseDto> getPassenger() {
    return passenger;
  }

  public void setPassenger(List<PassengerResponseDto> passenger) {
    this.passenger = passenger;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravellerInformationResponseDto travellerInformationResponseDto = (TravellerInformationResponseDto) o;
    return Objects.equals(this.traveller, travellerInformationResponseDto.traveller) &&
        Objects.equals(this.passenger, travellerInformationResponseDto.passenger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traveller, passenger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerInformationResponseDto {\n");
    
    sb.append("    traveller: ").append(toIndentedString(traveller)).append("\n");
    sb.append("    passenger: ").append(toIndentedString(passenger)).append("\n");
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

