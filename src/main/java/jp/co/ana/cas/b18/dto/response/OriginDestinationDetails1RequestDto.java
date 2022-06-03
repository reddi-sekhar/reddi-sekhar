package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.ItineraryInfo1RequestDto;
import jp.co.ana.cas.b18.dto.response.OriginAndDestination1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OriginDestinationDetails1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class OriginDestinationDetails1RequestDto   {
  @JsonProperty("itineraryInfo")
  @Valid
  private List<ItineraryInfo1RequestDto> itineraryInfo = null;

  @JsonProperty("originDestination")
  private OriginAndDestination1RequestDto originDestination;

  public OriginDestinationDetails1RequestDto itineraryInfo(List<ItineraryInfo1RequestDto> itineraryInfo) {
    this.itineraryInfo = itineraryInfo;
    return this;
  }

  public OriginDestinationDetails1RequestDto addItineraryInfoItem(ItineraryInfo1RequestDto itineraryInfoItem) {
    if (this.itineraryInfo == null) {
      this.itineraryInfo = new ArrayList<>();
    }
    this.itineraryInfo.add(itineraryInfoItem);
    return this;
  }

  /**
   * Get itineraryInfo
   * @return itineraryInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ItineraryInfo1RequestDto> getItineraryInfo() {
    return itineraryInfo;
  }

  public void setItineraryInfo(List<ItineraryInfo1RequestDto> itineraryInfo) {
    this.itineraryInfo = itineraryInfo;
  }

  public OriginDestinationDetails1RequestDto originDestination(OriginAndDestination1RequestDto originDestination) {
    this.originDestination = originDestination;
    return this;
  }

  /**
   * Get originDestination
   * @return originDestination
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginAndDestination1RequestDto getOriginDestination() {
    return originDestination;
  }

  public void setOriginDestination(OriginAndDestination1RequestDto originDestination) {
    this.originDestination = originDestination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginDestinationDetails1RequestDto originDestinationDetails1RequestDto = (OriginDestinationDetails1RequestDto) o;
    return Objects.equals(this.itineraryInfo, originDestinationDetails1RequestDto.itineraryInfo) &&
        Objects.equals(this.originDestination, originDestinationDetails1RequestDto.originDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itineraryInfo, originDestination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginDestinationDetails1RequestDto {\n");
    
    sb.append("    itineraryInfo: ").append(toIndentedString(itineraryInfo)).append("\n");
    sb.append("    originDestination: ").append(toIndentedString(originDestination)).append("\n");
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

