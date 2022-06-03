package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AddressTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NameTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PhoneAndEmailAddressType32298S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriberAddressSection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SubscriberAddressSection   {
  @JsonProperty("addressInfo")
  private AddressTypeU addressInfo;

  @JsonProperty("nameDetails")
  private NameTypeU nameDetails;

  @JsonProperty("phoneNumber")
  private PhoneAndEmailAddressType32298S phoneNumber;

  public SubscriberAddressSection addressInfo(AddressTypeU addressInfo) {
    this.addressInfo = addressInfo;
    return this;
  }

  /**
   * Get addressInfo
   * @return addressInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AddressTypeU getAddressInfo() {
    return addressInfo;
  }

  public void setAddressInfo(AddressTypeU addressInfo) {
    this.addressInfo = addressInfo;
  }

  public SubscriberAddressSection nameDetails(NameTypeU nameDetails) {
    this.nameDetails = nameDetails;
    return this;
  }

  /**
   * Get nameDetails
   * @return nameDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameTypeU getNameDetails() {
    return nameDetails;
  }

  public void setNameDetails(NameTypeU nameDetails) {
    this.nameDetails = nameDetails;
  }

  public SubscriberAddressSection phoneNumber(PhoneAndEmailAddressType32298S phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @ApiModelProperty(value = "")

  @Valid

  public PhoneAndEmailAddressType32298S getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(PhoneAndEmailAddressType32298S phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriberAddressSection subscriberAddressSection = (SubscriberAddressSection) o;
    return Objects.equals(this.addressInfo, subscriberAddressSection.addressInfo) &&
        Objects.equals(this.nameDetails, subscriberAddressSection.nameDetails) &&
        Objects.equals(this.phoneNumber, subscriberAddressSection.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressInfo, nameDetails, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberAddressSection {\n");
    
    sb.append("    addressInfo: ").append(toIndentedString(addressInfo)).append("\n");
    sb.append("    nameDetails: ").append(toIndentedString(nameDetails)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

