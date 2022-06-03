package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AddressTypeU136721S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PhoneAndEmailAddressType136723S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PlaceLocationIdentificationTypeU136722S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredPeriodInformationType136724S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PickupDropoffLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PickupDropoffLocation   {
  @JsonProperty("address")
  private AddressTypeU136721S address;

  @JsonProperty("locationInfo")
  private PlaceLocationIdentificationTypeU136722S locationInfo;

  @JsonProperty("openingHours")
  @Valid
  private List<StructuredPeriodInformationType136724S> openingHours = null;

  @JsonProperty("phone")
  @Valid
  private List<PhoneAndEmailAddressType136723S> phone = null;

  public PickupDropoffLocation address(AddressTypeU136721S address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public AddressTypeU136721S getAddress() {
    return address;
  }

  public void setAddress(AddressTypeU136721S address) {
    this.address = address;
  }

  public PickupDropoffLocation locationInfo(PlaceLocationIdentificationTypeU136722S locationInfo) {
    this.locationInfo = locationInfo;
    return this;
  }

  /**
   * Get locationInfo
   * @return locationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlaceLocationIdentificationTypeU136722S getLocationInfo() {
    return locationInfo;
  }

  public void setLocationInfo(PlaceLocationIdentificationTypeU136722S locationInfo) {
    this.locationInfo = locationInfo;
  }

  public PickupDropoffLocation openingHours(List<StructuredPeriodInformationType136724S> openingHours) {
    this.openingHours = openingHours;
    return this;
  }

  public PickupDropoffLocation addOpeningHoursItem(StructuredPeriodInformationType136724S openingHoursItem) {
    if (this.openingHours == null) {
      this.openingHours = new ArrayList<>();
    }
    this.openingHours.add(openingHoursItem);
    return this;
  }

  /**
   * Get openingHours
   * @return openingHours
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StructuredPeriodInformationType136724S> getOpeningHours() {
    return openingHours;
  }

  public void setOpeningHours(List<StructuredPeriodInformationType136724S> openingHours) {
    this.openingHours = openingHours;
  }

  public PickupDropoffLocation phone(List<PhoneAndEmailAddressType136723S> phone) {
    this.phone = phone;
    return this;
  }

  public PickupDropoffLocation addPhoneItem(PhoneAndEmailAddressType136723S phoneItem) {
    if (this.phone == null) {
      this.phone = new ArrayList<>();
    }
    this.phone.add(phoneItem);
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PhoneAndEmailAddressType136723S> getPhone() {
    return phone;
  }

  public void setPhone(List<PhoneAndEmailAddressType136723S> phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickupDropoffLocation pickupDropoffLocation = (PickupDropoffLocation) o;
    return Objects.equals(this.address, pickupDropoffLocation.address) &&
        Objects.equals(this.locationInfo, pickupDropoffLocation.locationInfo) &&
        Objects.equals(this.openingHours, pickupDropoffLocation.openingHours) &&
        Objects.equals(this.phone, pickupDropoffLocation.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, locationInfo, openingHours, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickupDropoffLocation {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    locationInfo: ").append(toIndentedString(locationInfo)).append("\n");
    sb.append("    openingHours: ").append(toIndentedString(openingHours)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

