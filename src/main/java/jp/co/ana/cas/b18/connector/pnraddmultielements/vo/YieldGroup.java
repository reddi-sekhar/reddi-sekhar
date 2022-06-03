package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ODKeyPerformanceDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ONDType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * YieldGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class YieldGroup   {
  @JsonProperty("yieldData")
  private ODKeyPerformanceDataType yieldData;

  @JsonProperty("yieldDataGroup")
  private ONDType yieldDataGroup;

  public YieldGroup yieldData(ODKeyPerformanceDataType yieldData) {
    this.yieldData = yieldData;
    return this;
  }

  /**
   * Get yieldData
   * @return yieldData
  */
  @ApiModelProperty(value = "")

  @Valid

  public ODKeyPerformanceDataType getYieldData() {
    return yieldData;
  }

  public void setYieldData(ODKeyPerformanceDataType yieldData) {
    this.yieldData = yieldData;
  }

  public YieldGroup yieldDataGroup(ONDType yieldDataGroup) {
    this.yieldDataGroup = yieldDataGroup;
    return this;
  }

  /**
   * Get yieldDataGroup
   * @return yieldDataGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public ONDType getYieldDataGroup() {
    return yieldDataGroup;
  }

  public void setYieldDataGroup(ONDType yieldDataGroup) {
    this.yieldDataGroup = yieldDataGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YieldGroup yieldGroup = (YieldGroup) o;
    return Objects.equals(this.yieldData, yieldGroup.yieldData) &&
        Objects.equals(this.yieldDataGroup, yieldGroup.yieldDataGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yieldData, yieldDataGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YieldGroup {\n");
    
    sb.append("    yieldData: ").append(toIndentedString(yieldData)).append("\n");
    sb.append("    yieldDataGroup: ").append(toIndentedString(yieldDataGroup)).append("\n");
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

