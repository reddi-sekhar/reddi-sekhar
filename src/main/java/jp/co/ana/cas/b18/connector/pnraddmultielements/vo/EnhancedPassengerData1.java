package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DateAndTimeInformationType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.EnhancedTravellerInformationType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EnhancedPassengerData1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class EnhancedPassengerData1   {
  @JsonProperty("dateOfBirthInEnhancedPaxData")
  private DateAndTimeInformationType1 dateOfBirthInEnhancedPaxData;

  @JsonProperty("enhancedTravellerInformation")
  private EnhancedTravellerInformationType1 enhancedTravellerInformation;

  public EnhancedPassengerData1 dateOfBirthInEnhancedPaxData(DateAndTimeInformationType1 dateOfBirthInEnhancedPaxData) {
    this.dateOfBirthInEnhancedPaxData = dateOfBirthInEnhancedPaxData;
    return this;
  }

  /**
   * Get dateOfBirthInEnhancedPaxData
   * @return dateOfBirthInEnhancedPaxData
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateAndTimeInformationType1 getDateOfBirthInEnhancedPaxData() {
    return dateOfBirthInEnhancedPaxData;
  }

  public void setDateOfBirthInEnhancedPaxData(DateAndTimeInformationType1 dateOfBirthInEnhancedPaxData) {
    this.dateOfBirthInEnhancedPaxData = dateOfBirthInEnhancedPaxData;
  }

  public EnhancedPassengerData1 enhancedTravellerInformation(EnhancedTravellerInformationType1 enhancedTravellerInformation) {
    this.enhancedTravellerInformation = enhancedTravellerInformation;
    return this;
  }

  /**
   * Get enhancedTravellerInformation
   * @return enhancedTravellerInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public EnhancedTravellerInformationType1 getEnhancedTravellerInformation() {
    return enhancedTravellerInformation;
  }

  public void setEnhancedTravellerInformation(EnhancedTravellerInformationType1 enhancedTravellerInformation) {
    this.enhancedTravellerInformation = enhancedTravellerInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhancedPassengerData1 enhancedPassengerData1 = (EnhancedPassengerData1) o;
    return Objects.equals(this.dateOfBirthInEnhancedPaxData, enhancedPassengerData1.dateOfBirthInEnhancedPaxData) &&
        Objects.equals(this.enhancedTravellerInformation, enhancedPassengerData1.enhancedTravellerInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirthInEnhancedPaxData, enhancedTravellerInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedPassengerData1 {\n");
    
    sb.append("    dateOfBirthInEnhancedPaxData: ").append(toIndentedString(dateOfBirthInEnhancedPaxData)).append("\n");
    sb.append("    enhancedTravellerInformation: ").append(toIndentedString(enhancedTravellerInformation)).append("\n");
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

