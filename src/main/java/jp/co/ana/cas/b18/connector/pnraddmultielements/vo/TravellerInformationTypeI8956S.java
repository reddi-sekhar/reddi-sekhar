package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerSurnameInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerInformationTypeI8956S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerInformationTypeI8956S   {
  @JsonProperty("otherPaxDetails")
  private TravellerDetailsTypeI otherPaxDetails;

  @JsonProperty("paxDetails")
  private TravellerSurnameInformationTypeI paxDetails;

  public TravellerInformationTypeI8956S otherPaxDetails(TravellerDetailsTypeI otherPaxDetails) {
    this.otherPaxDetails = otherPaxDetails;
    return this;
  }

  /**
   * Get otherPaxDetails
   * @return otherPaxDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerDetailsTypeI getOtherPaxDetails() {
    return otherPaxDetails;
  }

  public void setOtherPaxDetails(TravellerDetailsTypeI otherPaxDetails) {
    this.otherPaxDetails = otherPaxDetails;
  }

  public TravellerInformationTypeI8956S paxDetails(TravellerSurnameInformationTypeI paxDetails) {
    this.paxDetails = paxDetails;
    return this;
  }

  /**
   * Get paxDetails
   * @return paxDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerSurnameInformationTypeI getPaxDetails() {
    return paxDetails;
  }

  public void setPaxDetails(TravellerSurnameInformationTypeI paxDetails) {
    this.paxDetails = paxDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravellerInformationTypeI8956S travellerInformationTypeI8956S = (TravellerInformationTypeI8956S) o;
    return Objects.equals(this.otherPaxDetails, travellerInformationTypeI8956S.otherPaxDetails) &&
        Objects.equals(this.paxDetails, travellerInformationTypeI8956S.paxDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherPaxDetails, paxDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerInformationTypeI8956S {\n");
    
    sb.append("    otherPaxDetails: ").append(toIndentedString(otherPaxDetails)).append("\n");
    sb.append("    paxDetails: ").append(toIndentedString(paxDetails)).append("\n");
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

