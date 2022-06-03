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
 * FrequentTravellerIdentificationType64816C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FrequentTravellerIdentificationType64816C   {
  @JsonProperty("companyCode")
  private String companyCode;

  @JsonProperty("priorityCode")
  private String priorityCode;

  @JsonProperty("tierDescription")
  private String tierDescription;

  @JsonProperty("tierLevel")
  private String tierLevel;

  public FrequentTravellerIdentificationType64816C companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

  /**
   * Get companyCode
   * @return companyCode
  */
  @ApiModelProperty(value = "")


  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public FrequentTravellerIdentificationType64816C priorityCode(String priorityCode) {
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

  public FrequentTravellerIdentificationType64816C tierDescription(String tierDescription) {
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

  public FrequentTravellerIdentificationType64816C tierLevel(String tierLevel) {
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
    FrequentTravellerIdentificationType64816C frequentTravellerIdentificationType64816C = (FrequentTravellerIdentificationType64816C) o;
    return Objects.equals(this.companyCode, frequentTravellerIdentificationType64816C.companyCode) &&
        Objects.equals(this.priorityCode, frequentTravellerIdentificationType64816C.priorityCode) &&
        Objects.equals(this.tierDescription, frequentTravellerIdentificationType64816C.tierDescription) &&
        Objects.equals(this.tierLevel, frequentTravellerIdentificationType64816C.tierLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyCode, priorityCode, tierDescription, tierLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentTravellerIdentificationType64816C {\n");
    
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
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

