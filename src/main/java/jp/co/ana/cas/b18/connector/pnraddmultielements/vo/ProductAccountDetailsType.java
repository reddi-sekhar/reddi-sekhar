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
 * ProductAccountDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductAccountDetailsType   {
  @JsonProperty("number")
  private String number;

  @JsonProperty("numberQualifier")
  private String numberQualifier;

  public ProductAccountDetailsType number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @ApiModelProperty(value = "")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public ProductAccountDetailsType numberQualifier(String numberQualifier) {
    this.numberQualifier = numberQualifier;
    return this;
  }

  /**
   * Get numberQualifier
   * @return numberQualifier
  */
  @ApiModelProperty(value = "")


  public String getNumberQualifier() {
    return numberQualifier;
  }

  public void setNumberQualifier(String numberQualifier) {
    this.numberQualifier = numberQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAccountDetailsType productAccountDetailsType = (ProductAccountDetailsType) o;
    return Objects.equals(this.number, productAccountDetailsType.number) &&
        Objects.equals(this.numberQualifier, productAccountDetailsType.numberQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, numberQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAccountDetailsType {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberQualifier: ").append(toIndentedString(numberQualifier)).append("\n");
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

