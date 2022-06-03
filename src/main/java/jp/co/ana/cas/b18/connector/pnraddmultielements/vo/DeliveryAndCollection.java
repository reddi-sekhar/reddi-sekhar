package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AddressTypeU136710S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PhoneAndEmailAddressType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeliveryAndCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DeliveryAndCollection   {
  @JsonProperty("addressDeliveryCollection")
  private AddressTypeU136710S addressDeliveryCollection;

  @JsonProperty("phoneNumber")
  private PhoneAndEmailAddressType phoneNumber;

  public DeliveryAndCollection addressDeliveryCollection(AddressTypeU136710S addressDeliveryCollection) {
    this.addressDeliveryCollection = addressDeliveryCollection;
    return this;
  }

  /**
   * Get addressDeliveryCollection
   * @return addressDeliveryCollection
  */
  @ApiModelProperty(value = "")

  @Valid

  public AddressTypeU136710S getAddressDeliveryCollection() {
    return addressDeliveryCollection;
  }

  public void setAddressDeliveryCollection(AddressTypeU136710S addressDeliveryCollection) {
    this.addressDeliveryCollection = addressDeliveryCollection;
  }

  public DeliveryAndCollection phoneNumber(PhoneAndEmailAddressType phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @ApiModelProperty(value = "")

  @Valid

  public PhoneAndEmailAddressType getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(PhoneAndEmailAddressType phoneNumber) {
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
    DeliveryAndCollection deliveryAndCollection = (DeliveryAndCollection) o;
    return Objects.equals(this.addressDeliveryCollection, deliveryAndCollection.addressDeliveryCollection) &&
        Objects.equals(this.phoneNumber, deliveryAndCollection.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressDeliveryCollection, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryAndCollection {\n");
    
    sb.append("    addressDeliveryCollection: ").append(toIndentedString(addressDeliveryCollection)).append("\n");
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

