package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CreditCardType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TravellerInsuranceInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TravellerInsuranceInformationType   {
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("creditCardDetails")
  @Valid
  private List<CreditCardType> creditCardDetails = null;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("fareType")
  private String fareType;

  @JsonProperty("futureAmount")
  private BigDecimal futureAmount;

  @JsonProperty("futureCurrency")
  private String futureCurrency;

  @JsonProperty("sexCode")
  private String sexCode;

  @JsonProperty("supplementaryInformation")
  private String supplementaryInformation;

  @JsonProperty("totalPremium")
  private BigDecimal totalPremium;

  @JsonProperty("totalPremiumCurrency")
  private String totalPremiumCurrency;

  @JsonProperty("travelerName")
  private String travelerName;

  public TravellerInsuranceInformationType amount(BigDecimal amount) {
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

  public TravellerInsuranceInformationType creditCardDetails(List<CreditCardType> creditCardDetails) {
    this.creditCardDetails = creditCardDetails;
    return this;
  }

  public TravellerInsuranceInformationType addCreditCardDetailsItem(CreditCardType creditCardDetailsItem) {
    if (this.creditCardDetails == null) {
      this.creditCardDetails = new ArrayList<>();
    }
    this.creditCardDetails.add(creditCardDetailsItem);
    return this;
  }

  /**
   * Get creditCardDetails
   * @return creditCardDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CreditCardType> getCreditCardDetails() {
    return creditCardDetails;
  }

  public void setCreditCardDetails(List<CreditCardType> creditCardDetails) {
    this.creditCardDetails = creditCardDetails;
  }

  public TravellerInsuranceInformationType currency(String currency) {
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

  public TravellerInsuranceInformationType fareType(String fareType) {
    this.fareType = fareType;
    return this;
  }

  /**
   * Get fareType
   * @return fareType
  */
  @ApiModelProperty(value = "")


  public String getFareType() {
    return fareType;
  }

  public void setFareType(String fareType) {
    this.fareType = fareType;
  }

  public TravellerInsuranceInformationType futureAmount(BigDecimal futureAmount) {
    this.futureAmount = futureAmount;
    return this;
  }

  /**
   * Get futureAmount
   * @return futureAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFutureAmount() {
    return futureAmount;
  }

  public void setFutureAmount(BigDecimal futureAmount) {
    this.futureAmount = futureAmount;
  }

  public TravellerInsuranceInformationType futureCurrency(String futureCurrency) {
    this.futureCurrency = futureCurrency;
    return this;
  }

  /**
   * Get futureCurrency
   * @return futureCurrency
  */
  @ApiModelProperty(value = "")


  public String getFutureCurrency() {
    return futureCurrency;
  }

  public void setFutureCurrency(String futureCurrency) {
    this.futureCurrency = futureCurrency;
  }

  public TravellerInsuranceInformationType sexCode(String sexCode) {
    this.sexCode = sexCode;
    return this;
  }

  /**
   * Get sexCode
   * @return sexCode
  */
  @ApiModelProperty(value = "")


  public String getSexCode() {
    return sexCode;
  }

  public void setSexCode(String sexCode) {
    this.sexCode = sexCode;
  }

  public TravellerInsuranceInformationType supplementaryInformation(String supplementaryInformation) {
    this.supplementaryInformation = supplementaryInformation;
    return this;
  }

  /**
   * Get supplementaryInformation
   * @return supplementaryInformation
  */
  @ApiModelProperty(value = "")


  public String getSupplementaryInformation() {
    return supplementaryInformation;
  }

  public void setSupplementaryInformation(String supplementaryInformation) {
    this.supplementaryInformation = supplementaryInformation;
  }

  public TravellerInsuranceInformationType totalPremium(BigDecimal totalPremium) {
    this.totalPremium = totalPremium;
    return this;
  }

  /**
   * Get totalPremium
   * @return totalPremium
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTotalPremium() {
    return totalPremium;
  }

  public void setTotalPremium(BigDecimal totalPremium) {
    this.totalPremium = totalPremium;
  }

  public TravellerInsuranceInformationType totalPremiumCurrency(String totalPremiumCurrency) {
    this.totalPremiumCurrency = totalPremiumCurrency;
    return this;
  }

  /**
   * Get totalPremiumCurrency
   * @return totalPremiumCurrency
  */
  @ApiModelProperty(value = "")


  public String getTotalPremiumCurrency() {
    return totalPremiumCurrency;
  }

  public void setTotalPremiumCurrency(String totalPremiumCurrency) {
    this.totalPremiumCurrency = totalPremiumCurrency;
  }

  public TravellerInsuranceInformationType travelerName(String travelerName) {
    this.travelerName = travelerName;
    return this;
  }

  /**
   * Get travelerName
   * @return travelerName
  */
  @ApiModelProperty(value = "")


  public String getTravelerName() {
    return travelerName;
  }

  public void setTravelerName(String travelerName) {
    this.travelerName = travelerName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravellerInsuranceInformationType travellerInsuranceInformationType = (TravellerInsuranceInformationType) o;
    return Objects.equals(this.amount, travellerInsuranceInformationType.amount) &&
        Objects.equals(this.creditCardDetails, travellerInsuranceInformationType.creditCardDetails) &&
        Objects.equals(this.currency, travellerInsuranceInformationType.currency) &&
        Objects.equals(this.fareType, travellerInsuranceInformationType.fareType) &&
        Objects.equals(this.futureAmount, travellerInsuranceInformationType.futureAmount) &&
        Objects.equals(this.futureCurrency, travellerInsuranceInformationType.futureCurrency) &&
        Objects.equals(this.sexCode, travellerInsuranceInformationType.sexCode) &&
        Objects.equals(this.supplementaryInformation, travellerInsuranceInformationType.supplementaryInformation) &&
        Objects.equals(this.totalPremium, travellerInsuranceInformationType.totalPremium) &&
        Objects.equals(this.totalPremiumCurrency, travellerInsuranceInformationType.totalPremiumCurrency) &&
        Objects.equals(this.travelerName, travellerInsuranceInformationType.travelerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, creditCardDetails, currency, fareType, futureAmount, futureCurrency, sexCode, supplementaryInformation, totalPremium, totalPremiumCurrency, travelerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravellerInsuranceInformationType {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditCardDetails: ").append(toIndentedString(creditCardDetails)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    fareType: ").append(toIndentedString(fareType)).append("\n");
    sb.append("    futureAmount: ").append(toIndentedString(futureAmount)).append("\n");
    sb.append("    futureCurrency: ").append(toIndentedString(futureCurrency)).append("\n");
    sb.append("    sexCode: ").append(toIndentedString(sexCode)).append("\n");
    sb.append("    supplementaryInformation: ").append(toIndentedString(supplementaryInformation)).append("\n");
    sb.append("    totalPremium: ").append(toIndentedString(totalPremium)).append("\n");
    sb.append("    totalPremiumCurrency: ").append(toIndentedString(totalPremiumCurrency)).append("\n");
    sb.append("    travelerName: ").append(toIndentedString(travelerName)).append("\n");
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

