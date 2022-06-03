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
 * HotelRoomRateInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class HotelRoomRateInformationType   {
  @JsonProperty("rateCategoryCode")
  private String rateCategoryCode;

  @JsonProperty("ratePlanCode")
  private String ratePlanCode;

  @JsonProperty("rateQualifiedIndic")
  private String rateQualifiedIndic;

  @JsonProperty("roomType")
  private String roomType;

  public HotelRoomRateInformationType rateCategoryCode(String rateCategoryCode) {
    this.rateCategoryCode = rateCategoryCode;
    return this;
  }

  /**
   * Get rateCategoryCode
   * @return rateCategoryCode
  */
  @ApiModelProperty(value = "")


  public String getRateCategoryCode() {
    return rateCategoryCode;
  }

  public void setRateCategoryCode(String rateCategoryCode) {
    this.rateCategoryCode = rateCategoryCode;
  }

  public HotelRoomRateInformationType ratePlanCode(String ratePlanCode) {
    this.ratePlanCode = ratePlanCode;
    return this;
  }

  /**
   * Get ratePlanCode
   * @return ratePlanCode
  */
  @ApiModelProperty(value = "")


  public String getRatePlanCode() {
    return ratePlanCode;
  }

  public void setRatePlanCode(String ratePlanCode) {
    this.ratePlanCode = ratePlanCode;
  }

  public HotelRoomRateInformationType rateQualifiedIndic(String rateQualifiedIndic) {
    this.rateQualifiedIndic = rateQualifiedIndic;
    return this;
  }

  /**
   * Get rateQualifiedIndic
   * @return rateQualifiedIndic
  */
  @ApiModelProperty(value = "")


  public String getRateQualifiedIndic() {
    return rateQualifiedIndic;
  }

  public void setRateQualifiedIndic(String rateQualifiedIndic) {
    this.rateQualifiedIndic = rateQualifiedIndic;
  }

  public HotelRoomRateInformationType roomType(String roomType) {
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
    HotelRoomRateInformationType hotelRoomRateInformationType = (HotelRoomRateInformationType) o;
    return Objects.equals(this.rateCategoryCode, hotelRoomRateInformationType.rateCategoryCode) &&
        Objects.equals(this.ratePlanCode, hotelRoomRateInformationType.ratePlanCode) &&
        Objects.equals(this.rateQualifiedIndic, hotelRoomRateInformationType.rateQualifiedIndic) &&
        Objects.equals(this.roomType, hotelRoomRateInformationType.roomType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateCategoryCode, ratePlanCode, rateQualifiedIndic, roomType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRoomRateInformationType {\n");
    
    sb.append("    rateCategoryCode: ").append(toIndentedString(rateCategoryCode)).append("\n");
    sb.append("    ratePlanCode: ").append(toIndentedString(ratePlanCode)).append("\n");
    sb.append("    rateQualifiedIndic: ").append(toIndentedString(rateQualifiedIndic)).append("\n");
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

