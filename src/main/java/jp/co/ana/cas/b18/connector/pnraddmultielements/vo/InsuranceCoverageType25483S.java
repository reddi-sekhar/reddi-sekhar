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
 * InsuranceCoverageType25483S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InsuranceCoverageType25483S   {
  @JsonProperty("coverageIndicator")
  private String coverageIndicator;

  public InsuranceCoverageType25483S coverageIndicator(String coverageIndicator) {
    this.coverageIndicator = coverageIndicator;
    return this;
  }

  /**
   * Get coverageIndicator
   * @return coverageIndicator
  */
  @ApiModelProperty(value = "")


  public String getCoverageIndicator() {
    return coverageIndicator;
  }

  public void setCoverageIndicator(String coverageIndicator) {
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
    InsuranceCoverageType25483S insuranceCoverageType25483S = (InsuranceCoverageType25483S) o;
    return Objects.equals(this.coverageIndicator, insuranceCoverageType25483S.coverageIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverageIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceCoverageType25483S {\n");
    
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

