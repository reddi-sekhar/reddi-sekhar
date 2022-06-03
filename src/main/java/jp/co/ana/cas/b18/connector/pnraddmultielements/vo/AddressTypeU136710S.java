package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AddressDetailsTypeU198210C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AddressUsageTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CountrySubEntityDetailsTypeU198213C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LocationIdentificationTypeU198211C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AddressTypeU136710S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AddressTypeU136710S   {
  @JsonProperty("addressDetails")
  private AddressDetailsTypeU198210C addressDetails;

  @JsonProperty("addressUsageDetails")
  private AddressUsageTypeU addressUsageDetails;

  @JsonProperty("city")
  private String city;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("locationDetails")
  private LocationIdentificationTypeU198211C locationDetails;

  @JsonProperty("regionDetails")
  private CountrySubEntityDetailsTypeU198213C regionDetails;

  @JsonProperty("zipCode")
  private String zipCode;

  public AddressTypeU136710S addressDetails(AddressDetailsTypeU198210C addressDetails) {
    this.addressDetails = addressDetails;
    return this;
  }

  /**
   * Get addressDetails
   * @return addressDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AddressDetailsTypeU198210C getAddressDetails() {
    return addressDetails;
  }

  public void setAddressDetails(AddressDetailsTypeU198210C addressDetails) {
    this.addressDetails = addressDetails;
  }

  public AddressTypeU136710S addressUsageDetails(AddressUsageTypeU addressUsageDetails) {
    this.addressUsageDetails = addressUsageDetails;
    return this;
  }

  /**
   * Get addressUsageDetails
   * @return addressUsageDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AddressUsageTypeU getAddressUsageDetails() {
    return addressUsageDetails;
  }

  public void setAddressUsageDetails(AddressUsageTypeU addressUsageDetails) {
    this.addressUsageDetails = addressUsageDetails;
  }

  public AddressTypeU136710S city(String city) {
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

  public AddressTypeU136710S countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
  */
  @ApiModelProperty(value = "")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AddressTypeU136710S locationDetails(LocationIdentificationTypeU198211C locationDetails) {
    this.locationDetails = locationDetails;
    return this;
  }

  /**
   * Get locationDetails
   * @return locationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocationIdentificationTypeU198211C getLocationDetails() {
    return locationDetails;
  }

  public void setLocationDetails(LocationIdentificationTypeU198211C locationDetails) {
    this.locationDetails = locationDetails;
  }

  public AddressTypeU136710S regionDetails(CountrySubEntityDetailsTypeU198213C regionDetails) {
    this.regionDetails = regionDetails;
    return this;
  }

  /**
   * Get regionDetails
   * @return regionDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CountrySubEntityDetailsTypeU198213C getRegionDetails() {
    return regionDetails;
  }

  public void setRegionDetails(CountrySubEntityDetailsTypeU198213C regionDetails) {
    this.regionDetails = regionDetails;
  }

  public AddressTypeU136710S zipCode(String zipCode) {
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
    AddressTypeU136710S addressTypeU136710S = (AddressTypeU136710S) o;
    return Objects.equals(this.addressDetails, addressTypeU136710S.addressDetails) &&
        Objects.equals(this.addressUsageDetails, addressTypeU136710S.addressUsageDetails) &&
        Objects.equals(this.city, addressTypeU136710S.city) &&
        Objects.equals(this.countryCode, addressTypeU136710S.countryCode) &&
        Objects.equals(this.locationDetails, addressTypeU136710S.locationDetails) &&
        Objects.equals(this.regionDetails, addressTypeU136710S.regionDetails) &&
        Objects.equals(this.zipCode, addressTypeU136710S.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressDetails, addressUsageDetails, city, countryCode, locationDetails, regionDetails, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTypeU136710S {\n");
    
    sb.append("    addressDetails: ").append(toIndentedString(addressDetails)).append("\n");
    sb.append("    addressUsageDetails: ").append(toIndentedString(addressUsageDetails)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

