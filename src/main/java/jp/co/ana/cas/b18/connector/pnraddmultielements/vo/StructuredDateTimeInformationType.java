package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeType192687C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StructuredDateTimeInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredDateTimeInformationType   {
  @JsonProperty("dateTime")
  private StructuredDateTimeType192687C dateTime;

  @JsonProperty("timeMode")
  private String timeMode;

  public StructuredDateTimeInformationType dateTime(StructuredDateTimeType192687C dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeType192687C getDateTime() {
    return dateTime;
  }

  public void setDateTime(StructuredDateTimeType192687C dateTime) {
    this.dateTime = dateTime;
  }

  public StructuredDateTimeInformationType timeMode(String timeMode) {
    this.timeMode = timeMode;
    return this;
  }

  /**
   * Get timeMode
   * @return timeMode
  */
  @ApiModelProperty(value = "")


  public String getTimeMode() {
    return timeMode;
  }

  public void setTimeMode(String timeMode) {
    this.timeMode = timeMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredDateTimeInformationType structuredDateTimeInformationType = (StructuredDateTimeInformationType) o;
    return Objects.equals(this.dateTime, structuredDateTimeInformationType.dateTime) &&
        Objects.equals(this.timeMode, structuredDateTimeInformationType.timeMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, timeMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDateTimeInformationType {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    timeMode: ").append(toIndentedString(timeMode)).append("\n");
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

