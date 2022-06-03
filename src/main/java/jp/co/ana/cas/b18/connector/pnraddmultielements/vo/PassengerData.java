package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DateAndTimeInformationType32722S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitsType76106S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerInformationType185946S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PassengerData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PassengerData   {
  @JsonProperty("dateOfBirth")
  private DateAndTimeInformationType32722S dateOfBirth;

  @JsonProperty("groupCounters")
  private NumberOfUnitsType76106S groupCounters;

  @JsonProperty("travellerInformation")
  private TravellerInformationType185946S travellerInformation;

  public PassengerData dateOfBirth(DateAndTimeInformationType32722S dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateAndTimeInformationType32722S getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(DateAndTimeInformationType32722S dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public PassengerData groupCounters(NumberOfUnitsType76106S groupCounters) {
    this.groupCounters = groupCounters;
    return this;
  }

  /**
   * Get groupCounters
   * @return groupCounters
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitsType76106S getGroupCounters() {
    return groupCounters;
  }

  public void setGroupCounters(NumberOfUnitsType76106S groupCounters) {
    this.groupCounters = groupCounters;
  }

  public PassengerData travellerInformation(TravellerInformationType185946S travellerInformation) {
    this.travellerInformation = travellerInformation;
    return this;
  }

  /**
   * Get travellerInformation
   * @return travellerInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerInformationType185946S getTravellerInformation() {
    return travellerInformation;
  }

  public void setTravellerInformation(TravellerInformationType185946S travellerInformation) {
    this.travellerInformation = travellerInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassengerData passengerData = (PassengerData) o;
    return Objects.equals(this.dateOfBirth, passengerData.dateOfBirth) &&
        Objects.equals(this.groupCounters, passengerData.groupCounters) &&
        Objects.equals(this.travellerInformation, passengerData.travellerInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, groupCounters, travellerInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassengerData {\n");
    
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    groupCounters: ").append(toIndentedString(groupCounters)).append("\n");
    sb.append("    travellerInformation: ").append(toIndentedString(travellerInformation)).append("\n");
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

