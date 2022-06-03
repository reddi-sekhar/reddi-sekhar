package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ArrivalFlightDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.BillableInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CompanyInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ConsumerReferenceInformationTypeI;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ContactInformationTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DocumentInformationDetailsTypeI207581S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FrequentTravellerIdentificationCodeType38226S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.GuaranteeOrDeposit;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.HotelPropertyType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ItemNumberTypeU33258S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MiscellaneousRemarksType664S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.MonetaryInformationTypeI1689S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NameAndAddressBatchTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReservationControlInformationTypeI196503S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.RoomRateDetails;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StatusType99582S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.StructuredPeriodInformationType207579S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.UserIdentificationType215330S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HotelReservationInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class HotelReservationInfo   {
  @JsonProperty("arrivalFlightDetails")
  private ArrivalFlightDetails arrivalFlightDetails;

  @JsonProperty("billableInfo")
  private BillableInformationTypeU billableInfo;

  @JsonProperty("bookingIndicator")
  private StatusType99582S bookingIndicator;

  @JsonProperty("bookingSource")
  private UserIdentificationType215330S bookingSource;

  @JsonProperty("cancelOrConfirmNbr")
  @Valid
  private List<ReservationControlInformationTypeI196503S> cancelOrConfirmNbr = null;

  @JsonProperty("companyIdentification")
  private CompanyInformationType companyIdentification;

  @JsonProperty("customerInfo")
  private ConsumerReferenceInformationTypeI customerInfo;

  @JsonProperty("documentInformationDetails")
  private DocumentInformationDetailsTypeI207581S documentInformationDetails;

  @JsonProperty("frequentTravellerInfo")
  private FrequentTravellerIdentificationCodeType38226S frequentTravellerInfo;

  @JsonProperty("guaranteeOrDeposit")
  private GuaranteeOrDeposit guaranteeOrDeposit;

  @JsonProperty("hotelPropertyInfo")
  private HotelPropertyType hotelPropertyInfo;

  @JsonProperty("requestedDates")
  private StructuredPeriodInformationType207579S requestedDates;

  @JsonProperty("roomRateDetails")
  private RoomRateDetails roomRateDetails;

  @JsonProperty("roomstayIndex")
  private ItemNumberTypeU33258S roomstayIndex;

  @JsonProperty("savingAmountInfo")
  private MonetaryInformationTypeI1689S savingAmountInfo;

  @JsonProperty("textOptions")
  @Valid
  private List<MiscellaneousRemarksType664S> textOptions = null;

  @JsonProperty("writtenConfirmationContact")
  private ContactInformationTypeU writtenConfirmationContact;

  @JsonProperty("writtenConfirmationInfo")
  private NameAndAddressBatchTypeU writtenConfirmationInfo;

  public HotelReservationInfo arrivalFlightDetails(ArrivalFlightDetails arrivalFlightDetails) {
    this.arrivalFlightDetails = arrivalFlightDetails;
    return this;
  }

  /**
   * Get arrivalFlightDetails
   * @return arrivalFlightDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public ArrivalFlightDetails getArrivalFlightDetails() {
    return arrivalFlightDetails;
  }

  public void setArrivalFlightDetails(ArrivalFlightDetails arrivalFlightDetails) {
    this.arrivalFlightDetails = arrivalFlightDetails;
  }

  public HotelReservationInfo billableInfo(BillableInformationTypeU billableInfo) {
    this.billableInfo = billableInfo;
    return this;
  }

  /**
   * Get billableInfo
   * @return billableInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public BillableInformationTypeU getBillableInfo() {
    return billableInfo;
  }

  public void setBillableInfo(BillableInformationTypeU billableInfo) {
    this.billableInfo = billableInfo;
  }

  public HotelReservationInfo bookingIndicator(StatusType99582S bookingIndicator) {
    this.bookingIndicator = bookingIndicator;
    return this;
  }

  /**
   * Get bookingIndicator
   * @return bookingIndicator
  */
  @ApiModelProperty(value = "")

  @Valid

  public StatusType99582S getBookingIndicator() {
    return bookingIndicator;
  }

  public void setBookingIndicator(StatusType99582S bookingIndicator) {
    this.bookingIndicator = bookingIndicator;
  }

  public HotelReservationInfo bookingSource(UserIdentificationType215330S bookingSource) {
    this.bookingSource = bookingSource;
    return this;
  }

  /**
   * Get bookingSource
   * @return bookingSource
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserIdentificationType215330S getBookingSource() {
    return bookingSource;
  }

  public void setBookingSource(UserIdentificationType215330S bookingSource) {
    this.bookingSource = bookingSource;
  }

  public HotelReservationInfo cancelOrConfirmNbr(List<ReservationControlInformationTypeI196503S> cancelOrConfirmNbr) {
    this.cancelOrConfirmNbr = cancelOrConfirmNbr;
    return this;
  }

  public HotelReservationInfo addCancelOrConfirmNbrItem(ReservationControlInformationTypeI196503S cancelOrConfirmNbrItem) {
    if (this.cancelOrConfirmNbr == null) {
      this.cancelOrConfirmNbr = new ArrayList<>();
    }
    this.cancelOrConfirmNbr.add(cancelOrConfirmNbrItem);
    return this;
  }

  /**
   * Get cancelOrConfirmNbr
   * @return cancelOrConfirmNbr
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReservationControlInformationTypeI196503S> getCancelOrConfirmNbr() {
    return cancelOrConfirmNbr;
  }

  public void setCancelOrConfirmNbr(List<ReservationControlInformationTypeI196503S> cancelOrConfirmNbr) {
    this.cancelOrConfirmNbr = cancelOrConfirmNbr;
  }

  public HotelReservationInfo companyIdentification(CompanyInformationType companyIdentification) {
    this.companyIdentification = companyIdentification;
    return this;
  }

  /**
   * Get companyIdentification
   * @return companyIdentification
  */
  @ApiModelProperty(value = "")

  @Valid

  public CompanyInformationType getCompanyIdentification() {
    return companyIdentification;
  }

  public void setCompanyIdentification(CompanyInformationType companyIdentification) {
    this.companyIdentification = companyIdentification;
  }

  public HotelReservationInfo customerInfo(ConsumerReferenceInformationTypeI customerInfo) {
    this.customerInfo = customerInfo;
    return this;
  }

  /**
   * Get customerInfo
   * @return customerInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConsumerReferenceInformationTypeI getCustomerInfo() {
    return customerInfo;
  }

  public void setCustomerInfo(ConsumerReferenceInformationTypeI customerInfo) {
    this.customerInfo = customerInfo;
  }

  public HotelReservationInfo documentInformationDetails(DocumentInformationDetailsTypeI207581S documentInformationDetails) {
    this.documentInformationDetails = documentInformationDetails;
    return this;
  }

  /**
   * Get documentInformationDetails
   * @return documentInformationDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public DocumentInformationDetailsTypeI207581S getDocumentInformationDetails() {
    return documentInformationDetails;
  }

  public void setDocumentInformationDetails(DocumentInformationDetailsTypeI207581S documentInformationDetails) {
    this.documentInformationDetails = documentInformationDetails;
  }

  public HotelReservationInfo frequentTravellerInfo(FrequentTravellerIdentificationCodeType38226S frequentTravellerInfo) {
    this.frequentTravellerInfo = frequentTravellerInfo;
    return this;
  }

  /**
   * Get frequentTravellerInfo
   * @return frequentTravellerInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravellerIdentificationCodeType38226S getFrequentTravellerInfo() {
    return frequentTravellerInfo;
  }

  public void setFrequentTravellerInfo(FrequentTravellerIdentificationCodeType38226S frequentTravellerInfo) {
    this.frequentTravellerInfo = frequentTravellerInfo;
  }

  public HotelReservationInfo guaranteeOrDeposit(GuaranteeOrDeposit guaranteeOrDeposit) {
    this.guaranteeOrDeposit = guaranteeOrDeposit;
    return this;
  }

  /**
   * Get guaranteeOrDeposit
   * @return guaranteeOrDeposit
  */
  @ApiModelProperty(value = "")

  @Valid

  public GuaranteeOrDeposit getGuaranteeOrDeposit() {
    return guaranteeOrDeposit;
  }

  public void setGuaranteeOrDeposit(GuaranteeOrDeposit guaranteeOrDeposit) {
    this.guaranteeOrDeposit = guaranteeOrDeposit;
  }

  public HotelReservationInfo hotelPropertyInfo(HotelPropertyType hotelPropertyInfo) {
    this.hotelPropertyInfo = hotelPropertyInfo;
    return this;
  }

  /**
   * Get hotelPropertyInfo
   * @return hotelPropertyInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public HotelPropertyType getHotelPropertyInfo() {
    return hotelPropertyInfo;
  }

  public void setHotelPropertyInfo(HotelPropertyType hotelPropertyInfo) {
    this.hotelPropertyInfo = hotelPropertyInfo;
  }

  public HotelReservationInfo requestedDates(StructuredPeriodInformationType207579S requestedDates) {
    this.requestedDates = requestedDates;
    return this;
  }

  /**
   * Get requestedDates
   * @return requestedDates
  */
  @ApiModelProperty(value = "")

  @Valid

  public StructuredPeriodInformationType207579S getRequestedDates() {
    return requestedDates;
  }

  public void setRequestedDates(StructuredPeriodInformationType207579S requestedDates) {
    this.requestedDates = requestedDates;
  }

  public HotelReservationInfo roomRateDetails(RoomRateDetails roomRateDetails) {
    this.roomRateDetails = roomRateDetails;
    return this;
  }

  /**
   * Get roomRateDetails
   * @return roomRateDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public RoomRateDetails getRoomRateDetails() {
    return roomRateDetails;
  }

  public void setRoomRateDetails(RoomRateDetails roomRateDetails) {
    this.roomRateDetails = roomRateDetails;
  }

  public HotelReservationInfo roomstayIndex(ItemNumberTypeU33258S roomstayIndex) {
    this.roomstayIndex = roomstayIndex;
    return this;
  }

  /**
   * Get roomstayIndex
   * @return roomstayIndex
  */
  @ApiModelProperty(value = "")

  @Valid

  public ItemNumberTypeU33258S getRoomstayIndex() {
    return roomstayIndex;
  }

  public void setRoomstayIndex(ItemNumberTypeU33258S roomstayIndex) {
    this.roomstayIndex = roomstayIndex;
  }

  public HotelReservationInfo savingAmountInfo(MonetaryInformationTypeI1689S savingAmountInfo) {
    this.savingAmountInfo = savingAmountInfo;
    return this;
  }

  /**
   * Get savingAmountInfo
   * @return savingAmountInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public MonetaryInformationTypeI1689S getSavingAmountInfo() {
    return savingAmountInfo;
  }

  public void setSavingAmountInfo(MonetaryInformationTypeI1689S savingAmountInfo) {
    this.savingAmountInfo = savingAmountInfo;
  }

  public HotelReservationInfo textOptions(List<MiscellaneousRemarksType664S> textOptions) {
    this.textOptions = textOptions;
    return this;
  }

  public HotelReservationInfo addTextOptionsItem(MiscellaneousRemarksType664S textOptionsItem) {
    if (this.textOptions == null) {
      this.textOptions = new ArrayList<>();
    }
    this.textOptions.add(textOptionsItem);
    return this;
  }

  /**
   * Get textOptions
   * @return textOptions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MiscellaneousRemarksType664S> getTextOptions() {
    return textOptions;
  }

  public void setTextOptions(List<MiscellaneousRemarksType664S> textOptions) {
    this.textOptions = textOptions;
  }

  public HotelReservationInfo writtenConfirmationContact(ContactInformationTypeU writtenConfirmationContact) {
    this.writtenConfirmationContact = writtenConfirmationContact;
    return this;
  }

  /**
   * Get writtenConfirmationContact
   * @return writtenConfirmationContact
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContactInformationTypeU getWrittenConfirmationContact() {
    return writtenConfirmationContact;
  }

  public void setWrittenConfirmationContact(ContactInformationTypeU writtenConfirmationContact) {
    this.writtenConfirmationContact = writtenConfirmationContact;
  }

  public HotelReservationInfo writtenConfirmationInfo(NameAndAddressBatchTypeU writtenConfirmationInfo) {
    this.writtenConfirmationInfo = writtenConfirmationInfo;
    return this;
  }

  /**
   * Get writtenConfirmationInfo
   * @return writtenConfirmationInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAndAddressBatchTypeU getWrittenConfirmationInfo() {
    return writtenConfirmationInfo;
  }

  public void setWrittenConfirmationInfo(NameAndAddressBatchTypeU writtenConfirmationInfo) {
    this.writtenConfirmationInfo = writtenConfirmationInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelReservationInfo hotelReservationInfo = (HotelReservationInfo) o;
    return Objects.equals(this.arrivalFlightDetails, hotelReservationInfo.arrivalFlightDetails) &&
        Objects.equals(this.billableInfo, hotelReservationInfo.billableInfo) &&
        Objects.equals(this.bookingIndicator, hotelReservationInfo.bookingIndicator) &&
        Objects.equals(this.bookingSource, hotelReservationInfo.bookingSource) &&
        Objects.equals(this.cancelOrConfirmNbr, hotelReservationInfo.cancelOrConfirmNbr) &&
        Objects.equals(this.companyIdentification, hotelReservationInfo.companyIdentification) &&
        Objects.equals(this.customerInfo, hotelReservationInfo.customerInfo) &&
        Objects.equals(this.documentInformationDetails, hotelReservationInfo.documentInformationDetails) &&
        Objects.equals(this.frequentTravellerInfo, hotelReservationInfo.frequentTravellerInfo) &&
        Objects.equals(this.guaranteeOrDeposit, hotelReservationInfo.guaranteeOrDeposit) &&
        Objects.equals(this.hotelPropertyInfo, hotelReservationInfo.hotelPropertyInfo) &&
        Objects.equals(this.requestedDates, hotelReservationInfo.requestedDates) &&
        Objects.equals(this.roomRateDetails, hotelReservationInfo.roomRateDetails) &&
        Objects.equals(this.roomstayIndex, hotelReservationInfo.roomstayIndex) &&
        Objects.equals(this.savingAmountInfo, hotelReservationInfo.savingAmountInfo) &&
        Objects.equals(this.textOptions, hotelReservationInfo.textOptions) &&
        Objects.equals(this.writtenConfirmationContact, hotelReservationInfo.writtenConfirmationContact) &&
        Objects.equals(this.writtenConfirmationInfo, hotelReservationInfo.writtenConfirmationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalFlightDetails, billableInfo, bookingIndicator, bookingSource, cancelOrConfirmNbr, companyIdentification, customerInfo, documentInformationDetails, frequentTravellerInfo, guaranteeOrDeposit, hotelPropertyInfo, requestedDates, roomRateDetails, roomstayIndex, savingAmountInfo, textOptions, writtenConfirmationContact, writtenConfirmationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelReservationInfo {\n");
    
    sb.append("    arrivalFlightDetails: ").append(toIndentedString(arrivalFlightDetails)).append("\n");
    sb.append("    billableInfo: ").append(toIndentedString(billableInfo)).append("\n");
    sb.append("    bookingIndicator: ").append(toIndentedString(bookingIndicator)).append("\n");
    sb.append("    bookingSource: ").append(toIndentedString(bookingSource)).append("\n");
    sb.append("    cancelOrConfirmNbr: ").append(toIndentedString(cancelOrConfirmNbr)).append("\n");
    sb.append("    companyIdentification: ").append(toIndentedString(companyIdentification)).append("\n");
    sb.append("    customerInfo: ").append(toIndentedString(customerInfo)).append("\n");
    sb.append("    documentInformationDetails: ").append(toIndentedString(documentInformationDetails)).append("\n");
    sb.append("    frequentTravellerInfo: ").append(toIndentedString(frequentTravellerInfo)).append("\n");
    sb.append("    guaranteeOrDeposit: ").append(toIndentedString(guaranteeOrDeposit)).append("\n");
    sb.append("    hotelPropertyInfo: ").append(toIndentedString(hotelPropertyInfo)).append("\n");
    sb.append("    requestedDates: ").append(toIndentedString(requestedDates)).append("\n");
    sb.append("    roomRateDetails: ").append(toIndentedString(roomRateDetails)).append("\n");
    sb.append("    roomstayIndex: ").append(toIndentedString(roomstayIndex)).append("\n");
    sb.append("    savingAmountInfo: ").append(toIndentedString(savingAmountInfo)).append("\n");
    sb.append("    textOptions: ").append(toIndentedString(textOptions)).append("\n");
    sb.append("    writtenConfirmationContact: ").append(toIndentedString(writtenConfirmationContact)).append("\n");
    sb.append("    writtenConfirmationInfo: ").append(toIndentedString(writtenConfirmationInfo)).append("\n");
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

