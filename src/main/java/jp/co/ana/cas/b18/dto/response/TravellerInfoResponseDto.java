package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.ElementManagementPassengerResponseDto;
import jp.co.ana.cas.b18.dto.response.NameErrorResponseDto;
import jp.co.ana.cas.b18.dto.response.PassengerDataResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerInfoResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TravellerInfoResponseDto   {
  @JsonProperty("elementManagementPassenger")
  private ElementManagementPassengerResponseDto elementManagementPassenger;

  @JsonProperty("passengerData")
  @Valid
  private List<PassengerDataResponseDto> passengerData = null;

  @JsonProperty("nameError")
  private NameErrorResponseDto nameError;

  public TravellerInfoResponseDto elementManagementPassenger(ElementManagementPassengerResponseDto elementManagementPassenger) {
    this.elementManagementPassenger = elementManagementPassenger;
    return this;
  }

  /**
   * Get elementManagementPassenger
   * @return elementManagementPassenger
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementPassengerResponseDto getElementManagementPassenger() {
    return elementManagementPassenger;
  }

  public void setElementManagementPassenger(ElementManagementPassengerResponseDto elementManagementPassenger) {
    this.elementManagementPassenger = elementManagementPassenger;
  }

  public TravellerInfoResponseDto passengerData(List<PassengerDataResponseDto> passengerData) {
    this.passengerData = passengerData;
    return this;
  }

  public TravellerInfoResponseDto addPassengerDataItem(PassengerDataResponseDto passengerDataItem) {
    if (this.passengerData == null) {
      this.passengerData = new ArrayList<>();
    }
    this.passengerData.add(passengerDataItem);
    return this;
  }

  /**
   * Get passengerData
   * @return passengerData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PassengerDataResponseDto> getPassengerData() {
    return passengerData;
  }

  public void setPassengerData(List<PassengerDataResponseDto> passengerData) {
    this.passengerData = passengerData;
  }

  public TravellerInfoResponseDto nameError(NameErrorResponseDto nameError) {
    this.nameError = nameError;
    return this;
  }

  /**
   * Get nameError
   * @return nameError
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameErrorResponseDto getNameError() {
    return nameError;
  }

  public void setNameError(NameErrorResponseDto nameError) {
    this.nameError = nameError;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravellerInfoResponseDto travellerInfoResponseDto = (TravellerInfoResponseDto) o;
    return Objects.equals(this.elementManagementPassenger, travellerInfoResponseDto.elementManagementPassenger) &&
        Objects.equals(this.passengerData, travellerInfoResponseDto.passengerData) &&
        Objects.equals(this.nameError, travellerInfoResponseDto.nameError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementManagementPassenger, passengerData, nameError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerInfoResponseDto {\n");
    
    sb.append("    elementManagementPassenger: ").append(toIndentedString(elementManagementPassenger)).append("\n");
    sb.append("    passengerData: ").append(toIndentedString(passengerData)).append("\n");
    sb.append("    nameError: ").append(toIndentedString(nameError)).append("\n");
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

