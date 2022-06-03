package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FrequentTravellerIdentificationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PriorityDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductAccountDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FrequentTravellerIdentificationCodeType74327S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FrequentTravellerIdentificationCodeType74327S   {
  @JsonProperty("frequentTraveler")
  private FrequentTravellerIdentificationTypeI frequentTraveler;

  @JsonProperty("priorityDetails")
  @Valid
  private List<PriorityDetailsType> priorityDetails = null;

  @JsonProperty("redemptionInformation")
  private ProductAccountDetailsTypeI redemptionInformation;

  public FrequentTravellerIdentificationCodeType74327S frequentTraveler(FrequentTravellerIdentificationTypeI frequentTraveler) {
    this.frequentTraveler = frequentTraveler;
    return this;
  }

  /**
   * Get frequentTraveler
   * @return frequentTraveler
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravellerIdentificationTypeI getFrequentTraveler() {
    return frequentTraveler;
  }

  public void setFrequentTraveler(FrequentTravellerIdentificationTypeI frequentTraveler) {
    this.frequentTraveler = frequentTraveler;
  }

  public FrequentTravellerIdentificationCodeType74327S priorityDetails(List<PriorityDetailsType> priorityDetails) {
    this.priorityDetails = priorityDetails;
    return this;
  }

  public FrequentTravellerIdentificationCodeType74327S addPriorityDetailsItem(PriorityDetailsType priorityDetailsItem) {
    if (this.priorityDetails == null) {
      this.priorityDetails = new ArrayList<>();
    }
    this.priorityDetails.add(priorityDetailsItem);
    return this;
  }

  /**
   * Get priorityDetails
   * @return priorityDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PriorityDetailsType> getPriorityDetails() {
    return priorityDetails;
  }

  public void setPriorityDetails(List<PriorityDetailsType> priorityDetails) {
    this.priorityDetails = priorityDetails;
  }

  public FrequentTravellerIdentificationCodeType74327S redemptionInformation(ProductAccountDetailsTypeI redemptionInformation) {
    this.redemptionInformation = redemptionInformation;
    return this;
  }

  /**
   * Get redemptionInformation
   * @return redemptionInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductAccountDetailsTypeI getRedemptionInformation() {
    return redemptionInformation;
  }

  public void setRedemptionInformation(ProductAccountDetailsTypeI redemptionInformation) {
    this.redemptionInformation = redemptionInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequentTravellerIdentificationCodeType74327S frequentTravellerIdentificationCodeType74327S = (FrequentTravellerIdentificationCodeType74327S) o;
    return Objects.equals(this.frequentTraveler, frequentTravellerIdentificationCodeType74327S.frequentTraveler) &&
        Objects.equals(this.priorityDetails, frequentTravellerIdentificationCodeType74327S.priorityDetails) &&
        Objects.equals(this.redemptionInformation, frequentTravellerIdentificationCodeType74327S.redemptionInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequentTraveler, priorityDetails, redemptionInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravellerIdentificationCodeType74327S {\n");
    
    sb.append("    frequentTraveler: ").append(toIndentedString(frequentTraveler)).append("\n");
    sb.append("    priorityDetails: ").append(toIndentedString(priorityDetails)).append("\n");
    sb.append("    redemptionInformation: ").append(toIndentedString(redemptionInformation)).append("\n");
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

