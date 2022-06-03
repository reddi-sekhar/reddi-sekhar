package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItineraryInfo;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OriginAndDestinationDetailsTypeI3061S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OriginDestinationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OriginDestinationDetails   {
  @JsonProperty("itineraryInfo")
  @Valid
  private List<ItineraryInfo> itineraryInfo = null;

  @JsonProperty("originDestination")
  private OriginAndDestinationDetailsTypeI3061S originDestination;

  public OriginDestinationDetails itineraryInfo(List<ItineraryInfo> itineraryInfo) {
    this.itineraryInfo = itineraryInfo;
    return this;
  }

  public OriginDestinationDetails addItineraryInfoItem(ItineraryInfo itineraryInfoItem) {
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

  public List<ItineraryInfo> getItineraryInfo() {
    return itineraryInfo;
  }

  public void setItineraryInfo(List<ItineraryInfo> itineraryInfo) {
    this.itineraryInfo = itineraryInfo;
  }

  public OriginDestinationDetails originDestination(OriginAndDestinationDetailsTypeI3061S originDestination) {
    this.originDestination = originDestination;
    return this;
  }

  /**
   * Get originDestination
   * @return originDestination
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginAndDestinationDetailsTypeI3061S getOriginDestination() {
    return originDestination;
  }

  public void setOriginDestination(OriginAndDestinationDetailsTypeI3061S originDestination) {
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
    OriginDestinationDetails originDestinationDetails = (OriginDestinationDetails) o;
    return Objects.equals(this.itineraryInfo, originDestinationDetails.itineraryInfo) &&
        Objects.equals(this.originDestination, originDestinationDetails.originDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itineraryInfo, originDestination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginDestinationDetails {\n");
    
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

