package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.TicketResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TicketElementResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TicketElementResponseDto   {
  @JsonProperty("printOptions")
  private String printOptions;

  @JsonProperty("ticket")
  private TicketResponseDto ticket;

  public TicketElementResponseDto printOptions(String printOptions) {
    this.printOptions = printOptions;
    return this;
  }

  /**
   * Print options (//print options after double slash)
   * @return printOptions
  */
  @ApiModelProperty(value = "Print options (//print options after double slash)")

@Size(min=1,max=127) 
  public String getPrintOptions() {
    return printOptions;
  }

  public void setPrintOptions(String printOptions) {
    this.printOptions = printOptions;
  }

  public TicketElementResponseDto ticket(TicketResponseDto ticket) {
    this.ticket = ticket;
    return this;
  }

  /**
   * Get ticket
   * @return ticket
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketResponseDto getTicket() {
    return ticket;
  }

  public void setTicket(TicketResponseDto ticket) {
    this.ticket = ticket;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketElementResponseDto ticketElementResponseDto = (TicketElementResponseDto) o;
    return Objects.equals(this.printOptions, ticketElementResponseDto.printOptions) &&
        Objects.equals(this.ticket, ticketElementResponseDto.ticket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(printOptions, ticket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketElementResponseDto {\n");
    
    sb.append("    printOptions: ").append(toIndentedString(printOptions)).append("\n");
    sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
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

