package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType136708S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SurchargePeriods;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeI136714S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxCovSurchargeGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TaxCovSurchargeGroup   {
  @JsonProperty("additionalInfo")
  private FreeTextInformationType136708S additionalInfo;

  @JsonProperty("surchargePeriods")
  @Valid
  private List<SurchargePeriods> surchargePeriods = null;

  @JsonProperty("taxSurchargeCoverageInfo")
  private TariffInformationTypeI136714S taxSurchargeCoverageInfo;

  public TaxCovSurchargeGroup additionalInfo(FreeTextInformationType136708S additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType136708S getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(FreeTextInformationType136708S additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public TaxCovSurchargeGroup surchargePeriods(List<SurchargePeriods> surchargePeriods) {
    this.surchargePeriods = surchargePeriods;
    return this;
  }

  public TaxCovSurchargeGroup addSurchargePeriodsItem(SurchargePeriods surchargePeriodsItem) {
    if (this.surchargePeriods == null) {
      this.surchargePeriods = new ArrayList<>();
    }
    this.surchargePeriods.add(surchargePeriodsItem);
    return this;
  }

  /**
   * Get surchargePeriods
   * @return surchargePeriods
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SurchargePeriods> getSurchargePeriods() {
    return surchargePeriods;
  }

  public void setSurchargePeriods(List<SurchargePeriods> surchargePeriods) {
    this.surchargePeriods = surchargePeriods;
  }

  public TaxCovSurchargeGroup taxSurchargeCoverageInfo(TariffInformationTypeI136714S taxSurchargeCoverageInfo) {
    this.taxSurchargeCoverageInfo = taxSurchargeCoverageInfo;
    return this;
  }

  /**
   * Get taxSurchargeCoverageInfo
   * @return taxSurchargeCoverageInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeI136714S getTaxSurchargeCoverageInfo() {
    return taxSurchargeCoverageInfo;
  }

  public void setTaxSurchargeCoverageInfo(TariffInformationTypeI136714S taxSurchargeCoverageInfo) {
    this.taxSurchargeCoverageInfo = taxSurchargeCoverageInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxCovSurchargeGroup taxCovSurchargeGroup = (TaxCovSurchargeGroup) o;
    return Objects.equals(this.additionalInfo, taxCovSurchargeGroup.additionalInfo) &&
        Objects.equals(this.surchargePeriods, taxCovSurchargeGroup.surchargePeriods) &&
        Objects.equals(this.taxSurchargeCoverageInfo, taxCovSurchargeGroup.taxSurchargeCoverageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, surchargePeriods, taxSurchargeCoverageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxCovSurchargeGroup {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    surchargePeriods: ").append(toIndentedString(surchargePeriods)).append("\n");
    sb.append("    taxSurchargeCoverageInfo: ").append(toIndentedString(taxSurchargeCoverageInfo)).append("\n");
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

