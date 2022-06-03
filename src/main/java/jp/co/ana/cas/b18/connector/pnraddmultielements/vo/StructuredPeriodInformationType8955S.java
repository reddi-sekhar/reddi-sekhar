package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeType16347C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StructuredPeriodInformationType8955S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredPeriodInformationType8955S   {
  @JsonProperty("beginDateTime")
  private StructuredDateTimeType16347C beginDateTime;

  @JsonProperty("endDateTime")
  private StructuredDateTimeType16347C endDateTime;

  public StructuredPeriodInformationType8955S beginDateTime(StructuredDateTimeType16347C beginDateTime) {
    this.beginDateTime = beginDateTime;
    return this;
  }

  /**
   * Get beginDateTime
   * @return beginDateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeType16347C getBeginDateTime() {
    return beginDateTime;
  }

  public void setBeginDateTime(StructuredDateTimeType16347C beginDateTime) {
    this.beginDateTime = beginDateTime;
  }

  public StructuredPeriodInformationType8955S endDateTime(StructuredDateTimeType16347C endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Get endDateTime
   * @return endDateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeType16347C getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(StructuredDateTimeType16347C endDateTime) {
    this.endDateTime = endDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredPeriodInformationType8955S structuredPeriodInformationType8955S = (StructuredPeriodInformationType8955S) o;
    return Objects.equals(this.beginDateTime, structuredPeriodInformationType8955S.beginDateTime) &&
        Objects.equals(this.endDateTime, structuredPeriodInformationType8955S.endDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginDateTime, endDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredPeriodInformationType8955S {\n");
    
    sb.append("    beginDateTime: ").append(toIndentedString(beginDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
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

