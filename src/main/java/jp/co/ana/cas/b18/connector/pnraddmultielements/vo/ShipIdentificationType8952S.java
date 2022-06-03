package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ShipIdentificationDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShipIdentificationType8952S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ShipIdentificationType8952S   {
  @JsonProperty("shipDetails")
  private ShipIdentificationDetailsType shipDetails;

  public ShipIdentificationType8952S shipDetails(ShipIdentificationDetailsType shipDetails) {
    this.shipDetails = shipDetails;
    return this;
  }

  /**
   * Get shipDetails
   * @return shipDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ShipIdentificationDetailsType getShipDetails() {
    return shipDetails;
  }

  public void setShipDetails(ShipIdentificationDetailsType shipDetails) {
    this.shipDetails = shipDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipIdentificationType8952S shipIdentificationType8952S = (ShipIdentificationType8952S) o;
    return Objects.equals(this.shipDetails, shipIdentificationType8952S.shipDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipIdentificationType8952S {\n");
    
    sb.append("    shipDetails: ").append(toIndentedString(shipDetails)).append("\n");
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

