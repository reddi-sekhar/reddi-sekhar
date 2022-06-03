package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.AgentIdResponseDto;
import jp.co.ana.cas.b18.dto.response.PointOfSaleDateResponseDto;
import jp.co.ana.cas.b18.dto.response.SbrUserIdentificationResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EltPosDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class EltPosDetailsResponseDto   {
  @JsonProperty("sbrUserIdentification")
  private SbrUserIdentificationResponseDto sbrUserIdentification;

  @JsonProperty("agentId")
  private AgentIdResponseDto agentId;

  @JsonProperty("pointOfSaleDate")
  private PointOfSaleDateResponseDto pointOfSaleDate;

  public EltPosDetailsResponseDto sbrUserIdentification(SbrUserIdentificationResponseDto sbrUserIdentification) {
    this.sbrUserIdentification = sbrUserIdentification;
    return this;
  }

  /**
   * Get sbrUserIdentification
   * @return sbrUserIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public SbrUserIdentificationResponseDto getSbrUserIdentification() {
    return sbrUserIdentification;
  }

  public void setSbrUserIdentification(SbrUserIdentificationResponseDto sbrUserIdentification) {
    this.sbrUserIdentification = sbrUserIdentification;
  }

  public EltPosDetailsResponseDto agentId(AgentIdResponseDto agentId) {
    this.agentId = agentId;
    return this;
  }

  /**
   * Get agentId
   * @return agentId
  */
  @ApiModelProperty(value = "")

  @Valid

  public AgentIdResponseDto getAgentId() {
    return agentId;
  }

  public void setAgentId(AgentIdResponseDto agentId) {
    this.agentId = agentId;
  }

  public EltPosDetailsResponseDto pointOfSaleDate(PointOfSaleDateResponseDto pointOfSaleDate) {
    this.pointOfSaleDate = pointOfSaleDate;
    return this;
  }

  /**
   * Get pointOfSaleDate
   * @return pointOfSaleDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public PointOfSaleDateResponseDto getPointOfSaleDate() {
    return pointOfSaleDate;
  }

  public void setPointOfSaleDate(PointOfSaleDateResponseDto pointOfSaleDate) {
    this.pointOfSaleDate = pointOfSaleDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EltPosDetailsResponseDto eltPosDetailsResponseDto = (EltPosDetailsResponseDto) o;
    return Objects.equals(this.sbrUserIdentification, eltPosDetailsResponseDto.sbrUserIdentification) &&
        Objects.equals(this.agentId, eltPosDetailsResponseDto.agentId) &&
        Objects.equals(this.pointOfSaleDate, eltPosDetailsResponseDto.pointOfSaleDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sbrUserIdentification, agentId, pointOfSaleDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EltPosDetailsResponseDto {\n");
    
    sb.append("    sbrUserIdentification: ").append(toIndentedString(sbrUserIdentification)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    pointOfSaleDate: ").append(toIndentedString(pointOfSaleDate)).append("\n");
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

