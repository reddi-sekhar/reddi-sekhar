package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.DateTimeResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PointOfSaleDateResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class PointOfSaleDateResponseDto   {
  @JsonProperty("timeMode")
  private String timeMode;

  @JsonProperty("dateTime")
  private DateTimeResponseDto dateTime;

  public PointOfSaleDateResponseDto timeMode(String timeMode) {
    this.timeMode = timeMode;
    return this;
  }

  /**
   * Indicate if the time is expressed in UTC or in local time mode
   * @return timeMode
  */
  @ApiModelProperty(example = "LT", value = "Indicate if the time is expressed in UTC or in local time mode")

@Size(min=1,max=3) 
  public String getTimeMode() {
    return timeMode;
  }

  public void setTimeMode(String timeMode) {
    this.timeMode = timeMode;
  }

  public PointOfSaleDateResponseDto dateTime(DateTimeResponseDto dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateTimeResponseDto getDateTime() {
    return dateTime;
  }

  public void setDateTime(DateTimeResponseDto dateTime) {
    this.dateTime = dateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointOfSaleDateResponseDto pointOfSaleDateResponseDto = (PointOfSaleDateResponseDto) o;
    return Objects.equals(this.timeMode, pointOfSaleDateResponseDto.timeMode) &&
        Objects.equals(this.dateTime, pointOfSaleDateResponseDto.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeMode, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfSaleDateResponseDto {\n");
    
    sb.append("    timeMode: ").append(toIndentedString(timeMode)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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

