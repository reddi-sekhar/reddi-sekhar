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
 * BaggageDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class BaggageDetailsTypeI   {
  @JsonProperty("freeAllowance")
  private Long freeAllowance;

  @JsonProperty("quantityCode")
  private String quantityCode;

  @JsonProperty("unitQualifier")
  private String unitQualifier;

  public BaggageDetailsTypeI freeAllowance(Long freeAllowance) {
    this.freeAllowance = freeAllowance;
    return this;
  }

  /**
   * Get freeAllowance
   * @return freeAllowance
  */
  @ApiModelProperty(value = "")


  public Long getFreeAllowance() {
    return freeAllowance;
  }

  public void setFreeAllowance(Long freeAllowance) {
    this.freeAllowance = freeAllowance;
  }

  public BaggageDetailsTypeI quantityCode(String quantityCode) {
    this.quantityCode = quantityCode;
    return this;
  }

  /**
   * Get quantityCode
   * @return quantityCode
  */
  @ApiModelProperty(value = "")


  public String getQuantityCode() {
    return quantityCode;
  }

  public void setQuantityCode(String quantityCode) {
    this.quantityCode = quantityCode;
  }

  public BaggageDetailsTypeI unitQualifier(String unitQualifier) {
    this.unitQualifier = unitQualifier;
    return this;
  }

  /**
   * Get unitQualifier
   * @return unitQualifier
  */
  @ApiModelProperty(value = "")


  public String getUnitQualifier() {
    return unitQualifier;
  }

  public void setUnitQualifier(String unitQualifier) {
    this.unitQualifier = unitQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaggageDetailsTypeI baggageDetailsTypeI = (BaggageDetailsTypeI) o;
    return Objects.equals(this.freeAllowance, baggageDetailsTypeI.freeAllowance) &&
        Objects.equals(this.quantityCode, baggageDetailsTypeI.quantityCode) &&
        Objects.equals(this.unitQualifier, baggageDetailsTypeI.unitQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeAllowance, quantityCode, unitQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaggageDetailsTypeI {\n");
    
    sb.append("    freeAllowance: ").append(toIndentedString(freeAllowance)).append("\n");
    sb.append("    quantityCode: ").append(toIndentedString(quantityCode)).append("\n");
    sb.append("    unitQualifier: ").append(toIndentedString(unitQualifier)).append("\n");
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

