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
 * ProductTypeDetailsTypeI46337C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductTypeDetailsTypeI46337C   {
  @JsonProperty("flightIndicator")
  private String flightIndicator;

  public ProductTypeDetailsTypeI46337C flightIndicator(String flightIndicator) {
    this.flightIndicator = flightIndicator;
    return this;
  }

  /**
   * Get flightIndicator
   * @return flightIndicator
  */
  @ApiModelProperty(value = "")


  public String getFlightIndicator() {
    return flightIndicator;
  }

  public void setFlightIndicator(String flightIndicator) {
    this.flightIndicator = flightIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTypeDetailsTypeI46337C productTypeDetailsTypeI46337C = (ProductTypeDetailsTypeI46337C) o;
    return Objects.equals(this.flightIndicator, productTypeDetailsTypeI46337C.flightIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flightIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTypeDetailsTypeI46337C {\n");
    
    sb.append("    flightIndicator: ").append(toIndentedString(flightIndicator)).append("\n");
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

