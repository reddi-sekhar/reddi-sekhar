package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.dto.response.InternalIdDetailsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AgentIdResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class AgentIdResponseDto   {
  @JsonProperty("internalIdDetails")
  @Valid
  private List<InternalIdDetailsResponseDto> internalIdDetails = null;

  public AgentIdResponseDto internalIdDetails(List<InternalIdDetailsResponseDto> internalIdDetails) {
    this.internalIdDetails = internalIdDetails;
    return this;
  }

  public AgentIdResponseDto addInternalIdDetailsItem(InternalIdDetailsResponseDto internalIdDetailsItem) {
    if (this.internalIdDetails == null) {
      this.internalIdDetails = new ArrayList<>();
    }
    this.internalIdDetails.add(internalIdDetailsItem);
    return this;
  }

  /**
   * Get internalIdDetails
   * @return internalIdDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<InternalIdDetailsResponseDto> getInternalIdDetails() {
    return internalIdDetails;
  }

  public void setInternalIdDetails(List<InternalIdDetailsResponseDto> internalIdDetails) {
    this.internalIdDetails = internalIdDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentIdResponseDto agentIdResponseDto = (AgentIdResponseDto) o;
    return Objects.equals(this.internalIdDetails, agentIdResponseDto.internalIdDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalIdDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentIdResponseDto {\n");
    
    sb.append("    internalIdDetails: ").append(toIndentedString(internalIdDetails)).append("\n");
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

