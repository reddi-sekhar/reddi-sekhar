package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.BookingDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyInformationType8953S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemReferencesAndVersionsType9271S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PlaceLocationIdentificationTypeU8954S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ShipIdentificationType8952S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredDateTimeInformationType207596S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredPeriodInformationType8955S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TravellerInformationTypeI8956S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CruiseBusinessDataType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CruiseBusinessDataType   {
  @JsonProperty("bookingDate")
  private StructuredDateTimeInformationType207596S bookingDate;

  @JsonProperty("bookingDetails")
  private BookingDetails bookingDetails;

  @JsonProperty("passengerInfo")
  @Valid
  private List<TravellerInformationTypeI8956S> passengerInfo = null;

  @JsonProperty("sailingDateInformation")
  private StructuredPeriodInformationType8955S sailingDateInformation;

  @JsonProperty("sailingGroupInformation")
  private ItemReferencesAndVersionsType9271S sailingGroupInformation;

  @JsonProperty("sailingPortsInformation")
  private PlaceLocationIdentificationTypeU8954S sailingPortsInformation;

  @JsonProperty("sailingProviderInformation")
  private CompanyInformationType8953S sailingProviderInformation;

  @JsonProperty("sailingShipInformation")
  private ShipIdentificationType8952S sailingShipInformation;

  public CruiseBusinessDataType bookingDate(StructuredDateTimeInformationType207596S bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  /**
   * Get bookingDate
   * @return bookingDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredDateTimeInformationType207596S getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(StructuredDateTimeInformationType207596S bookingDate) {
    this.bookingDate = bookingDate;
  }

  public CruiseBusinessDataType bookingDetails(BookingDetails bookingDetails) {
    this.bookingDetails = bookingDetails;
    return this;
  }

  /**
   * Get bookingDetails
   * @return bookingDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public BookingDetails getBookingDetails() {
    return bookingDetails;
  }

  public void setBookingDetails(BookingDetails bookingDetails) {
    this.bookingDetails = bookingDetails;
  }

  public CruiseBusinessDataType passengerInfo(List<TravellerInformationTypeI8956S> passengerInfo) {
    this.passengerInfo = passengerInfo;
    return this;
  }

  public CruiseBusinessDataType addPassengerInfoItem(TravellerInformationTypeI8956S passengerInfoItem) {
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

  public List<TravellerInformationTypeI8956S> getPassengerInfo() {
    return passengerInfo;
  }

  public void setPassengerInfo(List<TravellerInformationTypeI8956S> passengerInfo) {
    this.passengerInfo = passengerInfo;
  }

  public CruiseBusinessDataType sailingDateInformation(StructuredPeriodInformationType8955S sailingDateInformation) {
    this.sailingDateInformation = sailingDateInformation;
    return this;
  }

  /**
   * Get sailingDateInformation
   * @return sailingDateInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredPeriodInformationType8955S getSailingDateInformation() {
    return sailingDateInformation;
  }

  public void setSailingDateInformation(StructuredPeriodInformationType8955S sailingDateInformation) {
    this.sailingDateInformation = sailingDateInformation;
  }

  public CruiseBusinessDataType sailingGroupInformation(ItemReferencesAndVersionsType9271S sailingGroupInformation) {
    this.sailingGroupInformation = sailingGroupInformation;
    return this;
  }

  /**
   * Get sailingGroupInformation
   * @return sailingGroupInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemReferencesAndVersionsType9271S getSailingGroupInformation() {
    return sailingGroupInformation;
  }

  public void setSailingGroupInformation(ItemReferencesAndVersionsType9271S sailingGroupInformation) {
    this.sailingGroupInformation = sailingGroupInformation;
  }

  public CruiseBusinessDataType sailingPortsInformation(PlaceLocationIdentificationTypeU8954S sailingPortsInformation) {
    this.sailingPortsInformation = sailingPortsInformation;
    return this;
  }

  /**
   * Get sailingPortsInformation
   * @return sailingPortsInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public PlaceLocationIdentificationTypeU8954S getSailingPortsInformation() {
    return sailingPortsInformation;
  }

  public void setSailingPortsInformation(PlaceLocationIdentificationTypeU8954S sailingPortsInformation) {
    this.sailingPortsInformation = sailingPortsInformation;
  }

  public CruiseBusinessDataType sailingProviderInformation(CompanyInformationType8953S sailingProviderInformation) {
    this.sailingProviderInformation = sailingProviderInformation;
    return this;
  }

  /**
   * Get sailingProviderInformation
   * @return sailingProviderInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyInformationType8953S getSailingProviderInformation() {
    return sailingProviderInformation;
  }

  public void setSailingProviderInformation(CompanyInformationType8953S sailingProviderInformation) {
    this.sailingProviderInformation = sailingProviderInformation;
  }

  public CruiseBusinessDataType sailingShipInformation(ShipIdentificationType8952S sailingShipInformation) {
    this.sailingShipInformation = sailingShipInformation;
    return this;
  }

  /**
   * Get sailingShipInformation
   * @return sailingShipInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ShipIdentificationType8952S getSailingShipInformation() {
    return sailingShipInformation;
  }

  public void setSailingShipInformation(ShipIdentificationType8952S sailingShipInformation) {
    this.sailingShipInformation = sailingShipInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CruiseBusinessDataType cruiseBusinessDataType = (CruiseBusinessDataType) o;
    return Objects.equals(this.bookingDate, cruiseBusinessDataType.bookingDate) &&
        Objects.equals(this.bookingDetails, cruiseBusinessDataType.bookingDetails) &&
        Objects.equals(this.passengerInfo, cruiseBusinessDataType.passengerInfo) &&
        Objects.equals(this.sailingDateInformation, cruiseBusinessDataType.sailingDateInformation) &&
        Objects.equals(this.sailingGroupInformation, cruiseBusinessDataType.sailingGroupInformation) &&
        Objects.equals(this.sailingPortsInformation, cruiseBusinessDataType.sailingPortsInformation) &&
        Objects.equals(this.sailingProviderInformation, cruiseBusinessDataType.sailingProviderInformation) &&
        Objects.equals(this.sailingShipInformation, cruiseBusinessDataType.sailingShipInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingDate, bookingDetails, passengerInfo, sailingDateInformation, sailingGroupInformation, sailingPortsInformation, sailingProviderInformation, sailingShipInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CruiseBusinessDataType {\n");
    
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    bookingDetails: ").append(toIndentedString(bookingDetails)).append("\n");
    sb.append("    passengerInfo: ").append(toIndentedString(passengerInfo)).append("\n");
    sb.append("    sailingDateInformation: ").append(toIndentedString(sailingDateInformation)).append("\n");
    sb.append("    sailingGroupInformation: ").append(toIndentedString(sailingGroupInformation)).append("\n");
    sb.append("    sailingPortsInformation: ").append(toIndentedString(sailingPortsInformation)).append("\n");
    sb.append("    sailingProviderInformation: ").append(toIndentedString(sailingProviderInformation)).append("\n");
    sb.append("    sailingShipInformation: ").append(toIndentedString(sailingShipInformation)).append("\n");
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

