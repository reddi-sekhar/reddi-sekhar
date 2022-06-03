package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.HotelRoomRateInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitDetailsTypeI18670C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotelRoomType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class HotelRoomType   {
  @JsonProperty("bookingCode")
  private String bookingCode;

  @JsonProperty("guestCountDetails")
  private NumberOfUnitDetailsTypeI18670C guestCountDetails;

  @JsonProperty("roomRateIdentifier")
  private HotelRoomRateInformationType roomRateIdentifier;

  @JsonProperty("roomTypeOverride")
  private String roomTypeOverride;

  public HotelRoomType bookingCode(String bookingCode) {
    this.bookingCode = bookingCode;
    return this;
  }

  /**
   * Get bookingCode
   * @return bookingCode
  */
  @ApiModelProperty(value = "")


  public String getBookingCode() {
    return bookingCode;
  }

  public void setBookingCode(String bookingCode) {
    this.bookingCode = bookingCode;
  }

  public HotelRoomType guestCountDetails(NumberOfUnitDetailsTypeI18670C guestCountDetails) {
    this.guestCountDetails = guestCountDetails;
    return this;
  }

  /**
   * Get guestCountDetails
   * @return guestCountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitDetailsTypeI18670C getGuestCountDetails() {
    return guestCountDetails;
  }

  public void setGuestCountDetails(NumberOfUnitDetailsTypeI18670C guestCountDetails) {
    this.guestCountDetails = guestCountDetails;
  }

  public HotelRoomType roomRateIdentifier(HotelRoomRateInformationType roomRateIdentifier) {
    this.roomRateIdentifier = roomRateIdentifier;
    return this;
  }

  /**
   * Get roomRateIdentifier
   * @return roomRateIdentifier
  */
  @ApiModelProperty(value = "")

  @Valid

  public HotelRoomRateInformationType getRoomRateIdentifier() {
    return roomRateIdentifier;
  }

  public void setRoomRateIdentifier(HotelRoomRateInformationType roomRateIdentifier) {
    this.roomRateIdentifier = roomRateIdentifier;
  }

  public HotelRoomType roomTypeOverride(String roomTypeOverride) {
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
    HotelRoomType hotelRoomType = (HotelRoomType) o;
    return Objects.equals(this.bookingCode, hotelRoomType.bookingCode) &&
        Objects.equals(this.guestCountDetails, hotelRoomType.guestCountDetails) &&
        Objects.equals(this.roomRateIdentifier, hotelRoomType.roomRateIdentifier) &&
        Objects.equals(this.roomTypeOverride, hotelRoomType.roomTypeOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingCode, guestCountDetails, roomRateIdentifier, roomTypeOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRoomType {\n");
    
    sb.append("    bookingCode: ").append(toIndentedString(bookingCode)).append("\n");
    sb.append("    guestCountDetails: ").append(toIndentedString(guestCountDetails)).append("\n");
    sb.append("    roomRateIdentifier: ").append(toIndentedString(roomRateIdentifier)).append("\n");
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

