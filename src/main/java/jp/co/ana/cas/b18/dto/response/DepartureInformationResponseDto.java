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
 * DepartureInformationResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DepartureInformationResponseDto   {
  @JsonProperty("departTerminal")
  private String departTerminal;

  public DepartureInformationResponseDto departTerminal(String departTerminal) {
    this.departTerminal = departTerminal;
    return this;
  }

  /**
   * Depart Terminal
   * @return departTerminal
  */
  @ApiModelProperty(example = "3", value = "Depart Terminal")

@Size(min=1,max=2) 
  public String getDepartTerminal() {
    return departTerminal;
  }

  public void setDepartTerminal(String departTerminal) {
    this.departTerminal = departTerminal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepartureInformationResponseDto departureInformationResponseDto = (DepartureInformationResponseDto) o;
    return Objects.equals(this.departTerminal, departureInformationResponseDto.departTerminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departTerminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartureInformationResponseDto {\n");
    
    sb.append("    departTerminal: ").append(toIndentedString(departTerminal)).append("\n");
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

