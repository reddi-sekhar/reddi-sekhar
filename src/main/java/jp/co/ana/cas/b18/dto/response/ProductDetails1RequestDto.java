package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDetails1RequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ProductDetails1RequestDto   {
  @JsonProperty("classOfService")
  private String classOfService;

  @JsonProperty("identification")
  private String identification;

  @JsonProperty("subtype")
  private String subtype;

  public ProductDetails1RequestDto classOfService(String classOfService) {
    this.classOfService = classOfService;
    return this;
  }

  /**
   * Class of service
   * @return classOfService
  */
  @ApiModelProperty(value = "Class of service")

@Size(min=1,max=1) 
  public String getClassOfService() {
    return classOfService;
  }

  public void setClassOfService(String classOfService) {
    this.classOfService = classOfService;
  }

  public ProductDetails1RequestDto identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Identification
   * @return identification
  */
  @ApiModelProperty(required = true, value = "Identification")
  @NotNull

@Size(min=1,max=6) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public ProductDetails1RequestDto subtype(String subtype) {
    this.subtype = subtype;
    return this;
  }

  /**
   * SubType
   * @return subtype
  */
  @ApiModelProperty(value = "SubType")

@Size(min=1,max=1) 
  public String getSubtype() {
    return subtype;
  }

  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetails1RequestDto productDetails1RequestDto = (ProductDetails1RequestDto) o;
    return Objects.equals(this.classOfService, productDetails1RequestDto.classOfService) &&
        Objects.equals(this.identification, productDetails1RequestDto.identification) &&
        Objects.equals(this.subtype, productDetails1RequestDto.subtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classOfService, identification, subtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetails1RequestDto {\n");
    
    sb.append("    classOfService: ").append(toIndentedString(classOfService)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
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

