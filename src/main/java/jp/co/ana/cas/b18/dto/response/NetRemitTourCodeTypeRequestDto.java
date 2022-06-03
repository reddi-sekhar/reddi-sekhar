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
 * NetRemitTourCodeTypeRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class NetRemitTourCodeTypeRequestDto   {
  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("indicator")
  private String indicator;

  public NetRemitTourCodeTypeRequestDto freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

  /**
   * Free flow text of next remit
   * @return freetext
  */
  @ApiModelProperty(value = "Free flow text of next remit")

@Size(min=1,max=14) 
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public NetRemitTourCodeTypeRequestDto indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Net remit indicator  N
   * @return indicator
  */
  @ApiModelProperty(value = "Net remit indicator  N")

@Size(min=1,max=2) 
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
    NetRemitTourCodeTypeRequestDto netRemitTourCodeTypeRequestDto = (NetRemitTourCodeTypeRequestDto) o;
    return Objects.equals(this.freetext, netRemitTourCodeTypeRequestDto.freetext) &&
        Objects.equals(this.indicator, netRemitTourCodeTypeRequestDto.indicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freetext, indicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetRemitTourCodeTypeRequestDto {\n");
    
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
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

