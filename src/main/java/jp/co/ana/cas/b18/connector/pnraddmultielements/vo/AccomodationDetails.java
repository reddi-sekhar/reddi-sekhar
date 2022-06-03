package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DiningInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.HotelRoomType25429S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RangeDetailsTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType25422S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccomodationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AccomodationDetails   {
  @JsonProperty("occupancynInfo")
  private RangeDetailsTypeU occupancynInfo;

  @JsonProperty("passengerAssociation")
  @Valid
  private List<ReferenceInfoType25422S> passengerAssociation = null;

  @JsonProperty("roomInfo")
  private HotelRoomType25429S roomInfo;

  @JsonProperty("roomMealPlanInfo")
  private DiningInformationType roomMealPlanInfo;

  public AccomodationDetails occupancynInfo(RangeDetailsTypeU occupancynInfo) {
    this.occupancynInfo = occupancynInfo;
    return this;
  }

  /**
   * Get occupancynInfo
   * @return occupancynInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public RangeDetailsTypeU getOccupancynInfo() {
    return occupancynInfo;
  }

  public void setOccupancynInfo(RangeDetailsTypeU occupancynInfo) {
    this.occupancynInfo = occupancynInfo;
  }

  public AccomodationDetails passengerAssociation(List<ReferenceInfoType25422S> passengerAssociation) {
    this.passengerAssociation = passengerAssociation;
    return this;
  }

  public AccomodationDetails addPassengerAssociationItem(ReferenceInfoType25422S passengerAssociationItem) {
    if (this.passengerAssociation == null) {
      this.passengerAssociation = new ArrayList<>();
    }
    this.passengerAssociation.add(passengerAssociationItem);
    return this;
  }

  /**
   * Get passengerAssociation
   * @return passengerAssociation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReferenceInfoType25422S> getPassengerAssociation() {
    return passengerAssociation;
  }

  public void setPassengerAssociation(List<ReferenceInfoType25422S> passengerAssociation) {
    this.passengerAssociation = passengerAssociation;
  }

  public AccomodationDetails roomInfo(HotelRoomType25429S roomInfo) {
    this.roomInfo = roomInfo;
    return this;
  }

  /**
   * Get roomInfo
   * @return roomInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public HotelRoomType25429S getRoomInfo() {
    return roomInfo;
  }

  public void setRoomInfo(HotelRoomType25429S roomInfo) {
    this.roomInfo = roomInfo;
  }

  public AccomodationDetails roomMealPlanInfo(DiningInformationType roomMealPlanInfo) {
    this.roomMealPlanInfo = roomMealPlanInfo;
    return this;
  }

  /**
   * Get roomMealPlanInfo
   * @return roomMealPlanInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public DiningInformationType getRoomMealPlanInfo() {
    return roomMealPlanInfo;
  }

  public void setRoomMealPlanInfo(DiningInformationType roomMealPlanInfo) {
    this.roomMealPlanInfo = roomMealPlanInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccomodationDetails accomodationDetails = (AccomodationDetails) o;
    return Objects.equals(this.occupancynInfo, accomodationDetails.occupancynInfo) &&
        Objects.equals(this.passengerAssociation, accomodationDetails.passengerAssociation) &&
        Objects.equals(this.roomInfo, accomodationDetails.roomInfo) &&
        Objects.equals(this.roomMealPlanInfo, accomodationDetails.roomMealPlanInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occupancynInfo, passengerAssociation, roomInfo, roomMealPlanInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccomodationDetails {\n");
    
    sb.append("    occupancynInfo: ").append(toIndentedString(occupancynInfo)).append("\n");
    sb.append("    passengerAssociation: ").append(toIndentedString(passengerAssociation)).append("\n");
    sb.append("    roomInfo: ").append(toIndentedString(roomInfo)).append("\n");
    sb.append("    roomMealPlanInfo: ").append(toIndentedString(roomMealPlanInfo)).append("\n");
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

