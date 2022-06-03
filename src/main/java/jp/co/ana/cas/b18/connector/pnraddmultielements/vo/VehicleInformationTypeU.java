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
 * VehicleInformationTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class VehicleInformationTypeU   {
  @JsonProperty("makeAndModel")
  private String makeAndModel;

  public VehicleInformationTypeU makeAndModel(String makeAndModel) {
    this.makeAndModel = makeAndModel;
    return this;
  }

  /**
   * Get makeAndModel
   * @return makeAndModel
  */
  @ApiModelProperty(value = "")


  public String getMakeAndModel() {
    return makeAndModel;
  }

  public void setMakeAndModel(String makeAndModel) {
    this.makeAndModel = makeAndModel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleInformationTypeU vehicleInformationTypeU = (VehicleInformationTypeU) o;
    return Objects.equals(this.makeAndModel, vehicleInformationTypeU.makeAndModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(makeAndModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleInformationTypeU {\n");
    
    sb.append("    makeAndModel: ").append(toIndentedString(makeAndModel)).append("\n");
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

