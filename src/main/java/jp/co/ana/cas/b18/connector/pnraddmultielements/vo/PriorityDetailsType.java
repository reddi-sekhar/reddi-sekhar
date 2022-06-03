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
 * PriorityDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PriorityDetailsType   {
  @JsonProperty("priorityCode")
  private String priorityCode;

  @JsonProperty("qualifier")
  private String qualifier;

  @JsonProperty("tierDescription")
  private String tierDescription;

  @JsonProperty("tierLevel")
  private String tierLevel;

  public PriorityDetailsType priorityCode(String priorityCode) {
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

  public PriorityDetailsType qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * Get qualifier
   * @return qualifier
  */
  @ApiModelProperty(value = "")


  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  public PriorityDetailsType tierDescription(String tierDescription) {
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

  public PriorityDetailsType tierLevel(String tierLevel) {
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
    PriorityDetailsType priorityDetailsType = (PriorityDetailsType) o;
    return Objects.equals(this.priorityCode, priorityDetailsType.priorityCode) &&
        Objects.equals(this.qualifier, priorityDetailsType.qualifier) &&
        Objects.equals(this.tierDescription, priorityDetailsType.tierDescription) &&
        Objects.equals(this.tierLevel, priorityDetailsType.tierLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priorityCode, qualifier, tierDescription, tierLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriorityDetailsType {\n");
    
    sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
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

