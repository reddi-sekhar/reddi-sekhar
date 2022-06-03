package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AddressDetailsTypeU198226C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CountrySubEntityDetailsTypeU198229C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AddressTypeU136721S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AddressTypeU136721S   {
  @JsonProperty("addressDetails")
  private AddressDetailsTypeU198226C addressDetails;

  @JsonProperty("city")
  private String city;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("regionDetails")
  private CountrySubEntityDetailsTypeU198229C regionDetails;

  @JsonProperty("zipCode")
  private String zipCode;

  public AddressTypeU136721S addressDetails(AddressDetailsTypeU198226C addressDetails) {
    this.addressDetails = addressDetails;
    return this;
  }

  /**
   * Get addressDetails
   * @return addressDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AddressDetailsTypeU198226C getAddressDetails() {
    return addressDetails;
  }

  public void setAddressDetails(AddressDetailsTypeU198226C addressDetails) {
    this.addressDetails = addressDetails;
  }

  public AddressTypeU136721S city(String city) {
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

  public AddressTypeU136721S countryCode(String countryCode) {
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

  public AddressTypeU136721S regionDetails(CountrySubEntityDetailsTypeU198229C regionDetails) {
    this.regionDetails = regionDetails;
    return this;
  }

  /**
   * Get regionDetails
   * @return regionDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CountrySubEntityDetailsTypeU198229C getRegionDetails() {
    return regionDetails;
  }

  public void setRegionDetails(CountrySubEntityDetailsTypeU198229C regionDetails) {
    this.regionDetails = regionDetails;
  }

  public AddressTypeU136721S zipCode(String zipCode) {
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
    AddressTypeU136721S addressTypeU136721S = (AddressTypeU136721S) o;
    return Objects.equals(this.addressDetails, addressTypeU136721S.addressDetails) &&
        Objects.equals(this.city, addressTypeU136721S.city) &&
        Objects.equals(this.countryCode, addressTypeU136721S.countryCode) &&
        Objects.equals(this.regionDetails, addressTypeU136721S.regionDetails) &&
        Objects.equals(this.zipCode, addressTypeU136721S.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressDetails, city, countryCode, regionDetails, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTypeU136721S {\n");
    
    sb.append("    addressDetails: ").append(toIndentedString(addressDetails)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

