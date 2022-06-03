package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductIdentificationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TrafficRestrictionDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDescription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductDescription   {
  @JsonProperty("product")
  private ProductIdentificationTypeU product;

  @JsonProperty("productRestriction")
  @Valid
  private List<TrafficRestrictionDetailsType> productRestriction = null;

  public ProductDescription product(ProductIdentificationTypeU product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductIdentificationTypeU getProduct() {
    return product;
  }

  public void setProduct(ProductIdentificationTypeU product) {
    this.product = product;
  }

  public ProductDescription productRestriction(List<TrafficRestrictionDetailsType> productRestriction) {
    this.productRestriction = productRestriction;
    return this;
  }

  public ProductDescription addProductRestrictionItem(TrafficRestrictionDetailsType productRestrictionItem) {
    if (this.productRestriction == null) {
      this.productRestriction = new ArrayList<>();
    }
    this.productRestriction.add(productRestrictionItem);
    return this;
  }

  /**
   * Get productRestriction
   * @return productRestriction
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TrafficRestrictionDetailsType> getProductRestriction() {
    return productRestriction;
  }

  public void setProductRestriction(List<TrafficRestrictionDetailsType> productRestriction) {
    this.productRestriction = productRestriction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDescription productDescription = (ProductDescription) o;
    return Objects.equals(this.product, productDescription.product) &&
        Objects.equals(this.productRestriction, productDescription.productRestriction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, productRestriction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDescription {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productRestriction: ").append(toIndentedString(productRestriction)).append("\n");
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

