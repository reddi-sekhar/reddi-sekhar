package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeType285976C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TimeZoneIinformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StructuredDateTimeInformationType206505S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredDateTimeInformationType206505S   {
  @JsonProperty("businessSemantic")
  private String businessSemantic;

  @JsonProperty("dateTime")
  private StructuredDateTimeType285976C dateTime;

  @JsonProperty("timeMode")
  private String timeMode;

  @JsonProperty("timeZoneInfo")
  private TimeZoneIinformationType timeZoneInfo;

  public StructuredDateTimeInformationType206505S businessSemantic(String businessSemantic) {
    this.businessSemantic = businessSemantic;
    return this;
  }

  /**
   * Get businessSemantic
   * @return businessSemantic
  */
  @ApiModelProperty(value = "")


  public String getBusinessSemantic() {
    return businessSemantic;
  }

  public void setBusinessSemantic(String businessSemantic) {
    this.businessSemantic = businessSemantic;
  }

  public StructuredDateTimeInformationType206505S dateTime(StructuredDateTimeType285976C dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeType285976C getDateTime() {
    return dateTime;
  }

  public void setDateTime(StructuredDateTimeType285976C dateTime) {
    this.dateTime = dateTime;
  }

  public StructuredDateTimeInformationType206505S timeMode(String timeMode) {
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

  public StructuredDateTimeInformationType206505S timeZoneInfo(TimeZoneIinformationType timeZoneInfo) {
    this.timeZoneInfo = timeZoneInfo;
    return this;
  }

  /**
   * Get timeZoneInfo
   * @return timeZoneInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeZoneIinformationType getTimeZoneInfo() {
    return timeZoneInfo;
  }

  public void setTimeZoneInfo(TimeZoneIinformationType timeZoneInfo) {
    this.timeZoneInfo = timeZoneInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredDateTimeInformationType206505S structuredDateTimeInformationType206505S = (StructuredDateTimeInformationType206505S) o;
    return Objects.equals(this.businessSemantic, structuredDateTimeInformationType206505S.businessSemantic) &&
        Objects.equals(this.dateTime, structuredDateTimeInformationType206505S.dateTime) &&
        Objects.equals(this.timeMode, structuredDateTimeInformationType206505S.timeMode) &&
        Objects.equals(this.timeZoneInfo, structuredDateTimeInformationType206505S.timeZoneInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessSemantic, dateTime, timeMode, timeZoneInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDateTimeInformationType206505S {\n");
    
    sb.append("    businessSemantic: ").append(toIndentedString(businessSemantic)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    timeMode: ").append(toIndentedString(timeMode)).append("\n");
    sb.append("    timeZoneInfo: ").append(toIndentedString(timeZoneInfo)).append("\n");
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

