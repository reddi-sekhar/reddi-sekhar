package jp.co.ana.cas.soapfront.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.Valid;

/**
 * UserID.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2022-04-12T10:54:30.513642700+05:30[Asia/Calcutta]")
public class UserID   {
  
  /** The agent duty code. */
  @JsonProperty("agentDutyCode")
  private String agentDutyCode;

  /** The agent sign. */
  @JsonProperty("agentSign")
  private String agentSign;

  /** The booking channel. */
  @JsonProperty("bookingChannel")
  private BookingChannel bookingChannel;

  /** The date. */
  @JsonProperty("date")
  private String date;

  /** The erspuser ID. */
  @JsonProperty("erspuserID")
  private String erspuserID;

  /** The first depart point. */
  @JsonProperty("firstDepartPoint")
  private String firstDepartPoint;

  /** The isocountry. */
  @JsonProperty("isocountry")
  private String isocountry;

  /** The isocurrency. */
  @JsonProperty("isocurrency")
  private String isocurrency;

  /** The language. */
  @JsonProperty("language")
  private String language;

  /** The postype. */
  @JsonProperty("postype")
  private String postype;

  /** The pseudo city code. */
  @JsonProperty("pseudoCityCode")
  private String pseudoCityCode;

  /** The requestor ID. */
  @JsonProperty("requestorID")
  private UniqueIDType requestorID;

  /** The requestor type. */
  @JsonProperty("requestorType")
  private String requestorType;

  /** The time. */
  @JsonProperty("time")
  private String time;

  /**
   * Gets or Sets timeZone.
   */
  public enum TimeZoneEnum {
    
    /** The utc. */
    UTC("UTC"),
    
    /** The local. */
    LOCAL("LOCAL");

    /** The value. */
    private String value;

    /**
     * Instantiates a new time zone enum.
     *
     * @param value the value
     */
    TimeZoneEnum(String value) {
      this.value = value;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    @JsonValue
    public String getValue() {
      return value;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * From value.
     *
     * @param value the value
     * @return the time zone enum
     */
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

  /** The time zone. */
  @JsonProperty("timeZone")
  private TimeZoneEnum timeZone;

  /** The true city code. */
  @JsonProperty("trueCityCode")
  private String trueCityCode;

  /**
   * Agent duty code.
   *
   * @param agentDutyCode the agent duty code
   * @return the user ID
   */
  public UserID agentDutyCode(String agentDutyCode) {
    this.agentDutyCode = agentDutyCode;
    return this;
  }

  /**
   * Get agentDutyCode.
   *
   * @return agentDutyCode
   */
  @ApiModelProperty(value = "")


  public String getAgentDutyCode() {
    return agentDutyCode;
  }

  /**
   * Sets the agent duty code.
   *
   * @param agentDutyCode the new agent duty code
   */
  public void setAgentDutyCode(String agentDutyCode) {
    this.agentDutyCode = agentDutyCode;
  }

  /**
   * Agent sign.
   *
   * @param agentSign the agent sign
   * @return the user ID
   */
  public UserID agentSign(String agentSign) {
    this.agentSign = agentSign;
    return this;
  }

  /**
   * Get agentSign.
   *
   * @return agentSign
   */
  @ApiModelProperty(value = "")


  public String getAgentSign() {
    return agentSign;
  }

  /**
   * Sets the agent sign.
   *
   * @param agentSign the new agent sign
   */
  public void setAgentSign(String agentSign) {
    this.agentSign = agentSign;
  }

  /**
   * Booking channel.
   *
   * @param bookingChannel the booking channel
   * @return the user ID
   */
  public UserID bookingChannel(BookingChannel bookingChannel) {
    this.bookingChannel = bookingChannel;
    return this;
  }

  /**
   * Get bookingChannel.
   *
   * @return bookingChannel
   */
  @ApiModelProperty(value = "")

  @Valid

  public BookingChannel getBookingChannel() {
    return bookingChannel;
  }

  /**
   * Sets the booking channel.
   *
   * @param bookingChannel the new booking channel
   */
  public void setBookingChannel(BookingChannel bookingChannel) {
    this.bookingChannel = bookingChannel;
  }

  /**
   * Date.
   *
   * @param date the date
   * @return the user ID
   */
  public UserID date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date.
   *
   * @return date
   */
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  /**
   * Sets the date.
   *
   * @param date the new date
   */
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * Erspuser ID.
   *
   * @param erspuserID the erspuser ID
   * @return the user ID
   */
  public UserID erspuserID(String erspuserID) {
    this.erspuserID = erspuserID;
    return this;
  }

  /**
   * Get erspuserID.
   *
   * @return erspuserID
   */
  @ApiModelProperty(value = "")


  public String getErspuserID() {
    return erspuserID;
  }

  /**
   * Sets the erspuser ID.
   *
   * @param erspuserID the new erspuser ID
   */
  public void setErspuserID(String erspuserID) {
    this.erspuserID = erspuserID;
  }

  /**
   * First depart point.
   *
   * @param firstDepartPoint the first depart point
   * @return the user ID
   */
  public UserID firstDepartPoint(String firstDepartPoint) {
    this.firstDepartPoint = firstDepartPoint;
    return this;
  }

  /**
   * Get firstDepartPoint.
   *
   * @return firstDepartPoint
   */
  @ApiModelProperty(value = "")


  public String getFirstDepartPoint() {
    return firstDepartPoint;
  }

  /**
   * Sets the first depart point.
   *
   * @param firstDepartPoint the new first depart point
   */
  public void setFirstDepartPoint(String firstDepartPoint) {
    this.firstDepartPoint = firstDepartPoint;
  }

  /**
   * Isocountry.
   *
   * @param isocountry the isocountry
   * @return the user ID
   */
  public UserID isocountry(String isocountry) {
    this.isocountry = isocountry;
    return this;
  }

  /**
   * Get isocountry.
   *
   * @return isocountry
   */
  @ApiModelProperty(value = "")


  public String getIsocountry() {
    return isocountry;
  }

  /**
   * Sets the isocountry.
   *
   * @param isocountry the new isocountry
   */
  public void setIsocountry(String isocountry) {
    this.isocountry = isocountry;
  }

  /**
   * Isocurrency.
   *
   * @param isocurrency the isocurrency
   * @return the user ID
   */
  public UserID isocurrency(String isocurrency) {
    this.isocurrency = isocurrency;
    return this;
  }

  /**
   * Get isocurrency.
   *
   * @return isocurrency
   */
  @ApiModelProperty(value = "")


  public String getIsocurrency() {
    return isocurrency;
  }

  /**
   * Sets the isocurrency.
   *
   * @param isocurrency the new isocurrency
   */
  public void setIsocurrency(String isocurrency) {
    this.isocurrency = isocurrency;
  }

  /**
   * Language.
   *
   * @param language the language
   * @return the user ID
   */
  public UserID language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language.
   *
   * @return language
   */
  @ApiModelProperty(value = "")


  public String getLanguage() {
    return language;
  }

  /**
   * Sets the language.
   *
   * @param language the new language
   */
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Postype.
   *
   * @param postype the postype
   * @return the user ID
   */
  public UserID postype(String postype) {
    this.postype = postype;
    return this;
  }

  /**
   * Get postype.
   *
   * @return postype
   */
  @ApiModelProperty(value = "")


  public String getPostype() {
    return postype;
  }

  /**
   * Sets the postype.
   *
   * @param postype the new postype
   */
  public void setPostype(String postype) {
    this.postype = postype;
  }

  /**
   * Pseudo city code.
   *
   * @param pseudoCityCode the pseudo city code
   * @return the user ID
   */
  public UserID pseudoCityCode(String pseudoCityCode) {
    this.pseudoCityCode = pseudoCityCode;
    return this;
  }

  /**
   * Get pseudoCityCode.
   *
   * @return pseudoCityCode
   */
  @ApiModelProperty(value = "")


  public String getPseudoCityCode() {
    return pseudoCityCode;
  }

  /**
   * Sets the pseudo city code.
   *
   * @param pseudoCityCode the new pseudo city code
   */
  public void setPseudoCityCode(String pseudoCityCode) {
    this.pseudoCityCode = pseudoCityCode;
  }

  /**
   * Requestor ID.
   *
   * @param requestorID the requestor ID
   * @return the user ID
   */
  public UserID requestorID(UniqueIDType requestorID) {
    this.requestorID = requestorID;
    return this;
  }

  /**
   * Get requestorID.
   *
   * @return requestorID
   */
  @ApiModelProperty(value = "")

  @Valid

  public UniqueIDType getRequestorID() {
    return requestorID;
  }

  /**
   * Sets the requestor ID.
   *
   * @param requestorID the new requestor ID
   */
  public void setRequestorID(UniqueIDType requestorID) {
    this.requestorID = requestorID;
  }

  /**
   * Requestor type.
   *
   * @param requestorType the requestor type
   * @return the user ID
   */
  public UserID requestorType(String requestorType) {
    this.requestorType = requestorType;
    return this;
  }

  /**
   * Get requestorType.
   *
   * @return requestorType
   */
  @ApiModelProperty(value = "")


  public String getRequestorType() {
    return requestorType;
  }

  /**
   * Sets the requestor type.
   *
   * @param requestorType the new requestor type
   */
  public void setRequestorType(String requestorType) {
    this.requestorType = requestorType;
  }

  /**
   * Time.
   *
   * @param time the time
   * @return the user ID
   */
  public UserID time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time.
   *
   * @return time
   */
  @ApiModelProperty(value = "")


  public String getTime() {
    return time;
  }

  /**
   * Sets the time.
   *
   * @param time the new time
   */
  public void setTime(String time) {
    this.time = time;
  }

  /**
   * Time zone.
   *
   * @param timeZone the time zone
   * @return the user ID
   */
  public UserID timeZone(TimeZoneEnum timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone.
   *
   * @return timeZone
   */
  @ApiModelProperty(value = "")


  public TimeZoneEnum getTimeZone() {
    return timeZone;
  }

  /**
   * Sets the time zone.
   *
   * @param timeZone the new time zone
   */
  public void setTimeZone(TimeZoneEnum timeZone) {
    this.timeZone = timeZone;
  }

  /**
   * True city code.
   *
   * @param trueCityCode the true city code
   * @return the user ID
   */
  public UserID trueCityCode(String trueCityCode) {
    this.trueCityCode = trueCityCode;
    return this;
  }

  /**
   * Get trueCityCode.
   *
   * @return trueCityCode
   */
  @ApiModelProperty(value = "")


  public String getTrueCityCode() {
    return trueCityCode;
  }

  /**
   * Sets the true city code.
   *
   * @param trueCityCode the new true city code
   */
  public void setTrueCityCode(String trueCityCode) {
    this.trueCityCode = trueCityCode;
  }


  /**
   * Equals.
   *
   * @param o the o
   * @return true, if successful
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserID userID = (UserID) o;
    return Objects.equals(this.agentDutyCode, userID.agentDutyCode)
        && Objects.equals(this.agentSign, userID.agentSign)
        && Objects.equals(this.bookingChannel, userID.bookingChannel)
        && Objects.equals(this.date, userID.date)
        && Objects.equals(this.erspuserID, userID.erspuserID)
        && Objects.equals(this.firstDepartPoint, userID.firstDepartPoint)
        && Objects.equals(this.isocountry, userID.isocountry)
        && Objects.equals(this.isocurrency, userID.isocurrency)
        && Objects.equals(this.language, userID.language)
        && Objects.equals(this.postype, userID.postype)
        && Objects.equals(this.pseudoCityCode, userID.pseudoCityCode)
        && Objects.equals(this.requestorID, userID.requestorID)
        && Objects.equals(this.requestorType, userID.requestorType)
        && Objects.equals(this.time, userID.time)
        && Objects.equals(this.timeZone, userID.timeZone)
        && Objects.equals(this.trueCityCode, userID.trueCityCode);
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return Objects.hash(agentDutyCode, agentSign, bookingChannel, date, erspuserID,
        firstDepartPoint, isocountry, isocurrency, language, postype, pseudoCityCode,
        requestorID, requestorType, time, timeZone, trueCityCode);
  }

  /**
   * To string.
   *
   * @return the string
   */
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
   *
   * @param o the o
   * @return the string
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

