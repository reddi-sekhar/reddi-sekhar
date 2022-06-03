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
 * OriginAndDestination1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class OriginAndDestination1RequestDto   {
  @JsonProperty("destination")
  private String destination;

  @JsonProperty("origin")
  private String origin;

  public OriginAndDestination1RequestDto destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Airport/city code of  Destination
   * @return destination
  */
  @ApiModelProperty(value = "Airport/city code of  Destination")

@Size(min=3,max=3) 
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public OriginAndDestination1RequestDto origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Airport/city code of  Origin
   * @return origin
  */
  @ApiModelProperty(value = "Airport/city code of  Origin")

@Size(min=3,max=3) 
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginAndDestination1RequestDto originAndDestination1RequestDto = (OriginAndDestination1RequestDto) o;
    return Objects.equals(this.destination, originAndDestination1RequestDto.destination) &&
        Objects.equals(this.origin, originAndDestination1RequestDto.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, origin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginAndDestination1RequestDto {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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

