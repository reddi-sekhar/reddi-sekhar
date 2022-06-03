package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeType287345C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StructuredPeriodInformationType207595S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredPeriodInformationType207595S   {
  @JsonProperty("beginDateTime")
  private StructuredDateTimeType287345C beginDateTime;

  @JsonProperty("businessSemantic")
  private String businessSemantic;

  @JsonProperty("endDateTime")
  private StructuredDateTimeType287345C endDateTime;

  @JsonProperty("timeMode")
  private String timeMode;

  public StructuredPeriodInformationType207595S beginDateTime(StructuredDateTimeType287345C beginDateTime) {
    this.beginDateTime = beginDateTime;
    return this;
  }

  /**
   * Get beginDateTime
   * @return beginDateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeType287345C getBeginDateTime() {
    return beginDateTime;
  }

  public void setBeginDateTime(StructuredDateTimeType287345C beginDateTime) {
    this.beginDateTime = beginDateTime;
  }

  public StructuredPeriodInformationType207595S businessSemantic(String businessSemantic) {
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

  public StructuredPeriodInformationType207595S endDateTime(StructuredDateTimeType287345C endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Get endDateTime
   * @return endDateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeType287345C getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(StructuredDateTimeType287345C endDateTime) {
    this.endDateTime = endDateTime;
  }

  public StructuredPeriodInformationType207595S timeMode(String timeMode) {
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
    StructuredPeriodInformationType207595S structuredPeriodInformationType207595S = (StructuredPeriodInformationType207595S) o;
    return Objects.equals(this.beginDateTime, structuredPeriodInformationType207595S.beginDateTime) &&
        Objects.equals(this.businessSemantic, structuredPeriodInformationType207595S.businessSemantic) &&
        Objects.equals(this.endDateTime, structuredPeriodInformationType207595S.endDateTime) &&
        Objects.equals(this.timeMode, structuredPeriodInformationType207595S.timeMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginDateTime, businessSemantic, endDateTime, timeMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredPeriodInformationType207595S {\n");
    
    sb.append("    beginDateTime: ").append(toIndentedString(beginDateTime)).append("\n");
    sb.append("    businessSemantic: ").append(toIndentedString(businessSemantic)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
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

