package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PPQRdataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PricingTicketingDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PricingRecordGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PricingRecordGroup   {
  @JsonProperty("pricingRecordData")
  private PricingTicketingDetailsType pricingRecordData;

  @JsonProperty("productPricingQuotationRecord")
  @Valid
  private List<PPQRdataType> productPricingQuotationRecord = null;

  public PricingRecordGroup pricingRecordData(PricingTicketingDetailsType pricingRecordData) {
    this.pricingRecordData = pricingRecordData;
    return this;
  }

  /**
   * Get pricingRecordData
   * @return pricingRecordData
  */
  @ApiModelProperty(value = "")

  @Valid

  public PricingTicketingDetailsType getPricingRecordData() {
    return pricingRecordData;
  }

  public void setPricingRecordData(PricingTicketingDetailsType pricingRecordData) {
    this.pricingRecordData = pricingRecordData;
  }

  public PricingRecordGroup productPricingQuotationRecord(List<PPQRdataType> productPricingQuotationRecord) {
    this.productPricingQuotationRecord = productPricingQuotationRecord;
    return this;
  }

  public PricingRecordGroup addProductPricingQuotationRecordItem(PPQRdataType productPricingQuotationRecordItem) {
    if (this.productPricingQuotationRecord == null) {
      this.productPricingQuotationRecord = new ArrayList<>();
    }
    this.productPricingQuotationRecord.add(productPricingQuotationRecordItem);
    return this;
  }

  /**
   * Get productPricingQuotationRecord
   * @return productPricingQuotationRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PPQRdataType> getProductPricingQuotationRecord() {
    return productPricingQuotationRecord;
  }

  public void setProductPricingQuotationRecord(List<PPQRdataType> productPricingQuotationRecord) {
    this.productPricingQuotationRecord = productPricingQuotationRecord;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingRecordGroup pricingRecordGroup = (PricingRecordGroup) o;
    return Objects.equals(this.pricingRecordData, pricingRecordGroup.pricingRecordData) &&
        Objects.equals(this.productPricingQuotationRecord, pricingRecordGroup.productPricingQuotationRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricingRecordData, productPricingQuotationRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingRecordGroup {\n");
    
    sb.append("    pricingRecordData: ").append(toIndentedString(pricingRecordData)).append("\n");
    sb.append("    productPricingQuotationRecord: ").append(toIndentedString(productPricingQuotationRecord)).append("\n");
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

