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
 * SecondRpLineInformationType283891C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SecondRpLineInformationType283891C   {
  @JsonProperty("agentSignature")
  private String agentSignature;

  @JsonProperty("creationDate")
  private String creationDate;

  @JsonProperty("creationOfficeId")
  private String creationOfficeId;

  @JsonProperty("creationTime")
  private String creationTime;

  @JsonProperty("creatorIataCode")
  private String creatorIataCode;

  public SecondRpLineInformationType283891C agentSignature(String agentSignature) {
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

  public SecondRpLineInformationType283891C creationDate(String creationDate) {
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

  public SecondRpLineInformationType283891C creationOfficeId(String creationOfficeId) {
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

  public SecondRpLineInformationType283891C creationTime(String creationTime) {
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

  public SecondRpLineInformationType283891C creatorIataCode(String creatorIataCode) {
    this.creatorIataCode = creatorIataCode;
    return this;
  }

  /**
   * Get creatorIataCode
   * @return creatorIataCode
  */
  @ApiModelProperty(value = "")


  public String getCreatorIataCode() {
    return creatorIataCode;
  }

  public void setCreatorIataCode(String creatorIataCode) {
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
    SecondRpLineInformationType283891C secondRpLineInformationType283891C = (SecondRpLineInformationType283891C) o;
    return Objects.equals(this.agentSignature, secondRpLineInformationType283891C.agentSignature) &&
        Objects.equals(this.creationDate, secondRpLineInformationType283891C.creationDate) &&
        Objects.equals(this.creationOfficeId, secondRpLineInformationType283891C.creationOfficeId) &&
        Objects.equals(this.creationTime, secondRpLineInformationType283891C.creationTime) &&
        Objects.equals(this.creatorIataCode, secondRpLineInformationType283891C.creatorIataCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSignature, creationDate, creationOfficeId, creationTime, creatorIataCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondRpLineInformationType283891C {\n");
    
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

