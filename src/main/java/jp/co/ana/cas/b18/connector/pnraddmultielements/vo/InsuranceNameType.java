package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecificTravellerDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelerPerpaxDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InsuranceNameType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InsuranceNameType   {
  @JsonProperty("insuranceTravelerDetails")
  private SpecificTravellerDetailsType insuranceTravelerDetails;

  @JsonProperty("travelerPerpaxDetails")
  @Valid
  private List<TravelerPerpaxDetailsType> travelerPerpaxDetails = null;

  public InsuranceNameType insuranceTravelerDetails(SpecificTravellerDetailsType insuranceTravelerDetails) {
    this.insuranceTravelerDetails = insuranceTravelerDetails;
    return this;
  }

  /**
   * Get insuranceTravelerDetails
   * @return insuranceTravelerDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecificTravellerDetailsType getInsuranceTravelerDetails() {
    return insuranceTravelerDetails;
  }

  public void setInsuranceTravelerDetails(SpecificTravellerDetailsType insuranceTravelerDetails) {
    this.insuranceTravelerDetails = insuranceTravelerDetails;
  }

  public InsuranceNameType travelerPerpaxDetails(List<TravelerPerpaxDetailsType> travelerPerpaxDetails) {
    this.travelerPerpaxDetails = travelerPerpaxDetails;
    return this;
  }

  public InsuranceNameType addTravelerPerpaxDetailsItem(TravelerPerpaxDetailsType travelerPerpaxDetailsItem) {
    if (this.travelerPerpaxDetails == null) {
      this.travelerPerpaxDetails = new ArrayList<>();
    }
    this.travelerPerpaxDetails.add(travelerPerpaxDetailsItem);
    return this;
  }

  /**
   * Get travelerPerpaxDetails
   * @return travelerPerpaxDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TravelerPerpaxDetailsType> getTravelerPerpaxDetails() {
    return travelerPerpaxDetails;
  }

  public void setTravelerPerpaxDetails(List<TravelerPerpaxDetailsType> travelerPerpaxDetails) {
    this.travelerPerpaxDetails = travelerPerpaxDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceNameType insuranceNameType = (InsuranceNameType) o;
    return Objects.equals(this.insuranceTravelerDetails, insuranceNameType.insuranceTravelerDetails) &&
        Objects.equals(this.travelerPerpaxDetails, insuranceNameType.travelerPerpaxDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insuranceTravelerDetails, travelerPerpaxDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceNameType {\n");
    
    sb.append("    insuranceTravelerDetails: ").append(toIndentedString(insuranceTravelerDetails)).append("\n");
    sb.append("    travelerPerpaxDetails: ").append(toIndentedString(travelerPerpaxDetails)).append("\n");
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

