package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PaymentInformation;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RemainingAmountsDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TariffInformationTypeU25419S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TourDetailedPriceInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TourAccountDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TourAccountDetailsType   {
  @JsonProperty("paymentInformation")
  @Valid
  private List<PaymentInformation> paymentInformation = null;

  @JsonProperty("remainingAmountsDetails")
  @Valid
  private List<RemainingAmountsDetails> remainingAmountsDetails = null;

  @JsonProperty("tourDetailedPriceInfo")
  @Valid
  private List<TourDetailedPriceInfo> tourDetailedPriceInfo = null;

  @JsonProperty("tourTotalPrices")
  @Valid
  private List<TariffInformationTypeU25419S> tourTotalPrices = null;

  public TourAccountDetailsType paymentInformation(List<PaymentInformation> paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

  public TourAccountDetailsType addPaymentInformationItem(PaymentInformation paymentInformationItem) {
    if (this.paymentInformation == null) {
      this.paymentInformation = new ArrayList<>();
    }
    this.paymentInformation.add(paymentInformationItem);
    return this;
  }

  /**
   * Get paymentInformation
   * @return paymentInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PaymentInformation> getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(List<PaymentInformation> paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public TourAccountDetailsType remainingAmountsDetails(List<RemainingAmountsDetails> remainingAmountsDetails) {
    this.remainingAmountsDetails = remainingAmountsDetails;
    return this;
  }

  public TourAccountDetailsType addRemainingAmountsDetailsItem(RemainingAmountsDetails remainingAmountsDetailsItem) {
    if (this.remainingAmountsDetails == null) {
      this.remainingAmountsDetails = new ArrayList<>();
    }
    this.remainingAmountsDetails.add(remainingAmountsDetailsItem);
    return this;
  }

  /**
   * Get remainingAmountsDetails
   * @return remainingAmountsDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RemainingAmountsDetails> getRemainingAmountsDetails() {
    return remainingAmountsDetails;
  }

  public void setRemainingAmountsDetails(List<RemainingAmountsDetails> remainingAmountsDetails) {
    this.remainingAmountsDetails = remainingAmountsDetails;
  }

  public TourAccountDetailsType tourDetailedPriceInfo(List<TourDetailedPriceInfo> tourDetailedPriceInfo) {
    this.tourDetailedPriceInfo = tourDetailedPriceInfo;
    return this;
  }

  public TourAccountDetailsType addTourDetailedPriceInfoItem(TourDetailedPriceInfo tourDetailedPriceInfoItem) {
    if (this.tourDetailedPriceInfo == null) {
      this.tourDetailedPriceInfo = new ArrayList<>();
    }
    this.tourDetailedPriceInfo.add(tourDetailedPriceInfoItem);
    return this;
  }

  /**
   * Get tourDetailedPriceInfo
   * @return tourDetailedPriceInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TourDetailedPriceInfo> getTourDetailedPriceInfo() {
    return tourDetailedPriceInfo;
  }

  public void setTourDetailedPriceInfo(List<TourDetailedPriceInfo> tourDetailedPriceInfo) {
    this.tourDetailedPriceInfo = tourDetailedPriceInfo;
  }

  public TourAccountDetailsType tourTotalPrices(List<TariffInformationTypeU25419S> tourTotalPrices) {
    this.tourTotalPrices = tourTotalPrices;
    return this;
  }

  public TourAccountDetailsType addTourTotalPricesItem(TariffInformationTypeU25419S tourTotalPricesItem) {
    if (this.tourTotalPrices == null) {
      this.tourTotalPrices = new ArrayList<>();
    }
    this.tourTotalPrices.add(tourTotalPricesItem);
    return this;
  }

  /**
   * Get tourTotalPrices
   * @return tourTotalPrices
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TariffInformationTypeU25419S> getTourTotalPrices() {
    return tourTotalPrices;
  }

  public void setTourTotalPrices(List<TariffInformationTypeU25419S> tourTotalPrices) {
    this.tourTotalPrices = tourTotalPrices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TourAccountDetailsType tourAccountDetailsType = (TourAccountDetailsType) o;
    return Objects.equals(this.paymentInformation, tourAccountDetailsType.paymentInformation) &&
        Objects.equals(this.remainingAmountsDetails, tourAccountDetailsType.remainingAmountsDetails) &&
        Objects.equals(this.tourDetailedPriceInfo, tourAccountDetailsType.tourDetailedPriceInfo) &&
        Objects.equals(this.tourTotalPrices, tourAccountDetailsType.tourTotalPrices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInformation, remainingAmountsDetails, tourDetailedPriceInfo, tourTotalPrices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TourAccountDetailsType {\n");
    
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    remainingAmountsDetails: ").append(toIndentedString(remainingAmountsDetails)).append("\n");
    sb.append("    tourDetailedPriceInfo: ").append(toIndentedString(tourDetailedPriceInfo)).append("\n");
    sb.append("    tourTotalPrices: ").append(toIndentedString(tourTotalPrices)).append("\n");
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

