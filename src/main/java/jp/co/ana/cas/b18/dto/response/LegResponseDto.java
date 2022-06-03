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
 * LegResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class LegResponseDto   {
  @JsonProperty("origin")
  private String origin;

  @JsonProperty("destination")
  private String destination;

  public LegResponseDto origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * City pair to indentify uniquely a leg in a multi-leg booking
   * @return origin
  */
  @ApiModelProperty(example = "HND", value = "City pair to indentify uniquely a leg in a multi-leg booking")

@Size(min=1,max=3) 
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public LegResponseDto destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * City pair to indentify uniquely a leg in a multi-leg booking
   * @return destination
  */
  @ApiModelProperty(example = "FRA", value = "City pair to indentify uniquely a leg in a multi-leg booking")

@Size(min=1,max=3) 
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegResponseDto legResponseDto = (LegResponseDto) o;
    return Objects.equals(this.origin, legResponseDto.origin) &&
        Objects.equals(this.destination, legResponseDto.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origin, destination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegResponseDto {\n");
    
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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

