package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationControlInformationDetailsTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReservationControlInformationDetailsTypeU   {
  @JsonProperty("reservationControlNumber")
  private String reservationControlNumber;

  @JsonProperty("reservationControlNumberQual")
  private String reservationControlNumberQual;

  @JsonProperty("tourOperatorCode")
  private String tourOperatorCode;

  public ReservationControlInformationDetailsTypeU reservationControlNumber(String reservationControlNumber) {
    this.reservationControlNumber = reservationControlNumber;
    return this;
  }

  /**
   * Get reservationControlNumber
   * @return reservationControlNumber
  */
  @ApiModelProperty(value = "")


  public String getReservationControlNumber() {
    return reservationControlNumber;
  }

  public void setReservationControlNumber(String reservationControlNumber) {
    this.reservationControlNumber = reservationControlNumber;
  }

  public ReservationControlInformationDetailsTypeU reservationControlNumberQual(String reservationControlNumberQual) {
    this.reservationControlNumberQual = reservationControlNumberQual;
    return this;
  }

  /**
   * Get reservationControlNumberQual
   * @return reservationControlNumberQual
  */
  @ApiModelProperty(value = "")


  public String getReservationControlNumberQual() {
    return reservationControlNumberQual;
  }

  public void setReservationControlNumberQual(String reservationControlNumberQual) {
    this.reservationControlNumberQual = reservationControlNumberQual;
  }

  public ReservationControlInformationDetailsTypeU tourOperatorCode(String tourOperatorCode) {
    this.tourOperatorCode = tourOperatorCode;
    return this;
  }

  /**
   * Get tourOperatorCode
   * @return tourOperatorCode
  */
  @ApiModelProperty(value = "")


  public String getTourOperatorCode() {
    return tourOperatorCode;
  }

  public void setTourOperatorCode(String tourOperatorCode) {
    this.tourOperatorCode = tourOperatorCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationControlInformationDetailsTypeU reservationControlInformationDetailsTypeU = (ReservationControlInformationDetailsTypeU) o;
    return Objects.equals(this.reservationControlNumber, reservationControlInformationDetailsTypeU.reservationControlNumber) &&
        Objects.equals(this.reservationControlNumberQual, reservationControlInformationDetailsTypeU.reservationControlNumberQual) &&
        Objects.equals(this.tourOperatorCode, reservationControlInformationDetailsTypeU.tourOperatorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservationControlNumber, reservationControlNumberQual, tourOperatorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationControlInformationDetailsTypeU {\n");
    
    sb.append("    reservationControlNumber: ").append(toIndentedString(reservationControlNumber)).append("\n");
    sb.append("    reservationControlNumberQual: ").append(toIndentedString(reservationControlNumberQual)).append("\n");
    sb.append("    tourOperatorCode: ").append(toIndentedString(tourOperatorCode)).append("\n");
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

