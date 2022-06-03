package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AdditionalProductDetailsTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyInformationType25420S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType25445S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.InsuranceCoverageType25483S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PlaceLocationIdentificationTypeU25436S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityAndActionTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityType25433S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType25422S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType25444S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TourAccountDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TourServiceDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TransportIdentifierType25440S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelProductInformationTypeU25428S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerInformationType25441S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.UserIdentificationType25447S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TourInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TourInformationType   {
  @JsonProperty("bookingDescriptionInfo")
  @Valid
  private List<FreeTextInformationType25445S> bookingDescriptionInfo = null;

  @JsonProperty("bookingDurationInfo")
  private QuantityType25433S bookingDurationInfo;

  @JsonProperty("bookingReferenceInfo")
  @Valid
  private List<ReservationControlInformationTypeU> bookingReferenceInfo = null;

  @JsonProperty("bookingSource")
  private UserIdentificationType25447S bookingSource;

  @JsonProperty("bookingSummaryInfo")
  private TravelProductInformationTypeU25428S bookingSummaryInfo;

  @JsonProperty("expireInfo")
  private StructuredDateTimeInformationType25444S expireInfo;

  @JsonProperty("insuranceIndication")
  private InsuranceCoverageType25483S insuranceIndication;

  @JsonProperty("passengerAssocation")
  @Valid
  private List<ReferenceInfoType25422S> passengerAssocation = null;

  @JsonProperty("passengerInfo")
  @Valid
  private List<TravellerInformationType25441S> passengerInfo = null;

  @JsonProperty("statusInfo")
  private QuantityAndActionTypeU statusInfo;

  @JsonProperty("stayingInfo")
  private PlaceLocationIdentificationTypeU25436S stayingInfo;

  @JsonProperty("systemProviderInfo")
  private TransportIdentifierType25440S systemProviderInfo;

  @JsonProperty("tourAccountDetails")
  private TourAccountDetailsType tourAccountDetails;

  @JsonProperty("tourDescriptionInfo")
  private AdditionalProductDetailsTypeU tourDescriptionInfo;

  @JsonProperty("tourOperatorInfo")
  @Valid
  private List<CompanyInformationType25420S> tourOperatorInfo = null;

  @JsonProperty("tourProductDetails")
  @Valid
  private List<TourServiceDetailsType> tourProductDetails = null;

  public TourInformationType bookingDescriptionInfo(List<FreeTextInformationType25445S> bookingDescriptionInfo) {
    this.bookingDescriptionInfo = bookingDescriptionInfo;
    return this;
  }

  public TourInformationType addBookingDescriptionInfoItem(FreeTextInformationType25445S bookingDescriptionInfoItem) {
    if (this.bookingDescriptionInfo == null) {
      this.bookingDescriptionInfo = new ArrayList<>();
    }
    this.bookingDescriptionInfo.add(bookingDescriptionInfoItem);
    return this;
  }

  /**
   * Get bookingDescriptionInfo
   * @return bookingDescriptionInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FreeTextInformationType25445S> getBookingDescriptionInfo() {
    return bookingDescriptionInfo;
  }

  public void setBookingDescriptionInfo(List<FreeTextInformationType25445S> bookingDescriptionInfo) {
    this.bookingDescriptionInfo = bookingDescriptionInfo;
  }

  public TourInformationType bookingDurationInfo(QuantityType25433S bookingDurationInfo) {
    this.bookingDurationInfo = bookingDurationInfo;
    return this;
  }

  /**
   * Get bookingDurationInfo
   * @return bookingDurationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityType25433S getBookingDurationInfo() {
    return bookingDurationInfo;
  }

  public void setBookingDurationInfo(QuantityType25433S bookingDurationInfo) {
    this.bookingDurationInfo = bookingDurationInfo;
  }

  public TourInformationType bookingReferenceInfo(List<ReservationControlInformationTypeU> bookingReferenceInfo) {
    this.bookingReferenceInfo = bookingReferenceInfo;
    return this;
  }

  public TourInformationType addBookingReferenceInfoItem(ReservationControlInformationTypeU bookingReferenceInfoItem) {
    if (this.bookingReferenceInfo == null) {
      this.bookingReferenceInfo = new ArrayList<>();
    }
    this.bookingReferenceInfo.add(bookingReferenceInfoItem);
    return this;
  }

  /**
   * Get bookingReferenceInfo
   * @return bookingReferenceInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReservationControlInformationTypeU> getBookingReferenceInfo() {
    return bookingReferenceInfo;
  }

  public void setBookingReferenceInfo(List<ReservationControlInformationTypeU> bookingReferenceInfo) {
    this.bookingReferenceInfo = bookingReferenceInfo;
  }

  public TourInformationType bookingSource(UserIdentificationType25447S bookingSource) {
    this.bookingSource = bookingSource;
    return this;
  }

  /**
   * Get bookingSource
   * @return bookingSource
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserIdentificationType25447S getBookingSource() {
    return bookingSource;
  }

  public void setBookingSource(UserIdentificationType25447S bookingSource) {
    this.bookingSource = bookingSource;
  }

  public TourInformationType bookingSummaryInfo(TravelProductInformationTypeU25428S bookingSummaryInfo) {
    this.bookingSummaryInfo = bookingSummaryInfo;
    return this;
  }

  /**
   * Get bookingSummaryInfo
   * @return bookingSummaryInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelProductInformationTypeU25428S getBookingSummaryInfo() {
    return bookingSummaryInfo;
  }

  public void setBookingSummaryInfo(TravelProductInformationTypeU25428S bookingSummaryInfo) {
    this.bookingSummaryInfo = bookingSummaryInfo;
  }

  public TourInformationType expireInfo(StructuredDateTimeInformationType25444S expireInfo) {
    this.expireInfo = expireInfo;
    return this;
  }

  /**
   * Get expireInfo
   * @return expireInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeInformationType25444S getExpireInfo() {
    return expireInfo;
  }

  public void setExpireInfo(StructuredDateTimeInformationType25444S expireInfo) {
    this.expireInfo = expireInfo;
  }

  public TourInformationType insuranceIndication(InsuranceCoverageType25483S insuranceIndication) {
    this.insuranceIndication = insuranceIndication;
    return this;
  }

  /**
   * Get insuranceIndication
   * @return insuranceIndication
  */
  @ApiModelProperty(value = "")

  @Valid

  public InsuranceCoverageType25483S getInsuranceIndication() {
    return insuranceIndication;
  }

  public void setInsuranceIndication(InsuranceCoverageType25483S insuranceIndication) {
    this.insuranceIndication = insuranceIndication;
  }

  public TourInformationType passengerAssocation(List<ReferenceInfoType25422S> passengerAssocation) {
    this.passengerAssocation = passengerAssocation;
    return this;
  }

  public TourInformationType addPassengerAssocationItem(ReferenceInfoType25422S passengerAssocationItem) {
    if (this.passengerAssocation == null) {
      this.passengerAssocation = new ArrayList<>();
    }
    this.passengerAssocation.add(passengerAssocationItem);
    return this;
  }

  /**
   * Get passengerAssocation
   * @return passengerAssocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReferenceInfoType25422S> getPassengerAssocation() {
    return passengerAssocation;
  }

  public void setPassengerAssocation(List<ReferenceInfoType25422S> passengerAssocation) {
    this.passengerAssocation = passengerAssocation;
  }

  public TourInformationType passengerInfo(List<TravellerInformationType25441S> passengerInfo) {
    this.passengerInfo = passengerInfo;
    return this;
  }

  public TourInformationType addPassengerInfoItem(TravellerInformationType25441S passengerInfoItem) {
    if (this.passengerInfo == null) {
      this.passengerInfo = new ArrayList<>();
    }
    this.passengerInfo.add(passengerInfoItem);
    return this;
  }

  /**
   * Get passengerInfo
   * @return passengerInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TravellerInformationType25441S> getPassengerInfo() {
    return passengerInfo;
  }

  public void setPassengerInfo(List<TravellerInformationType25441S> passengerInfo) {
    this.passengerInfo = passengerInfo;
  }

  public TourInformationType statusInfo(QuantityAndActionTypeU statusInfo) {
    this.statusInfo = statusInfo;
    return this;
  }

  /**
   * Get statusInfo
   * @return statusInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityAndActionTypeU getStatusInfo() {
    return statusInfo;
  }

  public void setStatusInfo(QuantityAndActionTypeU statusInfo) {
    this.statusInfo = statusInfo;
  }

  public TourInformationType stayingInfo(PlaceLocationIdentificationTypeU25436S stayingInfo) {
    this.stayingInfo = stayingInfo;
    return this;
  }

  /**
   * Get stayingInfo
   * @return stayingInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlaceLocationIdentificationTypeU25436S getStayingInfo() {
    return stayingInfo;
  }

  public void setStayingInfo(PlaceLocationIdentificationTypeU25436S stayingInfo) {
    this.stayingInfo = stayingInfo;
  }

  public TourInformationType systemProviderInfo(TransportIdentifierType25440S systemProviderInfo) {
    this.systemProviderInfo = systemProviderInfo;
    return this;
  }

  /**
   * Get systemProviderInfo
   * @return systemProviderInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TransportIdentifierType25440S getSystemProviderInfo() {
    return systemProviderInfo;
  }

  public void setSystemProviderInfo(TransportIdentifierType25440S systemProviderInfo) {
    this.systemProviderInfo = systemProviderInfo;
  }

  public TourInformationType tourAccountDetails(TourAccountDetailsType tourAccountDetails) {
    this.tourAccountDetails = tourAccountDetails;
    return this;
  }

  /**
   * Get tourAccountDetails
   * @return tourAccountDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TourAccountDetailsType getTourAccountDetails() {
    return tourAccountDetails;
  }

  public void setTourAccountDetails(TourAccountDetailsType tourAccountDetails) {
    this.tourAccountDetails = tourAccountDetails;
  }

  public TourInformationType tourDescriptionInfo(AdditionalProductDetailsTypeU tourDescriptionInfo) {
    this.tourDescriptionInfo = tourDescriptionInfo;
    return this;
  }

  /**
   * Get tourDescriptionInfo
   * @return tourDescriptionInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdditionalProductDetailsTypeU getTourDescriptionInfo() {
    return tourDescriptionInfo;
  }

  public void setTourDescriptionInfo(AdditionalProductDetailsTypeU tourDescriptionInfo) {
    this.tourDescriptionInfo = tourDescriptionInfo;
  }

  public TourInformationType tourOperatorInfo(List<CompanyInformationType25420S> tourOperatorInfo) {
    this.tourOperatorInfo = tourOperatorInfo;
    return this;
  }

  public TourInformationType addTourOperatorInfoItem(CompanyInformationType25420S tourOperatorInfoItem) {
    if (this.tourOperatorInfo == null) {
      this.tourOperatorInfo = new ArrayList<>();
    }
    this.tourOperatorInfo.add(tourOperatorInfoItem);
    return this;
  }

  /**
   * Get tourOperatorInfo
   * @return tourOperatorInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CompanyInformationType25420S> getTourOperatorInfo() {
    return tourOperatorInfo;
  }

  public void setTourOperatorInfo(List<CompanyInformationType25420S> tourOperatorInfo) {
    this.tourOperatorInfo = tourOperatorInfo;
  }

  public TourInformationType tourProductDetails(List<TourServiceDetailsType> tourProductDetails) {
    this.tourProductDetails = tourProductDetails;
    return this;
  }

  public TourInformationType addTourProductDetailsItem(TourServiceDetailsType tourProductDetailsItem) {
    if (this.tourProductDetails == null) {
      this.tourProductDetails = new ArrayList<>();
    }
    this.tourProductDetails.add(tourProductDetailsItem);
    return this;
  }

  /**
   * Get tourProductDetails
   * @return tourProductDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TourServiceDetailsType> getTourProductDetails() {
    return tourProductDetails;
  }

  public void setTourProductDetails(List<TourServiceDetailsType> tourProductDetails) {
    this.tourProductDetails = tourProductDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TourInformationType tourInformationType = (TourInformationType) o;
    return Objects.equals(this.bookingDescriptionInfo, tourInformationType.bookingDescriptionInfo) &&
        Objects.equals(this.bookingDurationInfo, tourInformationType.bookingDurationInfo) &&
        Objects.equals(this.bookingReferenceInfo, tourInformationType.bookingReferenceInfo) &&
        Objects.equals(this.bookingSource, tourInformationType.bookingSource) &&
        Objects.equals(this.bookingSummaryInfo, tourInformationType.bookingSummaryInfo) &&
        Objects.equals(this.expireInfo, tourInformationType.expireInfo) &&
        Objects.equals(this.insuranceIndication, tourInformationType.insuranceIndication) &&
        Objects.equals(this.passengerAssocation, tourInformationType.passengerAssocation) &&
        Objects.equals(this.passengerInfo, tourInformationType.passengerInfo) &&
        Objects.equals(this.statusInfo, tourInformationType.statusInfo) &&
        Objects.equals(this.stayingInfo, tourInformationType.stayingInfo) &&
        Objects.equals(this.systemProviderInfo, tourInformationType.systemProviderInfo) &&
        Objects.equals(this.tourAccountDetails, tourInformationType.tourAccountDetails) &&
        Objects.equals(this.tourDescriptionInfo, tourInformationType.tourDescriptionInfo) &&
        Objects.equals(this.tourOperatorInfo, tourInformationType.tourOperatorInfo) &&
        Objects.equals(this.tourProductDetails, tourInformationType.tourProductDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingDescriptionInfo, bookingDurationInfo, bookingReferenceInfo, bookingSource, bookingSummaryInfo, expireInfo, insuranceIndication, passengerAssocation, passengerInfo, statusInfo, stayingInfo, systemProviderInfo, tourAccountDetails, tourDescriptionInfo, tourOperatorInfo, tourProductDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TourInformationType {\n");
    
    sb.append("    bookingDescriptionInfo: ").append(toIndentedString(bookingDescriptionInfo)).append("\n");
    sb.append("    bookingDurationInfo: ").append(toIndentedString(bookingDurationInfo)).append("\n");
    sb.append("    bookingReferenceInfo: ").append(toIndentedString(bookingReferenceInfo)).append("\n");
    sb.append("    bookingSource: ").append(toIndentedString(bookingSource)).append("\n");
    sb.append("    bookingSummaryInfo: ").append(toIndentedString(bookingSummaryInfo)).append("\n");
    sb.append("    expireInfo: ").append(toIndentedString(expireInfo)).append("\n");
    sb.append("    insuranceIndication: ").append(toIndentedString(insuranceIndication)).append("\n");
    sb.append("    passengerAssocation: ").append(toIndentedString(passengerAssocation)).append("\n");
    sb.append("    passengerInfo: ").append(toIndentedString(passengerInfo)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    stayingInfo: ").append(toIndentedString(stayingInfo)).append("\n");
    sb.append("    systemProviderInfo: ").append(toIndentedString(systemProviderInfo)).append("\n");
    sb.append("    tourAccountDetails: ").append(toIndentedString(tourAccountDetails)).append("\n");
    sb.append("    tourDescriptionInfo: ").append(toIndentedString(tourDescriptionInfo)).append("\n");
    sb.append("    tourOperatorInfo: ").append(toIndentedString(tourOperatorInfo)).append("\n");
    sb.append("    tourProductDetails: ").append(toIndentedString(tourProductDetails)).append("\n");
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

