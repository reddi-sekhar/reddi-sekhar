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
 * CommandCrypticReplyResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class CommandCrypticReplyResponseDto   {
  @JsonProperty("cityOrAirportCode")
  private String cityOrAirportCode;

  @JsonProperty("cityCode")
  private String cityCode;

  @JsonProperty("time")
  private String time;

  @JsonProperty("date")
  private String date;

  @JsonProperty("gmtDifference")
  private String gmtDifference;

  public CommandCrypticReplyResponseDto cityOrAirportCode(String cityOrAirportCode) {
    this.cityOrAirportCode = cityOrAirportCode;
    return this;
  }

  /**
   * entered city code
   * @return cityOrAirportCode
  */
  @ApiModelProperty(example = "LAX", value = "entered city code")


  public String getCityOrAirportCode() {
    return cityOrAirportCode;
  }

  public void setCityOrAirportCode(String cityOrAirportCode) {
    this.cityOrAirportCode = cityOrAirportCode;
  }

  public CommandCrypticReplyResponseDto cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * response cityCode
   * @return cityCode
  */
  @ApiModelProperty(example = "TYO", value = "response cityCode")


  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public CommandCrypticReplyResponseDto time(String time) {
    this.time = time;
    return this;
  }

  /**
   * provides the time
   * @return time
  */
  @ApiModelProperty(example = "0304/0304A", value = "provides the time")


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public CommandCrypticReplyResponseDto date(String date) {
    this.date = date;
    return this;
  }

  /**
   * provides the date
   * @return date
  */
  @ApiModelProperty(example = "WED25MAY22", value = "provides the date")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public CommandCrypticReplyResponseDto gmtDifference(String gmtDifference) {
    this.gmtDifference = gmtDifference;
    return this;
  }

  /**
   * provides the hours and minutes difference from the office code
   * @return gmtDifference
  */
  @ApiModelProperty(example = "-16:00", value = "provides the hours and minutes difference from the office code")


  public String getGmtDifference() {
    return gmtDifference;
  }

  public void setGmtDifference(String gmtDifference) {
    this.gmtDifference = gmtDifference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandCrypticReplyResponseDto commandCrypticReplyResponseDto = (CommandCrypticReplyResponseDto) o;
    return Objects.equals(this.cityOrAirportCode, commandCrypticReplyResponseDto.cityOrAirportCode) &&
        Objects.equals(this.cityCode, commandCrypticReplyResponseDto.cityCode) &&
        Objects.equals(this.time, commandCrypticReplyResponseDto.time) &&
        Objects.equals(this.date, commandCrypticReplyResponseDto.date) &&
        Objects.equals(this.gmtDifference, commandCrypticReplyResponseDto.gmtDifference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityOrAirportCode, cityCode, time, date, gmtDifference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandCrypticReplyResponseDto {\n");
    
    sb.append("    cityOrAirportCode: ").append(toIndentedString(cityOrAirportCode)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    gmtDifference: ").append(toIndentedString(gmtDifference)).append("\n");
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

