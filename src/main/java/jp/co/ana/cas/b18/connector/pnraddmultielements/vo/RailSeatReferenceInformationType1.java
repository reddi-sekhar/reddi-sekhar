package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SeatReferenceInformationType1;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RailSeatReferenceInformationType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RailSeatReferenceInformationType1   {
  @JsonProperty("railSeatReferenceDetails")
  private SeatReferenceInformationType1 railSeatReferenceDetails;

  public RailSeatReferenceInformationType1 railSeatReferenceDetails(SeatReferenceInformationType1 railSeatReferenceDetails) {
    this.railSeatReferenceDetails = railSeatReferenceDetails;
    return this;
  }

  /**
   * Get railSeatReferenceDetails
   * @return railSeatReferenceDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SeatReferenceInformationType1 getRailSeatReferenceDetails() {
    return railSeatReferenceDetails;
  }

  public void setRailSeatReferenceDetails(SeatReferenceInformationType1 railSeatReferenceDetails) {
    this.railSeatReferenceDetails = railSeatReferenceDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RailSeatReferenceInformationType1 railSeatReferenceInformationType1 = (RailSeatReferenceInformationType1) o;
    return Objects.equals(this.railSeatReferenceDetails, railSeatReferenceInformationType1.railSeatReferenceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(railSeatReferenceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RailSeatReferenceInformationType1 {\n");
    
    sb.append("    railSeatReferenceDetails: ").append(toIndentedString(railSeatReferenceDetails)).append("\n");
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

