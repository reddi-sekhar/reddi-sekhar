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
 * NumberOfUnitDetailsTypeI2755C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class NumberOfUnitDetailsTypeI2755C   {
  @JsonProperty("number")
  private Long number;

  @JsonProperty("qualifier")
  private String qualifier;

  public NumberOfUnitDetailsTypeI2755C number(Long number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @ApiModelProperty(value = "")


  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public NumberOfUnitDetailsTypeI2755C qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * Get qualifier
   * @return qualifier
  */
  @ApiModelProperty(value = "")


  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOfUnitDetailsTypeI2755C numberOfUnitDetailsTypeI2755C = (NumberOfUnitDetailsTypeI2755C) o;
    return Objects.equals(this.number, numberOfUnitDetailsTypeI2755C.number) &&
        Objects.equals(this.qualifier, numberOfUnitDetailsTypeI2755C.qualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, qualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOfUnitDetailsTypeI2755C {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
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

