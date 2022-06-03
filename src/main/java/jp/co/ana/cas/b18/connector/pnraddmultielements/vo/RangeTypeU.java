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
 * RangeTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RangeTypeU   {
  @JsonProperty("dataType")
  private String dataType;

  @JsonProperty("maxOccupancy")
  private Long maxOccupancy;

  @JsonProperty("minOccupancy")
  private Long minOccupancy;

  public RangeTypeU dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
  */
  @ApiModelProperty(value = "")


  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public RangeTypeU maxOccupancy(Long maxOccupancy) {
    this.maxOccupancy = maxOccupancy;
    return this;
  }

  /**
   * Get maxOccupancy
   * @return maxOccupancy
  */
  @ApiModelProperty(value = "")


  public Long getMaxOccupancy() {
    return maxOccupancy;
  }

  public void setMaxOccupancy(Long maxOccupancy) {
    this.maxOccupancy = maxOccupancy;
  }

  public RangeTypeU minOccupancy(Long minOccupancy) {
    this.minOccupancy = minOccupancy;
    return this;
  }

  /**
   * Get minOccupancy
   * @return minOccupancy
  */
  @ApiModelProperty(value = "")


  public Long getMinOccupancy() {
    return minOccupancy;
  }

  public void setMinOccupancy(Long minOccupancy) {
    this.minOccupancy = minOccupancy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeTypeU rangeTypeU = (RangeTypeU) o;
    return Objects.equals(this.dataType, rangeTypeU.dataType) &&
        Objects.equals(this.maxOccupancy, rangeTypeU.maxOccupancy) &&
        Objects.equals(this.minOccupancy, rangeTypeU.minOccupancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, maxOccupancy, minOccupancy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeTypeU {\n");
    
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    maxOccupancy: ").append(toIndentedString(maxOccupancy)).append("\n");
    sb.append("    minOccupancy: ").append(toIndentedString(minOccupancy)).append("\n");
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

