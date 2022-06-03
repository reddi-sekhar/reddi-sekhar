package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FrequencyType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeType198234C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StructuredPeriodInformationType136724S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredPeriodInformationType136724S   {
  @JsonProperty("beginDateTime")
  private StructuredDateTimeType198234C beginDateTime;

  @JsonProperty("businessSemantic")
  private String businessSemantic;

  @JsonProperty("endDateTime")
  private StructuredDateTimeType198234C endDateTime;

  @JsonProperty("frequency")
  private FrequencyType frequency;

  @JsonProperty("timeMode")
  private String timeMode;

  public StructuredPeriodInformationType136724S beginDateTime(StructuredDateTimeType198234C beginDateTime) {
    this.beginDateTime = beginDateTime;
    return this;
  }

  /**
   * Get beginDateTime
   * @return beginDateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeType198234C getBeginDateTime() {
    return beginDateTime;
  }

  public void setBeginDateTime(StructuredDateTimeType198234C beginDateTime) {
    this.beginDateTime = beginDateTime;
  }

  public StructuredPeriodInformationType136724S businessSemantic(String businessSemantic) {
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

  public StructuredPeriodInformationType136724S endDateTime(StructuredDateTimeType198234C endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Get endDateTime
   * @return endDateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeType198234C getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(StructuredDateTimeType198234C endDateTime) {
    this.endDateTime = endDateTime;
  }

  public StructuredPeriodInformationType136724S frequency(FrequencyType frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequencyType getFrequency() {
    return frequency;
  }

  public void setFrequency(FrequencyType frequency) {
    this.frequency = frequency;
  }

  public StructuredPeriodInformationType136724S timeMode(String timeMode) {
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
    StructuredPeriodInformationType136724S structuredPeriodInformationType136724S = (StructuredPeriodInformationType136724S) o;
    return Objects.equals(this.beginDateTime, structuredPeriodInformationType136724S.beginDateTime) &&
        Objects.equals(this.businessSemantic, structuredPeriodInformationType136724S.businessSemantic) &&
        Objects.equals(this.endDateTime, structuredPeriodInformationType136724S.endDateTime) &&
        Objects.equals(this.frequency, structuredPeriodInformationType136724S.frequency) &&
        Objects.equals(this.timeMode, structuredPeriodInformationType136724S.timeMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginDateTime, businessSemantic, endDateTime, frequency, timeMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredPeriodInformationType136724S {\n");
    
    sb.append("    beginDateTime: ").append(toIndentedString(beginDateTime)).append("\n");
    sb.append("    businessSemantic: ").append(toIndentedString(businessSemantic)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

