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
 * PointOfSaleDataTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PointOfSaleDataTypeI   {
  @JsonProperty("classification")
  private String classification;

  @JsonProperty("crs")
  private String crs;

  @JsonProperty("pointOfSaleCountry")
  private String pointOfSaleCountry;

  public PointOfSaleDataTypeI classification(String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * Get classification
   * @return classification
  */
  @ApiModelProperty(value = "")


  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public PointOfSaleDataTypeI crs(String crs) {
    this.crs = crs;
    return this;
  }

  /**
   * Get crs
   * @return crs
  */
  @ApiModelProperty(value = "")


  public String getCrs() {
    return crs;
  }

  public void setCrs(String crs) {
    this.crs = crs;
  }

  public PointOfSaleDataTypeI pointOfSaleCountry(String pointOfSaleCountry) {
    this.pointOfSaleCountry = pointOfSaleCountry;
    return this;
  }

  /**
   * Get pointOfSaleCountry
   * @return pointOfSaleCountry
  */
  @ApiModelProperty(value = "")


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
    PointOfSaleDataTypeI pointOfSaleDataTypeI = (PointOfSaleDataTypeI) o;
    return Objects.equals(this.classification, pointOfSaleDataTypeI.classification) &&
        Objects.equals(this.crs, pointOfSaleDataTypeI.crs) &&
        Objects.equals(this.pointOfSaleCountry, pointOfSaleDataTypeI.pointOfSaleCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, crs, pointOfSaleCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfSaleDataTypeI {\n");
    
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

