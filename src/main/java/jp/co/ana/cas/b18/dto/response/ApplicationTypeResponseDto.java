package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.ApplicationDetailsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicationTypeResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ApplicationTypeResponseDto   {
  @JsonProperty("applicationDetails")
  private ApplicationDetailsResponseDto applicationDetails;

  public ApplicationTypeResponseDto applicationDetails(ApplicationDetailsResponseDto applicationDetails) {
    this.applicationDetails = applicationDetails;
    return this;
  }

  /**
   * Get applicationDetails
   * @return applicationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApplicationDetailsResponseDto getApplicationDetails() {
    return applicationDetails;
  }

  public void setApplicationDetails(ApplicationDetailsResponseDto applicationDetails) {
    this.applicationDetails = applicationDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationTypeResponseDto applicationTypeResponseDto = (ApplicationTypeResponseDto) o;
    return Objects.equals(this.applicationDetails, applicationTypeResponseDto.applicationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationTypeResponseDto {\n");
    
    sb.append("    applicationDetails: ").append(toIndentedString(applicationDetails)).append("\n");
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

