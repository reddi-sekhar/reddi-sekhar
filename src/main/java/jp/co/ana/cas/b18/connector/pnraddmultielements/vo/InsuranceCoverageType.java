package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InsuranceCoverageType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InsuranceCoverageType   {
  @JsonProperty("coverageIndicator")
  @Valid
  private List<String> coverageIndicator = null;

  public InsuranceCoverageType coverageIndicator(List<String> coverageIndicator) {
    this.coverageIndicator = coverageIndicator;
    return this;
  }

  public InsuranceCoverageType addCoverageIndicatorItem(String coverageIndicatorItem) {
    if (this.coverageIndicator == null) {
      this.coverageIndicator = new ArrayList<>();
    }
    this.coverageIndicator.add(coverageIndicatorItem);
    return this;
  }

  /**
   * Get coverageIndicator
   * @return coverageIndicator
  */
  @ApiModelProperty(value = "")


  public List<String> getCoverageIndicator() {
    return coverageIndicator;
  }

  public void setCoverageIndicator(List<String> coverageIndicator) {
    this.coverageIndicator = coverageIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceCoverageType insuranceCoverageType = (InsuranceCoverageType) o;
    return Objects.equals(this.coverageIndicator, insuranceCoverageType.coverageIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverageIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceCoverageType {\n");
    
    sb.append("    coverageIndicator: ").append(toIndentedString(coverageIndicator)).append("\n");
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

