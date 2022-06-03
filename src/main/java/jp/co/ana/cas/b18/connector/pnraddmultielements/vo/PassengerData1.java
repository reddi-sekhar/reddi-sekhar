package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DateAndTimeInformationType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerInformationTypeI1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PassengerData1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PassengerData1   {
  @JsonProperty("dateOfBirth")
  private DateAndTimeInformationType1 dateOfBirth;

  @JsonProperty("travellerInformation")
  private TravellerInformationTypeI1 travellerInformation;

  public PassengerData1 dateOfBirth(DateAndTimeInformationType1 dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateAndTimeInformationType1 getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(DateAndTimeInformationType1 dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public PassengerData1 travellerInformation(TravellerInformationTypeI1 travellerInformation) {
    this.travellerInformation = travellerInformation;
    return this;
  }

  /**
   * Get travellerInformation
   * @return travellerInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerInformationTypeI1 getTravellerInformation() {
    return travellerInformation;
  }

  public void setTravellerInformation(TravellerInformationTypeI1 travellerInformation) {
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
    PassengerData1 passengerData1 = (PassengerData1) o;
    return Objects.equals(this.dateOfBirth, passengerData1.dateOfBirth) &&
        Objects.equals(this.travellerInformation, passengerData1.travellerInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, travellerInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassengerData1 {\n");
    
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

