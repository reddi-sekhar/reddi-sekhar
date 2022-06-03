package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PartyIdentifierType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PointOfSaleInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PointOfSaleInformationType   {
  @JsonProperty("pointOfSale")
  private PartyIdentifierType pointOfSale;

  public PointOfSaleInformationType pointOfSale(PartyIdentifierType pointOfSale) {
    this.pointOfSale = pointOfSale;
    return this;
  }

  /**
   * Get pointOfSale
   * @return pointOfSale
  */
  @ApiModelProperty(value = "")

  @Valid

  public PartyIdentifierType getPointOfSale() {
    return pointOfSale;
  }

  public void setPointOfSale(PartyIdentifierType pointOfSale) {
    this.pointOfSale = pointOfSale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointOfSaleInformationType pointOfSaleInformationType = (PointOfSaleInformationType) o;
    return Objects.equals(this.pointOfSale, pointOfSaleInformationType.pointOfSale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointOfSale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfSaleInformationType {\n");
    
    sb.append("    pointOfSale: ").append(toIndentedString(pointOfSale)).append("\n");
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

