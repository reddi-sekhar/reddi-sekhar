package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.DateOfBirthResponseDto;
import jp.co.ana.cas.b18.dto.response.TravellerInformationResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PassengerDataResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class PassengerDataResponseDto   {
  @JsonProperty("travellerInformation")
  private TravellerInformationResponseDto travellerInformation;

  @JsonProperty("dateOfBirth")
  private DateOfBirthResponseDto dateOfBirth;

  public PassengerDataResponseDto travellerInformation(TravellerInformationResponseDto travellerInformation) {
    this.travellerInformation = travellerInformation;
    return this;
  }

  /**
   * Get travellerInformation
   * @return travellerInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerInformationResponseDto getTravellerInformation() {
    return travellerInformation;
  }

  public void setTravellerInformation(TravellerInformationResponseDto travellerInformation) {
    this.travellerInformation = travellerInformation;
  }

  public PassengerDataResponseDto dateOfBirth(DateOfBirthResponseDto dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateOfBirthResponseDto getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(DateOfBirthResponseDto dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassengerDataResponseDto passengerDataResponseDto = (PassengerDataResponseDto) o;
    return Objects.equals(this.travellerInformation, passengerDataResponseDto.travellerInformation) &&
        Objects.equals(this.dateOfBirth, passengerDataResponseDto.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(travellerInformation, dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassengerDataResponseDto {\n");
    
    sb.append("    travellerInformation: ").append(toIndentedString(travellerInformation)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

