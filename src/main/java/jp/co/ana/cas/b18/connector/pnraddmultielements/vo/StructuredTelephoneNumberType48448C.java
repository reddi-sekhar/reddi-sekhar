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
 * StructuredTelephoneNumberType48448C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredTelephoneNumberType48448C   {
  @JsonProperty("areaCode")
  private String areaCode;

  @JsonProperty("internationalDialCode")
  private String internationalDialCode;

  @JsonProperty("localPrefixCode")
  private String localPrefixCode;

  @JsonProperty("telephoneNumber")
  private String telephoneNumber;

  public StructuredTelephoneNumberType48448C areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

  /**
   * Get areaCode
   * @return areaCode
  */
  @ApiModelProperty(value = "")


  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public StructuredTelephoneNumberType48448C internationalDialCode(String internationalDialCode) {
    this.internationalDialCode = internationalDialCode;
    return this;
  }

  /**
   * Get internationalDialCode
   * @return internationalDialCode
  */
  @ApiModelProperty(value = "")


  public String getInternationalDialCode() {
    return internationalDialCode;
  }

  public void setInternationalDialCode(String internationalDialCode) {
    this.internationalDialCode = internationalDialCode;
  }

  public StructuredTelephoneNumberType48448C localPrefixCode(String localPrefixCode) {
    this.localPrefixCode = localPrefixCode;
    return this;
  }

  /**
   * Get localPrefixCode
   * @return localPrefixCode
  */
  @ApiModelProperty(value = "")


  public String getLocalPrefixCode() {
    return localPrefixCode;
  }

  public void setLocalPrefixCode(String localPrefixCode) {
    this.localPrefixCode = localPrefixCode;
  }

  public StructuredTelephoneNumberType48448C telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * Get telephoneNumber
   * @return telephoneNumber
  */
  @ApiModelProperty(value = "")


  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredTelephoneNumberType48448C structuredTelephoneNumberType48448C = (StructuredTelephoneNumberType48448C) o;
    return Objects.equals(this.areaCode, structuredTelephoneNumberType48448C.areaCode) &&
        Objects.equals(this.internationalDialCode, structuredTelephoneNumberType48448C.internationalDialCode) &&
        Objects.equals(this.localPrefixCode, structuredTelephoneNumberType48448C.localPrefixCode) &&
        Objects.equals(this.telephoneNumber, structuredTelephoneNumberType48448C.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaCode, internationalDialCode, localPrefixCode, telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredTelephoneNumberType48448C {\n");
    
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    internationalDialCode: ").append(toIndentedString(internationalDialCode)).append("\n");
    sb.append("    localPrefixCode: ").append(toIndentedString(localPrefixCode)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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

