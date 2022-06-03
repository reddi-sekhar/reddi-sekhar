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
 * ProductDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductDetailsType   {
  @JsonProperty("designator")
  private String designator;

  @JsonProperty("option")
  private String option;

  public ProductDetailsType designator(String designator) {
    this.designator = designator;
    return this;
  }

  /**
   * Get designator
   * @return designator
  */
  @ApiModelProperty(value = "")


  public String getDesignator() {
    return designator;
  }

  public void setDesignator(String designator) {
    this.designator = designator;
  }

  public ProductDetailsType option(String option) {
    this.option = option;
    return this;
  }

  /**
   * Get option
   * @return option
  */
  @ApiModelProperty(value = "")


  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailsType productDetailsType = (ProductDetailsType) o;
    return Objects.equals(this.designator, productDetailsType.designator) &&
        Objects.equals(this.option, productDetailsType.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(designator, option);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailsType {\n");
    
    sb.append("    designator: ").append(toIndentedString(designator)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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

