package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AccountingInformationElementType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CityPair;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DateAndTimeInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ElementManagementSegmentType226873S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ErrorGroupType223552G;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ExtendedOwnershipSecurityDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ExtendedRemarkType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FOPRepresentationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FrequentFlyerInformationGroupType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.IndividualPnrSecurityInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LongFreeTextType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.McoRecord;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MiscellaneousRemarksType211S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI1689S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OptionElementType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.POSGroupType150634G;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PricingOrTicketingSubsequentType195222S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RailSeatDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RailSeatPreferencesType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType227787S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferencedRecord;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SSRPackInformation;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SeatPaxInfo;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecialRequirementsDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusTypeI217964S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredAddressType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TicketElementType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TotalPriceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataElementsIndiv
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DataElementsIndiv   {
  @JsonProperty("accessLevel")
  @Valid
  private List<ExtendedOwnershipSecurityDetailsType> accessLevel = null;

  @JsonProperty("accounting")
  private AccountingInformationElementType accounting;

  @JsonProperty("cityPair")
  private CityPair cityPair;

  @JsonProperty("dateAndTimeInformation")
  private DateAndTimeInformationTypeI dateAndTimeInformation;

  @JsonProperty("elementErrorInformation")
  private ErrorGroupType223552G elementErrorInformation;

  @JsonProperty("elementManagementData")
  private ElementManagementSegmentType226873S elementManagementData;

  @JsonProperty("elementsIndicators")
  @Valid
  private List<StatusTypeI217964S> elementsIndicators = null;

  @JsonProperty("eltPosDetails")
  private POSGroupType150634G eltPosDetails;

  @JsonProperty("extendedRemark")
  private ExtendedRemarkType extendedRemark;

  @JsonProperty("frequentFlyerInformationGroup")
  private FrequentFlyerInformationGroupType frequentFlyerInformationGroup;

  @JsonProperty("mcoRecord")
  private McoRecord mcoRecord;

  @JsonProperty("miscellaneousRemarks")
  private MiscellaneousRemarksType211S miscellaneousRemarks;

  @JsonProperty("monetaryInformation")
  @Valid
  private List<MonetaryInformationTypeI1689S> monetaryInformation = null;

  @JsonProperty("optionElement")
  private OptionElementType optionElement;

  @JsonProperty("otherDataFreetext")
  @Valid
  private List<LongFreeTextType> otherDataFreetext = null;

  @JsonProperty("pnrSecurity")
  private IndividualPnrSecurityInformationType pnrSecurity;

  @JsonProperty("railSeatDetails")
  @Valid
  private List<RailSeatDetails> railSeatDetails = null;

  @JsonProperty("railSeatPreferences")
  private RailSeatPreferencesType railSeatPreferences;

  @JsonProperty("reasonForIssuanceCode")
  private PricingOrTicketingSubsequentType195222S reasonForIssuanceCode;

  @JsonProperty("referenceForDataElement")
  private ReferenceInfoType227787S referenceForDataElement;

  @JsonProperty("referencedRecord")
  private ReferencedRecord referencedRecord;

  @JsonProperty("seatPaxInfo")
  @Valid
  private List<SeatPaxInfo> seatPaxInfo = null;

  @JsonProperty("serviceRequest")
  private SpecialRequirementsDetailsTypeI serviceRequest;

  @JsonProperty("ssrPackageInformation")
  @Valid
  private List<SSRPackInformation> ssrPackageInformation = null;

  @JsonProperty("structuredAddress")
  private StructuredAddressType structuredAddress;

  @JsonProperty("structuredFop")
  @Valid
  private List<FOPRepresentationType> structuredFop = null;

  @JsonProperty("ticketElement")
  private TicketElementType ticketElement;

  @JsonProperty("totalPrice")
  private TotalPriceType totalPrice;

  public DataElementsIndiv accessLevel(List<ExtendedOwnershipSecurityDetailsType> accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  public DataElementsIndiv addAccessLevelItem(ExtendedOwnershipSecurityDetailsType accessLevelItem) {
    if (this.accessLevel == null) {
      this.accessLevel = new ArrayList<>();
    }
    this.accessLevel.add(accessLevelItem);
    return this;
  }

  /**
   * Get accessLevel
   * @return accessLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ExtendedOwnershipSecurityDetailsType> getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(List<ExtendedOwnershipSecurityDetailsType> accessLevel) {
    this.accessLevel = accessLevel;
  }

  public DataElementsIndiv accounting(AccountingInformationElementType accounting) {
    this.accounting = accounting;
    return this;
  }

  /**
   * Get accounting
   * @return accounting
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountingInformationElementType getAccounting() {
    return accounting;
  }

  public void setAccounting(AccountingInformationElementType accounting) {
    this.accounting = accounting;
  }

  public DataElementsIndiv cityPair(CityPair cityPair) {
    this.cityPair = cityPair;
    return this;
  }

  /**
   * Get cityPair
   * @return cityPair
  */
  @ApiModelProperty(value = "")

  @Valid

  public CityPair getCityPair() {
    return cityPair;
  }

  public void setCityPair(CityPair cityPair) {
    this.cityPair = cityPair;
  }

  public DataElementsIndiv dateAndTimeInformation(DateAndTimeInformationTypeI dateAndTimeInformation) {
    this.dateAndTimeInformation = dateAndTimeInformation;
    return this;
  }

  /**
   * Get dateAndTimeInformation
   * @return dateAndTimeInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateAndTimeInformationTypeI getDateAndTimeInformation() {
    return dateAndTimeInformation;
  }

  public void setDateAndTimeInformation(DateAndTimeInformationTypeI dateAndTimeInformation) {
    this.dateAndTimeInformation = dateAndTimeInformation;
  }

  public DataElementsIndiv elementErrorInformation(ErrorGroupType223552G elementErrorInformation) {
    this.elementErrorInformation = elementErrorInformation;
    return this;
  }

  /**
   * Get elementErrorInformation
   * @return elementErrorInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorGroupType223552G getElementErrorInformation() {
    return elementErrorInformation;
  }

  public void setElementErrorInformation(ErrorGroupType223552G elementErrorInformation) {
    this.elementErrorInformation = elementErrorInformation;
  }

  public DataElementsIndiv elementManagementData(ElementManagementSegmentType226873S elementManagementData) {
    this.elementManagementData = elementManagementData;
    return this;
  }

  /**
   * Get elementManagementData
   * @return elementManagementData
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementSegmentType226873S getElementManagementData() {
    return elementManagementData;
  }

  public void setElementManagementData(ElementManagementSegmentType226873S elementManagementData) {
    this.elementManagementData = elementManagementData;
  }

  public DataElementsIndiv elementsIndicators(List<StatusTypeI217964S> elementsIndicators) {
    this.elementsIndicators = elementsIndicators;
    return this;
  }

  public DataElementsIndiv addElementsIndicatorsItem(StatusTypeI217964S elementsIndicatorsItem) {
    if (this.elementsIndicators == null) {
      this.elementsIndicators = new ArrayList<>();
    }
    this.elementsIndicators.add(elementsIndicatorsItem);
    return this;
  }

  /**
   * Get elementsIndicators
   * @return elementsIndicators
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StatusTypeI217964S> getElementsIndicators() {
    return elementsIndicators;
  }

  public void setElementsIndicators(List<StatusTypeI217964S> elementsIndicators) {
    this.elementsIndicators = elementsIndicators;
  }

  public DataElementsIndiv eltPosDetails(POSGroupType150634G eltPosDetails) {
    this.eltPosDetails = eltPosDetails;
    return this;
  }

  /**
   * Get eltPosDetails
   * @return eltPosDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public POSGroupType150634G getEltPosDetails() {
    return eltPosDetails;
  }

  public void setEltPosDetails(POSGroupType150634G eltPosDetails) {
    this.eltPosDetails = eltPosDetails;
  }

  public DataElementsIndiv extendedRemark(ExtendedRemarkType extendedRemark) {
    this.extendedRemark = extendedRemark;
    return this;
  }

  /**
   * Get extendedRemark
   * @return extendedRemark
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExtendedRemarkType getExtendedRemark() {
    return extendedRemark;
  }

  public void setExtendedRemark(ExtendedRemarkType extendedRemark) {
    this.extendedRemark = extendedRemark;
  }

  public DataElementsIndiv frequentFlyerInformationGroup(FrequentFlyerInformationGroupType frequentFlyerInformationGroup) {
    this.frequentFlyerInformationGroup = frequentFlyerInformationGroup;
    return this;
  }

  /**
   * Get frequentFlyerInformationGroup
   * @return frequentFlyerInformationGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentFlyerInformationGroupType getFrequentFlyerInformationGroup() {
    return frequentFlyerInformationGroup;
  }

  public void setFrequentFlyerInformationGroup(FrequentFlyerInformationGroupType frequentFlyerInformationGroup) {
    this.frequentFlyerInformationGroup = frequentFlyerInformationGroup;
  }

  public DataElementsIndiv mcoRecord(McoRecord mcoRecord) {
    this.mcoRecord = mcoRecord;
    return this;
  }

  /**
   * Get mcoRecord
   * @return mcoRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public McoRecord getMcoRecord() {
    return mcoRecord;
  }

  public void setMcoRecord(McoRecord mcoRecord) {
    this.mcoRecord = mcoRecord;
  }

  public DataElementsIndiv miscellaneousRemarks(MiscellaneousRemarksType211S miscellaneousRemarks) {
    this.miscellaneousRemarks = miscellaneousRemarks;
    return this;
  }

  /**
   * Get miscellaneousRemarks
   * @return miscellaneousRemarks
  */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousRemarksType211S getMiscellaneousRemarks() {
    return miscellaneousRemarks;
  }

  public void setMiscellaneousRemarks(MiscellaneousRemarksType211S miscellaneousRemarks) {
    this.miscellaneousRemarks = miscellaneousRemarks;
  }

  public DataElementsIndiv monetaryInformation(List<MonetaryInformationTypeI1689S> monetaryInformation) {
    this.monetaryInformation = monetaryInformation;
    return this;
  }

  public DataElementsIndiv addMonetaryInformationItem(MonetaryInformationTypeI1689S monetaryInformationItem) {
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

  public List<MonetaryInformationTypeI1689S> getMonetaryInformation() {
    return monetaryInformation;
  }

  public void setMonetaryInformation(List<MonetaryInformationTypeI1689S> monetaryInformation) {
    this.monetaryInformation = monetaryInformation;
  }

  public DataElementsIndiv optionElement(OptionElementType optionElement) {
    this.optionElement = optionElement;
    return this;
  }

  /**
   * Get optionElement
   * @return optionElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public OptionElementType getOptionElement() {
    return optionElement;
  }

  public void setOptionElement(OptionElementType optionElement) {
    this.optionElement = optionElement;
  }

  public DataElementsIndiv otherDataFreetext(List<LongFreeTextType> otherDataFreetext) {
    this.otherDataFreetext = otherDataFreetext;
    return this;
  }

  public DataElementsIndiv addOtherDataFreetextItem(LongFreeTextType otherDataFreetextItem) {
    if (this.otherDataFreetext == null) {
      this.otherDataFreetext = new ArrayList<>();
    }
    this.otherDataFreetext.add(otherDataFreetextItem);
    return this;
  }

  /**
   * Get otherDataFreetext
   * @return otherDataFreetext
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<LongFreeTextType> getOtherDataFreetext() {
    return otherDataFreetext;
  }

  public void setOtherDataFreetext(List<LongFreeTextType> otherDataFreetext) {
    this.otherDataFreetext = otherDataFreetext;
  }

  public DataElementsIndiv pnrSecurity(IndividualPnrSecurityInformationType pnrSecurity) {
    this.pnrSecurity = pnrSecurity;
    return this;
  }

  /**
   * Get pnrSecurity
   * @return pnrSecurity
  */
  @ApiModelProperty(value = "")

  @Valid

  public IndividualPnrSecurityInformationType getPnrSecurity() {
    return pnrSecurity;
  }

  public void setPnrSecurity(IndividualPnrSecurityInformationType pnrSecurity) {
    this.pnrSecurity = pnrSecurity;
  }

  public DataElementsIndiv railSeatDetails(List<RailSeatDetails> railSeatDetails) {
    this.railSeatDetails = railSeatDetails;
    return this;
  }

  public DataElementsIndiv addRailSeatDetailsItem(RailSeatDetails railSeatDetailsItem) {
    if (this.railSeatDetails == null) {
      this.railSeatDetails = new ArrayList<>();
    }
    this.railSeatDetails.add(railSeatDetailsItem);
    return this;
  }

  /**
   * Get railSeatDetails
   * @return railSeatDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RailSeatDetails> getRailSeatDetails() {
    return railSeatDetails;
  }

  public void setRailSeatDetails(List<RailSeatDetails> railSeatDetails) {
    this.railSeatDetails = railSeatDetails;
  }

  public DataElementsIndiv railSeatPreferences(RailSeatPreferencesType railSeatPreferences) {
    this.railSeatPreferences = railSeatPreferences;
    return this;
  }

  /**
   * Get railSeatPreferences
   * @return railSeatPreferences
  */
  @ApiModelProperty(value = "")

  @Valid

  public RailSeatPreferencesType getRailSeatPreferences() {
    return railSeatPreferences;
  }

  public void setRailSeatPreferences(RailSeatPreferencesType railSeatPreferences) {
    this.railSeatPreferences = railSeatPreferences;
  }

  public DataElementsIndiv reasonForIssuanceCode(PricingOrTicketingSubsequentType195222S reasonForIssuanceCode) {
    this.reasonForIssuanceCode = reasonForIssuanceCode;
    return this;
  }

  /**
   * Get reasonForIssuanceCode
   * @return reasonForIssuanceCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public PricingOrTicketingSubsequentType195222S getReasonForIssuanceCode() {
    return reasonForIssuanceCode;
  }

  public void setReasonForIssuanceCode(PricingOrTicketingSubsequentType195222S reasonForIssuanceCode) {
    this.reasonForIssuanceCode = reasonForIssuanceCode;
  }

  public DataElementsIndiv referenceForDataElement(ReferenceInfoType227787S referenceForDataElement) {
    this.referenceForDataElement = referenceForDataElement;
    return this;
  }

  /**
   * Get referenceForDataElement
   * @return referenceForDataElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInfoType227787S getReferenceForDataElement() {
    return referenceForDataElement;
  }

  public void setReferenceForDataElement(ReferenceInfoType227787S referenceForDataElement) {
    this.referenceForDataElement = referenceForDataElement;
  }

  public DataElementsIndiv referencedRecord(ReferencedRecord referencedRecord) {
    this.referencedRecord = referencedRecord;
    return this;
  }

  /**
   * Get referencedRecord
   * @return referencedRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferencedRecord getReferencedRecord() {
    return referencedRecord;
  }

  public void setReferencedRecord(ReferencedRecord referencedRecord) {
    this.referencedRecord = referencedRecord;
  }

  public DataElementsIndiv seatPaxInfo(List<SeatPaxInfo> seatPaxInfo) {
    this.seatPaxInfo = seatPaxInfo;
    return this;
  }

  public DataElementsIndiv addSeatPaxInfoItem(SeatPaxInfo seatPaxInfoItem) {
    if (this.seatPaxInfo == null) {
      this.seatPaxInfo = new ArrayList<>();
    }
    this.seatPaxInfo.add(seatPaxInfoItem);
    return this;
  }

  /**
   * Get seatPaxInfo
   * @return seatPaxInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SeatPaxInfo> getSeatPaxInfo() {
    return seatPaxInfo;
  }

  public void setSeatPaxInfo(List<SeatPaxInfo> seatPaxInfo) {
    this.seatPaxInfo = seatPaxInfo;
  }

  public DataElementsIndiv serviceRequest(SpecialRequirementsDetailsTypeI serviceRequest) {
    this.serviceRequest = serviceRequest;
    return this;
  }

  /**
   * Get serviceRequest
   * @return serviceRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecialRequirementsDetailsTypeI getServiceRequest() {
    return serviceRequest;
  }

  public void setServiceRequest(SpecialRequirementsDetailsTypeI serviceRequest) {
    this.serviceRequest = serviceRequest;
  }

  public DataElementsIndiv ssrPackageInformation(List<SSRPackInformation> ssrPackageInformation) {
    this.ssrPackageInformation = ssrPackageInformation;
    return this;
  }

  public DataElementsIndiv addSsrPackageInformationItem(SSRPackInformation ssrPackageInformationItem) {
    if (this.ssrPackageInformation == null) {
      this.ssrPackageInformation = new ArrayList<>();
    }
    this.ssrPackageInformation.add(ssrPackageInformationItem);
    return this;
  }

  /**
   * Get ssrPackageInformation
   * @return ssrPackageInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SSRPackInformation> getSsrPackageInformation() {
    return ssrPackageInformation;
  }

  public void setSsrPackageInformation(List<SSRPackInformation> ssrPackageInformation) {
    this.ssrPackageInformation = ssrPackageInformation;
  }

  public DataElementsIndiv structuredAddress(StructuredAddressType structuredAddress) {
    this.structuredAddress = structuredAddress;
    return this;
  }

  /**
   * Get structuredAddress
   * @return structuredAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredAddressType getStructuredAddress() {
    return structuredAddress;
  }

  public void setStructuredAddress(StructuredAddressType structuredAddress) {
    this.structuredAddress = structuredAddress;
  }

  public DataElementsIndiv structuredFop(List<FOPRepresentationType> structuredFop) {
    this.structuredFop = structuredFop;
    return this;
  }

  public DataElementsIndiv addStructuredFopItem(FOPRepresentationType structuredFopItem) {
    if (this.structuredFop == null) {
      this.structuredFop = new ArrayList<>();
    }
    this.structuredFop.add(structuredFopItem);
    return this;
  }

  /**
   * Get structuredFop
   * @return structuredFop
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FOPRepresentationType> getStructuredFop() {
    return structuredFop;
  }

  public void setStructuredFop(List<FOPRepresentationType> structuredFop) {
    this.structuredFop = structuredFop;
  }

  public DataElementsIndiv ticketElement(TicketElementType ticketElement) {
    this.ticketElement = ticketElement;
    return this;
  }

  /**
   * Get ticketElement
   * @return ticketElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketElementType getTicketElement() {
    return ticketElement;
  }

  public void setTicketElement(TicketElementType ticketElement) {
    this.ticketElement = ticketElement;
  }

  public DataElementsIndiv totalPrice(TotalPriceType totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * Get totalPrice
   * @return totalPrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public TotalPriceType getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(TotalPriceType totalPrice) {
    this.totalPrice = totalPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataElementsIndiv dataElementsIndiv = (DataElementsIndiv) o;
    return Objects.equals(this.accessLevel, dataElementsIndiv.accessLevel) &&
        Objects.equals(this.accounting, dataElementsIndiv.accounting) &&
        Objects.equals(this.cityPair, dataElementsIndiv.cityPair) &&
        Objects.equals(this.dateAndTimeInformation, dataElementsIndiv.dateAndTimeInformation) &&
        Objects.equals(this.elementErrorInformation, dataElementsIndiv.elementErrorInformation) &&
        Objects.equals(this.elementManagementData, dataElementsIndiv.elementManagementData) &&
        Objects.equals(this.elementsIndicators, dataElementsIndiv.elementsIndicators) &&
        Objects.equals(this.eltPosDetails, dataElementsIndiv.eltPosDetails) &&
        Objects.equals(this.extendedRemark, dataElementsIndiv.extendedRemark) &&
        Objects.equals(this.frequentFlyerInformationGroup, dataElementsIndiv.frequentFlyerInformationGroup) &&
        Objects.equals(this.mcoRecord, dataElementsIndiv.mcoRecord) &&
        Objects.equals(this.miscellaneousRemarks, dataElementsIndiv.miscellaneousRemarks) &&
        Objects.equals(this.monetaryInformation, dataElementsIndiv.monetaryInformation) &&
        Objects.equals(this.optionElement, dataElementsIndiv.optionElement) &&
        Objects.equals(this.otherDataFreetext, dataElementsIndiv.otherDataFreetext) &&
        Objects.equals(this.pnrSecurity, dataElementsIndiv.pnrSecurity) &&
        Objects.equals(this.railSeatDetails, dataElementsIndiv.railSeatDetails) &&
        Objects.equals(this.railSeatPreferences, dataElementsIndiv.railSeatPreferences) &&
        Objects.equals(this.reasonForIssuanceCode, dataElementsIndiv.reasonForIssuanceCode) &&
        Objects.equals(this.referenceForDataElement, dataElementsIndiv.referenceForDataElement) &&
        Objects.equals(this.referencedRecord, dataElementsIndiv.referencedRecord) &&
        Objects.equals(this.seatPaxInfo, dataElementsIndiv.seatPaxInfo) &&
        Objects.equals(this.serviceRequest, dataElementsIndiv.serviceRequest) &&
        Objects.equals(this.ssrPackageInformation, dataElementsIndiv.ssrPackageInformation) &&
        Objects.equals(this.structuredAddress, dataElementsIndiv.structuredAddress) &&
        Objects.equals(this.structuredFop, dataElementsIndiv.structuredFop) &&
        Objects.equals(this.ticketElement, dataElementsIndiv.ticketElement) &&
        Objects.equals(this.totalPrice, dataElementsIndiv.totalPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel, accounting, cityPair, dateAndTimeInformation, elementErrorInformation, elementManagementData, elementsIndicators, eltPosDetails, extendedRemark, frequentFlyerInformationGroup, mcoRecord, miscellaneousRemarks, monetaryInformation, optionElement, otherDataFreetext, pnrSecurity, railSeatDetails, railSeatPreferences, reasonForIssuanceCode, referenceForDataElement, referencedRecord, seatPaxInfo, serviceRequest, ssrPackageInformation, structuredAddress, structuredFop, ticketElement, totalPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataElementsIndiv {\n");
    
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    accounting: ").append(toIndentedString(accounting)).append("\n");
    sb.append("    cityPair: ").append(toIndentedString(cityPair)).append("\n");
    sb.append("    dateAndTimeInformation: ").append(toIndentedString(dateAndTimeInformation)).append("\n");
    sb.append("    elementErrorInformation: ").append(toIndentedString(elementErrorInformation)).append("\n");
    sb.append("    elementManagementData: ").append(toIndentedString(elementManagementData)).append("\n");
    sb.append("    elementsIndicators: ").append(toIndentedString(elementsIndicators)).append("\n");
    sb.append("    eltPosDetails: ").append(toIndentedString(eltPosDetails)).append("\n");
    sb.append("    extendedRemark: ").append(toIndentedString(extendedRemark)).append("\n");
    sb.append("    frequentFlyerInformationGroup: ").append(toIndentedString(frequentFlyerInformationGroup)).append("\n");
    sb.append("    mcoRecord: ").append(toIndentedString(mcoRecord)).append("\n");
    sb.append("    miscellaneousRemarks: ").append(toIndentedString(miscellaneousRemarks)).append("\n");
    sb.append("    monetaryInformation: ").append(toIndentedString(monetaryInformation)).append("\n");
    sb.append("    optionElement: ").append(toIndentedString(optionElement)).append("\n");
    sb.append("    otherDataFreetext: ").append(toIndentedString(otherDataFreetext)).append("\n");
    sb.append("    pnrSecurity: ").append(toIndentedString(pnrSecurity)).append("\n");
    sb.append("    railSeatDetails: ").append(toIndentedString(railSeatDetails)).append("\n");
    sb.append("    railSeatPreferences: ").append(toIndentedString(railSeatPreferences)).append("\n");
    sb.append("    reasonForIssuanceCode: ").append(toIndentedString(reasonForIssuanceCode)).append("\n");
    sb.append("    referenceForDataElement: ").append(toIndentedString(referenceForDataElement)).append("\n");
    sb.append("    referencedRecord: ").append(toIndentedString(referencedRecord)).append("\n");
    sb.append("    seatPaxInfo: ").append(toIndentedString(seatPaxInfo)).append("\n");
    sb.append("    serviceRequest: ").append(toIndentedString(serviceRequest)).append("\n");
    sb.append("    ssrPackageInformation: ").append(toIndentedString(ssrPackageInformation)).append("\n");
    sb.append("    structuredAddress: ").append(toIndentedString(structuredAddress)).append("\n");
    sb.append("    structuredFop: ").append(toIndentedString(structuredFop)).append("\n");
    sb.append("    ticketElement: ").append(toIndentedString(ticketElement)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
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

