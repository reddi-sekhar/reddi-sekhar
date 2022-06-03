package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationDetailsTypeI16352C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationControlInformationTypeI8957S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReservationControlInformationTypeI8957S   {
  @JsonProperty("reservation")
  @Valid
  private List<ReservationControlInformationDetailsTypeI16352C> reservation = null;

  public ReservationControlInformationTypeI8957S reservation(List<ReservationControlInformationDetailsTypeI16352C> reservation) {
    this.reservation = reservation;
    return this;
  }

  public ReservationControlInformationTypeI8957S addReservationItem(ReservationControlInformationDetailsTypeI16352C reservationItem) {
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

  public List<ReservationControlInformationDetailsTypeI16352C> getReservation() {
    return reservation;
  }

  public void setReservation(List<ReservationControlInformationDetailsTypeI16352C> reservation) {
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
    ReservationControlInformationTypeI8957S reservationControlInformationTypeI8957S = (ReservationControlInformationTypeI8957S) o;
    return Objects.equals(this.reservation, reservationControlInformationTypeI8957S.reservation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationControlInformationTypeI8957S {\n");
    
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

