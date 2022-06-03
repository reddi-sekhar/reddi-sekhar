package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TicketResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class TicketResponseDto   {
  @JsonProperty("indicator")
  private String indicator;

  @JsonProperty("time")
  private String time;

  @JsonProperty("date")
  private String date;

  @JsonProperty("officeId")
  private String officeId;

  @JsonProperty("airlineCode")
  private String airlineCode;

  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("queueNumber")
  private String queueNumber;

  @JsonProperty("queueCategory")
  private String queueCategory;

  @JsonProperty("sitaAddress")
  @Valid
  private List<String> sitaAddress = null;

  public TicketResponseDto indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Ticketing type  TL, OK, DO, IN, MA, TR, AT, PT, XL, ST, SS
   * @return indicator
  */
  @ApiModelProperty(value = "Ticketing type  TL, OK, DO, IN, MA, TR, AT, PT, XL, ST, SS")

@Size(min=2,max=2) 
  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public TicketResponseDto time(String time) {
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

  public TicketResponseDto date(String date) {
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

  public TicketResponseDto officeId(String officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Office Id
   * @return officeId
  */
  @ApiModelProperty(example = "TYONH0111", value = "Office Id")

@Size(min=1,max=9) 
  public String getOfficeId() {
    return officeId;
  }

  public void setOfficeId(String officeId) {
    this.officeId = officeId;
  }

  public TicketResponseDto airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

  /**
   * Airline code
   * @return airlineCode
  */
  @ApiModelProperty(example = "NH", value = "Airline code")

@Size(min=1,max=3) 
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public TicketResponseDto freetext(String freetext) {
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

  public TicketResponseDto queueNumber(String queueNumber) {
    this.queueNumber = queueNumber;
    return this;
  }

  /**
   * Queue number
   * @return queueNumber
  */
  @ApiModelProperty(value = "Queue number")

@Size(min=1,max=3) 
  public String getQueueNumber() {
    return queueNumber;
  }

  public void setQueueNumber(String queueNumber) {
    this.queueNumber = queueNumber;
  }

  public TicketResponseDto queueCategory(String queueCategory) {
    this.queueCategory = queueCategory;
    return this;
  }

  /**
   * Category number
   * @return queueCategory
  */
  @ApiModelProperty(value = "Category number")

@Size(min=1,max=3) 
  public String getQueueCategory() {
    return queueCategory;
  }

  public void setQueueCategory(String queueCategory) {
    this.queueCategory = queueCategory;
  }

  public TicketResponseDto sitaAddress(List<String> sitaAddress) {
    this.sitaAddress = sitaAddress;
    return this;
  }

  public TicketResponseDto addSitaAddressItem(String sitaAddressItem) {
    if (this.sitaAddress == null) {
      this.sitaAddress = new ArrayList<>();
    }
    this.sitaAddress.add(sitaAddressItem);
    return this;
  }

  /**
   * Get sitaAddress
   * @return sitaAddress
  */
  @ApiModelProperty(value = "")


  public List<String> getSitaAddress() {
    return sitaAddress;
  }

  public void setSitaAddress(List<String> sitaAddress) {
    this.sitaAddress = sitaAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketResponseDto ticketResponseDto = (TicketResponseDto) o;
    return Objects.equals(this.indicator, ticketResponseDto.indicator) &&
        Objects.equals(this.time, ticketResponseDto.time) &&
        Objects.equals(this.date, ticketResponseDto.date) &&
        Objects.equals(this.officeId, ticketResponseDto.officeId) &&
        Objects.equals(this.airlineCode, ticketResponseDto.airlineCode) &&
        Objects.equals(this.freetext, ticketResponseDto.freetext) &&
        Objects.equals(this.queueNumber, ticketResponseDto.queueNumber) &&
        Objects.equals(this.queueCategory, ticketResponseDto.queueCategory) &&
        Objects.equals(this.sitaAddress, ticketResponseDto.sitaAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicator, time, date, officeId, airlineCode, freetext, queueNumber, queueCategory, sitaAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketResponseDto {\n");
    
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    queueNumber: ").append(toIndentedString(queueNumber)).append("\n");
    sb.append("    queueCategory: ").append(toIndentedString(queueCategory)).append("\n");
    sb.append("    sitaAddress: ").append(toIndentedString(sitaAddress)).append("\n");
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

