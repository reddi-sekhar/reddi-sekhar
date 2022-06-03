package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.SeatRequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SeatGroupRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class SeatGroupRequestDto   {
  @JsonProperty("seatRequest")
  private SeatRequestDto seatRequest;

  public SeatGroupRequestDto seatRequest(SeatRequestDto seatRequest) {
    this.seatRequest = seatRequest;
    return this;
  }

  /**
   * Get seatRequest
   * @return seatRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public SeatRequestDto getSeatRequest() {
    return seatRequest;
  }

  public void setSeatRequest(SeatRequestDto seatRequest) {
    this.seatRequest = seatRequest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatGroupRequestDto seatGroupRequestDto = (SeatGroupRequestDto) o;
    return Objects.equals(this.seatRequest, seatGroupRequestDto.seatRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seatRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatGroupRequestDto {\n");
    
    sb.append("    seatRequest: ").append(toIndentedString(seatRequest)).append("\n");
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

