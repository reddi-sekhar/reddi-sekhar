package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TicketingCarrierType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TicketingCarrierType   {
  @JsonProperty("airlineCode")
  private String airlineCode;

  @JsonProperty("language")
  private String language;

  @JsonProperty("optionInfo")
  private String optionInfo;

  @JsonProperty("printerNumber")
  private String printerNumber;

  public TicketingCarrierType airlineCode(String airlineCode) {
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

  public TicketingCarrierType language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  */
  @ApiModelProperty(value = "")


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public TicketingCarrierType optionInfo(String optionInfo) {
    this.optionInfo = optionInfo;
    return this;
  }

  /**
   * Get optionInfo
   * @return optionInfo
  */
  @ApiModelProperty(value = "")


  public String getOptionInfo() {
    return optionInfo;
  }

  public void setOptionInfo(String optionInfo) {
    this.optionInfo = optionInfo;
  }

  public TicketingCarrierType printerNumber(String printerNumber) {
    this.printerNumber = printerNumber;
    return this;
  }

  /**
   * Get printerNumber
   * @return printerNumber
  */
  @ApiModelProperty(value = "")


  public String getPrinterNumber() {
    return printerNumber;
  }

  public void setPrinterNumber(String printerNumber) {
    this.printerNumber = printerNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TicketingCarrierType ticketingCarrierType = (TicketingCarrierType) o;
    return Objects.equals(this.airlineCode, ticketingCarrierType.airlineCode) &&
        Objects.equals(this.language, ticketingCarrierType.language) &&
        Objects.equals(this.optionInfo, ticketingCarrierType.optionInfo) &&
        Objects.equals(this.printerNumber, ticketingCarrierType.printerNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineCode, language, optionInfo, printerNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TicketingCarrierType {\n");
    
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    optionInfo: ").append(toIndentedString(optionInfo)).append("\n");
    sb.append("    printerNumber: ").append(toIndentedString(printerNumber)).append("\n");
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

