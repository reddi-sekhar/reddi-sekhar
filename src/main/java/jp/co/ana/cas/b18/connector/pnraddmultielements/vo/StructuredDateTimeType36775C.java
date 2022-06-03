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
 * StructuredDateTimeType36775C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredDateTimeType36775C   {
  @JsonProperty("day")
  private String day;

  @JsonProperty("hour")
  private String hour;

  @JsonProperty("minutes")
  private String minutes;

  @JsonProperty("month")
  private String month;

  @JsonProperty("seconds")
  private Long seconds;

  @JsonProperty("year")
  private String year;

  public StructuredDateTimeType36775C day(String day) {
    this.day = day;
    return this;
  }

  /**
   * Get day
   * @return day
  */
  @ApiModelProperty(value = "")


  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public StructuredDateTimeType36775C hour(String hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Get hour
   * @return hour
  */
  @ApiModelProperty(value = "")


  public String getHour() {
    return hour;
  }

  public void setHour(String hour) {
    this.hour = hour;
  }

  public StructuredDateTimeType36775C minutes(String minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * Get minutes
   * @return minutes
  */
  @ApiModelProperty(value = "")


  public String getMinutes() {
    return minutes;
  }

  public void setMinutes(String minutes) {
    this.minutes = minutes;
  }

  public StructuredDateTimeType36775C month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  */
  @ApiModelProperty(value = "")


  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public StructuredDateTimeType36775C seconds(Long seconds) {
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

  public StructuredDateTimeType36775C year(String year) {
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
    StructuredDateTimeType36775C structuredDateTimeType36775C = (StructuredDateTimeType36775C) o;
    return Objects.equals(this.day, structuredDateTimeType36775C.day) &&
        Objects.equals(this.hour, structuredDateTimeType36775C.hour) &&
        Objects.equals(this.minutes, structuredDateTimeType36775C.minutes) &&
        Objects.equals(this.month, structuredDateTimeType36775C.month) &&
        Objects.equals(this.seconds, structuredDateTimeType36775C.seconds) &&
        Objects.equals(this.year, structuredDateTimeType36775C.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, hour, minutes, month, seconds, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDateTimeType36775C {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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

