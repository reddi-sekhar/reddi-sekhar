package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.TicketInformation1RequestDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TicketElement1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TicketElement1RequestDto   {
  @JsonProperty("ticket")
  private TicketInformation1RequestDto ticket;

  public TicketElement1RequestDto ticket(TicketInformation1RequestDto ticket) {
    this.ticket = ticket;
    return this;
  }

  /**
   * Get ticket
   * @return ticket
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketInformation1RequestDto getTicket() {
    return ticket;
  }

  public void setTicket(TicketInformation1RequestDto ticket) {
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
    TicketElement1RequestDto ticketElement1RequestDto = (TicketElement1RequestDto) o;
    return Objects.equals(this.ticket, ticketElement1RequestDto.ticket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketElement1RequestDto {\n");
    
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

