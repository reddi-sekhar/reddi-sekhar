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
 * TicketInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TicketInformationType   {
  @JsonProperty("airlineCode")
  private String airlineCode;

  @JsonProperty("date")
  private String date;

  @JsonProperty("electronicTicketFlag")
  private String electronicTicketFlag;

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

  @JsonProperty("transactionFlag")
  private String transactionFlag;

  public TicketInformationType airlineCode(String airlineCode) {
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

  public TicketInformationType date(String date) {
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

  public TicketInformationType electronicTicketFlag(String electronicTicketFlag) {
    this.electronicTicketFlag = electronicTicketFlag;
    return this;
  }

  /**
   * Get electronicTicketFlag
   * @return electronicTicketFlag
  */
  @ApiModelProperty(value = "")


  public String getElectronicTicketFlag() {
    return electronicTicketFlag;
  }

  public void setElectronicTicketFlag(String electronicTicketFlag) {
    this.electronicTicketFlag = electronicTicketFlag;
  }

  public TicketInformationType freetext(String freetext) {
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

  public TicketInformationType indicator(String indicator) {
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

  public TicketInformationType officeId(String officeId) {
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

  public TicketInformationType queueCategory(String queueCategory) {
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

  public TicketInformationType queueNumber(String queueNumber) {
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

  public TicketInformationType sitaAddress(List<String> sitaAddress) {
    this.sitaAddress = sitaAddress;
    return this;
  }

  public TicketInformationType addSitaAddressItem(String sitaAddressItem) {
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

  public TicketInformationType time(String time) {
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

  public TicketInformationType transactionFlag(String transactionFlag) {
    this.transactionFlag = transactionFlag;
    return this;
  }

  /**
   * Get transactionFlag
   * @return transactionFlag
  */
  @ApiModelProperty(value = "")


  public String getTransactionFlag() {
    return transactionFlag;
  }

  public void setTransactionFlag(String transactionFlag) {
    this.transactionFlag = transactionFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketInformationType ticketInformationType = (TicketInformationType) o;
    return Objects.equals(this.airlineCode, ticketInformationType.airlineCode) &&
        Objects.equals(this.date, ticketInformationType.date) &&
        Objects.equals(this.electronicTicketFlag, ticketInformationType.electronicTicketFlag) &&
        Objects.equals(this.freetext, ticketInformationType.freetext) &&
        Objects.equals(this.indicator, ticketInformationType.indicator) &&
        Objects.equals(this.officeId, ticketInformationType.officeId) &&
        Objects.equals(this.queueCategory, ticketInformationType.queueCategory) &&
        Objects.equals(this.queueNumber, ticketInformationType.queueNumber) &&
        Objects.equals(this.sitaAddress, ticketInformationType.sitaAddress) &&
        Objects.equals(this.time, ticketInformationType.time) &&
        Objects.equals(this.transactionFlag, ticketInformationType.transactionFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineCode, date, electronicTicketFlag, freetext, indicator, officeId, queueCategory, queueNumber, sitaAddress, time, transactionFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketInformationType {\n");
    
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    electronicTicketFlag: ").append(toIndentedString(electronicTicketFlag)).append("\n");
    sb.append("    freetext: ").append(toIndentedString(freetext)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    queueCategory: ").append(toIndentedString(queueCategory)).append("\n");
    sb.append("    queueNumber: ").append(toIndentedString(queueNumber)).append("\n");
    sb.append("    sitaAddress: ").append(toIndentedString(sitaAddress)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    transactionFlag: ").append(toIndentedString(transactionFlag)).append("\n");
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

