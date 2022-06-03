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
 * POSResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class POSResponseDto   {
  @JsonProperty("classification")
  private String classification;

  @JsonProperty("crs")
  private String crs;

  @JsonProperty("pointOfSaleCountry")
  private String pointOfSaleCountry;

  public POSResponseDto classification(String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * POSINV Classification: - C for Country - R for CRS
   * @return classification
  */
  @ApiModelProperty(value = "POSINV Classification: - C for Country - R for CRS")

@Size(min=1,max=1) 
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public POSResponseDto crs(String crs) {
    this.crs = crs;
    return this;
  }

  /**
   * Point of Sale CRS
   * @return crs
  */
  @ApiModelProperty(value = "Point of Sale CRS")

@Size(min=1,max=3) 
  public String getCrs() {
    return crs;
  }

  public void setCrs(String crs) {
    this.crs = crs;
  }

  public POSResponseDto pointOfSaleCountry(String pointOfSaleCountry) {
    this.pointOfSaleCountry = pointOfSaleCountry;
    return this;
  }

  /**
   * Point of Sale Country Code
   * @return pointOfSaleCountry
  */
  @ApiModelProperty(value = "Point of Sale Country Code")

@Size(min=2,max=2) 
  public String getPointOfSaleCountry() {
    return pointOfSaleCountry;
  }

  public void setPointOfSaleCountry(String pointOfSaleCountry) {
    this.pointOfSaleCountry = pointOfSaleCountry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POSResponseDto poSResponseDto = (POSResponseDto) o;
    return Objects.equals(this.classification, poSResponseDto.classification) &&
        Objects.equals(this.crs, poSResponseDto.crs) &&
        Objects.equals(this.pointOfSaleCountry, poSResponseDto.pointOfSaleCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, crs, pointOfSaleCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POSResponseDto {\n");
    
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    crs: ").append(toIndentedString(crs)).append("\n");
    sb.append("    pointOfSaleCountry: ").append(toIndentedString(pointOfSaleCountry)).append("\n");
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

