package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ClassDetailsType52782C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RailSeatConfigurationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RailSleeperDescriptionType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RailSeatPreferencesType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RailSeatPreferencesType   {
  @JsonProperty("classDetails")
  private ClassDetailsType52782C classDetails;

  @JsonProperty("seatConfiguration")
  private RailSeatConfigurationType seatConfiguration;

  @JsonProperty("seatRequestFunction")
  private String seatRequestFunction;

  @JsonProperty("sleeperDescription")
  private RailSleeperDescriptionType sleeperDescription;

  @JsonProperty("smokingIndicator")
  private String smokingIndicator;

  public RailSeatPreferencesType classDetails(ClassDetailsType52782C classDetails) {
    this.classDetails = classDetails;
    return this;
  }

  /**
   * Get classDetails
   * @return classDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ClassDetailsType52782C getClassDetails() {
    return classDetails;
  }

  public void setClassDetails(ClassDetailsType52782C classDetails) {
    this.classDetails = classDetails;
  }

  public RailSeatPreferencesType seatConfiguration(RailSeatConfigurationType seatConfiguration) {
    this.seatConfiguration = seatConfiguration;
    return this;
  }

  /**
   * Get seatConfiguration
   * @return seatConfiguration
  */
  @ApiModelProperty(value = "")

  @Valid

  public RailSeatConfigurationType getSeatConfiguration() {
    return seatConfiguration;
  }

  public void setSeatConfiguration(RailSeatConfigurationType seatConfiguration) {
    this.seatConfiguration = seatConfiguration;
  }

  public RailSeatPreferencesType seatRequestFunction(String seatRequestFunction) {
    this.seatRequestFunction = seatRequestFunction;
    return this;
  }

  /**
   * Get seatRequestFunction
   * @return seatRequestFunction
  */
  @ApiModelProperty(value = "")


  public String getSeatRequestFunction() {
    return seatRequestFunction;
  }

  public void setSeatRequestFunction(String seatRequestFunction) {
    this.seatRequestFunction = seatRequestFunction;
  }

  public RailSeatPreferencesType sleeperDescription(RailSleeperDescriptionType sleeperDescription) {
    this.sleeperDescription = sleeperDescription;
    return this;
  }

  /**
   * Get sleeperDescription
   * @return sleeperDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public RailSleeperDescriptionType getSleeperDescription() {
    return sleeperDescription;
  }

  public void setSleeperDescription(RailSleeperDescriptionType sleeperDescription) {
    this.sleeperDescription = sleeperDescription;
  }

  public RailSeatPreferencesType smokingIndicator(String smokingIndicator) {
    this.smokingIndicator = smokingIndicator;
    return this;
  }

  /**
   * Get smokingIndicator
   * @return smokingIndicator
  */
  @ApiModelProperty(value = "")


  public String getSmokingIndicator() {
    return smokingIndicator;
  }

  public void setSmokingIndicator(String smokingIndicator) {
    this.smokingIndicator = smokingIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RailSeatPreferencesType railSeatPreferencesType = (RailSeatPreferencesType) o;
    return Objects.equals(this.classDetails, railSeatPreferencesType.classDetails) &&
        Objects.equals(this.seatConfiguration, railSeatPreferencesType.seatConfiguration) &&
        Objects.equals(this.seatRequestFunction, railSeatPreferencesType.seatRequestFunction) &&
        Objects.equals(this.sleeperDescription, railSeatPreferencesType.sleeperDescription) &&
        Objects.equals(this.smokingIndicator, railSeatPreferencesType.smokingIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classDetails, seatConfiguration, seatRequestFunction, sleeperDescription, smokingIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RailSeatPreferencesType {\n");
    
    sb.append("    classDetails: ").append(toIndentedString(classDetails)).append("\n");
    sb.append("    seatConfiguration: ").append(toIndentedString(seatConfiguration)).append("\n");
    sb.append("    seatRequestFunction: ").append(toIndentedString(seatRequestFunction)).append("\n");
    sb.append("    sleeperDescription: ").append(toIndentedString(sleeperDescription)).append("\n");
    sb.append("    smokingIndicator: ").append(toIndentedString(smokingIndicator)).append("\n");
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

