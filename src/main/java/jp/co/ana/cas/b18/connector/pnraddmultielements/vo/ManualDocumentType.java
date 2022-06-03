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
 * ManualDocumentType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ManualDocumentType   {
  @JsonProperty("companyId")
  private String companyId;

  @JsonProperty("lastConjuction")
  private Long lastConjuction;

  @JsonProperty("lastConjuctionCD")
  private Long lastConjuctionCD;

  @JsonProperty("ticketNumber")
  private String ticketNumber;

  @JsonProperty("ticketNumberCd")
  private Long ticketNumberCd;

  public ManualDocumentType companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  */
  @ApiModelProperty(value = "")


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public ManualDocumentType lastConjuction(Long lastConjuction) {
    this.lastConjuction = lastConjuction;
    return this;
  }

  /**
   * Get lastConjuction
   * @return lastConjuction
  */
  @ApiModelProperty(value = "")


  public Long getLastConjuction() {
    return lastConjuction;
  }

  public void setLastConjuction(Long lastConjuction) {
    this.lastConjuction = lastConjuction;
  }

  public ManualDocumentType lastConjuctionCD(Long lastConjuctionCD) {
    this.lastConjuctionCD = lastConjuctionCD;
    return this;
  }

  /**
   * Get lastConjuctionCD
   * @return lastConjuctionCD
  */
  @ApiModelProperty(value = "")


  public Long getLastConjuctionCD() {
    return lastConjuctionCD;
  }

  public void setLastConjuctionCD(Long lastConjuctionCD) {
    this.lastConjuctionCD = lastConjuctionCD;
  }

  public ManualDocumentType ticketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
    return this;
  }

  /**
   * Get ticketNumber
   * @return ticketNumber
  */
  @ApiModelProperty(value = "")


  public String getTicketNumber() {
    return ticketNumber;
  }

  public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
  }

  public ManualDocumentType ticketNumberCd(Long ticketNumberCd) {
    this.ticketNumberCd = ticketNumberCd;
    return this;
  }

  /**
   * Get ticketNumberCd
   * @return ticketNumberCd
  */
  @ApiModelProperty(value = "")


  public Long getTicketNumberCd() {
    return ticketNumberCd;
  }

  public void setTicketNumberCd(Long ticketNumberCd) {
    this.ticketNumberCd = ticketNumberCd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualDocumentType manualDocumentType = (ManualDocumentType) o;
    return Objects.equals(this.companyId, manualDocumentType.companyId) &&
        Objects.equals(this.lastConjuction, manualDocumentType.lastConjuction) &&
        Objects.equals(this.lastConjuctionCD, manualDocumentType.lastConjuctionCD) &&
        Objects.equals(this.ticketNumber, manualDocumentType.ticketNumber) &&
        Objects.equals(this.ticketNumberCd, manualDocumentType.ticketNumberCd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, lastConjuction, lastConjuctionCD, ticketNumber, ticketNumberCd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualDocumentType {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    lastConjuction: ").append(toIndentedString(lastConjuction)).append("\n");
    sb.append("    lastConjuctionCD: ").append(toIndentedString(lastConjuctionCD)).append("\n");
    sb.append("    ticketNumber: ").append(toIndentedString(ticketNumber)).append("\n");
    sb.append("    ticketNumberCd: ").append(toIndentedString(ticketNumberCd)).append("\n");
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

