package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredTelephoneNumberType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhoneAndEmailAddressType94565S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PhoneAndEmailAddressType94565S   {
  @JsonProperty("emailAddress")
  private String emailAddress;

  @JsonProperty("phoneOrEmailType")
  private String phoneOrEmailType;

  @JsonProperty("telephoneNumberDetails")
  private StructuredTelephoneNumberType telephoneNumberDetails;

  public PhoneAndEmailAddressType94565S emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress
   * @return emailAddress
  */
  @ApiModelProperty(value = "")


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public PhoneAndEmailAddressType94565S phoneOrEmailType(String phoneOrEmailType) {
    this.phoneOrEmailType = phoneOrEmailType;
    return this;
  }

  /**
   * Get phoneOrEmailType
   * @return phoneOrEmailType
  */
  @ApiModelProperty(value = "")


  public String getPhoneOrEmailType() {
    return phoneOrEmailType;
  }

  public void setPhoneOrEmailType(String phoneOrEmailType) {
    this.phoneOrEmailType = phoneOrEmailType;
  }

  public PhoneAndEmailAddressType94565S telephoneNumberDetails(StructuredTelephoneNumberType telephoneNumberDetails) {
    this.telephoneNumberDetails = telephoneNumberDetails;
    return this;
  }

  /**
   * Get telephoneNumberDetails
   * @return telephoneNumberDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredTelephoneNumberType getTelephoneNumberDetails() {
    return telephoneNumberDetails;
  }

  public void setTelephoneNumberDetails(StructuredTelephoneNumberType telephoneNumberDetails) {
    this.telephoneNumberDetails = telephoneNumberDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneAndEmailAddressType94565S phoneAndEmailAddressType94565S = (PhoneAndEmailAddressType94565S) o;
    return Objects.equals(this.emailAddress, phoneAndEmailAddressType94565S.emailAddress) &&
        Objects.equals(this.phoneOrEmailType, phoneAndEmailAddressType94565S.phoneOrEmailType) &&
        Objects.equals(this.telephoneNumberDetails, phoneAndEmailAddressType94565S.telephoneNumberDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, phoneOrEmailType, telephoneNumberDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneAndEmailAddressType94565S {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneOrEmailType: ").append(toIndentedString(phoneOrEmailType)).append("\n");
    sb.append("    telephoneNumberDetails: ").append(toIndentedString(telephoneNumberDetails)).append("\n");
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

