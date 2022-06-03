package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.DataElementsMasterResponseDto;
import jp.co.ana.cas.b18.dto.response.DcsDataResponseDto;
import jp.co.ana.cas.b18.dto.response.GeneralErrorInfoResponseDto;
import jp.co.ana.cas.b18.dto.response.OriginDestinationDetailsResponseDto;
import jp.co.ana.cas.b18.dto.response.PnrHeaderResponseDto;
import jp.co.ana.cas.b18.dto.response.PnrReplyResponseDtoPnrHeaderTag;
import jp.co.ana.cas.b18.dto.response.PnrReplyResponseDtoTechnicalData;
import jp.co.ana.cas.b18.dto.response.PnrTypeResponseDto;
import jp.co.ana.cas.b18.dto.response.SecurityInformationResponseDto;
import jp.co.ana.cas.b18.dto.response.TravellerInfoResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PnrReplyResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class PnrReplyResponseDto   {
  @JsonProperty("pnrHeader")
  @Valid
  private List<PnrHeaderResponseDto> pnrHeader = null;

  @JsonProperty("pnrType")
  private PnrTypeResponseDto pnrType;

  @JsonProperty("securityInformation")
  private SecurityInformationResponseDto securityInformation;

  @JsonProperty("generalErrorInfo")
  @Valid
  private List<GeneralErrorInfoResponseDto> generalErrorInfo = null;

  @JsonProperty("pnrHeaderTag")
  private PnrReplyResponseDtoPnrHeaderTag pnrHeaderTag;

  @JsonProperty("technicalData")
  private PnrReplyResponseDtoTechnicalData technicalData;

  @JsonProperty("travellerInfo")
  @Valid
  private List<TravellerInfoResponseDto> travellerInfo = null;

  @JsonProperty("originDestinationDetails")
  @Valid
  private List<OriginDestinationDetailsResponseDto> originDestinationDetails = null;

  @JsonProperty("dataElementsMaster")
  private DataElementsMasterResponseDto dataElementsMaster;

  @JsonProperty("dcsData")
  private DcsDataResponseDto dcsData;

  public PnrReplyResponseDto pnrHeader(List<PnrHeaderResponseDto> pnrHeader) {
    this.pnrHeader = pnrHeader;
    return this;
  }

  public PnrReplyResponseDto addPnrHeaderItem(PnrHeaderResponseDto pnrHeaderItem) {
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

  public List<PnrHeaderResponseDto> getPnrHeader() {
    return pnrHeader;
  }

  public void setPnrHeader(List<PnrHeaderResponseDto> pnrHeader) {
    this.pnrHeader = pnrHeader;
  }

  public PnrReplyResponseDto pnrType(PnrTypeResponseDto pnrType) {
    this.pnrType = pnrType;
    return this;
  }

  /**
   * Get pnrType
   * @return pnrType
  */
  @ApiModelProperty(value = "")

  @Valid

  public PnrTypeResponseDto getPnrType() {
    return pnrType;
  }

  public void setPnrType(PnrTypeResponseDto pnrType) {
    this.pnrType = pnrType;
  }

  public PnrReplyResponseDto securityInformation(SecurityInformationResponseDto securityInformation) {
    this.securityInformation = securityInformation;
    return this;
  }

  /**
   * Get securityInformation
   * @return securityInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public SecurityInformationResponseDto getSecurityInformation() {
    return securityInformation;
  }

  public void setSecurityInformation(SecurityInformationResponseDto securityInformation) {
    this.securityInformation = securityInformation;
  }

  public PnrReplyResponseDto generalErrorInfo(List<GeneralErrorInfoResponseDto> generalErrorInfo) {
    this.generalErrorInfo = generalErrorInfo;
    return this;
  }

  public PnrReplyResponseDto addGeneralErrorInfoItem(GeneralErrorInfoResponseDto generalErrorInfoItem) {
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

  public List<GeneralErrorInfoResponseDto> getGeneralErrorInfo() {
    return generalErrorInfo;
  }

  public void setGeneralErrorInfo(List<GeneralErrorInfoResponseDto> generalErrorInfo) {
    this.generalErrorInfo = generalErrorInfo;
  }

  public PnrReplyResponseDto pnrHeaderTag(PnrReplyResponseDtoPnrHeaderTag pnrHeaderTag) {
    this.pnrHeaderTag = pnrHeaderTag;
    return this;
  }

  /**
   * Get pnrHeaderTag
   * @return pnrHeaderTag
  */
  @ApiModelProperty(value = "")

  @Valid

  public PnrReplyResponseDtoPnrHeaderTag getPnrHeaderTag() {
    return pnrHeaderTag;
  }

  public void setPnrHeaderTag(PnrReplyResponseDtoPnrHeaderTag pnrHeaderTag) {
    this.pnrHeaderTag = pnrHeaderTag;
  }

  public PnrReplyResponseDto technicalData(PnrReplyResponseDtoTechnicalData technicalData) {
    this.technicalData = technicalData;
    return this;
  }

  /**
   * Get technicalData
   * @return technicalData
  */
  @ApiModelProperty(value = "")

  @Valid

  public PnrReplyResponseDtoTechnicalData getTechnicalData() {
    return technicalData;
  }

  public void setTechnicalData(PnrReplyResponseDtoTechnicalData technicalData) {
    this.technicalData = technicalData;
  }

  public PnrReplyResponseDto travellerInfo(List<TravellerInfoResponseDto> travellerInfo) {
    this.travellerInfo = travellerInfo;
    return this;
  }

  public PnrReplyResponseDto addTravellerInfoItem(TravellerInfoResponseDto travellerInfoItem) {
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

  public List<TravellerInfoResponseDto> getTravellerInfo() {
    return travellerInfo;
  }

  public void setTravellerInfo(List<TravellerInfoResponseDto> travellerInfo) {
    this.travellerInfo = travellerInfo;
  }

  public PnrReplyResponseDto originDestinationDetails(List<OriginDestinationDetailsResponseDto> originDestinationDetails) {
    this.originDestinationDetails = originDestinationDetails;
    return this;
  }

  public PnrReplyResponseDto addOriginDestinationDetailsItem(OriginDestinationDetailsResponseDto originDestinationDetailsItem) {
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

  public List<OriginDestinationDetailsResponseDto> getOriginDestinationDetails() {
    return originDestinationDetails;
  }

  public void setOriginDestinationDetails(List<OriginDestinationDetailsResponseDto> originDestinationDetails) {
    this.originDestinationDetails = originDestinationDetails;
  }

  public PnrReplyResponseDto dataElementsMaster(DataElementsMasterResponseDto dataElementsMaster) {
    this.dataElementsMaster = dataElementsMaster;
    return this;
  }

  /**
   * Get dataElementsMaster
   * @return dataElementsMaster
  */
  @ApiModelProperty(value = "")

  @Valid

  public DataElementsMasterResponseDto getDataElementsMaster() {
    return dataElementsMaster;
  }

  public void setDataElementsMaster(DataElementsMasterResponseDto dataElementsMaster) {
    this.dataElementsMaster = dataElementsMaster;
  }

  public PnrReplyResponseDto dcsData(DcsDataResponseDto dcsData) {
    this.dcsData = dcsData;
    return this;
  }

  /**
   * Get dcsData
   * @return dcsData
  */
  @ApiModelProperty(value = "")

  @Valid

  public DcsDataResponseDto getDcsData() {
    return dcsData;
  }

  public void setDcsData(DcsDataResponseDto dcsData) {
    this.dcsData = dcsData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PnrReplyResponseDto pnrReplyResponseDto = (PnrReplyResponseDto) o;
    return Objects.equals(this.pnrHeader, pnrReplyResponseDto.pnrHeader) &&
        Objects.equals(this.pnrType, pnrReplyResponseDto.pnrType) &&
        Objects.equals(this.securityInformation, pnrReplyResponseDto.securityInformation) &&
        Objects.equals(this.generalErrorInfo, pnrReplyResponseDto.generalErrorInfo) &&
        Objects.equals(this.pnrHeaderTag, pnrReplyResponseDto.pnrHeaderTag) &&
        Objects.equals(this.technicalData, pnrReplyResponseDto.technicalData) &&
        Objects.equals(this.travellerInfo, pnrReplyResponseDto.travellerInfo) &&
        Objects.equals(this.originDestinationDetails, pnrReplyResponseDto.originDestinationDetails) &&
        Objects.equals(this.dataElementsMaster, pnrReplyResponseDto.dataElementsMaster) &&
        Objects.equals(this.dcsData, pnrReplyResponseDto.dcsData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnrHeader, pnrType, securityInformation, generalErrorInfo, pnrHeaderTag, technicalData, travellerInfo, originDestinationDetails, dataElementsMaster, dcsData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PnrReplyResponseDto {\n");
    
    sb.append("    pnrHeader: ").append(toIndentedString(pnrHeader)).append("\n");
    sb.append("    pnrType: ").append(toIndentedString(pnrType)).append("\n");
    sb.append("    securityInformation: ").append(toIndentedString(securityInformation)).append("\n");
    sb.append("    generalErrorInfo: ").append(toIndentedString(generalErrorInfo)).append("\n");
    sb.append("    pnrHeaderTag: ").append(toIndentedString(pnrHeaderTag)).append("\n");
    sb.append("    technicalData: ").append(toIndentedString(technicalData)).append("\n");
    sb.append("    travellerInfo: ").append(toIndentedString(travellerInfo)).append("\n");
    sb.append("    originDestinationDetails: ").append(toIndentedString(originDestinationDetails)).append("\n");
    sb.append("    dataElementsMaster: ").append(toIndentedString(dataElementsMaster)).append("\n");
    sb.append("    dcsData: ").append(toIndentedString(dcsData)).append("\n");
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

