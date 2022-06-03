package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.FrequentTravelerResponseDto;
import jp.co.ana.cas.b18.dto.response.PriorityDetailsResponseDto;
import jp.co.ana.cas.b18.dto.response.RedemptionInformationResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FrequentTravellerInfoResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FrequentTravellerInfoResponseDto   {
  @JsonProperty("frequentTraveler")
  private FrequentTravelerResponseDto frequentTraveler;

  @JsonProperty("priorityDetails")
  @Valid
  private List<PriorityDetailsResponseDto> priorityDetails = null;

  @JsonProperty("redemptionInformation")
  private RedemptionInformationResponseDto redemptionInformation;

  public FrequentTravellerInfoResponseDto frequentTraveler(FrequentTravelerResponseDto frequentTraveler) {
    this.frequentTraveler = frequentTraveler;
    return this;
  }

  /**
   * Get frequentTraveler
   * @return frequentTraveler
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravelerResponseDto getFrequentTraveler() {
    return frequentTraveler;
  }

  public void setFrequentTraveler(FrequentTravelerResponseDto frequentTraveler) {
    this.frequentTraveler = frequentTraveler;
  }

  public FrequentTravellerInfoResponseDto priorityDetails(List<PriorityDetailsResponseDto> priorityDetails) {
    this.priorityDetails = priorityDetails;
    return this;
  }

  public FrequentTravellerInfoResponseDto addPriorityDetailsItem(PriorityDetailsResponseDto priorityDetailsItem) {
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

  public List<PriorityDetailsResponseDto> getPriorityDetails() {
    return priorityDetails;
  }

  public void setPriorityDetails(List<PriorityDetailsResponseDto> priorityDetails) {
    this.priorityDetails = priorityDetails;
  }

  public FrequentTravellerInfoResponseDto redemptionInformation(RedemptionInformationResponseDto redemptionInformation) {
    this.redemptionInformation = redemptionInformation;
    return this;
  }

  /**
   * Get redemptionInformation
   * @return redemptionInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public RedemptionInformationResponseDto getRedemptionInformation() {
    return redemptionInformation;
  }

  public void setRedemptionInformation(RedemptionInformationResponseDto redemptionInformation) {
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
    FrequentTravellerInfoResponseDto frequentTravellerInfoResponseDto = (FrequentTravellerInfoResponseDto) o;
    return Objects.equals(this.frequentTraveler, frequentTravellerInfoResponseDto.frequentTraveler) &&
        Objects.equals(this.priorityDetails, frequentTravellerInfoResponseDto.priorityDetails) &&
        Objects.equals(this.redemptionInformation, frequentTravellerInfoResponseDto.redemptionInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequentTraveler, priorityDetails, redemptionInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravellerInfoResponseDto {\n");
    
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

