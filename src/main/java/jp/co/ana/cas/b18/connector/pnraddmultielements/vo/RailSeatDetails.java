package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType29860S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RailSeatReferenceInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RailSeatDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RailSeatDetails   {
  @JsonProperty("railSeatDenomination")
  private FreeTextInformationType29860S railSeatDenomination;

  @JsonProperty("railSeatReferenceInformation")
  private RailSeatReferenceInformationType railSeatReferenceInformation;

  public RailSeatDetails railSeatDenomination(FreeTextInformationType29860S railSeatDenomination) {
    this.railSeatDenomination = railSeatDenomination;
    return this;
  }

  /**
   * Get railSeatDenomination
   * @return railSeatDenomination
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType29860S getRailSeatDenomination() {
    return railSeatDenomination;
  }

  public void setRailSeatDenomination(FreeTextInformationType29860S railSeatDenomination) {
    this.railSeatDenomination = railSeatDenomination;
  }

  public RailSeatDetails railSeatReferenceInformation(RailSeatReferenceInformationType railSeatReferenceInformation) {
    this.railSeatReferenceInformation = railSeatReferenceInformation;
    return this;
  }

  /**
   * Get railSeatReferenceInformation
   * @return railSeatReferenceInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public RailSeatReferenceInformationType getRailSeatReferenceInformation() {
    return railSeatReferenceInformation;
  }

  public void setRailSeatReferenceInformation(RailSeatReferenceInformationType railSeatReferenceInformation) {
    this.railSeatReferenceInformation = railSeatReferenceInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RailSeatDetails railSeatDetails = (RailSeatDetails) o;
    return Objects.equals(this.railSeatDenomination, railSeatDetails.railSeatDenomination) &&
        Objects.equals(this.railSeatReferenceInformation, railSeatDetails.railSeatReferenceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(railSeatDenomination, railSeatReferenceInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RailSeatDetails {\n");
    
    sb.append("    railSeatDenomination: ").append(toIndentedString(railSeatDenomination)).append("\n");
    sb.append("    railSeatReferenceInformation: ").append(toIndentedString(railSeatReferenceInformation)).append("\n");
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

