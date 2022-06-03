package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CommissionInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI79012S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PricingTicketingDetailsTypeI79032S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInformationTypeI79033S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TourInformationTypeI79029S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NegoDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class NegoDataType   {
  @JsonProperty("commissionInformation")
  private CommissionInformationTypeI commissionInformation;

  @JsonProperty("negoOtherFares")
  @Valid
  private List<MonetaryInformationTypeI79012S> negoOtherFares = null;

  @JsonProperty("negoReferences")
  @Valid
  private List<ReferenceInformationTypeI79033S> negoReferences = null;

  @JsonProperty("negoSellingFare")
  private MonetaryInformationTypeI79012S negoSellingFare;

  @JsonProperty("schemeIndicator")
  private PricingTicketingDetailsTypeI79032S schemeIndicator;

  @JsonProperty("tourInformation")
  private TourInformationTypeI79029S tourInformation;

  public NegoDataType commissionInformation(CommissionInformationTypeI commissionInformation) {
    this.commissionInformation = commissionInformation;
    return this;
  }

  /**
   * Get commissionInformation
   * @return commissionInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommissionInformationTypeI getCommissionInformation() {
    return commissionInformation;
  }

  public void setCommissionInformation(CommissionInformationTypeI commissionInformation) {
    this.commissionInformation = commissionInformation;
  }

  public NegoDataType negoOtherFares(List<MonetaryInformationTypeI79012S> negoOtherFares) {
    this.negoOtherFares = negoOtherFares;
    return this;
  }

  public NegoDataType addNegoOtherFaresItem(MonetaryInformationTypeI79012S negoOtherFaresItem) {
    if (this.negoOtherFares == null) {
      this.negoOtherFares = new ArrayList<>();
    }
    this.negoOtherFares.add(negoOtherFaresItem);
    return this;
  }

  /**
   * Get negoOtherFares
   * @return negoOtherFares
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MonetaryInformationTypeI79012S> getNegoOtherFares() {
    return negoOtherFares;
  }

  public void setNegoOtherFares(List<MonetaryInformationTypeI79012S> negoOtherFares) {
    this.negoOtherFares = negoOtherFares;
  }

  public NegoDataType negoReferences(List<ReferenceInformationTypeI79033S> negoReferences) {
    this.negoReferences = negoReferences;
    return this;
  }

  public NegoDataType addNegoReferencesItem(ReferenceInformationTypeI79033S negoReferencesItem) {
    if (this.negoReferences == null) {
      this.negoReferences = new ArrayList<>();
    }
    this.negoReferences.add(negoReferencesItem);
    return this;
  }

  /**
   * Get negoReferences
   * @return negoReferences
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReferenceInformationTypeI79033S> getNegoReferences() {
    return negoReferences;
  }

  public void setNegoReferences(List<ReferenceInformationTypeI79033S> negoReferences) {
    this.negoReferences = negoReferences;
  }

  public NegoDataType negoSellingFare(MonetaryInformationTypeI79012S negoSellingFare) {
    this.negoSellingFare = negoSellingFare;
    return this;
  }

  /**
   * Get negoSellingFare
   * @return negoSellingFare
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI79012S getNegoSellingFare() {
    return negoSellingFare;
  }

  public void setNegoSellingFare(MonetaryInformationTypeI79012S negoSellingFare) {
    this.negoSellingFare = negoSellingFare;
  }

  public NegoDataType schemeIndicator(PricingTicketingDetailsTypeI79032S schemeIndicator) {
    this.schemeIndicator = schemeIndicator;
    return this;
  }

  /**
   * Get schemeIndicator
   * @return schemeIndicator
  */
  @ApiModelProperty(value = "")

  @Valid

  public PricingTicketingDetailsTypeI79032S getSchemeIndicator() {
    return schemeIndicator;
  }

  public void setSchemeIndicator(PricingTicketingDetailsTypeI79032S schemeIndicator) {
    this.schemeIndicator = schemeIndicator;
  }

  public NegoDataType tourInformation(TourInformationTypeI79029S tourInformation) {
    this.tourInformation = tourInformation;
    return this;
  }

  /**
   * Get tourInformation
   * @return tourInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public TourInformationTypeI79029S getTourInformation() {
    return tourInformation;
  }

  public void setTourInformation(TourInformationTypeI79029S tourInformation) {
    this.tourInformation = tourInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegoDataType negoDataType = (NegoDataType) o;
    return Objects.equals(this.commissionInformation, negoDataType.commissionInformation) &&
        Objects.equals(this.negoOtherFares, negoDataType.negoOtherFares) &&
        Objects.equals(this.negoReferences, negoDataType.negoReferences) &&
        Objects.equals(this.negoSellingFare, negoDataType.negoSellingFare) &&
        Objects.equals(this.schemeIndicator, negoDataType.schemeIndicator) &&
        Objects.equals(this.tourInformation, negoDataType.tourInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commissionInformation, negoOtherFares, negoReferences, negoSellingFare, schemeIndicator, tourInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegoDataType {\n");
    
    sb.append("    commissionInformation: ").append(toIndentedString(commissionInformation)).append("\n");
    sb.append("    negoOtherFares: ").append(toIndentedString(negoOtherFares)).append("\n");
    sb.append("    negoReferences: ").append(toIndentedString(negoReferences)).append("\n");
    sb.append("    negoSellingFare: ").append(toIndentedString(negoSellingFare)).append("\n");
    sb.append("    schemeIndicator: ").append(toIndentedString(schemeIndicator)).append("\n");
    sb.append("    tourInformation: ").append(toIndentedString(tourInformation)).append("\n");
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

