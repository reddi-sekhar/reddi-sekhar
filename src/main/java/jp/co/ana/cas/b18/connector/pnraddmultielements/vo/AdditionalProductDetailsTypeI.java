package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AdditionalProductTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MileageTimeDetailsTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductFacilitiesTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StationInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StationInformationTypeI119771C;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerTimeDetailsTypeI;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdditionalProductDetailsTypeI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class AdditionalProductDetailsTypeI   {
  @JsonProperty("arrivalStationInfo")
  private StationInformationTypeI119771C arrivalStationInfo;

  @JsonProperty("departureInformation")
  private StationInformationTypeI departureInformation;

  @JsonProperty("facilities")
  @Valid
  private List<ProductFacilitiesTypeI> facilities = null;

  @JsonProperty("mileageTimeDetails")
  private MileageTimeDetailsTypeI mileageTimeDetails;

  @JsonProperty("productDetails")
  private AdditionalProductTypeI productDetails;

  @JsonProperty("timeDetail")
  private TravellerTimeDetailsTypeI timeDetail;

  public AdditionalProductDetailsTypeI arrivalStationInfo(StationInformationTypeI119771C arrivalStationInfo) {
    this.arrivalStationInfo = arrivalStationInfo;
    return this;
  }

  /**
   * Get arrivalStationInfo
   * @return arrivalStationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public StationInformationTypeI119771C getArrivalStationInfo() {
    return arrivalStationInfo;
  }

  public void setArrivalStationInfo(StationInformationTypeI119771C arrivalStationInfo) {
    this.arrivalStationInfo = arrivalStationInfo;
  }

  public AdditionalProductDetailsTypeI departureInformation(StationInformationTypeI departureInformation) {
    this.departureInformation = departureInformation;
    return this;
  }

  /**
   * Get departureInformation
   * @return departureInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public StationInformationTypeI getDepartureInformation() {
    return departureInformation;
  }

  public void setDepartureInformation(StationInformationTypeI departureInformation) {
    this.departureInformation = departureInformation;
  }

  public AdditionalProductDetailsTypeI facilities(List<ProductFacilitiesTypeI> facilities) {
    this.facilities = facilities;
    return this;
  }

  public AdditionalProductDetailsTypeI addFacilitiesItem(ProductFacilitiesTypeI facilitiesItem) {
    if (this.facilities == null) {
      this.facilities = new ArrayList<>();
    }
    this.facilities.add(facilitiesItem);
    return this;
  }

  /**
   * Get facilities
   * @return facilities
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductFacilitiesTypeI> getFacilities() {
    return facilities;
  }

  public void setFacilities(List<ProductFacilitiesTypeI> facilities) {
    this.facilities = facilities;
  }

  public AdditionalProductDetailsTypeI mileageTimeDetails(MileageTimeDetailsTypeI mileageTimeDetails) {
    this.mileageTimeDetails = mileageTimeDetails;
    return this;
  }

  /**
   * Get mileageTimeDetails
   * @return mileageTimeDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public MileageTimeDetailsTypeI getMileageTimeDetails() {
    return mileageTimeDetails;
  }

  public void setMileageTimeDetails(MileageTimeDetailsTypeI mileageTimeDetails) {
    this.mileageTimeDetails = mileageTimeDetails;
  }

  public AdditionalProductDetailsTypeI productDetails(AdditionalProductTypeI productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdditionalProductTypeI getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(AdditionalProductTypeI productDetails) {
    this.productDetails = productDetails;
  }

  public AdditionalProductDetailsTypeI timeDetail(TravellerTimeDetailsTypeI timeDetail) {
    this.timeDetail = timeDetail;
    return this;
  }

  /**
   * Get timeDetail
   * @return timeDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public TravellerTimeDetailsTypeI getTimeDetail() {
    return timeDetail;
  }

  public void setTimeDetail(TravellerTimeDetailsTypeI timeDetail) {
    this.timeDetail = timeDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalProductDetailsTypeI additionalProductDetailsTypeI = (AdditionalProductDetailsTypeI) o;
    return Objects.equals(this.arrivalStationInfo, additionalProductDetailsTypeI.arrivalStationInfo) &&
        Objects.equals(this.departureInformation, additionalProductDetailsTypeI.departureInformation) &&
        Objects.equals(this.facilities, additionalProductDetailsTypeI.facilities) &&
        Objects.equals(this.mileageTimeDetails, additionalProductDetailsTypeI.mileageTimeDetails) &&
        Objects.equals(this.productDetails, additionalProductDetailsTypeI.productDetails) &&
        Objects.equals(this.timeDetail, additionalProductDetailsTypeI.timeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalStationInfo, departureInformation, facilities, mileageTimeDetails, productDetails, timeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalProductDetailsTypeI {\n");
    
    sb.append("    arrivalStationInfo: ").append(toIndentedString(arrivalStationInfo)).append("\n");
    sb.append("    departureInformation: ").append(toIndentedString(departureInformation)).append("\n");
    sb.append("    facilities: ").append(toIndentedString(facilities)).append("\n");
    sb.append("    mileageTimeDetails: ").append(toIndentedString(mileageTimeDetails)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    timeDetail: ").append(toIndentedString(timeDetail)).append("\n");
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

