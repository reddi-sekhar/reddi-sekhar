package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AdditionalProductDetailsTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemNumberTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.QuantityAndActionTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInfoType25422S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ServiceDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TourServiceDetailsType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class TourServiceDetailsType   {
  @JsonProperty("confirmationInfo")
  private ReservationControlInformationTypeU confirmationInfo;

  @JsonProperty("passengerAssociation")
  @Valid
  private List<ReferenceInfoType25422S> passengerAssociation = null;

  @JsonProperty("productInfo")
  private AdditionalProductDetailsTypeU productInfo;

  @JsonProperty("sequenceNumberInfo")
  private ItemNumberTypeU sequenceNumberInfo;

  @JsonProperty("serviceDetails")
  @Valid
  private List<ServiceDetails> serviceDetails = null;

  @JsonProperty("statusQuantityInfo")
  private QuantityAndActionTypeU statusQuantityInfo;

  public TourServiceDetailsType confirmationInfo(ReservationControlInformationTypeU confirmationInfo) {
    this.confirmationInfo = confirmationInfo;
    return this;
  }

  /**
   * Get confirmationInfo
   * @return confirmationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationControlInformationTypeU getConfirmationInfo() {
    return confirmationInfo;
  }

  public void setConfirmationInfo(ReservationControlInformationTypeU confirmationInfo) {
    this.confirmationInfo = confirmationInfo;
  }

  public TourServiceDetailsType passengerAssociation(List<ReferenceInfoType25422S> passengerAssociation) {
    this.passengerAssociation = passengerAssociation;
    return this;
  }

  public TourServiceDetailsType addPassengerAssociationItem(ReferenceInfoType25422S passengerAssociationItem) {
    if (this.passengerAssociation == null) {
      this.passengerAssociation = new ArrayList<>();
    }
    this.passengerAssociation.add(passengerAssociationItem);
    return this;
  }

  /**
   * Get passengerAssociation
   * @return passengerAssociation
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReferenceInfoType25422S> getPassengerAssociation() {
    return passengerAssociation;
  }

  public void setPassengerAssociation(List<ReferenceInfoType25422S> passengerAssociation) {
    this.passengerAssociation = passengerAssociation;
  }

  public TourServiceDetailsType productInfo(AdditionalProductDetailsTypeU productInfo) {
    this.productInfo = productInfo;
    return this;
  }

  /**
   * Get productInfo
   * @return productInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdditionalProductDetailsTypeU getProductInfo() {
    return productInfo;
  }

  public void setProductInfo(AdditionalProductDetailsTypeU productInfo) {
    this.productInfo = productInfo;
  }

  public TourServiceDetailsType sequenceNumberInfo(ItemNumberTypeU sequenceNumberInfo) {
    this.sequenceNumberInfo = sequenceNumberInfo;
    return this;
  }

  /**
   * Get sequenceNumberInfo
   * @return sequenceNumberInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemNumberTypeU getSequenceNumberInfo() {
    return sequenceNumberInfo;
  }

  public void setSequenceNumberInfo(ItemNumberTypeU sequenceNumberInfo) {
    this.sequenceNumberInfo = sequenceNumberInfo;
  }

  public TourServiceDetailsType serviceDetails(List<ServiceDetails> serviceDetails) {
    this.serviceDetails = serviceDetails;
    return this;
  }

  public TourServiceDetailsType addServiceDetailsItem(ServiceDetails serviceDetailsItem) {
    if (this.serviceDetails == null) {
      this.serviceDetails = new ArrayList<>();
    }
    this.serviceDetails.add(serviceDetailsItem);
    return this;
  }

  /**
   * Get serviceDetails
   * @return serviceDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ServiceDetails> getServiceDetails() {
    return serviceDetails;
  }

  public void setServiceDetails(List<ServiceDetails> serviceDetails) {
    this.serviceDetails = serviceDetails;
  }

  public TourServiceDetailsType statusQuantityInfo(QuantityAndActionTypeU statusQuantityInfo) {
    this.statusQuantityInfo = statusQuantityInfo;
    return this;
  }

  /**
   * Get statusQuantityInfo
   * @return statusQuantityInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuantityAndActionTypeU getStatusQuantityInfo() {
    return statusQuantityInfo;
  }

  public void setStatusQuantityInfo(QuantityAndActionTypeU statusQuantityInfo) {
    this.statusQuantityInfo = statusQuantityInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TourServiceDetailsType tourServiceDetailsType = (TourServiceDetailsType) o;
    return Objects.equals(this.confirmationInfo, tourServiceDetailsType.confirmationInfo) &&
        Objects.equals(this.passengerAssociation, tourServiceDetailsType.passengerAssociation) &&
        Objects.equals(this.productInfo, tourServiceDetailsType.productInfo) &&
        Objects.equals(this.sequenceNumberInfo, tourServiceDetailsType.sequenceNumberInfo) &&
        Objects.equals(this.serviceDetails, tourServiceDetailsType.serviceDetails) &&
        Objects.equals(this.statusQuantityInfo, tourServiceDetailsType.statusQuantityInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmationInfo, passengerAssociation, productInfo, sequenceNumberInfo, serviceDetails, statusQuantityInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TourServiceDetailsType {\n");
    
    sb.append("    confirmationInfo: ").append(toIndentedString(confirmationInfo)).append("\n");
    sb.append("    passengerAssociation: ").append(toIndentedString(passengerAssociation)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    sequenceNumberInfo: ").append(toIndentedString(sequenceNumberInfo)).append("\n");
    sb.append("    serviceDetails: ").append(toIndentedString(serviceDetails)).append("\n");
    sb.append("    statusQuantityInfo: ").append(toIndentedString(statusQuantityInfo)).append("\n");
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

