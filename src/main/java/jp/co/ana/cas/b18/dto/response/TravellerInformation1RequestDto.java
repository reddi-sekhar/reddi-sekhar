package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.Passenger1RequestDto;
import jp.co.ana.cas.b18.dto.response.Traveller1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerInformation1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TravellerInformation1RequestDto   {
  @JsonProperty("passenger")
  @Valid
  private List<Passenger1RequestDto> passenger = null;

  @JsonProperty("traveller")
  private Traveller1RequestDto traveller;

  public TravellerInformation1RequestDto passenger(List<Passenger1RequestDto> passenger) {
    this.passenger = passenger;
    return this;
  }

  public TravellerInformation1RequestDto addPassengerItem(Passenger1RequestDto passengerItem) {
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

  public List<Passenger1RequestDto> getPassenger() {
    return passenger;
  }

  public void setPassenger(List<Passenger1RequestDto> passenger) {
    this.passenger = passenger;
  }

  public TravellerInformation1RequestDto traveller(Traveller1RequestDto traveller) {
    this.traveller = traveller;
    return this;
  }

  /**
   * Get traveller
   * @return traveller
  */
  @ApiModelProperty(value = "")

  @Valid

  public Traveller1RequestDto getTraveller() {
    return traveller;
  }

  public void setTraveller(Traveller1RequestDto traveller) {
    this.traveller = traveller;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravellerInformation1RequestDto travellerInformation1RequestDto = (TravellerInformation1RequestDto) o;
    return Objects.equals(this.passenger, travellerInformation1RequestDto.passenger) &&
        Objects.equals(this.traveller, travellerInformation1RequestDto.traveller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passenger, traveller);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerInformation1RequestDto {\n");
    
    sb.append("    passenger: ").append(toIndentedString(passenger)).append("\n");
    sb.append("    traveller: ").append(toIndentedString(traveller)).append("\n");
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

