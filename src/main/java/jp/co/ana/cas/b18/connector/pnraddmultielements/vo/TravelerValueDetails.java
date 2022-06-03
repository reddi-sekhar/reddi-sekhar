package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsuranceCoverageType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravelerValueDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravelerValueDetails   {
  @JsonProperty("travelAmount")
  private MonetaryInformationTypeI travelAmount;

  @JsonProperty("travelCost")
  private InsuranceCoverageType travelCost;

  public TravelerValueDetails travelAmount(MonetaryInformationTypeI travelAmount) {
    this.travelAmount = travelAmount;
    return this;
  }

  /**
   * Get travelAmount
   * @return travelAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI getTravelAmount() {
    return travelAmount;
  }

  public void setTravelAmount(MonetaryInformationTypeI travelAmount) {
    this.travelAmount = travelAmount;
  }

  public TravelerValueDetails travelCost(InsuranceCoverageType travelCost) {
    this.travelCost = travelCost;
    return this;
  }

  /**
   * Get travelCost
   * @return travelCost
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceCoverageType getTravelCost() {
    return travelCost;
  }

  public void setTravelCost(InsuranceCoverageType travelCost) {
    this.travelCost = travelCost;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelerValueDetails travelerValueDetails = (TravelerValueDetails) o;
    return Objects.equals(this.travelAmount, travelerValueDetails.travelAmount) &&
        Objects.equals(this.travelCost, travelerValueDetails.travelCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(travelAmount, travelCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelerValueDetails {\n");
    
    sb.append("    travelAmount: ").append(toIndentedString(travelAmount)).append("\n");
    sb.append("    travelCost: ").append(toIndentedString(travelCost)).append("\n");
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

