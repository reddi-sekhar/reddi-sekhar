package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType227788S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SeatRequestParametersTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusTypeI217964S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SeatPaxInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SeatPaxInfo   {
  @JsonProperty("crossRef")
  private ReferenceInfoType227788S crossRef;

  @JsonProperty("seatPaxDetails")
  private SeatRequestParametersTypeI seatPaxDetails;

  @JsonProperty("seatPaxIndicator")
  private StatusTypeI217964S seatPaxIndicator;

  public SeatPaxInfo crossRef(ReferenceInfoType227788S crossRef) {
    this.crossRef = crossRef;
    return this;
  }

  /**
   * Get crossRef
   * @return crossRef
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInfoType227788S getCrossRef() {
    return crossRef;
  }

  public void setCrossRef(ReferenceInfoType227788S crossRef) {
    this.crossRef = crossRef;
  }

  public SeatPaxInfo seatPaxDetails(SeatRequestParametersTypeI seatPaxDetails) {
    this.seatPaxDetails = seatPaxDetails;
    return this;
  }

  /**
   * Get seatPaxDetails
   * @return seatPaxDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SeatRequestParametersTypeI getSeatPaxDetails() {
    return seatPaxDetails;
  }

  public void setSeatPaxDetails(SeatRequestParametersTypeI seatPaxDetails) {
    this.seatPaxDetails = seatPaxDetails;
  }

  public SeatPaxInfo seatPaxIndicator(StatusTypeI217964S seatPaxIndicator) {
    this.seatPaxIndicator = seatPaxIndicator;
    return this;
  }

  /**
   * Get seatPaxIndicator
   * @return seatPaxIndicator
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusTypeI217964S getSeatPaxIndicator() {
    return seatPaxIndicator;
  }

  public void setSeatPaxIndicator(StatusTypeI217964S seatPaxIndicator) {
    this.seatPaxIndicator = seatPaxIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatPaxInfo seatPaxInfo = (SeatPaxInfo) o;
    return Objects.equals(this.crossRef, seatPaxInfo.crossRef) &&
        Objects.equals(this.seatPaxDetails, seatPaxInfo.seatPaxDetails) &&
        Objects.equals(this.seatPaxIndicator, seatPaxInfo.seatPaxIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossRef, seatPaxDetails, seatPaxIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatPaxInfo {\n");
    
    sb.append("    crossRef: ").append(toIndentedString(crossRef)).append("\n");
    sb.append("    seatPaxDetails: ").append(toIndentedString(seatPaxDetails)).append("\n");
    sb.append("    seatPaxIndicator: ").append(toIndentedString(seatPaxIndicator)).append("\n");
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

