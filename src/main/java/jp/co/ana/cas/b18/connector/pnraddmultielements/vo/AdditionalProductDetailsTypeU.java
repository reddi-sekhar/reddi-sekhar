package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductDataInformationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdditionalProductDetailsTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AdditionalProductDetailsTypeU   {
  @JsonProperty("productArea")
  private String productArea;

  @JsonProperty("productDetails")
  private ProductDataInformationTypeU productDetails;

  public AdditionalProductDetailsTypeU productArea(String productArea) {
    this.productArea = productArea;
    return this;
  }

  /**
   * Get productArea
   * @return productArea
  */
  @ApiModelProperty(value = "")


  public String getProductArea() {
    return productArea;
  }

  public void setProductArea(String productArea) {
    this.productArea = productArea;
  }

  public AdditionalProductDetailsTypeU productDetails(ProductDataInformationTypeU productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDataInformationTypeU getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDataInformationTypeU productDetails) {
    this.productDetails = productDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalProductDetailsTypeU additionalProductDetailsTypeU = (AdditionalProductDetailsTypeU) o;
    return Objects.equals(this.productArea, additionalProductDetailsTypeU.productArea) &&
        Objects.equals(this.productDetails, additionalProductDetailsTypeU.productDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productArea, productDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalProductDetailsTypeU {\n");
    
    sb.append("    productArea: ").append(toIndentedString(productArea)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
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

