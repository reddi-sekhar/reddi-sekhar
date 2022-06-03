package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AttributeTypeU24552S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PriceInfoGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PriceInfoGroup   {
  @JsonProperty("numberOfPassengers")
  private NumberOfUnitsType numberOfPassengers;

  @JsonProperty("passengerCategoryType")
  private AttributeTypeU24552S passengerCategoryType;

  @JsonProperty("routePriceInformation")
  private TariffInformationTypeU routePriceInformation;

  public PriceInfoGroup numberOfPassengers(NumberOfUnitsType numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
    return this;
  }

  /**
   * Get numberOfPassengers
   * @return numberOfPassengers
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitsType getNumberOfPassengers() {
    return numberOfPassengers;
  }

  public void setNumberOfPassengers(NumberOfUnitsType numberOfPassengers) {
    this.numberOfPassengers = numberOfPassengers;
  }

  public PriceInfoGroup passengerCategoryType(AttributeTypeU24552S passengerCategoryType) {
    this.passengerCategoryType = passengerCategoryType;
    return this;
  }

  /**
   * Get passengerCategoryType
   * @return passengerCategoryType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AttributeTypeU24552S getPassengerCategoryType() {
    return passengerCategoryType;
  }

  public void setPassengerCategoryType(AttributeTypeU24552S passengerCategoryType) {
    this.passengerCategoryType = passengerCategoryType;
  }

  public PriceInfoGroup routePriceInformation(TariffInformationTypeU routePriceInformation) {
    this.routePriceInformation = routePriceInformation;
    return this;
  }

  /**
   * Get routePriceInformation
   * @return routePriceInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeU getRoutePriceInformation() {
    return routePriceInformation;
  }

  public void setRoutePriceInformation(TariffInformationTypeU routePriceInformation) {
    this.routePriceInformation = routePriceInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceInfoGroup priceInfoGroup = (PriceInfoGroup) o;
    return Objects.equals(this.numberOfPassengers, priceInfoGroup.numberOfPassengers) &&
        Objects.equals(this.passengerCategoryType, priceInfoGroup.passengerCategoryType) &&
        Objects.equals(this.routePriceInformation, priceInfoGroup.routePriceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfPassengers, passengerCategoryType, routePriceInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceInfoGroup {\n");
    
    sb.append("    numberOfPassengers: ").append(toIndentedString(numberOfPassengers)).append("\n");
    sb.append("    passengerCategoryType: ").append(toIndentedString(passengerCategoryType)).append("\n");
    sb.append("    routePriceInformation: ").append(toIndentedString(routePriceInformation)).append("\n");
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

