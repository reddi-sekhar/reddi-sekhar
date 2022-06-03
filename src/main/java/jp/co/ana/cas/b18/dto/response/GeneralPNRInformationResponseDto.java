package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.StatusDetailsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GeneralPNRInformationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class GeneralPNRInformationResponseDto   {
  @JsonProperty("statusDetails")
  private StatusDetailsResponseDto statusDetails;

  public GeneralPNRInformationResponseDto statusDetails(StatusDetailsResponseDto statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  /**
   * Get statusDetails
   * @return statusDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusDetailsResponseDto getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(StatusDetailsResponseDto statusDetails) {
    this.statusDetails = statusDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralPNRInformationResponseDto generalPNRInformationResponseDto = (GeneralPNRInformationResponseDto) o;
    return Objects.equals(this.statusDetails, generalPNRInformationResponseDto.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralPNRInformationResponseDto {\n");
    
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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

