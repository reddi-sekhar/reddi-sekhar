package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ElementManagementSegmentType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.EnhancedPassengerData1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PassengerData1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerInfo1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerInfo1   {
  @JsonProperty("elementManagementPassenger")
  private ElementManagementSegmentType1 elementManagementPassenger;

  @JsonProperty("enhancedPassengerData")
  @Valid
  private List<EnhancedPassengerData1> enhancedPassengerData = null;

  @JsonProperty("passengerData")
  @Valid
  private List<PassengerData1> passengerData = null;

  public TravellerInfo1 elementManagementPassenger(ElementManagementSegmentType1 elementManagementPassenger) {
    this.elementManagementPassenger = elementManagementPassenger;
    return this;
  }

  /**
   * Get elementManagementPassenger
   * @return elementManagementPassenger
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementSegmentType1 getElementManagementPassenger() {
    return elementManagementPassenger;
  }

  public void setElementManagementPassenger(ElementManagementSegmentType1 elementManagementPassenger) {
    this.elementManagementPassenger = elementManagementPassenger;
  }

  public TravellerInfo1 enhancedPassengerData(List<EnhancedPassengerData1> enhancedPassengerData) {
    this.enhancedPassengerData = enhancedPassengerData;
    return this;
  }

  public TravellerInfo1 addEnhancedPassengerDataItem(EnhancedPassengerData1 enhancedPassengerDataItem) {
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

  public List<EnhancedPassengerData1> getEnhancedPassengerData() {
    return enhancedPassengerData;
  }

  public void setEnhancedPassengerData(List<EnhancedPassengerData1> enhancedPassengerData) {
    this.enhancedPassengerData = enhancedPassengerData;
  }

  public TravellerInfo1 passengerData(List<PassengerData1> passengerData) {
    this.passengerData = passengerData;
    return this;
  }

  public TravellerInfo1 addPassengerDataItem(PassengerData1 passengerDataItem) {
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

  public List<PassengerData1> getPassengerData() {
    return passengerData;
  }

  public void setPassengerData(List<PassengerData1> passengerData) {
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
    TravellerInfo1 travellerInfo1 = (TravellerInfo1) o;
    return Objects.equals(this.elementManagementPassenger, travellerInfo1.elementManagementPassenger) &&
        Objects.equals(this.enhancedPassengerData, travellerInfo1.enhancedPassengerData) &&
        Objects.equals(this.passengerData, travellerInfo1.passengerData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementManagementPassenger, enhancedPassengerData, passengerData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerInfo1 {\n");
    
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

