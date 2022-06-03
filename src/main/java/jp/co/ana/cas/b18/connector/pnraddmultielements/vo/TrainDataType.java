package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PlaceLocationIdentificationTypeU32347S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RailLegDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType32362S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TrainProductInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TrainDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TrainDataType   {
  @JsonProperty("arrLocation")
  private PlaceLocationIdentificationTypeU32347S arrLocation;

  @JsonProperty("depLocation")
  private PlaceLocationIdentificationTypeU32347S depLocation;

  @JsonProperty("railLeg")
  @Valid
  private List<RailLegDataType> railLeg = null;

  @JsonProperty("trainProductInfo")
  private TrainProductInformationType trainProductInfo;

  @JsonProperty("tripDateTime")
  @Valid
  private List<StructuredDateTimeInformationType32362S> tripDateTime = null;

  public TrainDataType arrLocation(PlaceLocationIdentificationTypeU32347S arrLocation) {
    this.arrLocation = arrLocation;
    return this;
  }

  /**
   * Get arrLocation
   * @return arrLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlaceLocationIdentificationTypeU32347S getArrLocation() {
    return arrLocation;
  }

  public void setArrLocation(PlaceLocationIdentificationTypeU32347S arrLocation) {
    this.arrLocation = arrLocation;
  }

  public TrainDataType depLocation(PlaceLocationIdentificationTypeU32347S depLocation) {
    this.depLocation = depLocation;
    return this;
  }

  /**
   * Get depLocation
   * @return depLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlaceLocationIdentificationTypeU32347S getDepLocation() {
    return depLocation;
  }

  public void setDepLocation(PlaceLocationIdentificationTypeU32347S depLocation) {
    this.depLocation = depLocation;
  }

  public TrainDataType railLeg(List<RailLegDataType> railLeg) {
    this.railLeg = railLeg;
    return this;
  }

  public TrainDataType addRailLegItem(RailLegDataType railLegItem) {
    if (this.railLeg == null) {
      this.railLeg = new ArrayList<>();
    }
    this.railLeg.add(railLegItem);
    return this;
  }

  /**
   * Get railLeg
   * @return railLeg
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RailLegDataType> getRailLeg() {
    return railLeg;
  }

  public void setRailLeg(List<RailLegDataType> railLeg) {
    this.railLeg = railLeg;
  }

  public TrainDataType trainProductInfo(TrainProductInformationType trainProductInfo) {
    this.trainProductInfo = trainProductInfo;
    return this;
  }

  /**
   * Get trainProductInfo
   * @return trainProductInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TrainProductInformationType getTrainProductInfo() {
    return trainProductInfo;
  }

  public void setTrainProductInfo(TrainProductInformationType trainProductInfo) {
    this.trainProductInfo = trainProductInfo;
  }

  public TrainDataType tripDateTime(List<StructuredDateTimeInformationType32362S> tripDateTime) {
    this.tripDateTime = tripDateTime;
    return this;
  }

  public TrainDataType addTripDateTimeItem(StructuredDateTimeInformationType32362S tripDateTimeItem) {
    if (this.tripDateTime == null) {
      this.tripDateTime = new ArrayList<>();
    }
    this.tripDateTime.add(tripDateTimeItem);
    return this;
  }

  /**
   * Get tripDateTime
   * @return tripDateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StructuredDateTimeInformationType32362S> getTripDateTime() {
    return tripDateTime;
  }

  public void setTripDateTime(List<StructuredDateTimeInformationType32362S> tripDateTime) {
    this.tripDateTime = tripDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainDataType trainDataType = (TrainDataType) o;
    return Objects.equals(this.arrLocation, trainDataType.arrLocation) &&
        Objects.equals(this.depLocation, trainDataType.depLocation) &&
        Objects.equals(this.railLeg, trainDataType.railLeg) &&
        Objects.equals(this.trainProductInfo, trainDataType.trainProductInfo) &&
        Objects.equals(this.tripDateTime, trainDataType.tripDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrLocation, depLocation, railLeg, trainProductInfo, tripDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainDataType {\n");
    
    sb.append("    arrLocation: ").append(toIndentedString(arrLocation)).append("\n");
    sb.append("    depLocation: ").append(toIndentedString(depLocation)).append("\n");
    sb.append("    railLeg: ").append(toIndentedString(railLeg)).append("\n");
    sb.append("    trainProductInfo: ").append(toIndentedString(trainProductInfo)).append("\n");
    sb.append("    tripDateTime: ").append(toIndentedString(tripDateTime)).append("\n");
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

