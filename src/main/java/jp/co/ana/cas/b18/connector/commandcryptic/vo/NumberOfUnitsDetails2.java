package jp.co.ana.cas.b18.connector.commandcryptic.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NumberOfUnitsDetails2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T19:01:00.408185400+05:30[Asia/Calcutta]")
public class NumberOfUnitsDetails2   {
  @JsonProperty("units")
  private BigDecimal units;

  @JsonProperty("unitsQualifier")
  private String unitsQualifier;

  public NumberOfUnitsDetails2 units(BigDecimal units) {
    this.units = units;
    return this;
  }

  /**
   * Get units
   * @return units
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getUnits() {
    return units;
  }

  public void setUnits(BigDecimal units) {
    this.units = units;
  }

  public NumberOfUnitsDetails2 unitsQualifier(String unitsQualifier) {
    this.unitsQualifier = unitsQualifier;
    return this;
  }

  /**
   * Get unitsQualifier
   * @return unitsQualifier
  */
  @ApiModelProperty(value = "")


  public String getUnitsQualifier() {
    return unitsQualifier;
  }

  public void setUnitsQualifier(String unitsQualifier) {
    this.unitsQualifier = unitsQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOfUnitsDetails2 numberOfUnitsDetails2 = (NumberOfUnitsDetails2) o;
    return Objects.equals(this.units, numberOfUnitsDetails2.units) &&
        Objects.equals(this.unitsQualifier, numberOfUnitsDetails2.unitsQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, unitsQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOfUnitsDetails2 {\n");
    
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    unitsQualifier: ").append(toIndentedString(unitsQualifier)).append("\n");
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

