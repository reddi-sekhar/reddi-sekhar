package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.ResponsibilityInformationReferenceResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityInformationReferenceResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SecurityInformationReferenceResponseDto   {
  @JsonProperty("responsibilityInformation")
  private ResponsibilityInformationReferenceResponseDto responsibilityInformation;

  public SecurityInformationReferenceResponseDto responsibilityInformation(ResponsibilityInformationReferenceResponseDto responsibilityInformation) {
    this.responsibilityInformation = responsibilityInformation;
    return this;
  }

  /**
   * Get responsibilityInformation
   * @return responsibilityInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResponsibilityInformationReferenceResponseDto getResponsibilityInformation() {
    return responsibilityInformation;
  }

  public void setResponsibilityInformation(ResponsibilityInformationReferenceResponseDto responsibilityInformation) {
    this.responsibilityInformation = responsibilityInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityInformationReferenceResponseDto securityInformationReferenceResponseDto = (SecurityInformationReferenceResponseDto) o;
    return Objects.equals(this.responsibilityInformation, securityInformationReferenceResponseDto.responsibilityInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsibilityInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityInformationReferenceResponseDto {\n");
    
    sb.append("    responsibilityInformation: ").append(toIndentedString(responsibilityInformation)).append("\n");
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

