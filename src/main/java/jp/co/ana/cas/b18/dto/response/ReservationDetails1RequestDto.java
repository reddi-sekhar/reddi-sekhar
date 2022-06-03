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
 * ReservationDetails1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ReservationDetails1RequestDto   {
  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("controlNumber")
  private String controlNumber;

  public ReservationDetails1RequestDto companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Company ID
   * @return companyId
  */
  @ApiModelProperty(value = "Company ID")

@Size(min=1,max=3) 
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public ReservationDetails1RequestDto controlNumber(String controlNumber) {
    this.controlNumber = controlNumber;
    return this;
  }

  /**
   * Control Number
   * @return controlNumber
  */
  @ApiModelProperty(value = "Control Number")

@Size(min=1,max=19) 
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
    ReservationDetails1RequestDto reservationDetails1RequestDto = (ReservationDetails1RequestDto) o;
    return Objects.equals(this.companyId, reservationDetails1RequestDto.companyId) &&
        Objects.equals(this.controlNumber, reservationDetails1RequestDto.controlNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, controlNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationDetails1RequestDto {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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

