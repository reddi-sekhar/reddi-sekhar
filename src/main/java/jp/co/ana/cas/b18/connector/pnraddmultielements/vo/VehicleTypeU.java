package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.VehicleInformationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VehicleTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class VehicleTypeU   {
  @JsonProperty("category")
  private String category;

  @JsonProperty("vehicleDetails")
  private VehicleInformationTypeU vehicleDetails;

  public VehicleTypeU category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public VehicleTypeU vehicleDetails(VehicleInformationTypeU vehicleDetails) {
    this.vehicleDetails = vehicleDetails;
    return this;
  }

  /**
   * Get vehicleDetails
   * @return vehicleDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public VehicleInformationTypeU getVehicleDetails() {
    return vehicleDetails;
  }

  public void setVehicleDetails(VehicleInformationTypeU vehicleDetails) {
    this.vehicleDetails = vehicleDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleTypeU vehicleTypeU = (VehicleTypeU) o;
    return Objects.equals(this.category, vehicleTypeU.category) &&
        Objects.equals(this.vehicleDetails, vehicleTypeU.vehicleDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, vehicleDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleTypeU {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    vehicleDetails: ").append(toIndentedString(vehicleDetails)).append("\n");
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

