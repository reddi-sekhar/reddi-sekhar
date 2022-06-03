package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerDetailsTypeI46354C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerSurnameInformationType46353C;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerInformationType25441S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerInformationType25441S   {
  @JsonProperty("otherPaxDetails")
  private TravellerDetailsTypeI46354C otherPaxDetails;

  @JsonProperty("paxDetails")
  private TravellerSurnameInformationType46353C paxDetails;

  public TravellerInformationType25441S otherPaxDetails(TravellerDetailsTypeI46354C otherPaxDetails) {
    this.otherPaxDetails = otherPaxDetails;
    return this;
  }

  /**
   * Get otherPaxDetails
   * @return otherPaxDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerDetailsTypeI46354C getOtherPaxDetails() {
    return otherPaxDetails;
  }

  public void setOtherPaxDetails(TravellerDetailsTypeI46354C otherPaxDetails) {
    this.otherPaxDetails = otherPaxDetails;
  }

  public TravellerInformationType25441S paxDetails(TravellerSurnameInformationType46353C paxDetails) {
    this.paxDetails = paxDetails;
    return this;
  }

  /**
   * Get paxDetails
   * @return paxDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerSurnameInformationType46353C getPaxDetails() {
    return paxDetails;
  }

  public void setPaxDetails(TravellerSurnameInformationType46353C paxDetails) {
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
    TravellerInformationType25441S travellerInformationType25441S = (TravellerInformationType25441S) o;
    return Objects.equals(this.otherPaxDetails, travellerInformationType25441S.otherPaxDetails) &&
        Objects.equals(this.paxDetails, travellerInformationType25441S.paxDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherPaxDetails, paxDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerInformationType25441S {\n");
    
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

