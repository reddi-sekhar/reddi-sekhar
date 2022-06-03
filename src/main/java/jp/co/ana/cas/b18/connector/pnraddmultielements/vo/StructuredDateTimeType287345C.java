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
 * StructuredDateTimeType287345C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredDateTimeType287345C   {
  @JsonProperty("day")
  private Long day;

  @JsonProperty("hour")
  private Long hour;

  @JsonProperty("minutes")
  private Long minutes;

  @JsonProperty("month")
  private Long month;

  @JsonProperty("year")
  private String year;

  public StructuredDateTimeType287345C day(Long day) {
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

  public StructuredDateTimeType287345C hour(Long hour) {
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

  public StructuredDateTimeType287345C minutes(Long minutes) {
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

  public StructuredDateTimeType287345C month(Long month) {
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

  public StructuredDateTimeType287345C year(String year) {
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
    StructuredDateTimeType287345C structuredDateTimeType287345C = (StructuredDateTimeType287345C) o;
    return Objects.equals(this.day, structuredDateTimeType287345C.day) &&
        Objects.equals(this.hour, structuredDateTimeType287345C.hour) &&
        Objects.equals(this.minutes, structuredDateTimeType287345C.minutes) &&
        Objects.equals(this.month, structuredDateTimeType287345C.month) &&
        Objects.equals(this.year, structuredDateTimeType287345C.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, hour, minutes, month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDateTimeType287345C {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
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

