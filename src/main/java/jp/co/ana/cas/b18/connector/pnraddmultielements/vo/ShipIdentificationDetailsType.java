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
 * ShipIdentificationDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ShipIdentificationDetailsType   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("cruiseLineCode")
  private String cruiseLineCode;

  @JsonProperty("name")
  private String name;

  public ShipIdentificationDetailsType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ShipIdentificationDetailsType cruiseLineCode(String cruiseLineCode) {
    this.cruiseLineCode = cruiseLineCode;
    return this;
  }

  /**
   * Get cruiseLineCode
   * @return cruiseLineCode
  */
  @ApiModelProperty(value = "")


  public String getCruiseLineCode() {
    return cruiseLineCode;
  }

  public void setCruiseLineCode(String cruiseLineCode) {
    this.cruiseLineCode = cruiseLineCode;
  }

  public ShipIdentificationDetailsType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipIdentificationDetailsType shipIdentificationDetailsType = (ShipIdentificationDetailsType) o;
    return Objects.equals(this.code, shipIdentificationDetailsType.code) &&
        Objects.equals(this.cruiseLineCode, shipIdentificationDetailsType.cruiseLineCode) &&
        Objects.equals(this.name, shipIdentificationDetailsType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, cruiseLineCode, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipIdentificationDetailsType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    cruiseLineCode: ").append(toIndentedString(cruiseLineCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

