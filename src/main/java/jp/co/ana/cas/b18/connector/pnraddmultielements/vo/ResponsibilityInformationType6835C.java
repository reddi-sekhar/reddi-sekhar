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
 * ResponsibilityInformationType6835C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ResponsibilityInformationType6835C   {
  @JsonProperty("agentId")
  private String agentId;

  @JsonProperty("iataCode")
  private Long iataCode;

  @JsonProperty("officeId")
  private String officeId;

  @JsonProperty("typeOfPnrElement")
  private String typeOfPnrElement;

  public ResponsibilityInformationType6835C agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

  /**
   * Get agentId
   * @return agentId
  */
  @ApiModelProperty(value = "")


  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public ResponsibilityInformationType6835C iataCode(Long iataCode) {
    this.iataCode = iataCode;
    return this;
  }

  /**
   * Get iataCode
   * @return iataCode
  */
  @ApiModelProperty(value = "")


  public Long getIataCode() {
    return iataCode;
  }

  public void setIataCode(Long iataCode) {
    this.iataCode = iataCode;
  }

  public ResponsibilityInformationType6835C officeId(String officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Get officeId
   * @return officeId
  */
  @ApiModelProperty(value = "")


  public String getOfficeId() {
    return officeId;
  }

  public void setOfficeId(String officeId) {
    this.officeId = officeId;
  }

  public ResponsibilityInformationType6835C typeOfPnrElement(String typeOfPnrElement) {
    this.typeOfPnrElement = typeOfPnrElement;
    return this;
  }

  /**
   * Get typeOfPnrElement
   * @return typeOfPnrElement
  */
  @ApiModelProperty(value = "")


  public String getTypeOfPnrElement() {
    return typeOfPnrElement;
  }

  public void setTypeOfPnrElement(String typeOfPnrElement) {
    this.typeOfPnrElement = typeOfPnrElement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsibilityInformationType6835C responsibilityInformationType6835C = (ResponsibilityInformationType6835C) o;
    return Objects.equals(this.agentId, responsibilityInformationType6835C.agentId) &&
        Objects.equals(this.iataCode, responsibilityInformationType6835C.iataCode) &&
        Objects.equals(this.officeId, responsibilityInformationType6835C.officeId) &&
        Objects.equals(this.typeOfPnrElement, responsibilityInformationType6835C.typeOfPnrElement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, iataCode, officeId, typeOfPnrElement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsibilityInformationType6835C {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    iataCode: ").append(toIndentedString(iataCode)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    typeOfPnrElement: ").append(toIndentedString(typeOfPnrElement)).append("\n");
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

