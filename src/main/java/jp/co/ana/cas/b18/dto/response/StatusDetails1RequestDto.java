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
 * StatusDetails1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class StatusDetails1RequestDto   {
  @JsonProperty("indicator")
  private String indicator;

  public StatusDetails1RequestDto indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * ATA/IATA defined Special Service Requirement code
   * @return indicator
  */
  @ApiModelProperty(value = "ATA/IATA defined Special Service Requirement code")

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
    StatusDetails1RequestDto statusDetails1RequestDto = (StatusDetails1RequestDto) o;
    return Objects.equals(this.indicator, statusDetails1RequestDto.indicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetails1RequestDto {\n");
    
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

