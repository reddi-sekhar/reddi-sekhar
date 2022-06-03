package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType6235S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsuranceProductDetailsType20774S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductSection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductSection   {
  @JsonProperty("informationLines")
  private FreeTextInformationType6235S informationLines;

  @JsonProperty("productCode")
  private InsuranceProductDetailsType20774S productCode;

  public ProductSection informationLines(FreeTextInformationType6235S informationLines) {
    this.informationLines = informationLines;
    return this;
  }

  /**
   * Get informationLines
   * @return informationLines
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType6235S getInformationLines() {
    return informationLines;
  }

  public void setInformationLines(FreeTextInformationType6235S informationLines) {
    this.informationLines = informationLines;
  }

  public ProductSection productCode(InsuranceProductDetailsType20774S productCode) {
    this.productCode = productCode;
    return this;
  }

  /**
   * Get productCode
   * @return productCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceProductDetailsType20774S getProductCode() {
    return productCode;
  }

  public void setProductCode(InsuranceProductDetailsType20774S productCode) {
    this.productCode = productCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSection productSection = (ProductSection) o;
    return Objects.equals(this.informationLines, productSection.informationLines) &&
        Objects.equals(this.productCode, productSection.productCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(informationLines, productCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSection {\n");
    
    sb.append("    informationLines: ").append(toIndentedString(informationLines)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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

