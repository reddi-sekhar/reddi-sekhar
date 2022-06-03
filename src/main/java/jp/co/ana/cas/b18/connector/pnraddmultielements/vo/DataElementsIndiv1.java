package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AccountingInformationElementType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CommissionElementType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DateAndTimeInformationTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ElementManagementSegmentType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ExtendedOwnershipSecurityDetailsType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ExtendedRemarkType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FareDiscountElementType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FareElementsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FarePrintOverrideType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FormOfPaymentTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FrequentTravellerInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FrequentTravellerVerificationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.IndividualPnrSecurityInformationType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LongFreeTextType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ManualDocumentRegistrationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MarketSpecificDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MiscellaneousRemarksType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OptionElementType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OriginalIssueType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PrinterIdentificationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SeatEntityType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecialRequirementsDetailsTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusTypeI1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredAddressType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TicketElementType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TicketingCarrierDesignatorType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TourCodeType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataElementsIndiv1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DataElementsIndiv1   {
  @JsonProperty("accessLevel")
  private ExtendedOwnershipSecurityDetailsType1 accessLevel;

  @JsonProperty("accounting")
  private AccountingInformationElementType1 accounting;

  @JsonProperty("commission")
  private CommissionElementType commission;

  @JsonProperty("dateAndTimeInformation")
  private DateAndTimeInformationTypeI1 dateAndTimeInformation;

  @JsonProperty("elementManagementData")
  private ElementManagementSegmentType1 elementManagementData;

  @JsonProperty("extendedRemark")
  private ExtendedRemarkType1 extendedRemark;

  @JsonProperty("fareDiscount")
  private FareDiscountElementType fareDiscount;

  @JsonProperty("fareElement")
  private FareElementsType fareElement;

  @JsonProperty("farePrintOverride")
  private FarePrintOverrideType farePrintOverride;

  @JsonProperty("fopExtension")
  @Valid
  private List<MarketSpecificDataType> fopExtension = null;

  @JsonProperty("formOfPayment")
  private FormOfPaymentTypeI1 formOfPayment;

  @JsonProperty("freetextData")
  private LongFreeTextType1 freetextData;

  @JsonProperty("frequentTravellerData")
  private FrequentTravellerInformationTypeU frequentTravellerData;

  @JsonProperty("frequentTravellerVerification")
  private FrequentTravellerVerificationType frequentTravellerVerification;

  @JsonProperty("manualFareDocument")
  private ManualDocumentRegistrationType manualFareDocument;

  @JsonProperty("miscellaneousRemark")
  private MiscellaneousRemarksType1 miscellaneousRemark;

  @JsonProperty("optionElement")
  private OptionElementType1 optionElement;

  @JsonProperty("originalIssue")
  private OriginalIssueType originalIssue;

  @JsonProperty("pnrSecurity")
  private IndividualPnrSecurityInformationType1 pnrSecurity;

  @JsonProperty("printer")
  private PrinterIdentificationType printer;

  @JsonProperty("referenceForDataElement")
  private ReferenceInfoType1 referenceForDataElement;

  @JsonProperty("seatGroup")
  private SeatEntityType seatGroup;

  @JsonProperty("serviceDetails")
  @Valid
  private List<StatusTypeI1> serviceDetails = null;

  @JsonProperty("serviceRequest")
  private SpecialRequirementsDetailsTypeI1 serviceRequest;

  @JsonProperty("structuredAddress")
  private StructuredAddressType1 structuredAddress;

  @JsonProperty("ticketElement")
  private TicketElementType1 ticketElement;

  @JsonProperty("ticketingCarrier")
  private TicketingCarrierDesignatorType ticketingCarrier;

  @JsonProperty("tourCode")
  private TourCodeType tourCode;

  public DataElementsIndiv1 accessLevel(ExtendedOwnershipSecurityDetailsType1 accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * Get accessLevel
   * @return accessLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExtendedOwnershipSecurityDetailsType1 getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(ExtendedOwnershipSecurityDetailsType1 accessLevel) {
    this.accessLevel = accessLevel;
  }

  public DataElementsIndiv1 accounting(AccountingInformationElementType1 accounting) {
    this.accounting = accounting;
    return this;
  }

  /**
   * Get accounting
   * @return accounting
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccountingInformationElementType1 getAccounting() {
    return accounting;
  }

  public void setAccounting(AccountingInformationElementType1 accounting) {
    this.accounting = accounting;
  }

  public DataElementsIndiv1 commission(CommissionElementType commission) {
    this.commission = commission;
    return this;
  }

  /**
   * Get commission
   * @return commission
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommissionElementType getCommission() {
    return commission;
  }

  public void setCommission(CommissionElementType commission) {
    this.commission = commission;
  }

  public DataElementsIndiv1 dateAndTimeInformation(DateAndTimeInformationTypeI1 dateAndTimeInformation) {
    this.dateAndTimeInformation = dateAndTimeInformation;
    return this;
  }

  /**
   * Get dateAndTimeInformation
   * @return dateAndTimeInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateAndTimeInformationTypeI1 getDateAndTimeInformation() {
    return dateAndTimeInformation;
  }

  public void setDateAndTimeInformation(DateAndTimeInformationTypeI1 dateAndTimeInformation) {
    this.dateAndTimeInformation = dateAndTimeInformation;
  }

  public DataElementsIndiv1 elementManagementData(ElementManagementSegmentType1 elementManagementData) {
    this.elementManagementData = elementManagementData;
    return this;
  }

  /**
   * Get elementManagementData
   * @return elementManagementData
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementSegmentType1 getElementManagementData() {
    return elementManagementData;
  }

  public void setElementManagementData(ElementManagementSegmentType1 elementManagementData) {
    this.elementManagementData = elementManagementData;
  }

  public DataElementsIndiv1 extendedRemark(ExtendedRemarkType1 extendedRemark) {
    this.extendedRemark = extendedRemark;
    return this;
  }

  /**
   * Get extendedRemark
   * @return extendedRemark
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExtendedRemarkType1 getExtendedRemark() {
    return extendedRemark;
  }

  public void setExtendedRemark(ExtendedRemarkType1 extendedRemark) {
    this.extendedRemark = extendedRemark;
  }

  public DataElementsIndiv1 fareDiscount(FareDiscountElementType fareDiscount) {
    this.fareDiscount = fareDiscount;
    return this;
  }

  /**
   * Get fareDiscount
   * @return fareDiscount
  */
  @ApiModelProperty(value = "")

  @Valid

  public FareDiscountElementType getFareDiscount() {
    return fareDiscount;
  }

  public void setFareDiscount(FareDiscountElementType fareDiscount) {
    this.fareDiscount = fareDiscount;
  }

  public DataElementsIndiv1 fareElement(FareElementsType fareElement) {
    this.fareElement = fareElement;
    return this;
  }

  /**
   * Get fareElement
   * @return fareElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public FareElementsType getFareElement() {
    return fareElement;
  }

  public void setFareElement(FareElementsType fareElement) {
    this.fareElement = fareElement;
  }

  public DataElementsIndiv1 farePrintOverride(FarePrintOverrideType farePrintOverride) {
    this.farePrintOverride = farePrintOverride;
    return this;
  }

  /**
   * Get farePrintOverride
   * @return farePrintOverride
  */
  @ApiModelProperty(value = "")

  @Valid

  public FarePrintOverrideType getFarePrintOverride() {
    return farePrintOverride;
  }

  public void setFarePrintOverride(FarePrintOverrideType farePrintOverride) {
    this.farePrintOverride = farePrintOverride;
  }

  public DataElementsIndiv1 fopExtension(List<MarketSpecificDataType> fopExtension) {
    this.fopExtension = fopExtension;
    return this;
  }

  public DataElementsIndiv1 addFopExtensionItem(MarketSpecificDataType fopExtensionItem) {
    if (this.fopExtension == null) {
      this.fopExtension = new ArrayList<>();
    }
    this.fopExtension.add(fopExtensionItem);
    return this;
  }

  /**
   * Get fopExtension
   * @return fopExtension
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MarketSpecificDataType> getFopExtension() {
    return fopExtension;
  }

  public void setFopExtension(List<MarketSpecificDataType> fopExtension) {
    this.fopExtension = fopExtension;
  }

  public DataElementsIndiv1 formOfPayment(FormOfPaymentTypeI1 formOfPayment) {
    this.formOfPayment = formOfPayment;
    return this;
  }

  /**
   * Get formOfPayment
   * @return formOfPayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public FormOfPaymentTypeI1 getFormOfPayment() {
    return formOfPayment;
  }

  public void setFormOfPayment(FormOfPaymentTypeI1 formOfPayment) {
    this.formOfPayment = formOfPayment;
  }

  public DataElementsIndiv1 freetextData(LongFreeTextType1 freetextData) {
    this.freetextData = freetextData;
    return this;
  }

  /**
   * Get freetextData
   * @return freetextData
  */
  @ApiModelProperty(value = "")

  @Valid

  public LongFreeTextType1 getFreetextData() {
    return freetextData;
  }

  public void setFreetextData(LongFreeTextType1 freetextData) {
    this.freetextData = freetextData;
  }

  public DataElementsIndiv1 frequentTravellerData(FrequentTravellerInformationTypeU frequentTravellerData) {
    this.frequentTravellerData = frequentTravellerData;
    return this;
  }

  /**
   * Get frequentTravellerData
   * @return frequentTravellerData
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravellerInformationTypeU getFrequentTravellerData() {
    return frequentTravellerData;
  }

  public void setFrequentTravellerData(FrequentTravellerInformationTypeU frequentTravellerData) {
    this.frequentTravellerData = frequentTravellerData;
  }

  public DataElementsIndiv1 frequentTravellerVerification(FrequentTravellerVerificationType frequentTravellerVerification) {
    this.frequentTravellerVerification = frequentTravellerVerification;
    return this;
  }

  /**
   * Get frequentTravellerVerification
   * @return frequentTravellerVerification
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravellerVerificationType getFrequentTravellerVerification() {
    return frequentTravellerVerification;
  }

  public void setFrequentTravellerVerification(FrequentTravellerVerificationType frequentTravellerVerification) {
    this.frequentTravellerVerification = frequentTravellerVerification;
  }

  public DataElementsIndiv1 manualFareDocument(ManualDocumentRegistrationType manualFareDocument) {
    this.manualFareDocument = manualFareDocument;
    return this;
  }

  /**
   * Get manualFareDocument
   * @return manualFareDocument
  */
  @ApiModelProperty(value = "")

  @Valid

  public ManualDocumentRegistrationType getManualFareDocument() {
    return manualFareDocument;
  }

  public void setManualFareDocument(ManualDocumentRegistrationType manualFareDocument) {
    this.manualFareDocument = manualFareDocument;
  }

  public DataElementsIndiv1 miscellaneousRemark(MiscellaneousRemarksType1 miscellaneousRemark) {
    this.miscellaneousRemark = miscellaneousRemark;
    return this;
  }

  /**
   * Get miscellaneousRemark
   * @return miscellaneousRemark
  */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousRemarksType1 getMiscellaneousRemark() {
    return miscellaneousRemark;
  }

  public void setMiscellaneousRemark(MiscellaneousRemarksType1 miscellaneousRemark) {
    this.miscellaneousRemark = miscellaneousRemark;
  }

  public DataElementsIndiv1 optionElement(OptionElementType1 optionElement) {
    this.optionElement = optionElement;
    return this;
  }

  /**
   * Get optionElement
   * @return optionElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public OptionElementType1 getOptionElement() {
    return optionElement;
  }

  public void setOptionElement(OptionElementType1 optionElement) {
    this.optionElement = optionElement;
  }

  public DataElementsIndiv1 originalIssue(OriginalIssueType originalIssue) {
    this.originalIssue = originalIssue;
    return this;
  }

  /**
   * Get originalIssue
   * @return originalIssue
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginalIssueType getOriginalIssue() {
    return originalIssue;
  }

  public void setOriginalIssue(OriginalIssueType originalIssue) {
    this.originalIssue = originalIssue;
  }

  public DataElementsIndiv1 pnrSecurity(IndividualPnrSecurityInformationType1 pnrSecurity) {
    this.pnrSecurity = pnrSecurity;
    return this;
  }

  /**
   * Get pnrSecurity
   * @return pnrSecurity
  */
  @ApiModelProperty(value = "")

  @Valid

  public IndividualPnrSecurityInformationType1 getPnrSecurity() {
    return pnrSecurity;
  }

  public void setPnrSecurity(IndividualPnrSecurityInformationType1 pnrSecurity) {
    this.pnrSecurity = pnrSecurity;
  }

  public DataElementsIndiv1 printer(PrinterIdentificationType printer) {
    this.printer = printer;
    return this;
  }

  /**
   * Get printer
   * @return printer
  */
  @ApiModelProperty(value = "")

  @Valid

  public PrinterIdentificationType getPrinter() {
    return printer;
  }

  public void setPrinter(PrinterIdentificationType printer) {
    this.printer = printer;
  }

  public DataElementsIndiv1 referenceForDataElement(ReferenceInfoType1 referenceForDataElement) {
    this.referenceForDataElement = referenceForDataElement;
    return this;
  }

  /**
   * Get referenceForDataElement
   * @return referenceForDataElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInfoType1 getReferenceForDataElement() {
    return referenceForDataElement;
  }

  public void setReferenceForDataElement(ReferenceInfoType1 referenceForDataElement) {
    this.referenceForDataElement = referenceForDataElement;
  }

  public DataElementsIndiv1 seatGroup(SeatEntityType seatGroup) {
    this.seatGroup = seatGroup;
    return this;
  }

  /**
   * Get seatGroup
   * @return seatGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public SeatEntityType getSeatGroup() {
    return seatGroup;
  }

  public void setSeatGroup(SeatEntityType seatGroup) {
    this.seatGroup = seatGroup;
  }

  public DataElementsIndiv1 serviceDetails(List<StatusTypeI1> serviceDetails) {
    this.serviceDetails = serviceDetails;
    return this;
  }

  public DataElementsIndiv1 addServiceDetailsItem(StatusTypeI1 serviceDetailsItem) {
    if (this.serviceDetails == null) {
      this.serviceDetails = new ArrayList<>();
    }
    this.serviceDetails.add(serviceDetailsItem);
    return this;
  }

  /**
   * Get serviceDetails
   * @return serviceDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StatusTypeI1> getServiceDetails() {
    return serviceDetails;
  }

  public void setServiceDetails(List<StatusTypeI1> serviceDetails) {
    this.serviceDetails = serviceDetails;
  }

  public DataElementsIndiv1 serviceRequest(SpecialRequirementsDetailsTypeI1 serviceRequest) {
    this.serviceRequest = serviceRequest;
    return this;
  }

  /**
   * Get serviceRequest
   * @return serviceRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecialRequirementsDetailsTypeI1 getServiceRequest() {
    return serviceRequest;
  }

  public void setServiceRequest(SpecialRequirementsDetailsTypeI1 serviceRequest) {
    this.serviceRequest = serviceRequest;
  }

  public DataElementsIndiv1 structuredAddress(StructuredAddressType1 structuredAddress) {
    this.structuredAddress = structuredAddress;
    return this;
  }

  /**
   * Get structuredAddress
   * @return structuredAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredAddressType1 getStructuredAddress() {
    return structuredAddress;
  }

  public void setStructuredAddress(StructuredAddressType1 structuredAddress) {
    this.structuredAddress = structuredAddress;
  }

  public DataElementsIndiv1 ticketElement(TicketElementType1 ticketElement) {
    this.ticketElement = ticketElement;
    return this;
  }

  /**
   * Get ticketElement
   * @return ticketElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketElementType1 getTicketElement() {
    return ticketElement;
  }

  public void setTicketElement(TicketElementType1 ticketElement) {
    this.ticketElement = ticketElement;
  }

  public DataElementsIndiv1 ticketingCarrier(TicketingCarrierDesignatorType ticketingCarrier) {
    this.ticketingCarrier = ticketingCarrier;
    return this;
  }

  /**
   * Get ticketingCarrier
   * @return ticketingCarrier
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketingCarrierDesignatorType getTicketingCarrier() {
    return ticketingCarrier;
  }

  public void setTicketingCarrier(TicketingCarrierDesignatorType ticketingCarrier) {
    this.ticketingCarrier = ticketingCarrier;
  }

  public DataElementsIndiv1 tourCode(TourCodeType tourCode) {
    this.tourCode = tourCode;
    return this;
  }

  /**
   * Get tourCode
   * @return tourCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public TourCodeType getTourCode() {
    return tourCode;
  }

  public void setTourCode(TourCodeType tourCode) {
    this.tourCode = tourCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataElementsIndiv1 dataElementsIndiv1 = (DataElementsIndiv1) o;
    return Objects.equals(this.accessLevel, dataElementsIndiv1.accessLevel) &&
        Objects.equals(this.accounting, dataElementsIndiv1.accounting) &&
        Objects.equals(this.commission, dataElementsIndiv1.commission) &&
        Objects.equals(this.dateAndTimeInformation, dataElementsIndiv1.dateAndTimeInformation) &&
        Objects.equals(this.elementManagementData, dataElementsIndiv1.elementManagementData) &&
        Objects.equals(this.extendedRemark, dataElementsIndiv1.extendedRemark) &&
        Objects.equals(this.fareDiscount, dataElementsIndiv1.fareDiscount) &&
        Objects.equals(this.fareElement, dataElementsIndiv1.fareElement) &&
        Objects.equals(this.farePrintOverride, dataElementsIndiv1.farePrintOverride) &&
        Objects.equals(this.fopExtension, dataElementsIndiv1.fopExtension) &&
        Objects.equals(this.formOfPayment, dataElementsIndiv1.formOfPayment) &&
        Objects.equals(this.freetextData, dataElementsIndiv1.freetextData) &&
        Objects.equals(this.frequentTravellerData, dataElementsIndiv1.frequentTravellerData) &&
        Objects.equals(this.frequentTravellerVerification, dataElementsIndiv1.frequentTravellerVerification) &&
        Objects.equals(this.manualFareDocument, dataElementsIndiv1.manualFareDocument) &&
        Objects.equals(this.miscellaneousRemark, dataElementsIndiv1.miscellaneousRemark) &&
        Objects.equals(this.optionElement, dataElementsIndiv1.optionElement) &&
        Objects.equals(this.originalIssue, dataElementsIndiv1.originalIssue) &&
        Objects.equals(this.pnrSecurity, dataElementsIndiv1.pnrSecurity) &&
        Objects.equals(this.printer, dataElementsIndiv1.printer) &&
        Objects.equals(this.referenceForDataElement, dataElementsIndiv1.referenceForDataElement) &&
        Objects.equals(this.seatGroup, dataElementsIndiv1.seatGroup) &&
        Objects.equals(this.serviceDetails, dataElementsIndiv1.serviceDetails) &&
        Objects.equals(this.serviceRequest, dataElementsIndiv1.serviceRequest) &&
        Objects.equals(this.structuredAddress, dataElementsIndiv1.structuredAddress) &&
        Objects.equals(this.ticketElement, dataElementsIndiv1.ticketElement) &&
        Objects.equals(this.ticketingCarrier, dataElementsIndiv1.ticketingCarrier) &&
        Objects.equals(this.tourCode, dataElementsIndiv1.tourCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel, accounting, commission, dateAndTimeInformation, elementManagementData, extendedRemark, fareDiscount, fareElement, farePrintOverride, fopExtension, formOfPayment, freetextData, frequentTravellerData, frequentTravellerVerification, manualFareDocument, miscellaneousRemark, optionElement, originalIssue, pnrSecurity, printer, referenceForDataElement, seatGroup, serviceDetails, serviceRequest, structuredAddress, ticketElement, ticketingCarrier, tourCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataElementsIndiv1 {\n");
    
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    accounting: ").append(toIndentedString(accounting)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    dateAndTimeInformation: ").append(toIndentedString(dateAndTimeInformation)).append("\n");
    sb.append("    elementManagementData: ").append(toIndentedString(elementManagementData)).append("\n");
    sb.append("    extendedRemark: ").append(toIndentedString(extendedRemark)).append("\n");
    sb.append("    fareDiscount: ").append(toIndentedString(fareDiscount)).append("\n");
    sb.append("    fareElement: ").append(toIndentedString(fareElement)).append("\n");
    sb.append("    farePrintOverride: ").append(toIndentedString(farePrintOverride)).append("\n");
    sb.append("    fopExtension: ").append(toIndentedString(fopExtension)).append("\n");
    sb.append("    formOfPayment: ").append(toIndentedString(formOfPayment)).append("\n");
    sb.append("    freetextData: ").append(toIndentedString(freetextData)).append("\n");
    sb.append("    frequentTravellerData: ").append(toIndentedString(frequentTravellerData)).append("\n");
    sb.append("    frequentTravellerVerification: ").append(toIndentedString(frequentTravellerVerification)).append("\n");
    sb.append("    manualFareDocument: ").append(toIndentedString(manualFareDocument)).append("\n");
    sb.append("    miscellaneousRemark: ").append(toIndentedString(miscellaneousRemark)).append("\n");
    sb.append("    optionElement: ").append(toIndentedString(optionElement)).append("\n");
    sb.append("    originalIssue: ").append(toIndentedString(originalIssue)).append("\n");
    sb.append("    pnrSecurity: ").append(toIndentedString(pnrSecurity)).append("\n");
    sb.append("    printer: ").append(toIndentedString(printer)).append("\n");
    sb.append("    referenceForDataElement: ").append(toIndentedString(referenceForDataElement)).append("\n");
    sb.append("    seatGroup: ").append(toIndentedString(seatGroup)).append("\n");
    sb.append("    serviceDetails: ").append(toIndentedString(serviceDetails)).append("\n");
    sb.append("    serviceRequest: ").append(toIndentedString(serviceRequest)).append("\n");
    sb.append("    structuredAddress: ").append(toIndentedString(structuredAddress)).append("\n");
    sb.append("    ticketElement: ").append(toIndentedString(ticketElement)).append("\n");
    sb.append("    ticketingCarrier: ").append(toIndentedString(ticketingCarrier)).append("\n");
    sb.append("    tourCode: ").append(toIndentedString(tourCode)).append("\n");
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

