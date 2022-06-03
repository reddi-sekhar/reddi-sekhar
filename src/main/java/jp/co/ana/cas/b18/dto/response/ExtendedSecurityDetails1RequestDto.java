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
 * ExtendedSecurityDetails1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ExtendedSecurityDetails1RequestDto   {
  @JsonProperty("accessMode")
  private String accessMode;

  @JsonProperty("inhouseIdentification")
  private String inhouseIdentification;

  public ExtendedSecurityDetails1RequestDto accessMode(String accessMode) {
    this.accessMode = accessMode;
    return this;
  }

  /**
   * Used to specify the access mode regarding agreement and entities
   * @return accessMode
  */
  @ApiModelProperty(value = "Used to specify the access mode regarding agreement and entities")

@Size(min=1,max=1) 
  public String getAccessMode() {
    return accessMode;
  }

  public void setAccessMode(String accessMode) {
    this.accessMode = accessMode;
  }

  public ExtendedSecurityDetails1RequestDto inhouseIdentification(String inhouseIdentification) {
    this.inhouseIdentification = inhouseIdentification;
    return this;
  }

  /**
   * Used to specify entity on which the detailed security applied
   * @return inhouseIdentification
  */
  @ApiModelProperty(value = "Used to specify entity on which the detailed security applied")

@Size(min=1,max=9) 
  public String getInhouseIdentification() {
    return inhouseIdentification;
  }

  public void setInhouseIdentification(String inhouseIdentification) {
    this.inhouseIdentification = inhouseIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedSecurityDetails1RequestDto extendedSecurityDetails1RequestDto = (ExtendedSecurityDetails1RequestDto) o;
    return Objects.equals(this.accessMode, extendedSecurityDetails1RequestDto.accessMode) &&
        Objects.equals(this.inhouseIdentification, extendedSecurityDetails1RequestDto.inhouseIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, inhouseIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedSecurityDetails1RequestDto {\n");
    
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    inhouseIdentification: ").append(toIndentedString(inhouseIdentification)).append("\n");
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

