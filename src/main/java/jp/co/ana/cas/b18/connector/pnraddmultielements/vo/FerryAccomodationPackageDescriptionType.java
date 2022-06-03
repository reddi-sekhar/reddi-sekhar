package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.HotelPropertyType26378S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PlaceLocationIdentificationTypeU24573S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RoomInfoGroup;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType207596S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FerryAccomodationPackageDescriptionType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FerryAccomodationPackageDescriptionType   {
  @JsonProperty("areaCodeInfo")
  private PlaceLocationIdentificationTypeU24573S areaCodeInfo;

  @JsonProperty("hotelCheckInInformation")
  private StructuredDateTimeInformationType207596S hotelCheckInInformation;

  @JsonProperty("hotelInformation")
  private HotelPropertyType26378S hotelInformation;

  @JsonProperty("hotelItemPrice")
  private TariffInformationTypeU hotelItemPrice;

  @JsonProperty("numberOfNights")
  private NumberOfUnitsType numberOfNights;

  @JsonProperty("packageCode")
  private ProductInformationTypeI packageCode;

  @JsonProperty("roomInfoGroup")
  @Valid
  private List<RoomInfoGroup> roomInfoGroup = null;

  public FerryAccomodationPackageDescriptionType areaCodeInfo(PlaceLocationIdentificationTypeU24573S areaCodeInfo) {
    this.areaCodeInfo = areaCodeInfo;
    return this;
  }

  /**
   * Get areaCodeInfo
   * @return areaCodeInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlaceLocationIdentificationTypeU24573S getAreaCodeInfo() {
    return areaCodeInfo;
  }

  public void setAreaCodeInfo(PlaceLocationIdentificationTypeU24573S areaCodeInfo) {
    this.areaCodeInfo = areaCodeInfo;
  }

  public FerryAccomodationPackageDescriptionType hotelCheckInInformation(StructuredDateTimeInformationType207596S hotelCheckInInformation) {
    this.hotelCheckInInformation = hotelCheckInInformation;
    return this;
  }

  /**
   * Get hotelCheckInInformation
   * @return hotelCheckInInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeInformationType207596S getHotelCheckInInformation() {
    return hotelCheckInInformation;
  }

  public void setHotelCheckInInformation(StructuredDateTimeInformationType207596S hotelCheckInInformation) {
    this.hotelCheckInInformation = hotelCheckInInformation;
  }

  public FerryAccomodationPackageDescriptionType hotelInformation(HotelPropertyType26378S hotelInformation) {
    this.hotelInformation = hotelInformation;
    return this;
  }

  /**
   * Get hotelInformation
   * @return hotelInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public HotelPropertyType26378S getHotelInformation() {
    return hotelInformation;
  }

  public void setHotelInformation(HotelPropertyType26378S hotelInformation) {
    this.hotelInformation = hotelInformation;
  }

  public FerryAccomodationPackageDescriptionType hotelItemPrice(TariffInformationTypeU hotelItemPrice) {
    this.hotelItemPrice = hotelItemPrice;
    return this;
  }

  /**
   * Get hotelItemPrice
   * @return hotelItemPrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeU getHotelItemPrice() {
    return hotelItemPrice;
  }

  public void setHotelItemPrice(TariffInformationTypeU hotelItemPrice) {
    this.hotelItemPrice = hotelItemPrice;
  }

  public FerryAccomodationPackageDescriptionType numberOfNights(NumberOfUnitsType numberOfNights) {
    this.numberOfNights = numberOfNights;
    return this;
  }

  /**
   * Get numberOfNights
   * @return numberOfNights
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitsType getNumberOfNights() {
    return numberOfNights;
  }

  public void setNumberOfNights(NumberOfUnitsType numberOfNights) {
    this.numberOfNights = numberOfNights;
  }

  public FerryAccomodationPackageDescriptionType packageCode(ProductInformationTypeI packageCode) {
    this.packageCode = packageCode;
    return this;
  }

  /**
   * Get packageCode
   * @return packageCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductInformationTypeI getPackageCode() {
    return packageCode;
  }

  public void setPackageCode(ProductInformationTypeI packageCode) {
    this.packageCode = packageCode;
  }

  public FerryAccomodationPackageDescriptionType roomInfoGroup(List<RoomInfoGroup> roomInfoGroup) {
    this.roomInfoGroup = roomInfoGroup;
    return this;
  }

  public FerryAccomodationPackageDescriptionType addRoomInfoGroupItem(RoomInfoGroup roomInfoGroupItem) {
    if (this.roomInfoGroup == null) {
      this.roomInfoGroup = new ArrayList<>();
    }
    this.roomInfoGroup.add(roomInfoGroupItem);
    return this;
  }

  /**
   * Get roomInfoGroup
   * @return roomInfoGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RoomInfoGroup> getRoomInfoGroup() {
    return roomInfoGroup;
  }

  public void setRoomInfoGroup(List<RoomInfoGroup> roomInfoGroup) {
    this.roomInfoGroup = roomInfoGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FerryAccomodationPackageDescriptionType ferryAccomodationPackageDescriptionType = (FerryAccomodationPackageDescriptionType) o;
    return Objects.equals(this.areaCodeInfo, ferryAccomodationPackageDescriptionType.areaCodeInfo) &&
        Objects.equals(this.hotelCheckInInformation, ferryAccomodationPackageDescriptionType.hotelCheckInInformation) &&
        Objects.equals(this.hotelInformation, ferryAccomodationPackageDescriptionType.hotelInformation) &&
        Objects.equals(this.hotelItemPrice, ferryAccomodationPackageDescriptionType.hotelItemPrice) &&
        Objects.equals(this.numberOfNights, ferryAccomodationPackageDescriptionType.numberOfNights) &&
        Objects.equals(this.packageCode, ferryAccomodationPackageDescriptionType.packageCode) &&
        Objects.equals(this.roomInfoGroup, ferryAccomodationPackageDescriptionType.roomInfoGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaCodeInfo, hotelCheckInInformation, hotelInformation, hotelItemPrice, numberOfNights, packageCode, roomInfoGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FerryAccomodationPackageDescriptionType {\n");
    
    sb.append("    areaCodeInfo: ").append(toIndentedString(areaCodeInfo)).append("\n");
    sb.append("    hotelCheckInInformation: ").append(toIndentedString(hotelCheckInInformation)).append("\n");
    sb.append("    hotelInformation: ").append(toIndentedString(hotelInformation)).append("\n");
    sb.append("    hotelItemPrice: ").append(toIndentedString(hotelItemPrice)).append("\n");
    sb.append("    numberOfNights: ").append(toIndentedString(numberOfNights)).append("\n");
    sb.append("    packageCode: ").append(toIndentedString(packageCode)).append("\n");
    sb.append("    roomInfoGroup: ").append(toIndentedString(roomInfoGroup)).append("\n");
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

