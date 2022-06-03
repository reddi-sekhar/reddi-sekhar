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
 * StructuredDateTimeType285976C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredDateTimeType285976C   {
  @JsonProperty("day")
  private Long day;

  @JsonProperty("hour")
  private Long hour;

  @JsonProperty("milliseconds")
  private Long milliseconds;

  @JsonProperty("minutes")
  private Long minutes;

  @JsonProperty("month")
  private Long month;

  @JsonProperty("seconds")
  private Long seconds;

  @JsonProperty("year")
  private String year;

  public StructuredDateTimeType285976C day(Long day) {
    this.day = day;
    return this;
  }

  /**
   * Get day
   * @return day
  */
  @ApiModelProperty(value = "")


  public Long getDay() {
    return day;
  }

  public void setDay(Long day) {
    this.day = day;
  }

  public StructuredDateTimeType285976C hour(Long hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Get hour
   * @return hour
  */
  @ApiModelProperty(value = "")


  public Long getHour() {
    return hour;
  }

  public void setHour(Long hour) {
    this.hour = hour;
  }

  public StructuredDateTimeType285976C milliseconds(Long milliseconds) {
    this.milliseconds = milliseconds;
    return this;
  }

  /**
   * Get milliseconds
   * @return milliseconds
  */
  @ApiModelProperty(value = "")


  public Long getMilliseconds() {
    return milliseconds;
  }

  public void setMilliseconds(Long milliseconds) {
    this.milliseconds = milliseconds;
  }

  public StructuredDateTimeType285976C minutes(Long minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * Get minutes
   * @return minutes
  */
  @ApiModelProperty(value = "")


  public Long getMinutes() {
    return minutes;
  }

  public void setMinutes(Long minutes) {
    this.minutes = minutes;
  }

  public StructuredDateTimeType285976C month(Long month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  */
  @ApiModelProperty(value = "")


  public Long getMonth() {
    return month;
  }

  public void setMonth(Long month) {
    this.month = month;
  }

  public StructuredDateTimeType285976C seconds(Long seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * Get seconds
   * @return seconds
  */
  @ApiModelProperty(value = "")


  public Long getSeconds() {
    return seconds;
  }

  public void setSeconds(Long seconds) {
    this.seconds = seconds;
  }

  public StructuredDateTimeType285976C year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  */
  @ApiModelProperty(value = "")


  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredDateTimeType285976C structuredDateTimeType285976C = (StructuredDateTimeType285976C) o;
    return Objects.equals(this.day, structuredDateTimeType285976C.day) &&
        Objects.equals(this.hour, structuredDateTimeType285976C.hour) &&
        Objects.equals(this.milliseconds, structuredDateTimeType285976C.milliseconds) &&
        Objects.equals(this.minutes, structuredDateTimeType285976C.minutes) &&
        Objects.equals(this.month, structuredDateTimeType285976C.month) &&
        Objects.equals(this.seconds, structuredDateTimeType285976C.seconds) &&
        Objects.equals(this.year, structuredDateTimeType285976C.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, hour, milliseconds, minutes, month, seconds, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDateTimeType285976C {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    milliseconds: ").append(toIndentedString(milliseconds)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

