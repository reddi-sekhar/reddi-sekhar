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
 * CodeshareFlightDataTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CodeshareFlightDataTypeI   {
  @JsonProperty("airline")
  private String airline;

  @JsonProperty("cascadingIndicator")
  private Long cascadingIndicator;

  @JsonProperty("flightNumber")
  private Long flightNumber;

  @JsonProperty("inventory")
  private String inventory;

  @JsonProperty("sellingClass")
  private String sellingClass;

  @JsonProperty("suffix")
  private String suffix;

  @JsonProperty("type")
  private String type;

  public CodeshareFlightDataTypeI airline(String airline) {
    this.airline = airline;
    return this;
  }

  /**
   * Get airline
   * @return airline
  */
  @ApiModelProperty(value = "")


  public String getAirline() {
    return airline;
  }

  public void setAirline(String airline) {
    this.airline = airline;
  }

  public CodeshareFlightDataTypeI cascadingIndicator(Long cascadingIndicator) {
    this.cascadingIndicator = cascadingIndicator;
    return this;
  }

  /**
   * Get cascadingIndicator
   * @return cascadingIndicator
  */
  @ApiModelProperty(value = "")


  public Long getCascadingIndicator() {
    return cascadingIndicator;
  }

  public void setCascadingIndicator(Long cascadingIndicator) {
    this.cascadingIndicator = cascadingIndicator;
  }

  public CodeshareFlightDataTypeI flightNumber(Long flightNumber) {
    this.flightNumber = flightNumber;
    return this;
  }

  /**
   * Get flightNumber
   * @return flightNumber
  */
  @ApiModelProperty(value = "")


  public Long getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(Long flightNumber) {
    this.flightNumber = flightNumber;
  }

  public CodeshareFlightDataTypeI inventory(String inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * Get inventory
   * @return inventory
  */
  @ApiModelProperty(value = "")


  public String getInventory() {
    return inventory;
  }

  public void setInventory(String inventory) {
    this.inventory = inventory;
  }

  public CodeshareFlightDataTypeI sellingClass(String sellingClass) {
    this.sellingClass = sellingClass;
    return this;
  }

  /**
   * Get sellingClass
   * @return sellingClass
  */
  @ApiModelProperty(value = "")


  public String getSellingClass() {
    return sellingClass;
  }

  public void setSellingClass(String sellingClass) {
    this.sellingClass = sellingClass;
  }

  public CodeshareFlightDataTypeI suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Get suffix
   * @return suffix
  */
  @ApiModelProperty(value = "")


  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public CodeshareFlightDataTypeI type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeshareFlightDataTypeI codeshareFlightDataTypeI = (CodeshareFlightDataTypeI) o;
    return Objects.equals(this.airline, codeshareFlightDataTypeI.airline) &&
        Objects.equals(this.cascadingIndicator, codeshareFlightDataTypeI.cascadingIndicator) &&
        Objects.equals(this.flightNumber, codeshareFlightDataTypeI.flightNumber) &&
        Objects.equals(this.inventory, codeshareFlightDataTypeI.inventory) &&
        Objects.equals(this.sellingClass, codeshareFlightDataTypeI.sellingClass) &&
        Objects.equals(this.suffix, codeshareFlightDataTypeI.suffix) &&
        Objects.equals(this.type, codeshareFlightDataTypeI.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airline, cascadingIndicator, flightNumber, inventory, sellingClass, suffix, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeshareFlightDataTypeI {\n");
    
    sb.append("    airline: ").append(toIndentedString(airline)).append("\n");
    sb.append("    cascadingIndicator: ").append(toIndentedString(cascadingIndicator)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    sellingClass: ").append(toIndentedString(sellingClass)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

