package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AdditionalProductDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CabinDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CarbonDioxydeInfo;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodedAttributeType213992S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CountryCodeListType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CruiseBusinessDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CustomerTransactionDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DateAndTimeInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ElementManagementSegmentType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ErrorGroupType223552G;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FLIXType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FerryBookingDescriptionType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.GeneralOptionType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.HotelProductInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.HotelReservationInfo;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsuranceBusinessDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsuranceInformation;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InteractiveFreeTextType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LccTypicalData;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LegInfo;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LongFreeTextType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MessageActionDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MethodType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PricingOrTicketingSubsequentType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RateInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RelatedProductInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationTypeI196503S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SelectionDetailsTypeI201122S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TaxTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TourInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TrainInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelProductInformationTypeI193100S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TypicalCarData;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.YieldGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItineraryInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ItineraryInfo   {
  @JsonProperty("cabinDetails")
  private CabinDetailsType cabinDetails;

  @JsonProperty("carbonDioxydeInfo")
  private CarbonDioxydeInfo carbonDioxydeInfo;

  @JsonProperty("country")
  private CountryCodeListType country;

  @JsonProperty("customerTransactionData")
  private CustomerTransactionDataType customerTransactionData;

  @JsonProperty("dateTimeDetails")
  private DateAndTimeInformationType dateTimeDetails;

  @JsonProperty("distributionMethod")
  private MethodType distributionMethod;

  @JsonProperty("elementManagementItinerary")
  private ElementManagementSegmentType elementManagementItinerary;

  @JsonProperty("elementsIndicators")
  private StatusType elementsIndicators;

  @JsonProperty("errorInfo")
  private ErrorGroupType223552G errorInfo;

  @JsonProperty("ferryLegInformation")
  private FerryBookingDescriptionType ferryLegInformation;

  @JsonProperty("flightDetail")
  private AdditionalProductDetailsTypeI flightDetail;

  @JsonProperty("flixInfo")
  @Valid
  private List<FLIXType> flixInfo = null;

  @JsonProperty("generalOption")
  @Valid
  private List<GeneralOptionType> generalOption = null;

  @JsonProperty("hotelProduct")
  private HotelProductInformationType hotelProduct;

  @JsonProperty("hotelReservationInfo")
  private HotelReservationInfo hotelReservationInfo;

  @JsonProperty("insuranceDetails")
  private InsuranceBusinessDataType insuranceDetails;

  @JsonProperty("insuranceInformation")
  @Valid
  private List<InsuranceInformation> insuranceInformation = null;

  @JsonProperty("itineraryFreetext")
  private LongFreeTextType itineraryFreetext;

  @JsonProperty("itineraryMessageAction")
  private MessageActionDetailsType itineraryMessageAction;

  @JsonProperty("itineraryReservationInfo")
  private ReservationControlInformationTypeI196503S itineraryReservationInfo;

  @JsonProperty("itineraryfreeFormText")
  @Valid
  private List<InteractiveFreeTextType> itineraryfreeFormText = null;

  @JsonProperty("lccTypicalData")
  private LccTypicalData lccTypicalData;

  @JsonProperty("legInfo")
  @Valid
  private List<LegInfo> legInfo = null;

  @JsonProperty("markerRailTour")
  private Object markerRailTour;

  @JsonProperty("railInfo")
  private TrainInformationType railInfo;

  @JsonProperty("rateInformations")
  private RateInformationType rateInformations;

  @JsonProperty("reasonForIssuanceCode")
  private PricingOrTicketingSubsequentType reasonForIssuanceCode;

  @JsonProperty("referenceForSegment")
  private ReferenceInfoType referenceForSegment;

  @JsonProperty("relatedProduct")
  private RelatedProductInformationTypeI relatedProduct;

  @JsonProperty("segmentAttribute")
  private CodedAttributeType213992S segmentAttribute;

  @JsonProperty("selectionDetails")
  private SelectionDetailsTypeI201122S selectionDetails;

  @JsonProperty("taxInformation")
  @Valid
  private List<TaxTypeI> taxInformation = null;

  @JsonProperty("tourInfo")
  private TourInformationType tourInfo;

  @JsonProperty("travelProduct")
  private TravelProductInformationTypeI193100S travelProduct;

  @JsonProperty("typicalCarData")
  private TypicalCarData typicalCarData;

  @JsonProperty("typicalCruiseData")
  private CruiseBusinessDataType typicalCruiseData;

  @JsonProperty("yieldGroup")
  private YieldGroup yieldGroup;

  public ItineraryInfo cabinDetails(CabinDetailsType cabinDetails) {
    this.cabinDetails = cabinDetails;
    return this;
  }

  /**
   * Get cabinDetails
   * @return cabinDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CabinDetailsType getCabinDetails() {
    return cabinDetails;
  }

  public void setCabinDetails(CabinDetailsType cabinDetails) {
    this.cabinDetails = cabinDetails;
  }

  public ItineraryInfo carbonDioxydeInfo(CarbonDioxydeInfo carbonDioxydeInfo) {
    this.carbonDioxydeInfo = carbonDioxydeInfo;
    return this;
  }

  /**
   * Get carbonDioxydeInfo
   * @return carbonDioxydeInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public CarbonDioxydeInfo getCarbonDioxydeInfo() {
    return carbonDioxydeInfo;
  }

  public void setCarbonDioxydeInfo(CarbonDioxydeInfo carbonDioxydeInfo) {
    this.carbonDioxydeInfo = carbonDioxydeInfo;
  }

  public ItineraryInfo country(CountryCodeListType country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @ApiModelProperty(value = "")

  @Valid

  public CountryCodeListType getCountry() {
    return country;
  }

  public void setCountry(CountryCodeListType country) {
    this.country = country;
  }

  public ItineraryInfo customerTransactionData(CustomerTransactionDataType customerTransactionData) {
    this.customerTransactionData = customerTransactionData;
    return this;
  }

  /**
   * Get customerTransactionData
   * @return customerTransactionData
  */
  @ApiModelProperty(value = "")

  @Valid

  public CustomerTransactionDataType getCustomerTransactionData() {
    return customerTransactionData;
  }

  public void setCustomerTransactionData(CustomerTransactionDataType customerTransactionData) {
    this.customerTransactionData = customerTransactionData;
  }

  public ItineraryInfo dateTimeDetails(DateAndTimeInformationType dateTimeDetails) {
    this.dateTimeDetails = dateTimeDetails;
    return this;
  }

  /**
   * Get dateTimeDetails
   * @return dateTimeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateAndTimeInformationType getDateTimeDetails() {
    return dateTimeDetails;
  }

  public void setDateTimeDetails(DateAndTimeInformationType dateTimeDetails) {
    this.dateTimeDetails = dateTimeDetails;
  }

  public ItineraryInfo distributionMethod(MethodType distributionMethod) {
    this.distributionMethod = distributionMethod;
    return this;
  }

  /**
   * Get distributionMethod
   * @return distributionMethod
  */
  @ApiModelProperty(value = "")

  @Valid

  public MethodType getDistributionMethod() {
    return distributionMethod;
  }

  public void setDistributionMethod(MethodType distributionMethod) {
    this.distributionMethod = distributionMethod;
  }

  public ItineraryInfo elementManagementItinerary(ElementManagementSegmentType elementManagementItinerary) {
    this.elementManagementItinerary = elementManagementItinerary;
    return this;
  }

  /**
   * Get elementManagementItinerary
   * @return elementManagementItinerary
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementSegmentType getElementManagementItinerary() {
    return elementManagementItinerary;
  }

  public void setElementManagementItinerary(ElementManagementSegmentType elementManagementItinerary) {
    this.elementManagementItinerary = elementManagementItinerary;
  }

  public ItineraryInfo elementsIndicators(StatusType elementsIndicators) {
    this.elementsIndicators = elementsIndicators;
    return this;
  }

  /**
   * Get elementsIndicators
   * @return elementsIndicators
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusType getElementsIndicators() {
    return elementsIndicators;
  }

  public void setElementsIndicators(StatusType elementsIndicators) {
    this.elementsIndicators = elementsIndicators;
  }

  public ItineraryInfo errorInfo(ErrorGroupType223552G errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }

  /**
   * Get errorInfo
   * @return errorInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorGroupType223552G getErrorInfo() {
    return errorInfo;
  }

  public void setErrorInfo(ErrorGroupType223552G errorInfo) {
    this.errorInfo = errorInfo;
  }

  public ItineraryInfo ferryLegInformation(FerryBookingDescriptionType ferryLegInformation) {
    this.ferryLegInformation = ferryLegInformation;
    return this;
  }

  /**
   * Get ferryLegInformation
   * @return ferryLegInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public FerryBookingDescriptionType getFerryLegInformation() {
    return ferryLegInformation;
  }

  public void setFerryLegInformation(FerryBookingDescriptionType ferryLegInformation) {
    this.ferryLegInformation = ferryLegInformation;
  }

  public ItineraryInfo flightDetail(AdditionalProductDetailsTypeI flightDetail) {
    this.flightDetail = flightDetail;
    return this;
  }

  /**
   * Get flightDetail
   * @return flightDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdditionalProductDetailsTypeI getFlightDetail() {
    return flightDetail;
  }

  public void setFlightDetail(AdditionalProductDetailsTypeI flightDetail) {
    this.flightDetail = flightDetail;
  }

  public ItineraryInfo flixInfo(List<FLIXType> flixInfo) {
    this.flixInfo = flixInfo;
    return this;
  }

  public ItineraryInfo addFlixInfoItem(FLIXType flixInfoItem) {
    if (this.flixInfo == null) {
      this.flixInfo = new ArrayList<>();
    }
    this.flixInfo.add(flixInfoItem);
    return this;
  }

  /**
   * Get flixInfo
   * @return flixInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FLIXType> getFlixInfo() {
    return flixInfo;
  }

  public void setFlixInfo(List<FLIXType> flixInfo) {
    this.flixInfo = flixInfo;
  }

  public ItineraryInfo generalOption(List<GeneralOptionType> generalOption) {
    this.generalOption = generalOption;
    return this;
  }

  public ItineraryInfo addGeneralOptionItem(GeneralOptionType generalOptionItem) {
    if (this.generalOption == null) {
      this.generalOption = new ArrayList<>();
    }
    this.generalOption.add(generalOptionItem);
    return this;
  }

  /**
   * Get generalOption
   * @return generalOption
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<GeneralOptionType> getGeneralOption() {
    return generalOption;
  }

  public void setGeneralOption(List<GeneralOptionType> generalOption) {
    this.generalOption = generalOption;
  }

  public ItineraryInfo hotelProduct(HotelProductInformationType hotelProduct) {
    this.hotelProduct = hotelProduct;
    return this;
  }

  /**
   * Get hotelProduct
   * @return hotelProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public HotelProductInformationType getHotelProduct() {
    return hotelProduct;
  }

  public void setHotelProduct(HotelProductInformationType hotelProduct) {
    this.hotelProduct = hotelProduct;
  }

  public ItineraryInfo hotelReservationInfo(HotelReservationInfo hotelReservationInfo) {
    this.hotelReservationInfo = hotelReservationInfo;
    return this;
  }

  /**
   * Get hotelReservationInfo
   * @return hotelReservationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public HotelReservationInfo getHotelReservationInfo() {
    return hotelReservationInfo;
  }

  public void setHotelReservationInfo(HotelReservationInfo hotelReservationInfo) {
    this.hotelReservationInfo = hotelReservationInfo;
  }

  public ItineraryInfo insuranceDetails(InsuranceBusinessDataType insuranceDetails) {
    this.insuranceDetails = insuranceDetails;
    return this;
  }

  /**
   * Get insuranceDetails
   * @return insuranceDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceBusinessDataType getInsuranceDetails() {
    return insuranceDetails;
  }

  public void setInsuranceDetails(InsuranceBusinessDataType insuranceDetails) {
    this.insuranceDetails = insuranceDetails;
  }

  public ItineraryInfo insuranceInformation(List<InsuranceInformation> insuranceInformation) {
    this.insuranceInformation = insuranceInformation;
    return this;
  }

  public ItineraryInfo addInsuranceInformationItem(InsuranceInformation insuranceInformationItem) {
    if (this.insuranceInformation == null) {
      this.insuranceInformation = new ArrayList<>();
    }
    this.insuranceInformation.add(insuranceInformationItem);
    return this;
  }

  /**
   * Get insuranceInformation
   * @return insuranceInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<InsuranceInformation> getInsuranceInformation() {
    return insuranceInformation;
  }

  public void setInsuranceInformation(List<InsuranceInformation> insuranceInformation) {
    this.insuranceInformation = insuranceInformation;
  }

  public ItineraryInfo itineraryFreetext(LongFreeTextType itineraryFreetext) {
    this.itineraryFreetext = itineraryFreetext;
    return this;
  }

  /**
   * Get itineraryFreetext
   * @return itineraryFreetext
  */
  @ApiModelProperty(value = "")

  @Valid

  public LongFreeTextType getItineraryFreetext() {
    return itineraryFreetext;
  }

  public void setItineraryFreetext(LongFreeTextType itineraryFreetext) {
    this.itineraryFreetext = itineraryFreetext;
  }

  public ItineraryInfo itineraryMessageAction(MessageActionDetailsType itineraryMessageAction) {
    this.itineraryMessageAction = itineraryMessageAction;
    return this;
  }

  /**
   * Get itineraryMessageAction
   * @return itineraryMessageAction
  */
  @ApiModelProperty(value = "")

  @Valid

  public MessageActionDetailsType getItineraryMessageAction() {
    return itineraryMessageAction;
  }

  public void setItineraryMessageAction(MessageActionDetailsType itineraryMessageAction) {
    this.itineraryMessageAction = itineraryMessageAction;
  }

  public ItineraryInfo itineraryReservationInfo(ReservationControlInformationTypeI196503S itineraryReservationInfo) {
    this.itineraryReservationInfo = itineraryReservationInfo;
    return this;
  }

  /**
   * Get itineraryReservationInfo
   * @return itineraryReservationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationControlInformationTypeI196503S getItineraryReservationInfo() {
    return itineraryReservationInfo;
  }

  public void setItineraryReservationInfo(ReservationControlInformationTypeI196503S itineraryReservationInfo) {
    this.itineraryReservationInfo = itineraryReservationInfo;
  }

  public ItineraryInfo itineraryfreeFormText(List<InteractiveFreeTextType> itineraryfreeFormText) {
    this.itineraryfreeFormText = itineraryfreeFormText;
    return this;
  }

  public ItineraryInfo addItineraryfreeFormTextItem(InteractiveFreeTextType itineraryfreeFormTextItem) {
    if (this.itineraryfreeFormText == null) {
      this.itineraryfreeFormText = new ArrayList<>();
    }
    this.itineraryfreeFormText.add(itineraryfreeFormTextItem);
    return this;
  }

  /**
   * Get itineraryfreeFormText
   * @return itineraryfreeFormText
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<InteractiveFreeTextType> getItineraryfreeFormText() {
    return itineraryfreeFormText;
  }

  public void setItineraryfreeFormText(List<InteractiveFreeTextType> itineraryfreeFormText) {
    this.itineraryfreeFormText = itineraryfreeFormText;
  }

  public ItineraryInfo lccTypicalData(LccTypicalData lccTypicalData) {
    this.lccTypicalData = lccTypicalData;
    return this;
  }

  /**
   * Get lccTypicalData
   * @return lccTypicalData
  */
  @ApiModelProperty(value = "")

  @Valid

  public LccTypicalData getLccTypicalData() {
    return lccTypicalData;
  }

  public void setLccTypicalData(LccTypicalData lccTypicalData) {
    this.lccTypicalData = lccTypicalData;
  }

  public ItineraryInfo legInfo(List<LegInfo> legInfo) {
    this.legInfo = legInfo;
    return this;
  }

  public ItineraryInfo addLegInfoItem(LegInfo legInfoItem) {
    if (this.legInfo == null) {
      this.legInfo = new ArrayList<>();
    }
    this.legInfo.add(legInfoItem);
    return this;
  }

  /**
   * Get legInfo
   * @return legInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<LegInfo> getLegInfo() {
    return legInfo;
  }

  public void setLegInfo(List<LegInfo> legInfo) {
    this.legInfo = legInfo;
  }

  public ItineraryInfo markerRailTour(Object markerRailTour) {
    this.markerRailTour = markerRailTour;
    return this;
  }

  /**
   * Get markerRailTour
   * @return markerRailTour
  */
  @ApiModelProperty(value = "")


  public Object getMarkerRailTour() {
    return markerRailTour;
  }

  public void setMarkerRailTour(Object markerRailTour) {
    this.markerRailTour = markerRailTour;
  }

  public ItineraryInfo railInfo(TrainInformationType railInfo) {
    this.railInfo = railInfo;
    return this;
  }

  /**
   * Get railInfo
   * @return railInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TrainInformationType getRailInfo() {
    return railInfo;
  }

  public void setRailInfo(TrainInformationType railInfo) {
    this.railInfo = railInfo;
  }

  public ItineraryInfo rateInformations(RateInformationType rateInformations) {
    this.rateInformations = rateInformations;
    return this;
  }

  /**
   * Get rateInformations
   * @return rateInformations
  */
  @ApiModelProperty(value = "")

  @Valid

  public RateInformationType getRateInformations() {
    return rateInformations;
  }

  public void setRateInformations(RateInformationType rateInformations) {
    this.rateInformations = rateInformations;
  }

  public ItineraryInfo reasonForIssuanceCode(PricingOrTicketingSubsequentType reasonForIssuanceCode) {
    this.reasonForIssuanceCode = reasonForIssuanceCode;
    return this;
  }

  /**
   * Get reasonForIssuanceCode
   * @return reasonForIssuanceCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public PricingOrTicketingSubsequentType getReasonForIssuanceCode() {
    return reasonForIssuanceCode;
  }

  public void setReasonForIssuanceCode(PricingOrTicketingSubsequentType reasonForIssuanceCode) {
    this.reasonForIssuanceCode = reasonForIssuanceCode;
  }

  public ItineraryInfo referenceForSegment(ReferenceInfoType referenceForSegment) {
    this.referenceForSegment = referenceForSegment;
    return this;
  }

  /**
   * Get referenceForSegment
   * @return referenceForSegment
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInfoType getReferenceForSegment() {
    return referenceForSegment;
  }

  public void setReferenceForSegment(ReferenceInfoType referenceForSegment) {
    this.referenceForSegment = referenceForSegment;
  }

  public ItineraryInfo relatedProduct(RelatedProductInformationTypeI relatedProduct) {
    this.relatedProduct = relatedProduct;
    return this;
  }

  /**
   * Get relatedProduct
   * @return relatedProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public RelatedProductInformationTypeI getRelatedProduct() {
    return relatedProduct;
  }

  public void setRelatedProduct(RelatedProductInformationTypeI relatedProduct) {
    this.relatedProduct = relatedProduct;
  }

  public ItineraryInfo segmentAttribute(CodedAttributeType213992S segmentAttribute) {
    this.segmentAttribute = segmentAttribute;
    return this;
  }

  /**
   * Get segmentAttribute
   * @return segmentAttribute
  */
  @ApiModelProperty(value = "")

  @Valid

  public CodedAttributeType213992S getSegmentAttribute() {
    return segmentAttribute;
  }

  public void setSegmentAttribute(CodedAttributeType213992S segmentAttribute) {
    this.segmentAttribute = segmentAttribute;
  }

  public ItineraryInfo selectionDetails(SelectionDetailsTypeI201122S selectionDetails) {
    this.selectionDetails = selectionDetails;
    return this;
  }

  /**
   * Get selectionDetails
   * @return selectionDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelectionDetailsTypeI201122S getSelectionDetails() {
    return selectionDetails;
  }

  public void setSelectionDetails(SelectionDetailsTypeI201122S selectionDetails) {
    this.selectionDetails = selectionDetails;
  }

  public ItineraryInfo taxInformation(List<TaxTypeI> taxInformation) {
    this.taxInformation = taxInformation;
    return this;
  }

  public ItineraryInfo addTaxInformationItem(TaxTypeI taxInformationItem) {
    if (this.taxInformation == null) {
      this.taxInformation = new ArrayList<>();
    }
    this.taxInformation.add(taxInformationItem);
    return this;
  }

  /**
   * Get taxInformation
   * @return taxInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TaxTypeI> getTaxInformation() {
    return taxInformation;
  }

  public void setTaxInformation(List<TaxTypeI> taxInformation) {
    this.taxInformation = taxInformation;
  }

  public ItineraryInfo tourInfo(TourInformationType tourInfo) {
    this.tourInfo = tourInfo;
    return this;
  }

  /**
   * Get tourInfo
   * @return tourInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TourInformationType getTourInfo() {
    return tourInfo;
  }

  public void setTourInfo(TourInformationType tourInfo) {
    this.tourInfo = tourInfo;
  }

  public ItineraryInfo travelProduct(TravelProductInformationTypeI193100S travelProduct) {
    this.travelProduct = travelProduct;
    return this;
  }

  /**
   * Get travelProduct
   * @return travelProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelProductInformationTypeI193100S getTravelProduct() {
    return travelProduct;
  }

  public void setTravelProduct(TravelProductInformationTypeI193100S travelProduct) {
    this.travelProduct = travelProduct;
  }

  public ItineraryInfo typicalCarData(TypicalCarData typicalCarData) {
    this.typicalCarData = typicalCarData;
    return this;
  }

  /**
   * Get typicalCarData
   * @return typicalCarData
  */
  @ApiModelProperty(value = "")

  @Valid

  public TypicalCarData getTypicalCarData() {
    return typicalCarData;
  }

  public void setTypicalCarData(TypicalCarData typicalCarData) {
    this.typicalCarData = typicalCarData;
  }

  public ItineraryInfo typicalCruiseData(CruiseBusinessDataType typicalCruiseData) {
    this.typicalCruiseData = typicalCruiseData;
    return this;
  }

  /**
   * Get typicalCruiseData
   * @return typicalCruiseData
  */
  @ApiModelProperty(value = "")

  @Valid

  public CruiseBusinessDataType getTypicalCruiseData() {
    return typicalCruiseData;
  }

  public void setTypicalCruiseData(CruiseBusinessDataType typicalCruiseData) {
    this.typicalCruiseData = typicalCruiseData;
  }

  public ItineraryInfo yieldGroup(YieldGroup yieldGroup) {
    this.yieldGroup = yieldGroup;
    return this;
  }

  /**
   * Get yieldGroup
   * @return yieldGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public YieldGroup getYieldGroup() {
    return yieldGroup;
  }

  public void setYieldGroup(YieldGroup yieldGroup) {
    this.yieldGroup = yieldGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItineraryInfo itineraryInfo = (ItineraryInfo) o;
    return Objects.equals(this.cabinDetails, itineraryInfo.cabinDetails) &&
        Objects.equals(this.carbonDioxydeInfo, itineraryInfo.carbonDioxydeInfo) &&
        Objects.equals(this.country, itineraryInfo.country) &&
        Objects.equals(this.customerTransactionData, itineraryInfo.customerTransactionData) &&
        Objects.equals(this.dateTimeDetails, itineraryInfo.dateTimeDetails) &&
        Objects.equals(this.distributionMethod, itineraryInfo.distributionMethod) &&
        Objects.equals(this.elementManagementItinerary, itineraryInfo.elementManagementItinerary) &&
        Objects.equals(this.elementsIndicators, itineraryInfo.elementsIndicators) &&
        Objects.equals(this.errorInfo, itineraryInfo.errorInfo) &&
        Objects.equals(this.ferryLegInformation, itineraryInfo.ferryLegInformation) &&
        Objects.equals(this.flightDetail, itineraryInfo.flightDetail) &&
        Objects.equals(this.flixInfo, itineraryInfo.flixInfo) &&
        Objects.equals(this.generalOption, itineraryInfo.generalOption) &&
        Objects.equals(this.hotelProduct, itineraryInfo.hotelProduct) &&
        Objects.equals(this.hotelReservationInfo, itineraryInfo.hotelReservationInfo) &&
        Objects.equals(this.insuranceDetails, itineraryInfo.insuranceDetails) &&
        Objects.equals(this.insuranceInformation, itineraryInfo.insuranceInformation) &&
        Objects.equals(this.itineraryFreetext, itineraryInfo.itineraryFreetext) &&
        Objects.equals(this.itineraryMessageAction, itineraryInfo.itineraryMessageAction) &&
        Objects.equals(this.itineraryReservationInfo, itineraryInfo.itineraryReservationInfo) &&
        Objects.equals(this.itineraryfreeFormText, itineraryInfo.itineraryfreeFormText) &&
        Objects.equals(this.lccTypicalData, itineraryInfo.lccTypicalData) &&
        Objects.equals(this.legInfo, itineraryInfo.legInfo) &&
        Objects.equals(this.markerRailTour, itineraryInfo.markerRailTour) &&
        Objects.equals(this.railInfo, itineraryInfo.railInfo) &&
        Objects.equals(this.rateInformations, itineraryInfo.rateInformations) &&
        Objects.equals(this.reasonForIssuanceCode, itineraryInfo.reasonForIssuanceCode) &&
        Objects.equals(this.referenceForSegment, itineraryInfo.referenceForSegment) &&
        Objects.equals(this.relatedProduct, itineraryInfo.relatedProduct) &&
        Objects.equals(this.segmentAttribute, itineraryInfo.segmentAttribute) &&
        Objects.equals(this.selectionDetails, itineraryInfo.selectionDetails) &&
        Objects.equals(this.taxInformation, itineraryInfo.taxInformation) &&
        Objects.equals(this.tourInfo, itineraryInfo.tourInfo) &&
        Objects.equals(this.travelProduct, itineraryInfo.travelProduct) &&
        Objects.equals(this.typicalCarData, itineraryInfo.typicalCarData) &&
        Objects.equals(this.typicalCruiseData, itineraryInfo.typicalCruiseData) &&
        Objects.equals(this.yieldGroup, itineraryInfo.yieldGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cabinDetails, carbonDioxydeInfo, country, customerTransactionData, dateTimeDetails, distributionMethod, elementManagementItinerary, elementsIndicators, errorInfo, ferryLegInformation, flightDetail, flixInfo, generalOption, hotelProduct, hotelReservationInfo, insuranceDetails, insuranceInformation, itineraryFreetext, itineraryMessageAction, itineraryReservationInfo, itineraryfreeFormText, lccTypicalData, legInfo, markerRailTour, railInfo, rateInformations, reasonForIssuanceCode, referenceForSegment, relatedProduct, segmentAttribute, selectionDetails, taxInformation, tourInfo, travelProduct, typicalCarData, typicalCruiseData, yieldGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItineraryInfo {\n");
    
    sb.append("    cabinDetails: ").append(toIndentedString(cabinDetails)).append("\n");
    sb.append("    carbonDioxydeInfo: ").append(toIndentedString(carbonDioxydeInfo)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    customerTransactionData: ").append(toIndentedString(customerTransactionData)).append("\n");
    sb.append("    dateTimeDetails: ").append(toIndentedString(dateTimeDetails)).append("\n");
    sb.append("    distributionMethod: ").append(toIndentedString(distributionMethod)).append("\n");
    sb.append("    elementManagementItinerary: ").append(toIndentedString(elementManagementItinerary)).append("\n");
    sb.append("    elementsIndicators: ").append(toIndentedString(elementsIndicators)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    ferryLegInformation: ").append(toIndentedString(ferryLegInformation)).append("\n");
    sb.append("    flightDetail: ").append(toIndentedString(flightDetail)).append("\n");
    sb.append("    flixInfo: ").append(toIndentedString(flixInfo)).append("\n");
    sb.append("    generalOption: ").append(toIndentedString(generalOption)).append("\n");
    sb.append("    hotelProduct: ").append(toIndentedString(hotelProduct)).append("\n");
    sb.append("    hotelReservationInfo: ").append(toIndentedString(hotelReservationInfo)).append("\n");
    sb.append("    insuranceDetails: ").append(toIndentedString(insuranceDetails)).append("\n");
    sb.append("    insuranceInformation: ").append(toIndentedString(insuranceInformation)).append("\n");
    sb.append("    itineraryFreetext: ").append(toIndentedString(itineraryFreetext)).append("\n");
    sb.append("    itineraryMessageAction: ").append(toIndentedString(itineraryMessageAction)).append("\n");
    sb.append("    itineraryReservationInfo: ").append(toIndentedString(itineraryReservationInfo)).append("\n");
    sb.append("    itineraryfreeFormText: ").append(toIndentedString(itineraryfreeFormText)).append("\n");
    sb.append("    lccTypicalData: ").append(toIndentedString(lccTypicalData)).append("\n");
    sb.append("    legInfo: ").append(toIndentedString(legInfo)).append("\n");
    sb.append("    markerRailTour: ").append(toIndentedString(markerRailTour)).append("\n");
    sb.append("    railInfo: ").append(toIndentedString(railInfo)).append("\n");
    sb.append("    rateInformations: ").append(toIndentedString(rateInformations)).append("\n");
    sb.append("    reasonForIssuanceCode: ").append(toIndentedString(reasonForIssuanceCode)).append("\n");
    sb.append("    referenceForSegment: ").append(toIndentedString(referenceForSegment)).append("\n");
    sb.append("    relatedProduct: ").append(toIndentedString(relatedProduct)).append("\n");
    sb.append("    segmentAttribute: ").append(toIndentedString(segmentAttribute)).append("\n");
    sb.append("    selectionDetails: ").append(toIndentedString(selectionDetails)).append("\n");
    sb.append("    taxInformation: ").append(toIndentedString(taxInformation)).append("\n");
    sb.append("    tourInfo: ").append(toIndentedString(tourInfo)).append("\n");
    sb.append("    travelProduct: ").append(toIndentedString(travelProduct)).append("\n");
    sb.append("    typicalCarData: ").append(toIndentedString(typicalCarData)).append("\n");
    sb.append("    typicalCruiseData: ").append(toIndentedString(typicalCruiseData)).append("\n");
    sb.append("    yieldGroup: ").append(toIndentedString(yieldGroup)).append("\n");
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

