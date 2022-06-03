package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextDetailsType198207C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityDetailsTypeI198209C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.VehicleTypeOptionType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VehicleInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class VehicleInformationType   {
  @JsonProperty("carModel")
  private String carModel;

  @JsonProperty("freeTextDetails")
  private FreeTextDetailsType198207C freeTextDetails;

  @JsonProperty("vehSpecialEquipment")
  @Valid
  private List<String> vehSpecialEquipment = null;

  @JsonProperty("vehicleCharacteristic")
  private VehicleTypeOptionType vehicleCharacteristic;

  @JsonProperty("vehicleInfo")
  @Valid
  private List<QuantityDetailsTypeI198209C> vehicleInfo = null;

  public VehicleInformationType carModel(String carModel) {
    this.carModel = carModel;
    return this;
  }

  /**
   * Get carModel
   * @return carModel
  */
  @ApiModelProperty(value = "")


  public String getCarModel() {
    return carModel;
  }

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  public VehicleInformationType freeTextDetails(FreeTextDetailsType198207C freeTextDetails) {
    this.freeTextDetails = freeTextDetails;
    return this;
  }

  /**
   * Get freeTextDetails
   * @return freeTextDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextDetailsType198207C getFreeTextDetails() {
    return freeTextDetails;
  }

  public void setFreeTextDetails(FreeTextDetailsType198207C freeTextDetails) {
    this.freeTextDetails = freeTextDetails;
  }

  public VehicleInformationType vehSpecialEquipment(List<String> vehSpecialEquipment) {
    this.vehSpecialEquipment = vehSpecialEquipment;
    return this;
  }

  public VehicleInformationType addVehSpecialEquipmentItem(String vehSpecialEquipmentItem) {
    if (this.vehSpecialEquipment == null) {
      this.vehSpecialEquipment = new ArrayList<>();
    }
    this.vehSpecialEquipment.add(vehSpecialEquipmentItem);
    return this;
  }

  /**
   * Get vehSpecialEquipment
   * @return vehSpecialEquipment
  */
  @ApiModelProperty(value = "")


  public List<String> getVehSpecialEquipment() {
    return vehSpecialEquipment;
  }

  public void setVehSpecialEquipment(List<String> vehSpecialEquipment) {
    this.vehSpecialEquipment = vehSpecialEquipment;
  }

  public VehicleInformationType vehicleCharacteristic(VehicleTypeOptionType vehicleCharacteristic) {
    this.vehicleCharacteristic = vehicleCharacteristic;
    return this;
  }

  /**
   * Get vehicleCharacteristic
   * @return vehicleCharacteristic
  */
  @ApiModelProperty(value = "")

  @Valid

  public VehicleTypeOptionType getVehicleCharacteristic() {
    return vehicleCharacteristic;
  }

  public void setVehicleCharacteristic(VehicleTypeOptionType vehicleCharacteristic) {
    this.vehicleCharacteristic = vehicleCharacteristic;
  }

  public VehicleInformationType vehicleInfo(List<QuantityDetailsTypeI198209C> vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
    return this;
  }

  public VehicleInformationType addVehicleInfoItem(QuantityDetailsTypeI198209C vehicleInfoItem) {
    if (this.vehicleInfo == null) {
      this.vehicleInfo = new ArrayList<>();
    }
    this.vehicleInfo.add(vehicleInfoItem);
    return this;
  }

  /**
   * Get vehicleInfo
   * @return vehicleInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<QuantityDetailsTypeI198209C> getVehicleInfo() {
    return vehicleInfo;
  }

  public void setVehicleInfo(List<QuantityDetailsTypeI198209C> vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleInformationType vehicleInformationType = (VehicleInformationType) o;
    return Objects.equals(this.carModel, vehicleInformationType.carModel) &&
        Objects.equals(this.freeTextDetails, vehicleInformationType.freeTextDetails) &&
        Objects.equals(this.vehSpecialEquipment, vehicleInformationType.vehSpecialEquipment) &&
        Objects.equals(this.vehicleCharacteristic, vehicleInformationType.vehicleCharacteristic) &&
        Objects.equals(this.vehicleInfo, vehicleInformationType.vehicleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carModel, freeTextDetails, vehSpecialEquipment, vehicleCharacteristic, vehicleInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleInformationType {\n");
    
    sb.append("    carModel: ").append(toIndentedString(carModel)).append("\n");
    sb.append("    freeTextDetails: ").append(toIndentedString(freeTextDetails)).append("\n");
    sb.append("    vehSpecialEquipment: ").append(toIndentedString(vehSpecialEquipment)).append("\n");
    sb.append("    vehicleCharacteristic: ").append(toIndentedString(vehicleCharacteristic)).append("\n");
    sb.append("    vehicleInfo: ").append(toIndentedString(vehicleInfo)).append("\n");
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

