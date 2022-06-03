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
 * ProductDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductDetailsTypeI   {
  @JsonProperty("availabilityStatus")
  private String availabilityStatus;

  @JsonProperty("designator")
  private String designator;

  public ProductDetailsTypeI availabilityStatus(String availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
    return this;
  }

  /**
   * Get availabilityStatus
   * @return availabilityStatus
  */
  @ApiModelProperty(value = "")


  public String getAvailabilityStatus() {
    return availabilityStatus;
  }

  public void setAvailabilityStatus(String availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
  }

  public ProductDetailsTypeI designator(String designator) {
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
    ProductDetailsTypeI productDetailsTypeI = (ProductDetailsTypeI) o;
    return Objects.equals(this.availabilityStatus, productDetailsTypeI.availabilityStatus) &&
        Objects.equals(this.designator, productDetailsTypeI.designator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityStatus, designator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailsTypeI {\n");
    
    sb.append("    availabilityStatus: ").append(toIndentedString(availabilityStatus)).append("\n");
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

