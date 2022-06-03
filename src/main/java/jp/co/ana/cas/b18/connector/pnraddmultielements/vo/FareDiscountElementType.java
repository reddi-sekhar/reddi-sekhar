package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodedAttributeInformationType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DiscountInformationType1;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemDetailsType186716C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NumberOfUnitDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RpInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FareDiscountElementType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FareDiscountElementType   {
  @JsonProperty("attributeDetails")
  @Valid
  private List<CodedAttributeInformationType1> attributeDetails = null;

  @JsonProperty("birthDate")
  private String birthDate;

  @JsonProperty("customer")
  private ItemDetailsType customer;

  @JsonProperty("discount")
  @Valid
  private List<DiscountInformationType1> discount = null;

  @JsonProperty("numberDetail")
  private NumberOfUnitDetailsType numberDetail;

  @JsonProperty("passengerType")
  private String passengerType;

  @JsonProperty("residentDisc")
  private ItemDetailsType186716C residentDisc;

  @JsonProperty("rpInformation")
  private RpInformationType rpInformation;

  public FareDiscountElementType attributeDetails(List<CodedAttributeInformationType1> attributeDetails) {
    this.attributeDetails = attributeDetails;
    return this;
  }

  public FareDiscountElementType addAttributeDetailsItem(CodedAttributeInformationType1 attributeDetailsItem) {
    if (this.attributeDetails == null) {
      this.attributeDetails = new ArrayList<>();
    }
    this.attributeDetails.add(attributeDetailsItem);
    return this;
  }

  /**
   * Get attributeDetails
   * @return attributeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CodedAttributeInformationType1> getAttributeDetails() {
    return attributeDetails;
  }

  public void setAttributeDetails(List<CodedAttributeInformationType1> attributeDetails) {
    this.attributeDetails = attributeDetails;
  }

  public FareDiscountElementType birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
  */
  @ApiModelProperty(value = "")


  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public FareDiscountElementType customer(ItemDetailsType customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemDetailsType getCustomer() {
    return customer;
  }

  public void setCustomer(ItemDetailsType customer) {
    this.customer = customer;
  }

  public FareDiscountElementType discount(List<DiscountInformationType1> discount) {
    this.discount = discount;
    return this;
  }

  public FareDiscountElementType addDiscountItem(DiscountInformationType1 discountItem) {
    if (this.discount == null) {
      this.discount = new ArrayList<>();
    }
    this.discount.add(discountItem);
    return this;
  }

  /**
   * Get discount
   * @return discount
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DiscountInformationType1> getDiscount() {
    return discount;
  }

  public void setDiscount(List<DiscountInformationType1> discount) {
    this.discount = discount;
  }

  public FareDiscountElementType numberDetail(NumberOfUnitDetailsType numberDetail) {
    this.numberDetail = numberDetail;
    return this;
  }

  /**
   * Get numberDetail
   * @return numberDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public NumberOfUnitDetailsType getNumberDetail() {
    return numberDetail;
  }

  public void setNumberDetail(NumberOfUnitDetailsType numberDetail) {
    this.numberDetail = numberDetail;
  }

  public FareDiscountElementType passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

  /**
   * Get passengerType
   * @return passengerType
  */
  @ApiModelProperty(value = "")


  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  public FareDiscountElementType residentDisc(ItemDetailsType186716C residentDisc) {
    this.residentDisc = residentDisc;
    return this;
  }

  /**
   * Get residentDisc
   * @return residentDisc
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemDetailsType186716C getResidentDisc() {
    return residentDisc;
  }

  public void setResidentDisc(ItemDetailsType186716C residentDisc) {
    this.residentDisc = residentDisc;
  }

  public FareDiscountElementType rpInformation(RpInformationType rpInformation) {
    this.rpInformation = rpInformation;
    return this;
  }

  /**
   * Get rpInformation
   * @return rpInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public RpInformationType getRpInformation() {
    return rpInformation;
  }

  public void setRpInformation(RpInformationType rpInformation) {
    this.rpInformation = rpInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FareDiscountElementType fareDiscountElementType = (FareDiscountElementType) o;
    return Objects.equals(this.attributeDetails, fareDiscountElementType.attributeDetails) &&
        Objects.equals(this.birthDate, fareDiscountElementType.birthDate) &&
        Objects.equals(this.customer, fareDiscountElementType.customer) &&
        Objects.equals(this.discount, fareDiscountElementType.discount) &&
        Objects.equals(this.numberDetail, fareDiscountElementType.numberDetail) &&
        Objects.equals(this.passengerType, fareDiscountElementType.passengerType) &&
        Objects.equals(this.residentDisc, fareDiscountElementType.residentDisc) &&
        Objects.equals(this.rpInformation, fareDiscountElementType.rpInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeDetails, birthDate, customer, discount, numberDetail, passengerType, residentDisc, rpInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FareDiscountElementType {\n");
    
    sb.append("    attributeDetails: ").append(toIndentedString(attributeDetails)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    numberDetail: ").append(toIndentedString(numberDetail)).append("\n");
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
    sb.append("    residentDisc: ").append(toIndentedString(residentDisc)).append("\n");
    sb.append("    rpInformation: ").append(toIndentedString(rpInformation)).append("\n");
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

