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
 * StructuredDateTimeType35730C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredDateTimeType35730C   {
  @JsonProperty("hour")
  private String hour;

  @JsonProperty("minutes")
  private String minutes;

  public StructuredDateTimeType35730C hour(String hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Get hour
   * @return hour
  */
  @ApiModelProperty(value = "")


  public String getHour() {
    return hour;
  }

  public void setHour(String hour) {
    this.hour = hour;
  }

  public StructuredDateTimeType35730C minutes(String minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * Get minutes
   * @return minutes
  */
  @ApiModelProperty(value = "")


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
    StructuredDateTimeType35730C structuredDateTimeType35730C = (StructuredDateTimeType35730C) o;
    return Objects.equals(this.hour, structuredDateTimeType35730C.hour) &&
        Objects.equals(this.minutes, structuredDateTimeType35730C.minutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, minutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredDateTimeType35730C {\n");
    
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

