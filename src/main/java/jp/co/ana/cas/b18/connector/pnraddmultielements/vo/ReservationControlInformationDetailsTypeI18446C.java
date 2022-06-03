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
 * ReservationControlInformationDetailsTypeI18446C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReservationControlInformationDetailsTypeI18446C   {
  @JsonProperty("controlNumber")
  private String controlNumber;

  public ReservationControlInformationDetailsTypeI18446C controlNumber(String controlNumber) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationControlInformationDetailsTypeI18446C reservationControlInformationDetailsTypeI18446C = (ReservationControlInformationDetailsTypeI18446C) o;
    return Objects.equals(this.controlNumber, reservationControlInformationDetailsTypeI18446C.controlNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationControlInformationDetailsTypeI18446C {\n");
    
    sb.append("    controlNumber: ").append(toIndentedString(controlNumber)).append("\n");
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

