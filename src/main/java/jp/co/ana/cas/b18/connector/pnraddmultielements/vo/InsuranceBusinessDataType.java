package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ActionDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CommissionInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ContactDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CoverageDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DocumentInformationDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsuranceFopSection;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsuranceProductDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PassengerDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PlanTypeDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductSection;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SubscriberAddressSection;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeI22057S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerInformationTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InsuranceBusinessDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class InsuranceBusinessDataType   {
  @JsonProperty("comissionAmount")
  private CommissionInformationType comissionAmount;

  @JsonProperty("confirmationNumber")
  private ReservationControlInformationTypeI confirmationNumber;

  @JsonProperty("contactDetails")
  private ContactDetails contactDetails;

  @JsonProperty("coverageDetails")
  private CoverageDetails coverageDetails;

  @JsonProperty("extraPremium")
  private MonetaryInformationTypeI extraPremium;

  @JsonProperty("insuranceFopSection")
  private InsuranceFopSection insuranceFopSection;

  @JsonProperty("passengerDetails")
  @Valid
  private List<PassengerDetails> passengerDetails = null;

  @JsonProperty("planCostInfo")
  private TariffInformationTypeI22057S planCostInfo;

  @JsonProperty("planTypeDetails")
  private PlanTypeDetails planTypeDetails;

  @JsonProperty("printInformation")
  private DocumentInformationDetailsTypeI printInformation;

  @JsonProperty("productKnowledge")
  @Valid
  private List<ActionDetailsTypeI> productKnowledge = null;

  @JsonProperty("productSection")
  @Valid
  private List<ProductSection> productSection = null;

  @JsonProperty("providerProductDetails")
  private InsuranceProductDetailsType providerProductDetails;

  @JsonProperty("subscriberAddressSection")
  private SubscriberAddressSection subscriberAddressSection;

  @JsonProperty("substiteName")
  @Valid
  private List<TravellerInformationTypeI> substiteName = null;

  public InsuranceBusinessDataType comissionAmount(CommissionInformationType comissionAmount) {
    this.comissionAmount = comissionAmount;
    return this;
  }

  /**
   * Get comissionAmount
   * @return comissionAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommissionInformationType getComissionAmount() {
    return comissionAmount;
  }

  public void setComissionAmount(CommissionInformationType comissionAmount) {
    this.comissionAmount = comissionAmount;
  }

  public InsuranceBusinessDataType confirmationNumber(ReservationControlInformationTypeI confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
    return this;
  }

  /**
   * Get confirmationNumber
   * @return confirmationNumber
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationControlInformationTypeI getConfirmationNumber() {
    return confirmationNumber;
  }

  public void setConfirmationNumber(ReservationControlInformationTypeI confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }

  public InsuranceBusinessDataType contactDetails(ContactDetails contactDetails) {
    this.contactDetails = contactDetails;
    return this;
  }

  /**
   * Get contactDetails
   * @return contactDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContactDetails getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(ContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }

  public InsuranceBusinessDataType coverageDetails(CoverageDetails coverageDetails) {
    this.coverageDetails = coverageDetails;
    return this;
  }

  /**
   * Get coverageDetails
   * @return coverageDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CoverageDetails getCoverageDetails() {
    return coverageDetails;
  }

  public void setCoverageDetails(CoverageDetails coverageDetails) {
    this.coverageDetails = coverageDetails;
  }

  public InsuranceBusinessDataType extraPremium(MonetaryInformationTypeI extraPremium) {
    this.extraPremium = extraPremium;
    return this;
  }

  /**
   * Get extraPremium
   * @return extraPremium
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI getExtraPremium() {
    return extraPremium;
  }

  public void setExtraPremium(MonetaryInformationTypeI extraPremium) {
    this.extraPremium = extraPremium;
  }

  public InsuranceBusinessDataType insuranceFopSection(InsuranceFopSection insuranceFopSection) {
    this.insuranceFopSection = insuranceFopSection;
    return this;
  }

  /**
   * Get insuranceFopSection
   * @return insuranceFopSection
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceFopSection getInsuranceFopSection() {
    return insuranceFopSection;
  }

  public void setInsuranceFopSection(InsuranceFopSection insuranceFopSection) {
    this.insuranceFopSection = insuranceFopSection;
  }

  public InsuranceBusinessDataType passengerDetails(List<PassengerDetails> passengerDetails) {
    this.passengerDetails = passengerDetails;
    return this;
  }

  public InsuranceBusinessDataType addPassengerDetailsItem(PassengerDetails passengerDetailsItem) {
    if (this.passengerDetails == null) {
      this.passengerDetails = new ArrayList<>();
    }
    this.passengerDetails.add(passengerDetailsItem);
    return this;
  }

  /**
   * Get passengerDetails
   * @return passengerDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PassengerDetails> getPassengerDetails() {
    return passengerDetails;
  }

  public void setPassengerDetails(List<PassengerDetails> passengerDetails) {
    this.passengerDetails = passengerDetails;
  }

  public InsuranceBusinessDataType planCostInfo(TariffInformationTypeI22057S planCostInfo) {
    this.planCostInfo = planCostInfo;
    return this;
  }

  /**
   * Get planCostInfo
   * @return planCostInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeI22057S getPlanCostInfo() {
    return planCostInfo;
  }

  public void setPlanCostInfo(TariffInformationTypeI22057S planCostInfo) {
    this.planCostInfo = planCostInfo;
  }

  public InsuranceBusinessDataType planTypeDetails(PlanTypeDetails planTypeDetails) {
    this.planTypeDetails = planTypeDetails;
    return this;
  }

  /**
   * Get planTypeDetails
   * @return planTypeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlanTypeDetails getPlanTypeDetails() {
    return planTypeDetails;
  }

  public void setPlanTypeDetails(PlanTypeDetails planTypeDetails) {
    this.planTypeDetails = planTypeDetails;
  }

  public InsuranceBusinessDataType printInformation(DocumentInformationDetailsTypeI printInformation) {
    this.printInformation = printInformation;
    return this;
  }

  /**
   * Get printInformation
   * @return printInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public DocumentInformationDetailsTypeI getPrintInformation() {
    return printInformation;
  }

  public void setPrintInformation(DocumentInformationDetailsTypeI printInformation) {
    this.printInformation = printInformation;
  }

  public InsuranceBusinessDataType productKnowledge(List<ActionDetailsTypeI> productKnowledge) {
    this.productKnowledge = productKnowledge;
    return this;
  }

  public InsuranceBusinessDataType addProductKnowledgeItem(ActionDetailsTypeI productKnowledgeItem) {
    if (this.productKnowledge == null) {
      this.productKnowledge = new ArrayList<>();
    }
    this.productKnowledge.add(productKnowledgeItem);
    return this;
  }

  /**
   * Get productKnowledge
   * @return productKnowledge
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ActionDetailsTypeI> getProductKnowledge() {
    return productKnowledge;
  }

  public void setProductKnowledge(List<ActionDetailsTypeI> productKnowledge) {
    this.productKnowledge = productKnowledge;
  }

  public InsuranceBusinessDataType productSection(List<ProductSection> productSection) {
    this.productSection = productSection;
    return this;
  }

  public InsuranceBusinessDataType addProductSectionItem(ProductSection productSectionItem) {
    if (this.productSection == null) {
      this.productSection = new ArrayList<>();
    }
    this.productSection.add(productSectionItem);
    return this;
  }

  /**
   * Get productSection
   * @return productSection
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductSection> getProductSection() {
    return productSection;
  }

  public void setProductSection(List<ProductSection> productSection) {
    this.productSection = productSection;
  }

  public InsuranceBusinessDataType providerProductDetails(InsuranceProductDetailsType providerProductDetails) {
    this.providerProductDetails = providerProductDetails;
    return this;
  }

  /**
   * Get providerProductDetails
   * @return providerProductDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceProductDetailsType getProviderProductDetails() {
    return providerProductDetails;
  }

  public void setProviderProductDetails(InsuranceProductDetailsType providerProductDetails) {
    this.providerProductDetails = providerProductDetails;
  }

  public InsuranceBusinessDataType subscriberAddressSection(SubscriberAddressSection subscriberAddressSection) {
    this.subscriberAddressSection = subscriberAddressSection;
    return this;
  }

  /**
   * Get subscriberAddressSection
   * @return subscriberAddressSection
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubscriberAddressSection getSubscriberAddressSection() {
    return subscriberAddressSection;
  }

  public void setSubscriberAddressSection(SubscriberAddressSection subscriberAddressSection) {
    this.subscriberAddressSection = subscriberAddressSection;
  }

  public InsuranceBusinessDataType substiteName(List<TravellerInformationTypeI> substiteName) {
    this.substiteName = substiteName;
    return this;
  }

  public InsuranceBusinessDataType addSubstiteNameItem(TravellerInformationTypeI substiteNameItem) {
    if (this.substiteName == null) {
      this.substiteName = new ArrayList<>();
    }
    this.substiteName.add(substiteNameItem);
    return this;
  }

  /**
   * Get substiteName
   * @return substiteName
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TravellerInformationTypeI> getSubstiteName() {
    return substiteName;
  }

  public void setSubstiteName(List<TravellerInformationTypeI> substiteName) {
    this.substiteName = substiteName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceBusinessDataType insuranceBusinessDataType = (InsuranceBusinessDataType) o;
    return Objects.equals(this.comissionAmount, insuranceBusinessDataType.comissionAmount) &&
        Objects.equals(this.confirmationNumber, insuranceBusinessDataType.confirmationNumber) &&
        Objects.equals(this.contactDetails, insuranceBusinessDataType.contactDetails) &&
        Objects.equals(this.coverageDetails, insuranceBusinessDataType.coverageDetails) &&
        Objects.equals(this.extraPremium, insuranceBusinessDataType.extraPremium) &&
        Objects.equals(this.insuranceFopSection, insuranceBusinessDataType.insuranceFopSection) &&
        Objects.equals(this.passengerDetails, insuranceBusinessDataType.passengerDetails) &&
        Objects.equals(this.planCostInfo, insuranceBusinessDataType.planCostInfo) &&
        Objects.equals(this.planTypeDetails, insuranceBusinessDataType.planTypeDetails) &&
        Objects.equals(this.printInformation, insuranceBusinessDataType.printInformation) &&
        Objects.equals(this.productKnowledge, insuranceBusinessDataType.productKnowledge) &&
        Objects.equals(this.productSection, insuranceBusinessDataType.productSection) &&
        Objects.equals(this.providerProductDetails, insuranceBusinessDataType.providerProductDetails) &&
        Objects.equals(this.subscriberAddressSection, insuranceBusinessDataType.subscriberAddressSection) &&
        Objects.equals(this.substiteName, insuranceBusinessDataType.substiteName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comissionAmount, confirmationNumber, contactDetails, coverageDetails, extraPremium, insuranceFopSection, passengerDetails, planCostInfo, planTypeDetails, printInformation, productKnowledge, productSection, providerProductDetails, subscriberAddressSection, substiteName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceBusinessDataType {\n");
    
    sb.append("    comissionAmount: ").append(toIndentedString(comissionAmount)).append("\n");
    sb.append("    confirmationNumber: ").append(toIndentedString(confirmationNumber)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    coverageDetails: ").append(toIndentedString(coverageDetails)).append("\n");
    sb.append("    extraPremium: ").append(toIndentedString(extraPremium)).append("\n");
    sb.append("    insuranceFopSection: ").append(toIndentedString(insuranceFopSection)).append("\n");
    sb.append("    passengerDetails: ").append(toIndentedString(passengerDetails)).append("\n");
    sb.append("    planCostInfo: ").append(toIndentedString(planCostInfo)).append("\n");
    sb.append("    planTypeDetails: ").append(toIndentedString(planTypeDetails)).append("\n");
    sb.append("    printInformation: ").append(toIndentedString(printInformation)).append("\n");
    sb.append("    productKnowledge: ").append(toIndentedString(productKnowledge)).append("\n");
    sb.append("    productSection: ").append(toIndentedString(productSection)).append("\n");
    sb.append("    providerProductDetails: ").append(toIndentedString(providerProductDetails)).append("\n");
    sb.append("    subscriberAddressSection: ").append(toIndentedString(subscriberAddressSection)).append("\n");
    sb.append("    substiteName: ").append(toIndentedString(substiteName)).append("\n");
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

