package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsuranceCoverageType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CoverageInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CoverageInfo   {
  @JsonProperty("coverage")
  private InsuranceCoverageType coverage;

  @JsonProperty("coverageValues")
  private MonetaryInformationTypeI coverageValues;

  public CoverageInfo coverage(InsuranceCoverageType coverage) {
    this.coverage = coverage;
    return this;
  }

  /**
   * Get coverage
   * @return coverage
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceCoverageType getCoverage() {
    return coverage;
  }

  public void setCoverage(InsuranceCoverageType coverage) {
    this.coverage = coverage;
  }

  public CoverageInfo coverageValues(MonetaryInformationTypeI coverageValues) {
    this.coverageValues = coverageValues;
    return this;
  }

  /**
   * Get coverageValues
   * @return coverageValues
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI getCoverageValues() {
    return coverageValues;
  }

  public void setCoverageValues(MonetaryInformationTypeI coverageValues) {
    this.coverageValues = coverageValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverageInfo coverageInfo = (CoverageInfo) o;
    return Objects.equals(this.coverage, coverageInfo.coverage) &&
        Objects.equals(this.coverageValues, coverageInfo.coverageValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverage, coverageValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverageInfo {\n");
    
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    coverageValues: ").append(toIndentedString(coverageValues)).append("\n");
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

