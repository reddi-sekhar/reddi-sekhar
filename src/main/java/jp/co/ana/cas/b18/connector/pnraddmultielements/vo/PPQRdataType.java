package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DiscountInformationType94068S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DocumentDetailsGroup;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemReferencesAndVersionsType94069S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInformationType65487S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInformationTypeI79009S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PPQRdataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PPQRdataType   {
  @JsonProperty("documentDetailsGroup")
  private DocumentDetailsGroup documentDetailsGroup;

  @JsonProperty("fareIds")
  @Valid
  private List<ReferenceInformationTypeI79009S> fareIds = null;

  @JsonProperty("passengerTattoos")
  @Valid
  private List<ReferenceInformationType65487S> passengerTattoos = null;

  @JsonProperty("pricingRecordId")
  private ItemReferencesAndVersionsType94069S pricingRecordId;

  @JsonProperty("ptcDiscountCode")
  @Valid
  private List<DiscountInformationType94068S> ptcDiscountCode = null;

  public PPQRdataType documentDetailsGroup(DocumentDetailsGroup documentDetailsGroup) {
    this.documentDetailsGroup = documentDetailsGroup;
    return this;
  }

  /**
   * Get documentDetailsGroup
   * @return documentDetailsGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public DocumentDetailsGroup getDocumentDetailsGroup() {
    return documentDetailsGroup;
  }

  public void setDocumentDetailsGroup(DocumentDetailsGroup documentDetailsGroup) {
    this.documentDetailsGroup = documentDetailsGroup;
  }

  public PPQRdataType fareIds(List<ReferenceInformationTypeI79009S> fareIds) {
    this.fareIds = fareIds;
    return this;
  }

  public PPQRdataType addFareIdsItem(ReferenceInformationTypeI79009S fareIdsItem) {
    if (this.fareIds == null) {
      this.fareIds = new ArrayList<>();
    }
    this.fareIds.add(fareIdsItem);
    return this;
  }

  /**
   * Get fareIds
   * @return fareIds
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReferenceInformationTypeI79009S> getFareIds() {
    return fareIds;
  }

  public void setFareIds(List<ReferenceInformationTypeI79009S> fareIds) {
    this.fareIds = fareIds;
  }

  public PPQRdataType passengerTattoos(List<ReferenceInformationType65487S> passengerTattoos) {
    this.passengerTattoos = passengerTattoos;
    return this;
  }

  public PPQRdataType addPassengerTattoosItem(ReferenceInformationType65487S passengerTattoosItem) {
    if (this.passengerTattoos == null) {
      this.passengerTattoos = new ArrayList<>();
    }
    this.passengerTattoos.add(passengerTattoosItem);
    return this;
  }

  /**
   * Get passengerTattoos
   * @return passengerTattoos
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReferenceInformationType65487S> getPassengerTattoos() {
    return passengerTattoos;
  }

  public void setPassengerTattoos(List<ReferenceInformationType65487S> passengerTattoos) {
    this.passengerTattoos = passengerTattoos;
  }

  public PPQRdataType pricingRecordId(ItemReferencesAndVersionsType94069S pricingRecordId) {
    this.pricingRecordId = pricingRecordId;
    return this;
  }

  /**
   * Get pricingRecordId
   * @return pricingRecordId
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemReferencesAndVersionsType94069S getPricingRecordId() {
    return pricingRecordId;
  }

  public void setPricingRecordId(ItemReferencesAndVersionsType94069S pricingRecordId) {
    this.pricingRecordId = pricingRecordId;
  }

  public PPQRdataType ptcDiscountCode(List<DiscountInformationType94068S> ptcDiscountCode) {
    this.ptcDiscountCode = ptcDiscountCode;
    return this;
  }

  public PPQRdataType addPtcDiscountCodeItem(DiscountInformationType94068S ptcDiscountCodeItem) {
    if (this.ptcDiscountCode == null) {
      this.ptcDiscountCode = new ArrayList<>();
    }
    this.ptcDiscountCode.add(ptcDiscountCodeItem);
    return this;
  }

  /**
   * Get ptcDiscountCode
   * @return ptcDiscountCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DiscountInformationType94068S> getPtcDiscountCode() {
    return ptcDiscountCode;
  }

  public void setPtcDiscountCode(List<DiscountInformationType94068S> ptcDiscountCode) {
    this.ptcDiscountCode = ptcDiscountCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PPQRdataType ppQRdataType = (PPQRdataType) o;
    return Objects.equals(this.documentDetailsGroup, ppQRdataType.documentDetailsGroup) &&
        Objects.equals(this.fareIds, ppQRdataType.fareIds) &&
        Objects.equals(this.passengerTattoos, ppQRdataType.passengerTattoos) &&
        Objects.equals(this.pricingRecordId, ppQRdataType.pricingRecordId) &&
        Objects.equals(this.ptcDiscountCode, ppQRdataType.ptcDiscountCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentDetailsGroup, fareIds, passengerTattoos, pricingRecordId, ptcDiscountCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PPQRdataType {\n");
    
    sb.append("    documentDetailsGroup: ").append(toIndentedString(documentDetailsGroup)).append("\n");
    sb.append("    fareIds: ").append(toIndentedString(fareIds)).append("\n");
    sb.append("    passengerTattoos: ").append(toIndentedString(passengerTattoos)).append("\n");
    sb.append("    pricingRecordId: ").append(toIndentedString(pricingRecordId)).append("\n");
    sb.append("    ptcDiscountCode: ").append(toIndentedString(ptcDiscountCode)).append("\n");
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

