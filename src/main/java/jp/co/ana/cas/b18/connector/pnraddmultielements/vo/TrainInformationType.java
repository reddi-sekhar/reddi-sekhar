package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AccommodationAllocationInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ClassConfigurationDetailsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CoachProductInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyInformationType19450S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FreeTextInformationType20551S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemReferencesAndVersionsType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityAndActionTypeU32609S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusTypeI20923S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusTypeI217964S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TrainDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravelItineraryInformationTypeI33275S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TrainInformationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TrainInformationType   {
  @JsonProperty("accommodationInfo")
  private AccommodationAllocationInformationTypeU accommodationInfo;

  @JsonProperty("classInfo")
  private ClassConfigurationDetailsType classInfo;

  @JsonProperty("coachInfo")
  private CoachProductInformationType coachInfo;

  @JsonProperty("companyInfo")
  private CompanyInformationType19450S companyInfo;

  @JsonProperty("journeyDirection")
  private TravelItineraryInformationTypeI33275S journeyDirection;

  @JsonProperty("openSegment")
  private StatusTypeI217964S openSegment;

  @JsonProperty("providerTattoo")
  private ItemReferencesAndVersionsType providerTattoo;

  @JsonProperty("reservableStatus")
  private QuantityAndActionTypeU32609S reservableStatus;

  @JsonProperty("serviceInfo")
  private FreeTextInformationType20551S serviceInfo;

  @JsonProperty("tripDetails")
  private TrainDataType tripDetails;

  @JsonProperty("updatePermission")
  private StatusTypeI20923S updatePermission;

  public TrainInformationType accommodationInfo(AccommodationAllocationInformationTypeU accommodationInfo) {
    this.accommodationInfo = accommodationInfo;
    return this;
  }

  /**
   * Get accommodationInfo
   * @return accommodationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccommodationAllocationInformationTypeU getAccommodationInfo() {
    return accommodationInfo;
  }

  public void setAccommodationInfo(AccommodationAllocationInformationTypeU accommodationInfo) {
    this.accommodationInfo = accommodationInfo;
  }

  public TrainInformationType classInfo(ClassConfigurationDetailsType classInfo) {
    this.classInfo = classInfo;
    return this;
  }

  /**
   * Get classInfo
   * @return classInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ClassConfigurationDetailsType getClassInfo() {
    return classInfo;
  }

  public void setClassInfo(ClassConfigurationDetailsType classInfo) {
    this.classInfo = classInfo;
  }

  public TrainInformationType coachInfo(CoachProductInformationType coachInfo) {
    this.coachInfo = coachInfo;
    return this;
  }

  /**
   * Get coachInfo
   * @return coachInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public CoachProductInformationType getCoachInfo() {
    return coachInfo;
  }

  public void setCoachInfo(CoachProductInformationType coachInfo) {
    this.coachInfo = coachInfo;
  }

  public TrainInformationType companyInfo(CompanyInformationType19450S companyInfo) {
    this.companyInfo = companyInfo;
    return this;
  }

  /**
   * Get companyInfo
   * @return companyInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyInformationType19450S getCompanyInfo() {
    return companyInfo;
  }

  public void setCompanyInfo(CompanyInformationType19450S companyInfo) {
    this.companyInfo = companyInfo;
  }

  public TrainInformationType journeyDirection(TravelItineraryInformationTypeI33275S journeyDirection) {
    this.journeyDirection = journeyDirection;
    return this;
  }

  /**
   * Get journeyDirection
   * @return journeyDirection
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravelItineraryInformationTypeI33275S getJourneyDirection() {
    return journeyDirection;
  }

  public void setJourneyDirection(TravelItineraryInformationTypeI33275S journeyDirection) {
    this.journeyDirection = journeyDirection;
  }

  public TrainInformationType openSegment(StatusTypeI217964S openSegment) {
    this.openSegment = openSegment;
    return this;
  }

  /**
   * Get openSegment
   * @return openSegment
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusTypeI217964S getOpenSegment() {
    return openSegment;
  }

  public void setOpenSegment(StatusTypeI217964S openSegment) {
    this.openSegment = openSegment;
  }

  public TrainInformationType providerTattoo(ItemReferencesAndVersionsType providerTattoo) {
    this.providerTattoo = providerTattoo;
    return this;
  }

  /**
   * Get providerTattoo
   * @return providerTattoo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemReferencesAndVersionsType getProviderTattoo() {
    return providerTattoo;
  }

  public void setProviderTattoo(ItemReferencesAndVersionsType providerTattoo) {
    this.providerTattoo = providerTattoo;
  }

  public TrainInformationType reservableStatus(QuantityAndActionTypeU32609S reservableStatus) {
    this.reservableStatus = reservableStatus;
    return this;
  }

  /**
   * Get reservableStatus
   * @return reservableStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityAndActionTypeU32609S getReservableStatus() {
    return reservableStatus;
  }

  public void setReservableStatus(QuantityAndActionTypeU32609S reservableStatus) {
    this.reservableStatus = reservableStatus;
  }

  public TrainInformationType serviceInfo(FreeTextInformationType20551S serviceInfo) {
    this.serviceInfo = serviceInfo;
    return this;
  }

  /**
   * Get serviceInfo
   * @return serviceInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FreeTextInformationType20551S getServiceInfo() {
    return serviceInfo;
  }

  public void setServiceInfo(FreeTextInformationType20551S serviceInfo) {
    this.serviceInfo = serviceInfo;
  }

  public TrainInformationType tripDetails(TrainDataType tripDetails) {
    this.tripDetails = tripDetails;
    return this;
  }

  /**
   * Get tripDetails
   * @return tripDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public TrainDataType getTripDetails() {
    return tripDetails;
  }

  public void setTripDetails(TrainDataType tripDetails) {
    this.tripDetails = tripDetails;
  }

  public TrainInformationType updatePermission(StatusTypeI20923S updatePermission) {
    this.updatePermission = updatePermission;
    return this;
  }

  /**
   * Get updatePermission
   * @return updatePermission
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusTypeI20923S getUpdatePermission() {
    return updatePermission;
  }

  public void setUpdatePermission(StatusTypeI20923S updatePermission) {
    this.updatePermission = updatePermission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrainInformationType trainInformationType = (TrainInformationType) o;
    return Objects.equals(this.accommodationInfo, trainInformationType.accommodationInfo) &&
        Objects.equals(this.classInfo, trainInformationType.classInfo) &&
        Objects.equals(this.coachInfo, trainInformationType.coachInfo) &&
        Objects.equals(this.companyInfo, trainInformationType.companyInfo) &&
        Objects.equals(this.journeyDirection, trainInformationType.journeyDirection) &&
        Objects.equals(this.openSegment, trainInformationType.openSegment) &&
        Objects.equals(this.providerTattoo, trainInformationType.providerTattoo) &&
        Objects.equals(this.reservableStatus, trainInformationType.reservableStatus) &&
        Objects.equals(this.serviceInfo, trainInformationType.serviceInfo) &&
        Objects.equals(this.tripDetails, trainInformationType.tripDetails) &&
        Objects.equals(this.updatePermission, trainInformationType.updatePermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accommodationInfo, classInfo, coachInfo, companyInfo, journeyDirection, openSegment, providerTattoo, reservableStatus, serviceInfo, tripDetails, updatePermission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainInformationType {\n");
    
    sb.append("    accommodationInfo: ").append(toIndentedString(accommodationInfo)).append("\n");
    sb.append("    classInfo: ").append(toIndentedString(classInfo)).append("\n");
    sb.append("    coachInfo: ").append(toIndentedString(coachInfo)).append("\n");
    sb.append("    companyInfo: ").append(toIndentedString(companyInfo)).append("\n");
    sb.append("    journeyDirection: ").append(toIndentedString(journeyDirection)).append("\n");
    sb.append("    openSegment: ").append(toIndentedString(openSegment)).append("\n");
    sb.append("    providerTattoo: ").append(toIndentedString(providerTattoo)).append("\n");
    sb.append("    reservableStatus: ").append(toIndentedString(reservableStatus)).append("\n");
    sb.append("    serviceInfo: ").append(toIndentedString(serviceInfo)).append("\n");
    sb.append("    tripDetails: ").append(toIndentedString(tripDetails)).append("\n");
    sb.append("    updatePermission: ").append(toIndentedString(updatePermission)).append("\n");
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

