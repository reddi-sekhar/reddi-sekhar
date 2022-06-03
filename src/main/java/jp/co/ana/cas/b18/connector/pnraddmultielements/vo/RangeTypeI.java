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
 * RangeTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RangeTypeI   {
  @JsonProperty("dataType")
  private String dataType;

  @JsonProperty("max")
  private Long max;

  @JsonProperty("min")
  private Long min;

  public RangeTypeI dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
  */
  @ApiModelProperty(value = "")


  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public RangeTypeI max(Long max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
  */
  @ApiModelProperty(value = "")


  public Long getMax() {
    return max;
  }

  public void setMax(Long max) {
    this.max = max;
  }

  public RangeTypeI min(Long min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
  */
  @ApiModelProperty(value = "")


  public Long getMin() {
    return min;
  }

  public void setMin(Long min) {
    this.min = min;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeTypeI rangeTypeI = (RangeTypeI) o;
    return Objects.equals(this.dataType, rangeTypeI.dataType) &&
        Objects.equals(this.max, rangeTypeI.max) &&
        Objects.equals(this.min, rangeTypeI.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, max, min);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeTypeI {\n");
    
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

