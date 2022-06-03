package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeType285975C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StructuredDateTimeInformationType206504S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredDateTimeInformationType206504S   {
  @JsonProperty("businessSemantic")
  private String businessSemantic;

  @JsonProperty("dateTime")
  private StructuredDateTimeType285975C dateTime;

  public StructuredDateTimeInformationType206504S businessSemantic(String businessSemantic) {
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

  public StructuredDateTimeInformationType206504S dateTime(StructuredDateTimeType285975C dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeType285975C getDateTime() {
    return dateTime;
  }

  public void setDateTime(StructuredDateTimeType285975C dateTime) {
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
    StructuredDateTimeInformationType206504S structuredDateTimeInformationType206504S = (StructuredDateTimeInformationType206504S) o;
    return Objects.equals(this.businessSemantic, structuredDateTimeInformationType206504S.businessSemantic) &&
        Objects.equals(this.dateTime, structuredDateTimeInformationType206504S.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessSemantic, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDateTimeInformationType206504S {\n");
    
    sb.append("    businessSemantic: ").append(toIndentedString(businessSemantic)).append("\n");
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

