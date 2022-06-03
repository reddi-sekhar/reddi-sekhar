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
 * SecondRpLineInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SecondRpLineInformationType   {
  @JsonProperty("agentSignature")
  private String agentSignature;

  @JsonProperty("creationDate")
  private String creationDate;

  @JsonProperty("creationOfficeId")
  private String creationOfficeId;

  @JsonProperty("creationTime")
  private String creationTime;

  @JsonProperty("creatorIataCode")
  private Long creatorIataCode;

  public SecondRpLineInformationType agentSignature(String agentSignature) {
    this.agentSignature = agentSignature;
    return this;
  }

  /**
   * Get agentSignature
   * @return agentSignature
  */
  @ApiModelProperty(value = "")


  public String getAgentSignature() {
    return agentSignature;
  }

  public void setAgentSignature(String agentSignature) {
    this.agentSignature = agentSignature;
  }

  public SecondRpLineInformationType creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @ApiModelProperty(value = "")


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public SecondRpLineInformationType creationOfficeId(String creationOfficeId) {
    this.creationOfficeId = creationOfficeId;
    return this;
  }

  /**
   * Get creationOfficeId
   * @return creationOfficeId
  */
  @ApiModelProperty(value = "")


  public String getCreationOfficeId() {
    return creationOfficeId;
  }

  public void setCreationOfficeId(String creationOfficeId) {
    this.creationOfficeId = creationOfficeId;
  }

  public SecondRpLineInformationType creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Get creationTime
   * @return creationTime
  */
  @ApiModelProperty(value = "")


  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public SecondRpLineInformationType creatorIataCode(Long creatorIataCode) {
    this.creatorIataCode = creatorIataCode;
    return this;
  }

  /**
   * Get creatorIataCode
   * @return creatorIataCode
  */
  @ApiModelProperty(value = "")


  public Long getCreatorIataCode() {
    return creatorIataCode;
  }

  public void setCreatorIataCode(Long creatorIataCode) {
    this.creatorIataCode = creatorIataCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondRpLineInformationType secondRpLineInformationType = (SecondRpLineInformationType) o;
    return Objects.equals(this.agentSignature, secondRpLineInformationType.agentSignature) &&
        Objects.equals(this.creationDate, secondRpLineInformationType.creationDate) &&
        Objects.equals(this.creationOfficeId, secondRpLineInformationType.creationOfficeId) &&
        Objects.equals(this.creationTime, secondRpLineInformationType.creationTime) &&
        Objects.equals(this.creatorIataCode, secondRpLineInformationType.creatorIataCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSignature, creationDate, creationOfficeId, creationTime, creatorIataCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondRpLineInformationType {\n");
    
    sb.append("    agentSignature: ").append(toIndentedString(agentSignature)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creationOfficeId: ").append(toIndentedString(creationOfficeId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    creatorIataCode: ").append(toIndentedString(creatorIataCode)).append("\n");
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

