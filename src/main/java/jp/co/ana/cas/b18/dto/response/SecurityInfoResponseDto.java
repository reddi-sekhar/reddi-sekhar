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
 * SecurityInfoResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SecurityInfoResponseDto   {
  @JsonProperty("agentCode")
  private String agentCode;

  @JsonProperty("creationDate")
  private String creationDate;

  @JsonProperty("officeId")
  private String officeId;

  public SecurityInfoResponseDto agentCode(String agentCode) {
    this.agentCode = agentCode;
    return this;
  }

  /**
   * Agent initials and duty code as in Originator informations
   * @return agentCode
  */
  @ApiModelProperty(value = "Agent initials and duty code as in Originator informations")

@Size(min=4,max=4) 
  public String getAgentCode() {
    return agentCode;
  }

  public void setAgentCode(String agentCode) {
    this.agentCode = agentCode;
  }

  public SecurityInfoResponseDto creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date of creation
   * @return creationDate
  */
  @ApiModelProperty(value = "Date of creation")

@Size(min=6,max=6) 
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public SecurityInfoResponseDto officeId(String officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Office Id of creation/update
   * @return officeId
  */
  @ApiModelProperty(value = "Office Id of creation/update")

@Size(min=9,max=9) 
  public String getOfficeId() {
    return officeId;
  }

  public void setOfficeId(String officeId) {
    this.officeId = officeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityInfoResponseDto securityInfoResponseDto = (SecurityInfoResponseDto) o;
    return Objects.equals(this.agentCode, securityInfoResponseDto.agentCode) &&
        Objects.equals(this.creationDate, securityInfoResponseDto.creationDate) &&
        Objects.equals(this.officeId, securityInfoResponseDto.officeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentCode, creationDate, officeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityInfoResponseDto {\n");
    
    sb.append("    agentCode: ").append(toIndentedString(agentCode)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
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

