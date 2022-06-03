package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PriorityDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class PriorityDetailsResponseDto   {
  @JsonProperty("qualifier")
  private String qualifier;

  @JsonProperty("priorityCode")
  private String priorityCode;

  @JsonProperty("tierLevel")
  private String tierLevel;

  public PriorityDetailsResponseDto qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * 1:airine, 2: alliance
   * @return qualifier
  */
  @ApiModelProperty(value = "1:airine, 2: alliance")

@Size(min=1,max=2) 
  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  public PriorityDetailsResponseDto priorityCode(String priorityCode) {
    this.priorityCode = priorityCode;
    return this;
  }

  /**
   * Priority code
   * @return priorityCode
  */
  @ApiModelProperty(value = "Priority code")

@Size(min=1,max=1) 
  public String getPriorityCode() {
    return priorityCode;
  }

  public void setPriorityCode(String priorityCode) {
    this.priorityCode = priorityCode;
  }

  public PriorityDetailsResponseDto tierLevel(String tierLevel) {
    this.tierLevel = tierLevel;
    return this;
  }

  /**
   * Tier Level
   * @return tierLevel
  */
  @ApiModelProperty(value = "Tier Level")

@Size(min=1,max=4) 
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
    PriorityDetailsResponseDto priorityDetailsResponseDto = (PriorityDetailsResponseDto) o;
    return Objects.equals(this.qualifier, priorityDetailsResponseDto.qualifier) &&
        Objects.equals(this.priorityCode, priorityDetailsResponseDto.priorityCode) &&
        Objects.equals(this.tierLevel, priorityDetailsResponseDto.tierLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualifier, priorityCode, tierLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriorityDetailsResponseDto {\n");
    
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
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

