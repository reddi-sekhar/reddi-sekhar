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
 * StatusDetailsPaxResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class StatusDetailsPaxResponseDto   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("indicator")
  private String indicator;

  public StatusDetailsPaxResponseDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Qualifies the status
   * @return type
  */
  @ApiModelProperty(value = "Qualifies the status")

@Size(min=1,max=3) 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public StatusDetailsPaxResponseDto indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Status of the entity
   * @return indicator
  */
  @ApiModelProperty(value = "Status of the entity")

@Size(min=1,max=3) 
  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDetailsPaxResponseDto statusDetailsPaxResponseDto = (StatusDetailsPaxResponseDto) o;
    return Objects.equals(this.type, statusDetailsPaxResponseDto.type) &&
        Objects.equals(this.indicator, statusDetailsPaxResponseDto.indicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, indicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetailsPaxResponseDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
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

