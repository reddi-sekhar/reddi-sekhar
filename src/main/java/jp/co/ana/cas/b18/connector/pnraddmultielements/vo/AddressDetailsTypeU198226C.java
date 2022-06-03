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
 * AddressDetailsTypeU198226C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AddressDetailsTypeU198226C   {
  @JsonProperty("format")
  private String format;

  @JsonProperty("line1")
  private String line1;

  @JsonProperty("line2")
  private String line2;

  public AddressDetailsTypeU198226C format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  */
  @ApiModelProperty(value = "")


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public AddressDetailsTypeU198226C line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * Get line1
   * @return line1
  */
  @ApiModelProperty(value = "")


  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public AddressDetailsTypeU198226C line2(String line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Get line2
   * @return line2
  */
  @ApiModelProperty(value = "")


  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDetailsTypeU198226C addressDetailsTypeU198226C = (AddressDetailsTypeU198226C) o;
    return Objects.equals(this.format, addressDetailsTypeU198226C.format) &&
        Objects.equals(this.line1, addressDetailsTypeU198226C.line1) &&
        Objects.equals(this.line2, addressDetailsTypeU198226C.line2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, line1, line2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDetailsTypeU198226C {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
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

