package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationDetailsTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationControlInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReservationControlInformationTypeU   {
  @JsonProperty("reservationControlId")
  private ReservationControlInformationDetailsTypeU reservationControlId;

  public ReservationControlInformationTypeU reservationControlId(ReservationControlInformationDetailsTypeU reservationControlId) {
    this.reservationControlId = reservationControlId;
    return this;
  }

  /**
   * Get reservationControlId
   * @return reservationControlId
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationControlInformationDetailsTypeU getReservationControlId() {
    return reservationControlId;
  }

  public void setReservationControlId(ReservationControlInformationDetailsTypeU reservationControlId) {
    this.reservationControlId = reservationControlId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationControlInformationTypeU reservationControlInformationTypeU = (ReservationControlInformationTypeU) o;
    return Objects.equals(this.reservationControlId, reservationControlInformationTypeU.reservationControlId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservationControlId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationControlInformationTypeU {\n");
    
    sb.append("    reservationControlId: ").append(toIndentedString(reservationControlId)).append("\n");
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

