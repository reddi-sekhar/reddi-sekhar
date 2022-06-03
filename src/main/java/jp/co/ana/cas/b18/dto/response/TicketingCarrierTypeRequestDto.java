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
 * TicketingCarrierTypeRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TicketingCarrierTypeRequestDto   {
  @JsonProperty("airlineCode")
  private String airlineCode;

  public TicketingCarrierTypeRequestDto airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

  /**
   * Airline code of sponsor
   * @return airlineCode
  */
  @ApiModelProperty(value = "Airline code of sponsor")

@Size(min=1,max=3) 
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketingCarrierTypeRequestDto ticketingCarrierTypeRequestDto = (TicketingCarrierTypeRequestDto) o;
    return Objects.equals(this.airlineCode, ticketingCarrierTypeRequestDto.airlineCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketingCarrierTypeRequestDto {\n");
    
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
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

