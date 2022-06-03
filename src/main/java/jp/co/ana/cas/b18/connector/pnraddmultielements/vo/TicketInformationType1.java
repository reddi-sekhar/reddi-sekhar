package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

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
 * TicketInformationType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TicketInformationType1   {
  @JsonProperty("airlineCode")
  private String airlineCode;

  @JsonProperty("date")
  private String date;

  @JsonProperty("freetext")
  private String freetext;

  @JsonProperty("indicator")
  private String indicator;

  @JsonProperty("officeId")
  private String officeId;

  @JsonProperty("queueCategory")
  private String queueCategory;

  @JsonProperty("queueNumber")
  private String queueNumber;

  @JsonProperty("sitaAddress")
  @Valid
  private List<String> sitaAddress = null;

  @JsonProperty("time")
  private String time;

  public TicketInformationType1 airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

  /**
   * Get airlineCode
   * @return airlineCode
  */
  @ApiModelProperty(value = "")


  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public TicketInformationType1 date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public TicketInformationType1 freetext(String freetext) {
    this.freetext = freetext;
    return this;
  }

  /**
   * Get freetext
   * @return freetext
  */
  @ApiModelProperty(value = "")


  public String getFreetext() {
    return freetext;
  }

  public void setFreetext(String freetext) {
    this.freetext = freetext;
  }

  public TicketInformationType1 indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * Get indicator
   * @return indicator
  */
  @ApiModelProperty(value = "")


  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public TicketInformationType1 officeId(String officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * Get officeId
   * @return officeId
  */
  @ApiModelProperty(value = "")


  public String getOfficeId() {
    return officeId;
  }

  public void setOfficeId(String officeId) {
    this.officeId = officeId;
  }

  public TicketInformationType1 queueCategory(String queueCategory) {
    this.queueCategory = queueCategory;
    return this;
  }

  /**
   * Get queueCategory
   * @return queueCategory
  */
  @ApiModelProperty(value = "")


  public String getQueueCategory() {
    return queueCategory;
  }

  public void setQueueCategory(String queueCategory) {
    this.queueCategory = queueCategory;
  }

  public TicketInformationType1 queueNumber(String queueNumber) {
    this.queueNumber = queueNumber;
    return this;
  }

  /**
   * Get queueNumber
   * @return queueNumber
  */
  @ApiModelProperty(value = "")


  public String getQueueNumber() {
    return queueNumber;
  }

  public void setQueueNumber(String queueNumber) {
    this.queueNumber = queueNumber;
  }

  public TicketInformationType1 sitaAddress(List<String> sitaAddress) {
    this.sitaAddress = sitaAddress;
    return this;
  }

  public TicketInformationType1 addSitaAddressItem(String sitaAddressItem) {
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

  public TicketInformationType1 time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")


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
    TicketInformationType1 ticketInformationType1 = (TicketInformationType1) o;
    return Objects.equals(this.airlineCode, ticketInformationType1.airlineCode) &&
        Objects.equals(this.date, ticketInformationType1.date) &&
        Objects.equals(this.freetext, ticketInformationType1.freetext) &&
        Objects.equals(this.indicator, ticketInformationType1.indicator) &&
        Objects.equals(this.officeId, ticketInformationType1.officeId) &&
        Objects.equals(this.queueCategory, ticketInformationType1.queueCategory) &&
        Objects.equals(this.queueNumber, ticketInformationType1.queueNumber) &&
        Objects.equals(this.sitaAddress, ticketInformationType1.sitaAddress) &&
        Objects.equals(this.time, ticketInformationType1.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineCode, date, freetext, indicator, officeId, queueCategory, queueNumber, sitaAddress, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketInformationType1 {\n");
    
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    queueCategory: ").append(toIndentedString(queueCategory)).append("\n");
    sb.append("    queueNumber: ").append(toIndentedString(queueNumber)).append("\n");
    sb.append("    sitaAddress: ").append(toIndentedString(sitaAddress)).append("\n");
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

