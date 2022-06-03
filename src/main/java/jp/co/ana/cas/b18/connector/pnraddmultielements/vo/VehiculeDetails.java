package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.VehicleTypeU25502S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VehiculeDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class VehiculeDetails   {
  @JsonProperty("vehiculeInfo")
  private VehicleTypeU25502S vehiculeInfo;

  public VehiculeDetails vehiculeInfo(VehicleTypeU25502S vehiculeInfo) {
    this.vehiculeInfo = vehiculeInfo;
    return this;
  }

  /**
   * Get vehiculeInfo
   * @return vehiculeInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public VehicleTypeU25502S getVehiculeInfo() {
    return vehiculeInfo;
  }

  public void setVehiculeInfo(VehicleTypeU25502S vehiculeInfo) {
    this.vehiculeInfo = vehiculeInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehiculeDetails vehiculeDetails = (VehiculeDetails) o;
    return Objects.equals(this.vehiculeInfo, vehiculeDetails.vehiculeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehiculeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehiculeDetails {\n");
    
    sb.append("    vehiculeInfo: ").append(toIndentedString(vehiculeInfo)).append("\n");
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

