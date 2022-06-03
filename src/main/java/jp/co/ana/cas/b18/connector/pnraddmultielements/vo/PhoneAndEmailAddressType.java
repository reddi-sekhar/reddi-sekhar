package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredTelephoneNumberType198214C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhoneAndEmailAddressType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PhoneAndEmailAddressType   {
  @JsonProperty("phoneOrEmailType")
  private String phoneOrEmailType;

  @JsonProperty("telephoneNumberDetails")
  private StructuredTelephoneNumberType198214C telephoneNumberDetails;

  public PhoneAndEmailAddressType phoneOrEmailType(String phoneOrEmailType) {
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

  public PhoneAndEmailAddressType telephoneNumberDetails(StructuredTelephoneNumberType198214C telephoneNumberDetails) {
    this.telephoneNumberDetails = telephoneNumberDetails;
    return this;
  }

  /**
   * Get telephoneNumberDetails
   * @return telephoneNumberDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredTelephoneNumberType198214C getTelephoneNumberDetails() {
    return telephoneNumberDetails;
  }

  public void setTelephoneNumberDetails(StructuredTelephoneNumberType198214C telephoneNumberDetails) {
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
    PhoneAndEmailAddressType phoneAndEmailAddressType = (PhoneAndEmailAddressType) o;
    return Objects.equals(this.phoneOrEmailType, phoneAndEmailAddressType.phoneOrEmailType) &&
        Objects.equals(this.telephoneNumberDetails, phoneAndEmailAddressType.telephoneNumberDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneOrEmailType, telephoneNumberDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneAndEmailAddressType {\n");
    
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

