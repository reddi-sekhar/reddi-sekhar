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
 * MileageTimeDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class MileageTimeDetailsTypeI   {
  @JsonProperty("flightLegMileage")
  private Long flightLegMileage;

  @JsonProperty("unitQualifier")
  private String unitQualifier;

  public MileageTimeDetailsTypeI flightLegMileage(Long flightLegMileage) {
    this.flightLegMileage = flightLegMileage;
    return this;
  }

  /**
   * Get flightLegMileage
   * @return flightLegMileage
  */
  @ApiModelProperty(value = "")


  public Long getFlightLegMileage() {
    return flightLegMileage;
  }

  public void setFlightLegMileage(Long flightLegMileage) {
    this.flightLegMileage = flightLegMileage;
  }

  public MileageTimeDetailsTypeI unitQualifier(String unitQualifier) {
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
    MileageTimeDetailsTypeI mileageTimeDetailsTypeI = (MileageTimeDetailsTypeI) o;
    return Objects.equals(this.flightLegMileage, mileageTimeDetailsTypeI.flightLegMileage) &&
        Objects.equals(this.unitQualifier, mileageTimeDetailsTypeI.unitQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flightLegMileage, unitQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MileageTimeDetailsTypeI {\n");
    
    sb.append("    flightLegMileage: ").append(toIndentedString(flightLegMileage)).append("\n");
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

