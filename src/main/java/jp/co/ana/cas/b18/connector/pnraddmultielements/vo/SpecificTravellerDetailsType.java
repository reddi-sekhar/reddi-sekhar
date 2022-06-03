package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecificTravellerDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecificTravellerDetailsType   {
  @JsonProperty("passengerBirthdate")
  private String passengerBirthdate;

  @JsonProperty("passengerType")
  private String passengerType;

  @JsonProperty("travellerGivenName")
  private String travellerGivenName;

  @JsonProperty("travellerReferenceNumber")
  private String travellerReferenceNumber;

  @JsonProperty("travellerSurname")
  private String travellerSurname;

  public SpecificTravellerDetailsType passengerBirthdate(String passengerBirthdate) {
    this.passengerBirthdate = passengerBirthdate;
    return this;
  }

  /**
   * Get passengerBirthdate
   * @return passengerBirthdate
  */
  @ApiModelProperty(value = "")


  public String getPassengerBirthdate() {
    return passengerBirthdate;
  }

  public void setPassengerBirthdate(String passengerBirthdate) {
    this.passengerBirthdate = passengerBirthdate;
  }

  public SpecificTravellerDetailsType passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Get passengerType
   * @return passengerType
  */
  @ApiModelProperty(value = "")


  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  public SpecificTravellerDetailsType travellerGivenName(String travellerGivenName) {
    this.travellerGivenName = travellerGivenName;
    return this;
  }

  /**
   * Get travellerGivenName
   * @return travellerGivenName
  */
  @ApiModelProperty(value = "")


  public String getTravellerGivenName() {
    return travellerGivenName;
  }

  public void setTravellerGivenName(String travellerGivenName) {
    this.travellerGivenName = travellerGivenName;
  }

  public SpecificTravellerDetailsType travellerReferenceNumber(String travellerReferenceNumber) {
    this.travellerReferenceNumber = travellerReferenceNumber;
    return this;
  }

  /**
   * Get travellerReferenceNumber
   * @return travellerReferenceNumber
  */
  @ApiModelProperty(value = "")


  public String getTravellerReferenceNumber() {
    return travellerReferenceNumber;
  }

  public void setTravellerReferenceNumber(String travellerReferenceNumber) {
    this.travellerReferenceNumber = travellerReferenceNumber;
  }

  public SpecificTravellerDetailsType travellerSurname(String travellerSurname) {
    this.travellerSurname = travellerSurname;
    return this;
  }

  /**
   * Get travellerSurname
   * @return travellerSurname
  */
  @ApiModelProperty(value = "")


  public String getTravellerSurname() {
    return travellerSurname;
  }

  public void setTravellerSurname(String travellerSurname) {
    this.travellerSurname = travellerSurname;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificTravellerDetailsType specificTravellerDetailsType = (SpecificTravellerDetailsType) o;
    return Objects.equals(this.passengerBirthdate, specificTravellerDetailsType.passengerBirthdate) &&
        Objects.equals(this.passengerType, specificTravellerDetailsType.passengerType) &&
        Objects.equals(this.travellerGivenName, specificTravellerDetailsType.travellerGivenName) &&
        Objects.equals(this.travellerReferenceNumber, specificTravellerDetailsType.travellerReferenceNumber) &&
        Objects.equals(this.travellerSurname, specificTravellerDetailsType.travellerSurname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passengerBirthdate, passengerType, travellerGivenName, travellerReferenceNumber, travellerSurname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificTravellerDetailsType {\n");
    
    sb.append("    passengerBirthdate: ").append(toIndentedString(passengerBirthdate)).append("\n");
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
    sb.append("    travellerGivenName: ").append(toIndentedString(travellerGivenName)).append("\n");
    sb.append("    travellerReferenceNumber: ").append(toIndentedString(travellerReferenceNumber)).append("\n");
    sb.append("    travellerSurname: ").append(toIndentedString(travellerSurname)).append("\n");
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

