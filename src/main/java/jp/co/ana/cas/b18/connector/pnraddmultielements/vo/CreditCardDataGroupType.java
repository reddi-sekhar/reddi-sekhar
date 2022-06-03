package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.AddressType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CreditCardDataType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.ReferenceInformationTypeI79009S;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditCardDataGroupType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class CreditCardDataGroupType   {
  @JsonProperty("cardHolderAddress")
  private AddressType cardHolderAddress;

  @JsonProperty("creditCardDetails")
  private CreditCardDataType creditCardDetails;

  @JsonProperty("fortknoxIds")
  @Valid
  private List<ReferenceInformationTypeI79009S> fortknoxIds = null;

  public CreditCardDataGroupType cardHolderAddress(AddressType cardHolderAddress) {
    this.cardHolderAddress = cardHolderAddress;
    return this;
  }

  /**
   * Get cardHolderAddress
   * @return cardHolderAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public AddressType getCardHolderAddress() {
    return cardHolderAddress;
  }

  public void setCardHolderAddress(AddressType cardHolderAddress) {
    this.cardHolderAddress = cardHolderAddress;
  }

  public CreditCardDataGroupType creditCardDetails(CreditCardDataType creditCardDetails) {
    this.creditCardDetails = creditCardDetails;
    return this;
  }

  /**
   * Get creditCardDetails
   * @return creditCardDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public CreditCardDataType getCreditCardDetails() {
    return creditCardDetails;
  }

  public void setCreditCardDetails(CreditCardDataType creditCardDetails) {
    this.creditCardDetails = creditCardDetails;
  }

  public CreditCardDataGroupType fortknoxIds(List<ReferenceInformationTypeI79009S> fortknoxIds) {
    this.fortknoxIds = fortknoxIds;
    return this;
  }

  public CreditCardDataGroupType addFortknoxIdsItem(ReferenceInformationTypeI79009S fortknoxIdsItem) {
    if (this.fortknoxIds == null) {
      this.fortknoxIds = new ArrayList<>();
    }
    this.fortknoxIds.add(fortknoxIdsItem);
    return this;
  }

  /**
   * Get fortknoxIds
   * @return fortknoxIds
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ReferenceInformationTypeI79009S> getFortknoxIds() {
    return fortknoxIds;
  }

  public void setFortknoxIds(List<ReferenceInformationTypeI79009S> fortknoxIds) {
    this.fortknoxIds = fortknoxIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardDataGroupType creditCardDataGroupType = (CreditCardDataGroupType) o;
    return Objects.equals(this.cardHolderAddress, creditCardDataGroupType.cardHolderAddress) &&
        Objects.equals(this.creditCardDetails, creditCardDataGroupType.creditCardDetails) &&
        Objects.equals(this.fortknoxIds, creditCardDataGroupType.fortknoxIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardHolderAddress, creditCardDetails, fortknoxIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardDataGroupType {\n");
    
    sb.append("    cardHolderAddress: ").append(toIndentedString(cardHolderAddress)).append("\n");
    sb.append("    creditCardDetails: ").append(toIndentedString(creditCardDetails)).append("\n");
    sb.append("    fortknoxIds: ").append(toIndentedString(fortknoxIds)).append("\n");
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

