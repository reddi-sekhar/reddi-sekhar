package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.DiscountInformationType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.FrequentTravellerIdentificationCodeType74327S;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ProductInformationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FrequentFlyerInformationGroupType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class FrequentFlyerInformationGroupType   {
  @JsonProperty("bookingClassInformation")
  private ProductInformationType bookingClassInformation;

  @JsonProperty("discountInformation")
  private DiscountInformationType discountInformation;

  @JsonProperty("frequentTravellerInfo")
  private FrequentTravellerIdentificationCodeType74327S frequentTravellerInfo;

  public FrequentFlyerInformationGroupType bookingClassInformation(ProductInformationType bookingClassInformation) {
    this.bookingClassInformation = bookingClassInformation;
    return this;
  }

  /**
   * Get bookingClassInformation
   * @return bookingClassInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductInformationType getBookingClassInformation() {
    return bookingClassInformation;
  }

  public void setBookingClassInformation(ProductInformationType bookingClassInformation) {
    this.bookingClassInformation = bookingClassInformation;
  }

  public FrequentFlyerInformationGroupType discountInformation(DiscountInformationType discountInformation) {
    this.discountInformation = discountInformation;
    return this;
  }

  /**
   * Get discountInformation
   * @return discountInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public DiscountInformationType getDiscountInformation() {
    return discountInformation;
  }

  public void setDiscountInformation(DiscountInformationType discountInformation) {
    this.discountInformation = discountInformation;
  }

  public FrequentFlyerInformationGroupType frequentTravellerInfo(FrequentTravellerIdentificationCodeType74327S frequentTravellerInfo) {
    this.frequentTravellerInfo = frequentTravellerInfo;
    return this;
  }

  /**
   * Get frequentTravellerInfo
   * @return frequentTravellerInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public FrequentTravellerIdentificationCodeType74327S getFrequentTravellerInfo() {
    return frequentTravellerInfo;
  }

  public void setFrequentTravellerInfo(FrequentTravellerIdentificationCodeType74327S frequentTravellerInfo) {
    this.frequentTravellerInfo = frequentTravellerInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrequentFlyerInformationGroupType frequentFlyerInformationGroupType = (FrequentFlyerInformationGroupType) o;
    return Objects.equals(this.bookingClassInformation, frequentFlyerInformationGroupType.bookingClassInformation) &&
        Objects.equals(this.discountInformation, frequentFlyerInformationGroupType.discountInformation) &&
        Objects.equals(this.frequentTravellerInfo, frequentFlyerInformationGroupType.frequentTravellerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingClassInformation, discountInformation, frequentTravellerInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentFlyerInformationGroupType {\n");
    
    sb.append("    bookingClassInformation: ").append(toIndentedString(bookingClassInformation)).append("\n");
    sb.append("    discountInformation: ").append(toIndentedString(discountInformation)).append("\n");
    sb.append("    frequentTravellerInfo: ").append(toIndentedString(frequentTravellerInfo)).append("\n");
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

