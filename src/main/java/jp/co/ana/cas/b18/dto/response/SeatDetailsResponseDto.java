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
 * SeatDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SeatDetailsResponseDto   {
  @JsonProperty("seatNumber")
  private String seatNumber;

  public SeatDetailsResponseDto seatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
    return this;
  }

  /**
   * The seat number
   * @return seatNumber
  */
  @ApiModelProperty(value = "The seat number")

@Size(min=1,max=10) 
  public String getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatDetailsResponseDto seatDetailsResponseDto = (SeatDetailsResponseDto) o;
    return Objects.equals(this.seatNumber, seatDetailsResponseDto.seatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seatNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatDetailsResponseDto {\n");
    
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
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

