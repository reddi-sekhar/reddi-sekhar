package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.OriginIdentificationResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SbrUserIdentificationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SbrUserIdentificationResponseDto   {
  @JsonProperty("originIdentification")
  private OriginIdentificationResponseDto originIdentification;

  public SbrUserIdentificationResponseDto originIdentification(OriginIdentificationResponseDto originIdentification) {
    this.originIdentification = originIdentification;
    return this;
  }

  /**
   * Get originIdentification
   * @return originIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginIdentificationResponseDto getOriginIdentification() {
    return originIdentification;
  }

  public void setOriginIdentification(OriginIdentificationResponseDto originIdentification) {
    this.originIdentification = originIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SbrUserIdentificationResponseDto sbrUserIdentificationResponseDto = (SbrUserIdentificationResponseDto) o;
    return Objects.equals(this.originIdentification, sbrUserIdentificationResponseDto.originIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SbrUserIdentificationResponseDto {\n");
    
    sb.append("    originIdentification: ").append(toIndentedString(originIdentification)).append("\n");
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

