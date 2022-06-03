package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItineraryInfo1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OriginAndDestinationDetailsTypeI1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OriginDestinationDetails1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OriginDestinationDetails1   {
  @JsonProperty("itineraryInfo")
  @Valid
  private List<ItineraryInfo1> itineraryInfo = null;

  @JsonProperty("originDestination")
  private OriginAndDestinationDetailsTypeI1 originDestination;

  public OriginDestinationDetails1 itineraryInfo(List<ItineraryInfo1> itineraryInfo) {
    this.itineraryInfo = itineraryInfo;
    return this;
  }

  public OriginDestinationDetails1 addItineraryInfoItem(ItineraryInfo1 itineraryInfoItem) {
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

  public List<ItineraryInfo1> getItineraryInfo() {
    return itineraryInfo;
  }

  public void setItineraryInfo(List<ItineraryInfo1> itineraryInfo) {
    this.itineraryInfo = itineraryInfo;
  }

  public OriginDestinationDetails1 originDestination(OriginAndDestinationDetailsTypeI1 originDestination) {
    this.originDestination = originDestination;
    return this;
  }

  /**
   * Get originDestination
   * @return originDestination
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginAndDestinationDetailsTypeI1 getOriginDestination() {
    return originDestination;
  }

  public void setOriginDestination(OriginAndDestinationDetailsTypeI1 originDestination) {
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
    OriginDestinationDetails1 originDestinationDetails1 = (OriginDestinationDetails1) o;
    return Objects.equals(this.itineraryInfo, originDestinationDetails1.itineraryInfo) &&
        Objects.equals(this.originDestination, originDestinationDetails1.originDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itineraryInfo, originDestination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginDestinationDetails1 {\n");
    
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

