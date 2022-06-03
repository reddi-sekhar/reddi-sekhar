package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductTypeDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravelProductInformationTypeI79024S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravelProductInformationTypeI79024S   {
  @JsonProperty("flightTypeDetails")
  private ProductTypeDetailsTypeI flightTypeDetails;

  public TravelProductInformationTypeI79024S flightTypeDetails(ProductTypeDetailsTypeI flightTypeDetails) {
    this.flightTypeDetails = flightTypeDetails;
    return this;
  }

  /**
   * Get flightTypeDetails
   * @return flightTypeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductTypeDetailsTypeI getFlightTypeDetails() {
    return flightTypeDetails;
  }

  public void setFlightTypeDetails(ProductTypeDetailsTypeI flightTypeDetails) {
    this.flightTypeDetails = flightTypeDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelProductInformationTypeI79024S travelProductInformationTypeI79024S = (TravelProductInformationTypeI79024S) o;
    return Objects.equals(this.flightTypeDetails, travelProductInformationTypeI79024S.flightTypeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flightTypeDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelProductInformationTypeI79024S {\n");
    
    sb.append("    flightTypeDetails: ").append(toIndentedString(flightTypeDetails)).append("\n");
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

