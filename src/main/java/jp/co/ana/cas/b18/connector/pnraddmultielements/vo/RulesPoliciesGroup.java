package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType136708S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.OtherRulesGroup;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PickupDropoffLocation;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SelectionDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecialEquipmentDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TaxCovSurchargeGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RulesPoliciesGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class RulesPoliciesGroup   {
  @JsonProperty("dummy1")
  private Object dummy1;

  @JsonProperty("otherRulesGroup")
  @Valid
  private List<OtherRulesGroup> otherRulesGroup = null;

  @JsonProperty("pickupDropoffLocation")
  @Valid
  private List<PickupDropoffLocation> pickupDropoffLocation = null;

  @JsonProperty("remarks")
  private FreeTextInformationType136708S remarks;

  @JsonProperty("sourceLevel")
  private SelectionDetailsTypeI sourceLevel;

  @JsonProperty("specialEquipmentDetails")
  @Valid
  private List<SpecialEquipmentDetails> specialEquipmentDetails = null;

  @JsonProperty("taxCovSurchargeGroup")
  @Valid
  private List<TaxCovSurchargeGroup> taxCovSurchargeGroup = null;

  public RulesPoliciesGroup dummy1(Object dummy1) {
    this.dummy1 = dummy1;
    return this;
  }

  /**
   * Get dummy1
   * @return dummy1
  */
  @ApiModelProperty(value = "")


  public Object getDummy1() {
    return dummy1;
  }

  public void setDummy1(Object dummy1) {
    this.dummy1 = dummy1;
  }

  public RulesPoliciesGroup otherRulesGroup(List<OtherRulesGroup> otherRulesGroup) {
    this.otherRulesGroup = otherRulesGroup;
    return this;
  }

  public RulesPoliciesGroup addOtherRulesGroupItem(OtherRulesGroup otherRulesGroupItem) {
    if (this.otherRulesGroup == null) {
      this.otherRulesGroup = new ArrayList<>();
    }
    this.otherRulesGroup.add(otherRulesGroupItem);
    return this;
  }

  /**
   * Get otherRulesGroup
   * @return otherRulesGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OtherRulesGroup> getOtherRulesGroup() {
    return otherRulesGroup;
  }

  public void setOtherRulesGroup(List<OtherRulesGroup> otherRulesGroup) {
    this.otherRulesGroup = otherRulesGroup;
  }

  public RulesPoliciesGroup pickupDropoffLocation(List<PickupDropoffLocation> pickupDropoffLocation) {
    this.pickupDropoffLocation = pickupDropoffLocation;
    return this;
  }

  public RulesPoliciesGroup addPickupDropoffLocationItem(PickupDropoffLocation pickupDropoffLocationItem) {
    if (this.pickupDropoffLocation == null) {
      this.pickupDropoffLocation = new ArrayList<>();
    }
    this.pickupDropoffLocation.add(pickupDropoffLocationItem);
    return this;
  }

  /**
   * Get pickupDropoffLocation
   * @return pickupDropoffLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PickupDropoffLocation> getPickupDropoffLocation() {
    return pickupDropoffLocation;
  }

  public void setPickupDropoffLocation(List<PickupDropoffLocation> pickupDropoffLocation) {
    this.pickupDropoffLocation = pickupDropoffLocation;
  }

  public RulesPoliciesGroup remarks(FreeTextInformationType136708S remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Get remarks
   * @return remarks
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType136708S getRemarks() {
    return remarks;
  }

  public void setRemarks(FreeTextInformationType136708S remarks) {
    this.remarks = remarks;
  }

  public RulesPoliciesGroup sourceLevel(SelectionDetailsTypeI sourceLevel) {
    this.sourceLevel = sourceLevel;
    return this;
  }

  /**
   * Get sourceLevel
   * @return sourceLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public SelectionDetailsTypeI getSourceLevel() {
    return sourceLevel;
  }

  public void setSourceLevel(SelectionDetailsTypeI sourceLevel) {
    this.sourceLevel = sourceLevel;
  }

  public RulesPoliciesGroup specialEquipmentDetails(List<SpecialEquipmentDetails> specialEquipmentDetails) {
    this.specialEquipmentDetails = specialEquipmentDetails;
    return this;
  }

  public RulesPoliciesGroup addSpecialEquipmentDetailsItem(SpecialEquipmentDetails specialEquipmentDetailsItem) {
    if (this.specialEquipmentDetails == null) {
      this.specialEquipmentDetails = new ArrayList<>();
    }
    this.specialEquipmentDetails.add(specialEquipmentDetailsItem);
    return this;
  }

  /**
   * Get specialEquipmentDetails
   * @return specialEquipmentDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SpecialEquipmentDetails> getSpecialEquipmentDetails() {
    return specialEquipmentDetails;
  }

  public void setSpecialEquipmentDetails(List<SpecialEquipmentDetails> specialEquipmentDetails) {
    this.specialEquipmentDetails = specialEquipmentDetails;
  }

  public RulesPoliciesGroup taxCovSurchargeGroup(List<TaxCovSurchargeGroup> taxCovSurchargeGroup) {
    this.taxCovSurchargeGroup = taxCovSurchargeGroup;
    return this;
  }

  public RulesPoliciesGroup addTaxCovSurchargeGroupItem(TaxCovSurchargeGroup taxCovSurchargeGroupItem) {
    if (this.taxCovSurchargeGroup == null) {
      this.taxCovSurchargeGroup = new ArrayList<>();
    }
    this.taxCovSurchargeGroup.add(taxCovSurchargeGroupItem);
    return this;
  }

  /**
   * Get taxCovSurchargeGroup
   * @return taxCovSurchargeGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TaxCovSurchargeGroup> getTaxCovSurchargeGroup() {
    return taxCovSurchargeGroup;
  }

  public void setTaxCovSurchargeGroup(List<TaxCovSurchargeGroup> taxCovSurchargeGroup) {
    this.taxCovSurchargeGroup = taxCovSurchargeGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulesPoliciesGroup rulesPoliciesGroup = (RulesPoliciesGroup) o;
    return Objects.equals(this.dummy1, rulesPoliciesGroup.dummy1) &&
        Objects.equals(this.otherRulesGroup, rulesPoliciesGroup.otherRulesGroup) &&
        Objects.equals(this.pickupDropoffLocation, rulesPoliciesGroup.pickupDropoffLocation) &&
        Objects.equals(this.remarks, rulesPoliciesGroup.remarks) &&
        Objects.equals(this.sourceLevel, rulesPoliciesGroup.sourceLevel) &&
        Objects.equals(this.specialEquipmentDetails, rulesPoliciesGroup.specialEquipmentDetails) &&
        Objects.equals(this.taxCovSurchargeGroup, rulesPoliciesGroup.taxCovSurchargeGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dummy1, otherRulesGroup, pickupDropoffLocation, remarks, sourceLevel, specialEquipmentDetails, taxCovSurchargeGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesPoliciesGroup {\n");
    
    sb.append("    dummy1: ").append(toIndentedString(dummy1)).append("\n");
    sb.append("    otherRulesGroup: ").append(toIndentedString(otherRulesGroup)).append("\n");
    sb.append("    pickupDropoffLocation: ").append(toIndentedString(pickupDropoffLocation)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    sourceLevel: ").append(toIndentedString(sourceLevel)).append("\n");
    sb.append("    specialEquipmentDetails: ").append(toIndentedString(specialEquipmentDetails)).append("\n");
    sb.append("    taxCovSurchargeGroup: ").append(toIndentedString(taxCovSurchargeGroup)).append("\n");
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

