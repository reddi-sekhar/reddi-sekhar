package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MiscellaneousRemarksType12240S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PhoneAndEmailAddressType32298S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ContactDetails   {
  @JsonProperty("contactName")
  private TravellerInformationTypeI contactName;

  @JsonProperty("miscelaneous")
  private MiscellaneousRemarksType12240S miscelaneous;

  @JsonProperty("phoneNumber")
  private PhoneAndEmailAddressType32298S phoneNumber;

  public ContactDetails contactName(TravellerInformationTypeI contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * Get contactName
   * @return contactName
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerInformationTypeI getContactName() {
    return contactName;
  }

  public void setContactName(TravellerInformationTypeI contactName) {
    this.contactName = contactName;
  }

  public ContactDetails miscelaneous(MiscellaneousRemarksType12240S miscelaneous) {
    this.miscelaneous = miscelaneous;
    return this;
  }

  /**
   * Get miscelaneous
   * @return miscelaneous
  */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousRemarksType12240S getMiscelaneous() {
    return miscelaneous;
  }

  public void setMiscelaneous(MiscellaneousRemarksType12240S miscelaneous) {
    this.miscelaneous = miscelaneous;
  }

  public ContactDetails phoneNumber(PhoneAndEmailAddressType32298S phoneNumber) {
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
    ContactDetails contactDetails = (ContactDetails) o;
    return Objects.equals(this.contactName, contactDetails.contactName) &&
        Objects.equals(this.miscelaneous, contactDetails.miscelaneous) &&
        Objects.equals(this.phoneNumber, contactDetails.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactName, miscelaneous, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDetails {\n");
    
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    miscelaneous: ").append(toIndentedString(miscelaneous)).append("\n");
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

