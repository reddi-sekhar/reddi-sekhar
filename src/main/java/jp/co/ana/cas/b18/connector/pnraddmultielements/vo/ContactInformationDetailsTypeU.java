package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactInformationDetailsTypeU
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ContactInformationDetailsTypeU   {
  @JsonProperty("comAddress")
  private String comAddress;

  @JsonProperty("comChannelQualifier")
  private String comChannelQualifier;

  @JsonProperty("partyQualifier")
  private String partyQualifier;

  public ContactInformationDetailsTypeU comAddress(String comAddress) {
    this.comAddress = comAddress;
    return this;
  }

  /**
   * Get comAddress
   * @return comAddress
  */
  @ApiModelProperty(value = "")


  public String getComAddress() {
    return comAddress;
  }

  public void setComAddress(String comAddress) {
    this.comAddress = comAddress;
  }

  public ContactInformationDetailsTypeU comChannelQualifier(String comChannelQualifier) {
    this.comChannelQualifier = comChannelQualifier;
    return this;
  }

  /**
   * Get comChannelQualifier
   * @return comChannelQualifier
  */
  @ApiModelProperty(value = "")


  public String getComChannelQualifier() {
    return comChannelQualifier;
  }

  public void setComChannelQualifier(String comChannelQualifier) {
    this.comChannelQualifier = comChannelQualifier;
  }

  public ContactInformationDetailsTypeU partyQualifier(String partyQualifier) {
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
    ContactInformationDetailsTypeU contactInformationDetailsTypeU = (ContactInformationDetailsTypeU) o;
    return Objects.equals(this.comAddress, contactInformationDetailsTypeU.comAddress) &&
        Objects.equals(this.comChannelQualifier, contactInformationDetailsTypeU.comChannelQualifier) &&
        Objects.equals(this.partyQualifier, contactInformationDetailsTypeU.partyQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAddress, comChannelQualifier, partyQualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactInformationDetailsTypeU {\n");
    
    sb.append("    comAddress: ").append(toIndentedString(comAddress)).append("\n");
    sb.append("    comChannelQualifier: ").append(toIndentedString(comChannelQualifier)).append("\n");
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

