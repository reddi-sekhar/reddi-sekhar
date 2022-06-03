package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.DataElementsMaster1RequestDto;
import jp.co.ana.cas.b18.dto.response.OriginDestinationDetails1RequestDto;
import jp.co.ana.cas.b18.dto.response.PnrActionsRequestDto;
import jp.co.ana.cas.b18.dto.response.TravellerInfo1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PnrAddMultiElementsRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class PnrAddMultiElementsRequestDto   {
  @JsonProperty("pnrActions")
  private PnrActionsRequestDto pnrActions;

  @JsonProperty("travellerInfo")
  @Valid
  private List<TravellerInfo1RequestDto> travellerInfo = null;

  @JsonProperty("dataElementsMaster")
  private DataElementsMaster1RequestDto dataElementsMaster;

  @JsonProperty("originDestinationDetails")
  @Valid
  private List<OriginDestinationDetails1RequestDto> originDestinationDetails = null;

  public PnrAddMultiElementsRequestDto pnrActions(PnrActionsRequestDto pnrActions) {
    this.pnrActions = pnrActions;
    return this;
  }

  /**
   * Get pnrActions
   * @return pnrActions
  */
  @ApiModelProperty(value = "")

  @Valid

  public PnrActionsRequestDto getPnrActions() {
    return pnrActions;
  }

  public void setPnrActions(PnrActionsRequestDto pnrActions) {
    this.pnrActions = pnrActions;
  }

  public PnrAddMultiElementsRequestDto travellerInfo(List<TravellerInfo1RequestDto> travellerInfo) {
    this.travellerInfo = travellerInfo;
    return this;
  }

  public PnrAddMultiElementsRequestDto addTravellerInfoItem(TravellerInfo1RequestDto travellerInfoItem) {
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

  public List<TravellerInfo1RequestDto> getTravellerInfo() {
    return travellerInfo;
  }

  public void setTravellerInfo(List<TravellerInfo1RequestDto> travellerInfo) {
    this.travellerInfo = travellerInfo;
  }

  public PnrAddMultiElementsRequestDto dataElementsMaster(DataElementsMaster1RequestDto dataElementsMaster) {
    this.dataElementsMaster = dataElementsMaster;
    return this;
  }

  /**
   * Get dataElementsMaster
   * @return dataElementsMaster
  */
  @ApiModelProperty(value = "")

  @Valid

  public DataElementsMaster1RequestDto getDataElementsMaster() {
    return dataElementsMaster;
  }

  public void setDataElementsMaster(DataElementsMaster1RequestDto dataElementsMaster) {
    this.dataElementsMaster = dataElementsMaster;
  }

  public PnrAddMultiElementsRequestDto originDestinationDetails(List<OriginDestinationDetails1RequestDto> originDestinationDetails) {
    this.originDestinationDetails = originDestinationDetails;
    return this;
  }

  public PnrAddMultiElementsRequestDto addOriginDestinationDetailsItem(OriginDestinationDetails1RequestDto originDestinationDetailsItem) {
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

  public List<OriginDestinationDetails1RequestDto> getOriginDestinationDetails() {
    return originDestinationDetails;
  }

  public void setOriginDestinationDetails(List<OriginDestinationDetails1RequestDto> originDestinationDetails) {
    this.originDestinationDetails = originDestinationDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PnrAddMultiElementsRequestDto pnrAddMultiElementsRequestDto = (PnrAddMultiElementsRequestDto) o;
    return Objects.equals(this.pnrActions, pnrAddMultiElementsRequestDto.pnrActions) &&
        Objects.equals(this.travellerInfo, pnrAddMultiElementsRequestDto.travellerInfo) &&
        Objects.equals(this.dataElementsMaster, pnrAddMultiElementsRequestDto.dataElementsMaster) &&
        Objects.equals(this.originDestinationDetails, pnrAddMultiElementsRequestDto.originDestinationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnrActions, travellerInfo, dataElementsMaster, originDestinationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PnrAddMultiElementsRequestDto {\n");
    
    sb.append("    pnrActions: ").append(toIndentedString(pnrActions)).append("\n");
    sb.append("    travellerInfo: ").append(toIndentedString(travellerInfo)).append("\n");
    sb.append("    dataElementsMaster: ").append(toIndentedString(dataElementsMaster)).append("\n");
    sb.append("    originDestinationDetails: ").append(toIndentedString(originDestinationDetails)).append("\n");
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

