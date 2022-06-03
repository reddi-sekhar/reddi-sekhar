package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerNameDetailsType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerNameInfoType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EnhancedTravellerInformationType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class EnhancedTravellerInformationType1   {
  @JsonProperty("otherPaxNamesDetails")
  @Valid
  private List<TravellerNameDetailsType1> otherPaxNamesDetails = null;

  @JsonProperty("travellerNameInfo")
  private TravellerNameInfoType1 travellerNameInfo;

  public EnhancedTravellerInformationType1 otherPaxNamesDetails(List<TravellerNameDetailsType1> otherPaxNamesDetails) {
    this.otherPaxNamesDetails = otherPaxNamesDetails;
    return this;
  }

  public EnhancedTravellerInformationType1 addOtherPaxNamesDetailsItem(TravellerNameDetailsType1 otherPaxNamesDetailsItem) {
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

  public List<TravellerNameDetailsType1> getOtherPaxNamesDetails() {
    return otherPaxNamesDetails;
  }

  public void setOtherPaxNamesDetails(List<TravellerNameDetailsType1> otherPaxNamesDetails) {
    this.otherPaxNamesDetails = otherPaxNamesDetails;
  }

  public EnhancedTravellerInformationType1 travellerNameInfo(TravellerNameInfoType1 travellerNameInfo) {
    this.travellerNameInfo = travellerNameInfo;
    return this;
  }

  /**
   * Get travellerNameInfo
   * @return travellerNameInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerNameInfoType1 getTravellerNameInfo() {
    return travellerNameInfo;
  }

  public void setTravellerNameInfo(TravellerNameInfoType1 travellerNameInfo) {
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
    EnhancedTravellerInformationType1 enhancedTravellerInformationType1 = (EnhancedTravellerInformationType1) o;
    return Objects.equals(this.otherPaxNamesDetails, enhancedTravellerInformationType1.otherPaxNamesDetails) &&
        Objects.equals(this.travellerNameInfo, enhancedTravellerInformationType1.travellerNameInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherPaxNamesDetails, travellerNameInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedTravellerInformationType1 {\n");
    
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

