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
 * SecurityResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SecurityResponseDto   {
  @JsonProperty("accessMode")
  private String accessMode;

  @JsonProperty("identification")
  private String identification;

  public SecurityResponseDto accessMode(String accessMode) {
    this.accessMode = accessMode;
    return this;
  }

  /**
   * R for Read  B for Both read and write  N for None
   * @return accessMode
  */
  @ApiModelProperty(value = "R for Read  B for Both read and write  N for None")

@Size(min=1,max=1) 
  public String getAccessMode() {
    return accessMode;
  }

  public void setAccessMode(String accessMode) {
    this.accessMode = accessMode;
  }

  public SecurityResponseDto identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Type of receiver 
   * @return identification
  */
  @ApiModelProperty(value = "Type of receiver ")

@Size(min=1,max=14) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityResponseDto securityResponseDto = (SecurityResponseDto) o;
    return Objects.equals(this.accessMode, securityResponseDto.accessMode) &&
        Objects.equals(this.identification, securityResponseDto.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, identification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityResponseDto {\n");
    
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

