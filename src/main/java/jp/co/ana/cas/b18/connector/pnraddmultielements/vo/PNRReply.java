package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodedAttributeType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DataElementsMaster;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DcsData;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ErrorGroupType212789G;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InteractiveFreeTextTypeI136698S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.LongFreeTextType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OriginDestinationDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.POSGroupType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PnrHeader;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PnrHistoryDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PricingRecordGroup;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QueueType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationSecurityInformationType204487S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SegmentGroupingInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusType227567S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TechnicalData;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerInfo;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TstData;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PNRReply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PNRReply   {
  @JsonProperty("dataElementsMaster")
  private DataElementsMaster dataElementsMaster;

  @JsonProperty("dcsData")
  private DcsData dcsData;

  @JsonProperty("freeFormText")
  @Valid
  private List<InteractiveFreeTextTypeI136698S> freeFormText = null;

  @JsonProperty("freetextData")
  @Valid
  private List<LongFreeTextType> freetextData = null;

  @JsonProperty("generalErrorInfo")
  @Valid
  private List<ErrorGroupType212789G> generalErrorInfo = null;

  @JsonProperty("historyData")
  @Valid
  private List<PnrHistoryDataType> historyData = null;

  @JsonProperty("numberOfUnits")
  private NumberOfUnitsTypeI numberOfUnits;

  @JsonProperty("originDestinationDetails")
  @Valid
  private List<OriginDestinationDetails> originDestinationDetails = null;

  @JsonProperty("pnrHeader")
  @Valid
  private List<PnrHeader> pnrHeader = null;

  @JsonProperty("pnrHeaderTag")
  private StatusType227567S pnrHeaderTag;

  @JsonProperty("pnrType")
  private CodedAttributeType pnrType;

  @JsonProperty("pricingRecordGroup")
  private PricingRecordGroup pricingRecordGroup;

  @JsonProperty("queueInformations")
  private QueueType queueInformations;

  @JsonProperty("sbrCreationPosDetails")
  private POSGroupType sbrCreationPosDetails;

  @JsonProperty("sbrPOSDetails")
  private POSGroupType sbrPOSDetails;

  @JsonProperty("sbrUpdatorPosDetails")
  private POSGroupType sbrUpdatorPosDetails;

  @JsonProperty("securityInformation")
  private ReservationSecurityInformationType204487S securityInformation;

  @JsonProperty("segmentGroupingInfo")
  @Valid
  private List<SegmentGroupingInformationType> segmentGroupingInfo = null;

  @JsonProperty("technicalData")
  private TechnicalData technicalData;

  @JsonProperty("travellerInfo")
  @Valid
  private List<TravellerInfo> travellerInfo = null;

  @JsonProperty("tstData")
  @Valid
  private List<TstData> tstData = null;

  public PNRReply dataElementsMaster(DataElementsMaster dataElementsMaster) {
    this.dataElementsMaster = dataElementsMaster;
    return this;
  }

  /**
   * Get dataElementsMaster
   * @return dataElementsMaster
  */
  @ApiModelProperty(value = "")

  @Valid

  public DataElementsMaster getDataElementsMaster() {
    return dataElementsMaster;
  }

  public void setDataElementsMaster(DataElementsMaster dataElementsMaster) {
    this.dataElementsMaster = dataElementsMaster;
  }

  public PNRReply dcsData(DcsData dcsData) {
    this.dcsData = dcsData;
    return this;
  }

  /**
   * Get dcsData
   * @return dcsData
  */
  @ApiModelProperty(value = "")

  @Valid

  public DcsData getDcsData() {
    return dcsData;
  }

  public void setDcsData(DcsData dcsData) {
    this.dcsData = dcsData;
  }

  public PNRReply freeFormText(List<InteractiveFreeTextTypeI136698S> freeFormText) {
    this.freeFormText = freeFormText;
    return this;
  }

  public PNRReply addFreeFormTextItem(InteractiveFreeTextTypeI136698S freeFormTextItem) {
    if (this.freeFormText == null) {
      this.freeFormText = new ArrayList<>();
    }
    this.freeFormText.add(freeFormTextItem);
    return this;
  }

  /**
   * Get freeFormText
   * @return freeFormText
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<InteractiveFreeTextTypeI136698S> getFreeFormText() {
    return freeFormText;
  }

  public void setFreeFormText(List<InteractiveFreeTextTypeI136698S> freeFormText) {
    this.freeFormText = freeFormText;
  }

  public PNRReply freetextData(List<LongFreeTextType> freetextData) {
    this.freetextData = freetextData;
    return this;
  }

  public PNRReply addFreetextDataItem(LongFreeTextType freetextDataItem) {
    if (this.freetextData == null) {
      this.freetextData = new ArrayList<>();
    }
    this.freetextData.add(freetextDataItem);
    return this;
  }

  /**
   * Get freetextData
   * @return freetextData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<LongFreeTextType> getFreetextData() {
    return freetextData;
  }

  public void setFreetextData(List<LongFreeTextType> freetextData) {
    this.freetextData = freetextData;
  }

  public PNRReply generalErrorInfo(List<ErrorGroupType212789G> generalErrorInfo) {
    this.generalErrorInfo = generalErrorInfo;
    return this;
  }

  public PNRReply addGeneralErrorInfoItem(ErrorGroupType212789G generalErrorInfoItem) {
    if (this.generalErrorInfo == null) {
      this.generalErrorInfo = new ArrayList<>();
    }
    this.generalErrorInfo.add(generalErrorInfoItem);
    return this;
  }

  /**
   * Get generalErrorInfo
   * @return generalErrorInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ErrorGroupType212789G> getGeneralErrorInfo() {
    return generalErrorInfo;
  }

  public void setGeneralErrorInfo(List<ErrorGroupType212789G> generalErrorInfo) {
    this.generalErrorInfo = generalErrorInfo;
  }

  public PNRReply historyData(List<PnrHistoryDataType> historyData) {
    this.historyData = historyData;
    return this;
  }

  public PNRReply addHistoryDataItem(PnrHistoryDataType historyDataItem) {
    if (this.historyData == null) {
      this.historyData = new ArrayList<>();
    }
    this.historyData.add(historyDataItem);
    return this;
  }

  /**
   * Get historyData
   * @return historyData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PnrHistoryDataType> getHistoryData() {
    return historyData;
  }

  public void setHistoryData(List<PnrHistoryDataType> historyData) {
    this.historyData = historyData;
  }

  public PNRReply numberOfUnits(NumberOfUnitsTypeI numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

  /**
   * Get numberOfUnits
   * @return numberOfUnits
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitsTypeI getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(NumberOfUnitsTypeI numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public PNRReply originDestinationDetails(List<OriginDestinationDetails> originDestinationDetails) {
    this.originDestinationDetails = originDestinationDetails;
    return this;
  }

  public PNRReply addOriginDestinationDetailsItem(OriginDestinationDetails originDestinationDetailsItem) {
    if (this.originDestinationDetails == null) {
      this.originDestinationDetails = new ArrayList<>();
    }
    this.originDestinationDetails.add(originDestinationDetailsItem);
    return this;
  }

  /**
   * Get originDestinationDetails
   * @return originDestinationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OriginDestinationDetails> getOriginDestinationDetails() {
    return originDestinationDetails;
  }

  public void setOriginDestinationDetails(List<OriginDestinationDetails> originDestinationDetails) {
    this.originDestinationDetails = originDestinationDetails;
  }

  public PNRReply pnrHeader(List<PnrHeader> pnrHeader) {
    this.pnrHeader = pnrHeader;
    return this;
  }

  public PNRReply addPnrHeaderItem(PnrHeader pnrHeaderItem) {
    if (this.pnrHeader == null) {
      this.pnrHeader = new ArrayList<>();
    }
    this.pnrHeader.add(pnrHeaderItem);
    return this;
  }

  /**
   * Get pnrHeader
   * @return pnrHeader
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PnrHeader> getPnrHeader() {
    return pnrHeader;
  }

  public void setPnrHeader(List<PnrHeader> pnrHeader) {
    this.pnrHeader = pnrHeader;
  }

  public PNRReply pnrHeaderTag(StatusType227567S pnrHeaderTag) {
    this.pnrHeaderTag = pnrHeaderTag;
    return this;
  }

  /**
   * Get pnrHeaderTag
   * @return pnrHeaderTag
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusType227567S getPnrHeaderTag() {
    return pnrHeaderTag;
  }

  public void setPnrHeaderTag(StatusType227567S pnrHeaderTag) {
    this.pnrHeaderTag = pnrHeaderTag;
  }

  public PNRReply pnrType(CodedAttributeType pnrType) {
    this.pnrType = pnrType;
    return this;
  }

  /**
   * Get pnrType
   * @return pnrType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CodedAttributeType getPnrType() {
    return pnrType;
  }

  public void setPnrType(CodedAttributeType pnrType) {
    this.pnrType = pnrType;
  }

  public PNRReply pricingRecordGroup(PricingRecordGroup pricingRecordGroup) {
    this.pricingRecordGroup = pricingRecordGroup;
    return this;
  }

  /**
   * Get pricingRecordGroup
   * @return pricingRecordGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public PricingRecordGroup getPricingRecordGroup() {
    return pricingRecordGroup;
  }

  public void setPricingRecordGroup(PricingRecordGroup pricingRecordGroup) {
    this.pricingRecordGroup = pricingRecordGroup;
  }

  public PNRReply queueInformations(QueueType queueInformations) {
    this.queueInformations = queueInformations;
    return this;
  }

  /**
   * Get queueInformations
   * @return queueInformations
  */
  @ApiModelProperty(value = "")

  @Valid

  public QueueType getQueueInformations() {
    return queueInformations;
  }

  public void setQueueInformations(QueueType queueInformations) {
    this.queueInformations = queueInformations;
  }

  public PNRReply sbrCreationPosDetails(POSGroupType sbrCreationPosDetails) {
    this.sbrCreationPosDetails = sbrCreationPosDetails;
    return this;
  }

  /**
   * Get sbrCreationPosDetails
   * @return sbrCreationPosDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public POSGroupType getSbrCreationPosDetails() {
    return sbrCreationPosDetails;
  }

  public void setSbrCreationPosDetails(POSGroupType sbrCreationPosDetails) {
    this.sbrCreationPosDetails = sbrCreationPosDetails;
  }

  public PNRReply sbrPOSDetails(POSGroupType sbrPOSDetails) {
    this.sbrPOSDetails = sbrPOSDetails;
    return this;
  }

  /**
   * Get sbrPOSDetails
   * @return sbrPOSDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public POSGroupType getSbrPOSDetails() {
    return sbrPOSDetails;
  }

  public void setSbrPOSDetails(POSGroupType sbrPOSDetails) {
    this.sbrPOSDetails = sbrPOSDetails;
  }

  public PNRReply sbrUpdatorPosDetails(POSGroupType sbrUpdatorPosDetails) {
    this.sbrUpdatorPosDetails = sbrUpdatorPosDetails;
    return this;
  }

  /**
   * Get sbrUpdatorPosDetails
   * @return sbrUpdatorPosDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public POSGroupType getSbrUpdatorPosDetails() {
    return sbrUpdatorPosDetails;
  }

  public void setSbrUpdatorPosDetails(POSGroupType sbrUpdatorPosDetails) {
    this.sbrUpdatorPosDetails = sbrUpdatorPosDetails;
  }

  public PNRReply securityInformation(ReservationSecurityInformationType204487S securityInformation) {
    this.securityInformation = securityInformation;
    return this;
  }

  /**
   * Get securityInformation
   * @return securityInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationSecurityInformationType204487S getSecurityInformation() {
    return securityInformation;
  }

  public void setSecurityInformation(ReservationSecurityInformationType204487S securityInformation) {
    this.securityInformation = securityInformation;
  }

  public PNRReply segmentGroupingInfo(List<SegmentGroupingInformationType> segmentGroupingInfo) {
    this.segmentGroupingInfo = segmentGroupingInfo;
    return this;
  }

  public PNRReply addSegmentGroupingInfoItem(SegmentGroupingInformationType segmentGroupingInfoItem) {
    if (this.segmentGroupingInfo == null) {
      this.segmentGroupingInfo = new ArrayList<>();
    }
    this.segmentGroupingInfo.add(segmentGroupingInfoItem);
    return this;
  }

  /**
   * Get segmentGroupingInfo
   * @return segmentGroupingInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SegmentGroupingInformationType> getSegmentGroupingInfo() {
    return segmentGroupingInfo;
  }

  public void setSegmentGroupingInfo(List<SegmentGroupingInformationType> segmentGroupingInfo) {
    this.segmentGroupingInfo = segmentGroupingInfo;
  }

  public PNRReply technicalData(TechnicalData technicalData) {
    this.technicalData = technicalData;
    return this;
  }

  /**
   * Get technicalData
   * @return technicalData
  */
  @ApiModelProperty(value = "")

  @Valid

  public TechnicalData getTechnicalData() {
    return technicalData;
  }

  public void setTechnicalData(TechnicalData technicalData) {
    this.technicalData = technicalData;
  }

  public PNRReply travellerInfo(List<TravellerInfo> travellerInfo) {
    this.travellerInfo = travellerInfo;
    return this;
  }

  public PNRReply addTravellerInfoItem(TravellerInfo travellerInfoItem) {
    if (this.travellerInfo == null) {
      this.travellerInfo = new ArrayList<>();
    }
    this.travellerInfo.add(travellerInfoItem);
    return this;
  }

  /**
   * Get travellerInfo
   * @return travellerInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TravellerInfo> getTravellerInfo() {
    return travellerInfo;
  }

  public void setTravellerInfo(List<TravellerInfo> travellerInfo) {
    this.travellerInfo = travellerInfo;
  }

  public PNRReply tstData(List<TstData> tstData) {
    this.tstData = tstData;
    return this;
  }

  public PNRReply addTstDataItem(TstData tstDataItem) {
    if (this.tstData == null) {
      this.tstData = new ArrayList<>();
    }
    this.tstData.add(tstDataItem);
    return this;
  }

  /**
   * Get tstData
   * @return tstData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TstData> getTstData() {
    return tstData;
  }

  public void setTstData(List<TstData> tstData) {
    this.tstData = tstData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PNRReply pnRReply = (PNRReply) o;
    return Objects.equals(this.dataElementsMaster, pnRReply.dataElementsMaster) &&
        Objects.equals(this.dcsData, pnRReply.dcsData) &&
        Objects.equals(this.freeFormText, pnRReply.freeFormText) &&
        Objects.equals(this.freetextData, pnRReply.freetextData) &&
        Objects.equals(this.generalErrorInfo, pnRReply.generalErrorInfo) &&
        Objects.equals(this.historyData, pnRReply.historyData) &&
        Objects.equals(this.numberOfUnits, pnRReply.numberOfUnits) &&
        Objects.equals(this.originDestinationDetails, pnRReply.originDestinationDetails) &&
        Objects.equals(this.pnrHeader, pnRReply.pnrHeader) &&
        Objects.equals(this.pnrHeaderTag, pnRReply.pnrHeaderTag) &&
        Objects.equals(this.pnrType, pnRReply.pnrType) &&
        Objects.equals(this.pricingRecordGroup, pnRReply.pricingRecordGroup) &&
        Objects.equals(this.queueInformations, pnRReply.queueInformations) &&
        Objects.equals(this.sbrCreationPosDetails, pnRReply.sbrCreationPosDetails) &&
        Objects.equals(this.sbrPOSDetails, pnRReply.sbrPOSDetails) &&
        Objects.equals(this.sbrUpdatorPosDetails, pnRReply.sbrUpdatorPosDetails) &&
        Objects.equals(this.securityInformation, pnRReply.securityInformation) &&
        Objects.equals(this.segmentGroupingInfo, pnRReply.segmentGroupingInfo) &&
        Objects.equals(this.technicalData, pnRReply.technicalData) &&
        Objects.equals(this.travellerInfo, pnRReply.travellerInfo) &&
        Objects.equals(this.tstData, pnRReply.tstData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataElementsMaster, dcsData, freeFormText, freetextData, generalErrorInfo, historyData, numberOfUnits, originDestinationDetails, pnrHeader, pnrHeaderTag, pnrType, pricingRecordGroup, queueInformations, sbrCreationPosDetails, sbrPOSDetails, sbrUpdatorPosDetails, securityInformation, segmentGroupingInfo, technicalData, travellerInfo, tstData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PNRReply {\n");
    
    sb.append("    dataElementsMaster: ").append(toIndentedString(dataElementsMaster)).append("\n");
    sb.append("    dcsData: ").append(toIndentedString(dcsData)).append("\n");
    sb.append("    freeFormText: ").append(toIndentedString(freeFormText)).append("\n");
    sb.append("    freetextData: ").append(toIndentedString(freetextData)).append("\n");
    sb.append("    generalErrorInfo: ").append(toIndentedString(generalErrorInfo)).append("\n");
    sb.append("    historyData: ").append(toIndentedString(historyData)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    originDestinationDetails: ").append(toIndentedString(originDestinationDetails)).append("\n");
    sb.append("    pnrHeader: ").append(toIndentedString(pnrHeader)).append("\n");
    sb.append("    pnrHeaderTag: ").append(toIndentedString(pnrHeaderTag)).append("\n");
    sb.append("    pnrType: ").append(toIndentedString(pnrType)).append("\n");
    sb.append("    pricingRecordGroup: ").append(toIndentedString(pricingRecordGroup)).append("\n");
    sb.append("    queueInformations: ").append(toIndentedString(queueInformations)).append("\n");
    sb.append("    sbrCreationPosDetails: ").append(toIndentedString(sbrCreationPosDetails)).append("\n");
    sb.append("    sbrPOSDetails: ").append(toIndentedString(sbrPOSDetails)).append("\n");
    sb.append("    sbrUpdatorPosDetails: ").append(toIndentedString(sbrUpdatorPosDetails)).append("\n");
    sb.append("    securityInformation: ").append(toIndentedString(securityInformation)).append("\n");
    sb.append("    segmentGroupingInfo: ").append(toIndentedString(segmentGroupingInfo)).append("\n");
    sb.append("    technicalData: ").append(toIndentedString(technicalData)).append("\n");
    sb.append("    travellerInfo: ").append(toIndentedString(travellerInfo)).append("\n");
    sb.append("    tstData: ").append(toIndentedString(tstData)).append("\n");
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

