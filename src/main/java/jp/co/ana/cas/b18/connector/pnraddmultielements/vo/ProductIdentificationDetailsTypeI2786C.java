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
 * ProductIdentificationDetailsTypeI2786C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductIdentificationDetailsTypeI2786C   {
  @JsonProperty("classOfService")
  private String classOfService;

  @JsonProperty("description")
  private String description;

  @JsonProperty("identification")
  private String identification;

  @JsonProperty("subtype")
  private String subtype;

  public ProductIdentificationDetailsTypeI2786C classOfService(String classOfService) {
    this.classOfService = classOfService;
    return this;
  }

  /**
   * Get classOfService
   * @return classOfService
  */
  @ApiModelProperty(value = "")


  public String getClassOfService() {
    return classOfService;
  }

  public void setClassOfService(String classOfService) {
    this.classOfService = classOfService;
  }

  public ProductIdentificationDetailsTypeI2786C description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductIdentificationDetailsTypeI2786C identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  */
  @ApiModelProperty(value = "")


  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public ProductIdentificationDetailsTypeI2786C subtype(String subtype) {
    this.subtype = subtype;
    return this;
  }

  /**
   * Get subtype
   * @return subtype
  */
  @ApiModelProperty(value = "")


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
    ProductIdentificationDetailsTypeI2786C productIdentificationDetailsTypeI2786C = (ProductIdentificationDetailsTypeI2786C) o;
    return Objects.equals(this.classOfService, productIdentificationDetailsTypeI2786C.classOfService) &&
        Objects.equals(this.description, productIdentificationDetailsTypeI2786C.description) &&
        Objects.equals(this.identification, productIdentificationDetailsTypeI2786C.identification) &&
        Objects.equals(this.subtype, productIdentificationDetailsTypeI2786C.subtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classOfService, description, identification, subtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductIdentificationDetailsTypeI2786C {\n");
    
    sb.append("    classOfService: ").append(toIndentedString(classOfService)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

