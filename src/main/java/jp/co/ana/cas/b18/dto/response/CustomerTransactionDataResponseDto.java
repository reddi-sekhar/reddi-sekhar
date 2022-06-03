package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.FlightResponseDto;
import jp.co.ana.cas.b18.dto.response.POSResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerTransactionDataResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class CustomerTransactionDataResponseDto   {
  @JsonProperty("pos")
  private POSResponseDto pos;

  @JsonProperty("flight")
  private FlightResponseDto flight;

  @JsonProperty("connection")
  private Long connection;

  public CustomerTransactionDataResponseDto pos(POSResponseDto pos) {
    this.pos = pos;
    return this;
  }

  /**
   * Get pos
   * @return pos
  */
  @ApiModelProperty(value = "")

  @Valid

  public POSResponseDto getPos() {
    return pos;
  }

  public void setPos(POSResponseDto pos) {
    this.pos = pos;
  }

  public CustomerTransactionDataResponseDto flight(FlightResponseDto flight) {
    this.flight = flight;
    return this;
  }

  /**
   * Get flight
   * @return flight
  */
  @ApiModelProperty(value = "")

  @Valid

  public FlightResponseDto getFlight() {
    return flight;
  }

  public void setFlight(FlightResponseDto flight) {
    this.flight = flight;
  }

  public CustomerTransactionDataResponseDto connection(Long connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Get connection
   * @return connection
  */
  @ApiModelProperty(value = "")


  public Long getConnection() {
    return connection;
  }

  public void setConnection(Long connection) {
    this.connection = connection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerTransactionDataResponseDto customerTransactionDataResponseDto = (CustomerTransactionDataResponseDto) o;
    return Objects.equals(this.pos, customerTransactionDataResponseDto.pos) &&
        Objects.equals(this.flight, customerTransactionDataResponseDto.flight) &&
        Objects.equals(this.connection, customerTransactionDataResponseDto.connection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pos, flight, connection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerTransactionDataResponseDto {\n");
    
    sb.append("    pos: ").append(toIndentedString(pos)).append("\n");
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
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

