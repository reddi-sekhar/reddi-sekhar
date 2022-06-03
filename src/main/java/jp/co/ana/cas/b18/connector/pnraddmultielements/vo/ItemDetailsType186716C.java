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
 * ItemDetailsType186716C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ItemDetailsType186716C   {
  @JsonProperty("alphaCheck")
  private String alphaCheck;

  @JsonProperty("cardNumber")
  private Long cardNumber;

  @JsonProperty("certificateNumber")
  private String certificateNumber;

  @JsonProperty("idCardCode")
  private String idCardCode;

  @JsonProperty("idCardType")
  private String idCardType;

  @JsonProperty("zipCode")
  private String zipCode;

  public ItemDetailsType186716C alphaCheck(String alphaCheck) {
    this.alphaCheck = alphaCheck;
    return this;
  }

  /**
   * Get alphaCheck
   * @return alphaCheck
  */
  @ApiModelProperty(value = "")


  public String getAlphaCheck() {
    return alphaCheck;
  }

  public void setAlphaCheck(String alphaCheck) {
    this.alphaCheck = alphaCheck;
  }

  public ItemDetailsType186716C cardNumber(Long cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Get cardNumber
   * @return cardNumber
  */
  @ApiModelProperty(value = "")


  public Long getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(Long cardNumber) {
    this.cardNumber = cardNumber;
  }

  public ItemDetailsType186716C certificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
    return this;
  }

  /**
   * Get certificateNumber
   * @return certificateNumber
  */
  @ApiModelProperty(value = "")


  public String getCertificateNumber() {
    return certificateNumber;
  }

  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  public ItemDetailsType186716C idCardCode(String idCardCode) {
    this.idCardCode = idCardCode;
    return this;
  }

  /**
   * Get idCardCode
   * @return idCardCode
  */
  @ApiModelProperty(value = "")


  public String getIdCardCode() {
    return idCardCode;
  }

  public void setIdCardCode(String idCardCode) {
    this.idCardCode = idCardCode;
  }

  public ItemDetailsType186716C idCardType(String idCardType) {
    this.idCardType = idCardType;
    return this;
  }

  /**
   * Get idCardType
   * @return idCardType
  */
  @ApiModelProperty(value = "")


  public String getIdCardType() {
    return idCardType;
  }

  public void setIdCardType(String idCardType) {
    this.idCardType = idCardType;
  }

  public ItemDetailsType186716C zipCode(String zipCode) {
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
    ItemDetailsType186716C itemDetailsType186716C = (ItemDetailsType186716C) o;
    return Objects.equals(this.alphaCheck, itemDetailsType186716C.alphaCheck) &&
        Objects.equals(this.cardNumber, itemDetailsType186716C.cardNumber) &&
        Objects.equals(this.certificateNumber, itemDetailsType186716C.certificateNumber) &&
        Objects.equals(this.idCardCode, itemDetailsType186716C.idCardCode) &&
        Objects.equals(this.idCardType, itemDetailsType186716C.idCardType) &&
        Objects.equals(this.zipCode, itemDetailsType186716C.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alphaCheck, cardNumber, certificateNumber, idCardCode, idCardType, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetailsType186716C {\n");
    
    sb.append("    alphaCheck: ").append(toIndentedString(alphaCheck)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
    sb.append("    idCardCode: ").append(toIndentedString(idCardCode)).append("\n");
    sb.append("    idCardType: ").append(toIndentedString(idCardType)).append("\n");
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

