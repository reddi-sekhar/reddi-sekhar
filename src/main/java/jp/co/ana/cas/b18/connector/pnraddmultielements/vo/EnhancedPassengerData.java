package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DateAndTimeInformationType32722S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.EnhancedTravellerInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitsType76106S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EnhancedPassengerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class EnhancedPassengerData   {
  @JsonProperty("dateOfBirthInEnhancedPaxData")
  private DateAndTimeInformationType32722S dateOfBirthInEnhancedPaxData;

  @JsonProperty("enhancedTravellerInformation")
  private EnhancedTravellerInformationType enhancedTravellerInformation;

  @JsonProperty("groupCountersInEnhancedPaxData")
  private NumberOfUnitsType76106S groupCountersInEnhancedPaxData;

  public EnhancedPassengerData dateOfBirthInEnhancedPaxData(DateAndTimeInformationType32722S dateOfBirthInEnhancedPaxData) {
    this.dateOfBirthInEnhancedPaxData = dateOfBirthInEnhancedPaxData;
    return this;
  }

  /**
   * Get dateOfBirthInEnhancedPaxData
   * @return dateOfBirthInEnhancedPaxData
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateAndTimeInformationType32722S getDateOfBirthInEnhancedPaxData() {
    return dateOfBirthInEnhancedPaxData;
  }

  public void setDateOfBirthInEnhancedPaxData(DateAndTimeInformationType32722S dateOfBirthInEnhancedPaxData) {
    this.dateOfBirthInEnhancedPaxData = dateOfBirthInEnhancedPaxData;
  }

  public EnhancedPassengerData enhancedTravellerInformation(EnhancedTravellerInformationType enhancedTravellerInformation) {
    this.enhancedTravellerInformation = enhancedTravellerInformation;
    return this;
  }

  /**
   * Get enhancedTravellerInformation
   * @return enhancedTravellerInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public EnhancedTravellerInformationType getEnhancedTravellerInformation() {
    return enhancedTravellerInformation;
  }

  public void setEnhancedTravellerInformation(EnhancedTravellerInformationType enhancedTravellerInformation) {
    this.enhancedTravellerInformation = enhancedTravellerInformation;
  }

  public EnhancedPassengerData groupCountersInEnhancedPaxData(NumberOfUnitsType76106S groupCountersInEnhancedPaxData) {
    this.groupCountersInEnhancedPaxData = groupCountersInEnhancedPaxData;
    return this;
  }

  /**
   * Get groupCountersInEnhancedPaxData
   * @return groupCountersInEnhancedPaxData
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitsType76106S getGroupCountersInEnhancedPaxData() {
    return groupCountersInEnhancedPaxData;
  }

  public void setGroupCountersInEnhancedPaxData(NumberOfUnitsType76106S groupCountersInEnhancedPaxData) {
    this.groupCountersInEnhancedPaxData = groupCountersInEnhancedPaxData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhancedPassengerData enhancedPassengerData = (EnhancedPassengerData) o;
    return Objects.equals(this.dateOfBirthInEnhancedPaxData, enhancedPassengerData.dateOfBirthInEnhancedPaxData) &&
        Objects.equals(this.enhancedTravellerInformation, enhancedPassengerData.enhancedTravellerInformation) &&
        Objects.equals(this.groupCountersInEnhancedPaxData, enhancedPassengerData.groupCountersInEnhancedPaxData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirthInEnhancedPaxData, enhancedTravellerInformation, groupCountersInEnhancedPaxData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedPassengerData {\n");
    
    sb.append("    dateOfBirthInEnhancedPaxData: ").append(toIndentedString(dateOfBirthInEnhancedPaxData)).append("\n");
    sb.append("    enhancedTravellerInformation: ").append(toIndentedString(enhancedTravellerInformation)).append("\n");
    sb.append("    groupCountersInEnhancedPaxData: ").append(toIndentedString(groupCountersInEnhancedPaxData)).append("\n");
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

