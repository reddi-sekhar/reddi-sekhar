package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DutyTaxFeeDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationType193831S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PlaceLocationIdentificationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TaxType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CouponTaxDetailsGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CouponTaxDetailsGroup   {
  @JsonProperty("locationInfo")
  private PlaceLocationIdentificationType locationInfo;

  @JsonProperty("monetaryInfo")
  private MonetaryInformationType193831S monetaryInfo;

  @JsonProperty("taxDetails")
  private TaxType taxDetails;

  @JsonProperty("taxTriggerInfo")
  private DutyTaxFeeDetailsType taxTriggerInfo;

  public CouponTaxDetailsGroup locationInfo(PlaceLocationIdentificationType locationInfo) {
    this.locationInfo = locationInfo;
    return this;
  }

  /**
   * Get locationInfo
   * @return locationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlaceLocationIdentificationType getLocationInfo() {
    return locationInfo;
  }

  public void setLocationInfo(PlaceLocationIdentificationType locationInfo) {
    this.locationInfo = locationInfo;
  }

  public CouponTaxDetailsGroup monetaryInfo(MonetaryInformationType193831S monetaryInfo) {
    this.monetaryInfo = monetaryInfo;
    return this;
  }

  /**
   * Get monetaryInfo
   * @return monetaryInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationType193831S getMonetaryInfo() {
    return monetaryInfo;
  }

  public void setMonetaryInfo(MonetaryInformationType193831S monetaryInfo) {
    this.monetaryInfo = monetaryInfo;
  }

  public CouponTaxDetailsGroup taxDetails(TaxType taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  /**
   * Get taxDetails
   * @return taxDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaxType getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(TaxType taxDetails) {
    this.taxDetails = taxDetails;
  }

  public CouponTaxDetailsGroup taxTriggerInfo(DutyTaxFeeDetailsType taxTriggerInfo) {
    this.taxTriggerInfo = taxTriggerInfo;
    return this;
  }

  /**
   * Get taxTriggerInfo
   * @return taxTriggerInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public DutyTaxFeeDetailsType getTaxTriggerInfo() {
    return taxTriggerInfo;
  }

  public void setTaxTriggerInfo(DutyTaxFeeDetailsType taxTriggerInfo) {
    this.taxTriggerInfo = taxTriggerInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponTaxDetailsGroup couponTaxDetailsGroup = (CouponTaxDetailsGroup) o;
    return Objects.equals(this.locationInfo, couponTaxDetailsGroup.locationInfo) &&
        Objects.equals(this.monetaryInfo, couponTaxDetailsGroup.monetaryInfo) &&
        Objects.equals(this.taxDetails, couponTaxDetailsGroup.taxDetails) &&
        Objects.equals(this.taxTriggerInfo, couponTaxDetailsGroup.taxTriggerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationInfo, monetaryInfo, taxDetails, taxTriggerInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponTaxDetailsGroup {\n");
    
    sb.append("    locationInfo: ").append(toIndentedString(locationInfo)).append("\n");
    sb.append("    monetaryInfo: ").append(toIndentedString(monetaryInfo)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
    sb.append("    taxTriggerInfo: ").append(toIndentedString(taxTriggerInfo)).append("\n");
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

