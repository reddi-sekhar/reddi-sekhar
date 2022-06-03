package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerDetailsType260694C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerSurnameInformationType260693C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerInformationType185946S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerInformationType185946S   {
  @JsonProperty("passenger")
  @Valid
  private List<TravellerDetailsType260694C> passenger = null;

  @JsonProperty("traveller")
  private TravellerSurnameInformationType260693C traveller;

  public TravellerInformationType185946S passenger(List<TravellerDetailsType260694C> passenger) {
    this.passenger = passenger;
    return this;
  }

  public TravellerInformationType185946S addPassengerItem(TravellerDetailsType260694C passengerItem) {
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

  public List<TravellerDetailsType260694C> getPassenger() {
    return passenger;
  }

  public void setPassenger(List<TravellerDetailsType260694C> passenger) {
    this.passenger = passenger;
  }

  public TravellerInformationType185946S traveller(TravellerSurnameInformationType260693C traveller) {
    this.traveller = traveller;
    return this;
  }

  /**
   * Get traveller
   * @return traveller
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerSurnameInformationType260693C getTraveller() {
    return traveller;
  }

  public void setTraveller(TravellerSurnameInformationType260693C traveller) {
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
    TravellerInformationType185946S travellerInformationType185946S = (TravellerInformationType185946S) o;
    return Objects.equals(this.passenger, travellerInformationType185946S.passenger) &&
        Objects.equals(this.traveller, travellerInformationType185946S.traveller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passenger, traveller);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerInformationType185946S {\n");
    
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

