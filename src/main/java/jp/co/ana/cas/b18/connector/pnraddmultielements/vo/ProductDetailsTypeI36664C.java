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
 * ProductDetailsTypeI36664C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductDetailsTypeI36664C   {
  @JsonProperty("designator")
  private String designator;

  public ProductDetailsTypeI36664C designator(String designator) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailsTypeI36664C productDetailsTypeI36664C = (ProductDetailsTypeI36664C) o;
    return Objects.equals(this.designator, productDetailsTypeI36664C.designator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(designator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailsTypeI36664C {\n");
    
    sb.append("    designator: ").append(toIndentedString(designator)).append("\n");
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

