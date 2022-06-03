package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AdditionalBusinessSourceInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AgreementIdentificationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AttributeType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.BillableInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CommunicationContactTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ConsumerReferenceInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DeliveryAndCollection;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ErrorWarning;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FormOfPaymentTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType136708S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FrequentTravellerIdentificationCodeType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InteractiveFreeTextTypeI136698S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MiscellaneousRemarksType136700S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NameTypeU136701S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PlaceLocationIdentificationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RateCodeGroup;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInformationTypeI136704S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationTypeI196503S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RulesPoliciesGroup;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredPeriodInformationType207595S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeI136706S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TicketNumberTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TourInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.VehicleInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TypicalCarData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TypicalCarData   {
  @JsonProperty("additionalInfo")
  private FreeTextInformationType136708S additionalInfo;

  @JsonProperty("agentInformation")
  private NameTypeU136701S agentInformation;

  @JsonProperty("attribute")
  private AttributeType attribute;

  @JsonProperty("billingData")
  private BillableInformationTypeU billingData;

  @JsonProperty("bookingSource")
  private AdditionalBusinessSourceInformationType bookingSource;

  @JsonProperty("cancelOrConfirmNbr")
  @Valid
  private List<ReservationControlInformationTypeI196503S> cancelOrConfirmNbr = null;

  @JsonProperty("companyIdentification")
  private CompanyInformationType companyIdentification;

  @JsonProperty("customerEmail")
  private CommunicationContactTypeU customerEmail;

  @JsonProperty("customerInfo")
  private ConsumerReferenceInformationTypeI customerInfo;

  @JsonProperty("deliveryAndCollection")
  @Valid
  private List<DeliveryAndCollection> deliveryAndCollection = null;

  @JsonProperty("electronicVoucherNumber")
  private TicketNumberTypeI electronicVoucherNumber;

  @JsonProperty("errorWarning")
  private ErrorWarning errorWarning;

  @JsonProperty("estimatedDistance")
  @Valid
  private List<QuantityTypeI> estimatedDistance = null;

  @JsonProperty("fflyerNbr")
  private FrequentTravellerIdentificationCodeType fflyerNbr;

  @JsonProperty("inclusiveTour")
  private TourInformationTypeI inclusiveTour;

  @JsonProperty("locationInfo")
  @Valid
  private List<PlaceLocationIdentificationTypeU> locationInfo = null;

  @JsonProperty("marketingInfo")
  @Valid
  private List<InteractiveFreeTextTypeI136698S> marketingInfo = null;

  @JsonProperty("payment")
  private FormOfPaymentTypeI payment;

  @JsonProperty("pickupDropoffTimes")
  private StructuredPeriodInformationType207595S pickupDropoffTimes;

  @JsonProperty("rateCodeGroup")
  private RateCodeGroup rateCodeGroup;

  @JsonProperty("rateInfo")
  @Valid
  private List<TariffInformationTypeI136706S> rateInfo = null;

  @JsonProperty("rulesPoliciesGroup")
  private RulesPoliciesGroup rulesPoliciesGroup;

  @JsonProperty("supleInfo")
  @Valid
  private List<MiscellaneousRemarksType136700S> supleInfo = null;

  @JsonProperty("trackingOpt")
  private AgreementIdentificationTypeU trackingOpt;

  @JsonProperty("vehicleInformation")
  private VehicleInformationType vehicleInformation;

  @JsonProperty("voucherPrintAck")
  private ReferenceInformationTypeI136704S voucherPrintAck;

  public TypicalCarData additionalInfo(FreeTextInformationType136708S additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType136708S getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(FreeTextInformationType136708S additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public TypicalCarData agentInformation(NameTypeU136701S agentInformation) {
    this.agentInformation = agentInformation;
    return this;
  }

  /**
   * Get agentInformation
   * @return agentInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameTypeU136701S getAgentInformation() {
    return agentInformation;
  }

  public void setAgentInformation(NameTypeU136701S agentInformation) {
    this.agentInformation = agentInformation;
  }

  public TypicalCarData attribute(AttributeType attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * Get attribute
   * @return attribute
  */
  @ApiModelProperty(value = "")

  @Valid

  public AttributeType getAttribute() {
    return attribute;
  }

  public void setAttribute(AttributeType attribute) {
    this.attribute = attribute;
  }

  public TypicalCarData billingData(BillableInformationTypeU billingData) {
    this.billingData = billingData;
    return this;
  }

  /**
   * Get billingData
   * @return billingData
  */
  @ApiModelProperty(value = "")

  @Valid

  public BillableInformationTypeU getBillingData() {
    return billingData;
  }

  public void setBillingData(BillableInformationTypeU billingData) {
    this.billingData = billingData;
  }

  public TypicalCarData bookingSource(AdditionalBusinessSourceInformationType bookingSource) {
    this.bookingSource = bookingSource;
    return this;
  }

  /**
   * Get bookingSource
   * @return bookingSource
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdditionalBusinessSourceInformationType getBookingSource() {
    return bookingSource;
  }

  public void setBookingSource(AdditionalBusinessSourceInformationType bookingSource) {
    this.bookingSource = bookingSource;
  }

  public TypicalCarData cancelOrConfirmNbr(List<ReservationControlInformationTypeI196503S> cancelOrConfirmNbr) {
    this.cancelOrConfirmNbr = cancelOrConfirmNbr;
    return this;
  }

  public TypicalCarData addCancelOrConfirmNbrItem(ReservationControlInformationTypeI196503S cancelOrConfirmNbrItem) {
    if (this.cancelOrConfirmNbr == null) {
      this.cancelOrConfirmNbr = new ArrayList<>();
    }
    this.cancelOrConfirmNbr.add(cancelOrConfirmNbrItem);
    return this;
  }

  /**
   * Get cancelOrConfirmNbr
   * @return cancelOrConfirmNbr
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReservationControlInformationTypeI196503S> getCancelOrConfirmNbr() {
    return cancelOrConfirmNbr;
  }

  public void setCancelOrConfirmNbr(List<ReservationControlInformationTypeI196503S> cancelOrConfirmNbr) {
    this.cancelOrConfirmNbr = cancelOrConfirmNbr;
  }

  public TypicalCarData companyIdentification(CompanyInformationType companyIdentification) {
    this.companyIdentification = companyIdentification;
    return this;
  }

  /**
   * Get companyIdentification
   * @return companyIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyInformationType getCompanyIdentification() {
    return companyIdentification;
  }

  public void setCompanyIdentification(CompanyInformationType companyIdentification) {
    this.companyIdentification = companyIdentification;
  }

  public TypicalCarData customerEmail(CommunicationContactTypeU customerEmail) {
    this.customerEmail = customerEmail;
    return this;
  }

  /**
   * Get customerEmail
   * @return customerEmail
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommunicationContactTypeU getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(CommunicationContactTypeU customerEmail) {
    this.customerEmail = customerEmail;
  }

  public TypicalCarData customerInfo(ConsumerReferenceInformationTypeI customerInfo) {
    this.customerInfo = customerInfo;
    return this;
  }

  /**
   * Get customerInfo
   * @return customerInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConsumerReferenceInformationTypeI getCustomerInfo() {
    return customerInfo;
  }

  public void setCustomerInfo(ConsumerReferenceInformationTypeI customerInfo) {
    this.customerInfo = customerInfo;
  }

  public TypicalCarData deliveryAndCollection(List<DeliveryAndCollection> deliveryAndCollection) {
    this.deliveryAndCollection = deliveryAndCollection;
    return this;
  }

  public TypicalCarData addDeliveryAndCollectionItem(DeliveryAndCollection deliveryAndCollectionItem) {
    if (this.deliveryAndCollection == null) {
      this.deliveryAndCollection = new ArrayList<>();
    }
    this.deliveryAndCollection.add(deliveryAndCollectionItem);
    return this;
  }

  /**
   * Get deliveryAndCollection
   * @return deliveryAndCollection
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DeliveryAndCollection> getDeliveryAndCollection() {
    return deliveryAndCollection;
  }

  public void setDeliveryAndCollection(List<DeliveryAndCollection> deliveryAndCollection) {
    this.deliveryAndCollection = deliveryAndCollection;
  }

  public TypicalCarData electronicVoucherNumber(TicketNumberTypeI electronicVoucherNumber) {
    this.electronicVoucherNumber = electronicVoucherNumber;
    return this;
  }

  /**
   * Get electronicVoucherNumber
   * @return electronicVoucherNumber
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketNumberTypeI getElectronicVoucherNumber() {
    return electronicVoucherNumber;
  }

  public void setElectronicVoucherNumber(TicketNumberTypeI electronicVoucherNumber) {
    this.electronicVoucherNumber = electronicVoucherNumber;
  }

  public TypicalCarData errorWarning(ErrorWarning errorWarning) {
    this.errorWarning = errorWarning;
    return this;
  }

  /**
   * Get errorWarning
   * @return errorWarning
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorWarning getErrorWarning() {
    return errorWarning;
  }

  public void setErrorWarning(ErrorWarning errorWarning) {
    this.errorWarning = errorWarning;
  }

  public TypicalCarData estimatedDistance(List<QuantityTypeI> estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
    return this;
  }

  public TypicalCarData addEstimatedDistanceItem(QuantityTypeI estimatedDistanceItem) {
    if (this.estimatedDistance == null) {
      this.estimatedDistance = new ArrayList<>();
    }
    this.estimatedDistance.add(estimatedDistanceItem);
    return this;
  }

  /**
   * Get estimatedDistance
   * @return estimatedDistance
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<QuantityTypeI> getEstimatedDistance() {
    return estimatedDistance;
  }

  public void setEstimatedDistance(List<QuantityTypeI> estimatedDistance) {
    this.estimatedDistance = estimatedDistance;
  }

  public TypicalCarData fflyerNbr(FrequentTravellerIdentificationCodeType fflyerNbr) {
    this.fflyerNbr = fflyerNbr;
    return this;
  }

  /**
   * Get fflyerNbr
   * @return fflyerNbr
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravellerIdentificationCodeType getFflyerNbr() {
    return fflyerNbr;
  }

  public void setFflyerNbr(FrequentTravellerIdentificationCodeType fflyerNbr) {
    this.fflyerNbr = fflyerNbr;
  }

  public TypicalCarData inclusiveTour(TourInformationTypeI inclusiveTour) {
    this.inclusiveTour = inclusiveTour;
    return this;
  }

  /**
   * Get inclusiveTour
   * @return inclusiveTour
  */
  @ApiModelProperty(value = "")

  @Valid

  public TourInformationTypeI getInclusiveTour() {
    return inclusiveTour;
  }

  public void setInclusiveTour(TourInformationTypeI inclusiveTour) {
    this.inclusiveTour = inclusiveTour;
  }

  public TypicalCarData locationInfo(List<PlaceLocationIdentificationTypeU> locationInfo) {
    this.locationInfo = locationInfo;
    return this;
  }

  public TypicalCarData addLocationInfoItem(PlaceLocationIdentificationTypeU locationInfoItem) {
    if (this.locationInfo == null) {
      this.locationInfo = new ArrayList<>();
    }
    this.locationInfo.add(locationInfoItem);
    return this;
  }

  /**
   * Get locationInfo
   * @return locationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PlaceLocationIdentificationTypeU> getLocationInfo() {
    return locationInfo;
  }

  public void setLocationInfo(List<PlaceLocationIdentificationTypeU> locationInfo) {
    this.locationInfo = locationInfo;
  }

  public TypicalCarData marketingInfo(List<InteractiveFreeTextTypeI136698S> marketingInfo) {
    this.marketingInfo = marketingInfo;
    return this;
  }

  public TypicalCarData addMarketingInfoItem(InteractiveFreeTextTypeI136698S marketingInfoItem) {
    if (this.marketingInfo == null) {
      this.marketingInfo = new ArrayList<>();
    }
    this.marketingInfo.add(marketingInfoItem);
    return this;
  }

  /**
   * Get marketingInfo
   * @return marketingInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<InteractiveFreeTextTypeI136698S> getMarketingInfo() {
    return marketingInfo;
  }

  public void setMarketingInfo(List<InteractiveFreeTextTypeI136698S> marketingInfo) {
    this.marketingInfo = marketingInfo;
  }

  public TypicalCarData payment(FormOfPaymentTypeI payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  */
  @ApiModelProperty(value = "")

  @Valid

  public FormOfPaymentTypeI getPayment() {
    return payment;
  }

  public void setPayment(FormOfPaymentTypeI payment) {
    this.payment = payment;
  }

  public TypicalCarData pickupDropoffTimes(StructuredPeriodInformationType207595S pickupDropoffTimes) {
    this.pickupDropoffTimes = pickupDropoffTimes;
    return this;
  }

  /**
   * Get pickupDropoffTimes
   * @return pickupDropoffTimes
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredPeriodInformationType207595S getPickupDropoffTimes() {
    return pickupDropoffTimes;
  }

  public void setPickupDropoffTimes(StructuredPeriodInformationType207595S pickupDropoffTimes) {
    this.pickupDropoffTimes = pickupDropoffTimes;
  }

  public TypicalCarData rateCodeGroup(RateCodeGroup rateCodeGroup) {
    this.rateCodeGroup = rateCodeGroup;
    return this;
  }

  /**
   * Get rateCodeGroup
   * @return rateCodeGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public RateCodeGroup getRateCodeGroup() {
    return rateCodeGroup;
  }

  public void setRateCodeGroup(RateCodeGroup rateCodeGroup) {
    this.rateCodeGroup = rateCodeGroup;
  }

  public TypicalCarData rateInfo(List<TariffInformationTypeI136706S> rateInfo) {
    this.rateInfo = rateInfo;
    return this;
  }

  public TypicalCarData addRateInfoItem(TariffInformationTypeI136706S rateInfoItem) {
    if (this.rateInfo == null) {
      this.rateInfo = new ArrayList<>();
    }
    this.rateInfo.add(rateInfoItem);
    return this;
  }

  /**
   * Get rateInfo
   * @return rateInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TariffInformationTypeI136706S> getRateInfo() {
    return rateInfo;
  }

  public void setRateInfo(List<TariffInformationTypeI136706S> rateInfo) {
    this.rateInfo = rateInfo;
  }

  public TypicalCarData rulesPoliciesGroup(RulesPoliciesGroup rulesPoliciesGroup) {
    this.rulesPoliciesGroup = rulesPoliciesGroup;
    return this;
  }

  /**
   * Get rulesPoliciesGroup
   * @return rulesPoliciesGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public RulesPoliciesGroup getRulesPoliciesGroup() {
    return rulesPoliciesGroup;
  }

  public void setRulesPoliciesGroup(RulesPoliciesGroup rulesPoliciesGroup) {
    this.rulesPoliciesGroup = rulesPoliciesGroup;
  }

  public TypicalCarData supleInfo(List<MiscellaneousRemarksType136700S> supleInfo) {
    this.supleInfo = supleInfo;
    return this;
  }

  public TypicalCarData addSupleInfoItem(MiscellaneousRemarksType136700S supleInfoItem) {
    if (this.supleInfo == null) {
      this.supleInfo = new ArrayList<>();
    }
    this.supleInfo.add(supleInfoItem);
    return this;
  }

  /**
   * Get supleInfo
   * @return supleInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MiscellaneousRemarksType136700S> getSupleInfo() {
    return supleInfo;
  }

  public void setSupleInfo(List<MiscellaneousRemarksType136700S> supleInfo) {
    this.supleInfo = supleInfo;
  }

  public TypicalCarData trackingOpt(AgreementIdentificationTypeU trackingOpt) {
    this.trackingOpt = trackingOpt;
    return this;
  }

  /**
   * Get trackingOpt
   * @return trackingOpt
  */
  @ApiModelProperty(value = "")

  @Valid

  public AgreementIdentificationTypeU getTrackingOpt() {
    return trackingOpt;
  }

  public void setTrackingOpt(AgreementIdentificationTypeU trackingOpt) {
    this.trackingOpt = trackingOpt;
  }

  public TypicalCarData vehicleInformation(VehicleInformationType vehicleInformation) {
    this.vehicleInformation = vehicleInformation;
    return this;
  }

  /**
   * Get vehicleInformation
   * @return vehicleInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public VehicleInformationType getVehicleInformation() {
    return vehicleInformation;
  }

  public void setVehicleInformation(VehicleInformationType vehicleInformation) {
    this.vehicleInformation = vehicleInformation;
  }

  public TypicalCarData voucherPrintAck(ReferenceInformationTypeI136704S voucherPrintAck) {
    this.voucherPrintAck = voucherPrintAck;
    return this;
  }

  /**
   * Get voucherPrintAck
   * @return voucherPrintAck
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInformationTypeI136704S getVoucherPrintAck() {
    return voucherPrintAck;
  }

  public void setVoucherPrintAck(ReferenceInformationTypeI136704S voucherPrintAck) {
    this.voucherPrintAck = voucherPrintAck;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypicalCarData typicalCarData = (TypicalCarData) o;
    return Objects.equals(this.additionalInfo, typicalCarData.additionalInfo) &&
        Objects.equals(this.agentInformation, typicalCarData.agentInformation) &&
        Objects.equals(this.attribute, typicalCarData.attribute) &&
        Objects.equals(this.billingData, typicalCarData.billingData) &&
        Objects.equals(this.bookingSource, typicalCarData.bookingSource) &&
        Objects.equals(this.cancelOrConfirmNbr, typicalCarData.cancelOrConfirmNbr) &&
        Objects.equals(this.companyIdentification, typicalCarData.companyIdentification) &&
        Objects.equals(this.customerEmail, typicalCarData.customerEmail) &&
        Objects.equals(this.customerInfo, typicalCarData.customerInfo) &&
        Objects.equals(this.deliveryAndCollection, typicalCarData.deliveryAndCollection) &&
        Objects.equals(this.electronicVoucherNumber, typicalCarData.electronicVoucherNumber) &&
        Objects.equals(this.errorWarning, typicalCarData.errorWarning) &&
        Objects.equals(this.estimatedDistance, typicalCarData.estimatedDistance) &&
        Objects.equals(this.fflyerNbr, typicalCarData.fflyerNbr) &&
        Objects.equals(this.inclusiveTour, typicalCarData.inclusiveTour) &&
        Objects.equals(this.locationInfo, typicalCarData.locationInfo) &&
        Objects.equals(this.marketingInfo, typicalCarData.marketingInfo) &&
        Objects.equals(this.payment, typicalCarData.payment) &&
        Objects.equals(this.pickupDropoffTimes, typicalCarData.pickupDropoffTimes) &&
        Objects.equals(this.rateCodeGroup, typicalCarData.rateCodeGroup) &&
        Objects.equals(this.rateInfo, typicalCarData.rateInfo) &&
        Objects.equals(this.rulesPoliciesGroup, typicalCarData.rulesPoliciesGroup) &&
        Objects.equals(this.supleInfo, typicalCarData.supleInfo) &&
        Objects.equals(this.trackingOpt, typicalCarData.trackingOpt) &&
        Objects.equals(this.vehicleInformation, typicalCarData.vehicleInformation) &&
        Objects.equals(this.voucherPrintAck, typicalCarData.voucherPrintAck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, agentInformation, attribute, billingData, bookingSource, cancelOrConfirmNbr, companyIdentification, customerEmail, customerInfo, deliveryAndCollection, electronicVoucherNumber, errorWarning, estimatedDistance, fflyerNbr, inclusiveTour, locationInfo, marketingInfo, payment, pickupDropoffTimes, rateCodeGroup, rateInfo, rulesPoliciesGroup, supleInfo, trackingOpt, vehicleInformation, voucherPrintAck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypicalCarData {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    agentInformation: ").append(toIndentedString(agentInformation)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    billingData: ").append(toIndentedString(billingData)).append("\n");
    sb.append("    bookingSource: ").append(toIndentedString(bookingSource)).append("\n");
    sb.append("    cancelOrConfirmNbr: ").append(toIndentedString(cancelOrConfirmNbr)).append("\n");
    sb.append("    companyIdentification: ").append(toIndentedString(companyIdentification)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
    sb.append("    deliveryAndCollection: ").append(toIndentedString(deliveryAndCollection)).append("\n");
    sb.append("    electronicVoucherNumber: ").append(toIndentedString(electronicVoucherNumber)).append("\n");
    sb.append("    errorWarning: ").append(toIndentedString(errorWarning)).append("\n");
    sb.append("    estimatedDistance: ").append(toIndentedString(estimatedDistance)).append("\n");
    sb.append("    fflyerNbr: ").append(toIndentedString(fflyerNbr)).append("\n");
    sb.append("    inclusiveTour: ").append(toIndentedString(inclusiveTour)).append("\n");
    sb.append("    locationInfo: ").append(toIndentedString(locationInfo)).append("\n");
    sb.append("    marketingInfo: ").append(toIndentedString(marketingInfo)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    pickupDropoffTimes: ").append(toIndentedString(pickupDropoffTimes)).append("\n");
    sb.append("    rateCodeGroup: ").append(toIndentedString(rateCodeGroup)).append("\n");
    sb.append("    rateInfo: ").append(toIndentedString(rateInfo)).append("\n");
    sb.append("    rulesPoliciesGroup: ").append(toIndentedString(rulesPoliciesGroup)).append("\n");
    sb.append("    supleInfo: ").append(toIndentedString(supleInfo)).append("\n");
    sb.append("    trackingOpt: ").append(toIndentedString(trackingOpt)).append("\n");
    sb.append("    vehicleInformation: ").append(toIndentedString(vehicleInformation)).append("\n");
    sb.append("    voucherPrintAck: ").append(toIndentedString(voucherPrintAck)).append("\n");
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

