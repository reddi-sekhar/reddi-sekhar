package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.VehicleInformationTypeU46439C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VehicleTypeU25502S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class VehicleTypeU25502S   {
  @JsonProperty("vehiculeDescription")
  private VehicleInformationTypeU46439C vehiculeDescription;

  public VehicleTypeU25502S vehiculeDescription(VehicleInformationTypeU46439C vehiculeDescription) {
    this.vehiculeDescription = vehiculeDescription;
    return this;
  }

  /**
   * Get vehiculeDescription
   * @return vehiculeDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public VehicleInformationTypeU46439C getVehiculeDescription() {
    return vehiculeDescription;
  }

  public void setVehiculeDescription(VehicleInformationTypeU46439C vehiculeDescription) {
    this.vehiculeDescription = vehiculeDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleTypeU25502S vehicleTypeU25502S = (VehicleTypeU25502S) o;
    return Objects.equals(this.vehiculeDescription, vehicleTypeU25502S.vehiculeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehiculeDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleTypeU25502S {\n");
    
    sb.append("    vehiculeDescription: ").append(toIndentedString(vehiculeDescription)).append("\n");
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

