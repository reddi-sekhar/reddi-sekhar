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
 * StructuredAddressInformationType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class StructuredAddressInformationType1   {
  @JsonProperty("optionA1")
  private String optionA1;

  @JsonProperty("optionTextA1")
  private String optionTextA1;

  public StructuredAddressInformationType1 optionA1(String optionA1) {
    this.optionA1 = optionA1;
    return this;
  }

  /**
   * Get optionA1
   * @return optionA1
  */
  @ApiModelProperty(value = "")


  public String getOptionA1() {
    return optionA1;
  }

  public void setOptionA1(String optionA1) {
    this.optionA1 = optionA1;
  }

  public StructuredAddressInformationType1 optionTextA1(String optionTextA1) {
    this.optionTextA1 = optionTextA1;
    return this;
  }

  /**
   * Get optionTextA1
   * @return optionTextA1
  */
  @ApiModelProperty(value = "")


  public String getOptionTextA1() {
    return optionTextA1;
  }

  public void setOptionTextA1(String optionTextA1) {
    this.optionTextA1 = optionTextA1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredAddressInformationType1 structuredAddressInformationType1 = (StructuredAddressInformationType1) o;
    return Objects.equals(this.optionA1, structuredAddressInformationType1.optionA1) &&
        Objects.equals(this.optionTextA1, structuredAddressInformationType1.optionTextA1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionA1, optionTextA1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredAddressInformationType1 {\n");
    
    sb.append("    optionA1: ").append(toIndentedString(optionA1)).append("\n");
    sb.append("    optionTextA1: ").append(toIndentedString(optionTextA1)).append("\n");
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

