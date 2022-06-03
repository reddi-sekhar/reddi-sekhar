package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.ReservationHeaderResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationInfoResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ReservationInfoResponseDto   {
  @JsonProperty("reservation")
  @Valid
  private List<ReservationHeaderResponseDto> reservation = null;

  public ReservationInfoResponseDto reservation(List<ReservationHeaderResponseDto> reservation) {
    this.reservation = reservation;
    return this;
  }

  public ReservationInfoResponseDto addReservationItem(ReservationHeaderResponseDto reservationItem) {
    if (this.reservation == null) {
      this.reservation = new ArrayList<>();
    }
    this.reservation.add(reservationItem);
    return this;
  }

  /**
   * Get reservation
   * @return reservation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReservationHeaderResponseDto> getReservation() {
    return reservation;
  }

  public void setReservation(List<ReservationHeaderResponseDto> reservation) {
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
    ReservationInfoResponseDto reservationInfoResponseDto = (ReservationInfoResponseDto) o;
    return Objects.equals(this.reservation, reservationInfoResponseDto.reservation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationInfoResponseDto {\n");
    
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

