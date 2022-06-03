package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DataElementsMaster1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OptionalPNRActionsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OriginDestinationDetails1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerInfo1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PNRAddMultiElements
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PNRAddMultiElements   {
  @JsonProperty("dataElementsMaster")
  private DataElementsMaster1 dataElementsMaster;

  @JsonProperty("originDestinationDetails")
  @Valid
  private List<OriginDestinationDetails1> originDestinationDetails = null;

  @JsonProperty("pnrActions")
  private OptionalPNRActionsType pnrActions;

  @JsonProperty("reservationInfo")
  private ReservationControlInformationTypeI1 reservationInfo;

  @JsonProperty("travellerInfo")
  @Valid
  private List<TravellerInfo1> travellerInfo = null;

  public PNRAddMultiElements dataElementsMaster(DataElementsMaster1 dataElementsMaster) {
    this.dataElementsMaster = dataElementsMaster;
    return this;
  }

  /**
   * Get dataElementsMaster
   * @return dataElementsMaster
  */
  @ApiModelProperty(value = "")

  @Valid

  public DataElementsMaster1 getDataElementsMaster() {
    return dataElementsMaster;
  }

  public void setDataElementsMaster(DataElementsMaster1 dataElementsMaster) {
    this.dataElementsMaster = dataElementsMaster;
  }

  public PNRAddMultiElements originDestinationDetails(List<OriginDestinationDetails1> originDestinationDetails) {
    this.originDestinationDetails = originDestinationDetails;
    return this;
  }

  public PNRAddMultiElements addOriginDestinationDetailsItem(OriginDestinationDetails1 originDestinationDetailsItem) {
    if (this.originDestinationDetails == null) {
      this.originDestinationDetails = new ArrayList<>();
    }
    this.originDestinationDetails.add(originDestinationDetailsItem);
    return this;
  }

  /**
   * Get originDestinationDetails
   * @return originDestinationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OriginDestinationDetails1> getOriginDestinationDetails() {
    return originDestinationDetails;
  }

  public void setOriginDestinationDetails(List<OriginDestinationDetails1> originDestinationDetails) {
    this.originDestinationDetails = originDestinationDetails;
  }

  public PNRAddMultiElements pnrActions(OptionalPNRActionsType pnrActions) {
    this.pnrActions = pnrActions;
    return this;
  }

  /**
   * Get pnrActions
   * @return pnrActions
  */
  @ApiModelProperty(value = "")

  @Valid

  public OptionalPNRActionsType getPnrActions() {
    return pnrActions;
  }

  public void setPnrActions(OptionalPNRActionsType pnrActions) {
    this.pnrActions = pnrActions;
  }

  public PNRAddMultiElements reservationInfo(ReservationControlInformationTypeI1 reservationInfo) {
    this.reservationInfo = reservationInfo;
    return this;
  }

  /**
   * Get reservationInfo
   * @return reservationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationControlInformationTypeI1 getReservationInfo() {
    return reservationInfo;
  }

  public void setReservationInfo(ReservationControlInformationTypeI1 reservationInfo) {
    this.reservationInfo = reservationInfo;
  }

  public PNRAddMultiElements travellerInfo(List<TravellerInfo1> travellerInfo) {
    this.travellerInfo = travellerInfo;
    return this;
  }

  public PNRAddMultiElements addTravellerInfoItem(TravellerInfo1 travellerInfoItem) {
    if (this.travellerInfo == null) {
      this.travellerInfo = new ArrayList<>();
    }
    this.travellerInfo.add(travellerInfoItem);
    return this;
  }

  /**
   * Get travellerInfo
   * @return travellerInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TravellerInfo1> getTravellerInfo() {
    return travellerInfo;
  }

  public void setTravellerInfo(List<TravellerInfo1> travellerInfo) {
    this.travellerInfo = travellerInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PNRAddMultiElements pnRAddMultiElements = (PNRAddMultiElements) o;
    return Objects.equals(this.dataElementsMaster, pnRAddMultiElements.dataElementsMaster) &&
        Objects.equals(this.originDestinationDetails, pnRAddMultiElements.originDestinationDetails) &&
        Objects.equals(this.pnrActions, pnRAddMultiElements.pnrActions) &&
        Objects.equals(this.reservationInfo, pnRAddMultiElements.reservationInfo) &&
        Objects.equals(this.travellerInfo, pnRAddMultiElements.travellerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataElementsMaster, originDestinationDetails, pnrActions, reservationInfo, travellerInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PNRAddMultiElements {\n");
    
    sb.append("    dataElementsMaster: ").append(toIndentedString(dataElementsMaster)).append("\n");
    sb.append("    originDestinationDetails: ").append(toIndentedString(originDestinationDetails)).append("\n");
    sb.append("    pnrActions: ").append(toIndentedString(pnrActions)).append("\n");
    sb.append("    reservationInfo: ").append(toIndentedString(reservationInfo)).append("\n");
    sb.append("    travellerInfo: ").append(toIndentedString(travellerInfo)).append("\n");
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

