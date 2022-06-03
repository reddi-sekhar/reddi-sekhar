package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AddressType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CommunicationContactType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DeviceControlDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PhoneAndEmailAddressType94565S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType94566S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusType94568S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType207582S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SystemDetailsInfoType94569S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerInformationType94570S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FraudScreeningGroupType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FraudScreeningGroupType   {
  @JsonProperty("billingAddress")
  private AddressType billingAddress;

  @JsonProperty("formOfIdDetails")
  @Valid
  private List<ReferenceInfoType94566S> formOfIdDetails = null;

  @JsonProperty("fraudScreening")
  private StatusType94568S fraudScreening;

  @JsonProperty("ipAdress")
  private DeviceControlDetailsType ipAdress;

  @JsonProperty("merchantURL")
  private CommunicationContactType merchantURL;

  @JsonProperty("payerDateOfBirth")
  private StructuredDateTimeInformationType207582S payerDateOfBirth;

  @JsonProperty("payerName")
  private TravellerInformationType94570S payerName;

  @JsonProperty("payerPhoneOrEmail")
  @Valid
  private List<PhoneAndEmailAddressType94565S> payerPhoneOrEmail = null;

  @JsonProperty("shopperSession")
  private SystemDetailsInfoType94569S shopperSession;

  public FraudScreeningGroupType billingAddress(AddressType billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Get billingAddress
   * @return billingAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public AddressType getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(AddressType billingAddress) {
    this.billingAddress = billingAddress;
  }

  public FraudScreeningGroupType formOfIdDetails(List<ReferenceInfoType94566S> formOfIdDetails) {
    this.formOfIdDetails = formOfIdDetails;
    return this;
  }

  public FraudScreeningGroupType addFormOfIdDetailsItem(ReferenceInfoType94566S formOfIdDetailsItem) {
    if (this.formOfIdDetails == null) {
      this.formOfIdDetails = new ArrayList<>();
    }
    this.formOfIdDetails.add(formOfIdDetailsItem);
    return this;
  }

  /**
   * Get formOfIdDetails
   * @return formOfIdDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReferenceInfoType94566S> getFormOfIdDetails() {
    return formOfIdDetails;
  }

  public void setFormOfIdDetails(List<ReferenceInfoType94566S> formOfIdDetails) {
    this.formOfIdDetails = formOfIdDetails;
  }

  public FraudScreeningGroupType fraudScreening(StatusType94568S fraudScreening) {
    this.fraudScreening = fraudScreening;
    return this;
  }

  /**
   * Get fraudScreening
   * @return fraudScreening
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusType94568S getFraudScreening() {
    return fraudScreening;
  }

  public void setFraudScreening(StatusType94568S fraudScreening) {
    this.fraudScreening = fraudScreening;
  }

  public FraudScreeningGroupType ipAdress(DeviceControlDetailsType ipAdress) {
    this.ipAdress = ipAdress;
    return this;
  }

  /**
   * Get ipAdress
   * @return ipAdress
  */
  @ApiModelProperty(value = "")

  @Valid

  public DeviceControlDetailsType getIpAdress() {
    return ipAdress;
  }

  public void setIpAdress(DeviceControlDetailsType ipAdress) {
    this.ipAdress = ipAdress;
  }

  public FraudScreeningGroupType merchantURL(CommunicationContactType merchantURL) {
    this.merchantURL = merchantURL;
    return this;
  }

  /**
   * Get merchantURL
   * @return merchantURL
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommunicationContactType getMerchantURL() {
    return merchantURL;
  }

  public void setMerchantURL(CommunicationContactType merchantURL) {
    this.merchantURL = merchantURL;
  }

  public FraudScreeningGroupType payerDateOfBirth(StructuredDateTimeInformationType207582S payerDateOfBirth) {
    this.payerDateOfBirth = payerDateOfBirth;
    return this;
  }

  /**
   * Get payerDateOfBirth
   * @return payerDateOfBirth
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeInformationType207582S getPayerDateOfBirth() {
    return payerDateOfBirth;
  }

  public void setPayerDateOfBirth(StructuredDateTimeInformationType207582S payerDateOfBirth) {
    this.payerDateOfBirth = payerDateOfBirth;
  }

  public FraudScreeningGroupType payerName(TravellerInformationType94570S payerName) {
    this.payerName = payerName;
    return this;
  }

  /**
   * Get payerName
   * @return payerName
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerInformationType94570S getPayerName() {
    return payerName;
  }

  public void setPayerName(TravellerInformationType94570S payerName) {
    this.payerName = payerName;
  }

  public FraudScreeningGroupType payerPhoneOrEmail(List<PhoneAndEmailAddressType94565S> payerPhoneOrEmail) {
    this.payerPhoneOrEmail = payerPhoneOrEmail;
    return this;
  }

  public FraudScreeningGroupType addPayerPhoneOrEmailItem(PhoneAndEmailAddressType94565S payerPhoneOrEmailItem) {
    if (this.payerPhoneOrEmail == null) {
      this.payerPhoneOrEmail = new ArrayList<>();
    }
    this.payerPhoneOrEmail.add(payerPhoneOrEmailItem);
    return this;
  }

  /**
   * Get payerPhoneOrEmail
   * @return payerPhoneOrEmail
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PhoneAndEmailAddressType94565S> getPayerPhoneOrEmail() {
    return payerPhoneOrEmail;
  }

  public void setPayerPhoneOrEmail(List<PhoneAndEmailAddressType94565S> payerPhoneOrEmail) {
    this.payerPhoneOrEmail = payerPhoneOrEmail;
  }

  public FraudScreeningGroupType shopperSession(SystemDetailsInfoType94569S shopperSession) {
    this.shopperSession = shopperSession;
    return this;
  }

  /**
   * Get shopperSession
   * @return shopperSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public SystemDetailsInfoType94569S getShopperSession() {
    return shopperSession;
  }

  public void setShopperSession(SystemDetailsInfoType94569S shopperSession) {
    this.shopperSession = shopperSession;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudScreeningGroupType fraudScreeningGroupType = (FraudScreeningGroupType) o;
    return Objects.equals(this.billingAddress, fraudScreeningGroupType.billingAddress) &&
        Objects.equals(this.formOfIdDetails, fraudScreeningGroupType.formOfIdDetails) &&
        Objects.equals(this.fraudScreening, fraudScreeningGroupType.fraudScreening) &&
        Objects.equals(this.ipAdress, fraudScreeningGroupType.ipAdress) &&
        Objects.equals(this.merchantURL, fraudScreeningGroupType.merchantURL) &&
        Objects.equals(this.payerDateOfBirth, fraudScreeningGroupType.payerDateOfBirth) &&
        Objects.equals(this.payerName, fraudScreeningGroupType.payerName) &&
        Objects.equals(this.payerPhoneOrEmail, fraudScreeningGroupType.payerPhoneOrEmail) &&
        Objects.equals(this.shopperSession, fraudScreeningGroupType.shopperSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, formOfIdDetails, fraudScreening, ipAdress, merchantURL, payerDateOfBirth, payerName, payerPhoneOrEmail, shopperSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudScreeningGroupType {\n");
    
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    formOfIdDetails: ").append(toIndentedString(formOfIdDetails)).append("\n");
    sb.append("    fraudScreening: ").append(toIndentedString(fraudScreening)).append("\n");
    sb.append("    ipAdress: ").append(toIndentedString(ipAdress)).append("\n");
    sb.append("    merchantURL: ").append(toIndentedString(merchantURL)).append("\n");
    sb.append("    payerDateOfBirth: ").append(toIndentedString(payerDateOfBirth)).append("\n");
    sb.append("    payerName: ").append(toIndentedString(payerName)).append("\n");
    sb.append("    payerPhoneOrEmail: ").append(toIndentedString(payerPhoneOrEmail)).append("\n");
    sb.append("    shopperSession: ").append(toIndentedString(shopperSession)).append("\n");
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

