package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ActionDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsurancePolicyType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MiscellaneousRemarksType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PassengerDocumentDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PremiumPerTariffPerPax;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationTypeU31804S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType13380S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeI22057S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelerValueDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PassengerDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PassengerDetails   {
  @JsonProperty("dateOfBirthInfo")
  private StructuredDateTimeInformationType13380S dateOfBirthInfo;

  @JsonProperty("insureeRemark")
  private MiscellaneousRemarksType insureeRemark;

  @JsonProperty("passengerAssociation")
  private ReferenceInformationType passengerAssociation;

  @JsonProperty("passengerFeatures")
  @Valid
  private List<TravellerInformationType> passengerFeatures = null;

  @JsonProperty("perPaxProdKnowledge")
  @Valid
  private List<ActionDetailsTypeI> perPaxProdKnowledge = null;

  @JsonProperty("policyDetails")
  private InsurancePolicyType policyDetails;

  @JsonProperty("premiumPerTariffPerPax")
  @Valid
  private List<PremiumPerTariffPerPax> premiumPerTariffPerPax = null;

  @JsonProperty("premiumPerpaxInfo")
  private TariffInformationTypeI22057S premiumPerpaxInfo;

  @JsonProperty("travelerDocInfo")
  private PassengerDocumentDetailsType travelerDocInfo;

  @JsonProperty("travelerValueDetails")
  private TravelerValueDetails travelerValueDetails;

  @JsonProperty("voucherNumber")
  private ReservationControlInformationTypeU31804S voucherNumber;

  public PassengerDetails dateOfBirthInfo(StructuredDateTimeInformationType13380S dateOfBirthInfo) {
    this.dateOfBirthInfo = dateOfBirthInfo;
    return this;
  }

  /**
   * Get dateOfBirthInfo
   * @return dateOfBirthInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeInformationType13380S getDateOfBirthInfo() {
    return dateOfBirthInfo;
  }

  public void setDateOfBirthInfo(StructuredDateTimeInformationType13380S dateOfBirthInfo) {
    this.dateOfBirthInfo = dateOfBirthInfo;
  }

  public PassengerDetails insureeRemark(MiscellaneousRemarksType insureeRemark) {
    this.insureeRemark = insureeRemark;
    return this;
  }

  /**
   * Get insureeRemark
   * @return insureeRemark
  */
  @ApiModelProperty(value = "")

  @Valid

  public MiscellaneousRemarksType getInsureeRemark() {
    return insureeRemark;
  }

  public void setInsureeRemark(MiscellaneousRemarksType insureeRemark) {
    this.insureeRemark = insureeRemark;
  }

  public PassengerDetails passengerAssociation(ReferenceInformationType passengerAssociation) {
    this.passengerAssociation = passengerAssociation;
    return this;
  }

  /**
   * Get passengerAssociation
   * @return passengerAssociation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReferenceInformationType getPassengerAssociation() {
    return passengerAssociation;
  }

  public void setPassengerAssociation(ReferenceInformationType passengerAssociation) {
    this.passengerAssociation = passengerAssociation;
  }

  public PassengerDetails passengerFeatures(List<TravellerInformationType> passengerFeatures) {
    this.passengerFeatures = passengerFeatures;
    return this;
  }

  public PassengerDetails addPassengerFeaturesItem(TravellerInformationType passengerFeaturesItem) {
    if (this.passengerFeatures == null) {
      this.passengerFeatures = new ArrayList<>();
    }
    this.passengerFeatures.add(passengerFeaturesItem);
    return this;
  }

  /**
   * Get passengerFeatures
   * @return passengerFeatures
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TravellerInformationType> getPassengerFeatures() {
    return passengerFeatures;
  }

  public void setPassengerFeatures(List<TravellerInformationType> passengerFeatures) {
    this.passengerFeatures = passengerFeatures;
  }

  public PassengerDetails perPaxProdKnowledge(List<ActionDetailsTypeI> perPaxProdKnowledge) {
    this.perPaxProdKnowledge = perPaxProdKnowledge;
    return this;
  }

  public PassengerDetails addPerPaxProdKnowledgeItem(ActionDetailsTypeI perPaxProdKnowledgeItem) {
    if (this.perPaxProdKnowledge == null) {
      this.perPaxProdKnowledge = new ArrayList<>();
    }
    this.perPaxProdKnowledge.add(perPaxProdKnowledgeItem);
    return this;
  }

  /**
   * Get perPaxProdKnowledge
   * @return perPaxProdKnowledge
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ActionDetailsTypeI> getPerPaxProdKnowledge() {
    return perPaxProdKnowledge;
  }

  public void setPerPaxProdKnowledge(List<ActionDetailsTypeI> perPaxProdKnowledge) {
    this.perPaxProdKnowledge = perPaxProdKnowledge;
  }

  public PassengerDetails policyDetails(InsurancePolicyType policyDetails) {
    this.policyDetails = policyDetails;
    return this;
  }

  /**
   * Get policyDetails
   * @return policyDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsurancePolicyType getPolicyDetails() {
    return policyDetails;
  }

  public void setPolicyDetails(InsurancePolicyType policyDetails) {
    this.policyDetails = policyDetails;
  }

  public PassengerDetails premiumPerTariffPerPax(List<PremiumPerTariffPerPax> premiumPerTariffPerPax) {
    this.premiumPerTariffPerPax = premiumPerTariffPerPax;
    return this;
  }

  public PassengerDetails addPremiumPerTariffPerPaxItem(PremiumPerTariffPerPax premiumPerTariffPerPaxItem) {
    if (this.premiumPerTariffPerPax == null) {
      this.premiumPerTariffPerPax = new ArrayList<>();
    }
    this.premiumPerTariffPerPax.add(premiumPerTariffPerPaxItem);
    return this;
  }

  /**
   * Get premiumPerTariffPerPax
   * @return premiumPerTariffPerPax
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PremiumPerTariffPerPax> getPremiumPerTariffPerPax() {
    return premiumPerTariffPerPax;
  }

  public void setPremiumPerTariffPerPax(List<PremiumPerTariffPerPax> premiumPerTariffPerPax) {
    this.premiumPerTariffPerPax = premiumPerTariffPerPax;
  }

  public PassengerDetails premiumPerpaxInfo(TariffInformationTypeI22057S premiumPerpaxInfo) {
    this.premiumPerpaxInfo = premiumPerpaxInfo;
    return this;
  }

  /**
   * Get premiumPerpaxInfo
   * @return premiumPerpaxInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TariffInformationTypeI22057S getPremiumPerpaxInfo() {
    return premiumPerpaxInfo;
  }

  public void setPremiumPerpaxInfo(TariffInformationTypeI22057S premiumPerpaxInfo) {
    this.premiumPerpaxInfo = premiumPerpaxInfo;
  }

  public PassengerDetails travelerDocInfo(PassengerDocumentDetailsType travelerDocInfo) {
    this.travelerDocInfo = travelerDocInfo;
    return this;
  }

  /**
   * Get travelerDocInfo
   * @return travelerDocInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PassengerDocumentDetailsType getTravelerDocInfo() {
    return travelerDocInfo;
  }

  public void setTravelerDocInfo(PassengerDocumentDetailsType travelerDocInfo) {
    this.travelerDocInfo = travelerDocInfo;
  }

  public PassengerDetails travelerValueDetails(TravelerValueDetails travelerValueDetails) {
    this.travelerValueDetails = travelerValueDetails;
    return this;
  }

  /**
   * Get travelerValueDetails
   * @return travelerValueDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelerValueDetails getTravelerValueDetails() {
    return travelerValueDetails;
  }

  public void setTravelerValueDetails(TravelerValueDetails travelerValueDetails) {
    this.travelerValueDetails = travelerValueDetails;
  }

  public PassengerDetails voucherNumber(ReservationControlInformationTypeU31804S voucherNumber) {
    this.voucherNumber = voucherNumber;
    return this;
  }

  /**
   * Get voucherNumber
   * @return voucherNumber
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationControlInformationTypeU31804S getVoucherNumber() {
    return voucherNumber;
  }

  public void setVoucherNumber(ReservationControlInformationTypeU31804S voucherNumber) {
    this.voucherNumber = voucherNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassengerDetails passengerDetails = (PassengerDetails) o;
    return Objects.equals(this.dateOfBirthInfo, passengerDetails.dateOfBirthInfo) &&
        Objects.equals(this.insureeRemark, passengerDetails.insureeRemark) &&
        Objects.equals(this.passengerAssociation, passengerDetails.passengerAssociation) &&
        Objects.equals(this.passengerFeatures, passengerDetails.passengerFeatures) &&
        Objects.equals(this.perPaxProdKnowledge, passengerDetails.perPaxProdKnowledge) &&
        Objects.equals(this.policyDetails, passengerDetails.policyDetails) &&
        Objects.equals(this.premiumPerTariffPerPax, passengerDetails.premiumPerTariffPerPax) &&
        Objects.equals(this.premiumPerpaxInfo, passengerDetails.premiumPerpaxInfo) &&
        Objects.equals(this.travelerDocInfo, passengerDetails.travelerDocInfo) &&
        Objects.equals(this.travelerValueDetails, passengerDetails.travelerValueDetails) &&
        Objects.equals(this.voucherNumber, passengerDetails.voucherNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirthInfo, insureeRemark, passengerAssociation, passengerFeatures, perPaxProdKnowledge, policyDetails, premiumPerTariffPerPax, premiumPerpaxInfo, travelerDocInfo, travelerValueDetails, voucherNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassengerDetails {\n");
    
    sb.append("    dateOfBirthInfo: ").append(toIndentedString(dateOfBirthInfo)).append("\n");
    sb.append("    insureeRemark: ").append(toIndentedString(insureeRemark)).append("\n");
    sb.append("    passengerAssociation: ").append(toIndentedString(passengerAssociation)).append("\n");
    sb.append("    passengerFeatures: ").append(toIndentedString(passengerFeatures)).append("\n");
    sb.append("    perPaxProdKnowledge: ").append(toIndentedString(perPaxProdKnowledge)).append("\n");
    sb.append("    policyDetails: ").append(toIndentedString(policyDetails)).append("\n");
    sb.append("    premiumPerTariffPerPax: ").append(toIndentedString(premiumPerTariffPerPax)).append("\n");
    sb.append("    premiumPerpaxInfo: ").append(toIndentedString(premiumPerpaxInfo)).append("\n");
    sb.append("    travelerDocInfo: ").append(toIndentedString(travelerDocInfo)).append("\n");
    sb.append("    travelerValueDetails: ").append(toIndentedString(travelerValueDetails)).append("\n");
    sb.append("    voucherNumber: ").append(toIndentedString(voucherNumber)).append("\n");
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

