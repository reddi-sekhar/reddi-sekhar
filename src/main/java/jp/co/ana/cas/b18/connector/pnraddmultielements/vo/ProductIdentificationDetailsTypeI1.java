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
 * ProductIdentificationDetailsTypeI1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ProductIdentificationDetailsTypeI1   {
  @JsonProperty("classOfService")
  private String classOfService;

  @JsonProperty("description")
  private String description;

  @JsonProperty("identification")
  private String identification;

  @JsonProperty("subtype")
  private String subtype;

  public ProductIdentificationDetailsTypeI1 classOfService(String classOfService) {
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

  public ProductIdentificationDetailsTypeI1 description(String description) {
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

  public ProductIdentificationDetailsTypeI1 identification(String identification) {
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

  public ProductIdentificationDetailsTypeI1 subtype(String subtype) {
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
    ProductIdentificationDetailsTypeI1 productIdentificationDetailsTypeI1 = (ProductIdentificationDetailsTypeI1) o;
    return Objects.equals(this.classOfService, productIdentificationDetailsTypeI1.classOfService) &&
        Objects.equals(this.description, productIdentificationDetailsTypeI1.description) &&
        Objects.equals(this.identification, productIdentificationDetailsTypeI1.identification) &&
        Objects.equals(this.subtype, productIdentificationDetailsTypeI1.subtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classOfService, description, identification, subtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductIdentificationDetailsTypeI1 {\n");
    
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

