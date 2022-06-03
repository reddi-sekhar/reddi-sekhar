package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OtherHotelInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PropertyHeaderDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RateCodeRestrictedType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RoomDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotelProductInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class HotelProductInformationType   {
  @JsonProperty("hotelRoom")
  private RoomDetailsType hotelRoom;

  @JsonProperty("negotiated")
  @Valid
  private List<RateCodeRestrictedType> negotiated = null;

  @JsonProperty("otherHotelInfo")
  private OtherHotelInformationType otherHotelInfo;

  @JsonProperty("property")
  private PropertyHeaderDetailsType property;

  public HotelProductInformationType hotelRoom(RoomDetailsType hotelRoom) {
    this.hotelRoom = hotelRoom;
    return this;
  }

  /**
   * Get hotelRoom
   * @return hotelRoom
  */
  @ApiModelProperty(value = "")

  @Valid

  public RoomDetailsType getHotelRoom() {
    return hotelRoom;
  }

  public void setHotelRoom(RoomDetailsType hotelRoom) {
    this.hotelRoom = hotelRoom;
  }

  public HotelProductInformationType negotiated(List<RateCodeRestrictedType> negotiated) {
    this.negotiated = negotiated;
    return this;
  }

  public HotelProductInformationType addNegotiatedItem(RateCodeRestrictedType negotiatedItem) {
    if (this.negotiated == null) {
      this.negotiated = new ArrayList<>();
    }
    this.negotiated.add(negotiatedItem);
    return this;
  }

  /**
   * Get negotiated
   * @return negotiated
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RateCodeRestrictedType> getNegotiated() {
    return negotiated;
  }

  public void setNegotiated(List<RateCodeRestrictedType> negotiated) {
    this.negotiated = negotiated;
  }

  public HotelProductInformationType otherHotelInfo(OtherHotelInformationType otherHotelInfo) {
    this.otherHotelInfo = otherHotelInfo;
    return this;
  }

  /**
   * Get otherHotelInfo
   * @return otherHotelInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public OtherHotelInformationType getOtherHotelInfo() {
    return otherHotelInfo;
  }

  public void setOtherHotelInfo(OtherHotelInformationType otherHotelInfo) {
    this.otherHotelInfo = otherHotelInfo;
  }

  public HotelProductInformationType property(PropertyHeaderDetailsType property) {
    this.property = property;
    return this;
  }

  /**
   * Get property
   * @return property
  */
  @ApiModelProperty(value = "")

  @Valid

  public PropertyHeaderDetailsType getProperty() {
    return property;
  }

  public void setProperty(PropertyHeaderDetailsType property) {
    this.property = property;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelProductInformationType hotelProductInformationType = (HotelProductInformationType) o;
    return Objects.equals(this.hotelRoom, hotelProductInformationType.hotelRoom) &&
        Objects.equals(this.negotiated, hotelProductInformationType.negotiated) &&
        Objects.equals(this.otherHotelInfo, hotelProductInformationType.otherHotelInfo) &&
        Objects.equals(this.property, hotelProductInformationType.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelRoom, negotiated, otherHotelInfo, property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelProductInformationType {\n");
    
    sb.append("    hotelRoom: ").append(toIndentedString(hotelRoom)).append("\n");
    sb.append("    negotiated: ").append(toIndentedString(negotiated)).append("\n");
    sb.append("    otherHotelInfo: ").append(toIndentedString(otherHotelInfo)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

