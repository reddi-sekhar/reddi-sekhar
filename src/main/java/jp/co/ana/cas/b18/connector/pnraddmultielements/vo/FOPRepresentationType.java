package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType94495S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PNRSupplementaryDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PaymentGroupType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SequenceDetailsTypeU94494S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TicketingFormOfPaymentType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FOPRepresentationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FOPRepresentationType   {
  @JsonProperty("fopFreeflow")
  private FreeTextInformationType94495S fopFreeflow;

  @JsonProperty("fopPNRDetails")
  private TicketingFormOfPaymentType fopPNRDetails;

  @JsonProperty("fopSequenceNumber")
  private SequenceDetailsTypeU94494S fopSequenceNumber;

  @JsonProperty("paymentModule")
  private PaymentGroupType paymentModule;

  @JsonProperty("pnrSupplementaryData")
  @Valid
  private List<PNRSupplementaryDataType> pnrSupplementaryData = null;

  public FOPRepresentationType fopFreeflow(FreeTextInformationType94495S fopFreeflow) {
    this.fopFreeflow = fopFreeflow;
    return this;
  }

  /**
   * Get fopFreeflow
   * @return fopFreeflow
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType94495S getFopFreeflow() {
    return fopFreeflow;
  }

  public void setFopFreeflow(FreeTextInformationType94495S fopFreeflow) {
    this.fopFreeflow = fopFreeflow;
  }

  public FOPRepresentationType fopPNRDetails(TicketingFormOfPaymentType fopPNRDetails) {
    this.fopPNRDetails = fopPNRDetails;
    return this;
  }

  /**
   * Get fopPNRDetails
   * @return fopPNRDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TicketingFormOfPaymentType getFopPNRDetails() {
    return fopPNRDetails;
  }

  public void setFopPNRDetails(TicketingFormOfPaymentType fopPNRDetails) {
    this.fopPNRDetails = fopPNRDetails;
  }

  public FOPRepresentationType fopSequenceNumber(SequenceDetailsTypeU94494S fopSequenceNumber) {
    this.fopSequenceNumber = fopSequenceNumber;
    return this;
  }

  /**
   * Get fopSequenceNumber
   * @return fopSequenceNumber
  */
  @ApiModelProperty(value = "")

  @Valid

  public SequenceDetailsTypeU94494S getFopSequenceNumber() {
    return fopSequenceNumber;
  }

  public void setFopSequenceNumber(SequenceDetailsTypeU94494S fopSequenceNumber) {
    this.fopSequenceNumber = fopSequenceNumber;
  }

  public FOPRepresentationType paymentModule(PaymentGroupType paymentModule) {
    this.paymentModule = paymentModule;
    return this;
  }

  /**
   * Get paymentModule
   * @return paymentModule
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaymentGroupType getPaymentModule() {
    return paymentModule;
  }

  public void setPaymentModule(PaymentGroupType paymentModule) {
    this.paymentModule = paymentModule;
  }

  public FOPRepresentationType pnrSupplementaryData(List<PNRSupplementaryDataType> pnrSupplementaryData) {
    this.pnrSupplementaryData = pnrSupplementaryData;
    return this;
  }

  public FOPRepresentationType addPnrSupplementaryDataItem(PNRSupplementaryDataType pnrSupplementaryDataItem) {
    if (this.pnrSupplementaryData == null) {
      this.pnrSupplementaryData = new ArrayList<>();
    }
    this.pnrSupplementaryData.add(pnrSupplementaryDataItem);
    return this;
  }

  /**
   * Get pnrSupplementaryData
   * @return pnrSupplementaryData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PNRSupplementaryDataType> getPnrSupplementaryData() {
    return pnrSupplementaryData;
  }

  public void setPnrSupplementaryData(List<PNRSupplementaryDataType> pnrSupplementaryData) {
    this.pnrSupplementaryData = pnrSupplementaryData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FOPRepresentationType foPRepresentationType = (FOPRepresentationType) o;
    return Objects.equals(this.fopFreeflow, foPRepresentationType.fopFreeflow) &&
        Objects.equals(this.fopPNRDetails, foPRepresentationType.fopPNRDetails) &&
        Objects.equals(this.fopSequenceNumber, foPRepresentationType.fopSequenceNumber) &&
        Objects.equals(this.paymentModule, foPRepresentationType.paymentModule) &&
        Objects.equals(this.pnrSupplementaryData, foPRepresentationType.pnrSupplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fopFreeflow, fopPNRDetails, fopSequenceNumber, paymentModule, pnrSupplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FOPRepresentationType {\n");
    
    sb.append("    fopFreeflow: ").append(toIndentedString(fopFreeflow)).append("\n");
    sb.append("    fopPNRDetails: ").append(toIndentedString(fopPNRDetails)).append("\n");
    sb.append("    fopSequenceNumber: ").append(toIndentedString(fopSequenceNumber)).append("\n");
    sb.append("    paymentModule: ").append(toIndentedString(paymentModule)).append("\n");
    sb.append("    pnrSupplementaryData: ").append(toIndentedString(pnrSupplementaryData)).append("\n");
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

