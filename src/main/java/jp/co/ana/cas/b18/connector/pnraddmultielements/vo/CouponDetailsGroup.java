package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AttributeType79011S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyInformationType79020S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CouponTaxDetailsGroup;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DateAndTimeInformationTypeI79021S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ExcessBaggageTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType79018S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InConnectionWithType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI79012S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PricingOrTicketingSubsequentType79023S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInformationTypeI79009S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelProductInformationTypeI79024S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CouponDetailsGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CouponDetailsGroup   {
  @JsonProperty("baggageInformation")
  private ExcessBaggageTypeI baggageInformation;

  @JsonProperty("couponFlags")
  @Valid
  private List<StatusTypeI> couponFlags = null;

  @JsonProperty("couponTaxDetailsGroup")
  @Valid
  private List<CouponTaxDetailsGroup> couponTaxDetailsGroup = null;

  @JsonProperty("couponValue")
  private MonetaryInformationTypeI79012S couponValue;

  @JsonProperty("fareQualifier")
  private PricingOrTicketingSubsequentType79023S fareQualifier;

  @JsonProperty("feeOwner")
  private CompanyInformationType79020S feeOwner;

  @JsonProperty("flightConnectionType")
  private TravelProductInformationTypeI79024S flightConnectionType;

  @JsonProperty("icw")
  @Valid
  private List<InConnectionWithType> icw = null;

  @JsonProperty("presentToAtAndRemarks")
  @Valid
  private List<FreeTextInformationType79018S> presentToAtAndRemarks = null;

  @JsonProperty("productId")
  private ReferenceInformationTypeI79009S productId;

  @JsonProperty("rfisc")
  private AttributeType79011S rfisc;

  @JsonProperty("validityDates")
  @Valid
  private List<DateAndTimeInformationTypeI79021S> validityDates = null;

  public CouponDetailsGroup baggageInformation(ExcessBaggageTypeI baggageInformation) {
    this.baggageInformation = baggageInformation;
    return this;
  }

  /**
   * Get baggageInformation
   * @return baggageInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExcessBaggageTypeI getBaggageInformation() {
    return baggageInformation;
  }

  public void setBaggageInformation(ExcessBaggageTypeI baggageInformation) {
    this.baggageInformation = baggageInformation;
  }

  public CouponDetailsGroup couponFlags(List<StatusTypeI> couponFlags) {
    this.couponFlags = couponFlags;
    return this;
  }

  public CouponDetailsGroup addCouponFlagsItem(StatusTypeI couponFlagsItem) {
    if (this.couponFlags == null) {
      this.couponFlags = new ArrayList<>();
    }
    this.couponFlags.add(couponFlagsItem);
    return this;
  }

  /**
   * Get couponFlags
   * @return couponFlags
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StatusTypeI> getCouponFlags() {
    return couponFlags;
  }

  public void setCouponFlags(List<StatusTypeI> couponFlags) {
    this.couponFlags = couponFlags;
  }

  public CouponDetailsGroup couponTaxDetailsGroup(List<CouponTaxDetailsGroup> couponTaxDetailsGroup) {
    this.couponTaxDetailsGroup = couponTaxDetailsGroup;
    return this;
  }

  public CouponDetailsGroup addCouponTaxDetailsGroupItem(CouponTaxDetailsGroup couponTaxDetailsGroupItem) {
    if (this.couponTaxDetailsGroup == null) {
      this.couponTaxDetailsGroup = new ArrayList<>();
    }
    this.couponTaxDetailsGroup.add(couponTaxDetailsGroupItem);
    return this;
  }

  /**
   * Get couponTaxDetailsGroup
   * @return couponTaxDetailsGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CouponTaxDetailsGroup> getCouponTaxDetailsGroup() {
    return couponTaxDetailsGroup;
  }

  public void setCouponTaxDetailsGroup(List<CouponTaxDetailsGroup> couponTaxDetailsGroup) {
    this.couponTaxDetailsGroup = couponTaxDetailsGroup;
  }

  public CouponDetailsGroup couponValue(MonetaryInformationTypeI79012S couponValue) {
    this.couponValue = couponValue;
    return this;
  }

  /**
   * Get couponValue
   * @return couponValue
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI79012S getCouponValue() {
    return couponValue;
  }

  public void setCouponValue(MonetaryInformationTypeI79012S couponValue) {
    this.couponValue = couponValue;
  }

  public CouponDetailsGroup fareQualifier(PricingOrTicketingSubsequentType79023S fareQualifier) {
    this.fareQualifier = fareQualifier;
    return this;
  }

  /**
   * Get fareQualifier
   * @return fareQualifier
  */
  @ApiModelProperty(value = "")

  @Valid

  public PricingOrTicketingSubsequentType79023S getFareQualifier() {
    return fareQualifier;
  }

  public void setFareQualifier(PricingOrTicketingSubsequentType79023S fareQualifier) {
    this.fareQualifier = fareQualifier;
  }

  public CouponDetailsGroup feeOwner(CompanyInformationType79020S feeOwner) {
    this.feeOwner = feeOwner;
    return this;
  }

  /**
   * Get feeOwner
   * @return feeOwner
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyInformationType79020S getFeeOwner() {
    return feeOwner;
  }

  public void setFeeOwner(CompanyInformationType79020S feeOwner) {
    this.feeOwner = feeOwner;
  }

  public CouponDetailsGroup flightConnectionType(TravelProductInformationTypeI79024S flightConnectionType) {
    this.flightConnectionType = flightConnectionType;
    return this;
  }

  /**
   * Get flightConnectionType
   * @return flightConnectionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelProductInformationTypeI79024S getFlightConnectionType() {
    return flightConnectionType;
  }

  public void setFlightConnectionType(TravelProductInformationTypeI79024S flightConnectionType) {
    this.flightConnectionType = flightConnectionType;
  }

  public CouponDetailsGroup icw(List<InConnectionWithType> icw) {
    this.icw = icw;
    return this;
  }

  public CouponDetailsGroup addIcwItem(InConnectionWithType icwItem) {
    if (this.icw == null) {
      this.icw = new ArrayList<>();
    }
    this.icw.add(icwItem);
    return this;
  }

  /**
   * Get icw
   * @return icw
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<InConnectionWithType> getIcw() {
    return icw;
  }

  public void setIcw(List<InConnectionWithType> icw) {
    this.icw = icw;
  }

  public CouponDetailsGroup presentToAtAndRemarks(List<FreeTextInformationType79018S> presentToAtAndRemarks) {
    this.presentToAtAndRemarks = presentToAtAndRemarks;
    return this;
  }

  public CouponDetailsGroup addPresentToAtAndRemarksItem(FreeTextInformationType79018S presentToAtAndRemarksItem) {
    if (this.presentToAtAndRemarks == null) {
      this.presentToAtAndRemarks = new ArrayList<>();
    }
    this.presentToAtAndRemarks.add(presentToAtAndRemarksItem);
    return this;
  }

  /**
   * Get presentToAtAndRemarks
   * @return presentToAtAndRemarks
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FreeTextInformationType79018S> getPresentToAtAndRemarks() {
    return presentToAtAndRemarks;
  }

  public void setPresentToAtAndRemarks(List<FreeTextInformationType79018S> presentToAtAndRemarks) {
    this.presentToAtAndRemarks = presentToAtAndRemarks;
  }

  public CouponDetailsGroup productId(ReferenceInformationTypeI79009S productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInformationTypeI79009S getProductId() {
    return productId;
  }

  public void setProductId(ReferenceInformationTypeI79009S productId) {
    this.productId = productId;
  }

  public CouponDetailsGroup rfisc(AttributeType79011S rfisc) {
    this.rfisc = rfisc;
    return this;
  }

  /**
   * Get rfisc
   * @return rfisc
  */
  @ApiModelProperty(value = "")

  @Valid

  public AttributeType79011S getRfisc() {
    return rfisc;
  }

  public void setRfisc(AttributeType79011S rfisc) {
    this.rfisc = rfisc;
  }

  public CouponDetailsGroup validityDates(List<DateAndTimeInformationTypeI79021S> validityDates) {
    this.validityDates = validityDates;
    return this;
  }

  public CouponDetailsGroup addValidityDatesItem(DateAndTimeInformationTypeI79021S validityDatesItem) {
    if (this.validityDates == null) {
      this.validityDates = new ArrayList<>();
    }
    this.validityDates.add(validityDatesItem);
    return this;
  }

  /**
   * Get validityDates
   * @return validityDates
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DateAndTimeInformationTypeI79021S> getValidityDates() {
    return validityDates;
  }

  public void setValidityDates(List<DateAndTimeInformationTypeI79021S> validityDates) {
    this.validityDates = validityDates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponDetailsGroup couponDetailsGroup = (CouponDetailsGroup) o;
    return Objects.equals(this.baggageInformation, couponDetailsGroup.baggageInformation) &&
        Objects.equals(this.couponFlags, couponDetailsGroup.couponFlags) &&
        Objects.equals(this.couponTaxDetailsGroup, couponDetailsGroup.couponTaxDetailsGroup) &&
        Objects.equals(this.couponValue, couponDetailsGroup.couponValue) &&
        Objects.equals(this.fareQualifier, couponDetailsGroup.fareQualifier) &&
        Objects.equals(this.feeOwner, couponDetailsGroup.feeOwner) &&
        Objects.equals(this.flightConnectionType, couponDetailsGroup.flightConnectionType) &&
        Objects.equals(this.icw, couponDetailsGroup.icw) &&
        Objects.equals(this.presentToAtAndRemarks, couponDetailsGroup.presentToAtAndRemarks) &&
        Objects.equals(this.productId, couponDetailsGroup.productId) &&
        Objects.equals(this.rfisc, couponDetailsGroup.rfisc) &&
        Objects.equals(this.validityDates, couponDetailsGroup.validityDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baggageInformation, couponFlags, couponTaxDetailsGroup, couponValue, fareQualifier, feeOwner, flightConnectionType, icw, presentToAtAndRemarks, productId, rfisc, validityDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponDetailsGroup {\n");
    
    sb.append("    baggageInformation: ").append(toIndentedString(baggageInformation)).append("\n");
    sb.append("    couponFlags: ").append(toIndentedString(couponFlags)).append("\n");
    sb.append("    couponTaxDetailsGroup: ").append(toIndentedString(couponTaxDetailsGroup)).append("\n");
    sb.append("    couponValue: ").append(toIndentedString(couponValue)).append("\n");
    sb.append("    fareQualifier: ").append(toIndentedString(fareQualifier)).append("\n");
    sb.append("    feeOwner: ").append(toIndentedString(feeOwner)).append("\n");
    sb.append("    flightConnectionType: ").append(toIndentedString(flightConnectionType)).append("\n");
    sb.append("    icw: ").append(toIndentedString(icw)).append("\n");
    sb.append("    presentToAtAndRemarks: ").append(toIndentedString(presentToAtAndRemarks)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    rfisc: ").append(toIndentedString(rfisc)).append("\n");
    sb.append("    validityDates: ").append(toIndentedString(validityDates)).append("\n");
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

