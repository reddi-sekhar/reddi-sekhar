package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TicketInformationType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TicketElementType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TicketElementType1   {
  @JsonProperty("passengerType")
  private String passengerType;

  @JsonProperty("printOptions")
  private String printOptions;

  @JsonProperty("ticket")
  private TicketInformationType1 ticket;

  public TicketElementType1 passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Get passengerType
   * @return passengerType
  */
  @ApiModelProperty(value = "")


  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  public TicketElementType1 printOptions(String printOptions) {
    this.printOptions = printOptions;
    return this;
  }

  /**
   * Get printOptions
   * @return printOptions
  */
  @ApiModelProperty(value = "")


  public String getPrintOptions() {
    return printOptions;
  }

  public void setPrintOptions(String printOptions) {
    this.printOptions = printOptions;
  }

  public TicketElementType1 ticket(TicketInformationType1 ticket) {
    this.ticket = ticket;
    return this;
  }

  /**
   * Get ticket
   * @return ticket
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketInformationType1 getTicket() {
    return ticket;
  }

  public void setTicket(TicketInformationType1 ticket) {
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
    TicketElementType1 ticketElementType1 = (TicketElementType1) o;
    return Objects.equals(this.passengerType, ticketElementType1.passengerType) &&
        Objects.equals(this.printOptions, ticketElementType1.printOptions) &&
        Objects.equals(this.ticket, ticketElementType1.ticket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passengerType, printOptions, ticket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketElementType1 {\n");
    
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
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

