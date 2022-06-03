package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ElementManagementSegmentType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.EnhancedPassengerData;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ErrorGroupType223552G;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PassengerData;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerInfo   {
  @JsonProperty("elementManagementPassenger")
  private ElementManagementSegmentType elementManagementPassenger;

  @JsonProperty("enhancedPassengerData")
  @Valid
  private List<EnhancedPassengerData> enhancedPassengerData = null;

  @JsonProperty("nameError")
  private ErrorGroupType223552G nameError;

  @JsonProperty("passengerData")
  @Valid
  private List<PassengerData> passengerData = null;

  public TravellerInfo elementManagementPassenger(ElementManagementSegmentType elementManagementPassenger) {
    this.elementManagementPassenger = elementManagementPassenger;
    return this;
  }

  /**
   * Get elementManagementPassenger
   * @return elementManagementPassenger
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementSegmentType getElementManagementPassenger() {
    return elementManagementPassenger;
  }

  public void setElementManagementPassenger(ElementManagementSegmentType elementManagementPassenger) {
    this.elementManagementPassenger = elementManagementPassenger;
  }

  public TravellerInfo enhancedPassengerData(List<EnhancedPassengerData> enhancedPassengerData) {
    this.enhancedPassengerData = enhancedPassengerData;
    return this;
  }

  public TravellerInfo addEnhancedPassengerDataItem(EnhancedPassengerData enhancedPassengerDataItem) {
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

  public List<EnhancedPassengerData> getEnhancedPassengerData() {
    return enhancedPassengerData;
  }

  public void setEnhancedPassengerData(List<EnhancedPassengerData> enhancedPassengerData) {
    this.enhancedPassengerData = enhancedPassengerData;
  }

  public TravellerInfo nameError(ErrorGroupType223552G nameError) {
    this.nameError = nameError;
    return this;
  }

  /**
   * Get nameError
   * @return nameError
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorGroupType223552G getNameError() {
    return nameError;
  }

  public void setNameError(ErrorGroupType223552G nameError) {
    this.nameError = nameError;
  }

  public TravellerInfo passengerData(List<PassengerData> passengerData) {
    this.passengerData = passengerData;
    return this;
  }

  public TravellerInfo addPassengerDataItem(PassengerData passengerDataItem) {
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

  public List<PassengerData> getPassengerData() {
    return passengerData;
  }

  public void setPassengerData(List<PassengerData> passengerData) {
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
    TravellerInfo travellerInfo = (TravellerInfo) o;
    return Objects.equals(this.elementManagementPassenger, travellerInfo.elementManagementPassenger) &&
        Objects.equals(this.enhancedPassengerData, travellerInfo.enhancedPassengerData) &&
        Objects.equals(this.nameError, travellerInfo.nameError) &&
        Objects.equals(this.passengerData, travellerInfo.passengerData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementManagementPassenger, enhancedPassengerData, nameError, passengerData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerInfo {\n");
    
    sb.append("    elementManagementPassenger: ").append(toIndentedString(elementManagementPassenger)).append("\n");
    sb.append("    enhancedPassengerData: ").append(toIndentedString(enhancedPassengerData)).append("\n");
    sb.append("    nameError: ").append(toIndentedString(nameError)).append("\n");
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

