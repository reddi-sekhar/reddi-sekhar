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
 * ProductDataInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductDataInformationTypeU   {
  @JsonProperty("addOnIndicator")
  private Long addOnIndicator;

  @JsonProperty("productCategory")
  private String productCategory;

  @JsonProperty("productCode")
  private String productCode;

  @JsonProperty("productDescription")
  private String productDescription;

  public ProductDataInformationTypeU addOnIndicator(Long addOnIndicator) {
    this.addOnIndicator = addOnIndicator;
    return this;
  }

  /**
   * Get addOnIndicator
   * @return addOnIndicator
  */
  @ApiModelProperty(value = "")


  public Long getAddOnIndicator() {
    return addOnIndicator;
  }

  public void setAddOnIndicator(Long addOnIndicator) {
    this.addOnIndicator = addOnIndicator;
  }

  public ProductDataInformationTypeU productCategory(String productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * Get productCategory
   * @return productCategory
  */
  @ApiModelProperty(value = "")


  public String getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }

  public ProductDataInformationTypeU productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

  /**
   * Get productCode
   * @return productCode
  */
  @ApiModelProperty(value = "")


  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public ProductDataInformationTypeU productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * Get productDescription
   * @return productDescription
  */
  @ApiModelProperty(value = "")


  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDataInformationTypeU productDataInformationTypeU = (ProductDataInformationTypeU) o;
    return Objects.equals(this.addOnIndicator, productDataInformationTypeU.addOnIndicator) &&
        Objects.equals(this.productCategory, productDataInformationTypeU.productCategory) &&
        Objects.equals(this.productCode, productDataInformationTypeU.productCode) &&
        Objects.equals(this.productDescription, productDataInformationTypeU.productDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOnIndicator, productCategory, productCode, productDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDataInformationTypeU {\n");
    
    sb.append("    addOnIndicator: ").append(toIndentedString(addOnIndicator)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
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

