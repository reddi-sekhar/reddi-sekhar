package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.DateOfBirth1RequestDto;
import jp.co.ana.cas.b18.dto.response.TravellerInformation1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PassengerData1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class PassengerData1RequestDto   {
  @JsonProperty("dateOfBirth")
  private DateOfBirth1RequestDto dateOfBirth;

  @JsonProperty("travellerInformation")
  private TravellerInformation1RequestDto travellerInformation;

  public PassengerData1RequestDto dateOfBirth(DateOfBirth1RequestDto dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateOfBirth1RequestDto getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(DateOfBirth1RequestDto dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public PassengerData1RequestDto travellerInformation(TravellerInformation1RequestDto travellerInformation) {
    this.travellerInformation = travellerInformation;
    return this;
  }

  /**
   * Get travellerInformation
   * @return travellerInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerInformation1RequestDto getTravellerInformation() {
    return travellerInformation;
  }

  public void setTravellerInformation(TravellerInformation1RequestDto travellerInformation) {
    this.travellerInformation = travellerInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassengerData1RequestDto passengerData1RequestDto = (PassengerData1RequestDto) o;
    return Objects.equals(this.dateOfBirth, passengerData1RequestDto.dateOfBirth) &&
        Objects.equals(this.travellerInformation, passengerData1RequestDto.travellerInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, travellerInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassengerData1RequestDto {\n");
    
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    travellerInformation: ").append(toIndentedString(travellerInformation)).append("\n");
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

