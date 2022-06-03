package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CoverageInfo;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsurancePolicyType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType20644S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredPeriodInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerInformationTypeI15923S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.UserIdentificationType9456S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CoverageDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CoverageDetails   {
  @JsonProperty("agentReferenceDetails")
  private UserIdentificationType9456S agentReferenceDetails;

  @JsonProperty("coverageDates")
  private StructuredPeriodInformationType coverageDates;

  @JsonProperty("coverageInfo")
  @Valid
  private List<CoverageInfo> coverageInfo = null;

  @JsonProperty("coveredPassenger")
  @Valid
  private List<TravellerInformationTypeI15923S> coveredPassenger = null;

  @JsonProperty("policyDetails")
  private InsurancePolicyType policyDetails;

  @JsonProperty("subscriptionDetails")
  private StructuredDateTimeInformationType20644S subscriptionDetails;

  public CoverageDetails agentReferenceDetails(UserIdentificationType9456S agentReferenceDetails) {
    this.agentReferenceDetails = agentReferenceDetails;
    return this;
  }

  /**
   * Get agentReferenceDetails
   * @return agentReferenceDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserIdentificationType9456S getAgentReferenceDetails() {
    return agentReferenceDetails;
  }

  public void setAgentReferenceDetails(UserIdentificationType9456S agentReferenceDetails) {
    this.agentReferenceDetails = agentReferenceDetails;
  }

  public CoverageDetails coverageDates(StructuredPeriodInformationType coverageDates) {
    this.coverageDates = coverageDates;
    return this;
  }

  /**
   * Get coverageDates
   * @return coverageDates
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredPeriodInformationType getCoverageDates() {
    return coverageDates;
  }

  public void setCoverageDates(StructuredPeriodInformationType coverageDates) {
    this.coverageDates = coverageDates;
  }

  public CoverageDetails coverageInfo(List<CoverageInfo> coverageInfo) {
    this.coverageInfo = coverageInfo;
    return this;
  }

  public CoverageDetails addCoverageInfoItem(CoverageInfo coverageInfoItem) {
    if (this.coverageInfo == null) {
      this.coverageInfo = new ArrayList<>();
    }
    this.coverageInfo.add(coverageInfoItem);
    return this;
  }

  /**
   * Get coverageInfo
   * @return coverageInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CoverageInfo> getCoverageInfo() {
    return coverageInfo;
  }

  public void setCoverageInfo(List<CoverageInfo> coverageInfo) {
    this.coverageInfo = coverageInfo;
  }

  public CoverageDetails coveredPassenger(List<TravellerInformationTypeI15923S> coveredPassenger) {
    this.coveredPassenger = coveredPassenger;
    return this;
  }

  public CoverageDetails addCoveredPassengerItem(TravellerInformationTypeI15923S coveredPassengerItem) {
    if (this.coveredPassenger == null) {
      this.coveredPassenger = new ArrayList<>();
    }
    this.coveredPassenger.add(coveredPassengerItem);
    return this;
  }

  /**
   * Get coveredPassenger
   * @return coveredPassenger
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TravellerInformationTypeI15923S> getCoveredPassenger() {
    return coveredPassenger;
  }

  public void setCoveredPassenger(List<TravellerInformationTypeI15923S> coveredPassenger) {
    this.coveredPassenger = coveredPassenger;
  }

  public CoverageDetails policyDetails(InsurancePolicyType policyDetails) {
    this.policyDetails = policyDetails;
    return this;
  }

  /**
   * Get policyDetails
   * @return policyDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsurancePolicyType getPolicyDetails() {
    return policyDetails;
  }

  public void setPolicyDetails(InsurancePolicyType policyDetails) {
    this.policyDetails = policyDetails;
  }

  public CoverageDetails subscriptionDetails(StructuredDateTimeInformationType20644S subscriptionDetails) {
    this.subscriptionDetails = subscriptionDetails;
    return this;
  }

  /**
   * Get subscriptionDetails
   * @return subscriptionDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeInformationType20644S getSubscriptionDetails() {
    return subscriptionDetails;
  }

  public void setSubscriptionDetails(StructuredDateTimeInformationType20644S subscriptionDetails) {
    this.subscriptionDetails = subscriptionDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverageDetails coverageDetails = (CoverageDetails) o;
    return Objects.equals(this.agentReferenceDetails, coverageDetails.agentReferenceDetails) &&
        Objects.equals(this.coverageDates, coverageDetails.coverageDates) &&
        Objects.equals(this.coverageInfo, coverageDetails.coverageInfo) &&
        Objects.equals(this.coveredPassenger, coverageDetails.coveredPassenger) &&
        Objects.equals(this.policyDetails, coverageDetails.policyDetails) &&
        Objects.equals(this.subscriptionDetails, coverageDetails.subscriptionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentReferenceDetails, coverageDates, coverageInfo, coveredPassenger, policyDetails, subscriptionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverageDetails {\n");
    
    sb.append("    agentReferenceDetails: ").append(toIndentedString(agentReferenceDetails)).append("\n");
    sb.append("    coverageDates: ").append(toIndentedString(coverageDates)).append("\n");
    sb.append("    coverageInfo: ").append(toIndentedString(coverageInfo)).append("\n");
    sb.append("    coveredPassenger: ").append(toIndentedString(coveredPassenger)).append("\n");
    sb.append("    policyDetails: ").append(toIndentedString(policyDetails)).append("\n");
    sb.append("    subscriptionDetails: ").append(toIndentedString(subscriptionDetails)).append("\n");
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

