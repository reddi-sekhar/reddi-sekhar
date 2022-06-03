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
 * CreditCardInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CreditCardInformationType   {
  @JsonProperty("cardCountryOfIssuance")
  private String cardCountryOfIssuance;

  @JsonProperty("cardNumber")
  private String cardNumber;

  @JsonProperty("ccHolderName")
  private String ccHolderName;

  @JsonProperty("endDate")
  private String endDate;

  @JsonProperty("expiryDate")
  private String expiryDate;

  @JsonProperty("issueNumber")
  private Long issueNumber;

  @JsonProperty("issuingBankLongName")
  private String issuingBankLongName;

  @JsonProperty("issuingBankName")
  private String issuingBankName;

  @JsonProperty("pinCode")
  private String pinCode;

  @JsonProperty("rawTrackData")
  private String rawTrackData;

  @JsonProperty("securityId")
  private String securityId;

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("track1")
  private String track1;

  @JsonProperty("track2")
  private String track2;

  @JsonProperty("track3")
  private String track3;

  @JsonProperty("vendorCode")
  private String vendorCode;

  @JsonProperty("vendorCodeSubType")
  private String vendorCodeSubType;

  public CreditCardInformationType cardCountryOfIssuance(String cardCountryOfIssuance) {
    this.cardCountryOfIssuance = cardCountryOfIssuance;
    return this;
  }

  /**
   * Get cardCountryOfIssuance
   * @return cardCountryOfIssuance
  */
  @ApiModelProperty(value = "")


  public String getCardCountryOfIssuance() {
    return cardCountryOfIssuance;
  }

  public void setCardCountryOfIssuance(String cardCountryOfIssuance) {
    this.cardCountryOfIssuance = cardCountryOfIssuance;
  }

  public CreditCardInformationType cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Get cardNumber
   * @return cardNumber
  */
  @ApiModelProperty(value = "")


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public CreditCardInformationType ccHolderName(String ccHolderName) {
    this.ccHolderName = ccHolderName;
    return this;
  }

  /**
   * Get ccHolderName
   * @return ccHolderName
  */
  @ApiModelProperty(value = "")


  public String getCcHolderName() {
    return ccHolderName;
  }

  public void setCcHolderName(String ccHolderName) {
    this.ccHolderName = ccHolderName;
  }

  public CreditCardInformationType endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @ApiModelProperty(value = "")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public CreditCardInformationType expiryDate(String expiryDate) {
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

  public CreditCardInformationType issueNumber(Long issueNumber) {
    this.issueNumber = issueNumber;
    return this;
  }

  /**
   * Get issueNumber
   * @return issueNumber
  */
  @ApiModelProperty(value = "")


  public Long getIssueNumber() {
    return issueNumber;
  }

  public void setIssueNumber(Long issueNumber) {
    this.issueNumber = issueNumber;
  }

  public CreditCardInformationType issuingBankLongName(String issuingBankLongName) {
    this.issuingBankLongName = issuingBankLongName;
    return this;
  }

  /**
   * Get issuingBankLongName
   * @return issuingBankLongName
  */
  @ApiModelProperty(value = "")


  public String getIssuingBankLongName() {
    return issuingBankLongName;
  }

  public void setIssuingBankLongName(String issuingBankLongName) {
    this.issuingBankLongName = issuingBankLongName;
  }

  public CreditCardInformationType issuingBankName(String issuingBankName) {
    this.issuingBankName = issuingBankName;
    return this;
  }

  /**
   * Get issuingBankName
   * @return issuingBankName
  */
  @ApiModelProperty(value = "")


  public String getIssuingBankName() {
    return issuingBankName;
  }

  public void setIssuingBankName(String issuingBankName) {
    this.issuingBankName = issuingBankName;
  }

  public CreditCardInformationType pinCode(String pinCode) {
    this.pinCode = pinCode;
    return this;
  }

  /**
   * Get pinCode
   * @return pinCode
  */
  @ApiModelProperty(value = "")


  public String getPinCode() {
    return pinCode;
  }

  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }

  public CreditCardInformationType rawTrackData(String rawTrackData) {
    this.rawTrackData = rawTrackData;
    return this;
  }

  /**
   * Get rawTrackData
   * @return rawTrackData
  */
  @ApiModelProperty(value = "")


  public String getRawTrackData() {
    return rawTrackData;
  }

  public void setRawTrackData(String rawTrackData) {
    this.rawTrackData = rawTrackData;
  }

  public CreditCardInformationType securityId(String securityId) {
    this.securityId = securityId;
    return this;
  }

  /**
   * Get securityId
   * @return securityId
  */
  @ApiModelProperty(value = "")


  public String getSecurityId() {
    return securityId;
  }

  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }

  public CreditCardInformationType startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @ApiModelProperty(value = "")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public CreditCardInformationType track1(String track1) {
    this.track1 = track1;
    return this;
  }

  /**
   * Get track1
   * @return track1
  */
  @ApiModelProperty(value = "")


  public String getTrack1() {
    return track1;
  }

  public void setTrack1(String track1) {
    this.track1 = track1;
  }

  public CreditCardInformationType track2(String track2) {
    this.track2 = track2;
    return this;
  }

  /**
   * Get track2
   * @return track2
  */
  @ApiModelProperty(value = "")


  public String getTrack2() {
    return track2;
  }

  public void setTrack2(String track2) {
    this.track2 = track2;
  }

  public CreditCardInformationType track3(String track3) {
    this.track3 = track3;
    return this;
  }

  /**
   * Get track3
   * @return track3
  */
  @ApiModelProperty(value = "")


  public String getTrack3() {
    return track3;
  }

  public void setTrack3(String track3) {
    this.track3 = track3;
  }

  public CreditCardInformationType vendorCode(String vendorCode) {
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

  public CreditCardInformationType vendorCodeSubType(String vendorCodeSubType) {
    this.vendorCodeSubType = vendorCodeSubType;
    return this;
  }

  /**
   * Get vendorCodeSubType
   * @return vendorCodeSubType
  */
  @ApiModelProperty(value = "")


  public String getVendorCodeSubType() {
    return vendorCodeSubType;
  }

  public void setVendorCodeSubType(String vendorCodeSubType) {
    this.vendorCodeSubType = vendorCodeSubType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardInformationType creditCardInformationType = (CreditCardInformationType) o;
    return Objects.equals(this.cardCountryOfIssuance, creditCardInformationType.cardCountryOfIssuance) &&
        Objects.equals(this.cardNumber, creditCardInformationType.cardNumber) &&
        Objects.equals(this.ccHolderName, creditCardInformationType.ccHolderName) &&
        Objects.equals(this.endDate, creditCardInformationType.endDate) &&
        Objects.equals(this.expiryDate, creditCardInformationType.expiryDate) &&
        Objects.equals(this.issueNumber, creditCardInformationType.issueNumber) &&
        Objects.equals(this.issuingBankLongName, creditCardInformationType.issuingBankLongName) &&
        Objects.equals(this.issuingBankName, creditCardInformationType.issuingBankName) &&
        Objects.equals(this.pinCode, creditCardInformationType.pinCode) &&
        Objects.equals(this.rawTrackData, creditCardInformationType.rawTrackData) &&
        Objects.equals(this.securityId, creditCardInformationType.securityId) &&
        Objects.equals(this.startDate, creditCardInformationType.startDate) &&
        Objects.equals(this.track1, creditCardInformationType.track1) &&
        Objects.equals(this.track2, creditCardInformationType.track2) &&
        Objects.equals(this.track3, creditCardInformationType.track3) &&
        Objects.equals(this.vendorCode, creditCardInformationType.vendorCode) &&
        Objects.equals(this.vendorCodeSubType, creditCardInformationType.vendorCodeSubType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardCountryOfIssuance, cardNumber, ccHolderName, endDate, expiryDate, issueNumber, issuingBankLongName, issuingBankName, pinCode, rawTrackData, securityId, startDate, track1, track2, track3, vendorCode, vendorCodeSubType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardInformationType {\n");
    
    sb.append("    cardCountryOfIssuance: ").append(toIndentedString(cardCountryOfIssuance)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    ccHolderName: ").append(toIndentedString(ccHolderName)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
    sb.append("    issuingBankLongName: ").append(toIndentedString(issuingBankLongName)).append("\n");
    sb.append("    issuingBankName: ").append(toIndentedString(issuingBankName)).append("\n");
    sb.append("    pinCode: ").append(toIndentedString(pinCode)).append("\n");
    sb.append("    rawTrackData: ").append(toIndentedString(rawTrackData)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    track1: ").append(toIndentedString(track1)).append("\n");
    sb.append("    track2: ").append(toIndentedString(track2)).append("\n");
    sb.append("    track3: ").append(toIndentedString(track3)).append("\n");
    sb.append("    vendorCode: ").append(toIndentedString(vendorCode)).append("\n");
    sb.append("    vendorCodeSubType: ").append(toIndentedString(vendorCodeSubType)).append("\n");
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

