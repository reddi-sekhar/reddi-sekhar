package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AddressDetailsTypeU17987C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CountrySubEntityDetailsTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LocationIdentificationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AddressTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AddressTypeU   {
  @JsonProperty("addressDetails")
  private AddressDetailsTypeU17987C addressDetails;

  @JsonProperty("city")
  private String city;

  @JsonProperty("locationDetails")
  private LocationIdentificationTypeU locationDetails;

  @JsonProperty("regionDetails")
  private CountrySubEntityDetailsTypeU regionDetails;

  @JsonProperty("zipCode")
  private String zipCode;

  public AddressTypeU addressDetails(AddressDetailsTypeU17987C addressDetails) {
    this.addressDetails = addressDetails;
    return this;
  }

  /**
   * Get addressDetails
   * @return addressDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AddressDetailsTypeU17987C getAddressDetails() {
    return addressDetails;
  }

  public void setAddressDetails(AddressDetailsTypeU17987C addressDetails) {
    this.addressDetails = addressDetails;
  }

  public AddressTypeU city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressTypeU locationDetails(LocationIdentificationTypeU locationDetails) {
    this.locationDetails = locationDetails;
    return this;
  }

  /**
   * Get locationDetails
   * @return locationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationIdentificationTypeU getLocationDetails() {
    return locationDetails;
  }

  public void setLocationDetails(LocationIdentificationTypeU locationDetails) {
    this.locationDetails = locationDetails;
  }

  public AddressTypeU regionDetails(CountrySubEntityDetailsTypeU regionDetails) {
    this.regionDetails = regionDetails;
    return this;
  }

  /**
   * Get regionDetails
   * @return regionDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CountrySubEntityDetailsTypeU getRegionDetails() {
    return regionDetails;
  }

  public void setRegionDetails(CountrySubEntityDetailsTypeU regionDetails) {
    this.regionDetails = regionDetails;
  }

  public AddressTypeU zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
  */
  @ApiModelProperty(value = "")


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressTypeU addressTypeU = (AddressTypeU) o;
    return Objects.equals(this.addressDetails, addressTypeU.addressDetails) &&
        Objects.equals(this.city, addressTypeU.city) &&
        Objects.equals(this.locationDetails, addressTypeU.locationDetails) &&
        Objects.equals(this.regionDetails, addressTypeU.regionDetails) &&
        Objects.equals(this.zipCode, addressTypeU.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressDetails, city, locationDetails, regionDetails, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTypeU {\n");
    
    sb.append("    addressDetails: ").append(toIndentedString(addressDetails)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    locationDetails: ").append(toIndentedString(locationDetails)).append("\n");
    sb.append("    regionDetails: ").append(toIndentedString(regionDetails)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

