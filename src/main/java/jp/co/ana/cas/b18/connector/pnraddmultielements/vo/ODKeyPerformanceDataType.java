package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OversaleDataType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ODKeyPerformanceDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ODKeyPerformanceDataType   {
  @JsonProperty("oversale")
  private OversaleDataType oversale;

  @JsonProperty("scheduleChange")
  private String scheduleChange;

  public ODKeyPerformanceDataType oversale(OversaleDataType oversale) {
    this.oversale = oversale;
    return this;
  }

  /**
   * Get oversale
   * @return oversale
  */
  @ApiModelProperty(value = "")

  @Valid

  public OversaleDataType getOversale() {
    return oversale;
  }

  public void setOversale(OversaleDataType oversale) {
    this.oversale = oversale;
  }

  public ODKeyPerformanceDataType scheduleChange(String scheduleChange) {
    this.scheduleChange = scheduleChange;
    return this;
  }

  /**
   * Get scheduleChange
   * @return scheduleChange
  */
  @ApiModelProperty(value = "")


  public String getScheduleChange() {
    return scheduleChange;
  }

  public void setScheduleChange(String scheduleChange) {
    this.scheduleChange = scheduleChange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ODKeyPerformanceDataType odKeyPerformanceDataType = (ODKeyPerformanceDataType) o;
    return Objects.equals(this.oversale, odKeyPerformanceDataType.oversale) &&
        Objects.equals(this.scheduleChange, odKeyPerformanceDataType.scheduleChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oversale, scheduleChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ODKeyPerformanceDataType {\n");
    
    sb.append("    oversale: ").append(toIndentedString(oversale)).append("\n");
    sb.append("    scheduleChange: ").append(toIndentedString(scheduleChange)).append("\n");
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

