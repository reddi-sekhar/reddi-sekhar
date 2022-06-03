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
 * NumberOfUnitDetailsTypeI46330C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class NumberOfUnitDetailsTypeI46330C   {
  @JsonProperty("numberOfUnit")
  private Long numberOfUnit;

  @JsonProperty("unitQualifier")
  private String unitQualifier;

  public NumberOfUnitDetailsTypeI46330C numberOfUnit(Long numberOfUnit) {
    this.numberOfUnit = numberOfUnit;
    return this;
  }

  /**
   * Get numberOfUnit
   * @return numberOfUnit
  */
  @ApiModelProperty(value = "")


  public Long getNumberOfUnit() {
    return numberOfUnit;
  }

  public void setNumberOfUnit(Long numberOfUnit) {
    this.numberOfUnit = numberOfUnit;
  }

  public NumberOfUnitDetailsTypeI46330C unitQualifier(String unitQualifier) {
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
    NumberOfUnitDetailsTypeI46330C numberOfUnitDetailsTypeI46330C = (NumberOfUnitDetailsTypeI46330C) o;
    return Objects.equals(this.numberOfUnit, numberOfUnitDetailsTypeI46330C.numberOfUnit) &&
        Objects.equals(this.unitQualifier, numberOfUnitDetailsTypeI46330C.unitQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfUnit, unitQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOfUnitDetailsTypeI46330C {\n");
    
    sb.append("    numberOfUnit: ").append(toIndentedString(numberOfUnit)).append("\n");
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

