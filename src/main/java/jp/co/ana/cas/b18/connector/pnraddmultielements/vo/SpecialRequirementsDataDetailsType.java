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
 * SpecialRequirementsDataDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecialRequirementsDataDetailsType   {
  @JsonProperty("seatCharacteristic")
  @Valid
  private List<String> seatCharacteristic = null;

  @JsonProperty("seatNumber")
  private String seatNumber;

  public SpecialRequirementsDataDetailsType seatCharacteristic(List<String> seatCharacteristic) {
    this.seatCharacteristic = seatCharacteristic;
    return this;
  }

  public SpecialRequirementsDataDetailsType addSeatCharacteristicItem(String seatCharacteristicItem) {
    if (this.seatCharacteristic == null) {
      this.seatCharacteristic = new ArrayList<>();
    }
    this.seatCharacteristic.add(seatCharacteristicItem);
    return this;
  }

  /**
   * Get seatCharacteristic
   * @return seatCharacteristic
  */
  @ApiModelProperty(value = "")


  public List<String> getSeatCharacteristic() {
    return seatCharacteristic;
  }

  public void setSeatCharacteristic(List<String> seatCharacteristic) {
    this.seatCharacteristic = seatCharacteristic;
  }

  public SpecialRequirementsDataDetailsType seatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
    return this;
  }

  /**
   * Get seatNumber
   * @return seatNumber
  */
  @ApiModelProperty(value = "")


  public String getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialRequirementsDataDetailsType specialRequirementsDataDetailsType = (SpecialRequirementsDataDetailsType) o;
    return Objects.equals(this.seatCharacteristic, specialRequirementsDataDetailsType.seatCharacteristic) &&
        Objects.equals(this.seatNumber, specialRequirementsDataDetailsType.seatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seatCharacteristic, seatNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialRequirementsDataDetailsType {\n");
    
    sb.append("    seatCharacteristic: ").append(toIndentedString(seatCharacteristic)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
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

