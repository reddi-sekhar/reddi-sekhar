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
 * FlightResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FlightResponseDto   {
  @JsonProperty("cabin")
  private String cabin;

  @JsonProperty("subclass")
  private Long subclass;

  @JsonProperty("flightType")
  private String flightType;

  public FlightResponseDto cabin(String cabin) {
    this.cabin = cabin;
    return this;
  }

  /**
   * Cabin Code
   * @return cabin
  */
  @ApiModelProperty(value = "Cabin Code")

@Size(min=1,max=2) 
  public String getCabin() {
    return cabin;
  }

  public void setCabin(String cabin) {
    this.cabin = cabin;
  }

  public FlightResponseDto subclass(Long subclass) {
    this.subclass = subclass;
    return this;
  }

  /**
   * Get subclass
   * @return subclass
  */
  @ApiModelProperty(value = "")


  public Long getSubclass() {
    return subclass;
  }

  public void setSubclass(Long subclass) {
    this.subclass = subclass;
  }

  public FlightResponseDto flightType(String flightType) {
    this.flightType = flightType;
    return this;
  }

  /**
   * Flight Type
   * @return flightType
  */
  @ApiModelProperty(value = "Flight Type")

@Size(min=1,max=2) 
  public String getFlightType() {
    return flightType;
  }

  public void setFlightType(String flightType) {
    this.flightType = flightType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightResponseDto flightResponseDto = (FlightResponseDto) o;
    return Objects.equals(this.cabin, flightResponseDto.cabin) &&
        Objects.equals(this.subclass, flightResponseDto.subclass) &&
        Objects.equals(this.flightType, flightResponseDto.flightType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cabin, subclass, flightType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightResponseDto {\n");
    
    sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
    sb.append("    subclass: ").append(toIndentedString(subclass)).append("\n");
    sb.append("    flightType: ").append(toIndentedString(flightType)).append("\n");
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

