package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AdditionalTransportDetailsTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelProductInformationTypeI193102S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ArrivalFlightDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ArrivalFlightDetails   {
  @JsonProperty("additionalTransportDetails")
  private AdditionalTransportDetailsTypeU additionalTransportDetails;

  @JsonProperty("travelProductInformation")
  private TravelProductInformationTypeI193102S travelProductInformation;

  public ArrivalFlightDetails additionalTransportDetails(AdditionalTransportDetailsTypeU additionalTransportDetails) {
    this.additionalTransportDetails = additionalTransportDetails;
    return this;
  }

  /**
   * Get additionalTransportDetails
   * @return additionalTransportDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdditionalTransportDetailsTypeU getAdditionalTransportDetails() {
    return additionalTransportDetails;
  }

  public void setAdditionalTransportDetails(AdditionalTransportDetailsTypeU additionalTransportDetails) {
    this.additionalTransportDetails = additionalTransportDetails;
  }

  public ArrivalFlightDetails travelProductInformation(TravelProductInformationTypeI193102S travelProductInformation) {
    this.travelProductInformation = travelProductInformation;
    return this;
  }

  /**
   * Get travelProductInformation
   * @return travelProductInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelProductInformationTypeI193102S getTravelProductInformation() {
    return travelProductInformation;
  }

  public void setTravelProductInformation(TravelProductInformationTypeI193102S travelProductInformation) {
    this.travelProductInformation = travelProductInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrivalFlightDetails arrivalFlightDetails = (ArrivalFlightDetails) o;
    return Objects.equals(this.additionalTransportDetails, arrivalFlightDetails.additionalTransportDetails) &&
        Objects.equals(this.travelProductInformation, arrivalFlightDetails.travelProductInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalTransportDetails, travelProductInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrivalFlightDetails {\n");
    
    sb.append("    additionalTransportDetails: ").append(toIndentedString(additionalTransportDetails)).append("\n");
    sb.append("    travelProductInformation: ").append(toIndentedString(travelProductInformation)).append("\n");
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

