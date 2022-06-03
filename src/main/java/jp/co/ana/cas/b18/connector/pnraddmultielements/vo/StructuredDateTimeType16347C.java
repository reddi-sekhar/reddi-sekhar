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
 * StructuredDateTimeType16347C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredDateTimeType16347C   {
  @JsonProperty("day")
  private String day;

  @JsonProperty("month")
  private String month;

  @JsonProperty("year")
  private Long year;

  public StructuredDateTimeType16347C day(String day) {
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

  public StructuredDateTimeType16347C month(String month) {
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

  public StructuredDateTimeType16347C year(Long year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  */
  @ApiModelProperty(value = "")


  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
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
    StructuredDateTimeType16347C structuredDateTimeType16347C = (StructuredDateTimeType16347C) o;
    return Objects.equals(this.day, structuredDateTimeType16347C.day) &&
        Objects.equals(this.month, structuredDateTimeType16347C.month) &&
        Objects.equals(this.year, structuredDateTimeType16347C.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDateTimeType16347C {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
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

