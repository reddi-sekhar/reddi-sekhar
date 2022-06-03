package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.BookingChannel;
import jp.co.ana.cas.b18.connector.commandcryptic.vo.UniqueIDType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserID
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class UserID   {
  @JsonProperty("agentDutyCode")
  private String agentDutyCode;

  @JsonProperty("agentSign")
  private String agentSign;

  @JsonProperty("bookingChannel")
  private BookingChannel bookingChannel;

  @JsonProperty("date")
  private String date;

  @JsonProperty("erspuserID")
  private String erspuserID;

  @JsonProperty("firstDepartPoint")
  private String firstDepartPoint;

  @JsonProperty("isocountry")
  private String isocountry;

  @JsonProperty("isocurrency")
  private String isocurrency;

  @JsonProperty("language")
  private String language;

  @JsonProperty("postype")
  private String postype;

  @JsonProperty("pseudoCityCode")
  private String pseudoCityCode;

  @JsonProperty("requestorID")
  private UniqueIDType requestorID;

  @JsonProperty("requestorType")
  private String requestorType;

  @JsonProperty("time")
  private String time;

  /**
   * Gets or Sets timeZone
   */
  public enum TimeZoneEnum {
    UTC("UTC"),
    
    LOCAL("LOCAL");

    private String value;

    TimeZoneEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TimeZoneEnum fromValue(String value) {
      for (TimeZoneEnum b : TimeZoneEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("timeZone")
  private TimeZoneEnum timeZone;

  @JsonProperty("trueCityCode")
  private String trueCityCode;

  public UserID agentDutyCode(String agentDutyCode) {
    this.agentDutyCode = agentDutyCode;
    return this;
  }

  /**
   * Get agentDutyCode
   * @return agentDutyCode
  */
  @ApiModelProperty(value = "")


  public String getAgentDutyCode() {
    return agentDutyCode;
  }

  public void setAgentDutyCode(String agentDutyCode) {
    this.agentDutyCode = agentDutyCode;
  }

  public UserID agentSign(String agentSign) {
    this.agentSign = agentSign;
    return this;
  }

  /**
   * Get agentSign
   * @return agentSign
  */
  @ApiModelProperty(value = "")


  public String getAgentSign() {
    return agentSign;
  }

  public void setAgentSign(String agentSign) {
    this.agentSign = agentSign;
  }

  public UserID bookingChannel(BookingChannel bookingChannel) {
    this.bookingChannel = bookingChannel;
    return this;
  }

  /**
   * Get bookingChannel
   * @return bookingChannel
  */
  @ApiModelProperty(value = "")

  @Valid

  public BookingChannel getBookingChannel() {
    return bookingChannel;
  }

  public void setBookingChannel(BookingChannel bookingChannel) {
    this.bookingChannel = bookingChannel;
  }

  public UserID date(String date) {
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

  public UserID erspuserID(String erspuserID) {
    this.erspuserID = erspuserID;
    return this;
  }

  /**
   * Get erspuserID
   * @return erspuserID
  */
  @ApiModelProperty(value = "")


  public String getErspuserID() {
    return erspuserID;
  }

  public void setErspuserID(String erspuserID) {
    this.erspuserID = erspuserID;
  }

  public UserID firstDepartPoint(String firstDepartPoint) {
    this.firstDepartPoint = firstDepartPoint;
    return this;
  }

  /**
   * Get firstDepartPoint
   * @return firstDepartPoint
  */
  @ApiModelProperty(value = "")


  public String getFirstDepartPoint() {
    return firstDepartPoint;
  }

  public void setFirstDepartPoint(String firstDepartPoint) {
    this.firstDepartPoint = firstDepartPoint;
  }

  public UserID isocountry(String isocountry) {
    this.isocountry = isocountry;
    return this;
  }

  /**
   * Get isocountry
   * @return isocountry
  */
  @ApiModelProperty(value = "")


  public String getIsocountry() {
    return isocountry;
  }

  public void setIsocountry(String isocountry) {
    this.isocountry = isocountry;
  }

  public UserID isocurrency(String isocurrency) {
    this.isocurrency = isocurrency;
    return this;
  }

  /**
   * Get isocurrency
   * @return isocurrency
  */
  @ApiModelProperty(value = "")


  public String getIsocurrency() {
    return isocurrency;
  }

  public void setIsocurrency(String isocurrency) {
    this.isocurrency = isocurrency;
  }

  public UserID language(String language) {
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

  public UserID postype(String postype) {
    this.postype = postype;
    return this;
  }

  /**
   * Get postype
   * @return postype
  */
  @ApiModelProperty(value = "")


  public String getPostype() {
    return postype;
  }

  public void setPostype(String postype) {
    this.postype = postype;
  }

  public UserID pseudoCityCode(String pseudoCityCode) {
    this.pseudoCityCode = pseudoCityCode;
    return this;
  }

  /**
   * Get pseudoCityCode
   * @return pseudoCityCode
  */
  @ApiModelProperty(value = "")


  public String getPseudoCityCode() {
    return pseudoCityCode;
  }

  public void setPseudoCityCode(String pseudoCityCode) {
    this.pseudoCityCode = pseudoCityCode;
  }

  public UserID requestorID(UniqueIDType requestorID) {
    this.requestorID = requestorID;
    return this;
  }

  /**
   * Get requestorID
   * @return requestorID
  */
  @ApiModelProperty(value = "")

  @Valid

  public UniqueIDType getRequestorID() {
    return requestorID;
  }

  public void setRequestorID(UniqueIDType requestorID) {
    this.requestorID = requestorID;
  }

  public UserID requestorType(String requestorType) {
    this.requestorType = requestorType;
    return this;
  }

  /**
   * Get requestorType
   * @return requestorType
  */
  @ApiModelProperty(value = "")


  public String getRequestorType() {
    return requestorType;
  }

  public void setRequestorType(String requestorType) {
    this.requestorType = requestorType;
  }

  public UserID time(String time) {
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

  public UserID timeZone(TimeZoneEnum timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
  */
  @ApiModelProperty(value = "")


  public TimeZoneEnum getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(TimeZoneEnum timeZone) {
    this.timeZone = timeZone;
  }

  public UserID trueCityCode(String trueCityCode) {
    this.trueCityCode = trueCityCode;
    return this;
  }

  /**
   * Get trueCityCode
   * @return trueCityCode
  */
  @ApiModelProperty(value = "")


  public String getTrueCityCode() {
    return trueCityCode;
  }

  public void setTrueCityCode(String trueCityCode) {
    this.trueCityCode = trueCityCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserID userID = (UserID) o;
    return Objects.equals(this.agentDutyCode, userID.agentDutyCode) &&
        Objects.equals(this.agentSign, userID.agentSign) &&
        Objects.equals(this.bookingChannel, userID.bookingChannel) &&
        Objects.equals(this.date, userID.date) &&
        Objects.equals(this.erspuserID, userID.erspuserID) &&
        Objects.equals(this.firstDepartPoint, userID.firstDepartPoint) &&
        Objects.equals(this.isocountry, userID.isocountry) &&
        Objects.equals(this.isocurrency, userID.isocurrency) &&
        Objects.equals(this.language, userID.language) &&
        Objects.equals(this.postype, userID.postype) &&
        Objects.equals(this.pseudoCityCode, userID.pseudoCityCode) &&
        Objects.equals(this.requestorID, userID.requestorID) &&
        Objects.equals(this.requestorType, userID.requestorType) &&
        Objects.equals(this.time, userID.time) &&
        Objects.equals(this.timeZone, userID.timeZone) &&
        Objects.equals(this.trueCityCode, userID.trueCityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentDutyCode, agentSign, bookingChannel, date, erspuserID, firstDepartPoint, isocountry, isocurrency, language, postype, pseudoCityCode, requestorID, requestorType, time, timeZone, trueCityCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserID {\n");
    
    sb.append("    agentDutyCode: ").append(toIndentedString(agentDutyCode)).append("\n");
    sb.append("    agentSign: ").append(toIndentedString(agentSign)).append("\n");
    sb.append("    bookingChannel: ").append(toIndentedString(bookingChannel)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    erspuserID: ").append(toIndentedString(erspuserID)).append("\n");
    sb.append("    firstDepartPoint: ").append(toIndentedString(firstDepartPoint)).append("\n");
    sb.append("    isocountry: ").append(toIndentedString(isocountry)).append("\n");
    sb.append("    isocurrency: ").append(toIndentedString(isocurrency)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    postype: ").append(toIndentedString(postype)).append("\n");
    sb.append("    pseudoCityCode: ").append(toIndentedString(pseudoCityCode)).append("\n");
    sb.append("    requestorID: ").append(toIndentedString(requestorID)).append("\n");
    sb.append("    requestorType: ").append(toIndentedString(requestorType)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    trueCityCode: ").append(toIndentedString(trueCityCode)).append("\n");
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

