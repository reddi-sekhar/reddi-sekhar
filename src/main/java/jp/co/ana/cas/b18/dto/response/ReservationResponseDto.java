package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReservationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ReservationResponseDto   {
  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("controlNumber")
  private String controlNumber;

  @JsonProperty("controlType")
  private String controlType;

  @JsonProperty("time")
  private String time;

  @JsonProperty("date")
  private String date;

  public ReservationResponseDto companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * 1A or Other airline record locator information
   * @return companyId
  */
  @ApiModelProperty(example = "NH", value = "1A or Other airline record locator information")

@Size(min=1,max=3) 
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public ReservationResponseDto controlNumber(String controlNumber) {
    this.controlNumber = controlNumber;
    return this;
  }

  /**
   * 1A record locator or - OA record locator
   * @return controlNumber
  */
  @ApiModelProperty(example = "5LZIIP", value = "1A record locator or - OA record locator")

@Size(min=1,max=19) 
  public String getControlNumber() {
    return controlNumber;
  }

  public void setControlNumber(String controlNumber) {
    this.controlNumber = controlNumber;
  }

  public ReservationResponseDto controlType(String controlType) {
    this.controlType = controlType;
    return this;
  }

  /**
   * 1A record locator or - OA record locator
   * @return controlType
  */
  @ApiModelProperty(value = "1A record locator or - OA record locator")

@Size(min=1,max=1) 
  public String getControlType() {
    return controlType;
  }

  public void setControlType(String controlType) {
    this.controlType = controlType;
  }

  public ReservationResponseDto time(String time) {
    this.time = time;
    return this;
  }

  /**
   * time
   * @return time
  */
  @ApiModelProperty(value = "time")

@Pattern(regexp="([0-1][0-9]|2[0-3])[0-5][0-9]") 
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public ReservationResponseDto date(String date) {
    this.date = date;
    return this;
  }

  /**
   * date
   * @return date
  */
  @ApiModelProperty(value = "date")

@Pattern(regexp="(0[1-9]|[1-2][0-9]|3[0-1])(0[1-9]|1[0-2])[0-9]{2}") 
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationResponseDto reservationResponseDto = (ReservationResponseDto) o;
    return Objects.equals(this.companyId, reservationResponseDto.companyId) &&
        Objects.equals(this.controlNumber, reservationResponseDto.controlNumber) &&
        Objects.equals(this.controlType, reservationResponseDto.controlType) &&
        Objects.equals(this.time, reservationResponseDto.time) &&
        Objects.equals(this.date, reservationResponseDto.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, controlNumber, controlType, time, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationResponseDto {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    controlNumber: ").append(toIndentedString(controlNumber)).append("\n");
    sb.append("    controlType: ").append(toIndentedString(controlType)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

