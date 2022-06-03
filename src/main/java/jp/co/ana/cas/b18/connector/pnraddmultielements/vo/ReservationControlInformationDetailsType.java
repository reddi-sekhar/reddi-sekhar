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
 * ReservationControlInformationDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ReservationControlInformationDetailsType   {
  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("controlNumber")
  private String controlNumber;

  @JsonProperty("controlType")
  private String controlType;

  @JsonProperty("date")
  private String date;

  @JsonProperty("time")
  private Long time;

  public ReservationControlInformationDetailsType companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  */
  @ApiModelProperty(value = "")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public ReservationControlInformationDetailsType controlNumber(String controlNumber) {
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

  public ReservationControlInformationDetailsType controlType(String controlType) {
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

  public ReservationControlInformationDetailsType date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ReservationControlInformationDetailsType time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")


  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationControlInformationDetailsType reservationControlInformationDetailsType = (ReservationControlInformationDetailsType) o;
    return Objects.equals(this.companyId, reservationControlInformationDetailsType.companyId) &&
        Objects.equals(this.controlNumber, reservationControlInformationDetailsType.controlNumber) &&
        Objects.equals(this.controlType, reservationControlInformationDetailsType.controlType) &&
        Objects.equals(this.date, reservationControlInformationDetailsType.date) &&
        Objects.equals(this.time, reservationControlInformationDetailsType.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, controlNumber, controlType, date, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationControlInformationDetailsType {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    controlNumber: ").append(toIndentedString(controlNumber)).append("\n");
    sb.append("    controlType: ").append(toIndentedString(controlType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

