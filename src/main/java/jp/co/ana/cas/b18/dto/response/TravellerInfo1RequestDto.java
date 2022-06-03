package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.ElementManagementPassenger1RequestDto;
import jp.co.ana.cas.b18.dto.response.EnhancedPassengerData1RequestDto;
import jp.co.ana.cas.b18.dto.response.PassengerData1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerInfo1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TravellerInfo1RequestDto   {
  @JsonProperty("elementManagementPassenger")
  private ElementManagementPassenger1RequestDto elementManagementPassenger;

  @JsonProperty("enhancedPassengerData")
  @Valid
  private List<EnhancedPassengerData1RequestDto> enhancedPassengerData = null;

  @JsonProperty("passengerData")
  @Valid
  private List<PassengerData1RequestDto> passengerData = null;

  public TravellerInfo1RequestDto elementManagementPassenger(ElementManagementPassenger1RequestDto elementManagementPassenger) {
    this.elementManagementPassenger = elementManagementPassenger;
    return this;
  }

  /**
   * Get elementManagementPassenger
   * @return elementManagementPassenger
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementPassenger1RequestDto getElementManagementPassenger() {
    return elementManagementPassenger;
  }

  public void setElementManagementPassenger(ElementManagementPassenger1RequestDto elementManagementPassenger) {
    this.elementManagementPassenger = elementManagementPassenger;
  }

  public TravellerInfo1RequestDto enhancedPassengerData(List<EnhancedPassengerData1RequestDto> enhancedPassengerData) {
    this.enhancedPassengerData = enhancedPassengerData;
    return this;
  }

  public TravellerInfo1RequestDto addEnhancedPassengerDataItem(EnhancedPassengerData1RequestDto enhancedPassengerDataItem) {
    if (this.enhancedPassengerData == null) {
      this.enhancedPassengerData = new ArrayList<>();
    }
    this.enhancedPassengerData.add(enhancedPassengerDataItem);
    return this;
  }

  /**
   * Get enhancedPassengerData
   * @return enhancedPassengerData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<EnhancedPassengerData1RequestDto> getEnhancedPassengerData() {
    return enhancedPassengerData;
  }

  public void setEnhancedPassengerData(List<EnhancedPassengerData1RequestDto> enhancedPassengerData) {
    this.enhancedPassengerData = enhancedPassengerData;
  }

  public TravellerInfo1RequestDto passengerData(List<PassengerData1RequestDto> passengerData) {
    this.passengerData = passengerData;
    return this;
  }

  public TravellerInfo1RequestDto addPassengerDataItem(PassengerData1RequestDto passengerDataItem) {
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

  public List<PassengerData1RequestDto> getPassengerData() {
    return passengerData;
  }

  public void setPassengerData(List<PassengerData1RequestDto> passengerData) {
    this.passengerData = passengerData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravellerInfo1RequestDto travellerInfo1RequestDto = (TravellerInfo1RequestDto) o;
    return Objects.equals(this.elementManagementPassenger, travellerInfo1RequestDto.elementManagementPassenger) &&
        Objects.equals(this.enhancedPassengerData, travellerInfo1RequestDto.enhancedPassengerData) &&
        Objects.equals(this.passengerData, travellerInfo1RequestDto.passengerData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementManagementPassenger, enhancedPassengerData, passengerData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerInfo1RequestDto {\n");
    
    sb.append("    elementManagementPassenger: ").append(toIndentedString(elementManagementPassenger)).append("\n");
    sb.append("    enhancedPassengerData: ").append(toIndentedString(enhancedPassengerData)).append("\n");
    sb.append("    passengerData: ").append(toIndentedString(passengerData)).append("\n");
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

