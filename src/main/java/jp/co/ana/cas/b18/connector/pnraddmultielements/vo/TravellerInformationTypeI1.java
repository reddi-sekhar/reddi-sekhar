package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerDetailsTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerSurnameInformationTypeI1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerInformationTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerInformationTypeI1   {
  @JsonProperty("passenger")
  @Valid
  private List<TravellerDetailsTypeI1> passenger = null;

  @JsonProperty("traveller")
  private TravellerSurnameInformationTypeI1 traveller;

  public TravellerInformationTypeI1 passenger(List<TravellerDetailsTypeI1> passenger) {
    this.passenger = passenger;
    return this;
  }

  public TravellerInformationTypeI1 addPassengerItem(TravellerDetailsTypeI1 passengerItem) {
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

  public List<TravellerDetailsTypeI1> getPassenger() {
    return passenger;
  }

  public void setPassenger(List<TravellerDetailsTypeI1> passenger) {
    this.passenger = passenger;
  }

  public TravellerInformationTypeI1 traveller(TravellerSurnameInformationTypeI1 traveller) {
    this.traveller = traveller;
    return this;
  }

  /**
   * Get traveller
   * @return traveller
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerSurnameInformationTypeI1 getTraveller() {
    return traveller;
  }

  public void setTraveller(TravellerSurnameInformationTypeI1 traveller) {
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
    TravellerInformationTypeI1 travellerInformationTypeI1 = (TravellerInformationTypeI1) o;
    return Objects.equals(this.passenger, travellerInformationTypeI1.passenger) &&
        Objects.equals(this.traveller, travellerInformationTypeI1.traveller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passenger, traveller);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerInformationTypeI1 {\n");
    
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

