package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhoneAndEmailAddressType136723S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PhoneAndEmailAddressType136723S   {
  @JsonProperty("emailAddress")
  private String emailAddress;

  @JsonProperty("phoneOrEmailType")
  private String phoneOrEmailType;

  public PhoneAndEmailAddressType136723S emailAddress(String emailAddress) {
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

  public PhoneAndEmailAddressType136723S phoneOrEmailType(String phoneOrEmailType) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneAndEmailAddressType136723S phoneAndEmailAddressType136723S = (PhoneAndEmailAddressType136723S) o;
    return Objects.equals(this.emailAddress, phoneAndEmailAddressType136723S.emailAddress) &&
        Objects.equals(this.phoneOrEmailType, phoneAndEmailAddressType136723S.phoneOrEmailType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, phoneOrEmailType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneAndEmailAddressType136723S {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneOrEmailType: ").append(toIndentedString(phoneOrEmailType)).append("\n");
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

