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
 * AddressDetailsTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AddressDetailsTypeU   {
  @JsonProperty("format")
  private String format;

  @JsonProperty("line1")
  private String line1;

  @JsonProperty("line2")
  private String line2;

  @JsonProperty("line3")
  private String line3;

  @JsonProperty("line4")
  private String line4;

  @JsonProperty("line5")
  private String line5;

  @JsonProperty("line6")
  private String line6;

  public AddressDetailsTypeU format(String format) {
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

  public AddressDetailsTypeU line1(String line1) {
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

  public AddressDetailsTypeU line2(String line2) {
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

  public AddressDetailsTypeU line3(String line3) {
    this.line3 = line3;
    return this;
  }

  /**
   * Get line3
   * @return line3
  */
  @ApiModelProperty(value = "")


  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }

  public AddressDetailsTypeU line4(String line4) {
    this.line4 = line4;
    return this;
  }

  /**
   * Get line4
   * @return line4
  */
  @ApiModelProperty(value = "")


  public String getLine4() {
    return line4;
  }

  public void setLine4(String line4) {
    this.line4 = line4;
  }

  public AddressDetailsTypeU line5(String line5) {
    this.line5 = line5;
    return this;
  }

  /**
   * Get line5
   * @return line5
  */
  @ApiModelProperty(value = "")


  public String getLine5() {
    return line5;
  }

  public void setLine5(String line5) {
    this.line5 = line5;
  }

  public AddressDetailsTypeU line6(String line6) {
    this.line6 = line6;
    return this;
  }

  /**
   * Get line6
   * @return line6
  */
  @ApiModelProperty(value = "")


  public String getLine6() {
    return line6;
  }

  public void setLine6(String line6) {
    this.line6 = line6;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDetailsTypeU addressDetailsTypeU = (AddressDetailsTypeU) o;
    return Objects.equals(this.format, addressDetailsTypeU.format) &&
        Objects.equals(this.line1, addressDetailsTypeU.line1) &&
        Objects.equals(this.line2, addressDetailsTypeU.line2) &&
        Objects.equals(this.line3, addressDetailsTypeU.line3) &&
        Objects.equals(this.line4, addressDetailsTypeU.line4) &&
        Objects.equals(this.line5, addressDetailsTypeU.line5) &&
        Objects.equals(this.line6, addressDetailsTypeU.line6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, line1, line2, line3, line4, line5, line6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDetailsTypeU {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    line4: ").append(toIndentedString(line4)).append("\n");
    sb.append("    line5: ").append(toIndentedString(line5)).append("\n");
    sb.append("    line6: ").append(toIndentedString(line6)).append("\n");
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

