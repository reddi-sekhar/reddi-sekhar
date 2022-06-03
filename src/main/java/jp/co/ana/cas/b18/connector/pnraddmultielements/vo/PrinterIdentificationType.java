package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PrinterIdentificationDetailsType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PrinterIdentificationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class PrinterIdentificationType   {
  @JsonProperty("identifierDetail")
  private PrinterIdentificationDetailsType identifierDetail;

  @JsonProperty("office")
  private String office;

  @JsonProperty("teletypeAddress")
  private String teletypeAddress;

  public PrinterIdentificationType identifierDetail(PrinterIdentificationDetailsType identifierDetail) {
    this.identifierDetail = identifierDetail;
    return this;
  }

  /**
   * Get identifierDetail
   * @return identifierDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public PrinterIdentificationDetailsType getIdentifierDetail() {
    return identifierDetail;
  }

  public void setIdentifierDetail(PrinterIdentificationDetailsType identifierDetail) {
    this.identifierDetail = identifierDetail;
  }

  public PrinterIdentificationType office(String office) {
    this.office = office;
    return this;
  }

  /**
   * Get office
   * @return office
  */
  @ApiModelProperty(value = "")


  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public PrinterIdentificationType teletypeAddress(String teletypeAddress) {
    this.teletypeAddress = teletypeAddress;
    return this;
  }

  /**
   * Get teletypeAddress
   * @return teletypeAddress
  */
  @ApiModelProperty(value = "")


  public String getTeletypeAddress() {
    return teletypeAddress;
  }

  public void setTeletypeAddress(String teletypeAddress) {
    this.teletypeAddress = teletypeAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrinterIdentificationType printerIdentificationType = (PrinterIdentificationType) o;
    return Objects.equals(this.identifierDetail, printerIdentificationType.identifierDetail) &&
        Objects.equals(this.office, printerIdentificationType.office) &&
        Objects.equals(this.teletypeAddress, printerIdentificationType.teletypeAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifierDetail, office, teletypeAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrinterIdentificationType {\n");
    
    sb.append("    identifierDetail: ").append(toIndentedString(identifierDetail)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    teletypeAddress: ").append(toIndentedString(teletypeAddress)).append("\n");
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

