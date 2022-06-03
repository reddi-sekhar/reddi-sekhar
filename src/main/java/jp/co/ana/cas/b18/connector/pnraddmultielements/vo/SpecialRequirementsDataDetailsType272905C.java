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
 * SpecialRequirementsDataDetailsType272905C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecialRequirementsDataDetailsType272905C   {
  @JsonProperty("crossRef")
  private String crossRef;

  @JsonProperty("measureUnitQualifier")
  private String measureUnitQualifier;

  @JsonProperty("seatCharacteristics")
  @Valid
  private List<String> seatCharacteristics = null;

  @JsonProperty("seatNumber")
  private String seatNumber;

  public SpecialRequirementsDataDetailsType272905C crossRef(String crossRef) {
    this.crossRef = crossRef;
    return this;
  }

  /**
   * Get crossRef
   * @return crossRef
  */
  @ApiModelProperty(value = "")


  public String getCrossRef() {
    return crossRef;
  }

  public void setCrossRef(String crossRef) {
    this.crossRef = crossRef;
  }

  public SpecialRequirementsDataDetailsType272905C measureUnitQualifier(String measureUnitQualifier) {
    this.measureUnitQualifier = measureUnitQualifier;
    return this;
  }

  /**
   * Get measureUnitQualifier
   * @return measureUnitQualifier
  */
  @ApiModelProperty(value = "")


  public String getMeasureUnitQualifier() {
    return measureUnitQualifier;
  }

  public void setMeasureUnitQualifier(String measureUnitQualifier) {
    this.measureUnitQualifier = measureUnitQualifier;
  }

  public SpecialRequirementsDataDetailsType272905C seatCharacteristics(List<String> seatCharacteristics) {
    this.seatCharacteristics = seatCharacteristics;
    return this;
  }

  public SpecialRequirementsDataDetailsType272905C addSeatCharacteristicsItem(String seatCharacteristicsItem) {
    if (this.seatCharacteristics == null) {
      this.seatCharacteristics = new ArrayList<>();
    }
    this.seatCharacteristics.add(seatCharacteristicsItem);
    return this;
  }

  /**
   * Get seatCharacteristics
   * @return seatCharacteristics
  */
  @ApiModelProperty(value = "")


  public List<String> getSeatCharacteristics() {
    return seatCharacteristics;
  }

  public void setSeatCharacteristics(List<String> seatCharacteristics) {
    this.seatCharacteristics = seatCharacteristics;
  }

  public SpecialRequirementsDataDetailsType272905C seatNumber(String seatNumber) {
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
    SpecialRequirementsDataDetailsType272905C specialRequirementsDataDetailsType272905C = (SpecialRequirementsDataDetailsType272905C) o;
    return Objects.equals(this.crossRef, specialRequirementsDataDetailsType272905C.crossRef) &&
        Objects.equals(this.measureUnitQualifier, specialRequirementsDataDetailsType272905C.measureUnitQualifier) &&
        Objects.equals(this.seatCharacteristics, specialRequirementsDataDetailsType272905C.seatCharacteristics) &&
        Objects.equals(this.seatNumber, specialRequirementsDataDetailsType272905C.seatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossRef, measureUnitQualifier, seatCharacteristics, seatNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialRequirementsDataDetailsType272905C {\n");
    
    sb.append("    crossRef: ").append(toIndentedString(crossRef)).append("\n");
    sb.append("    measureUnitQualifier: ").append(toIndentedString(measureUnitQualifier)).append("\n");
    sb.append("    seatCharacteristics: ").append(toIndentedString(seatCharacteristics)).append("\n");
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

