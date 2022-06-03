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
 * TicketInformation1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TicketInformation1RequestDto   {
  @JsonProperty("date")
  private String date;

  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("indicator")
  private String indicator;

  @JsonProperty("officeId")
  private String officeId;

  @JsonProperty("time")
  private String time;

  public TicketInformation1RequestDto date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Ticketing date
   * @return date
  */
  @ApiModelProperty(value = "Ticketing date")

@Pattern(regexp="(0[1-9]|[1-2][0-9]|3[0-1])(0[1-9]|1[0-2])[0-9]{2}") 
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public TicketInformation1RequestDto freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

  /**
   * Free flow text
   * @return freetext
  */
  @ApiModelProperty(value = "Free flow text")

@Size(min=1,max=15) 
  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public TicketInformation1RequestDto indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Ticketing type
   * @return indicator
  */
  @ApiModelProperty(required = true, value = "Ticketing type")
  @NotNull

@Size(min=2,max=2) 
  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public TicketInformation1RequestDto officeId(String officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Office Id
   * @return officeId
  */
  @ApiModelProperty(value = "Office Id")

@Size(min=1,max=9) 
  public String getOfficeId() {
    return officeId;
  }

  public void setOfficeId(String officeId) {
    this.officeId = officeId;
  }

  public TicketInformation1RequestDto time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Ticketing time
   * @return time
  */
  @ApiModelProperty(value = "Ticketing time")

@Pattern(regexp="([0-1][0-9]|2[0-3])[0-5][0-9]") 
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketInformation1RequestDto ticketInformation1RequestDto = (TicketInformation1RequestDto) o;
    return Objects.equals(this.date, ticketInformation1RequestDto.date) &&
        Objects.equals(this.freetext, ticketInformation1RequestDto.freetext) &&
        Objects.equals(this.indicator, ticketInformation1RequestDto.indicator) &&
        Objects.equals(this.officeId, ticketInformation1RequestDto.officeId) &&
        Objects.equals(this.time, ticketInformation1RequestDto.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, freetext, indicator, officeId, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketInformation1RequestDto {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

