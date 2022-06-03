package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.VehicleTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VehicleInfoGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class VehicleInfoGroup   {
  @JsonProperty("numberOfBicycles")
  private NumberOfUnitsType numberOfBicycles;

  @JsonProperty("vehicleInformation")
  private VehicleTypeU vehicleInformation;

  @JsonProperty("vehicleRoutePrice")
  private TariffInformationTypeU vehicleRoutePrice;

  public VehicleInfoGroup numberOfBicycles(NumberOfUnitsType numberOfBicycles) {
    this.numberOfBicycles = numberOfBicycles;
    return this;
  }

  /**
   * Get numberOfBicycles
   * @return numberOfBicycles
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitsType getNumberOfBicycles() {
    return numberOfBicycles;
  }

  public void setNumberOfBicycles(NumberOfUnitsType numberOfBicycles) {
    this.numberOfBicycles = numberOfBicycles;
  }

  public VehicleInfoGroup vehicleInformation(VehicleTypeU vehicleInformation) {
    this.vehicleInformation = vehicleInformation;
    return this;
  }

  /**
   * Get vehicleInformation
   * @return vehicleInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public VehicleTypeU getVehicleInformation() {
    return vehicleInformation;
  }

  public void setVehicleInformation(VehicleTypeU vehicleInformation) {
    this.vehicleInformation = vehicleInformation;
  }

  public VehicleInfoGroup vehicleRoutePrice(TariffInformationTypeU vehicleRoutePrice) {
    this.vehicleRoutePrice = vehicleRoutePrice;
    return this;
  }

  /**
   * Get vehicleRoutePrice
   * @return vehicleRoutePrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeU getVehicleRoutePrice() {
    return vehicleRoutePrice;
  }

  public void setVehicleRoutePrice(TariffInformationTypeU vehicleRoutePrice) {
    this.vehicleRoutePrice = vehicleRoutePrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleInfoGroup vehicleInfoGroup = (VehicleInfoGroup) o;
    return Objects.equals(this.numberOfBicycles, vehicleInfoGroup.numberOfBicycles) &&
        Objects.equals(this.vehicleInformation, vehicleInfoGroup.vehicleInformation) &&
        Objects.equals(this.vehicleRoutePrice, vehicleInfoGroup.vehicleRoutePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfBicycles, vehicleInformation, vehicleRoutePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleInfoGroup {\n");
    
    sb.append("    numberOfBicycles: ").append(toIndentedString(numberOfBicycles)).append("\n");
    sb.append("    vehicleInformation: ").append(toIndentedString(vehicleInformation)).append("\n");
    sb.append("    vehicleRoutePrice: ").append(toIndentedString(vehicleRoutePrice)).append("\n");
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

