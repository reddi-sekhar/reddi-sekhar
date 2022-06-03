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
 * ArrivalStationInfoResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ArrivalStationInfoResponseDto   {
  @JsonProperty("terminal")
  private String terminal;

  public ArrivalStationInfoResponseDto terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }

  /**
   * Arrival Terminal
   * @return terminal
  */
  @ApiModelProperty(example = "1", value = "Arrival Terminal")

@Size(min=1,max=2) 
  public String getTerminal() {
    return terminal;
  }

  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrivalStationInfoResponseDto arrivalStationInfoResponseDto = (ArrivalStationInfoResponseDto) o;
    return Objects.equals(this.terminal, arrivalStationInfoResponseDto.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrivalStationInfoResponseDto {\n");
    
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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

