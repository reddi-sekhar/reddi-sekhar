package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CodedAttributeType79464S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI79012S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecificDataInformationTypeI79035S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TaxTypeI79038S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.VatPropertiesGroupType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBfeesGroupType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class OBfeesGroupType   {
  @JsonProperty("carrierFee")
  private SpecificDataInformationTypeI79035S carrierFee;

  @JsonProperty("feeAmount")
  private MonetaryInformationTypeI79012S feeAmount;

  @JsonProperty("feeDescription")
  private CodedAttributeType79464S feeDescription;

  @JsonProperty("feeTax")
  @Valid
  private List<TaxTypeI79038S> feeTax = null;

  @JsonProperty("vatPropertiesGroup")
  private VatPropertiesGroupType vatPropertiesGroup;

  public OBfeesGroupType carrierFee(SpecificDataInformationTypeI79035S carrierFee) {
    this.carrierFee = carrierFee;
    return this;
  }

  /**
   * Get carrierFee
   * @return carrierFee
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecificDataInformationTypeI79035S getCarrierFee() {
    return carrierFee;
  }

  public void setCarrierFee(SpecificDataInformationTypeI79035S carrierFee) {
    this.carrierFee = carrierFee;
  }

  public OBfeesGroupType feeAmount(MonetaryInformationTypeI79012S feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Get feeAmount
   * @return feeAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI79012S getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(MonetaryInformationTypeI79012S feeAmount) {
    this.feeAmount = feeAmount;
  }

  public OBfeesGroupType feeDescription(CodedAttributeType79464S feeDescription) {
    this.feeDescription = feeDescription;
    return this;
  }

  /**
   * Get feeDescription
   * @return feeDescription
  */
  @ApiModelProperty(value = "")

  @Valid

  public CodedAttributeType79464S getFeeDescription() {
    return feeDescription;
  }

  public void setFeeDescription(CodedAttributeType79464S feeDescription) {
    this.feeDescription = feeDescription;
  }

  public OBfeesGroupType feeTax(List<TaxTypeI79038S> feeTax) {
    this.feeTax = feeTax;
    return this;
  }

  public OBfeesGroupType addFeeTaxItem(TaxTypeI79038S feeTaxItem) {
    if (this.feeTax == null) {
      this.feeTax = new ArrayList<>();
    }
    this.feeTax.add(feeTaxItem);
    return this;
  }

  /**
   * Get feeTax
   * @return feeTax
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TaxTypeI79038S> getFeeTax() {
    return feeTax;
  }

  public void setFeeTax(List<TaxTypeI79038S> feeTax) {
    this.feeTax = feeTax;
  }

  public OBfeesGroupType vatPropertiesGroup(VatPropertiesGroupType vatPropertiesGroup) {
    this.vatPropertiesGroup = vatPropertiesGroup;
    return this;
  }

  /**
   * Get vatPropertiesGroup
   * @return vatPropertiesGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public VatPropertiesGroupType getVatPropertiesGroup() {
    return vatPropertiesGroup;
  }

  public void setVatPropertiesGroup(VatPropertiesGroupType vatPropertiesGroup) {
    this.vatPropertiesGroup = vatPropertiesGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBfeesGroupType obfeesGroupType = (OBfeesGroupType) o;
    return Objects.equals(this.carrierFee, obfeesGroupType.carrierFee) &&
        Objects.equals(this.feeAmount, obfeesGroupType.feeAmount) &&
        Objects.equals(this.feeDescription, obfeesGroupType.feeDescription) &&
        Objects.equals(this.feeTax, obfeesGroupType.feeTax) &&
        Objects.equals(this.vatPropertiesGroup, obfeesGroupType.vatPropertiesGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierFee, feeAmount, feeDescription, feeTax, vatPropertiesGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBfeesGroupType {\n");
    
    sb.append("    carrierFee: ").append(toIndentedString(carrierFee)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeDescription: ").append(toIndentedString(feeDescription)).append("\n");
    sb.append("    feeTax: ").append(toIndentedString(feeTax)).append("\n");
    sb.append("    vatPropertiesGroup: ").append(toIndentedString(vatPropertiesGroup)).append("\n");
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

