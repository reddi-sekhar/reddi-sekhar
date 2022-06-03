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
 * ReservationControlInformationDetailsTypeI16352C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReservationControlInformationDetailsTypeI16352C   {
  @JsonProperty("controlNumber")
  private String controlNumber;

  @JsonProperty("controlType")
  private String controlType;

  public ReservationControlInformationDetailsTypeI16352C controlNumber(String controlNumber) {
    this.controlNumber = controlNumber;
    return this;
  }

  /**
   * Get controlNumber
   * @return controlNumber
  */
  @ApiModelProperty(value = "")


  public String getControlNumber() {
    return controlNumber;
  }

  public void setControlNumber(String controlNumber) {
    this.controlNumber = controlNumber;
  }

  public ReservationControlInformationDetailsTypeI16352C controlType(String controlType) {
    this.controlType = controlType;
    return this;
  }

  /**
   * Get controlType
   * @return controlType
  */
  @ApiModelProperty(value = "")


  public String getControlType() {
    return controlType;
  }

  public void setControlType(String controlType) {
    this.controlType = controlType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationControlInformationDetailsTypeI16352C reservationControlInformationDetailsTypeI16352C = (ReservationControlInformationDetailsTypeI16352C) o;
    return Objects.equals(this.controlNumber, reservationControlInformationDetailsTypeI16352C.controlNumber) &&
        Objects.equals(this.controlType, reservationControlInformationDetailsTypeI16352C.controlType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlNumber, controlType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationControlInformationDetailsTypeI16352C {\n");
    
    sb.append("    controlNumber: ").append(toIndentedString(controlNumber)).append("\n");
    sb.append("    controlType: ").append(toIndentedString(controlType)).append("\n");
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

