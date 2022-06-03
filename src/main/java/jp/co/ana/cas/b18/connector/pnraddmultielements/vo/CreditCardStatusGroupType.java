package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AttributeType94514S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.BrowserData;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ErrorGroupType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.GenericAuthorisationResultType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.SpecificVisaLinkCreditCardInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType206505S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ThreeDomainSecureGroupType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TransactionInformationForTicketingType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditCardStatusGroupType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CreditCardStatusGroupType   {
  @JsonProperty("approvalDetails")
  private GenericAuthorisationResultType approvalDetails;

  @JsonProperty("authorisationInformation")
  private TransactionInformationForTicketingType authorisationInformation;

  @JsonProperty("authorisationSupplementaryData")
  private SpecificVisaLinkCreditCardInformationType authorisationSupplementaryData;

  @JsonProperty("browserData")
  private BrowserData browserData;

  @JsonProperty("cardSupplementaryData")
  @Valid
  private List<AttributeType94514S> cardSupplementaryData = null;

  @JsonProperty("localDateTime")
  @Valid
  private List<StructuredDateTimeInformationType206505S> localDateTime = null;

  @JsonProperty("tdsInformation")
  private ThreeDomainSecureGroupType tdsInformation;

  @JsonProperty("transactionStatus")
  @Valid
  private List<ErrorGroupType> transactionStatus = null;

  public CreditCardStatusGroupType approvalDetails(GenericAuthorisationResultType approvalDetails) {
    this.approvalDetails = approvalDetails;
    return this;
  }

  /**
   * Get approvalDetails
   * @return approvalDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public GenericAuthorisationResultType getApprovalDetails() {
    return approvalDetails;
  }

  public void setApprovalDetails(GenericAuthorisationResultType approvalDetails) {
    this.approvalDetails = approvalDetails;
  }

  public CreditCardStatusGroupType authorisationInformation(TransactionInformationForTicketingType authorisationInformation) {
    this.authorisationInformation = authorisationInformation;
    return this;
  }

  /**
   * Get authorisationInformation
   * @return authorisationInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public TransactionInformationForTicketingType getAuthorisationInformation() {
    return authorisationInformation;
  }

  public void setAuthorisationInformation(TransactionInformationForTicketingType authorisationInformation) {
    this.authorisationInformation = authorisationInformation;
  }

  public CreditCardStatusGroupType authorisationSupplementaryData(SpecificVisaLinkCreditCardInformationType authorisationSupplementaryData) {
    this.authorisationSupplementaryData = authorisationSupplementaryData;
    return this;
  }

  /**
   * Get authorisationSupplementaryData
   * @return authorisationSupplementaryData
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpecificVisaLinkCreditCardInformationType getAuthorisationSupplementaryData() {
    return authorisationSupplementaryData;
  }

  public void setAuthorisationSupplementaryData(SpecificVisaLinkCreditCardInformationType authorisationSupplementaryData) {
    this.authorisationSupplementaryData = authorisationSupplementaryData;
  }

  public CreditCardStatusGroupType browserData(BrowserData browserData) {
    this.browserData = browserData;
    return this;
  }

  /**
   * Get browserData
   * @return browserData
  */
  @ApiModelProperty(value = "")

  @Valid

  public BrowserData getBrowserData() {
    return browserData;
  }

  public void setBrowserData(BrowserData browserData) {
    this.browserData = browserData;
  }

  public CreditCardStatusGroupType cardSupplementaryData(List<AttributeType94514S> cardSupplementaryData) {
    this.cardSupplementaryData = cardSupplementaryData;
    return this;
  }

  public CreditCardStatusGroupType addCardSupplementaryDataItem(AttributeType94514S cardSupplementaryDataItem) {
    if (this.cardSupplementaryData == null) {
      this.cardSupplementaryData = new ArrayList<>();
    }
    this.cardSupplementaryData.add(cardSupplementaryDataItem);
    return this;
  }

  /**
   * Get cardSupplementaryData
   * @return cardSupplementaryData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AttributeType94514S> getCardSupplementaryData() {
    return cardSupplementaryData;
  }

  public void setCardSupplementaryData(List<AttributeType94514S> cardSupplementaryData) {
    this.cardSupplementaryData = cardSupplementaryData;
  }

  public CreditCardStatusGroupType localDateTime(List<StructuredDateTimeInformationType206505S> localDateTime) {
    this.localDateTime = localDateTime;
    return this;
  }

  public CreditCardStatusGroupType addLocalDateTimeItem(StructuredDateTimeInformationType206505S localDateTimeItem) {
    if (this.localDateTime == null) {
      this.localDateTime = new ArrayList<>();
    }
    this.localDateTime.add(localDateTimeItem);
    return this;
  }

  /**
   * Get localDateTime
   * @return localDateTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StructuredDateTimeInformationType206505S> getLocalDateTime() {
    return localDateTime;
  }

  public void setLocalDateTime(List<StructuredDateTimeInformationType206505S> localDateTime) {
    this.localDateTime = localDateTime;
  }

  public CreditCardStatusGroupType tdsInformation(ThreeDomainSecureGroupType tdsInformation) {
    this.tdsInformation = tdsInformation;
    return this;
  }

  /**
   * Get tdsInformation
   * @return tdsInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ThreeDomainSecureGroupType getTdsInformation() {
    return tdsInformation;
  }

  public void setTdsInformation(ThreeDomainSecureGroupType tdsInformation) {
    this.tdsInformation = tdsInformation;
  }

  public CreditCardStatusGroupType transactionStatus(List<ErrorGroupType> transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  public CreditCardStatusGroupType addTransactionStatusItem(ErrorGroupType transactionStatusItem) {
    if (this.transactionStatus == null) {
      this.transactionStatus = new ArrayList<>();
    }
    this.transactionStatus.add(transactionStatusItem);
    return this;
  }

  /**
   * Get transactionStatus
   * @return transactionStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ErrorGroupType> getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(List<ErrorGroupType> transactionStatus) {
    this.transactionStatus = transactionStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardStatusGroupType creditCardStatusGroupType = (CreditCardStatusGroupType) o;
    return Objects.equals(this.approvalDetails, creditCardStatusGroupType.approvalDetails) &&
        Objects.equals(this.authorisationInformation, creditCardStatusGroupType.authorisationInformation) &&
        Objects.equals(this.authorisationSupplementaryData, creditCardStatusGroupType.authorisationSupplementaryData) &&
        Objects.equals(this.browserData, creditCardStatusGroupType.browserData) &&
        Objects.equals(this.cardSupplementaryData, creditCardStatusGroupType.cardSupplementaryData) &&
        Objects.equals(this.localDateTime, creditCardStatusGroupType.localDateTime) &&
        Objects.equals(this.tdsInformation, creditCardStatusGroupType.tdsInformation) &&
        Objects.equals(this.transactionStatus, creditCardStatusGroupType.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalDetails, authorisationInformation, authorisationSupplementaryData, browserData, cardSupplementaryData, localDateTime, tdsInformation, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardStatusGroupType {\n");
    
    sb.append("    approvalDetails: ").append(toIndentedString(approvalDetails)).append("\n");
    sb.append("    authorisationInformation: ").append(toIndentedString(authorisationInformation)).append("\n");
    sb.append("    authorisationSupplementaryData: ").append(toIndentedString(authorisationSupplementaryData)).append("\n");
    sb.append("    browserData: ").append(toIndentedString(browserData)).append("\n");
    sb.append("    cardSupplementaryData: ").append(toIndentedString(cardSupplementaryData)).append("\n");
    sb.append("    localDateTime: ").append(toIndentedString(localDateTime)).append("\n");
    sb.append("    tdsInformation: ").append(toIndentedString(tdsInformation)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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

