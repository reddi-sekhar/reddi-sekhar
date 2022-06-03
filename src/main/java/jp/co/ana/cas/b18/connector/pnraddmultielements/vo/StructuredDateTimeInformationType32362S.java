package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeType56472C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StructuredDateTimeInformationType32362S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredDateTimeInformationType32362S   {
  @JsonProperty("businessSemantic")
  private String businessSemantic;

  @JsonProperty("dateTime")
  private StructuredDateTimeType56472C dateTime;

  public StructuredDateTimeInformationType32362S businessSemantic(String businessSemantic) {
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

  public StructuredDateTimeInformationType32362S dateTime(StructuredDateTimeType56472C dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeType56472C getDateTime() {
    return dateTime;
  }

  public void setDateTime(StructuredDateTimeType56472C dateTime) {
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
    StructuredDateTimeInformationType32362S structuredDateTimeInformationType32362S = (StructuredDateTimeInformationType32362S) o;
    return Objects.equals(this.businessSemantic, structuredDateTimeInformationType32362S.businessSemantic) &&
        Objects.equals(this.dateTime, structuredDateTimeInformationType32362S.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessSemantic, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDateTimeInformationType32362S {\n");
    
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

