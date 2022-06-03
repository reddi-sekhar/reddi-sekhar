package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RangeTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RangeDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RangeDetailsTypeI   {
  @JsonProperty("rangeDetails")
  private RangeTypeI rangeDetails;

  @JsonProperty("rangeQualifier")
  private String rangeQualifier;

  public RangeDetailsTypeI rangeDetails(RangeTypeI rangeDetails) {
    this.rangeDetails = rangeDetails;
    return this;
  }

  /**
   * Get rangeDetails
   * @return rangeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RangeTypeI getRangeDetails() {
    return rangeDetails;
  }

  public void setRangeDetails(RangeTypeI rangeDetails) {
    this.rangeDetails = rangeDetails;
  }

  public RangeDetailsTypeI rangeQualifier(String rangeQualifier) {
    this.rangeQualifier = rangeQualifier;
    return this;
  }

  /**
   * Get rangeQualifier
   * @return rangeQualifier
  */
  @ApiModelProperty(value = "")


  public String getRangeQualifier() {
    return rangeQualifier;
  }

  public void setRangeQualifier(String rangeQualifier) {
    this.rangeQualifier = rangeQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeDetailsTypeI rangeDetailsTypeI = (RangeDetailsTypeI) o;
    return Objects.equals(this.rangeDetails, rangeDetailsTypeI.rangeDetails) &&
        Objects.equals(this.rangeQualifier, rangeDetailsTypeI.rangeQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rangeDetails, rangeQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeDetailsTypeI {\n");
    
    sb.append("    rangeDetails: ").append(toIndentedString(rangeDetails)).append("\n");
    sb.append("    rangeQualifier: ").append(toIndentedString(rangeQualifier)).append("\n");
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

