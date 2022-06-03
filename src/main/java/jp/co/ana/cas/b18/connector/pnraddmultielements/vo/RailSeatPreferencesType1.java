package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ClassDetailsType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RailSeatConfigurationType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RailSeatPreferencesType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RailSeatPreferencesType1   {
  @JsonProperty("classDetails")
  private ClassDetailsType1 classDetails;

  @JsonProperty("seatConfiguration")
  private RailSeatConfigurationType1 seatConfiguration;

  @JsonProperty("seatRequestFunction")
  private String seatRequestFunction;

  @JsonProperty("smokingIndicator")
  private String smokingIndicator;

  public RailSeatPreferencesType1 classDetails(ClassDetailsType1 classDetails) {
    this.classDetails = classDetails;
    return this;
  }

  /**
   * Get classDetails
   * @return classDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ClassDetailsType1 getClassDetails() {
    return classDetails;
  }

  public void setClassDetails(ClassDetailsType1 classDetails) {
    this.classDetails = classDetails;
  }

  public RailSeatPreferencesType1 seatConfiguration(RailSeatConfigurationType1 seatConfiguration) {
    this.seatConfiguration = seatConfiguration;
    return this;
  }

  /**
   * Get seatConfiguration
   * @return seatConfiguration
  */
  @ApiModelProperty(value = "")

  @Valid

  public RailSeatConfigurationType1 getSeatConfiguration() {
    return seatConfiguration;
  }

  public void setSeatConfiguration(RailSeatConfigurationType1 seatConfiguration) {
    this.seatConfiguration = seatConfiguration;
  }

  public RailSeatPreferencesType1 seatRequestFunction(String seatRequestFunction) {
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

  public RailSeatPreferencesType1 smokingIndicator(String smokingIndicator) {
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
    RailSeatPreferencesType1 railSeatPreferencesType1 = (RailSeatPreferencesType1) o;
    return Objects.equals(this.classDetails, railSeatPreferencesType1.classDetails) &&
        Objects.equals(this.seatConfiguration, railSeatPreferencesType1.seatConfiguration) &&
        Objects.equals(this.seatRequestFunction, railSeatPreferencesType1.seatRequestFunction) &&
        Objects.equals(this.smokingIndicator, railSeatPreferencesType1.smokingIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classDetails, seatConfiguration, seatRequestFunction, smokingIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RailSeatPreferencesType1 {\n");
    
    sb.append("    classDetails: ").append(toIndentedString(classDetails)).append("\n");
    sb.append("    seatConfiguration: ").append(toIndentedString(seatConfiguration)).append("\n");
    sb.append("    seatRequestFunction: ").append(toIndentedString(seatRequestFunction)).append("\n");
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

