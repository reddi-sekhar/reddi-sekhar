package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.HotelRoomType20177S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoomInfoGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RoomInfoGroup   {
  @JsonProperty("numberOfRooms")
  private NumberOfUnitsType numberOfRooms;

  @JsonProperty("roomDetailsInformation")
  private HotelRoomType20177S roomDetailsInformation;

  public RoomInfoGroup numberOfRooms(NumberOfUnitsType numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
    return this;
  }

  /**
   * Get numberOfRooms
   * @return numberOfRooms
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitsType getNumberOfRooms() {
    return numberOfRooms;
  }

  public void setNumberOfRooms(NumberOfUnitsType numberOfRooms) {
    this.numberOfRooms = numberOfRooms;
  }

  public RoomInfoGroup roomDetailsInformation(HotelRoomType20177S roomDetailsInformation) {
    this.roomDetailsInformation = roomDetailsInformation;
    return this;
  }

  /**
   * Get roomDetailsInformation
   * @return roomDetailsInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public HotelRoomType20177S getRoomDetailsInformation() {
    return roomDetailsInformation;
  }

  public void setRoomDetailsInformation(HotelRoomType20177S roomDetailsInformation) {
    this.roomDetailsInformation = roomDetailsInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomInfoGroup roomInfoGroup = (RoomInfoGroup) o;
    return Objects.equals(this.numberOfRooms, roomInfoGroup.numberOfRooms) &&
        Objects.equals(this.roomDetailsInformation, roomInfoGroup.roomDetailsInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfRooms, roomDetailsInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomInfoGroup {\n");
    
    sb.append("    numberOfRooms: ").append(toIndentedString(numberOfRooms)).append("\n");
    sb.append("    roomDetailsInformation: ").append(toIndentedString(roomDetailsInformation)).append("\n");
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

