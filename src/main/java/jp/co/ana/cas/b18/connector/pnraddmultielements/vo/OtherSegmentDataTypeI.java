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
 * OtherSegmentDataTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OtherSegmentDataTypeI   {
  @JsonProperty("cabin")
  private String cabin;

  @JsonProperty("flightType")
  private String flightType;

  @JsonProperty("overbooking")
  private String overbooking;

  @JsonProperty("subclass")
  private Long subclass;

  public OtherSegmentDataTypeI cabin(String cabin) {
    this.cabin = cabin;
    return this;
  }

  /**
   * Get cabin
   * @return cabin
  */
  @ApiModelProperty(value = "")


  public String getCabin() {
    return cabin;
  }

  public void setCabin(String cabin) {
    this.cabin = cabin;
  }

  public OtherSegmentDataTypeI flightType(String flightType) {
    this.flightType = flightType;
    return this;
  }

  /**
   * Get flightType
   * @return flightType
  */
  @ApiModelProperty(value = "")


  public String getFlightType() {
    return flightType;
  }

  public void setFlightType(String flightType) {
    this.flightType = flightType;
  }

  public OtherSegmentDataTypeI overbooking(String overbooking) {
    this.overbooking = overbooking;
    return this;
  }

  /**
   * Get overbooking
   * @return overbooking
  */
  @ApiModelProperty(value = "")


  public String getOverbooking() {
    return overbooking;
  }

  public void setOverbooking(String overbooking) {
    this.overbooking = overbooking;
  }

  public OtherSegmentDataTypeI subclass(Long subclass) {
    this.subclass = subclass;
    return this;
  }

  /**
   * Get subclass
   * @return subclass
  */
  @ApiModelProperty(value = "")


  public Long getSubclass() {
    return subclass;
  }

  public void setSubclass(Long subclass) {
    this.subclass = subclass;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherSegmentDataTypeI otherSegmentDataTypeI = (OtherSegmentDataTypeI) o;
    return Objects.equals(this.cabin, otherSegmentDataTypeI.cabin) &&
        Objects.equals(this.flightType, otherSegmentDataTypeI.flightType) &&
        Objects.equals(this.overbooking, otherSegmentDataTypeI.overbooking) &&
        Objects.equals(this.subclass, otherSegmentDataTypeI.subclass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cabin, flightType, overbooking, subclass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherSegmentDataTypeI {\n");
    
    sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
    sb.append("    flightType: ").append(toIndentedString(flightType)).append("\n");
    sb.append("    overbooking: ").append(toIndentedString(overbooking)).append("\n");
    sb.append("    subclass: ").append(toIndentedString(subclass)).append("\n");
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

