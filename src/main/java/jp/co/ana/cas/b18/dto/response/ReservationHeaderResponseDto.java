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
 * ReservationHeaderResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ReservationHeaderResponseDto   {
  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("controlNumber")
  private String controlNumber;

  @JsonProperty("controlType")
  private String controlType;

  public ReservationHeaderResponseDto companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * airline record locator information
   * @return companyId
  */
  @ApiModelProperty(example = "1A", value = "airline record locator information")

@Size(min=1,max=35) 
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public ReservationHeaderResponseDto controlNumber(String controlNumber) {
    this.controlNumber = controlNumber;
    return this;
  }

  /**
   * Record Locator control number
   * @return controlNumber
  */
  @ApiModelProperty(example = "5LZIIP", value = "Record Locator control number")

@Size(min=1,max=20) 
  public String getControlNumber() {
    return controlNumber;
  }

  public void setControlNumber(String controlNumber) {
    this.controlNumber = controlNumber;
  }

  public ReservationHeaderResponseDto controlType(String controlType) {
    this.controlType = controlType;
    return this;
  }

  /**
   * Profile record locator information
   * @return controlType
  */
  @ApiModelProperty(value = "Profile record locator information")

@Pattern(regexp="([0-9A-Z])") 
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
    ReservationHeaderResponseDto reservationHeaderResponseDto = (ReservationHeaderResponseDto) o;
    return Objects.equals(this.companyId, reservationHeaderResponseDto.companyId) &&
        Objects.equals(this.controlNumber, reservationHeaderResponseDto.controlNumber) &&
        Objects.equals(this.controlType, reservationHeaderResponseDto.controlType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, controlNumber, controlType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationHeaderResponseDto {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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

