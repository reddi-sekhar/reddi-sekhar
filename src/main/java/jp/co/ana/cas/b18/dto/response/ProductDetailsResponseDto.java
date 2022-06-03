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
 * ProductDetailsResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class ProductDetailsResponseDto   {
  @JsonProperty("identification")
  private String identification;

  @JsonProperty("classOfService")
  private String classOfService;

  @JsonProperty("subtype")
  private String subtype;

  public ProductDetailsResponseDto identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Flight number or OPEN - ARNK, car type, transportation type, train number, insurance provider
   * @return identification
  */
  @ApiModelProperty(value = "Flight number or OPEN - ARNK, car type, transportation type, train number, insurance provider")

@Size(min=1,max=6) 
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public ProductDetailsResponseDto classOfService(String classOfService) {
    this.classOfService = classOfService;
    return this;
  }

  /**
   * AIR segment : class of service
   * @return classOfService
  */
  @ApiModelProperty(example = "Y", value = "AIR segment : class of service")

@Size(min=1,max=2) 
  public String getClassOfService() {
    return classOfService;
  }

  public void setClassOfService(String classOfService) {
    this.classOfService = classOfService;
  }

  public ProductDetailsResponseDto subtype(String subtype) {
    this.subtype = subtype;
    return this;
  }

  /**
   * AIR segment : flight number alpha suffix
   * @return subtype
  */
  @ApiModelProperty(value = "AIR segment : flight number alpha suffix")

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
    ProductDetailsResponseDto productDetailsResponseDto = (ProductDetailsResponseDto) o;
    return Objects.equals(this.identification, productDetailsResponseDto.identification) &&
        Objects.equals(this.classOfService, productDetailsResponseDto.classOfService) &&
        Objects.equals(this.subtype, productDetailsResponseDto.subtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, classOfService, subtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailsResponseDto {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    classOfService: ").append(toIndentedString(classOfService)).append("\n");
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

