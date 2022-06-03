package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormOfPaymentInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FormOfPaymentInformationType   {
  @JsonProperty("fopBillingCode")
  private String fopBillingCode;

  @JsonProperty("fopCode")
  private String fopCode;

  @JsonProperty("fopEdiCode")
  private String fopEdiCode;

  @JsonProperty("fopElecTicketingCode")
  private String fopElecTicketingCode;

  @JsonProperty("fopMapTable")
  private String fopMapTable;

  @JsonProperty("fopPrintedCode")
  private String fopPrintedCode;

  @JsonProperty("fopReportingCode")
  private String fopReportingCode;

  @JsonProperty("fopStatus")
  private String fopStatus;

  public FormOfPaymentInformationType fopBillingCode(String fopBillingCode) {
    this.fopBillingCode = fopBillingCode;
    return this;
  }

  /**
   * Get fopBillingCode
   * @return fopBillingCode
  */
  @ApiModelProperty(value = "")


  public String getFopBillingCode() {
    return fopBillingCode;
  }

  public void setFopBillingCode(String fopBillingCode) {
    this.fopBillingCode = fopBillingCode;
  }

  public FormOfPaymentInformationType fopCode(String fopCode) {
    this.fopCode = fopCode;
    return this;
  }

  /**
   * Get fopCode
   * @return fopCode
  */
  @ApiModelProperty(value = "")


  public String getFopCode() {
    return fopCode;
  }

  public void setFopCode(String fopCode) {
    this.fopCode = fopCode;
  }

  public FormOfPaymentInformationType fopEdiCode(String fopEdiCode) {
    this.fopEdiCode = fopEdiCode;
    return this;
  }

  /**
   * Get fopEdiCode
   * @return fopEdiCode
  */
  @ApiModelProperty(value = "")


  public String getFopEdiCode() {
    return fopEdiCode;
  }

  public void setFopEdiCode(String fopEdiCode) {
    this.fopEdiCode = fopEdiCode;
  }

  public FormOfPaymentInformationType fopElecTicketingCode(String fopElecTicketingCode) {
    this.fopElecTicketingCode = fopElecTicketingCode;
    return this;
  }

  /**
   * Get fopElecTicketingCode
   * @return fopElecTicketingCode
  */
  @ApiModelProperty(value = "")


  public String getFopElecTicketingCode() {
    return fopElecTicketingCode;
  }

  public void setFopElecTicketingCode(String fopElecTicketingCode) {
    this.fopElecTicketingCode = fopElecTicketingCode;
  }

  public FormOfPaymentInformationType fopMapTable(String fopMapTable) {
    this.fopMapTable = fopMapTable;
    return this;
  }

  /**
   * Get fopMapTable
   * @return fopMapTable
  */
  @ApiModelProperty(value = "")


  public String getFopMapTable() {
    return fopMapTable;
  }

  public void setFopMapTable(String fopMapTable) {
    this.fopMapTable = fopMapTable;
  }

  public FormOfPaymentInformationType fopPrintedCode(String fopPrintedCode) {
    this.fopPrintedCode = fopPrintedCode;
    return this;
  }

  /**
   * Get fopPrintedCode
   * @return fopPrintedCode
  */
  @ApiModelProperty(value = "")


  public String getFopPrintedCode() {
    return fopPrintedCode;
  }

  public void setFopPrintedCode(String fopPrintedCode) {
    this.fopPrintedCode = fopPrintedCode;
  }

  public FormOfPaymentInformationType fopReportingCode(String fopReportingCode) {
    this.fopReportingCode = fopReportingCode;
    return this;
  }

  /**
   * Get fopReportingCode
   * @return fopReportingCode
  */
  @ApiModelProperty(value = "")


  public String getFopReportingCode() {
    return fopReportingCode;
  }

  public void setFopReportingCode(String fopReportingCode) {
    this.fopReportingCode = fopReportingCode;
  }

  public FormOfPaymentInformationType fopStatus(String fopStatus) {
    this.fopStatus = fopStatus;
    return this;
  }

  /**
   * Get fopStatus
   * @return fopStatus
  */
  @ApiModelProperty(value = "")


  public String getFopStatus() {
    return fopStatus;
  }

  public void setFopStatus(String fopStatus) {
    this.fopStatus = fopStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormOfPaymentInformationType formOfPaymentInformationType = (FormOfPaymentInformationType) o;
    return Objects.equals(this.fopBillingCode, formOfPaymentInformationType.fopBillingCode) &&
        Objects.equals(this.fopCode, formOfPaymentInformationType.fopCode) &&
        Objects.equals(this.fopEdiCode, formOfPaymentInformationType.fopEdiCode) &&
        Objects.equals(this.fopElecTicketingCode, formOfPaymentInformationType.fopElecTicketingCode) &&
        Objects.equals(this.fopMapTable, formOfPaymentInformationType.fopMapTable) &&
        Objects.equals(this.fopPrintedCode, formOfPaymentInformationType.fopPrintedCode) &&
        Objects.equals(this.fopReportingCode, formOfPaymentInformationType.fopReportingCode) &&
        Objects.equals(this.fopStatus, formOfPaymentInformationType.fopStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fopBillingCode, fopCode, fopEdiCode, fopElecTicketingCode, fopMapTable, fopPrintedCode, fopReportingCode, fopStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormOfPaymentInformationType {\n");
    
    sb.append("    fopBillingCode: ").append(toIndentedString(fopBillingCode)).append("\n");
    sb.append("    fopCode: ").append(toIndentedString(fopCode)).append("\n");
    sb.append("    fopEdiCode: ").append(toIndentedString(fopEdiCode)).append("\n");
    sb.append("    fopElecTicketingCode: ").append(toIndentedString(fopElecTicketingCode)).append("\n");
    sb.append("    fopMapTable: ").append(toIndentedString(fopMapTable)).append("\n");
    sb.append("    fopPrintedCode: ").append(toIndentedString(fopPrintedCode)).append("\n");
    sb.append("    fopReportingCode: ").append(toIndentedString(fopReportingCode)).append("\n");
    sb.append("    fopStatus: ").append(toIndentedString(fopStatus)).append("\n");
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

