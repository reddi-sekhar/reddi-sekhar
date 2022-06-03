package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DiningInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.EquipmentDetailsTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PlaceLocationIdentificationTypeU25436S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityType25433S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelProductInformationTypeI25434S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransportationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TransportationDetails   {
  @JsonProperty("arrivalInfo")
  private PlaceLocationIdentificationTypeU25436S arrivalInfo;

  @JsonProperty("departureInfo")
  private PlaceLocationIdentificationTypeU25436S departureInfo;

  @JsonProperty("equipmentInfo")
  private EquipmentDetailsTypeU equipmentInfo;

  @JsonProperty("transportationDuration")
  private QuantityType25433S transportationDuration;

  @JsonProperty("transportationInfo")
  private TravelProductInformationTypeI25434S transportationInfo;

  @JsonProperty("transportationMealPlanInfo")
  private DiningInformationType transportationMealPlanInfo;

  public TransportationDetails arrivalInfo(PlaceLocationIdentificationTypeU25436S arrivalInfo) {
    this.arrivalInfo = arrivalInfo;
    return this;
  }

  /**
   * Get arrivalInfo
   * @return arrivalInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlaceLocationIdentificationTypeU25436S getArrivalInfo() {
    return arrivalInfo;
  }

  public void setArrivalInfo(PlaceLocationIdentificationTypeU25436S arrivalInfo) {
    this.arrivalInfo = arrivalInfo;
  }

  public TransportationDetails departureInfo(PlaceLocationIdentificationTypeU25436S departureInfo) {
    this.departureInfo = departureInfo;
    return this;
  }

  /**
   * Get departureInfo
   * @return departureInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlaceLocationIdentificationTypeU25436S getDepartureInfo() {
    return departureInfo;
  }

  public void setDepartureInfo(PlaceLocationIdentificationTypeU25436S departureInfo) {
    this.departureInfo = departureInfo;
  }

  public TransportationDetails equipmentInfo(EquipmentDetailsTypeU equipmentInfo) {
    this.equipmentInfo = equipmentInfo;
    return this;
  }

  /**
   * Get equipmentInfo
   * @return equipmentInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public EquipmentDetailsTypeU getEquipmentInfo() {
    return equipmentInfo;
  }

  public void setEquipmentInfo(EquipmentDetailsTypeU equipmentInfo) {
    this.equipmentInfo = equipmentInfo;
  }

  public TransportationDetails transportationDuration(QuantityType25433S transportationDuration) {
    this.transportationDuration = transportationDuration;
    return this;
  }

  /**
   * Get transportationDuration
   * @return transportationDuration
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityType25433S getTransportationDuration() {
    return transportationDuration;
  }

  public void setTransportationDuration(QuantityType25433S transportationDuration) {
    this.transportationDuration = transportationDuration;
  }

  public TransportationDetails transportationInfo(TravelProductInformationTypeI25434S transportationInfo) {
    this.transportationInfo = transportationInfo;
    return this;
  }

  /**
   * Get transportationInfo
   * @return transportationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelProductInformationTypeI25434S getTransportationInfo() {
    return transportationInfo;
  }

  public void setTransportationInfo(TravelProductInformationTypeI25434S transportationInfo) {
    this.transportationInfo = transportationInfo;
  }

  public TransportationDetails transportationMealPlanInfo(DiningInformationType transportationMealPlanInfo) {
    this.transportationMealPlanInfo = transportationMealPlanInfo;
    return this;
  }

  /**
   * Get transportationMealPlanInfo
   * @return transportationMealPlanInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public DiningInformationType getTransportationMealPlanInfo() {
    return transportationMealPlanInfo;
  }

  public void setTransportationMealPlanInfo(DiningInformationType transportationMealPlanInfo) {
    this.transportationMealPlanInfo = transportationMealPlanInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportationDetails transportationDetails = (TransportationDetails) o;
    return Objects.equals(this.arrivalInfo, transportationDetails.arrivalInfo) &&
        Objects.equals(this.departureInfo, transportationDetails.departureInfo) &&
        Objects.equals(this.equipmentInfo, transportationDetails.equipmentInfo) &&
        Objects.equals(this.transportationDuration, transportationDetails.transportationDuration) &&
        Objects.equals(this.transportationInfo, transportationDetails.transportationInfo) &&
        Objects.equals(this.transportationMealPlanInfo, transportationDetails.transportationMealPlanInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalInfo, departureInfo, equipmentInfo, transportationDuration, transportationInfo, transportationMealPlanInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportationDetails {\n");
    
    sb.append("    arrivalInfo: ").append(toIndentedString(arrivalInfo)).append("\n");
    sb.append("    departureInfo: ").append(toIndentedString(departureInfo)).append("\n");
    sb.append("    equipmentInfo: ").append(toIndentedString(equipmentInfo)).append("\n");
    sb.append("    transportationDuration: ").append(toIndentedString(transportationDuration)).append("\n");
    sb.append("    transportationInfo: ").append(toIndentedString(transportationInfo)).append("\n");
    sb.append("    transportationMealPlanInfo: ").append(toIndentedString(transportationMealPlanInfo)).append("\n");
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

