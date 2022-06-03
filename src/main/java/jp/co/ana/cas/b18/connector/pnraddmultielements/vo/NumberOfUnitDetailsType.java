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
 * NumberOfUnitDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class NumberOfUnitDetailsType   {
  @JsonProperty("units")
  private Long units;

  @JsonProperty("unitsQualifier")
  private String unitsQualifier;

  public NumberOfUnitDetailsType units(Long units) {
    this.units = units;
    return this;
  }

  /**
   * Get units
   * @return units
  */
  @ApiModelProperty(value = "")


  public Long getUnits() {
    return units;
  }

  public void setUnits(Long units) {
    this.units = units;
  }

  public NumberOfUnitDetailsType unitsQualifier(String unitsQualifier) {
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
    NumberOfUnitDetailsType numberOfUnitDetailsType = (NumberOfUnitDetailsType) o;
    return Objects.equals(this.units, numberOfUnitDetailsType.units) &&
        Objects.equals(this.unitsQualifier, numberOfUnitDetailsType.unitsQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, unitsQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOfUnitDetailsType {\n");
    
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

