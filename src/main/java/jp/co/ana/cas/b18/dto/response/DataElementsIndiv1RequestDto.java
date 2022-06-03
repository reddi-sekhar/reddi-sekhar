package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.AccessLevel1RequestDto;
import jp.co.ana.cas.b18.dto.response.CommissionElementRequestDto;
import jp.co.ana.cas.b18.dto.response.ElementManagementPassenger1RequestDto;
import jp.co.ana.cas.b18.dto.response.FareElementsRequestDto;
import jp.co.ana.cas.b18.dto.response.FreetextItinerary1RequestDto;
import jp.co.ana.cas.b18.dto.response.FrequentTravellerDataRequestDto;
import jp.co.ana.cas.b18.dto.response.MiscellaneousRemarks1RequestDto;
import jp.co.ana.cas.b18.dto.response.OptionElement1RequestDto;
import jp.co.ana.cas.b18.dto.response.OriginalIssueRequestDto;
import jp.co.ana.cas.b18.dto.response.ReferenceForSegment1RequestDto;
import jp.co.ana.cas.b18.dto.response.SeatGroupRequestDto;
import jp.co.ana.cas.b18.dto.response.ServiceDetails1RequestDto;
import jp.co.ana.cas.b18.dto.response.ServiceRequest1RequestDto;
import jp.co.ana.cas.b18.dto.response.TicketElement1RequestDto;
import jp.co.ana.cas.b18.dto.response.TicketingCarrierRequestDto;
import jp.co.ana.cas.b18.dto.response.TourCodeTypeRequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataElementsIndiv1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DataElementsIndiv1RequestDto   {
  @JsonProperty("accessLevel")
  private AccessLevel1RequestDto accessLevel;

  @JsonProperty("commission")
  private CommissionElementRequestDto commission;

  @JsonProperty("elementManagementData")
  private ElementManagementPassenger1RequestDto elementManagementData;

  @JsonProperty("fareElement")
  private FareElementsRequestDto fareElement;

  @JsonProperty("freetextData")
  private FreetextItinerary1RequestDto freetextData;

  @JsonProperty("frequentTravellerData")
  private FrequentTravellerDataRequestDto frequentTravellerData;

  @JsonProperty("miscellaneousRemark")
  private MiscellaneousRemarks1RequestDto miscellaneousRemark;

  @JsonProperty("optionElement")
  private OptionElement1RequestDto optionElement;

  @JsonProperty("originalIssue")
  private OriginalIssueRequestDto originalIssue;

  @JsonProperty("referenceForDataElement")
  private ReferenceForSegment1RequestDto referenceForDataElement;

  @JsonProperty("seatGroup")
  private SeatGroupRequestDto seatGroup;

  @JsonProperty("serviceDetails")
  @Valid
  private List<ServiceDetails1RequestDto> serviceDetails = null;

  @JsonProperty("serviceRequest")
  private ServiceRequest1RequestDto serviceRequest;

  @JsonProperty("ticketElement")
  private TicketElement1RequestDto ticketElement;

  @JsonProperty("ticketingCarrier")
  private TicketingCarrierRequestDto ticketingCarrier;

  @JsonProperty("tourCode")
  private TourCodeTypeRequestDto tourCode;

  public DataElementsIndiv1RequestDto accessLevel(AccessLevel1RequestDto accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * Get accessLevel
   * @return accessLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccessLevel1RequestDto getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(AccessLevel1RequestDto accessLevel) {
    this.accessLevel = accessLevel;
  }

  public DataElementsIndiv1RequestDto commission(CommissionElementRequestDto commission) {
    this.commission = commission;
    return this;
  }

  /**
   * Get commission
   * @return commission
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommissionElementRequestDto getCommission() {
    return commission;
  }

  public void setCommission(CommissionElementRequestDto commission) {
    this.commission = commission;
  }

  public DataElementsIndiv1RequestDto elementManagementData(ElementManagementPassenger1RequestDto elementManagementData) {
    this.elementManagementData = elementManagementData;
    return this;
  }

  /**
   * Get elementManagementData
   * @return elementManagementData
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementPassenger1RequestDto getElementManagementData() {
    return elementManagementData;
  }

  public void setElementManagementData(ElementManagementPassenger1RequestDto elementManagementData) {
    this.elementManagementData = elementManagementData;
  }

  public DataElementsIndiv1RequestDto fareElement(FareElementsRequestDto fareElement) {
    this.fareElement = fareElement;
    return this;
  }

  /**
   * Get fareElement
   * @return fareElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public FareElementsRequestDto getFareElement() {
    return fareElement;
  }

  public void setFareElement(FareElementsRequestDto fareElement) {
    this.fareElement = fareElement;
  }

  public DataElementsIndiv1RequestDto freetextData(FreetextItinerary1RequestDto freetextData) {
    this.freetextData = freetextData;
    return this;
  }

  /**
   * Get freetextData
   * @return freetextData
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreetextItinerary1RequestDto getFreetextData() {
    return freetextData;
  }

  public void setFreetextData(FreetextItinerary1RequestDto freetextData) {
    this.freetextData = freetextData;
  }

  public DataElementsIndiv1RequestDto frequentTravellerData(FrequentTravellerDataRequestDto frequentTravellerData) {
    this.frequentTravellerData = frequentTravellerData;
    return this;
  }

  /**
   * Get frequentTravellerData
   * @return frequentTravellerData
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravellerDataRequestDto getFrequentTravellerData() {
    return frequentTravellerData;
  }

  public void setFrequentTravellerData(FrequentTravellerDataRequestDto frequentTravellerData) {
    this.frequentTravellerData = frequentTravellerData;
  }

  public DataElementsIndiv1RequestDto miscellaneousRemark(MiscellaneousRemarks1RequestDto miscellaneousRemark) {
    this.miscellaneousRemark = miscellaneousRemark;
    return this;
  }

  /**
   * Get miscellaneousRemark
   * @return miscellaneousRemark
  */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousRemarks1RequestDto getMiscellaneousRemark() {
    return miscellaneousRemark;
  }

  public void setMiscellaneousRemark(MiscellaneousRemarks1RequestDto miscellaneousRemark) {
    this.miscellaneousRemark = miscellaneousRemark;
  }

  public DataElementsIndiv1RequestDto optionElement(OptionElement1RequestDto optionElement) {
    this.optionElement = optionElement;
    return this;
  }

  /**
   * Get optionElement
   * @return optionElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public OptionElement1RequestDto getOptionElement() {
    return optionElement;
  }

  public void setOptionElement(OptionElement1RequestDto optionElement) {
    this.optionElement = optionElement;
  }

  public DataElementsIndiv1RequestDto originalIssue(OriginalIssueRequestDto originalIssue) {
    this.originalIssue = originalIssue;
    return this;
  }

  /**
   * Get originalIssue
   * @return originalIssue
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginalIssueRequestDto getOriginalIssue() {
    return originalIssue;
  }

  public void setOriginalIssue(OriginalIssueRequestDto originalIssue) {
    this.originalIssue = originalIssue;
  }

  public DataElementsIndiv1RequestDto referenceForDataElement(ReferenceForSegment1RequestDto referenceForDataElement) {
    this.referenceForDataElement = referenceForDataElement;
    return this;
  }

  /**
   * Get referenceForDataElement
   * @return referenceForDataElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceForSegment1RequestDto getReferenceForDataElement() {
    return referenceForDataElement;
  }

  public void setReferenceForDataElement(ReferenceForSegment1RequestDto referenceForDataElement) {
    this.referenceForDataElement = referenceForDataElement;
  }

  public DataElementsIndiv1RequestDto seatGroup(SeatGroupRequestDto seatGroup) {
    this.seatGroup = seatGroup;
    return this;
  }

  /**
   * Get seatGroup
   * @return seatGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public SeatGroupRequestDto getSeatGroup() {
    return seatGroup;
  }

  public void setSeatGroup(SeatGroupRequestDto seatGroup) {
    this.seatGroup = seatGroup;
  }

  public DataElementsIndiv1RequestDto serviceDetails(List<ServiceDetails1RequestDto> serviceDetails) {
    this.serviceDetails = serviceDetails;
    return this;
  }

  public DataElementsIndiv1RequestDto addServiceDetailsItem(ServiceDetails1RequestDto serviceDetailsItem) {
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

  public List<ServiceDetails1RequestDto> getServiceDetails() {
    return serviceDetails;
  }

  public void setServiceDetails(List<ServiceDetails1RequestDto> serviceDetails) {
    this.serviceDetails = serviceDetails;
  }

  public DataElementsIndiv1RequestDto serviceRequest(ServiceRequest1RequestDto serviceRequest) {
    this.serviceRequest = serviceRequest;
    return this;
  }

  /**
   * Get serviceRequest
   * @return serviceRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceRequest1RequestDto getServiceRequest() {
    return serviceRequest;
  }

  public void setServiceRequest(ServiceRequest1RequestDto serviceRequest) {
    this.serviceRequest = serviceRequest;
  }

  public DataElementsIndiv1RequestDto ticketElement(TicketElement1RequestDto ticketElement) {
    this.ticketElement = ticketElement;
    return this;
  }

  /**
   * Get ticketElement
   * @return ticketElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketElement1RequestDto getTicketElement() {
    return ticketElement;
  }

  public void setTicketElement(TicketElement1RequestDto ticketElement) {
    this.ticketElement = ticketElement;
  }

  public DataElementsIndiv1RequestDto ticketingCarrier(TicketingCarrierRequestDto ticketingCarrier) {
    this.ticketingCarrier = ticketingCarrier;
    return this;
  }

  /**
   * Get ticketingCarrier
   * @return ticketingCarrier
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketingCarrierRequestDto getTicketingCarrier() {
    return ticketingCarrier;
  }

  public void setTicketingCarrier(TicketingCarrierRequestDto ticketingCarrier) {
    this.ticketingCarrier = ticketingCarrier;
  }

  public DataElementsIndiv1RequestDto tourCode(TourCodeTypeRequestDto tourCode) {
    this.tourCode = tourCode;
    return this;
  }

  /**
   * Get tourCode
   * @return tourCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public TourCodeTypeRequestDto getTourCode() {
    return tourCode;
  }

  public void setTourCode(TourCodeTypeRequestDto tourCode) {
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
    DataElementsIndiv1RequestDto dataElementsIndiv1RequestDto = (DataElementsIndiv1RequestDto) o;
    return Objects.equals(this.accessLevel, dataElementsIndiv1RequestDto.accessLevel) &&
        Objects.equals(this.commission, dataElementsIndiv1RequestDto.commission) &&
        Objects.equals(this.elementManagementData, dataElementsIndiv1RequestDto.elementManagementData) &&
        Objects.equals(this.fareElement, dataElementsIndiv1RequestDto.fareElement) &&
        Objects.equals(this.freetextData, dataElementsIndiv1RequestDto.freetextData) &&
        Objects.equals(this.frequentTravellerData, dataElementsIndiv1RequestDto.frequentTravellerData) &&
        Objects.equals(this.miscellaneousRemark, dataElementsIndiv1RequestDto.miscellaneousRemark) &&
        Objects.equals(this.optionElement, dataElementsIndiv1RequestDto.optionElement) &&
        Objects.equals(this.originalIssue, dataElementsIndiv1RequestDto.originalIssue) &&
        Objects.equals(this.referenceForDataElement, dataElementsIndiv1RequestDto.referenceForDataElement) &&
        Objects.equals(this.seatGroup, dataElementsIndiv1RequestDto.seatGroup) &&
        Objects.equals(this.serviceDetails, dataElementsIndiv1RequestDto.serviceDetails) &&
        Objects.equals(this.serviceRequest, dataElementsIndiv1RequestDto.serviceRequest) &&
        Objects.equals(this.ticketElement, dataElementsIndiv1RequestDto.ticketElement) &&
        Objects.equals(this.ticketingCarrier, dataElementsIndiv1RequestDto.ticketingCarrier) &&
        Objects.equals(this.tourCode, dataElementsIndiv1RequestDto.tourCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel, commission, elementManagementData, fareElement, freetextData, frequentTravellerData, miscellaneousRemark, optionElement, originalIssue, referenceForDataElement, seatGroup, serviceDetails, serviceRequest, ticketElement, ticketingCarrier, tourCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataElementsIndiv1RequestDto {\n");
    
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    elementManagementData: ").append(toIndentedString(elementManagementData)).append("\n");
    sb.append("    fareElement: ").append(toIndentedString(fareElement)).append("\n");
    sb.append("    freetextData: ").append(toIndentedString(freetextData)).append("\n");
    sb.append("    frequentTravellerData: ").append(toIndentedString(frequentTravellerData)).append("\n");
    sb.append("    miscellaneousRemark: ").append(toIndentedString(miscellaneousRemark)).append("\n");
    sb.append("    optionElement: ").append(toIndentedString(optionElement)).append("\n");
    sb.append("    originalIssue: ").append(toIndentedString(originalIssue)).append("\n");
    sb.append("    referenceForDataElement: ").append(toIndentedString(referenceForDataElement)).append("\n");
    sb.append("    seatGroup: ").append(toIndentedString(seatGroup)).append("\n");
    sb.append("    serviceDetails: ").append(toIndentedString(serviceDetails)).append("\n");
    sb.append("    serviceRequest: ").append(toIndentedString(serviceRequest)).append("\n");
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

