package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.SecurityDetailsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccessLevelResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class AccessLevelResponseDto   {
  @JsonProperty("securityDetails")
  private SecurityDetailsResponseDto securityDetails;

  public AccessLevelResponseDto securityDetails(SecurityDetailsResponseDto securityDetails) {
    this.securityDetails = securityDetails;
    return this;
  }

  /**
   * Get securityDetails
   * @return securityDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SecurityDetailsResponseDto getSecurityDetails() {
    return securityDetails;
  }

  public void setSecurityDetails(SecurityDetailsResponseDto securityDetails) {
    this.securityDetails = securityDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessLevelResponseDto accessLevelResponseDto = (AccessLevelResponseDto) o;
    return Objects.equals(this.securityDetails, accessLevelResponseDto.securityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessLevelResponseDto {\n");
    
    sb.append("    securityDetails: ").append(toIndentedString(securityDetails)).append("\n");
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

