package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.AccessLevelResponseDto;
import jp.co.ana.cas.b18.dto.response.ElementErrorInformationResponseDto;
import jp.co.ana.cas.b18.dto.response.ElementManagementPassengerResponseDto;
import jp.co.ana.cas.b18.dto.response.ElementsIndicatorsResponseDto;
import jp.co.ana.cas.b18.dto.response.EltPosDetailsResponseDto;
import jp.co.ana.cas.b18.dto.response.ExtendedRemarkResponseDto;
import jp.co.ana.cas.b18.dto.response.FrequentFlyerInformationGroupResponseDto;
import jp.co.ana.cas.b18.dto.response.MiscellaneousRemarksResponseDto;
import jp.co.ana.cas.b18.dto.response.OptionElementResponseDto;
import jp.co.ana.cas.b18.dto.response.OtherDataFreetextResponseDto;
import jp.co.ana.cas.b18.dto.response.PnrSecurityResponseDto;
import jp.co.ana.cas.b18.dto.response.ReferenceForSegmentResponseDto;
import jp.co.ana.cas.b18.dto.response.ReferencedRecordResponseDto;
import jp.co.ana.cas.b18.dto.response.SeatPaxInfoResponseDto;
import jp.co.ana.cas.b18.dto.response.ServiceRequestResponseDto;
import jp.co.ana.cas.b18.dto.response.StructuredFopResponseDto;
import jp.co.ana.cas.b18.dto.response.TicketElementResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataElementsIndivResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DataElementsIndivResponseDto   {
  @JsonProperty("elementManagementData")
  private ElementManagementPassengerResponseDto elementManagementData;

  @JsonProperty("pnrSecurity")
  private PnrSecurityResponseDto pnrSecurity;

  @JsonProperty("miscellaneousRemarks")
  private MiscellaneousRemarksResponseDto miscellaneousRemarks;

  @JsonProperty("extendedRemark")
  private ExtendedRemarkResponseDto extendedRemark;

  @JsonProperty("serviceRequest")
  private ServiceRequestResponseDto serviceRequest;

  @JsonProperty("seatPaxInfo")
  @Valid
  private List<SeatPaxInfoResponseDto> seatPaxInfo = null;

  @JsonProperty("frequentFlyerInformationGroup")
  private FrequentFlyerInformationGroupResponseDto frequentFlyerInformationGroup;

  @JsonProperty("ticketElement")
  private TicketElementResponseDto ticketElement;

  @JsonProperty("referencedRecord")
  private ReferencedRecordResponseDto referencedRecord;

  @JsonProperty("optionElement")
  private OptionElementResponseDto optionElement;

  @JsonProperty("otherDataFreetext")
  @Valid
  private List<OtherDataFreetextResponseDto> otherDataFreetext = null;

  @JsonProperty("elementErrorInformation")
  private ElementErrorInformationResponseDto elementErrorInformation;

  @JsonProperty("elementsIndicators")
  @Valid
  private List<ElementsIndicatorsResponseDto> elementsIndicators = null;

  @JsonProperty("eltPosDetails")
  private EltPosDetailsResponseDto eltPosDetails;

  @JsonProperty("accessLevel")
  @Valid
  private List<AccessLevelResponseDto> accessLevel = null;

  @JsonProperty("referenceForDataElement")
  private ReferenceForSegmentResponseDto referenceForDataElement;

  @JsonProperty("structuredFop")
  @Valid
  private List<StructuredFopResponseDto> structuredFop = null;

  public DataElementsIndivResponseDto elementManagementData(ElementManagementPassengerResponseDto elementManagementData) {
    this.elementManagementData = elementManagementData;
    return this;
  }

  /**
   * Get elementManagementData
   * @return elementManagementData
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementManagementPassengerResponseDto getElementManagementData() {
    return elementManagementData;
  }

  public void setElementManagementData(ElementManagementPassengerResponseDto elementManagementData) {
    this.elementManagementData = elementManagementData;
  }

  public DataElementsIndivResponseDto pnrSecurity(PnrSecurityResponseDto pnrSecurity) {
    this.pnrSecurity = pnrSecurity;
    return this;
  }

  /**
   * Get pnrSecurity
   * @return pnrSecurity
  */
  @ApiModelProperty(value = "")

  @Valid

  public PnrSecurityResponseDto getPnrSecurity() {
    return pnrSecurity;
  }

  public void setPnrSecurity(PnrSecurityResponseDto pnrSecurity) {
    this.pnrSecurity = pnrSecurity;
  }

  public DataElementsIndivResponseDto miscellaneousRemarks(MiscellaneousRemarksResponseDto miscellaneousRemarks) {
    this.miscellaneousRemarks = miscellaneousRemarks;
    return this;
  }

  /**
   * Get miscellaneousRemarks
   * @return miscellaneousRemarks
  */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousRemarksResponseDto getMiscellaneousRemarks() {
    return miscellaneousRemarks;
  }

  public void setMiscellaneousRemarks(MiscellaneousRemarksResponseDto miscellaneousRemarks) {
    this.miscellaneousRemarks = miscellaneousRemarks;
  }

  public DataElementsIndivResponseDto extendedRemark(ExtendedRemarkResponseDto extendedRemark) {
    this.extendedRemark = extendedRemark;
    return this;
  }

  /**
   * Get extendedRemark
   * @return extendedRemark
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExtendedRemarkResponseDto getExtendedRemark() {
    return extendedRemark;
  }

  public void setExtendedRemark(ExtendedRemarkResponseDto extendedRemark) {
    this.extendedRemark = extendedRemark;
  }

  public DataElementsIndivResponseDto serviceRequest(ServiceRequestResponseDto serviceRequest) {
    this.serviceRequest = serviceRequest;
    return this;
  }

  /**
   * Get serviceRequest
   * @return serviceRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceRequestResponseDto getServiceRequest() {
    return serviceRequest;
  }

  public void setServiceRequest(ServiceRequestResponseDto serviceRequest) {
    this.serviceRequest = serviceRequest;
  }

  public DataElementsIndivResponseDto seatPaxInfo(List<SeatPaxInfoResponseDto> seatPaxInfo) {
    this.seatPaxInfo = seatPaxInfo;
    return this;
  }

  public DataElementsIndivResponseDto addSeatPaxInfoItem(SeatPaxInfoResponseDto seatPaxInfoItem) {
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

  public List<SeatPaxInfoResponseDto> getSeatPaxInfo() {
    return seatPaxInfo;
  }

  public void setSeatPaxInfo(List<SeatPaxInfoResponseDto> seatPaxInfo) {
    this.seatPaxInfo = seatPaxInfo;
  }

  public DataElementsIndivResponseDto frequentFlyerInformationGroup(FrequentFlyerInformationGroupResponseDto frequentFlyerInformationGroup) {
    this.frequentFlyerInformationGroup = frequentFlyerInformationGroup;
    return this;
  }

  /**
   * Get frequentFlyerInformationGroup
   * @return frequentFlyerInformationGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentFlyerInformationGroupResponseDto getFrequentFlyerInformationGroup() {
    return frequentFlyerInformationGroup;
  }

  public void setFrequentFlyerInformationGroup(FrequentFlyerInformationGroupResponseDto frequentFlyerInformationGroup) {
    this.frequentFlyerInformationGroup = frequentFlyerInformationGroup;
  }

  public DataElementsIndivResponseDto ticketElement(TicketElementResponseDto ticketElement) {
    this.ticketElement = ticketElement;
    return this;
  }

  /**
   * Get ticketElement
   * @return ticketElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketElementResponseDto getTicketElement() {
    return ticketElement;
  }

  public void setTicketElement(TicketElementResponseDto ticketElement) {
    this.ticketElement = ticketElement;
  }

  public DataElementsIndivResponseDto referencedRecord(ReferencedRecordResponseDto referencedRecord) {
    this.referencedRecord = referencedRecord;
    return this;
  }

  /**
   * Get referencedRecord
   * @return referencedRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferencedRecordResponseDto getReferencedRecord() {
    return referencedRecord;
  }

  public void setReferencedRecord(ReferencedRecordResponseDto referencedRecord) {
    this.referencedRecord = referencedRecord;
  }

  public DataElementsIndivResponseDto optionElement(OptionElementResponseDto optionElement) {
    this.optionElement = optionElement;
    return this;
  }

  /**
   * Get optionElement
   * @return optionElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public OptionElementResponseDto getOptionElement() {
    return optionElement;
  }

  public void setOptionElement(OptionElementResponseDto optionElement) {
    this.optionElement = optionElement;
  }

  public DataElementsIndivResponseDto otherDataFreetext(List<OtherDataFreetextResponseDto> otherDataFreetext) {
    this.otherDataFreetext = otherDataFreetext;
    return this;
  }

  public DataElementsIndivResponseDto addOtherDataFreetextItem(OtherDataFreetextResponseDto otherDataFreetextItem) {
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

  public List<OtherDataFreetextResponseDto> getOtherDataFreetext() {
    return otherDataFreetext;
  }

  public void setOtherDataFreetext(List<OtherDataFreetextResponseDto> otherDataFreetext) {
    this.otherDataFreetext = otherDataFreetext;
  }

  public DataElementsIndivResponseDto elementErrorInformation(ElementErrorInformationResponseDto elementErrorInformation) {
    this.elementErrorInformation = elementErrorInformation;
    return this;
  }

  /**
   * Get elementErrorInformation
   * @return elementErrorInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ElementErrorInformationResponseDto getElementErrorInformation() {
    return elementErrorInformation;
  }

  public void setElementErrorInformation(ElementErrorInformationResponseDto elementErrorInformation) {
    this.elementErrorInformation = elementErrorInformation;
  }

  public DataElementsIndivResponseDto elementsIndicators(List<ElementsIndicatorsResponseDto> elementsIndicators) {
    this.elementsIndicators = elementsIndicators;
    return this;
  }

  public DataElementsIndivResponseDto addElementsIndicatorsItem(ElementsIndicatorsResponseDto elementsIndicatorsItem) {
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

  public List<ElementsIndicatorsResponseDto> getElementsIndicators() {
    return elementsIndicators;
  }

  public void setElementsIndicators(List<ElementsIndicatorsResponseDto> elementsIndicators) {
    this.elementsIndicators = elementsIndicators;
  }

  public DataElementsIndivResponseDto eltPosDetails(EltPosDetailsResponseDto eltPosDetails) {
    this.eltPosDetails = eltPosDetails;
    return this;
  }

  /**
   * Get eltPosDetails
   * @return eltPosDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public EltPosDetailsResponseDto getEltPosDetails() {
    return eltPosDetails;
  }

  public void setEltPosDetails(EltPosDetailsResponseDto eltPosDetails) {
    this.eltPosDetails = eltPosDetails;
  }

  public DataElementsIndivResponseDto accessLevel(List<AccessLevelResponseDto> accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  public DataElementsIndivResponseDto addAccessLevelItem(AccessLevelResponseDto accessLevelItem) {
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

  public List<AccessLevelResponseDto> getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(List<AccessLevelResponseDto> accessLevel) {
    this.accessLevel = accessLevel;
  }

  public DataElementsIndivResponseDto referenceForDataElement(ReferenceForSegmentResponseDto referenceForDataElement) {
    this.referenceForDataElement = referenceForDataElement;
    return this;
  }

  /**
   * Get referenceForDataElement
   * @return referenceForDataElement
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceForSegmentResponseDto getReferenceForDataElement() {
    return referenceForDataElement;
  }

  public void setReferenceForDataElement(ReferenceForSegmentResponseDto referenceForDataElement) {
    this.referenceForDataElement = referenceForDataElement;
  }

  public DataElementsIndivResponseDto structuredFop(List<StructuredFopResponseDto> structuredFop) {
    this.structuredFop = structuredFop;
    return this;
  }

  public DataElementsIndivResponseDto addStructuredFopItem(StructuredFopResponseDto structuredFopItem) {
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

  public List<StructuredFopResponseDto> getStructuredFop() {
    return structuredFop;
  }

  public void setStructuredFop(List<StructuredFopResponseDto> structuredFop) {
    this.structuredFop = structuredFop;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataElementsIndivResponseDto dataElementsIndivResponseDto = (DataElementsIndivResponseDto) o;
    return Objects.equals(this.elementManagementData, dataElementsIndivResponseDto.elementManagementData) &&
        Objects.equals(this.pnrSecurity, dataElementsIndivResponseDto.pnrSecurity) &&
        Objects.equals(this.miscellaneousRemarks, dataElementsIndivResponseDto.miscellaneousRemarks) &&
        Objects.equals(this.extendedRemark, dataElementsIndivResponseDto.extendedRemark) &&
        Objects.equals(this.serviceRequest, dataElementsIndivResponseDto.serviceRequest) &&
        Objects.equals(this.seatPaxInfo, dataElementsIndivResponseDto.seatPaxInfo) &&
        Objects.equals(this.frequentFlyerInformationGroup, dataElementsIndivResponseDto.frequentFlyerInformationGroup) &&
        Objects.equals(this.ticketElement, dataElementsIndivResponseDto.ticketElement) &&
        Objects.equals(this.referencedRecord, dataElementsIndivResponseDto.referencedRecord) &&
        Objects.equals(this.optionElement, dataElementsIndivResponseDto.optionElement) &&
        Objects.equals(this.otherDataFreetext, dataElementsIndivResponseDto.otherDataFreetext) &&
        Objects.equals(this.elementErrorInformation, dataElementsIndivResponseDto.elementErrorInformation) &&
        Objects.equals(this.elementsIndicators, dataElementsIndivResponseDto.elementsIndicators) &&
        Objects.equals(this.eltPosDetails, dataElementsIndivResponseDto.eltPosDetails) &&
        Objects.equals(this.accessLevel, dataElementsIndivResponseDto.accessLevel) &&
        Objects.equals(this.referenceForDataElement, dataElementsIndivResponseDto.referenceForDataElement) &&
        Objects.equals(this.structuredFop, dataElementsIndivResponseDto.structuredFop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementManagementData, pnrSecurity, miscellaneousRemarks, extendedRemark, serviceRequest, seatPaxInfo, frequentFlyerInformationGroup, ticketElement, referencedRecord, optionElement, otherDataFreetext, elementErrorInformation, elementsIndicators, eltPosDetails, accessLevel, referenceForDataElement, structuredFop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataElementsIndivResponseDto {\n");
    
    sb.append("    elementManagementData: ").append(toIndentedString(elementManagementData)).append("\n");
    sb.append("    pnrSecurity: ").append(toIndentedString(pnrSecurity)).append("\n");
    sb.append("    miscellaneousRemarks: ").append(toIndentedString(miscellaneousRemarks)).append("\n");
    sb.append("    extendedRemark: ").append(toIndentedString(extendedRemark)).append("\n");
    sb.append("    serviceRequest: ").append(toIndentedString(serviceRequest)).append("\n");
    sb.append("    seatPaxInfo: ").append(toIndentedString(seatPaxInfo)).append("\n");
    sb.append("    frequentFlyerInformationGroup: ").append(toIndentedString(frequentFlyerInformationGroup)).append("\n");
    sb.append("    ticketElement: ").append(toIndentedString(ticketElement)).append("\n");
    sb.append("    referencedRecord: ").append(toIndentedString(referencedRecord)).append("\n");
    sb.append("    optionElement: ").append(toIndentedString(optionElement)).append("\n");
    sb.append("    otherDataFreetext: ").append(toIndentedString(otherDataFreetext)).append("\n");
    sb.append("    elementErrorInformation: ").append(toIndentedString(elementErrorInformation)).append("\n");
    sb.append("    elementsIndicators: ").append(toIndentedString(elementsIndicators)).append("\n");
    sb.append("    eltPosDetails: ").append(toIndentedString(eltPosDetails)).append("\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    referenceForDataElement: ").append(toIndentedString(referenceForDataElement)).append("\n");
    sb.append("    structuredFop: ").append(toIndentedString(structuredFop)).append("\n");
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

