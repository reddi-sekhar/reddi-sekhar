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
 * FrequentTravellerIdentificationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FrequentTravellerIdentificationType   {
  @JsonProperty("company")
  private String company;

  @JsonProperty("membershipNumber")
  private String membershipNumber;

  @JsonProperty("priorityCode")
  private String priorityCode;

  @JsonProperty("tierDescription")
  private String tierDescription;

  @JsonProperty("tierLevel")
  private String tierLevel;

  public FrequentTravellerIdentificationType company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @ApiModelProperty(value = "")


  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public FrequentTravellerIdentificationType membershipNumber(String membershipNumber) {
    this.membershipNumber = membershipNumber;
    return this;
  }

  /**
   * Get membershipNumber
   * @return membershipNumber
  */
  @ApiModelProperty(value = "")


  public String getMembershipNumber() {
    return membershipNumber;
  }

  public void setMembershipNumber(String membershipNumber) {
    this.membershipNumber = membershipNumber;
  }

  public FrequentTravellerIdentificationType priorityCode(String priorityCode) {
    this.priorityCode = priorityCode;
    return this;
  }

  /**
   * Get priorityCode
   * @return priorityCode
  */
  @ApiModelProperty(value = "")


  public String getPriorityCode() {
    return priorityCode;
  }

  public void setPriorityCode(String priorityCode) {
    this.priorityCode = priorityCode;
  }

  public FrequentTravellerIdentificationType tierDescription(String tierDescription) {
    this.tierDescription = tierDescription;
    return this;
  }

  /**
   * Get tierDescription
   * @return tierDescription
  */
  @ApiModelProperty(value = "")


  public String getTierDescription() {
    return tierDescription;
  }

  public void setTierDescription(String tierDescription) {
    this.tierDescription = tierDescription;
  }

  public FrequentTravellerIdentificationType tierLevel(String tierLevel) {
    this.tierLevel = tierLevel;
    return this;
  }

  /**
   * Get tierLevel
   * @return tierLevel
  */
  @ApiModelProperty(value = "")


  public String getTierLevel() {
    return tierLevel;
  }

  public void setTierLevel(String tierLevel) {
    this.tierLevel = tierLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequentTravellerIdentificationType frequentTravellerIdentificationType = (FrequentTravellerIdentificationType) o;
    return Objects.equals(this.company, frequentTravellerIdentificationType.company) &&
        Objects.equals(this.membershipNumber, frequentTravellerIdentificationType.membershipNumber) &&
        Objects.equals(this.priorityCode, frequentTravellerIdentificationType.priorityCode) &&
        Objects.equals(this.tierDescription, frequentTravellerIdentificationType.tierDescription) &&
        Objects.equals(this.tierLevel, frequentTravellerIdentificationType.tierLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, membershipNumber, priorityCode, tierDescription, tierLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravellerIdentificationType {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    membershipNumber: ").append(toIndentedString(membershipNumber)).append("\n");
    sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
    sb.append("    tierDescription: ").append(toIndentedString(tierDescription)).append("\n");
    sb.append("    tierLevel: ").append(toIndentedString(tierLevel)).append("\n");
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

