package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MeasurementsBatchTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RangeDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeI136719S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SurchargePeriods
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SurchargePeriods   {
  @JsonProperty("maximumUnitQualifier")
  private MeasurementsBatchTypeU maximumUnitQualifier;

  @JsonProperty("period")
  private RangeDetailsTypeI period;

  @JsonProperty("surchargePeriodTariff")
  private TariffInformationTypeI136719S surchargePeriodTariff;

  public SurchargePeriods maximumUnitQualifier(MeasurementsBatchTypeU maximumUnitQualifier) {
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

  public SurchargePeriods period(RangeDetailsTypeI period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  */
  @ApiModelProperty(value = "")

  @Valid

  public RangeDetailsTypeI getPeriod() {
    return period;
  }

  public void setPeriod(RangeDetailsTypeI period) {
    this.period = period;
  }

  public SurchargePeriods surchargePeriodTariff(TariffInformationTypeI136719S surchargePeriodTariff) {
    this.surchargePeriodTariff = surchargePeriodTariff;
    return this;
  }

  /**
   * Get surchargePeriodTariff
   * @return surchargePeriodTariff
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeI136719S getSurchargePeriodTariff() {
    return surchargePeriodTariff;
  }

  public void setSurchargePeriodTariff(TariffInformationTypeI136719S surchargePeriodTariff) {
    this.surchargePeriodTariff = surchargePeriodTariff;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurchargePeriods surchargePeriods = (SurchargePeriods) o;
    return Objects.equals(this.maximumUnitQualifier, surchargePeriods.maximumUnitQualifier) &&
        Objects.equals(this.period, surchargePeriods.period) &&
        Objects.equals(this.surchargePeriodTariff, surchargePeriods.surchargePeriodTariff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumUnitQualifier, period, surchargePeriodTariff);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurchargePeriods {\n");
    
    sb.append("    maximumUnitQualifier: ").append(toIndentedString(maximumUnitQualifier)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    surchargePeriodTariff: ").append(toIndentedString(surchargePeriodTariff)).append("\n");
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

