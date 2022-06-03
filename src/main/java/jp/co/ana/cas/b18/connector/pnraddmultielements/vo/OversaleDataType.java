package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OversaleDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OversaleDataType   {
  @JsonProperty("oversaleIndicator")
  @Valid
  private List<String> oversaleIndicator = null;

  @JsonProperty("oversaleNumber")
  private BigDecimal oversaleNumber;

  public OversaleDataType oversaleIndicator(List<String> oversaleIndicator) {
    this.oversaleIndicator = oversaleIndicator;
    return this;
  }

  public OversaleDataType addOversaleIndicatorItem(String oversaleIndicatorItem) {
    if (this.oversaleIndicator == null) {
      this.oversaleIndicator = new ArrayList<>();
    }
    this.oversaleIndicator.add(oversaleIndicatorItem);
    return this;
  }

  /**
   * Get oversaleIndicator
   * @return oversaleIndicator
  */
  @ApiModelProperty(value = "")


  public List<String> getOversaleIndicator() {
    return oversaleIndicator;
  }

  public void setOversaleIndicator(List<String> oversaleIndicator) {
    this.oversaleIndicator = oversaleIndicator;
  }

  public OversaleDataType oversaleNumber(BigDecimal oversaleNumber) {
    this.oversaleNumber = oversaleNumber;
    return this;
  }

  /**
   * Get oversaleNumber
   * @return oversaleNumber
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getOversaleNumber() {
    return oversaleNumber;
  }

  public void setOversaleNumber(BigDecimal oversaleNumber) {
    this.oversaleNumber = oversaleNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OversaleDataType oversaleDataType = (OversaleDataType) o;
    return Objects.equals(this.oversaleIndicator, oversaleDataType.oversaleIndicator) &&
        Objects.equals(this.oversaleNumber, oversaleDataType.oversaleNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oversaleIndicator, oversaleNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OversaleDataType {\n");
    
    sb.append("    oversaleIndicator: ").append(toIndentedString(oversaleIndicator)).append("\n");
    sb.append("    oversaleNumber: ").append(toIndentedString(oversaleNumber)).append("\n");
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

