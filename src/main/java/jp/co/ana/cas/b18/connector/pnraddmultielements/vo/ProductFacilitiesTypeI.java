package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductFacilitiesTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductFacilitiesTypeI   {
  @JsonProperty("entertainement")
  private String entertainement;

  @JsonProperty("entertainementDescription")
  private String entertainementDescription;

  @JsonProperty("productExtensionCode")
  @Valid
  private List<String> productExtensionCode = null;

  @JsonProperty("productQualifier")
  private String productQualifier;

  public ProductFacilitiesTypeI entertainement(String entertainement) {
    this.entertainement = entertainement;
    return this;
  }

  /**
   * Get entertainement
   * @return entertainement
  */
  @ApiModelProperty(value = "")


  public String getEntertainement() {
    return entertainement;
  }

  public void setEntertainement(String entertainement) {
    this.entertainement = entertainement;
  }

  public ProductFacilitiesTypeI entertainementDescription(String entertainementDescription) {
    this.entertainementDescription = entertainementDescription;
    return this;
  }

  /**
   * Get entertainementDescription
   * @return entertainementDescription
  */
  @ApiModelProperty(value = "")


  public String getEntertainementDescription() {
    return entertainementDescription;
  }

  public void setEntertainementDescription(String entertainementDescription) {
    this.entertainementDescription = entertainementDescription;
  }

  public ProductFacilitiesTypeI productExtensionCode(List<String> productExtensionCode) {
    this.productExtensionCode = productExtensionCode;
    return this;
  }

  public ProductFacilitiesTypeI addProductExtensionCodeItem(String productExtensionCodeItem) {
    if (this.productExtensionCode == null) {
      this.productExtensionCode = new ArrayList<>();
    }
    this.productExtensionCode.add(productExtensionCodeItem);
    return this;
  }

  /**
   * Get productExtensionCode
   * @return productExtensionCode
  */
  @ApiModelProperty(value = "")


  public List<String> getProductExtensionCode() {
    return productExtensionCode;
  }

  public void setProductExtensionCode(List<String> productExtensionCode) {
    this.productExtensionCode = productExtensionCode;
  }

  public ProductFacilitiesTypeI productQualifier(String productQualifier) {
    this.productQualifier = productQualifier;
    return this;
  }

  /**
   * Get productQualifier
   * @return productQualifier
  */
  @ApiModelProperty(value = "")


  public String getProductQualifier() {
    return productQualifier;
  }

  public void setProductQualifier(String productQualifier) {
    this.productQualifier = productQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductFacilitiesTypeI productFacilitiesTypeI = (ProductFacilitiesTypeI) o;
    return Objects.equals(this.entertainement, productFacilitiesTypeI.entertainement) &&
        Objects.equals(this.entertainementDescription, productFacilitiesTypeI.entertainementDescription) &&
        Objects.equals(this.productExtensionCode, productFacilitiesTypeI.productExtensionCode) &&
        Objects.equals(this.productQualifier, productFacilitiesTypeI.productQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entertainement, entertainementDescription, productExtensionCode, productQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductFacilitiesTypeI {\n");
    
    sb.append("    entertainement: ").append(toIndentedString(entertainement)).append("\n");
    sb.append("    entertainementDescription: ").append(toIndentedString(entertainementDescription)).append("\n");
    sb.append("    productExtensionCode: ").append(toIndentedString(productExtensionCode)).append("\n");
    sb.append("    productQualifier: ").append(toIndentedString(productQualifier)).append("\n");
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

