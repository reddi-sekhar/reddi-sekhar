package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.CabinDetailsResponseDto;
import jp.co.ana.cas.b18.dto.response.CustomerTransactionDataResponseDto;
import jp.co.ana.cas.b18.dto.response.ElementManagementItineraryResponseDto;
import jp.co.ana.cas.b18.dto.response.FlightDetailResponseDto;
import jp.co.ana.cas.b18.dto.response.GeneralErrorInfoResponseDto;
import jp.co.ana.cas.b18.dto.response.ItineraryReservationInfoResponseDto;
import jp.co.ana.cas.b18.dto.response.ItineraryfreeFormTextResponseDto;
import jp.co.ana.cas.b18.dto.response.ItineraryfreeTextResponseDto;
import jp.co.ana.cas.b18.dto.response.LegInfoResponseDto;
import jp.co.ana.cas.b18.dto.response.ReferenceForSegmentResponseDto;
import jp.co.ana.cas.b18.dto.response.RelatedProductResponseDto;
import jp.co.ana.cas.b18.dto.response.TravelProductResponseDto;
import jp.co.ana.cas.b18.dto.response.TypicalCarDataResponseDto;
import jp.co.ana.cas.b18.dto.response.YieldGroupResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ItineraryInfoResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ItineraryInfoResponseDto   {
  @JsonProperty("elementManagementItinerary")
  private ElementManagementItineraryResponseDto elementManagementItinerary;

  @JsonProperty("travelProduct")
  private TravelProductResponseDto travelProduct;

  @JsonProperty("itineraryReservationInfo")
  private ItineraryReservationInfoResponseDto itineraryReservationInfo;

  @JsonProperty("relatedProduct")
  private RelatedProductResponseDto relatedProduct;

  @JsonProperty("flightDetail")
  private FlightDetailResponseDto flightDetail;

  @JsonProperty("cabinDetails")
  private CabinDetailsResponseDto cabinDetails;

  @JsonProperty("itineraryfreeFormText")
  @Valid
  private List<ItineraryfreeFormTextResponseDto> itineraryfreeFormText = null;

  @JsonProperty("itineraryFreetext")
  private ItineraryfreeTextResponseDto itineraryFreetext;

  @JsonProperty("customerTransactionData")
  private CustomerTransactionDataResponseDto customerTransactionData;

  @JsonProperty("yieldGroup")
  private YieldGroupResponseDto yieldGroup;

  @JsonProperty("legInfo")
  @Valid
  private List<LegInfoResponseDto> legInfo = null;

  @JsonProperty("typicalCarData")
  private TypicalCarDataResponseDto typicalCarData;

  @JsonProperty("errorInfo")
  private GeneralErrorInfoResponseDto errorInfo;

  @JsonProperty("referenceForSegment")
  private ReferenceForSegmentResponseDto referenceForSegment;

  public ItineraryInfoResponseDto elementManagementItinerary(ElementManagementItineraryResponseDto elementManagementItinerary) {
    this.elementManagementItinerary = elementManagementItinerary;
    return this;
  }

  /**
   * Get elementManagementItinerary
   * @return elementManagementItinerary
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementItineraryResponseDto getElementManagementItinerary() {
    return elementManagementItinerary;
  }

  public void setElementManagementItinerary(ElementManagementItineraryResponseDto elementManagementItinerary) {
    this.elementManagementItinerary = elementManagementItinerary;
  }

  public ItineraryInfoResponseDto travelProduct(TravelProductResponseDto travelProduct) {
    this.travelProduct = travelProduct;
    return this;
  }

  /**
   * Get travelProduct
   * @return travelProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelProductResponseDto getTravelProduct() {
    return travelProduct;
  }

  public void setTravelProduct(TravelProductResponseDto travelProduct) {
    this.travelProduct = travelProduct;
  }

  public ItineraryInfoResponseDto itineraryReservationInfo(ItineraryReservationInfoResponseDto itineraryReservationInfo) {
    this.itineraryReservationInfo = itineraryReservationInfo;
    return this;
  }

  /**
   * Get itineraryReservationInfo
   * @return itineraryReservationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItineraryReservationInfoResponseDto getItineraryReservationInfo() {
    return itineraryReservationInfo;
  }

  public void setItineraryReservationInfo(ItineraryReservationInfoResponseDto itineraryReservationInfo) {
    this.itineraryReservationInfo = itineraryReservationInfo;
  }

  public ItineraryInfoResponseDto relatedProduct(RelatedProductResponseDto relatedProduct) {
    this.relatedProduct = relatedProduct;
    return this;
  }

  /**
   * Get relatedProduct
   * @return relatedProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public RelatedProductResponseDto getRelatedProduct() {
    return relatedProduct;
  }

  public void setRelatedProduct(RelatedProductResponseDto relatedProduct) {
    this.relatedProduct = relatedProduct;
  }

  public ItineraryInfoResponseDto flightDetail(FlightDetailResponseDto flightDetail) {
    this.flightDetail = flightDetail;
    return this;
  }

  /**
   * Get flightDetail
   * @return flightDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public FlightDetailResponseDto getFlightDetail() {
    return flightDetail;
  }

  public void setFlightDetail(FlightDetailResponseDto flightDetail) {
    this.flightDetail = flightDetail;
  }

  public ItineraryInfoResponseDto cabinDetails(CabinDetailsResponseDto cabinDetails) {
    this.cabinDetails = cabinDetails;
    return this;
  }

  /**
   * Get cabinDetails
   * @return cabinDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CabinDetailsResponseDto getCabinDetails() {
    return cabinDetails;
  }

  public void setCabinDetails(CabinDetailsResponseDto cabinDetails) {
    this.cabinDetails = cabinDetails;
  }

  public ItineraryInfoResponseDto itineraryfreeFormText(List<ItineraryfreeFormTextResponseDto> itineraryfreeFormText) {
    this.itineraryfreeFormText = itineraryfreeFormText;
    return this;
  }

  public ItineraryInfoResponseDto addItineraryfreeFormTextItem(ItineraryfreeFormTextResponseDto itineraryfreeFormTextItem) {
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

  public List<ItineraryfreeFormTextResponseDto> getItineraryfreeFormText() {
    return itineraryfreeFormText;
  }

  public void setItineraryfreeFormText(List<ItineraryfreeFormTextResponseDto> itineraryfreeFormText) {
    this.itineraryfreeFormText = itineraryfreeFormText;
  }

  public ItineraryInfoResponseDto itineraryFreetext(ItineraryfreeTextResponseDto itineraryFreetext) {
    this.itineraryFreetext = itineraryFreetext;
    return this;
  }

  /**
   * Get itineraryFreetext
   * @return itineraryFreetext
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItineraryfreeTextResponseDto getItineraryFreetext() {
    return itineraryFreetext;
  }

  public void setItineraryFreetext(ItineraryfreeTextResponseDto itineraryFreetext) {
    this.itineraryFreetext = itineraryFreetext;
  }

  public ItineraryInfoResponseDto customerTransactionData(CustomerTransactionDataResponseDto customerTransactionData) {
    this.customerTransactionData = customerTransactionData;
    return this;
  }

  /**
   * Get customerTransactionData
   * @return customerTransactionData
  */
  @ApiModelProperty(value = "")

  @Valid

  public CustomerTransactionDataResponseDto getCustomerTransactionData() {
    return customerTransactionData;
  }

  public void setCustomerTransactionData(CustomerTransactionDataResponseDto customerTransactionData) {
    this.customerTransactionData = customerTransactionData;
  }

  public ItineraryInfoResponseDto yieldGroup(YieldGroupResponseDto yieldGroup) {
    this.yieldGroup = yieldGroup;
    return this;
  }

  /**
   * Get yieldGroup
   * @return yieldGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public YieldGroupResponseDto getYieldGroup() {
    return yieldGroup;
  }

  public void setYieldGroup(YieldGroupResponseDto yieldGroup) {
    this.yieldGroup = yieldGroup;
  }

  public ItineraryInfoResponseDto legInfo(List<LegInfoResponseDto> legInfo) {
    this.legInfo = legInfo;
    return this;
  }

  public ItineraryInfoResponseDto addLegInfoItem(LegInfoResponseDto legInfoItem) {
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

  public List<LegInfoResponseDto> getLegInfo() {
    return legInfo;
  }

  public void setLegInfo(List<LegInfoResponseDto> legInfo) {
    this.legInfo = legInfo;
  }

  public ItineraryInfoResponseDto typicalCarData(TypicalCarDataResponseDto typicalCarData) {
    this.typicalCarData = typicalCarData;
    return this;
  }

  /**
   * Get typicalCarData
   * @return typicalCarData
  */
  @ApiModelProperty(value = "")

  @Valid

  public TypicalCarDataResponseDto getTypicalCarData() {
    return typicalCarData;
  }

  public void setTypicalCarData(TypicalCarDataResponseDto typicalCarData) {
    this.typicalCarData = typicalCarData;
  }

  public ItineraryInfoResponseDto errorInfo(GeneralErrorInfoResponseDto errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }

  /**
   * Get errorInfo
   * @return errorInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public GeneralErrorInfoResponseDto getErrorInfo() {
    return errorInfo;
  }

  public void setErrorInfo(GeneralErrorInfoResponseDto errorInfo) {
    this.errorInfo = errorInfo;
  }

  public ItineraryInfoResponseDto referenceForSegment(ReferenceForSegmentResponseDto referenceForSegment) {
    this.referenceForSegment = referenceForSegment;
    return this;
  }

  /**
   * Get referenceForSegment
   * @return referenceForSegment
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceForSegmentResponseDto getReferenceForSegment() {
    return referenceForSegment;
  }

  public void setReferenceForSegment(ReferenceForSegmentResponseDto referenceForSegment) {
    this.referenceForSegment = referenceForSegment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItineraryInfoResponseDto itineraryInfoResponseDto = (ItineraryInfoResponseDto) o;
    return Objects.equals(this.elementManagementItinerary, itineraryInfoResponseDto.elementManagementItinerary) &&
        Objects.equals(this.travelProduct, itineraryInfoResponseDto.travelProduct) &&
        Objects.equals(this.itineraryReservationInfo, itineraryInfoResponseDto.itineraryReservationInfo) &&
        Objects.equals(this.relatedProduct, itineraryInfoResponseDto.relatedProduct) &&
        Objects.equals(this.flightDetail, itineraryInfoResponseDto.flightDetail) &&
        Objects.equals(this.cabinDetails, itineraryInfoResponseDto.cabinDetails) &&
        Objects.equals(this.itineraryfreeFormText, itineraryInfoResponseDto.itineraryfreeFormText) &&
        Objects.equals(this.itineraryFreetext, itineraryInfoResponseDto.itineraryFreetext) &&
        Objects.equals(this.customerTransactionData, itineraryInfoResponseDto.customerTransactionData) &&
        Objects.equals(this.yieldGroup, itineraryInfoResponseDto.yieldGroup) &&
        Objects.equals(this.legInfo, itineraryInfoResponseDto.legInfo) &&
        Objects.equals(this.typicalCarData, itineraryInfoResponseDto.typicalCarData) &&
        Objects.equals(this.errorInfo, itineraryInfoResponseDto.errorInfo) &&
        Objects.equals(this.referenceForSegment, itineraryInfoResponseDto.referenceForSegment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementManagementItinerary, travelProduct, itineraryReservationInfo, relatedProduct, flightDetail, cabinDetails, itineraryfreeFormText, itineraryFreetext, customerTransactionData, yieldGroup, legInfo, typicalCarData, errorInfo, referenceForSegment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItineraryInfoResponseDto {\n");
    
    sb.append("    elementManagementItinerary: ").append(toIndentedString(elementManagementItinerary)).append("\n");
    sb.append("    travelProduct: ").append(toIndentedString(travelProduct)).append("\n");
    sb.append("    itineraryReservationInfo: ").append(toIndentedString(itineraryReservationInfo)).append("\n");
    sb.append("    relatedProduct: ").append(toIndentedString(relatedProduct)).append("\n");
    sb.append("    flightDetail: ").append(toIndentedString(flightDetail)).append("\n");
    sb.append("    cabinDetails: ").append(toIndentedString(cabinDetails)).append("\n");
    sb.append("    itineraryfreeFormText: ").append(toIndentedString(itineraryfreeFormText)).append("\n");
    sb.append("    itineraryFreetext: ").append(toIndentedString(itineraryFreetext)).append("\n");
    sb.append("    customerTransactionData: ").append(toIndentedString(customerTransactionData)).append("\n");
    sb.append("    yieldGroup: ").append(toIndentedString(yieldGroup)).append("\n");
    sb.append("    legInfo: ").append(toIndentedString(legInfo)).append("\n");
    sb.append("    typicalCarData: ").append(toIndentedString(typicalCarData)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    referenceForSegment: ").append(toIndentedString(referenceForSegment)).append("\n");
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

