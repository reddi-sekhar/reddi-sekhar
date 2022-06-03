package jp.co.ana.cas.b18.connector.pnraddmultielements.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CommunicationContactType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.CreditCardSecurityType;
import jp.co.ana.cas.b18.connector.pnraddmultielements.vo.TdsBlobData;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ThreeDomainSecureGroupType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-26T18:58:40.935097200+05:30[Asia/Calcutta]")
public class ThreeDomainSecureGroupType   {
  @JsonProperty("acsURL")
  private CommunicationContactType acsURL;

  @JsonProperty("authenticationData")
  private CreditCardSecurityType authenticationData;

  @JsonProperty("tdsBlobData")
  @Valid
  private List<TdsBlobData> tdsBlobData = null;

  public ThreeDomainSecureGroupType acsURL(CommunicationContactType acsURL) {
    this.acsURL = acsURL;
    return this;
  }

  /**
   * Get acsURL
   * @return acsURL
  */
  @ApiModelProperty(value = "")

  @Valid

  public CommunicationContactType getAcsURL() {
    return acsURL;
  }

  public void setAcsURL(CommunicationContactType acsURL) {
    this.acsURL = acsURL;
  }

  public ThreeDomainSecureGroupType authenticationData(CreditCardSecurityType authenticationData) {
    this.authenticationData = authenticationData;
    return this;
  }

  /**
   * Get authenticationData
   * @return authenticationData
  */
  @ApiModelProperty(value = "")

  @Valid

  public CreditCardSecurityType getAuthenticationData() {
    return authenticationData;
  }

  public void setAuthenticationData(CreditCardSecurityType authenticationData) {
    this.authenticationData = authenticationData;
  }

  public ThreeDomainSecureGroupType tdsBlobData(List<TdsBlobData> tdsBlobData) {
    this.tdsBlobData = tdsBlobData;
    return this;
  }

  public ThreeDomainSecureGroupType addTdsBlobDataItem(TdsBlobData tdsBlobDataItem) {
    if (this.tdsBlobData == null) {
      this.tdsBlobData = new ArrayList<>();
    }
    this.tdsBlobData.add(tdsBlobDataItem);
    return this;
  }

  /**
   * Get tdsBlobData
   * @return tdsBlobData
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TdsBlobData> getTdsBlobData() {
    return tdsBlobData;
  }

  public void setTdsBlobData(List<TdsBlobData> tdsBlobData) {
    this.tdsBlobData = tdsBlobData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDomainSecureGroupType threeDomainSecureGroupType = (ThreeDomainSecureGroupType) o;
    return Objects.equals(this.acsURL, threeDomainSecureGroupType.acsURL) &&
        Objects.equals(this.authenticationData, threeDomainSecureGroupType.authenticationData) &&
        Objects.equals(this.tdsBlobData, threeDomainSecureGroupType.tdsBlobData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acsURL, authenticationData, tdsBlobData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDomainSecureGroupType {\n");
    
    sb.append("    acsURL: ").append(toIndentedString(acsURL)).append("\n");
    sb.append("    authenticationData: ").append(toIndentedString(authenticationData)).append("\n");
    sb.append("    tdsBlobData: ").append(toIndentedString(tdsBlobData)).append("\n");
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

