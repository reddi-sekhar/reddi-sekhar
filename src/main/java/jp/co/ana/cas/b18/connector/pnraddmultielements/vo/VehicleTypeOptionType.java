package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VehicleTypeOptionType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class VehicleTypeOptionType   {
  @JsonProperty("vehicleRentalPrefType")
  @Valid
  private List<String> vehicleRentalPrefType = null;

  @JsonProperty("vehicleTypeOwner")
  private String vehicleTypeOwner;

  public VehicleTypeOptionType vehicleRentalPrefType(List<String> vehicleRentalPrefType) {
    this.vehicleRentalPrefType = vehicleRentalPrefType;
    return this;
  }

  public VehicleTypeOptionType addVehicleRentalPrefTypeItem(String vehicleRentalPrefTypeItem) {
    if (this.vehicleRentalPrefType == null) {
      this.vehicleRentalPrefType = new ArrayList<>();
    }
    this.vehicleRentalPrefType.add(vehicleRentalPrefTypeItem);
    return this;
  }

  /**
   * Get vehicleRentalPrefType
   * @return vehicleRentalPrefType
  */
  @ApiModelProperty(value = "")


  public List<String> getVehicleRentalPrefType() {
    return vehicleRentalPrefType;
  }

  public void setVehicleRentalPrefType(List<String> vehicleRentalPrefType) {
    this.vehicleRentalPrefType = vehicleRentalPrefType;
  }

  public VehicleTypeOptionType vehicleTypeOwner(String vehicleTypeOwner) {
    this.vehicleTypeOwner = vehicleTypeOwner;
    return this;
  }

  /**
   * Get vehicleTypeOwner
   * @return vehicleTypeOwner
  */
  @ApiModelProperty(value = "")


  public String getVehicleTypeOwner() {
    return vehicleTypeOwner;
  }

  public void setVehicleTypeOwner(String vehicleTypeOwner) {
    this.vehicleTypeOwner = vehicleTypeOwner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleTypeOptionType vehicleTypeOptionType = (VehicleTypeOptionType) o;
    return Objects.equals(this.vehicleRentalPrefType, vehicleTypeOptionType.vehicleRentalPrefType) &&
        Objects.equals(this.vehicleTypeOwner, vehicleTypeOptionType.vehicleTypeOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleRentalPrefType, vehicleTypeOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleTypeOptionType {\n");
    
    sb.append("    vehicleRentalPrefType: ").append(toIndentedString(vehicleRentalPrefType)).append("\n");
    sb.append("    vehicleTypeOwner: ").append(toIndentedString(vehicleTypeOwner)).append("\n");
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

