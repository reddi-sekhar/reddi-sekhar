package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationDetailsTypeI1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationControlInformationTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReservationControlInformationTypeI1   {
  @JsonProperty("reservation")
  private ReservationControlInformationDetailsTypeI1 reservation;

  public ReservationControlInformationTypeI1 reservation(ReservationControlInformationDetailsTypeI1 reservation) {
    this.reservation = reservation;
    return this;
  }

  /**
   * Get reservation
   * @return reservation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationControlInformationDetailsTypeI1 getReservation() {
    return reservation;
  }

  public void setReservation(ReservationControlInformationDetailsTypeI1 reservation) {
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
    ReservationControlInformationTypeI1 reservationControlInformationTypeI1 = (ReservationControlInformationTypeI1) o;
    return Objects.equals(this.reservation, reservationControlInformationTypeI1.reservation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationControlInformationTypeI1 {\n");
    
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

