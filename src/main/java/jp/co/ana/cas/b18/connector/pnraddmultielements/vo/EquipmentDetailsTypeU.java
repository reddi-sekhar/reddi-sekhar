package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.EquipmentTypeAndSizeTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EquipmentDetailsTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class EquipmentDetailsTypeU   {
  @JsonProperty("sizeTypeDetails")
  private EquipmentTypeAndSizeTypeU sizeTypeDetails;

  @JsonProperty("type")
  private String type;

  public EquipmentDetailsTypeU sizeTypeDetails(EquipmentTypeAndSizeTypeU sizeTypeDetails) {
    this.sizeTypeDetails = sizeTypeDetails;
    return this;
  }

  /**
   * Get sizeTypeDetails
   * @return sizeTypeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public EquipmentTypeAndSizeTypeU getSizeTypeDetails() {
    return sizeTypeDetails;
  }

  public void setSizeTypeDetails(EquipmentTypeAndSizeTypeU sizeTypeDetails) {
    this.sizeTypeDetails = sizeTypeDetails;
  }

  public EquipmentDetailsTypeU type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EquipmentDetailsTypeU equipmentDetailsTypeU = (EquipmentDetailsTypeU) o;
    return Objects.equals(this.sizeTypeDetails, equipmentDetailsTypeU.sizeTypeDetails) &&
        Objects.equals(this.type, equipmentDetailsTypeU.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sizeTypeDetails, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EquipmentDetailsTypeU {\n");
    
    sb.append("    sizeTypeDetails: ").append(toIndentedString(sizeTypeDetails)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

