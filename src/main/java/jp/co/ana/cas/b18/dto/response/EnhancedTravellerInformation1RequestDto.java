package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.OtherPaxNamesDetails1RequestDto;
import jp.co.ana.cas.b18.dto.response.TravellerNameInfo1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EnhancedTravellerInformation1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class EnhancedTravellerInformation1RequestDto   {
  @JsonProperty("otherPaxNamesDetails")
  @Valid
  private List<OtherPaxNamesDetails1RequestDto> otherPaxNamesDetails = null;

  @JsonProperty("travellerNameInfo")
  private TravellerNameInfo1RequestDto travellerNameInfo;

  public EnhancedTravellerInformation1RequestDto otherPaxNamesDetails(List<OtherPaxNamesDetails1RequestDto> otherPaxNamesDetails) {
    this.otherPaxNamesDetails = otherPaxNamesDetails;
    return this;
  }

  public EnhancedTravellerInformation1RequestDto addOtherPaxNamesDetailsItem(OtherPaxNamesDetails1RequestDto otherPaxNamesDetailsItem) {
    if (this.otherPaxNamesDetails == null) {
      this.otherPaxNamesDetails = new ArrayList<>();
    }
    this.otherPaxNamesDetails.add(otherPaxNamesDetailsItem);
    return this;
  }

  /**
   * Get otherPaxNamesDetails
   * @return otherPaxNamesDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OtherPaxNamesDetails1RequestDto> getOtherPaxNamesDetails() {
    return otherPaxNamesDetails;
  }

  public void setOtherPaxNamesDetails(List<OtherPaxNamesDetails1RequestDto> otherPaxNamesDetails) {
    this.otherPaxNamesDetails = otherPaxNamesDetails;
  }

  public EnhancedTravellerInformation1RequestDto travellerNameInfo(TravellerNameInfo1RequestDto travellerNameInfo) {
    this.travellerNameInfo = travellerNameInfo;
    return this;
  }

  /**
   * Get travellerNameInfo
   * @return travellerNameInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerNameInfo1RequestDto getTravellerNameInfo() {
    return travellerNameInfo;
  }

  public void setTravellerNameInfo(TravellerNameInfo1RequestDto travellerNameInfo) {
    this.travellerNameInfo = travellerNameInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhancedTravellerInformation1RequestDto enhancedTravellerInformation1RequestDto = (EnhancedTravellerInformation1RequestDto) o;
    return Objects.equals(this.otherPaxNamesDetails, enhancedTravellerInformation1RequestDto.otherPaxNamesDetails) &&
        Objects.equals(this.travellerNameInfo, enhancedTravellerInformation1RequestDto.travellerNameInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherPaxNamesDetails, travellerNameInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedTravellerInformation1RequestDto {\n");
    
    sb.append("    otherPaxNamesDetails: ").append(toIndentedString(otherPaxNamesDetails)).append("\n");
    sb.append("    travellerNameInfo: ").append(toIndentedString(travellerNameInfo)).append("\n");
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

