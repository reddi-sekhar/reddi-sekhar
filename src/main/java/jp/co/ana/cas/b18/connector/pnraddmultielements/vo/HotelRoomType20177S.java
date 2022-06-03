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
 * HotelRoomType20177S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class HotelRoomType20177S   {
  @JsonProperty("roomTypeOverride")
  private String roomTypeOverride;

  public HotelRoomType20177S roomTypeOverride(String roomTypeOverride) {
    this.roomTypeOverride = roomTypeOverride;
    return this;
  }

  /**
   * Get roomTypeOverride
   * @return roomTypeOverride
  */
  @ApiModelProperty(value = "")


  public String getRoomTypeOverride() {
    return roomTypeOverride;
  }

  public void setRoomTypeOverride(String roomTypeOverride) {
    this.roomTypeOverride = roomTypeOverride;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelRoomType20177S hotelRoomType20177S = (HotelRoomType20177S) o;
    return Objects.equals(this.roomTypeOverride, hotelRoomType20177S.roomTypeOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomTypeOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRoomType20177S {\n");
    
    sb.append("    roomTypeOverride: ").append(toIndentedString(roomTypeOverride)).append("\n");
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

