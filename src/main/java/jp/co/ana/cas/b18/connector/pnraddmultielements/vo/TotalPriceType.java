package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyInformationType83550S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MethodOfDelivery;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductDescription;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RateTypesTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInformationTypeI83551S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType83553S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationType83558S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TaxesType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TotalPriceType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TotalPriceType   {
  @JsonProperty("additionnalChargeInformation")
  @Valid
  private List<TaxesType> additionnalChargeInformation = null;

  @JsonProperty("externalRef")
  private ReferenceInformationTypeI83551S externalRef;

  @JsonProperty("mainPrice")
  private TariffInformationType mainPrice;

  @JsonProperty("methodOfDelivery")
  private MethodOfDelivery methodOfDelivery;

  @JsonProperty("optionalBooking")
  private StructuredDateTimeInformationType83553S optionalBooking;

  @JsonProperty("otherPrices")
  @Valid
  private List<TariffInformationType83558S> otherPrices = null;

  @JsonProperty("productDescription")
  private ProductDescription productDescription;

  @JsonProperty("providerCode")
  private CompanyInformationType83550S providerCode;

  @JsonProperty("rateCodeInformation")
  private RateTypesTypeU rateCodeInformation;

  public TotalPriceType additionnalChargeInformation(List<TaxesType> additionnalChargeInformation) {
    this.additionnalChargeInformation = additionnalChargeInformation;
    return this;
  }

  public TotalPriceType addAdditionnalChargeInformationItem(TaxesType additionnalChargeInformationItem) {
    if (this.additionnalChargeInformation == null) {
      this.additionnalChargeInformation = new ArrayList<>();
    }
    this.additionnalChargeInformation.add(additionnalChargeInformationItem);
    return this;
  }

  /**
   * Get additionnalChargeInformation
   * @return additionnalChargeInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TaxesType> getAdditionnalChargeInformation() {
    return additionnalChargeInformation;
  }

  public void setAdditionnalChargeInformation(List<TaxesType> additionnalChargeInformation) {
    this.additionnalChargeInformation = additionnalChargeInformation;
  }

  public TotalPriceType externalRef(ReferenceInformationTypeI83551S externalRef) {
    this.externalRef = externalRef;
    return this;
  }

  /**
   * Get externalRef
   * @return externalRef
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInformationTypeI83551S getExternalRef() {
    return externalRef;
  }

  public void setExternalRef(ReferenceInformationTypeI83551S externalRef) {
    this.externalRef = externalRef;
  }

  public TotalPriceType mainPrice(TariffInformationType mainPrice) {
    this.mainPrice = mainPrice;
    return this;
  }

  /**
   * Get mainPrice
   * @return mainPrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationType getMainPrice() {
    return mainPrice;
  }

  public void setMainPrice(TariffInformationType mainPrice) {
    this.mainPrice = mainPrice;
  }

  public TotalPriceType methodOfDelivery(MethodOfDelivery methodOfDelivery) {
    this.methodOfDelivery = methodOfDelivery;
    return this;
  }

  /**
   * Get methodOfDelivery
   * @return methodOfDelivery
  */
  @ApiModelProperty(value = "")

  @Valid

  public MethodOfDelivery getMethodOfDelivery() {
    return methodOfDelivery;
  }

  public void setMethodOfDelivery(MethodOfDelivery methodOfDelivery) {
    this.methodOfDelivery = methodOfDelivery;
  }

  public TotalPriceType optionalBooking(StructuredDateTimeInformationType83553S optionalBooking) {
    this.optionalBooking = optionalBooking;
    return this;
  }

  /**
   * Get optionalBooking
   * @return optionalBooking
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeInformationType83553S getOptionalBooking() {
    return optionalBooking;
  }

  public void setOptionalBooking(StructuredDateTimeInformationType83553S optionalBooking) {
    this.optionalBooking = optionalBooking;
  }

  public TotalPriceType otherPrices(List<TariffInformationType83558S> otherPrices) {
    this.otherPrices = otherPrices;
    return this;
  }

  public TotalPriceType addOtherPricesItem(TariffInformationType83558S otherPricesItem) {
    if (this.otherPrices == null) {
      this.otherPrices = new ArrayList<>();
    }
    this.otherPrices.add(otherPricesItem);
    return this;
  }

  /**
   * Get otherPrices
   * @return otherPrices
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TariffInformationType83558S> getOtherPrices() {
    return otherPrices;
  }

  public void setOtherPrices(List<TariffInformationType83558S> otherPrices) {
    this.otherPrices = otherPrices;
  }

  public TotalPriceType productDescription(ProductDescription productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * Get productDescription
   * @return productDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductDescription getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(ProductDescription productDescription) {
    this.productDescription = productDescription;
  }

  public TotalPriceType providerCode(CompanyInformationType83550S providerCode) {
    this.providerCode = providerCode;
    return this;
  }

  /**
   * Get providerCode
   * @return providerCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyInformationType83550S getProviderCode() {
    return providerCode;
  }

  public void setProviderCode(CompanyInformationType83550S providerCode) {
    this.providerCode = providerCode;
  }

  public TotalPriceType rateCodeInformation(RateTypesTypeU rateCodeInformation) {
    this.rateCodeInformation = rateCodeInformation;
    return this;
  }

  /**
   * Get rateCodeInformation
   * @return rateCodeInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public RateTypesTypeU getRateCodeInformation() {
    return rateCodeInformation;
  }

  public void setRateCodeInformation(RateTypesTypeU rateCodeInformation) {
    this.rateCodeInformation = rateCodeInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalPriceType totalPriceType = (TotalPriceType) o;
    return Objects.equals(this.additionnalChargeInformation, totalPriceType.additionnalChargeInformation) &&
        Objects.equals(this.externalRef, totalPriceType.externalRef) &&
        Objects.equals(this.mainPrice, totalPriceType.mainPrice) &&
        Objects.equals(this.methodOfDelivery, totalPriceType.methodOfDelivery) &&
        Objects.equals(this.optionalBooking, totalPriceType.optionalBooking) &&
        Objects.equals(this.otherPrices, totalPriceType.otherPrices) &&
        Objects.equals(this.productDescription, totalPriceType.productDescription) &&
        Objects.equals(this.providerCode, totalPriceType.providerCode) &&
        Objects.equals(this.rateCodeInformation, totalPriceType.rateCodeInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionnalChargeInformation, externalRef, mainPrice, methodOfDelivery, optionalBooking, otherPrices, productDescription, providerCode, rateCodeInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalPriceType {\n");
    
    sb.append("    additionnalChargeInformation: ").append(toIndentedString(additionnalChargeInformation)).append("\n");
    sb.append("    externalRef: ").append(toIndentedString(externalRef)).append("\n");
    sb.append("    mainPrice: ").append(toIndentedString(mainPrice)).append("\n");
    sb.append("    methodOfDelivery: ").append(toIndentedString(methodOfDelivery)).append("\n");
    sb.append("    optionalBooking: ").append(toIndentedString(optionalBooking)).append("\n");
    sb.append("    otherPrices: ").append(toIndentedString(otherPrices)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    providerCode: ").append(toIndentedString(providerCode)).append("\n");
    sb.append("    rateCodeInformation: ").append(toIndentedString(rateCodeInformation)).append("\n");
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

