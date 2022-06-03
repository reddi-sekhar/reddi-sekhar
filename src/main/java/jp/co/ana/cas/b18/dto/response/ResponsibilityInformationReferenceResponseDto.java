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
 * ResponsibilityInformationReferenceResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ResponsibilityInformationReferenceResponseDto   {
  @JsonProperty("typeOfPnrElement")
  private String typeOfPnrElement;

  @JsonProperty("agentId")
  private String agentId;

  @JsonProperty("officeId")
  private String officeId;

  @JsonProperty("iataCode")
  private Long iataCode;

  public ResponsibilityInformationReferenceResponseDto typeOfPnrElement(String typeOfPnrElement) {
    this.typeOfPnrElement = typeOfPnrElement;
    return this;
  }

  /**
   * Type of PNR element
   * @return typeOfPnrElement
  */
  @ApiModelProperty(example = "RP", value = "Type of PNR element")

@Size(min=2,max=2) 
  public String getTypeOfPnrElement() {
    return typeOfPnrElement;
  }

  public void setTypeOfPnrElement(String typeOfPnrElement) {
    this.typeOfPnrElement = typeOfPnrElement;
  }

  public ResponsibilityInformationReferenceResponseDto agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

  /**
   * agent initials and dutycode
   * @return agentId
  */
  @ApiModelProperty(example = "AASU", value = "agent initials and dutycode")

@Size(min=4,max=4) 
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public ResponsibilityInformationReferenceResponseDto officeId(String officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Office ID
   * @return officeId
  */
  @ApiModelProperty(example = "TYONH0980", value = "Office ID")

@Size(min=1,max=9) 
  public String getOfficeId() {
    return officeId;
  }

  public void setOfficeId(String officeId) {
    this.officeId = officeId;
  }

  public ResponsibilityInformationReferenceResponseDto iataCode(Long iataCode) {
    this.iataCode = iataCode;
    return this;
  }

  /**
   * ATA/IATA reference number assigned to a travel agent
   * @return iataCode
  */
  @ApiModelProperty(value = "ATA/IATA reference number assigned to a travel agent")


  public Long getIataCode() {
    return iataCode;
  }

  public void setIataCode(Long iataCode) {
    this.iataCode = iataCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsibilityInformationReferenceResponseDto responsibilityInformationReferenceResponseDto = (ResponsibilityInformationReferenceResponseDto) o;
    return Objects.equals(this.typeOfPnrElement, responsibilityInformationReferenceResponseDto.typeOfPnrElement) &&
        Objects.equals(this.agentId, responsibilityInformationReferenceResponseDto.agentId) &&
        Objects.equals(this.officeId, responsibilityInformationReferenceResponseDto.officeId) &&
        Objects.equals(this.iataCode, responsibilityInformationReferenceResponseDto.iataCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeOfPnrElement, agentId, officeId, iataCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsibilityInformationReferenceResponseDto {\n");
    
    sb.append("    typeOfPnrElement: ").append(toIndentedString(typeOfPnrElement)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    iataCode: ").append(toIndentedString(iataCode)).append("\n");
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

