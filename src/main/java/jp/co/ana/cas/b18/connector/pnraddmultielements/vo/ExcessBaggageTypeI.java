package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.BaggageDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ExcessBaggageDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExcessBaggageTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ExcessBaggageTypeI   {
  @JsonProperty("baggageDetails")
  private BaggageDetailsTypeI baggageDetails;

  @JsonProperty("excessBaggageDetails")
  private ExcessBaggageDetailsTypeI excessBaggageDetails;

  public ExcessBaggageTypeI baggageDetails(BaggageDetailsTypeI baggageDetails) {
    this.baggageDetails = baggageDetails;
    return this;
  }

  /**
   * Get baggageDetails
   * @return baggageDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public BaggageDetailsTypeI getBaggageDetails() {
    return baggageDetails;
  }

  public void setBaggageDetails(BaggageDetailsTypeI baggageDetails) {
    this.baggageDetails = baggageDetails;
  }

  public ExcessBaggageTypeI excessBaggageDetails(ExcessBaggageDetailsTypeI excessBaggageDetails) {
    this.excessBaggageDetails = excessBaggageDetails;
    return this;
  }

  /**
   * Get excessBaggageDetails
   * @return excessBaggageDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExcessBaggageDetailsTypeI getExcessBaggageDetails() {
    return excessBaggageDetails;
  }

  public void setExcessBaggageDetails(ExcessBaggageDetailsTypeI excessBaggageDetails) {
    this.excessBaggageDetails = excessBaggageDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcessBaggageTypeI excessBaggageTypeI = (ExcessBaggageTypeI) o;
    return Objects.equals(this.baggageDetails, excessBaggageTypeI.baggageDetails) &&
        Objects.equals(this.excessBaggageDetails, excessBaggageTypeI.excessBaggageDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baggageDetails, excessBaggageDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcessBaggageTypeI {\n");
    
    sb.append("    baggageDetails: ").append(toIndentedString(baggageDetails)).append("\n");
    sb.append("    excessBaggageDetails: ").append(toIndentedString(excessBaggageDetails)).append("\n");
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

