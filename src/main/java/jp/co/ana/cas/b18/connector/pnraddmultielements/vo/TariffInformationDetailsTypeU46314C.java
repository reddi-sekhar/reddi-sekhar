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
 * TariffInformationDetailsTypeU46314C
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TariffInformationDetailsTypeU46314C   {
  @JsonProperty("currencyCode")
  private String currencyCode;

  @JsonProperty("quantity")
  private Long quantity;

  @JsonProperty("rateIdentifier")
  private String rateIdentifier;

  @JsonProperty("tariffQualifier")
  private String tariffQualifier;

  @JsonProperty("tariffStatus")
  private String tariffStatus;

  @JsonProperty("totalAmount")
  private BigDecimal totalAmount;

  @JsonProperty("unitaryAmount")
  private BigDecimal unitaryAmount;

  public TariffInformationDetailsTypeU46314C currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
  */
  @ApiModelProperty(value = "")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public TariffInformationDetailsTypeU46314C quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(value = "")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public TariffInformationDetailsTypeU46314C rateIdentifier(String rateIdentifier) {
    this.rateIdentifier = rateIdentifier;
    return this;
  }

  /**
   * Get rateIdentifier
   * @return rateIdentifier
  */
  @ApiModelProperty(value = "")


  public String getRateIdentifier() {
    return rateIdentifier;
  }

  public void setRateIdentifier(String rateIdentifier) {
    this.rateIdentifier = rateIdentifier;
  }

  public TariffInformationDetailsTypeU46314C tariffQualifier(String tariffQualifier) {
    this.tariffQualifier = tariffQualifier;
    return this;
  }

  /**
   * Get tariffQualifier
   * @return tariffQualifier
  */
  @ApiModelProperty(value = "")


  public String getTariffQualifier() {
    return tariffQualifier;
  }

  public void setTariffQualifier(String tariffQualifier) {
    this.tariffQualifier = tariffQualifier;
  }

  public TariffInformationDetailsTypeU46314C tariffStatus(String tariffStatus) {
    this.tariffStatus = tariffStatus;
    return this;
  }

  /**
   * Get tariffStatus
   * @return tariffStatus
  */
  @ApiModelProperty(value = "")


  public String getTariffStatus() {
    return tariffStatus;
  }

  public void setTariffStatus(String tariffStatus) {
    this.tariffStatus = tariffStatus;
  }

  public TariffInformationDetailsTypeU46314C totalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public TariffInformationDetailsTypeU46314C unitaryAmount(BigDecimal unitaryAmount) {
    this.unitaryAmount = unitaryAmount;
    return this;
  }

  /**
   * Get unitaryAmount
   * @return unitaryAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getUnitaryAmount() {
    return unitaryAmount;
  }

  public void setUnitaryAmount(BigDecimal unitaryAmount) {
    this.unitaryAmount = unitaryAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffInformationDetailsTypeU46314C tariffInformationDetailsTypeU46314C = (TariffInformationDetailsTypeU46314C) o;
    return Objects.equals(this.currencyCode, tariffInformationDetailsTypeU46314C.currencyCode) &&
        Objects.equals(this.quantity, tariffInformationDetailsTypeU46314C.quantity) &&
        Objects.equals(this.rateIdentifier, tariffInformationDetailsTypeU46314C.rateIdentifier) &&
        Objects.equals(this.tariffQualifier, tariffInformationDetailsTypeU46314C.tariffQualifier) &&
        Objects.equals(this.tariffStatus, tariffInformationDetailsTypeU46314C.tariffStatus) &&
        Objects.equals(this.totalAmount, tariffInformationDetailsTypeU46314C.totalAmount) &&
        Objects.equals(this.unitaryAmount, tariffInformationDetailsTypeU46314C.unitaryAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, quantity, rateIdentifier, tariffQualifier, tariffStatus, totalAmount, unitaryAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffInformationDetailsTypeU46314C {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    rateIdentifier: ").append(toIndentedString(rateIdentifier)).append("\n");
    sb.append("    tariffQualifier: ").append(toIndentedString(tariffQualifier)).append("\n");
    sb.append("    tariffStatus: ").append(toIndentedString(tariffStatus)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    unitaryAmount: ").append(toIndentedString(unitaryAmount)).append("\n");
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

