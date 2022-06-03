package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PricingTicketingInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PricingTicketingDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PricingTicketingDetailsTypeI   {
  @JsonProperty("priceTariffType")
  private String priceTariffType;

  @JsonProperty("priceTicketDetails")
  private PricingTicketingInformationTypeI priceTicketDetails;

  public PricingTicketingDetailsTypeI priceTariffType(String priceTariffType) {
    this.priceTariffType = priceTariffType;
    return this;
  }

  /**
   * Get priceTariffType
   * @return priceTariffType
  */
  @ApiModelProperty(value = "")


  public String getPriceTariffType() {
    return priceTariffType;
  }

  public void setPriceTariffType(String priceTariffType) {
    this.priceTariffType = priceTariffType;
  }

  public PricingTicketingDetailsTypeI priceTicketDetails(PricingTicketingInformationTypeI priceTicketDetails) {
    this.priceTicketDetails = priceTicketDetails;
    return this;
  }

  /**
   * Get priceTicketDetails
   * @return priceTicketDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public PricingTicketingInformationTypeI getPriceTicketDetails() {
    return priceTicketDetails;
  }

  public void setPriceTicketDetails(PricingTicketingInformationTypeI priceTicketDetails) {
    this.priceTicketDetails = priceTicketDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingTicketingDetailsTypeI pricingTicketingDetailsTypeI = (PricingTicketingDetailsTypeI) o;
    return Objects.equals(this.priceTariffType, pricingTicketingDetailsTypeI.priceTariffType) &&
        Objects.equals(this.priceTicketDetails, pricingTicketingDetailsTypeI.priceTicketDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceTariffType, priceTicketDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingTicketingDetailsTypeI {\n");
    
    sb.append("    priceTariffType: ").append(toIndentedString(priceTariffType)).append("\n");
    sb.append("    priceTicketDetails: ").append(toIndentedString(priceTicketDetails)).append("\n");
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

