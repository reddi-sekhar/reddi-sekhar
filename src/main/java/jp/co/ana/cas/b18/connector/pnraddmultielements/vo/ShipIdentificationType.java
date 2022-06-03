package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ShipIdentificationDetailsType45069C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShipIdentificationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ShipIdentificationType   {
  @JsonProperty("shipDetails")
  private ShipIdentificationDetailsType45069C shipDetails;

  public ShipIdentificationType shipDetails(ShipIdentificationDetailsType45069C shipDetails) {
    this.shipDetails = shipDetails;
    return this;
  }

  /**
   * Get shipDetails
   * @return shipDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ShipIdentificationDetailsType45069C getShipDetails() {
    return shipDetails;
  }

  public void setShipDetails(ShipIdentificationDetailsType45069C shipDetails) {
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
    ShipIdentificationType shipIdentificationType = (ShipIdentificationType) o;
    return Objects.equals(this.shipDetails, shipIdentificationType.shipDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipIdentificationType {\n");
    
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

