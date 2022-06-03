package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ValueRangeTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasurementsBatchTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MeasurementsBatchTypeU   {
  @JsonProperty("measurementQualifier")
  private String measurementQualifier;

  @JsonProperty("valueRange")
  private ValueRangeTypeU valueRange;

  public MeasurementsBatchTypeU measurementQualifier(String measurementQualifier) {
    this.measurementQualifier = measurementQualifier;
    return this;
  }

  /**
   * Get measurementQualifier
   * @return measurementQualifier
  */
  @ApiModelProperty(value = "")


  public String getMeasurementQualifier() {
    return measurementQualifier;
  }

  public void setMeasurementQualifier(String measurementQualifier) {
    this.measurementQualifier = measurementQualifier;
  }

  public MeasurementsBatchTypeU valueRange(ValueRangeTypeU valueRange) {
    this.valueRange = valueRange;
    return this;
  }

  /**
   * Get valueRange
   * @return valueRange
  */
  @ApiModelProperty(value = "")

  @Valid

  public ValueRangeTypeU getValueRange() {
    return valueRange;
  }

  public void setValueRange(ValueRangeTypeU valueRange) {
    this.valueRange = valueRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementsBatchTypeU measurementsBatchTypeU = (MeasurementsBatchTypeU) o;
    return Objects.equals(this.measurementQualifier, measurementsBatchTypeU.measurementQualifier) &&
        Objects.equals(this.valueRange, measurementsBatchTypeU.valueRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurementQualifier, valueRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementsBatchTypeU {\n");
    
    sb.append("    measurementQualifier: ").append(toIndentedString(measurementQualifier)).append("\n");
    sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
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

