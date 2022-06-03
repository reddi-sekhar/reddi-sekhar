package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.AcceptanceOriginResponseDto;
import jp.co.ana.cas.b18.dto.response.ApplicationTypeResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AcceptanceChannelResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class AcceptanceChannelResponseDto   {
  @JsonProperty("acceptanceOrigin")
  private AcceptanceOriginResponseDto acceptanceOrigin;

  @JsonProperty("applicationType")
  private ApplicationTypeResponseDto applicationType;

  public AcceptanceChannelResponseDto acceptanceOrigin(AcceptanceOriginResponseDto acceptanceOrigin) {
    this.acceptanceOrigin = acceptanceOrigin;
    return this;
  }

  /**
   * Get acceptanceOrigin
   * @return acceptanceOrigin
  */
  @ApiModelProperty(value = "")

  @Valid

  public AcceptanceOriginResponseDto getAcceptanceOrigin() {
    return acceptanceOrigin;
  }

  public void setAcceptanceOrigin(AcceptanceOriginResponseDto acceptanceOrigin) {
    this.acceptanceOrigin = acceptanceOrigin;
  }

  public AcceptanceChannelResponseDto applicationType(ApplicationTypeResponseDto applicationType) {
    this.applicationType = applicationType;
    return this;
  }

  /**
   * Get applicationType
   * @return applicationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApplicationTypeResponseDto getApplicationType() {
    return applicationType;
  }

  public void setApplicationType(ApplicationTypeResponseDto applicationType) {
    this.applicationType = applicationType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptanceChannelResponseDto acceptanceChannelResponseDto = (AcceptanceChannelResponseDto) o;
    return Objects.equals(this.acceptanceOrigin, acceptanceChannelResponseDto.acceptanceOrigin) &&
        Objects.equals(this.applicationType, acceptanceChannelResponseDto.applicationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptanceOrigin, applicationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptanceChannelResponseDto {\n");
    
    sb.append("    acceptanceOrigin: ").append(toIndentedString(acceptanceOrigin)).append("\n");
    sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
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

