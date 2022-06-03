package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MeasurementsBatchTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RangeDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RangePeriod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RangePeriod   {
  @JsonProperty("agePeriod")
  private RangeDetailsTypeI agePeriod;

  @JsonProperty("maximumUnitQualifier")
  private MeasurementsBatchTypeU maximumUnitQualifier;

  public RangePeriod agePeriod(RangeDetailsTypeI agePeriod) {
    this.agePeriod = agePeriod;
    return this;
  }

  /**
   * Get agePeriod
   * @return agePeriod
  */
  @ApiModelProperty(value = "")

  @Valid

  public RangeDetailsTypeI getAgePeriod() {
    return agePeriod;
  }

  public void setAgePeriod(RangeDetailsTypeI agePeriod) {
    this.agePeriod = agePeriod;
  }

  public RangePeriod maximumUnitQualifier(MeasurementsBatchTypeU maximumUnitQualifier) {
    this.maximumUnitQualifier = maximumUnitQualifier;
    return this;
  }

  /**
   * Get maximumUnitQualifier
   * @return maximumUnitQualifier
  */
  @ApiModelProperty(value = "")

  @Valid

  public MeasurementsBatchTypeU getMaximumUnitQualifier() {
    return maximumUnitQualifier;
  }

  public void setMaximumUnitQualifier(MeasurementsBatchTypeU maximumUnitQualifier) {
    this.maximumUnitQualifier = maximumUnitQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangePeriod rangePeriod = (RangePeriod) o;
    return Objects.equals(this.agePeriod, rangePeriod.agePeriod) &&
        Objects.equals(this.maximumUnitQualifier, rangePeriod.maximumUnitQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agePeriod, maximumUnitQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangePeriod {\n");
    
    sb.append("    agePeriod: ").append(toIndentedString(agePeriod)).append("\n");
    sb.append("    maximumUnitQualifier: ").append(toIndentedString(maximumUnitQualifier)).append("\n");
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

