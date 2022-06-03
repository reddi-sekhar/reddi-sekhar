package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.HotelRoomRateInformationType46329C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitDetailsTypeI46330C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotelRoomType25429S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class HotelRoomType25429S   {
  @JsonProperty("bookingCode")
  private String bookingCode;

  @JsonProperty("guestCountDetails")
  private NumberOfUnitDetailsTypeI46330C guestCountDetails;

  @JsonProperty("roomRateIdentifier")
  private HotelRoomRateInformationType46329C roomRateIdentifier;

  @JsonProperty("roomTypeOverride")
  private String roomTypeOverride;

  public HotelRoomType25429S bookingCode(String bookingCode) {
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

  public HotelRoomType25429S guestCountDetails(NumberOfUnitDetailsTypeI46330C guestCountDetails) {
    this.guestCountDetails = guestCountDetails;
    return this;
  }

  /**
   * Get guestCountDetails
   * @return guestCountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitDetailsTypeI46330C getGuestCountDetails() {
    return guestCountDetails;
  }

  public void setGuestCountDetails(NumberOfUnitDetailsTypeI46330C guestCountDetails) {
    this.guestCountDetails = guestCountDetails;
  }

  public HotelRoomType25429S roomRateIdentifier(HotelRoomRateInformationType46329C roomRateIdentifier) {
    this.roomRateIdentifier = roomRateIdentifier;
    return this;
  }

  /**
   * Get roomRateIdentifier
   * @return roomRateIdentifier
  */
  @ApiModelProperty(value = "")

  @Valid

  public HotelRoomRateInformationType46329C getRoomRateIdentifier() {
    return roomRateIdentifier;
  }

  public void setRoomRateIdentifier(HotelRoomRateInformationType46329C roomRateIdentifier) {
    this.roomRateIdentifier = roomRateIdentifier;
  }

  public HotelRoomType25429S roomTypeOverride(String roomTypeOverride) {
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
    HotelRoomType25429S hotelRoomType25429S = (HotelRoomType25429S) o;
    return Objects.equals(this.bookingCode, hotelRoomType25429S.bookingCode) &&
        Objects.equals(this.guestCountDetails, hotelRoomType25429S.guestCountDetails) &&
        Objects.equals(this.roomRateIdentifier, hotelRoomType25429S.roomRateIdentifier) &&
        Objects.equals(this.roomTypeOverride, hotelRoomType25429S.roomTypeOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingCode, guestCountDetails, roomRateIdentifier, roomTypeOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRoomType25429S {\n");
    
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

