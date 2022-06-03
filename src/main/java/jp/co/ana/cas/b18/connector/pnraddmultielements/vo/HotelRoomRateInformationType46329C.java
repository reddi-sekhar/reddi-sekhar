package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotelRoomRateInformationType46329C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class HotelRoomRateInformationType46329C   {
  @JsonProperty("roomType")
  private String roomType;

  public HotelRoomRateInformationType46329C roomType(String roomType) {
    this.roomType = roomType;
    return this;
  }

  /**
   * Get roomType
   * @return roomType
  */
  @ApiModelProperty(value = "")


  public String getRoomType() {
    return roomType;
  }

  public void setRoomType(String roomType) {
    this.roomType = roomType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelRoomRateInformationType46329C hotelRoomRateInformationType46329C = (HotelRoomRateInformationType46329C) o;
    return Objects.equals(this.roomType, hotelRoomRateInformationType46329C.roomType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRoomRateInformationType46329C {\n");
    
    sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
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

