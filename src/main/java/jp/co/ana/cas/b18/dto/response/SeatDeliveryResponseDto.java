package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.SeatDetailsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SeatDeliveryResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SeatDeliveryResponseDto   {
  @JsonProperty("seatDetails")
  private SeatDetailsResponseDto seatDetails;

  public SeatDeliveryResponseDto seatDetails(SeatDetailsResponseDto seatDetails) {
    this.seatDetails = seatDetails;
    return this;
  }

  /**
   * Get seatDetails
   * @return seatDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SeatDetailsResponseDto getSeatDetails() {
    return seatDetails;
  }

  public void setSeatDetails(SeatDetailsResponseDto seatDetails) {
    this.seatDetails = seatDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatDeliveryResponseDto seatDeliveryResponseDto = (SeatDeliveryResponseDto) o;
    return Objects.equals(this.seatDetails, seatDeliveryResponseDto.seatDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seatDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatDeliveryResponseDto {\n");
    
    sb.append("    seatDetails: ").append(toIndentedString(seatDetails)).append("\n");
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

