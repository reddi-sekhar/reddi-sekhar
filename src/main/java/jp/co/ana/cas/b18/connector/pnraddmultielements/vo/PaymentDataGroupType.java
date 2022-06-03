package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AttributeType94553S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyInformationType94554S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FraudScreeningGroupType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType79018S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FrequencyTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemReferencesAndVersionsType94556S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationType94557S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityType94558S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType206504S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TerminalIdentificationDescriptionType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentDataGroupType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PaymentDataGroupType   {
  @JsonProperty("distributionChannelInformation")
  private TerminalIdentificationDescriptionType distributionChannelInformation;

  @JsonProperty("expirationPeriod")
  private QuantityType94558S expirationPeriod;

  @JsonProperty("extendedPaymentInfo")
  private FrequencyTypeU extendedPaymentInfo;

  @JsonProperty("fraudScreeningData")
  private FraudScreeningGroupType fraudScreeningData;

  @JsonProperty("merchantInformation")
  private CompanyInformationType94554S merchantInformation;

  @JsonProperty("monetaryInformation")
  @Valid
  private List<MonetaryInformationType94557S> monetaryInformation = null;

  @JsonProperty("paymentDataMap")
  @Valid
  private List<AttributeType94553S> paymentDataMap = null;

  @JsonProperty("paymentId")
  @Valid
  private List<ItemReferencesAndVersionsType94556S> paymentId = null;

  @JsonProperty("purchaseDescription")
  private FreeTextInformationType79018S purchaseDescription;

  @JsonProperty("transactionDateTime")
  private StructuredDateTimeInformationType206504S transactionDateTime;

  public PaymentDataGroupType distributionChannelInformation(TerminalIdentificationDescriptionType distributionChannelInformation) {
    this.distributionChannelInformation = distributionChannelInformation;
    return this;
  }

  /**
   * Get distributionChannelInformation
   * @return distributionChannelInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public TerminalIdentificationDescriptionType getDistributionChannelInformation() {
    return distributionChannelInformation;
  }

  public void setDistributionChannelInformation(TerminalIdentificationDescriptionType distributionChannelInformation) {
    this.distributionChannelInformation = distributionChannelInformation;
  }

  public PaymentDataGroupType expirationPeriod(QuantityType94558S expirationPeriod) {
    this.expirationPeriod = expirationPeriod;
    return this;
  }

  /**
   * Get expirationPeriod
   * @return expirationPeriod
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityType94558S getExpirationPeriod() {
    return expirationPeriod;
  }

  public void setExpirationPeriod(QuantityType94558S expirationPeriod) {
    this.expirationPeriod = expirationPeriod;
  }

  public PaymentDataGroupType extendedPaymentInfo(FrequencyTypeU extendedPaymentInfo) {
    this.extendedPaymentInfo = extendedPaymentInfo;
    return this;
  }

  /**
   * Get extendedPaymentInfo
   * @return extendedPaymentInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequencyTypeU getExtendedPaymentInfo() {
    return extendedPaymentInfo;
  }

  public void setExtendedPaymentInfo(FrequencyTypeU extendedPaymentInfo) {
    this.extendedPaymentInfo = extendedPaymentInfo;
  }

  public PaymentDataGroupType fraudScreeningData(FraudScreeningGroupType fraudScreeningData) {
    this.fraudScreeningData = fraudScreeningData;
    return this;
  }

  /**
   * Get fraudScreeningData
   * @return fraudScreeningData
  */
  @ApiModelProperty(value = "")

  @Valid

  public FraudScreeningGroupType getFraudScreeningData() {
    return fraudScreeningData;
  }

  public void setFraudScreeningData(FraudScreeningGroupType fraudScreeningData) {
    this.fraudScreeningData = fraudScreeningData;
  }

  public PaymentDataGroupType merchantInformation(CompanyInformationType94554S merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

  /**
   * Get merchantInformation
   * @return merchantInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyInformationType94554S getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(CompanyInformationType94554S merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public PaymentDataGroupType monetaryInformation(List<MonetaryInformationType94557S> monetaryInformation) {
    this.monetaryInformation = monetaryInformation;
    return this;
  }

  public PaymentDataGroupType addMonetaryInformationItem(MonetaryInformationType94557S monetaryInformationItem) {
    if (this.monetaryInformation == null) {
      this.monetaryInformation = new ArrayList<>();
    }
    this.monetaryInformation.add(monetaryInformationItem);
    return this;
  }

  /**
   * Get monetaryInformation
   * @return monetaryInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MonetaryInformationType94557S> getMonetaryInformation() {
    return monetaryInformation;
  }

  public void setMonetaryInformation(List<MonetaryInformationType94557S> monetaryInformation) {
    this.monetaryInformation = monetaryInformation;
  }

  public PaymentDataGroupType paymentDataMap(List<AttributeType94553S> paymentDataMap) {
    this.paymentDataMap = paymentDataMap;
    return this;
  }

  public PaymentDataGroupType addPaymentDataMapItem(AttributeType94553S paymentDataMapItem) {
    if (this.paymentDataMap == null) {
      this.paymentDataMap = new ArrayList<>();
    }
    this.paymentDataMap.add(paymentDataMapItem);
    return this;
  }

  /**
   * Get paymentDataMap
   * @return paymentDataMap
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AttributeType94553S> getPaymentDataMap() {
    return paymentDataMap;
  }

  public void setPaymentDataMap(List<AttributeType94553S> paymentDataMap) {
    this.paymentDataMap = paymentDataMap;
  }

  public PaymentDataGroupType paymentId(List<ItemReferencesAndVersionsType94556S> paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  public PaymentDataGroupType addPaymentIdItem(ItemReferencesAndVersionsType94556S paymentIdItem) {
    if (this.paymentId == null) {
      this.paymentId = new ArrayList<>();
    }
    this.paymentId.add(paymentIdItem);
    return this;
  }

  /**
   * Get paymentId
   * @return paymentId
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ItemReferencesAndVersionsType94556S> getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(List<ItemReferencesAndVersionsType94556S> paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentDataGroupType purchaseDescription(FreeTextInformationType79018S purchaseDescription) {
    this.purchaseDescription = purchaseDescription;
    return this;
  }

  /**
   * Get purchaseDescription
   * @return purchaseDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType79018S getPurchaseDescription() {
    return purchaseDescription;
  }

  public void setPurchaseDescription(FreeTextInformationType79018S purchaseDescription) {
    this.purchaseDescription = purchaseDescription;
  }

  public PaymentDataGroupType transactionDateTime(StructuredDateTimeInformationType206504S transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
    return this;
  }

  /**
   * Get transactionDateTime
   * @return transactionDateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeInformationType206504S getTransactionDateTime() {
    return transactionDateTime;
  }

  public void setTransactionDateTime(StructuredDateTimeInformationType206504S transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDataGroupType paymentDataGroupType = (PaymentDataGroupType) o;
    return Objects.equals(this.distributionChannelInformation, paymentDataGroupType.distributionChannelInformation) &&
        Objects.equals(this.expirationPeriod, paymentDataGroupType.expirationPeriod) &&
        Objects.equals(this.extendedPaymentInfo, paymentDataGroupType.extendedPaymentInfo) &&
        Objects.equals(this.fraudScreeningData, paymentDataGroupType.fraudScreeningData) &&
        Objects.equals(this.merchantInformation, paymentDataGroupType.merchantInformation) &&
        Objects.equals(this.monetaryInformation, paymentDataGroupType.monetaryInformation) &&
        Objects.equals(this.paymentDataMap, paymentDataGroupType.paymentDataMap) &&
        Objects.equals(this.paymentId, paymentDataGroupType.paymentId) &&
        Objects.equals(this.purchaseDescription, paymentDataGroupType.purchaseDescription) &&
        Objects.equals(this.transactionDateTime, paymentDataGroupType.transactionDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributionChannelInformation, expirationPeriod, extendedPaymentInfo, fraudScreeningData, merchantInformation, monetaryInformation, paymentDataMap, paymentId, purchaseDescription, transactionDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDataGroupType {\n");
    
    sb.append("    distributionChannelInformation: ").append(toIndentedString(distributionChannelInformation)).append("\n");
    sb.append("    expirationPeriod: ").append(toIndentedString(expirationPeriod)).append("\n");
    sb.append("    extendedPaymentInfo: ").append(toIndentedString(extendedPaymentInfo)).append("\n");
    sb.append("    fraudScreeningData: ").append(toIndentedString(fraudScreeningData)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    monetaryInformation: ").append(toIndentedString(monetaryInformation)).append("\n");
    sb.append("    paymentDataMap: ").append(toIndentedString(paymentDataMap)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    purchaseDescription: ").append(toIndentedString(purchaseDescription)).append("\n");
    sb.append("    transactionDateTime: ").append(toIndentedString(transactionDateTime)).append("\n");
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

