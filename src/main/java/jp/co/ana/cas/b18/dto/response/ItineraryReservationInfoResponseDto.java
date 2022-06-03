package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.ReservationResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItineraryReservationInfoResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ItineraryReservationInfoResponseDto   {
  @JsonProperty("reservation")
  private ReservationResponseDto reservation;

  public ItineraryReservationInfoResponseDto reservation(ReservationResponseDto reservation) {
    this.reservation = reservation;
    return this;
  }

  /**
   * Get reservation
   * @return reservation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationResponseDto getReservation() {
    return reservation;
  }

  public void setReservation(ReservationResponseDto reservation) {
    this.reservation = reservation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItineraryReservationInfoResponseDto itineraryReservationInfoResponseDto = (ItineraryReservationInfoResponseDto) o;
    return Objects.equals(this.reservation, itineraryReservationInfoResponseDto.reservation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItineraryReservationInfoResponseDto {\n");
    
    sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
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

