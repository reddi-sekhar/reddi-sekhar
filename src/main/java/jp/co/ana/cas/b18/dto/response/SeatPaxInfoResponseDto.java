package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.CrossRefResponseDto;
import jp.co.ana.cas.b18.dto.response.SeatPaxDetailsResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SeatPaxInfoResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SeatPaxInfoResponseDto   {
  @JsonProperty("seatPaxDetails")
  private SeatPaxDetailsResponseDto seatPaxDetails;

  @JsonProperty("crossRef")
  private CrossRefResponseDto crossRef;

  public SeatPaxInfoResponseDto seatPaxDetails(SeatPaxDetailsResponseDto seatPaxDetails) {
    this.seatPaxDetails = seatPaxDetails;
    return this;
  }

  /**
   * Get seatPaxDetails
   * @return seatPaxDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SeatPaxDetailsResponseDto getSeatPaxDetails() {
    return seatPaxDetails;
  }

  public void setSeatPaxDetails(SeatPaxDetailsResponseDto seatPaxDetails) {
    this.seatPaxDetails = seatPaxDetails;
  }

  public SeatPaxInfoResponseDto crossRef(CrossRefResponseDto crossRef) {
    this.crossRef = crossRef;
    return this;
  }

  /**
   * Get crossRef
   * @return crossRef
  */
  @ApiModelProperty(value = "")

  @Valid

  public CrossRefResponseDto getCrossRef() {
    return crossRef;
  }

  public void setCrossRef(CrossRefResponseDto crossRef) {
    this.crossRef = crossRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatPaxInfoResponseDto seatPaxInfoResponseDto = (SeatPaxInfoResponseDto) o;
    return Objects.equals(this.seatPaxDetails, seatPaxInfoResponseDto.seatPaxDetails) &&
        Objects.equals(this.crossRef, seatPaxInfoResponseDto.crossRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seatPaxDetails, crossRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatPaxInfoResponseDto {\n");
    
    sb.append("    seatPaxDetails: ").append(toIndentedString(seatPaxDetails)).append("\n");
    sb.append("    crossRef: ").append(toIndentedString(crossRef)).append("\n");
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

