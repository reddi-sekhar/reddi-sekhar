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
 * FormOfPaymentDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FormOfPaymentDetailsTypeI   {
  @JsonProperty("creditCardNumber")
  private String creditCardNumber;

  @JsonProperty("expiryDate")
  private String expiryDate;

  @JsonProperty("extendedPayment")
  private String extendedPayment;

  @JsonProperty("fopFreeText")
  private String fopFreeText;

  @JsonProperty("type")
  private String type;

  @JsonProperty("vendorCode")
  private String vendorCode;

  public FormOfPaymentDetailsTypeI creditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
    return this;
  }

  /**
   * Get creditCardNumber
   * @return creditCardNumber
  */
  @ApiModelProperty(value = "")


  public String getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public FormOfPaymentDetailsTypeI expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
  */
  @ApiModelProperty(value = "")


  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public FormOfPaymentDetailsTypeI extendedPayment(String extendedPayment) {
    this.extendedPayment = extendedPayment;
    return this;
  }

  /**
   * Get extendedPayment
   * @return extendedPayment
  */
  @ApiModelProperty(value = "")


  public String getExtendedPayment() {
    return extendedPayment;
  }

  public void setExtendedPayment(String extendedPayment) {
    this.extendedPayment = extendedPayment;
  }

  public FormOfPaymentDetailsTypeI fopFreeText(String fopFreeText) {
    this.fopFreeText = fopFreeText;
    return this;
  }

  /**
   * Get fopFreeText
   * @return fopFreeText
  */
  @ApiModelProperty(value = "")


  public String getFopFreeText() {
    return fopFreeText;
  }

  public void setFopFreeText(String fopFreeText) {
    this.fopFreeText = fopFreeText;
  }

  public FormOfPaymentDetailsTypeI type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FormOfPaymentDetailsTypeI vendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
    return this;
  }

  /**
   * Get vendorCode
   * @return vendorCode
  */
  @ApiModelProperty(value = "")


  public String getVendorCode() {
    return vendorCode;
  }

  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormOfPaymentDetailsTypeI formOfPaymentDetailsTypeI = (FormOfPaymentDetailsTypeI) o;
    return Objects.equals(this.creditCardNumber, formOfPaymentDetailsTypeI.creditCardNumber) &&
        Objects.equals(this.expiryDate, formOfPaymentDetailsTypeI.expiryDate) &&
        Objects.equals(this.extendedPayment, formOfPaymentDetailsTypeI.extendedPayment) &&
        Objects.equals(this.fopFreeText, formOfPaymentDetailsTypeI.fopFreeText) &&
        Objects.equals(this.type, formOfPaymentDetailsTypeI.type) &&
        Objects.equals(this.vendorCode, formOfPaymentDetailsTypeI.vendorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditCardNumber, expiryDate, extendedPayment, fopFreeText, type, vendorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormOfPaymentDetailsTypeI {\n");
    
    sb.append("    creditCardNumber: ").append(toIndentedString(creditCardNumber)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    extendedPayment: ").append(toIndentedString(extendedPayment)).append("\n");
    sb.append("    fopFreeText: ").append(toIndentedString(fopFreeText)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vendorCode: ").append(toIndentedString(vendorCode)).append("\n");
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

