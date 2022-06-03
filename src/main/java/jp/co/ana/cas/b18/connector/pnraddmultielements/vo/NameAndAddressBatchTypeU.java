package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.NameAndAddressDetailsTypeU;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.PartyNameBatchTypeU;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NameAndAddressBatchTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class NameAndAddressBatchTypeU   {
  @JsonProperty("addressDetails")
  private NameAndAddressDetailsTypeU addressDetails;

  @JsonProperty("partyNameDetails")
  private PartyNameBatchTypeU partyNameDetails;

  @JsonProperty("partyQualifier")
  private String partyQualifier;

  public NameAndAddressBatchTypeU addressDetails(NameAndAddressDetailsTypeU addressDetails) {
    this.addressDetails = addressDetails;
    return this;
  }

  /**
   * Get addressDetails
   * @return addressDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAndAddressDetailsTypeU getAddressDetails() {
    return addressDetails;
  }

  public void setAddressDetails(NameAndAddressDetailsTypeU addressDetails) {
    this.addressDetails = addressDetails;
  }

  public NameAndAddressBatchTypeU partyNameDetails(PartyNameBatchTypeU partyNameDetails) {
    this.partyNameDetails = partyNameDetails;
    return this;
  }

  /**
   * Get partyNameDetails
   * @return partyNameDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public PartyNameBatchTypeU getPartyNameDetails() {
    return partyNameDetails;
  }

  public void setPartyNameDetails(PartyNameBatchTypeU partyNameDetails) {
    this.partyNameDetails = partyNameDetails;
  }

  public NameAndAddressBatchTypeU partyQualifier(String partyQualifier) {
    this.partyQualifier = partyQualifier;
    return this;
  }

  /**
   * Get partyQualifier
   * @return partyQualifier
  */
  @ApiModelProperty(value = "")


  public String getPartyQualifier() {
    return partyQualifier;
  }

  public void setPartyQualifier(String partyQualifier) {
    this.partyQualifier = partyQualifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameAndAddressBatchTypeU nameAndAddressBatchTypeU = (NameAndAddressBatchTypeU) o;
    return Objects.equals(this.addressDetails, nameAndAddressBatchTypeU.addressDetails) &&
        Objects.equals(this.partyNameDetails, nameAndAddressBatchTypeU.partyNameDetails) &&
        Objects.equals(this.partyQualifier, nameAndAddressBatchTypeU.partyQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressDetails, partyNameDetails, partyQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameAndAddressBatchTypeU {\n");
    
    sb.append("    addressDetails: ").append(toIndentedString(addressDetails)).append("\n");
    sb.append("    partyNameDetails: ").append(toIndentedString(partyNameDetails)).append("\n");
    sb.append("    partyQualifier: ").append(toIndentedString(partyQualifier)).append("\n");
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

