package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyInformationType20151S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FerryAccomodationPackageDescriptionType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FerryLegDescriptionType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationTypeI20153S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FerryBookingDescriptionType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FerryBookingDescriptionType   {
  @JsonProperty("accomodationPackageInfoGroup")
  @Valid
  private List<FerryAccomodationPackageDescriptionType> accomodationPackageInfoGroup = null;

  @JsonProperty("bookingNumberInformation")
  private ReservationControlInformationTypeI20153S bookingNumberInformation;

  @JsonProperty("ferryProviderInformation")
  private CompanyInformationType20151S ferryProviderInformation;

  @JsonProperty("itineraryInfoGroup")
  private FerryLegDescriptionType itineraryInfoGroup;

  public FerryBookingDescriptionType accomodationPackageInfoGroup(List<FerryAccomodationPackageDescriptionType> accomodationPackageInfoGroup) {
    this.accomodationPackageInfoGroup = accomodationPackageInfoGroup;
    return this;
  }

  public FerryBookingDescriptionType addAccomodationPackageInfoGroupItem(FerryAccomodationPackageDescriptionType accomodationPackageInfoGroupItem) {
    if (this.accomodationPackageInfoGroup == null) {
      this.accomodationPackageInfoGroup = new ArrayList<>();
    }
    this.accomodationPackageInfoGroup.add(accomodationPackageInfoGroupItem);
    return this;
  }

  /**
   * Get accomodationPackageInfoGroup
   * @return accomodationPackageInfoGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<FerryAccomodationPackageDescriptionType> getAccomodationPackageInfoGroup() {
    return accomodationPackageInfoGroup;
  }

  public void setAccomodationPackageInfoGroup(List<FerryAccomodationPackageDescriptionType> accomodationPackageInfoGroup) {
    this.accomodationPackageInfoGroup = accomodationPackageInfoGroup;
  }

  public FerryBookingDescriptionType bookingNumberInformation(ReservationControlInformationTypeI20153S bookingNumberInformation) {
    this.bookingNumberInformation = bookingNumberInformation;
    return this;
  }

  /**
   * Get bookingNumberInformation
   * @return bookingNumberInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ReservationControlInformationTypeI20153S getBookingNumberInformation() {
    return bookingNumberInformation;
  }

  public void setBookingNumberInformation(ReservationControlInformationTypeI20153S bookingNumberInformation) {
    this.bookingNumberInformation = bookingNumberInformation;
  }

  public FerryBookingDescriptionType ferryProviderInformation(CompanyInformationType20151S ferryProviderInformation) {
    this.ferryProviderInformation = ferryProviderInformation;
    return this;
  }

  /**
   * Get ferryProviderInformation
   * @return ferryProviderInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyInformationType20151S getFerryProviderInformation() {
    return ferryProviderInformation;
  }

  public void setFerryProviderInformation(CompanyInformationType20151S ferryProviderInformation) {
    this.ferryProviderInformation = ferryProviderInformation;
  }

  public FerryBookingDescriptionType itineraryInfoGroup(FerryLegDescriptionType itineraryInfoGroup) {
    this.itineraryInfoGroup = itineraryInfoGroup;
    return this;
  }

  /**
   * Get itineraryInfoGroup
   * @return itineraryInfoGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public FerryLegDescriptionType getItineraryInfoGroup() {
    return itineraryInfoGroup;
  }

  public void setItineraryInfoGroup(FerryLegDescriptionType itineraryInfoGroup) {
    this.itineraryInfoGroup = itineraryInfoGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FerryBookingDescriptionType ferryBookingDescriptionType = (FerryBookingDescriptionType) o;
    return Objects.equals(this.accomodationPackageInfoGroup, ferryBookingDescriptionType.accomodationPackageInfoGroup) &&
        Objects.equals(this.bookingNumberInformation, ferryBookingDescriptionType.bookingNumberInformation) &&
        Objects.equals(this.ferryProviderInformation, ferryBookingDescriptionType.ferryProviderInformation) &&
        Objects.equals(this.itineraryInfoGroup, ferryBookingDescriptionType.itineraryInfoGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accomodationPackageInfoGroup, bookingNumberInformation, ferryProviderInformation, itineraryInfoGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FerryBookingDescriptionType {\n");
    
    sb.append("    accomodationPackageInfoGroup: ").append(toIndentedString(accomodationPackageInfoGroup)).append("\n");
    sb.append("    bookingNumberInformation: ").append(toIndentedString(bookingNumberInformation)).append("\n");
    sb.append("    ferryProviderInformation: ").append(toIndentedString(ferryProviderInformation)).append("\n");
    sb.append("    itineraryInfoGroup: ").append(toIndentedString(itineraryInfoGroup)).append("\n");
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

