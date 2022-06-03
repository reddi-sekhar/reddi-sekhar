package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ATCdataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AttributeType79011S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodedAttributeType79010S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CouponDetailsGroup;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FareComponentDtlsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI79012S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NegoDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OBfeesGroupType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OriginAndDestinationDetailsTypeI79034S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PricingTicketingDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType79014S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TaxTypeI79017S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.UserIdentificationType79019S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DocumentDetailsGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class DocumentDetailsGroup   {
  @JsonProperty("airlineServiceFeeGroup")
  @Valid
  private List<OBfeesGroupType> airlineServiceFeeGroup = null;

  @JsonProperty("atcFares")
  private ATCdataType atcFares;

  @JsonProperty("couponDetailsGroup")
  @Valid
  private List<CouponDetailsGroup> couponDetailsGroup = null;

  @JsonProperty("creationDate")
  private StructuredDateTimeInformationType79014S creationDate;

  @JsonProperty("fareCalcRemarks")
  @Valid
  private List<FreeTextInformationType> fareCalcRemarks = null;

  @JsonProperty("fareComponentDetailsGroup")
  @Valid
  private List<FareComponentDtlsType> fareComponentDetailsGroup = null;

  @JsonProperty("flags")
  @Valid
  private List<StatusTypeI> flags = null;

  @JsonProperty("generalIndicators")
  @Valid
  private List<CodedAttributeType79010S> generalIndicators = null;

  @JsonProperty("issueIdentifier")
  private PricingTicketingDetailsTypeI issueIdentifier;

  @JsonProperty("manualIndicator")
  private StatusTypeI manualIndicator;

  @JsonProperty("negoDetails")
  private NegoDataType negoDetails;

  @JsonProperty("officeInformation")
  private UserIdentificationType79019S officeInformation;

  @JsonProperty("originDestination")
  private OriginAndDestinationDetailsTypeI79034S originDestination;

  @JsonProperty("otherDates")
  @Valid
  private List<StructuredDateTimeInformationType79014S> otherDates = null;

  @JsonProperty("otherFares")
  @Valid
  private List<MonetaryInformationTypeI79012S> otherFares = null;

  @JsonProperty("rfics")
  @Valid
  private List<AttributeType79011S> rfics = null;

  @JsonProperty("taxInformation")
  @Valid
  private List<TaxTypeI79017S> taxInformation = null;

  @JsonProperty("totalFare")
  private MonetaryInformationTypeI79012S totalFare;

  public DocumentDetailsGroup airlineServiceFeeGroup(List<OBfeesGroupType> airlineServiceFeeGroup) {
    this.airlineServiceFeeGroup = airlineServiceFeeGroup;
    return this;
  }

  public DocumentDetailsGroup addAirlineServiceFeeGroupItem(OBfeesGroupType airlineServiceFeeGroupItem) {
    if (this.airlineServiceFeeGroup == null) {
      this.airlineServiceFeeGroup = new ArrayList<>();
    }
    this.airlineServiceFeeGroup.add(airlineServiceFeeGroupItem);
    return this;
  }

  /**
   * Get airlineServiceFeeGroup
   * @return airlineServiceFeeGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OBfeesGroupType> getAirlineServiceFeeGroup() {
    return airlineServiceFeeGroup;
  }

  public void setAirlineServiceFeeGroup(List<OBfeesGroupType> airlineServiceFeeGroup) {
    this.airlineServiceFeeGroup = airlineServiceFeeGroup;
  }

  public DocumentDetailsGroup atcFares(ATCdataType atcFares) {
    this.atcFares = atcFares;
    return this;
  }

  /**
   * Get atcFares
   * @return atcFares
  */
  @ApiModelProperty(value = "")

  @Valid

  public ATCdataType getAtcFares() {
    return atcFares;
  }

  public void setAtcFares(ATCdataType atcFares) {
    this.atcFares = atcFares;
  }

  public DocumentDetailsGroup couponDetailsGroup(List<CouponDetailsGroup> couponDetailsGroup) {
    this.couponDetailsGroup = couponDetailsGroup;
    return this;
  }

  public DocumentDetailsGroup addCouponDetailsGroupItem(CouponDetailsGroup couponDetailsGroupItem) {
    if (this.couponDetailsGroup == null) {
      this.couponDetailsGroup = new ArrayList<>();
    }
    this.couponDetailsGroup.add(couponDetailsGroupItem);
    return this;
  }

  /**
   * Get couponDetailsGroup
   * @return couponDetailsGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CouponDetailsGroup> getCouponDetailsGroup() {
    return couponDetailsGroup;
  }

  public void setCouponDetailsGroup(List<CouponDetailsGroup> couponDetailsGroup) {
    this.couponDetailsGroup = couponDetailsGroup;
  }

  public DocumentDetailsGroup creationDate(StructuredDateTimeInformationType79014S creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeInformationType79014S getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(StructuredDateTimeInformationType79014S creationDate) {
    this.creationDate = creationDate;
  }

  public DocumentDetailsGroup fareCalcRemarks(List<FreeTextInformationType> fareCalcRemarks) {
    this.fareCalcRemarks = fareCalcRemarks;
    return this;
  }

  public DocumentDetailsGroup addFareCalcRemarksItem(FreeTextInformationType fareCalcRemarksItem) {
    if (this.fareCalcRemarks == null) {
      this.fareCalcRemarks = new ArrayList<>();
    }
    this.fareCalcRemarks.add(fareCalcRemarksItem);
    return this;
  }

  /**
   * Get fareCalcRemarks
   * @return fareCalcRemarks
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FreeTextInformationType> getFareCalcRemarks() {
    return fareCalcRemarks;
  }

  public void setFareCalcRemarks(List<FreeTextInformationType> fareCalcRemarks) {
    this.fareCalcRemarks = fareCalcRemarks;
  }

  public DocumentDetailsGroup fareComponentDetailsGroup(List<FareComponentDtlsType> fareComponentDetailsGroup) {
    this.fareComponentDetailsGroup = fareComponentDetailsGroup;
    return this;
  }

  public DocumentDetailsGroup addFareComponentDetailsGroupItem(FareComponentDtlsType fareComponentDetailsGroupItem) {
    if (this.fareComponentDetailsGroup == null) {
      this.fareComponentDetailsGroup = new ArrayList<>();
    }
    this.fareComponentDetailsGroup.add(fareComponentDetailsGroupItem);
    return this;
  }

  /**
   * Get fareComponentDetailsGroup
   * @return fareComponentDetailsGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FareComponentDtlsType> getFareComponentDetailsGroup() {
    return fareComponentDetailsGroup;
  }

  public void setFareComponentDetailsGroup(List<FareComponentDtlsType> fareComponentDetailsGroup) {
    this.fareComponentDetailsGroup = fareComponentDetailsGroup;
  }

  public DocumentDetailsGroup flags(List<StatusTypeI> flags) {
    this.flags = flags;
    return this;
  }

  public DocumentDetailsGroup addFlagsItem(StatusTypeI flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

  /**
   * Get flags
   * @return flags
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StatusTypeI> getFlags() {
    return flags;
  }

  public void setFlags(List<StatusTypeI> flags) {
    this.flags = flags;
  }

  public DocumentDetailsGroup generalIndicators(List<CodedAttributeType79010S> generalIndicators) {
    this.generalIndicators = generalIndicators;
    return this;
  }

  public DocumentDetailsGroup addGeneralIndicatorsItem(CodedAttributeType79010S generalIndicatorsItem) {
    if (this.generalIndicators == null) {
      this.generalIndicators = new ArrayList<>();
    }
    this.generalIndicators.add(generalIndicatorsItem);
    return this;
  }

  /**
   * Get generalIndicators
   * @return generalIndicators
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CodedAttributeType79010S> getGeneralIndicators() {
    return generalIndicators;
  }

  public void setGeneralIndicators(List<CodedAttributeType79010S> generalIndicators) {
    this.generalIndicators = generalIndicators;
  }

  public DocumentDetailsGroup issueIdentifier(PricingTicketingDetailsTypeI issueIdentifier) {
    this.issueIdentifier = issueIdentifier;
    return this;
  }

  /**
   * Get issueIdentifier
   * @return issueIdentifier
  */
  @ApiModelProperty(value = "")

  @Valid

  public PricingTicketingDetailsTypeI getIssueIdentifier() {
    return issueIdentifier;
  }

  public void setIssueIdentifier(PricingTicketingDetailsTypeI issueIdentifier) {
    this.issueIdentifier = issueIdentifier;
  }

  public DocumentDetailsGroup manualIndicator(StatusTypeI manualIndicator) {
    this.manualIndicator = manualIndicator;
    return this;
  }

  /**
   * Get manualIndicator
   * @return manualIndicator
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusTypeI getManualIndicator() {
    return manualIndicator;
  }

  public void setManualIndicator(StatusTypeI manualIndicator) {
    this.manualIndicator = manualIndicator;
  }

  public DocumentDetailsGroup negoDetails(NegoDataType negoDetails) {
    this.negoDetails = negoDetails;
    return this;
  }

  /**
   * Get negoDetails
   * @return negoDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public NegoDataType getNegoDetails() {
    return negoDetails;
  }

  public void setNegoDetails(NegoDataType negoDetails) {
    this.negoDetails = negoDetails;
  }

  public DocumentDetailsGroup officeInformation(UserIdentificationType79019S officeInformation) {
    this.officeInformation = officeInformation;
    return this;
  }

  /**
   * Get officeInformation
   * @return officeInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserIdentificationType79019S getOfficeInformation() {
    return officeInformation;
  }

  public void setOfficeInformation(UserIdentificationType79019S officeInformation) {
    this.officeInformation = officeInformation;
  }

  public DocumentDetailsGroup originDestination(OriginAndDestinationDetailsTypeI79034S originDestination) {
    this.originDestination = originDestination;
    return this;
  }

  /**
   * Get originDestination
   * @return originDestination
  */
  @ApiModelProperty(value = "")

  @Valid

  public OriginAndDestinationDetailsTypeI79034S getOriginDestination() {
    return originDestination;
  }

  public void setOriginDestination(OriginAndDestinationDetailsTypeI79034S originDestination) {
    this.originDestination = originDestination;
  }

  public DocumentDetailsGroup otherDates(List<StructuredDateTimeInformationType79014S> otherDates) {
    this.otherDates = otherDates;
    return this;
  }

  public DocumentDetailsGroup addOtherDatesItem(StructuredDateTimeInformationType79014S otherDatesItem) {
    if (this.otherDates == null) {
      this.otherDates = new ArrayList<>();
    }
    this.otherDates.add(otherDatesItem);
    return this;
  }

  /**
   * Get otherDates
   * @return otherDates
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StructuredDateTimeInformationType79014S> getOtherDates() {
    return otherDates;
  }

  public void setOtherDates(List<StructuredDateTimeInformationType79014S> otherDates) {
    this.otherDates = otherDates;
  }

  public DocumentDetailsGroup otherFares(List<MonetaryInformationTypeI79012S> otherFares) {
    this.otherFares = otherFares;
    return this;
  }

  public DocumentDetailsGroup addOtherFaresItem(MonetaryInformationTypeI79012S otherFaresItem) {
    if (this.otherFares == null) {
      this.otherFares = new ArrayList<>();
    }
    this.otherFares.add(otherFaresItem);
    return this;
  }

  /**
   * Get otherFares
   * @return otherFares
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MonetaryInformationTypeI79012S> getOtherFares() {
    return otherFares;
  }

  public void setOtherFares(List<MonetaryInformationTypeI79012S> otherFares) {
    this.otherFares = otherFares;
  }

  public DocumentDetailsGroup rfics(List<AttributeType79011S> rfics) {
    this.rfics = rfics;
    return this;
  }

  public DocumentDetailsGroup addRficsItem(AttributeType79011S rficsItem) {
    if (this.rfics == null) {
      this.rfics = new ArrayList<>();
    }
    this.rfics.add(rficsItem);
    return this;
  }

  /**
   * Get rfics
   * @return rfics
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AttributeType79011S> getRfics() {
    return rfics;
  }

  public void setRfics(List<AttributeType79011S> rfics) {
    this.rfics = rfics;
  }

  public DocumentDetailsGroup taxInformation(List<TaxTypeI79017S> taxInformation) {
    this.taxInformation = taxInformation;
    return this;
  }

  public DocumentDetailsGroup addTaxInformationItem(TaxTypeI79017S taxInformationItem) {
    if (this.taxInformation == null) {
      this.taxInformation = new ArrayList<>();
    }
    this.taxInformation.add(taxInformationItem);
    return this;
  }

  /**
   * Get taxInformation
   * @return taxInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TaxTypeI79017S> getTaxInformation() {
    return taxInformation;
  }

  public void setTaxInformation(List<TaxTypeI79017S> taxInformation) {
    this.taxInformation = taxInformation;
  }

  public DocumentDetailsGroup totalFare(MonetaryInformationTypeI79012S totalFare) {
    this.totalFare = totalFare;
    return this;
  }

  /**
   * Get totalFare
   * @return totalFare
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI79012S getTotalFare() {
    return totalFare;
  }

  public void setTotalFare(MonetaryInformationTypeI79012S totalFare) {
    this.totalFare = totalFare;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentDetailsGroup documentDetailsGroup = (DocumentDetailsGroup) o;
    return Objects.equals(this.airlineServiceFeeGroup, documentDetailsGroup.airlineServiceFeeGroup) &&
        Objects.equals(this.atcFares, documentDetailsGroup.atcFares) &&
        Objects.equals(this.couponDetailsGroup, documentDetailsGroup.couponDetailsGroup) &&
        Objects.equals(this.creationDate, documentDetailsGroup.creationDate) &&
        Objects.equals(this.fareCalcRemarks, documentDetailsGroup.fareCalcRemarks) &&
        Objects.equals(this.fareComponentDetailsGroup, documentDetailsGroup.fareComponentDetailsGroup) &&
        Objects.equals(this.flags, documentDetailsGroup.flags) &&
        Objects.equals(this.generalIndicators, documentDetailsGroup.generalIndicators) &&
        Objects.equals(this.issueIdentifier, documentDetailsGroup.issueIdentifier) &&
        Objects.equals(this.manualIndicator, documentDetailsGroup.manualIndicator) &&
        Objects.equals(this.negoDetails, documentDetailsGroup.negoDetails) &&
        Objects.equals(this.officeInformation, documentDetailsGroup.officeInformation) &&
        Objects.equals(this.originDestination, documentDetailsGroup.originDestination) &&
        Objects.equals(this.otherDates, documentDetailsGroup.otherDates) &&
        Objects.equals(this.otherFares, documentDetailsGroup.otherFares) &&
        Objects.equals(this.rfics, documentDetailsGroup.rfics) &&
        Objects.equals(this.taxInformation, documentDetailsGroup.taxInformation) &&
        Objects.equals(this.totalFare, documentDetailsGroup.totalFare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineServiceFeeGroup, atcFares, couponDetailsGroup, creationDate, fareCalcRemarks, fareComponentDetailsGroup, flags, generalIndicators, issueIdentifier, manualIndicator, negoDetails, officeInformation, originDestination, otherDates, otherFares, rfics, taxInformation, totalFare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentDetailsGroup {\n");
    
    sb.append("    airlineServiceFeeGroup: ").append(toIndentedString(airlineServiceFeeGroup)).append("\n");
    sb.append("    atcFares: ").append(toIndentedString(atcFares)).append("\n");
    sb.append("    couponDetailsGroup: ").append(toIndentedString(couponDetailsGroup)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    fareCalcRemarks: ").append(toIndentedString(fareCalcRemarks)).append("\n");
    sb.append("    fareComponentDetailsGroup: ").append(toIndentedString(fareComponentDetailsGroup)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    generalIndicators: ").append(toIndentedString(generalIndicators)).append("\n");
    sb.append("    issueIdentifier: ").append(toIndentedString(issueIdentifier)).append("\n");
    sb.append("    manualIndicator: ").append(toIndentedString(manualIndicator)).append("\n");
    sb.append("    negoDetails: ").append(toIndentedString(negoDetails)).append("\n");
    sb.append("    officeInformation: ").append(toIndentedString(officeInformation)).append("\n");
    sb.append("    originDestination: ").append(toIndentedString(originDestination)).append("\n");
    sb.append("    otherDates: ").append(toIndentedString(otherDates)).append("\n");
    sb.append("    otherFares: ").append(toIndentedString(otherFares)).append("\n");
    sb.append("    rfics: ").append(toIndentedString(rfics)).append("\n");
    sb.append("    taxInformation: ").append(toIndentedString(taxInformation)).append("\n");
    sb.append("    totalFare: ").append(toIndentedString(totalFare)).append("\n");
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

