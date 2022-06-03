package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IssueInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class IssueInformationType   {
  @JsonProperty("airlineCode")
  private String airlineCode;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("cityCode")
  private String cityCode;

  @JsonProperty("coupon1")
  private String coupon1;

  @JsonProperty("coupon2")
  private String coupon2;

  @JsonProperty("coupon3")
  private String coupon3;

  @JsonProperty("coupon4")
  private String coupon4;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("dateOfIssue")
  private String dateOfIssue;

  @JsonProperty("documentCD")
  private Long documentCD;

  @JsonProperty("documentNumber")
  private String documentNumber;

  @JsonProperty("exchangeDocumentCD")
  private Long exchangeDocumentCD;

  @JsonProperty("iataNumber")
  private String iataNumber;

  @JsonProperty("lastConjunction")
  private Long lastConjunction;

  @JsonProperty("lastConjunction1")
  private String lastConjunction1;

  @JsonProperty("lastConjunction2")
  private String lastConjunction2;

  @JsonProperty("lastConjunction3")
  private String lastConjunction3;

  @JsonProperty("lastConjunction4")
  private String lastConjunction4;

  public IssueInformationType airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

  /**
   * Get airlineCode
   * @return airlineCode
  */
  @ApiModelProperty(value = "")


  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public IssueInformationType amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public IssueInformationType cityCode(String cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * Get cityCode
   * @return cityCode
  */
  @ApiModelProperty(value = "")


  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public IssueInformationType coupon1(String coupon1) {
    this.coupon1 = coupon1;
    return this;
  }

  /**
   * Get coupon1
   * @return coupon1
  */
  @ApiModelProperty(value = "")


  public String getCoupon1() {
    return coupon1;
  }

  public void setCoupon1(String coupon1) {
    this.coupon1 = coupon1;
  }

  public IssueInformationType coupon2(String coupon2) {
    this.coupon2 = coupon2;
    return this;
  }

  /**
   * Get coupon2
   * @return coupon2
  */
  @ApiModelProperty(value = "")


  public String getCoupon2() {
    return coupon2;
  }

  public void setCoupon2(String coupon2) {
    this.coupon2 = coupon2;
  }

  public IssueInformationType coupon3(String coupon3) {
    this.coupon3 = coupon3;
    return this;
  }

  /**
   * Get coupon3
   * @return coupon3
  */
  @ApiModelProperty(value = "")


  public String getCoupon3() {
    return coupon3;
  }

  public void setCoupon3(String coupon3) {
    this.coupon3 = coupon3;
  }

  public IssueInformationType coupon4(String coupon4) {
    this.coupon4 = coupon4;
    return this;
  }

  /**
   * Get coupon4
   * @return coupon4
  */
  @ApiModelProperty(value = "")


  public String getCoupon4() {
    return coupon4;
  }

  public void setCoupon4(String coupon4) {
    this.coupon4 = coupon4;
  }

  public IssueInformationType currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public IssueInformationType dateOfIssue(String dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

  /**
   * Get dateOfIssue
   * @return dateOfIssue
  */
  @ApiModelProperty(value = "")


  public String getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(String dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public IssueInformationType documentCD(Long documentCD) {
    this.documentCD = documentCD;
    return this;
  }

  /**
   * Get documentCD
   * @return documentCD
  */
  @ApiModelProperty(value = "")


  public Long getDocumentCD() {
    return documentCD;
  }

  public void setDocumentCD(Long documentCD) {
    this.documentCD = documentCD;
  }

  public IssueInformationType documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Get documentNumber
   * @return documentNumber
  */
  @ApiModelProperty(value = "")


  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public IssueInformationType exchangeDocumentCD(Long exchangeDocumentCD) {
    this.exchangeDocumentCD = exchangeDocumentCD;
    return this;
  }

  /**
   * Get exchangeDocumentCD
   * @return exchangeDocumentCD
  */
  @ApiModelProperty(value = "")


  public Long getExchangeDocumentCD() {
    return exchangeDocumentCD;
  }

  public void setExchangeDocumentCD(Long exchangeDocumentCD) {
    this.exchangeDocumentCD = exchangeDocumentCD;
  }

  public IssueInformationType iataNumber(String iataNumber) {
    this.iataNumber = iataNumber;
    return this;
  }

  /**
   * Get iataNumber
   * @return iataNumber
  */
  @ApiModelProperty(value = "")


  public String getIataNumber() {
    return iataNumber;
  }

  public void setIataNumber(String iataNumber) {
    this.iataNumber = iataNumber;
  }

  public IssueInformationType lastConjunction(Long lastConjunction) {
    this.lastConjunction = lastConjunction;
    return this;
  }

  /**
   * Get lastConjunction
   * @return lastConjunction
  */
  @ApiModelProperty(value = "")


  public Long getLastConjunction() {
    return lastConjunction;
  }

  public void setLastConjunction(Long lastConjunction) {
    this.lastConjunction = lastConjunction;
  }

  public IssueInformationType lastConjunction1(String lastConjunction1) {
    this.lastConjunction1 = lastConjunction1;
    return this;
  }

  /**
   * Get lastConjunction1
   * @return lastConjunction1
  */
  @ApiModelProperty(value = "")


  public String getLastConjunction1() {
    return lastConjunction1;
  }

  public void setLastConjunction1(String lastConjunction1) {
    this.lastConjunction1 = lastConjunction1;
  }

  public IssueInformationType lastConjunction2(String lastConjunction2) {
    this.lastConjunction2 = lastConjunction2;
    return this;
  }

  /**
   * Get lastConjunction2
   * @return lastConjunction2
  */
  @ApiModelProperty(value = "")


  public String getLastConjunction2() {
    return lastConjunction2;
  }

  public void setLastConjunction2(String lastConjunction2) {
    this.lastConjunction2 = lastConjunction2;
  }

  public IssueInformationType lastConjunction3(String lastConjunction3) {
    this.lastConjunction3 = lastConjunction3;
    return this;
  }

  /**
   * Get lastConjunction3
   * @return lastConjunction3
  */
  @ApiModelProperty(value = "")


  public String getLastConjunction3() {
    return lastConjunction3;
  }

  public void setLastConjunction3(String lastConjunction3) {
    this.lastConjunction3 = lastConjunction3;
  }

  public IssueInformationType lastConjunction4(String lastConjunction4) {
    this.lastConjunction4 = lastConjunction4;
    return this;
  }

  /**
   * Get lastConjunction4
   * @return lastConjunction4
  */
  @ApiModelProperty(value = "")


  public String getLastConjunction4() {
    return lastConjunction4;
  }

  public void setLastConjunction4(String lastConjunction4) {
    this.lastConjunction4 = lastConjunction4;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueInformationType issueInformationType = (IssueInformationType) o;
    return Objects.equals(this.airlineCode, issueInformationType.airlineCode) &&
        Objects.equals(this.amount, issueInformationType.amount) &&
        Objects.equals(this.cityCode, issueInformationType.cityCode) &&
        Objects.equals(this.coupon1, issueInformationType.coupon1) &&
        Objects.equals(this.coupon2, issueInformationType.coupon2) &&
        Objects.equals(this.coupon3, issueInformationType.coupon3) &&
        Objects.equals(this.coupon4, issueInformationType.coupon4) &&
        Objects.equals(this.currency, issueInformationType.currency) &&
        Objects.equals(this.dateOfIssue, issueInformationType.dateOfIssue) &&
        Objects.equals(this.documentCD, issueInformationType.documentCD) &&
        Objects.equals(this.documentNumber, issueInformationType.documentNumber) &&
        Objects.equals(this.exchangeDocumentCD, issueInformationType.exchangeDocumentCD) &&
        Objects.equals(this.iataNumber, issueInformationType.iataNumber) &&
        Objects.equals(this.lastConjunction, issueInformationType.lastConjunction) &&
        Objects.equals(this.lastConjunction1, issueInformationType.lastConjunction1) &&
        Objects.equals(this.lastConjunction2, issueInformationType.lastConjunction2) &&
        Objects.equals(this.lastConjunction3, issueInformationType.lastConjunction3) &&
        Objects.equals(this.lastConjunction4, issueInformationType.lastConjunction4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineCode, amount, cityCode, coupon1, coupon2, coupon3, coupon4, currency, dateOfIssue, documentCD, documentNumber, exchangeDocumentCD, iataNumber, lastConjunction, lastConjunction1, lastConjunction2, lastConjunction3, lastConjunction4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueInformationType {\n");
    
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    coupon1: ").append(toIndentedString(coupon1)).append("\n");
    sb.append("    coupon2: ").append(toIndentedString(coupon2)).append("\n");
    sb.append("    coupon3: ").append(toIndentedString(coupon3)).append("\n");
    sb.append("    coupon4: ").append(toIndentedString(coupon4)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
    sb.append("    documentCD: ").append(toIndentedString(documentCD)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    exchangeDocumentCD: ").append(toIndentedString(exchangeDocumentCD)).append("\n");
    sb.append("    iataNumber: ").append(toIndentedString(iataNumber)).append("\n");
    sb.append("    lastConjunction: ").append(toIndentedString(lastConjunction)).append("\n");
    sb.append("    lastConjunction1: ").append(toIndentedString(lastConjunction1)).append("\n");
    sb.append("    lastConjunction2: ").append(toIndentedString(lastConjunction2)).append("\n");
    sb.append("    lastConjunction3: ").append(toIndentedString(lastConjunction3)).append("\n");
    sb.append("    lastConjunction4: ").append(toIndentedString(lastConjunction4)).append("\n");
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

