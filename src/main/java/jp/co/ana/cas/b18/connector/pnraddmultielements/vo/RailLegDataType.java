package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemNumberTypeU33258S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PlaceLocationIdentificationTypeU32347S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityAndActionTypeU32609S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType32362S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TrainProductInformationType32331S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RailLegDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RailLegDataType   {
  @JsonProperty("arrLocation")
  private PlaceLocationIdentificationTypeU32347S arrLocation;

  @JsonProperty("depLocation")
  private PlaceLocationIdentificationTypeU32347S depLocation;

  @JsonProperty("legDateTime")
  @Valid
  private List<StructuredDateTimeInformationType32362S> legDateTime = null;

  @JsonProperty("legReference")
  private ItemNumberTypeU33258S legReference;

  @JsonProperty("reservableStatus")
  private QuantityAndActionTypeU32609S reservableStatus;

  @JsonProperty("trainProductInfo")
  private TrainProductInformationType32331S trainProductInfo;

  public RailLegDataType arrLocation(PlaceLocationIdentificationTypeU32347S arrLocation) {
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

  public RailLegDataType depLocation(PlaceLocationIdentificationTypeU32347S depLocation) {
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

  public RailLegDataType legDateTime(List<StructuredDateTimeInformationType32362S> legDateTime) {
    this.legDateTime = legDateTime;
    return this;
  }

  public RailLegDataType addLegDateTimeItem(StructuredDateTimeInformationType32362S legDateTimeItem) {
    if (this.legDateTime == null) {
      this.legDateTime = new ArrayList<>();
    }
    this.legDateTime.add(legDateTimeItem);
    return this;
  }

  /**
   * Get legDateTime
   * @return legDateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StructuredDateTimeInformationType32362S> getLegDateTime() {
    return legDateTime;
  }

  public void setLegDateTime(List<StructuredDateTimeInformationType32362S> legDateTime) {
    this.legDateTime = legDateTime;
  }

  public RailLegDataType legReference(ItemNumberTypeU33258S legReference) {
    this.legReference = legReference;
    return this;
  }

  /**
   * Get legReference
   * @return legReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemNumberTypeU33258S getLegReference() {
    return legReference;
  }

  public void setLegReference(ItemNumberTypeU33258S legReference) {
    this.legReference = legReference;
  }

  public RailLegDataType reservableStatus(QuantityAndActionTypeU32609S reservableStatus) {
    this.reservableStatus = reservableStatus;
    return this;
  }

  /**
   * Get reservableStatus
   * @return reservableStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityAndActionTypeU32609S getReservableStatus() {
    return reservableStatus;
  }

  public void setReservableStatus(QuantityAndActionTypeU32609S reservableStatus) {
    this.reservableStatus = reservableStatus;
  }

  public RailLegDataType trainProductInfo(TrainProductInformationType32331S trainProductInfo) {
    this.trainProductInfo = trainProductInfo;
    return this;
  }

  /**
   * Get trainProductInfo
   * @return trainProductInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TrainProductInformationType32331S getTrainProductInfo() {
    return trainProductInfo;
  }

  public void setTrainProductInfo(TrainProductInformationType32331S trainProductInfo) {
    this.trainProductInfo = trainProductInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RailLegDataType railLegDataType = (RailLegDataType) o;
    return Objects.equals(this.arrLocation, railLegDataType.arrLocation) &&
        Objects.equals(this.depLocation, railLegDataType.depLocation) &&
        Objects.equals(this.legDateTime, railLegDataType.legDateTime) &&
        Objects.equals(this.legReference, railLegDataType.legReference) &&
        Objects.equals(this.reservableStatus, railLegDataType.reservableStatus) &&
        Objects.equals(this.trainProductInfo, railLegDataType.trainProductInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrLocation, depLocation, legDateTime, legReference, reservableStatus, trainProductInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RailLegDataType {\n");
    
    sb.append("    arrLocation: ").append(toIndentedString(arrLocation)).append("\n");
    sb.append("    depLocation: ").append(toIndentedString(depLocation)).append("\n");
    sb.append("    legDateTime: ").append(toIndentedString(legDateTime)).append("\n");
    sb.append("    legReference: ").append(toIndentedString(legReference)).append("\n");
    sb.append("    reservableStatus: ").append(toIndentedString(reservableStatus)).append("\n");
    sb.append("    trainProductInfo: ").append(toIndentedString(trainProductInfo)).append("\n");
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

