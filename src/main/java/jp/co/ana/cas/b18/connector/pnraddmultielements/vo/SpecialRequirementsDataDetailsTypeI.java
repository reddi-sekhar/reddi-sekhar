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
 * SpecialRequirementsDataDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecialRequirementsDataDetailsTypeI   {
  @JsonProperty("crossRef")
  private String crossRef;

  @JsonProperty("data")
  private String data;

  @JsonProperty("seatType")
  @Valid
  private List<String> seatType = null;

  public SpecialRequirementsDataDetailsTypeI crossRef(String crossRef) {
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

  public SpecialRequirementsDataDetailsTypeI data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public SpecialRequirementsDataDetailsTypeI seatType(List<String> seatType) {
    this.seatType = seatType;
    return this;
  }

  public SpecialRequirementsDataDetailsTypeI addSeatTypeItem(String seatTypeItem) {
    if (this.seatType == null) {
      this.seatType = new ArrayList<>();
    }
    this.seatType.add(seatTypeItem);
    return this;
  }

  /**
   * Get seatType
   * @return seatType
  */
  @ApiModelProperty(value = "")


  public List<String> getSeatType() {
    return seatType;
  }

  public void setSeatType(List<String> seatType) {
    this.seatType = seatType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialRequirementsDataDetailsTypeI specialRequirementsDataDetailsTypeI = (SpecialRequirementsDataDetailsTypeI) o;
    return Objects.equals(this.crossRef, specialRequirementsDataDetailsTypeI.crossRef) &&
        Objects.equals(this.data, specialRequirementsDataDetailsTypeI.data) &&
        Objects.equals(this.seatType, specialRequirementsDataDetailsTypeI.seatType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossRef, data, seatType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialRequirementsDataDetailsTypeI {\n");
    
    sb.append("    crossRef: ").append(toIndentedString(crossRef)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    seatType: ").append(toIndentedString(seatType)).append("\n");
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

