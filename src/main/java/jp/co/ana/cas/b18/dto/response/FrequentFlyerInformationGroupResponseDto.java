package jp.co.ana.cas.b18.dto.response;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.dto.response.BookingClassInformationResponseDto;
import jp.co.ana.cas.b18.dto.response.DiscountInformationResponseDto;
import jp.co.ana.cas.b18.dto.response.FrequentTravellerInfoResponseDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FrequentFlyerInformationGroupResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T14:45:36.627323500+05:30[Asia/Calcutta]")
public class FrequentFlyerInformationGroupResponseDto   {
  @JsonProperty("frequentTravellerInfo")
  private FrequentTravellerInfoResponseDto frequentTravellerInfo;

  @JsonProperty("discountInformation")
  private DiscountInformationResponseDto discountInformation;

  @JsonProperty("bookingClassInformation")
  private BookingClassInformationResponseDto bookingClassInformation;

  public FrequentFlyerInformationGroupResponseDto frequentTravellerInfo(FrequentTravellerInfoResponseDto frequentTravellerInfo) {
    this.frequentTravellerInfo = frequentTravellerInfo;
    return this;
  }

  /**
   * Get frequentTravellerInfo
   * @return frequentTravellerInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravellerInfoResponseDto getFrequentTravellerInfo() {
    return frequentTravellerInfo;
  }

  public void setFrequentTravellerInfo(FrequentTravellerInfoResponseDto frequentTravellerInfo) {
    this.frequentTravellerInfo = frequentTravellerInfo;
  }

  public FrequentFlyerInformationGroupResponseDto discountInformation(DiscountInformationResponseDto discountInformation) {
    this.discountInformation = discountInformation;
    return this;
  }

  /**
   * Get discountInformation
   * @return discountInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public DiscountInformationResponseDto getDiscountInformation() {
    return discountInformation;
  }

  public void setDiscountInformation(DiscountInformationResponseDto discountInformation) {
    this.discountInformation = discountInformation;
  }

  public FrequentFlyerInformationGroupResponseDto bookingClassInformation(BookingClassInformationResponseDto bookingClassInformation) {
    this.bookingClassInformation = bookingClassInformation;
    return this;
  }

  /**
   * Get bookingClassInformation
   * @return bookingClassInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public BookingClassInformationResponseDto getBookingClassInformation() {
    return bookingClassInformation;
  }

  public void setBookingClassInformation(BookingClassInformationResponseDto bookingClassInformation) {
    this.bookingClassInformation = bookingClassInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequentFlyerInformationGroupResponseDto frequentFlyerInformationGroupResponseDto = (FrequentFlyerInformationGroupResponseDto) o;
    return Objects.equals(this.frequentTravellerInfo, frequentFlyerInformationGroupResponseDto.frequentTravellerInfo) &&
        Objects.equals(this.discountInformation, frequentFlyerInformationGroupResponseDto.discountInformation) &&
        Objects.equals(this.bookingClassInformation, frequentFlyerInformationGroupResponseDto.bookingClassInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequentTravellerInfo, discountInformation, bookingClassInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentFlyerInformationGroupResponseDto {\n");
    
    sb.append("    frequentTravellerInfo: ").append(toIndentedString(frequentTravellerInfo)).append("\n");
    sb.append("    discountInformation: ").append(toIndentedString(discountInformation)).append("\n");
    sb.append("    bookingClassInformation: ").append(toIndentedString(bookingClassInformation)).append("\n");
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

