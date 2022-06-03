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
 * ProviderInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProviderInformationType   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("name")
  private String name;

  @JsonProperty("productFamilyCode")
  private String productFamilyCode;

  public ProviderInformationType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ProviderInformationType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProviderInformationType productFamilyCode(String productFamilyCode) {
    this.productFamilyCode = productFamilyCode;
    return this;
  }

  /**
   * Get productFamilyCode
   * @return productFamilyCode
  */
  @ApiModelProperty(value = "")


  public String getProductFamilyCode() {
    return productFamilyCode;
  }

  public void setProductFamilyCode(String productFamilyCode) {
    this.productFamilyCode = productFamilyCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderInformationType providerInformationType = (ProviderInformationType) o;
    return Objects.equals(this.code, providerInformationType.code) &&
        Objects.equals(this.name, providerInformationType.name) &&
        Objects.equals(this.productFamilyCode, providerInformationType.productFamilyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, productFamilyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderInformationType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productFamilyCode: ").append(toIndentedString(productFamilyCode)).append("\n");
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

