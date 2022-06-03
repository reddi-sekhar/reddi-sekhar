package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationType76537S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OriginAndDestinationDetailsTypeI76268S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PointOfCommencementTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductInformationTypeI76271S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ONDType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ONDType   {
  @JsonProperty("classCombinaison")
  private ProductInformationTypeI76271S classCombinaison;

  @JsonProperty("ondyield")
  private OriginAndDestinationDetailsTypeI76268S ondyield;

  @JsonProperty("pointOfCommencement")
  private PointOfCommencementTypeI pointOfCommencement;

  @JsonProperty("tripOnD")
  private OriginAndDestinationDetailsTypeI76268S tripOnD;

  @JsonProperty("yieldInformations")
  private MonetaryInformationType76537S yieldInformations;

  public ONDType classCombinaison(ProductInformationTypeI76271S classCombinaison) {
    this.classCombinaison = classCombinaison;
    return this;
  }

  /**
   * Get classCombinaison
   * @return classCombinaison
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductInformationTypeI76271S getClassCombinaison() {
    return classCombinaison;
  }

  public void setClassCombinaison(ProductInformationTypeI76271S classCombinaison) {
    this.classCombinaison = classCombinaison;
  }

  public ONDType ondyield(OriginAndDestinationDetailsTypeI76268S ondyield) {
    this.ondyield = ondyield;
    return this;
  }

  /**
   * Get ondyield
   * @return ondyield
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginAndDestinationDetailsTypeI76268S getOndyield() {
    return ondyield;
  }

  public void setOndyield(OriginAndDestinationDetailsTypeI76268S ondyield) {
    this.ondyield = ondyield;
  }

  public ONDType pointOfCommencement(PointOfCommencementTypeI pointOfCommencement) {
    this.pointOfCommencement = pointOfCommencement;
    return this;
  }

  /**
   * Get pointOfCommencement
   * @return pointOfCommencement
  */
  @ApiModelProperty(value = "")

  @Valid

  public PointOfCommencementTypeI getPointOfCommencement() {
    return pointOfCommencement;
  }

  public void setPointOfCommencement(PointOfCommencementTypeI pointOfCommencement) {
    this.pointOfCommencement = pointOfCommencement;
  }

  public ONDType tripOnD(OriginAndDestinationDetailsTypeI76268S tripOnD) {
    this.tripOnD = tripOnD;
    return this;
  }

  /**
   * Get tripOnD
   * @return tripOnD
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginAndDestinationDetailsTypeI76268S getTripOnD() {
    return tripOnD;
  }

  public void setTripOnD(OriginAndDestinationDetailsTypeI76268S tripOnD) {
    this.tripOnD = tripOnD;
  }

  public ONDType yieldInformations(MonetaryInformationType76537S yieldInformations) {
    this.yieldInformations = yieldInformations;
    return this;
  }

  /**
   * Get yieldInformations
   * @return yieldInformations
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationType76537S getYieldInformations() {
    return yieldInformations;
  }

  public void setYieldInformations(MonetaryInformationType76537S yieldInformations) {
    this.yieldInformations = yieldInformations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ONDType onDType = (ONDType) o;
    return Objects.equals(this.classCombinaison, onDType.classCombinaison) &&
        Objects.equals(this.ondyield, onDType.ondyield) &&
        Objects.equals(this.pointOfCommencement, onDType.pointOfCommencement) &&
        Objects.equals(this.tripOnD, onDType.tripOnD) &&
        Objects.equals(this.yieldInformations, onDType.yieldInformations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classCombinaison, ondyield, pointOfCommencement, tripOnD, yieldInformations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ONDType {\n");
    
    sb.append("    classCombinaison: ").append(toIndentedString(classCombinaison)).append("\n");
    sb.append("    ondyield: ").append(toIndentedString(ondyield)).append("\n");
    sb.append("    pointOfCommencement: ").append(toIndentedString(pointOfCommencement)).append("\n");
    sb.append("    tripOnD: ").append(toIndentedString(tripOnD)).append("\n");
    sb.append("    yieldInformations: ").append(toIndentedString(yieldInformations)).append("\n");
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

