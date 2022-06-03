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
 * CommandCrypticRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class CommandCrypticRequestDto   {
  @JsonProperty("cityOrAirportCode")
  private String cityOrAirportCode;

  public CommandCrypticRequestDto cityOrAirportCode(String cityOrAirportCode) {
    this.cityOrAirportCode = cityOrAirportCode;
    return this;
  }

  /**
   * city code
   * @return cityOrAirportCode
  */
  @ApiModelProperty(example = "LAX", value = "city code")


  public String getCityOrAirportCode() {
    return cityOrAirportCode;
  }

  public void setCityOrAirportCode(String cityOrAirportCode) {
    this.cityOrAirportCode = cityOrAirportCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandCrypticRequestDto commandCrypticRequestDto = (CommandCrypticRequestDto) o;
    return Objects.equals(this.cityOrAirportCode, commandCrypticRequestDto.cityOrAirportCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityOrAirportCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandCrypticRequestDto {\n");
    
    sb.append("    cityOrAirportCode: ").append(toIndentedString(cityOrAirportCode)).append("\n");
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

