package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CouponDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FareFamilyType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FareQualifierDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemNumberType227073S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PricingOrTicketingSubsequentType145400S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TransportIdentifierType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelProductInformationTypeI144078S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareComponentDtlsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FareComponentDtlsType   {
  @JsonProperty("componentClassInfo")
  private PricingOrTicketingSubsequentType145400S componentClassInfo;

  @JsonProperty("couponDetailsGroup")
  @Valid
  private List<CouponDetailsType> couponDetailsGroup = null;

  @JsonProperty("fareComponentID")
  private ItemNumberType227073S fareComponentID;

  @JsonProperty("fareFamilyDetails")
  private FareFamilyType fareFamilyDetails;

  @JsonProperty("fareFamilyOwner")
  private TransportIdentifierType fareFamilyOwner;

  @JsonProperty("fareQualifiersDetail")
  private FareQualifierDetailsType fareQualifiersDetail;

  @JsonProperty("marketFareComponent")
  private TravelProductInformationTypeI144078S marketFareComponent;

  @JsonProperty("monetaryInformation")
  private MonetaryInformationType monetaryInformation;

  public FareComponentDtlsType componentClassInfo(PricingOrTicketingSubsequentType145400S componentClassInfo) {
    this.componentClassInfo = componentClassInfo;
    return this;
  }

  /**
   * Get componentClassInfo
   * @return componentClassInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PricingOrTicketingSubsequentType145400S getComponentClassInfo() {
    return componentClassInfo;
  }

  public void setComponentClassInfo(PricingOrTicketingSubsequentType145400S componentClassInfo) {
    this.componentClassInfo = componentClassInfo;
  }

  public FareComponentDtlsType couponDetailsGroup(List<CouponDetailsType> couponDetailsGroup) {
    this.couponDetailsGroup = couponDetailsGroup;
    return this;
  }

  public FareComponentDtlsType addCouponDetailsGroupItem(CouponDetailsType couponDetailsGroupItem) {
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

  public List<CouponDetailsType> getCouponDetailsGroup() {
    return couponDetailsGroup;
  }

  public void setCouponDetailsGroup(List<CouponDetailsType> couponDetailsGroup) {
    this.couponDetailsGroup = couponDetailsGroup;
  }

  public FareComponentDtlsType fareComponentID(ItemNumberType227073S fareComponentID) {
    this.fareComponentID = fareComponentID;
    return this;
  }

  /**
   * Get fareComponentID
   * @return fareComponentID
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemNumberType227073S getFareComponentID() {
    return fareComponentID;
  }

  public void setFareComponentID(ItemNumberType227073S fareComponentID) {
    this.fareComponentID = fareComponentID;
  }

  public FareComponentDtlsType fareFamilyDetails(FareFamilyType fareFamilyDetails) {
    this.fareFamilyDetails = fareFamilyDetails;
    return this;
  }

  /**
   * Get fareFamilyDetails
   * @return fareFamilyDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public FareFamilyType getFareFamilyDetails() {
    return fareFamilyDetails;
  }

  public void setFareFamilyDetails(FareFamilyType fareFamilyDetails) {
    this.fareFamilyDetails = fareFamilyDetails;
  }

  public FareComponentDtlsType fareFamilyOwner(TransportIdentifierType fareFamilyOwner) {
    this.fareFamilyOwner = fareFamilyOwner;
    return this;
  }

  /**
   * Get fareFamilyOwner
   * @return fareFamilyOwner
  */
  @ApiModelProperty(value = "")

  @Valid

  public TransportIdentifierType getFareFamilyOwner() {
    return fareFamilyOwner;
  }

  public void setFareFamilyOwner(TransportIdentifierType fareFamilyOwner) {
    this.fareFamilyOwner = fareFamilyOwner;
  }

  public FareComponentDtlsType fareQualifiersDetail(FareQualifierDetailsType fareQualifiersDetail) {
    this.fareQualifiersDetail = fareQualifiersDetail;
    return this;
  }

  /**
   * Get fareQualifiersDetail
   * @return fareQualifiersDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public FareQualifierDetailsType getFareQualifiersDetail() {
    return fareQualifiersDetail;
  }

  public void setFareQualifiersDetail(FareQualifierDetailsType fareQualifiersDetail) {
    this.fareQualifiersDetail = fareQualifiersDetail;
  }

  public FareComponentDtlsType marketFareComponent(TravelProductInformationTypeI144078S marketFareComponent) {
    this.marketFareComponent = marketFareComponent;
    return this;
  }

  /**
   * Get marketFareComponent
   * @return marketFareComponent
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelProductInformationTypeI144078S getMarketFareComponent() {
    return marketFareComponent;
  }

  public void setMarketFareComponent(TravelProductInformationTypeI144078S marketFareComponent) {
    this.marketFareComponent = marketFareComponent;
  }

  public FareComponentDtlsType monetaryInformation(MonetaryInformationType monetaryInformation) {
    this.monetaryInformation = monetaryInformation;
    return this;
  }

  /**
   * Get monetaryInformation
   * @return monetaryInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationType getMonetaryInformation() {
    return monetaryInformation;
  }

  public void setMonetaryInformation(MonetaryInformationType monetaryInformation) {
    this.monetaryInformation = monetaryInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareComponentDtlsType fareComponentDtlsType = (FareComponentDtlsType) o;
    return Objects.equals(this.componentClassInfo, fareComponentDtlsType.componentClassInfo) &&
        Objects.equals(this.couponDetailsGroup, fareComponentDtlsType.couponDetailsGroup) &&
        Objects.equals(this.fareComponentID, fareComponentDtlsType.fareComponentID) &&
        Objects.equals(this.fareFamilyDetails, fareComponentDtlsType.fareFamilyDetails) &&
        Objects.equals(this.fareFamilyOwner, fareComponentDtlsType.fareFamilyOwner) &&
        Objects.equals(this.fareQualifiersDetail, fareComponentDtlsType.fareQualifiersDetail) &&
        Objects.equals(this.marketFareComponent, fareComponentDtlsType.marketFareComponent) &&
        Objects.equals(this.monetaryInformation, fareComponentDtlsType.monetaryInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentClassInfo, couponDetailsGroup, fareComponentID, fareFamilyDetails, fareFamilyOwner, fareQualifiersDetail, marketFareComponent, monetaryInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareComponentDtlsType {\n");
    
    sb.append("    componentClassInfo: ").append(toIndentedString(componentClassInfo)).append("\n");
    sb.append("    couponDetailsGroup: ").append(toIndentedString(couponDetailsGroup)).append("\n");
    sb.append("    fareComponentID: ").append(toIndentedString(fareComponentID)).append("\n");
    sb.append("    fareFamilyDetails: ").append(toIndentedString(fareFamilyDetails)).append("\n");
    sb.append("    fareFamilyOwner: ").append(toIndentedString(fareFamilyOwner)).append("\n");
    sb.append("    fareQualifiersDetail: ").append(toIndentedString(fareQualifiersDetail)).append("\n");
    sb.append("    marketFareComponent: ").append(toIndentedString(marketFareComponent)).append("\n");
    sb.append("    monetaryInformation: ").append(toIndentedString(monetaryInformation)).append("\n");
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

