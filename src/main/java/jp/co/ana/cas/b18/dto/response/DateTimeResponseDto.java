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
 * DateTimeResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class DateTimeResponseDto   {
  @JsonProperty("year")
  private String year;

  @JsonProperty("month")
  private String month;

  @JsonProperty("day")
  private String day;

  @JsonProperty("hour")
  private String hour;

  @JsonProperty("minutes")
  private String minutes;

  public DateTimeResponseDto year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Point of sale date year 
   * @return year
  */
  @ApiModelProperty(example = "2022", value = "Point of sale date year ")

@Pattern(regexp="-?[0-9]{4}") 
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public DateTimeResponseDto month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Month number in the year ( begins to 1 )
   * @return month
  */
  @ApiModelProperty(example = "3", value = "Month number in the year ( begins to 1 )")

@Pattern(regexp="-?(0?[1-9]|1[0-2])") 
  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public DateTimeResponseDto day(String day) {
    this.day = day;
    return this;
  }

  /**
   * Day number in the month ( begins to 1 )
   * @return day
  */
  @ApiModelProperty(example = "25", value = "Day number in the month ( begins to 1 )")

@Pattern(regexp="-?(0?[1-9]|[1-2][0-9]|3[0-1])") 
  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public DateTimeResponseDto hour(String hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Hour between 0 and 23
   * @return hour
  */
  @ApiModelProperty(example = "19", value = "Hour between 0 and 23")

@Pattern(regexp="-?[0-1]?[0-9]|2[0-3]") 
  public String getHour() {
    return hour;
  }

  public void setHour(String hour) {
    this.hour = hour;
  }

  public DateTimeResponseDto minutes(String minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * Minutes between 0 and 59
   * @return minutes
  */
  @ApiModelProperty(example = "20", value = "Minutes between 0 and 59")

@Pattern(regexp="-?[0-5]?[0-9]") 
  public String getMinutes() {
    return minutes;
  }

  public void setMinutes(String minutes) {
    this.minutes = minutes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeResponseDto dateTimeResponseDto = (DateTimeResponseDto) o;
    return Objects.equals(this.year, dateTimeResponseDto.year) &&
        Objects.equals(this.month, dateTimeResponseDto.month) &&
        Objects.equals(this.day, dateTimeResponseDto.day) &&
        Objects.equals(this.hour, dateTimeResponseDto.hour) &&
        Objects.equals(this.minutes, dateTimeResponseDto.minutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, day, hour, minutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeResponseDto {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
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

