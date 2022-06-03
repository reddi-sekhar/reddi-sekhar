package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecialRequirementsDataDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpecialRequirementsDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class SpecialRequirementsDetailsType   {
  @JsonProperty("seatDetails")
  private SpecialRequirementsDataDetailsType seatDetails;

  public SpecialRequirementsDetailsType seatDetails(SpecialRequirementsDataDetailsType seatDetails) {
    this.seatDetails = seatDetails;
    return this;
  }

  /**
   * Get seatDetails
   * @return seatDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecialRequirementsDataDetailsType getSeatDetails() {
    return seatDetails;
  }

  public void setSeatDetails(SpecialRequirementsDataDetailsType seatDetails) {
    this.seatDetails = seatDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialRequirementsDetailsType specialRequirementsDetailsType = (SpecialRequirementsDetailsType) o;
    return Objects.equals(this.seatDetails, specialRequirementsDetailsType.seatDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seatDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialRequirementsDetailsType {\n");
    
    sb.append("    seatDetails: ").append(toIndentedString(seatDetails)).append("\n");
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

